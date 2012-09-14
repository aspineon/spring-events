package org.bsnyder.spring.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class MyEventPublisher implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher publisher; 

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}
	
	public void send(String eventMessage) {
		this.publisher.publishEvent(new MyEvent(eventMessage));
	}

}
