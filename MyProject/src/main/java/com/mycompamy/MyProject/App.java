package com.mycompamy.MyProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.example.Company;

public class App 
{
    public static void main( String[] args )
    {

		int choice = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. create product");
			System.out.println("2. display all products");
			System.out.println("3. find product by id");
			System.out.println("4. update product");
			System.out.println("5. delete product");
			System.out.println("0. exit");
			System.out.print("choice: ");
			choice = Integer.parseInt(br.readLine().toString());
			switch (choice) {
			case 1:
				System.out.print(" Enter product name: ");
				String fName=br.readLine().toString();
				System.out.print(" Enter product type: ");
				String lName=br.readLine().toString();
				System.out.print(" enter product price: ");
				String email=br.readLine().toString();
				Company company=product.createProduct(productName, productType, price);
				System.out.println("Product is created with success "+product);
				break;
			case 0:
				System.exit(0);
				
			default:
				System.out.println("invalid choice");
				break;
			}

		} while (choice != 0);

	
    }
}
