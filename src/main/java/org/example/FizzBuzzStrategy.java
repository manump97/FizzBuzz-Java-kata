package org.example;

public class FizzBuzzStrategy {

    static AbstractFizzBuzzer buildStrategy(Mode mode) {
        switch (mode) {
            case ALPHA -> {
                return new FizzBuzzerAlpha();
            }
            case BETA -> {
                return new FizzBuzzerBeta();
            }
            default -> {
                return new FizzBuzzerGamma();
            }
        }
    }

}

////////
/*
FACTORY
    map (MODE, ObjectQueHeredaDeAbstract)
    map[mode]

 */
