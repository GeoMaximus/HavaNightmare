package ro.ase.java.main;

import ro.ase.java.classes.Product;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write name: ");
        String name = scanner.nextLine();
        System.out.println("Write quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Write price: ");
        double price = scanner.nextDouble();

        Product a = new Product(name, quantity, price);
//        System.out.println(a);

        scanner.close();

        Product product = new Product("Product", 100, 15.5);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("product.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(name);
            bufferedWriter.write(System.lineSeparator());
            bufferedWriter.write(Integer.toString(quantity));
            bufferedWriter.write(System.lineSeparator());
            bufferedWriter.write(Double.toString(price));
            bufferedWriter.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("product.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String productName = bufferedReader.readLine();
            int productQuantity = Integer.parseInt(bufferedReader.readLine());
            double productPrice = Double.parseDouble(bufferedReader.readLine());
            Product product1 = new Product(productName, productQuantity, productPrice);
            System.out.println(product1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
