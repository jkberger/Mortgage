package main;

public class MortgageCalculatorController {
	double present_value;
	double future_value;
	double number_of_periods;
	double payment; 
	double rate;
	int GrossIncome;
	int housingPayment;
	int Obligations;
	int Minimum_value;
	
	
	public static int housingPayment1(){
		housingPayment= (int) (GrossIncome*.18);
		
	public static int obligations(){
		Obligations = (int) (GrossIncome*.36);
		
	public static int minimum(){
		if (housingPayment < Obligations);
			Minimum_value = housingPayment;
			else Minimum_value = Obligations;
	}
	}
	}
}
