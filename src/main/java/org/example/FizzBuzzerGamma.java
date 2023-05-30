package org.example;

public class FizzBuzzerGamma extends AbstractFizzBuzzer{
    @Override
    public boolean isFizz() {
        return getNumber() <= 10;
    }

    @Override
    public boolean isBuzz() {
        return getNumber() > 10 && getNumber() % 7 == 0;
    }

    @Override
    public boolean isFizzBuzz() {
        return getNumber() % 15 == 0;
    }

    @Override
    public boolean isNumber() {
        return !(isNumberPrime());
    }

    public boolean isNumberPrime(){
        int numberToEvaluate = getNumber();
        for (int number=2; number <= numberToEvaluate/2; number++){
            if(numberToEvaluate % number == 0){return false;}
        }
        return true;
    }

}
