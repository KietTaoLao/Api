package com.example.Location.controllers;

import com.example.Location.models.Location;

import com.example.Location.models.ResponseObject;
import com.example.Location.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class LocationController {

   // @Autowired
   // private Environment env;

    @Autowired
    private LocationRepository repositiry;

    //this request is :http://localhost:8081/locations/


    @GetMapping("")
    public List<Location> getLocations() {
        return repositiry.findAll();
    }

    @PostMapping("/insert")
    ResponseEntity<ResponseObject> insertLocation (@RequestBody Location newLocation){
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("Ok", "Insert Location successfully", repositiry.save(newLocation))
        );
    }
    @DeleteMapping("delete/{id}")
    ResponseEntity<ResponseObject> deleteProduct(@PathVariable Long id) {
        boolean exists = repositiry.existsById(id);
        if(exists) {
            repositiry.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject("ok", "Delete product successfully", "")
            );
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ResponseObject("failed", "Cannot find product to delete", "")
        );
    }




}
