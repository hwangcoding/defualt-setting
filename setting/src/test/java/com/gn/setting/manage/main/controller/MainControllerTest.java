package com.gn.setting.manage.main.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.gn.setting.configuration.session.UserSessionManager;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.gn.setting.configuration.DispatcherServlet.class})
@WebAppConfiguration
public class MainControllerTest {

	private static final Logger logger = LoggerFactory.getLogger(MainControllerTest.class);
	
	@Autowired
	UserSessionManager userSessionManager;
	
	@Test
	public void test() {
		logger.info("test" + userSessionManager.hashCode());
		
	}

}
