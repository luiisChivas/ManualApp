package com.example.ticlab4.ejercicio_002;

/**
 * Created by juan- on 22/01/2017.
 */

public class PersonaIngles {

    private String name;
    private double weight;
    private double height;
    private char sex;
    private byte exercise;
    private double imc;
    private String status;



    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public byte getExercise() {
        return exercise;
    }

    public void setExercise(byte exercise) {
        this.exercise = exercise;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void carculateImc(){
        imc = weight / (height * height);
    }

    @Override
    public String toString() {
        return "PersonaIngles{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", Height=" + height +
                ", sex=" + sex +
                ", exercise=" + exercise +
                ", imc=" + imc +
                ", status='" + status + '\'' +
                '}';
    }
}
