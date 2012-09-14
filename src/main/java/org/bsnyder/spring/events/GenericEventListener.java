package org.bsnyder.spring.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class GenericEventListener implements ApplicationListener<ApplicationEvent> {
	
	private final Logger log = LoggerFactory.getLogger(GenericEventListener.class);

	public void onApplicationEvent(ApplicationEvent event) {
		log.info("Received event: {}", event);
	}

}
