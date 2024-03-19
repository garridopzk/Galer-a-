package com.example.mygaleria;

// Importar las clases necesarias
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    ImageView image;
    ImageView losdelespacio;
    ImageView duki;
    ImageView tiago;
    ImageView duko;
    ImageView miloj;
    ImageView bzrp;
    ImageView maria;
    ImageView pzk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Obtener una referencia al ImageView
        ImageView myImageView = findViewById(R.id.image);

        // Configurar un click listener para el botón "After"
        findViewById(R.id.After).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mostrar un mensaje de reproducción
                Toast.makeText(MainActivity2.this, "Reproduciendo otra canción", Toast.LENGTH_SHORT).show();

                // Establecer la imagen en el ImageView
                myImageView.setImageResource(R.drawable.img1);

                // Establecer la imagen en el ImageView
                myImageView.setImageResource(R.drawable.losdelespacio);

                // Establecer la imagen en el ImageView
                myImageView.setImageResource(R.drawable.duko);

                // Establecer la imagen en el ImageView
                myImageView.setImageResource(R.drawable.miloj);

                // Establecer la imagen en el ImageView
                myImageView.setImageResource(R.drawable.bzrp);

                // Establecer la imagen en el ImageView
                myImageView.setImageResource(R.drawable.maria);

                // Establecer la imagen en el ImageView
                myImageView.setImageResource(R.drawable.pzk);
            }
        });
    }
}
