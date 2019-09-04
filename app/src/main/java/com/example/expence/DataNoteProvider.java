package com.example.expence;

public class DataNoteProvider {

    private float amount;
    private  String note;
    private  int id;
    public DataNoteProvider(float amount, String note, int id) {
        this.amount = amount;
        this.note = note;
        this.id = id;
    }

    public DataNoteProvider(int id,float amount,String note){
        this.setAmount(amount);
        this.setNote(note);

    }
    public DataNoteProvider(float amount,String note){
        this.setAmount(amount);
        this.setNote(note);
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
