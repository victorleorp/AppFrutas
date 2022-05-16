package com.example.telafrutas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.telafrutas.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Fruta> listaFrutas = new ArrayList<>();
    private int cont = 1;

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TelaCarrinho.class);
                startActivity(intent);
            }
        });

        binding.textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TelaCarrinho.class);
                startActivity(intent);
            }
        });

        binding.imagecachouva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TelaDois.class);
                startActivity(intent);
            }
        });

        binding.ivbookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cont == 1 ){
                    binding.ivbookmark.setImageResource(R.drawable.bookmarkvermelho);
                    cont = 0;
                }else{
                    binding.ivbookmark.setImageResource(R.drawable.bookmark);
                    cont = 1;
                }

            }
        });

        binding.imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cont ==1 ){
                    binding.imageView32.setImageResource(R.drawable.bookmarkvermelho);
                    cont = 0;
                }else{
                    binding.imageView32.setImageResource(R.drawable.bookmark);
                    cont = 1;
                }

            }
        });

        recyclerView = binding.recyclerView;

        //listagem de filmes
        this.criarFruta();

        //Configurar o adapter
        Adapter adapter = new Adapter(listaFrutas);


        //layout manager
        //configurar o recycleView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    public void criarFruta(){
        Fruta uva = new Fruta(R.drawable.uvaa, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelacinza, R.drawable.bookmark, R.drawable.send, "Sweet Grape", "R$20/kg");
        listaFrutas.add(uva);

        Fruta lemon = new Fruta(R.drawable.laranjaa, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelacinza, R.drawable.bookmark, R.drawable.send, "Orange Fruit", "R$08/kg");
        listaFrutas.add(lemon);

        Fruta laranja = new Fruta(R.drawable.lemon, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelacinza, R.drawable.bookmark, R.drawable.send, "Lemon Fruit", "R$05/kg");
        listaFrutas.add(laranja);

        Fruta abacaxi = new Fruta(R.drawable.abacaxi, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelacinza, R.drawable.bookmark, R.drawable.send, "Pineapple Fruit", "R$80/kg");
        listaFrutas.add(abacaxi);

    }
    }
