package encapsulation;

public class BankA {
	
	 private int pin;	
	
//	public void setter(int pin)
//	{
//		this.pin = pin;
//		
//	}
	
	public boolean validate()
	{
//		if (pin == 1001 || pin == 1234 || pin == 1212)
//		{
//			System.out.println("Valid Pin");
//		}
//		else
//		{
//			System.out.println("Invalid Pin");
//		}
		int[] validpin = {1001, 1234, 1212};
		boolean isvalue = false;
		for(int i =0;i<validpin.length;i++)
		{
			//System.out.println("passed pin"+pin);
			if(this.pin == validpin[i])
			{
				isvalue = true;
				break;
				
			}
			
			
		}
		
		
		return isvalue;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin,String encryptKey) {
		if(encryptKey=="*334567") {
			this.pin = pin;
		}
		else {
			this.pin=0;
		}
		
	}


}
