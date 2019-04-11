package com.example.tezaalfian.koperasipetik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homepage);

        (Button) btninput = findViewById(R.id.btnInput);
        Button btnhistory = findViewById(R.id.btnhistory);
    }
}
