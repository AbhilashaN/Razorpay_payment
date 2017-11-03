package com.example.android.payment_portal;


public class PaymentID {
    String razorpayPaymentID;
    int amount;

    public String getRazorpayPaymentID(){
        return razorpayPaymentID;
    }

    public void setRazorpayPaymentID(String razorpayPaymentID){
        this.razorpayPaymentID = razorpayPaymentID;
    }
    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
