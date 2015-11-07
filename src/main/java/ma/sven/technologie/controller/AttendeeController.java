package ma.sven.technologie.controller;

import javax.validation.Valid;

import ma.sven.technologie.model.Attendee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AttendeeController {

	@RequestMapping(value = "/attendee", method = RequestMethod.GET)
	public String displayAtttendeePage(Model model) {
		Attendee attendee = new Attendee();

		model.addAttribute("attendee", attendee);

		return "attendee";
	}

	@RequestMapping(value = "/attendee", method = RequestMethod.POST)
	public String processAtttendee(@Valid Attendee attendee,
			BindingResult result, Model model) {
		System.out.println(attendee);

		if (result.hasErrors()) {
			return "attendee";
		}

		return "redirect:index.html";
	}

}
