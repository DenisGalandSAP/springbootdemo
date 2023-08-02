package com.anubhavtrainden.demo.classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SamsungHDD implements IHardDisk {

	@Override
	public String read() {
		// TODO Auto-generated method stub
		return "Samsung is reading data at 10k rpm";
	}

	@Override
	public String write() {
		// TODO Auto-generated method stub
		return "Samsung is writing data at 10k rpm";
	}

}
