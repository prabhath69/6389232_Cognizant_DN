package com.search;

import java.util.*;

public class ECommerce {
	
	public static Product linearSearch(Product[] products, String target) {
		for(Product prod: products) {
			if(prod.productName.equalsIgnoreCase(target)) {
				return prod;
			}
		}
		return null;
	}
	
	public static Product binarySearch(Product[] products, String target) {
		int left=0, right=products.length-1;
		
		while(left<=right) {
			int mid=left + (right-left)/2;
			int compare=products[mid].productName.compareToIgnoreCase(target);
			
			if(compare==0) {
				return products[mid];
			}else if(compare>0) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] products= {
				new Product(1, "Keyboard", "Hardware"),
				new Product(2, "Mouse", "Hardware"),
				new Product(3, "MS Office", "Software"),
				new Product(4, "Windows OS", "Software"),
				new Product(5, "Laptop Bag", "Clothing"),
		};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the product name you want to search(Keyboard, Mouse, MS Office, Windows OS, Laptop Bag): ");
//		sc.nextLine();
		String target=sc.nextLine().trim();
		
		System.out.println("Linear Search:");
		Product linsearch=linearSearch(products, target);
		if(linsearch==null) {
			System.out.println("The item "+target+" is not found!");
		}else {
			System.out.println("Product Name: "+linsearch.productName+"\nProduct ID: "+linsearch.productId+"\nProduct Category: "+linsearch.category+"\n\n");
		}
		
		Arrays.sort(products, Comparator.comparing(p->p.productName.toLowerCase()));
//		for(Product p: products) {
//			System.out.println("Product Name: "+p.productName);
//			System.out.println("Product ID: "+p.productId);
//			System.out.println("Product Category: "+p.category);
//		}
		
		System.out.println("Binary Search:");
		Product binsearch=binarySearch(products, target);
		if(binsearch==null) {
			System.out.println("The item "+target+" is not found!");
		}else {
			System.out.println("Product Name: "+binsearch.productName+"\nProduct ID: "+binsearch.productId+"\nProduct Category: "+binsearch.category);
		}

	}

}
