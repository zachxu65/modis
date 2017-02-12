package com.lakexy.play.modis.service;

import org.apache.log4j.Logger;

import com.lakexy.play.modis.domain.PssMessage;

public class PssValidationRouter {
	private static final Logger log = Logger
			.getLogger(PssValidationRouter.class);

	public String routePssMessage(PssMessage pssMessage) {

		log.debug("routePssMessage() ");
		boolean validFlag = validatePssMessage(pssMessage);

		String channel = "";
		if (validFlag) {
			channel = "validPssMsgChannel";
		} else {
			channel = "invalidPssMsgChannel";
		}
		log.debug("PssMessage " + pssMessage + " is routed to channel "
				+ channel);

		return channel;
	}

	private Boolean validatePssMessage(PssMessage pssMessage) {
		return true;
	}
}
