package br.com.interaje.interaje02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titulo;
    EditText chute;
    int random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo = (TextView) findViewById(R.id.titulo);
        String texto = titulo.getText().toString();

        random = (int) (Math.random() * 10);

    }

    public void chamaChute(View v) {
        chute = (EditText) findViewById(R.id.editText);

        String texto = chute.getText().toString();

        int numero = Integer.parseInt(texto);

        if (numero > random) {
            // chutou alto
            titulo.setText("Chutou alto");
        } else if(numero < random) {
            // chutou baixo
            titulo.setText("Chutou baixo");
        } else {
            // acertou
            titulo.setText("Parabéns você acertou");
        }
    }
}
