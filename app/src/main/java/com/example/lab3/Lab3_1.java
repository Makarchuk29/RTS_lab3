package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Lab3_1 extends AppCompatActivity {
    private EditText element;
    private TextView resultElement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_1);
    }

    public void onButtonClick(View v) {
        element = findViewById(R.id.number);
        String numberString = element.getText().toString();
        if (numberString.isEmpty()){
            Toast toast = Toast.makeText(this, "Ви не ввели число!", Toast.LENGTH_LONG);
            toast.show();
            return;
        }
        factorizationFermat(Integer.parseInt(element.getText().toString()));
    }


    private void factorizationFermat(int number){
        resultElement = findViewById(R.id.result);
        if (!isPrimeNumber(number)){
            int x = (int)Math.sqrt(number) + 1;
            double y;
            do {
                y = Math.sqrt(x * x - number);
                if ( y% 1 == 0)
                    break;
                if (x>=number) {
                    resultElement.setText(number + " = " + number/2 + " * " + 2);
                    return;
                }
                x++;
            }while (true);
            int p = (int) (x+y);
            int q = (int) (x-y);
            resultElement.setText(number + " = " + p + " * " + q);

        }else {
            resultElement.setText(number + " = " + number + " * 1");
        }
    }
    private boolean isPrimeNumber(int number) {
        if (number == 1)
            return true;
        int count = 0;
        for(int j = 2; j <= number && count < 2;++j){
            if(number % j == 0){
                ++count;
            }
        }
        return count < 2;
    }

}
