package com.example.customdialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;

public class LinealProgressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineal_progrest);


        ProgressDialog pd = new ProgressDialog(LinealProgressActivity.this);
        pd.setTitle("Titulo");
        pd.setMessage("loading");
        pd.setCancelable(false);
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pd.setIndeterminate(true);
        pd.setProgressPercentFormat(null);
        pd.setProgressNumberFormat(null);
        //pd.setCanceledOnTouchOutside(false);
        pd.show();

    }
}