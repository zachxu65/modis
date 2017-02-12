package com.lakexy.play.modis.service;

import org.apache.log4j.Logger;

import com.lakexy.play.modis.domain.PssMessage;

/**
 * Class invoked by ServiceActivator Performs the price reductions for all item
 * types.
 * 
 * @author BruceWayne
 *
 */
public class PssMsgProcessor {

	private static final Logger log = Logger.getLogger(PssMsgProcessor.class);

	/**
	 * Performs discount on books
	 * 
	 * @param bookPssMessage
	 *            PssMessage comprising of a book item
	 * @return PssMessage with discount price newly calculated
	 */
	public PssMessage processValidMessage(PssMessage bookPssMessage) {
		log.debug("processValidMessage()");

		return bookPssMessage;
	}

	/**
	 * Performs discount on music
	 * 
	 * @param musicPssMessage
	 *            PssMessage comprising of a music item
	 * @return PssMessage with discount price newly calculated
	 */
	public PssMessage processInvalidMessage(PssMessage musicPssMessage) {
		log.debug("processInvalidMessage()");
		return musicPssMessage;
	}

}
