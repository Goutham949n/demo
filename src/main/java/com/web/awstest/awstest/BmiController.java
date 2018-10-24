package com.web.awstest.awstest;

import org.springframework.util.NumberUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"},maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping(path = "/bmi")
public class BmiController {
	
	@RequestMapping(value = "/calculate", method = RequestMethod.POST)
	@ResponseBody
	public User calculateBmi(@RequestBody User user)
	{
		String height = user.getHeight();
		String weight = user.getWeight();
		
		double heightVal  = Double.parseDouble(height);
		double weightVal  = Double.parseDouble(weight);
		
		double userBmi  = weightVal/(heightVal * heightVal);
		
		user.setUserBmi(userBmi);
		
		
		return user;
	}
}
