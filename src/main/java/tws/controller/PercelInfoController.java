package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.PercelInfo;
import tws.service.PercelInfoService;

@CrossOrigin
@RestController
@RequestMapping("/percel")
public class PercelInfoController {
	
	@Autowired
	private PercelInfoService percelInfoService;
	
	@PostMapping
	public void addPercelInfo(@RequestBody PercelInfo percelInfo) {
		percelInfoService.addPercel(percelInfo);
	}

}
