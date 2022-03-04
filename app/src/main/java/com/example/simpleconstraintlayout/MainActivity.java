package com.example.simpleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText Eemail, Epassword;
    Button btsignin;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Eemail=findViewById(R.id.edEmail);
        Epassword=findViewById(R.id.edPassword);
        btsignin=findViewById(R.id.btSignIn);

        btsignin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                nama = Eemail.getText().toString(); 
                password = Epassword.getText().toString();

                if (nama.equals("") || password.equals("")) {
                    Toast.makeText(MainActivity.this, "User atau Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (nama.equals("Mukti") && password.equals("Mukti121212")){
                        Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        if (password.equals("Mukti121212")) {
                            Toast.makeText(MainActivity.this, "Email Salah", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            if (nama.equals("Mukti")) {
                                Toast.makeText(MainActivity.this, "Password Salah", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(MainActivity.this, "Email dan Password Salah!", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }

            }
        });
    }
}