package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Em;
    EditText Ps;
    EditText Ps2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.r5);
        btn.setOnClickListener(v -> onRegisterButtonClick());
        Em = findViewById(R.id.r2);
        Ps = findViewById(R.id.r3);
        Ps2 = findViewById(R.id.r4);
    }
    public void onRegisterButtonClick() {
        Validatsiya validationPatterns = new Validatsiya();
        String Email1 = Em.getText().toString();
        String Pass1 = Ps.getText().toString();
        String Pass2 = Ps2.getText().toString();
        Polzovatel registering = new Polzovatel(Email1, Pass1, Pass2);
        if (validationPatterns.validateEmail(registering)) {
            Toast.makeText(getApplicationContext(), "Валидация была успешно пройдена", Toast.LENGTH_SHORT).show();
        }

        else {
            Toast.makeText(getApplicationContext(), "Где-то была допущена ошибка", Toast.LENGTH_SHORT).show();
        }
    }

}
