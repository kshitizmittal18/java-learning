package com.learnings.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx {
    public static void main(String[] args) {
        try{
            BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\kshitiz.mittal\\Downloads\\Rent\\sample.txt"));
            int i;
            while((i=file.read())!=-1)
                System.out.print((char)i);
            System.out.print("\n");
            file.close();

            int a = 10;
            int b = 0;
            float afterDivide = a/b;
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException called");
        }
        catch(FileNotFoundException e) {
            System.out.println("FNFException called");
        }
        catch(IOException e) {
            System.out.println("IOException called");
        }
        catch(Exception e) {
            System.out.println("GenericException called");
        }
        finally {
            System.out.println("Finally block called");
        }
    }
}
