package com.palvair.springws.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WsClientConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.palvair.springws.springboot");
		return marshaller;
	}

	@Bean
	public SoapWsClient weatherClient(Jaxb2Marshaller marshaller) {
		SoapWsClient client = new SoapWsClient();
		client.setDefaultUri("http://localhost:9000/ws");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
