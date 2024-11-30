package com.thinkconstructive.rest.emo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructive.rest.emo.model.CloudVendor;
import com.thinkconstructive.rest.emo.service.CloudVendorService;


@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	CloudVendorService coludvendorservice;

	public CloudVendorController(CloudVendorService coludvendorservice) {
		super();
		this.coludvendorservice = coludvendorservice;
	}
    //read specific cloud vendor in db
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
		return coludvendorservice.getCloudVendor(vendorId);
	}
	
	//read all cloud vendor in db
	
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails(String vendorId) {
		return coludvendorservice.getAllCloudvendors();
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		coludvendorservice.createCloudVendor(cloudVendor);
		return "cloud vendor create successfully";
		}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloundvendor) {
		coludvendorservice.updateCloudVendor(cloundvendor);
		return "cloud vendor update successfully";
	}
	
	 @DeleteMapping("{vendorId}")
	 public String deleteClouVendorDetails(@PathVariable("vendorId") String vendorId) {
		 coludvendorservice.deleteCloudVendor(vendorId);
		 return "cloud vendor delete successfully";
	 
	 }
}


