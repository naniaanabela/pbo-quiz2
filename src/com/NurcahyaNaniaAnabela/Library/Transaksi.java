/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.NurcahyaNaniaAnabela.Library;

import java.util.ArrayList;

/**
 *
 * @author NurcahyaNaniaA
 */
public class Transaksi {
    private final String code; // variabel kode untuk menyimpan code transaksi
    private ArrayList<Item> items = new ArrayList<>(); // variabel items untuk menyimpan list Items
    private float total; // variable total untuk menyimpan total

    //konstruktor pada class transaksi
    public Transaksi(String code, float total) {
        this.code = code;
        this.total = total;
    }

    public void setTotal() {
        float total = 0;
        for(Item item : this.items){
            total += item.getTotal();
        }
        this.total = total;
    }
    
        //Output transaksi
    public String printDetail(){
        setTotal();
        String string = "";
        string += "Kode \t\t: "+ this.code + "\n";
        string += "Daftar Belanja : \n";
        for(Item item : this.items){
            string += "\t"+ item.getNama() + "(x" + item.getJumlah() + ") : " + item.getTotal() + "\n";
        }
        string += "Total\t\t: " + this.total;
        return string;
    }
}
