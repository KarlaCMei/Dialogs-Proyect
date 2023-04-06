package com.example.customdialogs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class TransparentProgressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent_progress);

        AlertDialog.Builder builder = new AlertDialog.Builder(TransparentProgressActivity.this,R.style.customLottie);
        // Get the layout inflater
        LayoutInflater inflater = TransparentProgressActivity.this.getLayoutInflater();

        View view = inflater.inflate(R.layout.custom_progrest_lottie_transparent, null);

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(view);

        builder.show();
    }
}