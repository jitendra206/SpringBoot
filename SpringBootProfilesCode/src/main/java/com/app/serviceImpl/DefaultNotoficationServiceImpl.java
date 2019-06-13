package com.app.serviceImpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.NotificationService;

@Component
@Profile("default")
public class DefaultNotoficationServiceImpl implements NotificationService {

	@Override
	public void getMessage() {
		System.out.println("from  Default notification");

	}

}
