package bank;

public class AxisBank extends BankInfo { 
	public void deposit() {
		System.out.println("deposit");
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.deposit();
		obj.fixed();
		obj.saving();
		
	}

}
