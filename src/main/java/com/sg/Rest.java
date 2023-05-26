package com.sg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
	
	@GetMapping("/test")
	public String test()
	{
		
		return ("Testing the CI & CD using Jenkins");
	}

}
