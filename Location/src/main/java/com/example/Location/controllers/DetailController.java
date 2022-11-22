package com.example.Location.controllers;

import com.example.Location.models.Detail;
import com.example.Location.models.Location;
import com.example.Location.models.ResponseObject;
import com.example.Location.repositories.DetailRepository;
import com.example.Location.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Detail")
public class DetailController {

    @Autowired
    private DetailRepository detailRepository;

    //this request is :http://localhost:8081/locations/


    @GetMapping("")
    public List<Detail> getLocations() {
        return detailRepository.findAll();
    }

    @PostMapping("/insert")
    ResponseEntity<ResponseObject> insertLocation (@RequestBody Detail newDetail){
        return ResponseEntity.status(HttpStatus.OK).body(
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
