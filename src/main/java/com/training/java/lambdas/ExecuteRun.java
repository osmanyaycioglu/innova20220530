package com.training.java.lambdas;

public class ExecuteRun {
    public static void main(String[] args) {
        String denemeStr = "deneme";
        IExecute execute = new ExecuteImpl();
        System.out.println(execute.excute("osman",
                                          5));
        IExecute execute2 = new IExecute() {
            @Override
            public String excute(String str,
                                 Integer iVal) {
                return iVal + ".index result : " + str + " " + denemeStr;
            }
        };
        System.out.println(execute2.excute("osman",
                                           5));
        IExecute execute3 = new IExecute() {
            @Override
            public String excute(String str,
                                 Integer iVal) {
                return iVal + ".index result : " + str + " " + denemeStr;
            }
        };
        System.out.println(execute3.excute("osman",
                                           5));
        IExecute execute4 = (s, i) -> i + ".index execute 4 result : " + s + " " + denemeStr;
        System.out.println(execute4.excute("osman",
                                           5));

        IExecute execute5 = (s, i) -> {
            System.out.println("execute5 çalışıyor");
            return i + ".index execute 4 result : " + s + " " + denemeStr;
        };
        System.out.println(execute5.excute("osman",
                                           5));

        IExecute execute6 = ExecuteRun::xytz;
        System.out.println(execute6.excute("osman",
                                           6));

        ExecuteRun executeRun = new ExecuteRun();
        IExecute execute7 = executeRun::abc;
        System.out.println(execute7.excute("osman",
                                           6));

        IOpen open = i -> "opened " + i;

    }

    public String abc(String a,
                      Integer b) {
        System.out.println("method binding çalışıyor");
        return b + ".index method binding result : " + a;
    }

    public static String xytz(String a,
                              Integer b) {
        System.out.println("static method binding çalışıyor");
        return b + ".index static method binding result : " + a;
    }
    public static String asdf(String a,
                              String b) {
        System.out.println("static method binding çalışıyor");
        return b + ".index static method binding result : " + a;
    }

}
