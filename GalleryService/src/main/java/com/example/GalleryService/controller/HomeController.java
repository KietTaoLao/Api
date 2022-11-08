package com.example.GalleryService.controller;

import java.util.List;


import com.example.GalleryService.entity.ErrorDetails;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GalleryService.entity.Gallery;
import com.example.GalleryService.repository.GalleryClient;

@RestController
@RequestMapping("/client")
public class HomeController {
	
	@Autowired
	private GalleryClient galleryClient ;

	@Autowired
	private Environment env;

	public static final String GalleryService = "galleryService";

	@GetMapping(value ="/images", produces = MediaType.APPLICATION_JSON_VALUE)
	@CircuitBreaker(name = GalleryService, fallbackMethod = "serviceGalleryFallback")
	public ResponseEntity<List<Gallery>> getAllImages() {
		List<Gallery> GallerytList = galleryClient.getImages();
		
		return new ResponseEntity<List<Gallery>>(GallerytList,HttpStatus.OK) ;
		
	}
	
	@GetMapping
	@RequestMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
	//@HystrixCommand(fallbackMethod = "defaultCallHello")
	@CircuitBreaker(name = GalleryService, fallbackMethod = "serviceGalleryFallback")
	public ResponseEntity<?> testGallery() {
		String demoTest = galleryClient.Test();
		return new ResponseEntity(demoTest,HttpStatus.OK);
	}

	public ResponseEntity<ErrorDetails> serviceGalleryFallback(Exception e) {
		ErrorDetails errorDetails = new ErrorDetails(HttpStatus.NOT_FOUND.value(), "Service images closed , please run service!");
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}



	
	
	
	@GetMapping

	@RequestMapping("/{id}")
	public Gallery getGallery(@PathVariable final int id) {
		// create gallery object
	Gallery gallery = new Gallery(id);
	//	gallery.setId(id);

		// get list of available images


		return gallery;

	}

	// -------- Admin Area --------
	// This method should only be accessed by users with role of 'admin' // We'll
	// add the logic of role based auth later @RequestMapping("/admin")
	@GetMapping("/")
	public String homeAdmin() {
		return "This is the admin area of Gallery service running at port: " + env.getProperty("local.server.port");
	}
}
