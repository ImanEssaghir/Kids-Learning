package com.example.hci_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class l1_numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l1_numbers);

        View view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.sea_shell);
    }

}