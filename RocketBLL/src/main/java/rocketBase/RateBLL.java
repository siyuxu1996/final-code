package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException 
	{
		ArrayList<RateDomainModel> Array = new ArrayList<RateDomainModel>();
		double interestrate = 0;
		
		for(RateDomainModel rate : Array)
		{
			if(rate.getiMinCreditScore() < GivenCreditScore)
			{
				interestrate = rate.getiMinCreditScore();
				return interestrate;
			}
		}
		return interestrate;
		
		
	}
	
	

	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
