package com.lakexy.play.modis.service;

import org.springframework.integration.annotation.Gateway;

import com.lakexy.play.modis.domain.PssMessage;

/**
 * Gateway interface. Provides facade to clients of the process pipeline Will
 * place all Orders into the 'orders' channel
 *
 */
public interface PssClient {

	@Gateway(requestChannel = "pssChannel")
	void placePssMessage(PssMessage pssMsg);

}
