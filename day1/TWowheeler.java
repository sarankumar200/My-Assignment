package week1.day1;

public class TWowheeler {
	
		int noOfWheels =2;
		short noOfMirrors=2;
		long chassisNumber=125633632352465l;
		boolean isPunctured=true;
		String bikeName="fz";
		double runningKm=2345.22;
		public static void main(String[] args) {
			TWowheeler bike=new TWowheeler();
			System.out.println(bike.noOfWheels);
			System.out.println(bike.isPunctured);
			System.out.println(bike.chassisNumber);
			System.out.println(bike.bikeName);
		}

}
