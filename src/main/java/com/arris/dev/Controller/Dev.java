


package com.arris.dev.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dev {
	
	
	
	@GetMapping("/getData")
	public String get() {
		return "hello";
	}
	

}
