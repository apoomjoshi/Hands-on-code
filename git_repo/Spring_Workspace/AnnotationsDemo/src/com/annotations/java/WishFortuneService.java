package com.annotations.java;

import org.springframework.stereotype.Component;

@Component
public class WishFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "ALL THE BEST";
	}

}
