package com.example.android.payment_portal;


import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
    @FormUrlEncoded
    @POST("")
    Call<PaymentID>insertData(@Field("payment_id") String razorpayPaymentID, @Field("amount") int amount);



}
