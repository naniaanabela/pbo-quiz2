/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.NurcahyaNaniaAnabela.Library;

/**
 *
 * @author NurcahyaNaniaA
 */
public class Item {
    private String nama; // variable nama untuk menyimpan nama item
    private float harga; // variable harga untuk menyimpan item harga
    private int jumlah; // jumlah untuk menyimpan item jumlah

    //konstruktor class Item
    public Item() {
    }

    public Item(String nama, float harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
        //getter nama
    public String getNama() {
        return nama;
    }

    //setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //getter harga
    public float getHarga() {
        return harga;
    }

    //setter harga
    public void setHarga(float harga) {
        this.harga = harga;
    }

    //getter jumlah
    public int getJumlah() {
        return jumlah;
    }

    //setter jumlah
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    // menghitung hasil dari perkalian harga item dan jumlah
    public float getTotal(){
        return this.harga * this.jumlah;
    }
    
    public String toString(){
        return this.nama;
    }
}
