package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("press break");
	}
    public void applyGear() {
    	System.out.println("handle gear");
    }
    public void switchOnAc() {
    	System.out.println("on ac");
    }
    public void applyAcclerate() {
    	System.out.println("press acclerate");
    }
    public static void main(String[] args) {
		Car car=new Car();
		car.applyGear();
		car.applyBreak();
		car.applyAcclerate();
	}

}
