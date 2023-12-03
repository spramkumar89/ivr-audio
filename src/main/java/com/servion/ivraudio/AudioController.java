package com.servion.ivraudio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AudioController {

	@GetMapping("/ivr/audio")
	public ModelAndView loadAudio(@RequestParam String name) {
		System.out.println("Loading audio file name : " + name);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName(name);
		return modelAndView;
	}
}
	