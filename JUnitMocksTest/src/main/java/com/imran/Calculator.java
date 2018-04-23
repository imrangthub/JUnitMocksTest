package com.imran;

public class Calculator {
	
	ICalculatorService service;
	
	public Calculator(ICalculatorService service){
		this.service = service;
	}
	
	public int calStart(int i, int j){
		
		return service.add(i, j)*i;
		
	}

}
