package com.example.GalleryService.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.GalleryService.entity.Gallery;

@FeignClient(name = "image-service")
public interface GalleryClient{
	
	@GetMapping("/user/images")
	public List<Gallery> getImages();

	@GetMapping("/user/test")
	public String Test();
}
