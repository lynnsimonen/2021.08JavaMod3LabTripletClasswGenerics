package edu.wctc;

public class Triplet<T> {
    private T first, second, third;


    public Triplet(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }

    @Override
    public String toString() {
        //Can use a string to print out any data type or for String.format, you can use
        //if else statement if(first instance of Boolean)... else (first instance of String)...
        //return %d or %s ...
        return String.format("First: %s, Second: %s, Third: %s",first, second, third);
    }
}
