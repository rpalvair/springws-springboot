package com.palvair.springws.springboot;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import lombok.extern.log4j.Log4j;

@Log4j
public class SoapWsClient extends WebServiceGatewaySupport {

	public HelloWorldResponse getHelloWorld(String name) {

		HelloWorldRequest request = new HelloWorldRequest();
		request.setName(name);

		log.info("Requesting forecast for " + name);

		/*
		 * HelloWorldResponse response = (HelloWorldResponse)
		 * getWebServiceTemplate().marshalSendAndReceive(
		 * "http://localhost:9000/ws/HelloWorld", request, new
		 * SoapActionCallback("http://localhost:9000/ws/HelloWorld"));
		 */

		HelloWorldResponse response = (HelloWorldResponse) getWebServiceTemplate().marshalSendAndReceive(request);

		return response;
	}
}
