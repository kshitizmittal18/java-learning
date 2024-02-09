package com.learnings.overloading;

class Product {
    // Method 1
    // Multiplying two integer values
    public int multiply(int a, int b)
    {
        int prod = a * b;
        return prod;
    }

    // Method 2
    // Multiplying three integer values
    public int multiply(int a, int b, int c)
    {
        int prod = a * b * c;
        return prod;
    }
}

class DynamicProduct extends Product{
    //    public Object multiply(int... numbers)
    public int multiply(int... numbers)
    {
        int prod = 1;
        if(numbers.length > 0){
            for (int num : numbers)
                prod = prod * num;
        } else {
            prod = 0;

            // Need to return String type error like "Invalid input given"
        }
        return prod;
    }
}

public class Overloading {
    public static void main(String[] args) {
        // Creating object of above class inside main()
        // method
        Product ob = new Product();

        // Calling method to Multiply 2 numbers
        int prod1 = ob.multiply(1, 2);

        // Printing Product of 2 numbers
        System.out.println( "Product of the two integer value :" + prod1);

        // Calling method to multiply 3 numbers
        int prod2 = ob.multiply(1, 2, 3);

        // Printing product of 3 numbers
        System.out.println("Product of the three integer value :" + prod2);

        DynamicProduct dp = new DynamicProduct();

        // Calling method to multiply n numbers
        // How to handle dynamic data types ?? ASK
        int prod3 = dp.multiply(45, 85 , 12, 5, 23);

        // Printing product of 3 numbers
        System.out.println("Product of the n integer values :" + prod3);
    }
}
