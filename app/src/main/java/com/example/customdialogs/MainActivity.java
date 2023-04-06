package com.example.customdialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_dialog_default).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DialogPorDefaulActivity.class);
            startActivity(intent);
            }
        });

        findViewById(R.id.btn_lineal_progress).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LinealProgressActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_lottie_progress).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LottieProgressActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_trasparent_progress).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TransparentProgressActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_dialog_with_one_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DialogWithOneButtonActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_dialog_with_two_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DialogWithTwoButtonsActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_dialog_with_sistem_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DialogsWhitSystemButtonsActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_custom_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CustomDialogActivity.class);
                startActivity(intent);
            }
        });
    }
}