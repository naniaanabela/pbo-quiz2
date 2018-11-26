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
       
}
