package com.training.java.enums;

import java.util.Scanner;

public class FirstClassNew {

    static {
        System.out.println("Çalıştım");
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        try (Scanner scanner = new Scanner(System.in);) {
            EMathOp[] values = EMathOp.values();
            for (EMathOp emo:values) {
                if (emo == EMathOp.NONE){
                    continue;
                }
                System.out.println(emo.getIndex() +  "-" + emo.getDesc());
            }
            System.out.println("seçiminiz");
            int result = scanner.nextInt();
            EMathOp eMathOp = EMathOp.convertIndexToEMathOp(result);
            IMathOp mathOp = eMathOp;
            System.out.println("İlk değişken : ");
            int val1 = scanner.nextInt();
            System.out.println("İkinci değişken : ");
            int val2 = scanner.nextInt();
            Integer opResult = mathOp.execute(val1,
                                              val2);
            System.out.println(eMathOp.getDesc() + " sonucu : " + opResult);

        } catch (Exception exp) {
            exp.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}
