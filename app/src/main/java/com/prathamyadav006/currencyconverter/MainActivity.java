package com.prathamyadav006.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText dollars;
    TextView rupees;
    Button convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dollars=findViewById(R.id.price_dollars);
        rupees=findViewById(R.id.price_rupees);
        convert=findViewById(R.id.convert_button);

        convert.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String d = dollars.getText().toString();
                int price = Integer.parseInt(d);
                int r = (price * 75);
                rupees.setText("Amount in Rupees : "+ r );
                Toast.makeText(MainActivity.this,"Conversion Completed",Toast.LENGTH_SHORT).show();
            }
        });

    }

}