package org.example;

public class FizzBuzzerBeta extends AbstractFizzBuzzer{
    @Override
    public boolean isFizz() {
        String numberString= Integer.toString(getNumber());
        return numberString.contains("3");
    }

    @Override
    public boolean isBuzz() {
        String numberString= Integer.toString(getNumber());
        return numberString.contains("3");
    }

    @Override
    public boolean isFizzBuzz() {
        return isFizz() && isBuzz();
    }

    @Override
    public boolean isNumber() {
        return !(isFizz() || isBuzz());
    }
}
