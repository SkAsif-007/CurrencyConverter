package com.example.skasifali.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Convert(View view) {

        Log.i("Info","Button Pressed!!");

        ImageView image = (ImageView) findViewById(R.id.imageView);

        image.setImageResource(R.drawable.rupees);

        EditText editText = (EditText) findViewById(R.id.editText);

        String amountInRupees = editText.getText().toString();

        double amountInRupeesDouble = Double.parseDouble(amountInRupees);

        double amountInDollarsDouble = amountInRupeesDouble * 74.82;

        String amountInDollarsString = String.format("%.2f", amountInDollarsDouble);

        Toast.makeText(this, "Rs" + amountInRupees + "is $"+ amountInDollarsString, Toast.LENGTH_LONG).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
