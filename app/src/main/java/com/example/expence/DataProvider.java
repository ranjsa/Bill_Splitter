package com.example.expence;

public class DataProvider {

    private float amount;
    private  String name;
    private  int id;

    public DataProvider(String name, int id, int amount) {
        this.name = name;
        this.id = id;
        this.amount = amount;
    }
    public DataProvider(float amount, String name) {
        this.amount = amount;
        this.name = name;
    }
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
