package com.lakexy.play.modis;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lakexy.play.modis.domain.PssMessage;
import com.lakexy.play.modis.service.PssClient;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger log = Logger.getLogger(App.class);

	public static PssMessage createMessage() {
		log.debug("createMessage()");
		return new PssMessage(3, "test message");
	}

	public static void main(String[] args) {
		log.debug("main() starts ...");
		// Get hold of spring context
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/pss.xml", App.class);

		// Inject in Shop instance (Gateway)
		PssClient client = (PssClient) context.getBean("pssClient");

		log.debug("client=" + client);
		final PssMessage pssMsg = createMessage();

		log.debug("client place message=" + pssMsg);
		client.placePssMessage(pssMsg);

		context.close();
	}
}
