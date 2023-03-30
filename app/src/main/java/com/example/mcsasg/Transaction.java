package com.example.mcsasg;

public class Transaction {

    String medDate;
    String medName;
    String medPrice;
    String medQuantity;

    public Transaction(String medDate, String medName,String medPrice, String medQuantity) {
        this.medDate = medDate;
        this.medName = medName;
        this.medPrice = medPrice;
        this.medQuantity = medQuantity;
    }

    public String getMedDate() {
        return medDate;
    }

    public void setMedDate(String medDate) {
        this.medDate = medDate;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public String getMedPrice() {
        return medPrice;
    }

    public void setMedPrice(String medPrice) {
        this.medPrice = medPrice;
    }

    public String getMedQuantity() {
        return medQuantity;
    }

    public void setMedQuantity(String medQuantity) {
        this.medQuantity = medQuantity;
    }
}