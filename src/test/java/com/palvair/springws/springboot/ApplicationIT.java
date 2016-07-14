package com.palvair.springws.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest
@Log4j
public class ApplicationIT {

	@Autowired
	private SoapWsClient soapWsClient;
	
	@Test
	public void callSopaWs() {
		HelloWorldResponse helloWorldResponse = soapWsClient.getHelloWorld("widdy");
		log.info("name = "+helloWorldResponse.getName());
	}
}
