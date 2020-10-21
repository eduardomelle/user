package br.com.user.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@GetMapping("/api/user/name")
	public String getName() {
		return "Eduardo O. Melle";
	}

}
