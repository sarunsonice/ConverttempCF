package com.example.sarunsonice.converttempcf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView output;
    private EditText input;
    private Button CtoF,FtoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.inputtemp);
        output = findViewById(R.id.outputtext);
        CtoF = findViewById(R.id.CtoF);
        FtoC = findViewById(R.id.FtoC);

        CtoF.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View V){
                    if(input.length() == 0){
                        output.setText("input value");
                    }
                    else {
                        double val,cal;
                        String ans;
                        val = Double.parseDouble(input.getText().toString());
                        cal = (val*1.8)+32;
                        ans = Double.toString(cal);

                    output.setText(ans + " °F");
                }
            }
        });
        FtoC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                if(input.length() == 0){
                    output.setText("input value");
                }
                else {
                    double val,cal;
                    String ans;
                    val = Double.parseDouble(input.getText().toString());
                    cal = (val-32)/1.8;
                    ans = Double.toString(cal);

                    output.setText(ans + " °C");
                }
            }
        });
    }
}
