package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {

	@Test
	public void RateTest1() throws RateException {
		assertNotEquals(RateBLL.getRate(1),2.0,0.001);
	}
	
	@Test 
	public void RateTest2() throws RateException {
		RateBLL.getRate(200);
	}
	@Test
	public void GetPaymentTest() throws RateException{
		assertEquals(RateBLL.getPayment(0.04/12, 360, 300000, 0, false)*-1,1432.25,0.01);
}
	
}
