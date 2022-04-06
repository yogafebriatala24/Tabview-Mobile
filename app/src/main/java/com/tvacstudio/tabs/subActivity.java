package com.tvacstudio.tabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class subActivity extends AppCompatActivity {
    EditText nilai1,nilai2;
    TextView result;
    TextView logika;
    Button mulai;

    private double hasilakhir = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        nilai1 = (EditText) findViewById(R.id.nilai1);
        nilai2 = (EditText) findViewById(R.id.nilai2);
        result = (TextView) findViewById(R.id.hasil);
        logika = (TextView) findViewById(R.id.logika);
        mulai = (Button) findViewById(R.id.mulai);

        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((nilai1.getText().length()>0) && (nilai2.getText().length()>0)){
                    double inputA= Double.parseDouble(nilai1.getText().toString());
                    double inputB= Double.parseDouble(nilai2.getText().toString());
                    hasilakhir = inputA+inputB;
                    result.setText(Double.toString(hasilakhir));
                    if (hasilakhir>0) {
                        logika.setText("Positif");
                    }else

                    if (hasilakhir<0){
                        logika.setText("Negatif");
                    }
                }


            }
        });


    }
}