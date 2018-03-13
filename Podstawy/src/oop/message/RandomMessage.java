package oop.message;

import java.util.Random;

public class RandomMessage implements Message {
    private int offset;
    private int bound;
    private Random random;

    public RandomMessage(int offset, int bound) {
        this.offset = offset;
        this.bound = bound;
        this.random= new Random();
    }

    @Override
    public String getMessage() {
        return String.valueOf(random.nextInt(bound)+ offset);
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getBound() {
        return bound;
    }

    public void setBound(int bound) {
        this.bound = bound;
    }
}
