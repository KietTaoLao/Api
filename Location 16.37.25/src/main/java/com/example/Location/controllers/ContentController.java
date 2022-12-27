package com.example.Location.controllers;

import com.example.Location.models.Content;
import com.example.Location.models.Location;
import com.example.Location.models.ResponseObject;
import com.example.Location.repositories.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/content")
public class ContentController {
    @Autowired
    private ContentRepository contentRepository;

    @CrossOrigin("http://localhost:3001")
    @GetMapping("")
    public ResponseEntity<List<Content>> getContent() {
        
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                contentRepository.findAll()
        );


    }

    @PostMapping("/insert")
    ResponseEntity<ResponseObject> insertContent (@RequestBody Content newC){
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                new ResponseObject("Ok", "Insert Content successfully", contentRepository.save(newC))
        );
    }
    @DeleteMapping("delete/{id}")
    ResponseEntity<ResponseObject> deleteProduct(@PathVariable Long id) {
        boolean exists = contentRepository.existsById(id);
        if(exists) {
            contentRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject("ok", "Delete product successfully", "")
            );
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ResponseObject("failed", "Cannot find product to delete", "")
        );
    }
}
