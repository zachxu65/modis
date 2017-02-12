package com.lakexy.play.modis.service;

import org.apache.log4j.Logger;

import com.lakexy.play.modis.domain.PssMessage;

public class ProcessingCompleter {

	private static final Logger log = Logger
			.getLogger(ProcessingCompleter.class);

	public PssMessage prepareDelivery(PssMessage items) {

		return new PssMessage(1, "sdf");
	}
}
