package com.training.java.enums;

import java.util.Scanner;

public class FirstClass {


    public static final int TOPLAMA_INDEX = 1;
    public static final int CIKARMA_INDEX = 2;

    public String hello(){
        return "Hello world";
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        try (Scanner scanner =new Scanner(System.in);) {
            System.out.println(TOPLAMA_INDEX +  "-toplama");
            System.out.println(CIKARMA_INDEX + "-Çıkarma");
            System.out.println("seçiminiz");
            int result = scanner.nextInt();
            switch (result){
                case TOPLAMA_INDEX:
                    System.out.println("toplama seçtiniz");
                    break;
                case CIKARMA_INDEX:
                    System.out.println("Çıkarma seçtiniz");
                    break;
                default:
                    System.out.println("Yanlış seçim");
                    break;
            }
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }
}
