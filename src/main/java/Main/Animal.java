package Main;

import java.lang.*;

public class Animal {

    private  String ageAnimal;
    private  String nameAnimal;
    private  String weightAnimal;
    private  String colorAnimal;
    protected String say;
    protected String fly;

    public void setAgeAnimal(String ageAnimal) {
        this.ageAnimal = ageAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public void setWeightAnimal(String weightAnimal) {
        this.weightAnimal = weightAnimal;
    }

    public void setColorAnimal(String colorAnimal) {
        this.colorAnimal = colorAnimal;
    }

    void getSay() {this.say="Я говорю";
    }
    void getfly() {this.fly=" ";
    }

    public String getAgeAnimal() {
        return ageAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public String getWeightAnimal() {
        return weightAnimal;
    }

    public String getColorAnimal() {
        return colorAnimal;
    }



    @Override
    //Переопределение toString
    public String toString() {
        return "Привет! Меня зовут " + nameAnimal + ", мне " + ageAnimal + ", я вешу " + weightAnimal + " кг" + ", мой цвет - " + colorAnimal;
    }


    //---------------------------------------------



}
