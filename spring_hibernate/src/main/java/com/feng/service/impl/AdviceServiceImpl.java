package com.feng.service.impl;

import org.springframework.stereotype.Service;

import com.feng.service.AdviceService;

@Service("adviceService")
public class AdviceServiceImpl implements AdviceService {

	@Override
	public void hello() {
		System.out.println("----------------------------hello");

	}

}
