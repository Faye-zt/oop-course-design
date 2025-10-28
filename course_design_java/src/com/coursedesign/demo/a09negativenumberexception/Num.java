package com.coursedesign.demo.a09negativenumberexception;

public class Num {
    private int num;

    public Num() {
    }

    public Num(int num)  {
        this.num = num;

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        if(num < 0){
            throw new NegativeNumberException();
        }
    }
}
