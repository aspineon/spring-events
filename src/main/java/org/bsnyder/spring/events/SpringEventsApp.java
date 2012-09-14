package org.bsnyder.spring.events;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringEventsApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-events.xml");
		context.start();
		for (int i = 0; i < 10; ++i) {
			context.publishEvent(new MyEvent("My test event " + i));
		}
		context.stop();
	}
}
