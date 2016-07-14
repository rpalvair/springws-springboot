package com.palvair.springws.springboot;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class SoapWs {

	private static final String namespaceUri = "http://springboot.springws.palvair.com";
	
	
	@PayloadRoot(namespace = namespaceUri, localPart = "HelloWorldRequest")
	@ResponsePayload
	public HelloWorldResponse getCountry(@RequestPayload HelloWorldRequest request) {
		HelloWorldResponse response = new HelloWorldResponse();
		response.setName(request.getName());
		return response;
	}
}
