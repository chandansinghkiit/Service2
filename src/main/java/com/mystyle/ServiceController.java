package com.mystyle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@GetMapping("service2")
	public String getMessage()
	{
		return "service 2";
	}
}
