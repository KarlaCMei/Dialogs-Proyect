package com.example.customdialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;

public class DialogPorDefaulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_por_defaul);

        ProgressDialog pd = new ProgressDialog(DialogPorDefaulActivity.this);
        pd.setTitle("Titulo");
        pd.setMessage("loading");
        pd.setCancelable(false);
        //pd.setCanceledOnTouchOutside(false);
        pd.show();
    }
}