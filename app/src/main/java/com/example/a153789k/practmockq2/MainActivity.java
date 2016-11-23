package com.example.a153789k.practmockq2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Spinner a;
    ArrayAdapter<CharSequence>h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (Spinner) findViewById(R.id.spData);
        h = ArrayAdapter.createFromResource(this,R.array.Data,R.layout.support_simple_spinner_dropdown_item);
        a.setAdapter(h);

    }
}
