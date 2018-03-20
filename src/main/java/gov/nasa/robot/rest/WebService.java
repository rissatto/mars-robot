package gov.nasa.robot.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gov.nasa.robot.controller.InputController;
import gov.nasa.robot.exception.RobotException;

@RestController
@RequestMapping("/mars")
public class WebService {
	
	@RequestMapping(value="/{steps}", method= RequestMethod.POST)
	public ResponseEntity<String> doIt(@PathVariable("steps") String steps) {
		InputController input = new InputController();
		try {
			return ResponseEntity.ok(input.process(steps));
		} catch (RobotException e) {
			return ResponseEntity.badRequest().build();
		}
    }

}
