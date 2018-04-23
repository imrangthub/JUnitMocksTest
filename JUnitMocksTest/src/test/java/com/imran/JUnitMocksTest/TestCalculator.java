package com.imran.JUnitMocksTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.imran.Calculator;
import com.imran.ICalculatorService;

public class TestCalculator {
	
	Calculator c = null;
//	ICalculatorService servic = Mockito.mock(ICalculatorService.class);
	
	@Mock
	ICalculatorService servic;
	@Rule public MockitoRule rule  = MockitoJUnit.rule();
	
	@Before
	public void setUp(){
		
		c = new Calculator(servic);
	}
	
	@Test
	public void testAddMethod(){
		
		when(servic.add(2, 3)).thenReturn(5);
		
		assertEquals(10, c.calStart(2, 3));
		
		verify(servic).add(2, 3);
		
	}

}
