package com.example.telafrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.telafrutas.databinding.ActivityTelaCarrinhoBinding;
import com.example.telafrutas.databinding.ActivityTelaDoisBinding;

public class TelaCarrinho extends AppCompatActivity {

    private ActivityTelaCarrinhoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_carrinho);
        binding = ActivityTelaCarrinhoBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Intent intentRecebedora = getIntent();
        Bundle dados = intentRecebedora.getExtras();

        if (dados != null){
            String qtdd = dados.getString("chave_qtdd");
            binding.tvcarrinho1.setText(qtdd);
            binding.imageView9.setImageResource(R.drawable.bordauvaroxa);
            binding.imageView20.setImageResource(R.drawable.uvavermelhaa);
        }

        binding.home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}