package com.example.shakil.homework_2nd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText email,password;
    Button submit;

    TextView welcome;
    String emailtype,passwordtype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email= (EditText) findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);

        submit=(Button) findViewById(R.id.submit);
        welcome=(TextView)findViewById(R.id.welcome);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emailtype=email.getText().toString();
                passwordtype=password.getText().toString();

                welcome.setText("Welcome!\nYour Email is:-"+emailtype+"\nAnd \nYour pass is:-"+passwordtype);

            }
        });



    }
}
