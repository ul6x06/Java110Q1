class Cal_area {
	int width ;
	int height ;
	int length ; 
	int radius ;
	double pi = 3.14159 ;
	public  Cal_area(int r) {
		radius = r ;
	}
	public Cal_area(int w ,int h,int l){
		 width = w;
		 height = h;
		 length = l;
	}
	 void show0() {
		System.out.println("半徑 = "+radius);
		System.out.println("球形體積 = "+4*pi*radius*radius*radius/3);
		System.out.println();
	}
	 void  show1() {
		System.out.println("長 = "+length+" ,寬 = "+width+" ,高 = "+height);
		System.out.println("立方體表面積 = "+(length*height*2+width*height*2+length*width*2));
	}
}

public class Class01 {
	public static void main(String argv[]) {
	Cal_area ca0 = new Cal_area(10);
	Cal_area ca1 = new Cal_area(5,6,4);
	ca0.show0();
	ca1.show1();
	}
}
