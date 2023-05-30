package org.example;

public class FizzBuzzerAlpha extends AbstractFizzBuzzer{
    @Override
    public boolean isFizz() {
        return getNumber() % 3 == 0;
    }

    @Override
    public boolean isBuzz() {
        return getNumber() % 5 == 0;
    }

    @Override
    public boolean isFizzBuzz() {
        return getNumber() % 15 == 0;
    }

    @Override
    public boolean isNumber() {
        return !(isFizz() | isBuzz());
    }
}
