package cld71.spring_boot_secruity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cld71
 */
@RestController
public class HomeController{

	@GetMapping("/")
	public String home(){
		return "<h1>welcome</h1>";
	}

	@GetMapping("/user")
	public String user(){
		return "<h1>welcome User</h1>";
	}

	@GetMapping("/admin")
	public String admin(){
		return "<h1>welcome Admin</h1>";
	}

}
