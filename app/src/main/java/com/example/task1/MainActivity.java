package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup radiogroup1,radiogroup2;
    RadioButton radiobutton1,radiobutton2;

    TextView tv,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        radiogroup1=findViewById(R.id.radiogroup1);
        radiogroup2=findViewById(R.id.radiogroup2);
        tv=findViewById(R.id.tv);
        tv2=findViewById(R.id.tv2);

    }

    public void showSelectons(View view) {

int checked1=radiogroup1.getCheckedRadioButtonId();
radiobutton1=findViewById(checked1);
tv.setText(radiobutton1.getText());

        int checked2=radiogroup2.getCheckedRadioButtonId();
        radiobutton2=findViewById(checked2);



        tv2.setText(radiobutton2.getText());





    }
}