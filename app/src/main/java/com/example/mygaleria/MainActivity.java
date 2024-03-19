package com.example.mygaleria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextUser;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUser = findViewById(R.id.usuario);
        editTextPassword = findViewById(R.id.contraseña);

        Button Inicio = findViewById(R.id.inicio);
        Inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = editTextUser.getText().toString();
                String password = editTextPassword.getText().toString();

                // Verifica las credenciales estáticas (por ejemplo, usuario: "admin", contraseña: "1234")
                if (user.equals("Nicte-ha") && password.equals("1234")) {
                    Intent intent = new Intent(v.getContext(), MainActivity2.class);
                    startActivity(intent);
                } else {
                    // Muestra un mensaje de error si las credenciales son incorrectas
                    Toast.makeText(MainActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}