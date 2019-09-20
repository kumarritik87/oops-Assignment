package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
                int a ;
                String c ,d ,b;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the book number :");
                a = sc.nextInt();
                if (a== 0) {
                    System.out.println("N/A");
                }
                else{

                    while (a -- >0){
                        sc.skip("\n");
                        System.out.println(" enter the Book name: ");
                        c = sc.nextLine();

                        System.out.println("enter the author name :");
                       d = sc.nextLine();

                        System.out.println("enter the ISBN number ");
                        b = sc.nextLine();
                        String temp = "-----------------------------";
                        System.out.println(temp);
                        System.out.println("Book Name : \t" +c);
                        System.out.println("Author Name : \t"+d);
                        System.out.println("ISBN  : \t"+b);
                        System.out.println(temp);
                    }
                }
                }
            }


