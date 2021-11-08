
class Cal_area{
	double pi;
	double radius;
	int length;
	int width;
	int height;
	
	void showdata() {
		System.out.println("半徑="+radius);
	}
	void cirarea() {
		System.out.println("球型體積="+4*pi*radius*radius*radius/3);
	}
	void showdata2() {
		System.out.println("長="+length+",+寬="+width+"高="+height);
	}
	void volume() {
		System.out.println("立方體體積="+(2*(length*width)+2*(width*height)+2*(length*height)));
	}
	void showAll() {
		System.out.println();
		showdata();
		cirarea();
		showdata2();
		volume();
	}
	
}
public class class01 {
	public static void main(String args[]) {
		Cal_area cir = new Cal_area();
		cir.pi = 3.14159;
		cir.radius = 10.0;
		cir.length = 4;
		cir.width = 5;
		cir.height = 6;
		
		cir.showAll();
	}
}
