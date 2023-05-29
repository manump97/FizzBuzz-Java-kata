package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FizzBuzzer {
    // INITIALIZATION
    private int number = 0;
    private FizzBuzzStatus status = FizzBuzzStatus.NUMBER;
    private int modeConditions = 0;
    private String language = "fizzbuzz";

    // CONSTRUCTORS
    public FizzBuzzer(){
        new FizzBuzzer(number,modeConditions,language);
    }
    public FizzBuzzer(int userNumber, int userModeConditions){
        new FizzBuzzer(userNumber,this.modeConditions,this.language);
    }
    public FizzBuzzer(int userNumber, int userModeConditions, String userLanguage){
        this.number = userNumber;
        this.modeConditions = userModeConditions;
        this.language = userLanguage;
        setStatus();
    }

    // METHODS
    public boolean isFizz(){
        switch (this.modeConditions){
            case 1 -> {
                String numberString= Integer.toString(this.number);
                return numberString.contains("3");
            }
            case 2 -> {return this.number <= 10;}
            default -> {return this.number % 3 == 0;}
        }
    }
    public boolean isBuzz(){
        switch (this.modeConditions){
            case 1 -> {
                String numberString= Integer.toString(this.number);
                return numberString.contains("5");}
            case 2 -> {return this.number > 10 & this.number % 7 == 0;}
            default -> {return this.number % 5 == 0;}
        }
    }
    public boolean isFizzBuzz(){
        switch (this.modeConditions){
            case 2 -> {return isNumberPrime();}
            default -> {return isFizz() & isBuzz();}
        }
    }
    public boolean isNumber(){return !(isFizz() | isBuzz());}
    public boolean isNumberPrime(){
        int numberToEvaluate = this.number;
        for (int number=2; number <= numberToEvaluate/2; number++){
            if(numberToEvaluate % number == 0){return false;}
        }
        return true;
    }
    public void printInformation(boolean withTimeAndHour) {
        if (withTimeAndHour){
            System.out.println(getDateTimeHoursMinutes() + " - " + getNumberandStatus());
        }
        else {
            System.out.println(getNumberandStatus());}
    }
    public String getNumberandStatus(){
        String NumberAndStatus = String.format("%d -> %s",getNumber(), getStringStatus());
        return NumberAndStatus;
    }
    public String getDateTimeHoursMinutes(){
        String dateTime = DateTimeFormatter.ofPattern("yyyy/MMM/dd, hh:mm:ss").format(LocalDateTime.now());
        String dateTimeAndHoursMinutes = "Date: " + dateTime;
        return dateTimeAndHoursMinutes;
    }

    // GETTERS AND SETTERS
    public int getNumber() {
        return this.number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public FizzBuzzStatus getStatus() {
        return status;
    }
    public String getStringStatus() {
        switch (this.status) {
            case FIZZBUZZ -> {return "FIZZBUZZ";}
            case FIZZ -> {return "FIZZ";}
            case BUZZ -> {return "BUZZ";}
            default -> {return "NUMBER";}
        }
    }
    public void setStatus() {
        if(isFizzBuzz()){
            this.status = FizzBuzzStatus.FIZZBUZZ;}
        else if (isFizz()) {
            this.status = FizzBuzzStatus.FIZZ;}
        else if (isBuzz()){
            this.status = FizzBuzzStatus.BUZZ;}
        else {
            this.status = FizzBuzzStatus.NUMBER;}
    }
    public String translateStringStatus(){
        return "hola";
    }
}

