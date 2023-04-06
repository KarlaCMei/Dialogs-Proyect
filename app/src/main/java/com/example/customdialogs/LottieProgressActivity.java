package com.example.customdialogs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class LottieProgressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie_progrest);


        AlertDialog.Builder builder = new AlertDialog.Builder(LottieProgressActivity.this);
        // Get the layout inflater
        LayoutInflater inflater = LottieProgressActivity.this.getLayoutInflater();

        View view = inflater.inflate(R.layout.custom_progrest_lottie, null);

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(view);

        builder.show();

    }
}