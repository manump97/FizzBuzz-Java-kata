package org.example;

public abstract class AbstractFizzBuzzer {
    private int number = 0;
    private FizzBuzzStatus status = FizzBuzzStatus.NUMBER;
    private int modeConditions = 0;
    private String language = "fizzbuzz";

    public AbstractFizzBuzzer(){
        new FizzBuzzer(number,modeConditions,language);
    }
    public AbstractFizzBuzzer(int userNumber, int userModeConditions){
        new FizzBuzzer(userNumber,this.modeConditions,this.language);
    }
    public AbstractFizzBuzzer(int userNumber, int userModeConditions, String userLanguage){
        this.number = userNumber;
        this.modeConditions = userModeConditions;
        this.language = userLanguage;
        setStatus();
    }

    abstract public boolean isFizz();

    abstract public boolean isBuzz();

    abstract  public boolean isFizzBuzz();

    abstract public boolean isNumber();

    public int getNumber() {
        return this.number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public FizzBuzzStatus getStatus() {
        return status;
    }

    public void processNextNumber()
    {
        this.number++;
        setStatus();
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

}
