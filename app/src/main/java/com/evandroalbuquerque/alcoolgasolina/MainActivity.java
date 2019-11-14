package com.evandroalbuquerque.alcoolgasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText valorAlcool;
    private TextInputEditText valorGasolina;
    private TextView melhorCombustivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorAlcool = findViewById(R.id.txtPrecoAlcool);
        valorGasolina = findViewById(R.id.txtPrecoGasolina);
        melhorCombustivel = findViewById(R.id.txtMsgCombustivel);
    }


    public void btnCalcular(View v) {
        float alc = Float.parseFloat(valorAlcool.getText().toString().trim());
        float gas = Float.parseFloat(valorGasolina.getText().toString().trim());

        float calculo = (float) (gas * 0.7);

        if (calculo > alc) {
            melhorCombustivel.setText("Abasteça com álcool!");
        } else if ( calculo < alc) {
            melhorCombustivel.setText("Abasteça com gasolina!");
        } else {
            melhorCombustivel.setText("Valores equivalentes, escolha o combustível de sua preferência!");
        }

    }
}
