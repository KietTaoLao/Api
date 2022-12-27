package com.example.Location.controllers;

import com.example.Location.models.Detail;
import com.example.Location.models.Images;
import com.example.Location.models.ResponseObject;
import com.example.Location.models.models_view.DetailView;
import com.example.Location.repositories.DetailRepository;
import com.example.Location.repositories.ImagesRepository;
import com.example.Location.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Detail")
public class DetailController {
   @Autowired
   private  DetailRepository detailRepository;

   @Autowired
   private  ImagesRepository imagesRepository;


    @Autowired
    private DetailService detailService;



    public DetailController(DetailRepository detailRepository, ImagesRepository imagesRepository) {
        this.detailRepository = detailRepository;
        this.imagesRepository = imagesRepository;
    }


    @GetMapping("/ListImage/{id}")
    public ResponseEntity<DetailView> getDetail(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                detailService.getDetailView(id)
        );

    }

    @PostMapping("/insertImage")
    ResponseEntity<ResponseObject> insertImages (@RequestBody Images newImages){
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                new ResponseObject("Ok", "Insert Images successfully", imagesRepository.save(newImages))
        );
    }

    @DeleteMapping("deleteImage/{id}")
    ResponseEntity<ResponseObject> deleteImages(@PathVariable int id) {
        boolean exists = imagesRepository.existsById(id);
        if(exists) {
            imagesRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject("ok", "Delete product successfully", "")
            );
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ResponseObject("failed", "Cannot find product to delete", "")
        );
    }

    //this request is :http://localhost:8081/locations/

    @CrossOrigin("http://localhost:3001")
    @GetMapping("")
    public ResponseEntity<List<Detail>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                 detailRepository.findAll()
        );

    }

    @PostMapping("/insert")
    ResponseEntity<ResponseObject> insertDetail (@RequestBody Detail newDetail){
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                new ResponseObject("Ok", "Insert Detail successfully", detailRepository.save(newDetail))
        );
    }
    @DeleteMapping("delete/{id}")
    ResponseEntity<ResponseObject> deleteProduct(@PathVariable Long id) {
        boolean exists = detailRepository.existsById(id);
        if(exists) {
            detailRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject("ok", "Delete product successfully", "")
            );
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ResponseObject("failed", "Cannot find product to delete", "")
        );
    }

}
