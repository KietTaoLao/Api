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
@RequestMapping("/locations")
@CrossOrigin
public class LocationController {

   // @Autowired
   // private Environment env;

    @Autowired
    private LocationRepository locationRepositiry;

    //this request is :http://localhost:8081/locations/

    @CrossOrigin("http://localhost:3001")
    @GetMapping("")
    public ResponseEntity<List<Location>> getLocations() {
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin", "*").body(
                 locationRepositiry.findAll()
        );
    }

    @PostMapping("/insert")
    ResponseEntity<ResponseObject> insertLocation (@RequestBody Location newLocation){
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                new ResponseObject("Ok", "Insert Location successfully", locationRepositiry.save(newLocation))
        );
    }
    @DeleteMapping("delete/{id}")
    ResponseEntity<ResponseObject> deleteProduct(@PathVariable Long id) {
        boolean exists = locationRepositiry.existsById(id);
        if(exists) {
            locationRepositiry.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject("ok", "Delete product successfully", "")
            );
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ResponseObject("failed", "Cannot find product to delete", "")
        );
    }




}
