package week1.day1;

public class Mobile {
	String mobileBrandName="realme";
	char mobileLogo='r';
	short noOfMobilePiece=1;
	int modelNumber=5;
	long mobileImeiNumber=654235145372l;
	float mobilePrice=22.4333f;
	boolean isDamaged=false;
	public static void main(String[] args) {
		Mobile phone=new Mobile();
		System.out.println(phone.modelNumber);
		System.out.println(phone.mobilePrice);
		System.out.println(phone.mobileLogo);
		System.out.println(phone.mobileImeiNumber);
		System.out.println(phone.mobileBrandName);
		System.out.println(phone.isDamaged);
	}
	
	
	

}
