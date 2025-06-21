package com.builder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer basic=new Computer.Builder("Intel i3", "4GB RAM").build();
		basic.display();
		
		Computer avg=new Computer.Builder("Intel i5", "8GB RAM").color("White").storage("512GB Storage").build();
		avg.display();
		
		Computer high=new Computer.Builder("Intel i9", "16GB RAM").color("Black").storage("1TB Storage").build();
		high.display();
	}

}
