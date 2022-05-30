package com.training.java.enums;

public enum EMathOp implements IMathOp {

    TOPLAMA(1,
            "toplama işlemi"),
    CIKARMA(2,
            "çıkarma işlemi") {
        @Override
        public Integer execute(Integer val1,
                               Integer val2) {
            return val1 - val2;
        }
    },
    CARPMA(3,
           "çarpma işlemi") {
        @Override
        public Integer execute(Integer val1,
                               Integer val2) {
            return val1 * val2;
        }
    },
    NONE(Integer.MAX_VALUE,
         "NULL") {
        @Override
        public Integer execute(Integer val1,
                               Integer val2) {
            throw new IllegalStateException("Yanlış seçim");
        }
    };

    private final int index;
    private final String desc;

    public static String str = System.getProperty("xyz"); // Bunu kullanma

    private EMathOp(final int index,
                    final String desc) {
        this.index = index;
        this.desc = desc;
    }

    public Integer execute(Integer val1,
                           Integer val2) {
        return val1 + val2;
    }

    public static EMathOp convertIndexToEMathOp(int index) {
        EMathOp[] values = EMathOp.values();
        for (EMathOp emo : values) {
            if (emo.getIndex() == index) {
                return emo;
            }
        }
        return NONE;
    }

    public int getIndex() {
        return index;
    }

    public String getDesc() {
        return desc;
    }
}
