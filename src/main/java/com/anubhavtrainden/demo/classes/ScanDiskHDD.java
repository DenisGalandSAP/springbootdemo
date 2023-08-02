package com.anubhavtrainden.demo.classes;

import org.springframework.stereotype.Component;

@Component
public class ScanDiskHDD implements IHardDisk {

	@Override
	public String read() {
		// TODO Auto-generated method stub
		return "ScanDisk is reading data at 10k rpm";
	}

	@Override
	public String write() {
		// TODO Auto-generated method stub
		return "ScanDisk is writing data at 10k rpm";
	}

}
