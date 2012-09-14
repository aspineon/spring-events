package org.bsnyder.spring.events;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
	
	private static final long serialVersionUID = 3993723639667800942L;

	public MyEvent(Object source) {
		super(source);
	}

}
