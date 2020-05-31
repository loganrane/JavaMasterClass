package com.application;

import com.product.Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProductDemo {
    public static void main(String[] args) throws IOException {
        // Initializing the array of products
        Product[] products = new Product[10];

        // Loading the file
        String path_file = "C:\\Users\\lenovo\\Desktop\\GitBlaze\\JavaMasterClass\\src\\product.txt";
        File file_products = new File(path_file);

        int number_of_products = 0;
        // Reading the file and storing the data in Products array.
        try(FileReader fileReader = new FileReader(file_products)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp = "";
            int i = 0;
            while((temp = bufferedReader.readLine()) != null){
                // Splitting the string into 3 parts by using the delimeter "," .
                String[] product_details = temp.split(",", 3);

                // Storing the data into it's appropriate place.
                products[i].setProdNo(Integer.parseInt(product_details[0]));
                products[i].setProdName(product_details[1]);
                products[i].setProdPrice(Double.parseDouble(product_details[2]));

                i++;
            }
            number_of_products = i;
        } catch(IOException e){
            e.printStackTrace();
        }

        // Printing the list of products.
        for(int i=0; i<number_of_products; i++){
            System.out.println("Product - Number: " + products[i].getProdNo() + " | Name: " + products[i].getProdName() + " | Price: " + products[i].getProdPrice());
        }


    }
}
