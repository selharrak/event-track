package ma.sven.technologie.controller;

import java.util.ArrayList;
import java.util.List;

import ma.sven.technologie.model.Event;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventsReportController {

	@RequestMapping("/events")
	public List<Event> getEvents() {
		
		List<Event> events = new ArrayList<Event>();
		
		Event eventOne = new Event();
		eventOne.setName("Java User Group");
		events.add(eventOne);

		Event eventTwo = new Event();
		eventTwo.setName("Angular User Group");
		events.add(eventTwo);

		return events;

	}
}
