package com.example.telafrutas;

public class Fruta {

    private int imageFruta;
    private int estrelaUm;
    private int estrelaDois;
    private int estrelaTres;
    private int estrelaQuatro;
    private int estrelaCinza;
    private int bookMark;
    private int send;

    private String nomeFruta;
    private String precoKg;

    public Fruta(int imageFruta, int estrelaUm, int estrelaDois, int estrelaTres, int estrelaQuatro, int estrelaCinza, int bookMark, int send, String nomeFruta, String precoKg) {
        this.imageFruta = imageFruta;
        this.estrelaUm = estrelaUm;
        this.estrelaDois = estrelaDois;
        this.estrelaTres = estrelaTres;
        this.estrelaQuatro = estrelaQuatro;
        this.estrelaCinza = estrelaCinza;
        this.bookMark = bookMark;
        this.send = send;
        this.nomeFruta = nomeFruta;
        this.precoKg = precoKg;

    }


    public int getImageFruta() {
        return imageFruta;
    }

    public void setImageFruta(int imageFruta) {
        this.imageFruta = imageFruta;
    }

    public int getEstrelaUm() {
        return estrelaUm;
    }

    public void setEstrelaUm(int estrelaUm) {
        this.estrelaUm = estrelaUm;
    }

    public int getEstrelaDois() {
        return estrelaDois;
    }

    public void setEstrelaDois(int estrelaDois) {
        this.estrelaDois = estrelaDois;
    }

    public int getEstrelaTres() {
        return estrelaTres;
    }

    public void setEstrelaTres(int estrelaTres) {
        this.estrelaTres = estrelaTres;
    }

    public int getEstrelaQuatro() {
        return estrelaQuatro;
    }

    public void setEstrelaQuatro(int estrelaQuatro) {
        this.estrelaQuatro = estrelaQuatro;
    }

    public int getEstrelaCinza() {
        return estrelaCinza;
    }

    public void setEstrelaCinza(int estrelaCinza) {
        this.estrelaCinza = estrelaCinza;
    }

    public int getBookMark() {
        return bookMark;
    }

    public void setBookMark(int bookMark) {
        this.bookMark = bookMark;
    }

    public int getSend() {
        return send;
    }

    public void setSend(int send) {
        this.send = send;
    }

    public String getPrecoKg() {
        return precoKg;
    }

    public void setPrecoKg(String precoKg) {
        this.precoKg = precoKg;
    }

    public int getNomeFilme() {
        return imageFruta;
    }

    public void setNomeFilme(int nomeFilme) {
        this.imageFruta = nomeFilme;
    }

    public String getNomeFruta() {
        return nomeFruta;
    }

    public void setNomeFruta(String nomeFruta) {
        this.nomeFruta = nomeFruta;
    }

    public String getAno() {
        return precoKg;
    }

    public void setAno(String ano) {
        this.precoKg = ano;
    }
}
