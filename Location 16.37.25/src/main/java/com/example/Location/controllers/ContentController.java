package com.example.Location.controllers;

import com.example.Location.models.Content;
import com.example.Location.models.Location;
import com.example.Location.models.ResponseObject;
import com.example.Location.repositories.ContentRepository;
import com.example.Location.repositories.LocationRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/content")
public class ContentController {
    @Autowired
    private ContentRepository contentRepository;

    @Autowired
    private LocationRepository locationRepositiry;

//    @Autowired
//    private Content content;

    @CrossOrigin("http://localhost:3001")
    @GetMapping("")
    public ResponseEntity<List<Content>> getContent() {
        
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                contentRepository.findAll()
        );
    }


    @GetMapping("/{id}")
    public ResponseEntity<Content> getContentId(@PathVariable Long id) {

        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                contentRepository.findById(id).get()
        );
    }

    @GetMapping("/getlocations/{id}")
    public ResponseEntity<Content> getContentLocationsId(@PathVariable Long id) {

        //System.out.println("aaa" + contentRepository.findByLoctionId(id));
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                contentRepository.findByLocationId(id)
        );
    }

    @PostMapping("/insert")
    ResponseEntity<ResponseObject> insertContent (@RequestBody Content newC){
       // content.setId(locationRepositiry.findByLoctionId());
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                new ResponseObject("Ok", "Insert Content successfully", contentRepository.save(newC))
        );
    }
    @DeleteMapping("delete/{id}")
    ResponseEntity<ResponseObject> deleteProduct(@PathVariable Long id) {
        boolean exists = contentRepository.existsById(id);
        if(exists) {
            contentRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                    new ResponseObject("ok", "Delete product successfully", "")
            );
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).header("Access-Control-Allow-Origin","*").body(
                new ResponseObject("failed", "Cannot find product to delete", "")
        );
    }
}
