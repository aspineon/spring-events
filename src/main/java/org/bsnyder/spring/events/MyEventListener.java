package org.bsnyder.spring.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;

public class MyEventListener implements ApplicationListener<MyEvent> {
	
	private final Logger log = LoggerFactory.getLogger(MyEventListener.class);

	public void onApplicationEvent(MyEvent event) {
		log.info("Received MyEvent: {}", event);
	}

}
