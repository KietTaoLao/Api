package com.example.ImageService.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ImageService.entity.Image;

@RestController  
@RequestMapping("/user")
public class HomeController {
	 @Autowired  
	  private Environment env;  

	   @GetMapping("/home")  
	   public String home() {
		return null;  
	      // This is useful for debugging  
	 // When having multiple instance of image service running at different ports. // We load balance among them, and display which instance received the request.  return "Hello from Image Service running at port: " + env.getProperty("local.server.port");  
	   }  

	   @GetMapping("/images")  
	   public List<Image> getImages() {
		   List<Image> images = Arrays.asList(
				    new Image(1, "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
				    new Image(2, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
		 			new Image(3, "The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112")
		   );
		   return images;
	   }
	   @GetMapping("/test")
		public String Test(){
		   return "Hello word";
	   }
}
