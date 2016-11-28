package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("ramdomFortuneService")
	private FortuneService fortuneService;
	
	
	/* 
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}*/
	
	
	//defaul constructor 
		public TennisCoach() {
			System.out.println(">> Inside Default Constructor");
		}
		
		/*
		//define a setter method 
		@Autowired
		public void setFortuneService(FortuneService theFortuneService) {
			System.out.println(">> Tennis Coach inside setFortuneService");
			this.fortuneService = theFortuneService;
		}
		*/



	@Override
	public String getDailyWorkOut() {
		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
