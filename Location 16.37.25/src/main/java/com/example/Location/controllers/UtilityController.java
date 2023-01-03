package com.example.Location.controllers;

import com.example.Location.models.Location;
import com.example.Location.models.ResponseObject;
import com.example.Location.models.Utility;
import com.example.Location.repositories.UtilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/utility")
@CrossOrigin
public class UtilityController {

    @Autowired
    private UtilityRepository utilityRepository;

    @CrossOrigin("http://localhost:3001")
    @GetMapping("id")
    public ResponseEntity<Utility> getUtilityId(@PathVariable Long id) {

        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                utilityRepository.findById(id).get()
        );
    }

    @CrossOrigin("http://localhost:3001")
    @GetMapping("")
    public ResponseEntity<List<Utility>> getUtility() {
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin", "*").body(
                utilityRepository.findAll()
        );
    }

    @PostMapping("/insert")
    ResponseEntity<ResponseObject> insertUtility (@RequestBody Utility newUtility){
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                new ResponseObject("Ok", "Insert Location successfully", utilityRepository.save(newUtility))
        );
    }
    @DeleteMapping("delete/{id}")
    ResponseEntity<ResponseObject> deleteUtility(@PathVariable Long id) {
        boolean exists = utilityRepository.existsById(id);
        if(exists) {
            utilityRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(
                    new ResponseObject("ok", "Delete Utility successfully", "")
            );
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).header("Access-Control-Allow-Origin","*").body(
                new ResponseObject("failed", "Cannot find Utility to delete", "")
        );
    }
}
