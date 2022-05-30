package com.training.java.annotations;

@FirstAnno(name = {"test", "mest"}, index = 1)
@SecondAnno("osman")
public class TestAnnotationClass {

    @FirstAnno(name = "ali")
    @SecondAnno(value = "osman",time = 100L)
    private String valueStr;
    private Integer intVal;

    @FirstAnno(name = "veli")
    public TestAnnotationClass(String valueStr,
                               Integer intVal) {
        this.valueStr = valueStr;
        this.intVal = intVal;
    }

    @FirstAnno(name = "osman")
    public String generate(String str) {
        return valueStr + " " + intVal + " " + str;
    }

    public String getValueStr() {
        return valueStr;
    }

    public void setValueStr(String valueStr) {
        this.valueStr = valueStr;
    }

    public Integer getIntVal() {
        return intVal;
    }

    public void setIntVal(Integer intVal) {
        this.intVal = intVal;
    }
}
