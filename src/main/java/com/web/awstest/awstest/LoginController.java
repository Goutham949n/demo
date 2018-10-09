package com.web.awstest.awstest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/login")
public class LoginController {
	

	@RequestMapping(value = "/validateUser", method = RequestMethod.POST)
	@ResponseBody
	public User doLogin(@RequestBody User user)
	{
		return user;
	}
}
