package com.example.telafrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.telafrutas.databinding.ActivityTelaDoisBinding;

public class TelaDois extends AppCompatActivity {

    int peso=0;
    int preco;
    String qtdd;

    private ActivityTelaDoisBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTelaDoisBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.ivAddCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                peso++;
                preco = peso*20;
                binding.tv1kg.setText((peso) +"kg");
                binding.textView13.setText("Price - R$"+preco);
            }
        });

        binding.ivRemoveCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                peso--;
                preco = peso*20;
                binding.tv1kg.setText((peso) +"kg");
                binding.textView13.setText("Price - R$"+preco);
            }
        });

        binding.ivuUvaVermelha.setOnClickListener(view1 -> binding.ivUva.setImageResource(R.drawable.redgrape));

        binding.ivUvaVerde.setOnClickListener(view12 -> binding.ivUva.setImageResource(R.drawable.uvaverdee));

        binding.ivUvaRoxa.setOnClickListener(view13 -> binding.ivUva.setImageResource(R.drawable.uvavermelhaa));

        binding.btnaddcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String qtdd = binding.textView13.getText().toString();

                Intent intentEnviadora = new Intent(getApplicationContext(), TelaCarrinho.class);
                Bundle dados = new Bundle();
                dados.putString("chave_qtdd",qtdd);

                intentEnviadora.putExtras(dados);

                startActivity(intentEnviadora);
            }
        });
    }
}