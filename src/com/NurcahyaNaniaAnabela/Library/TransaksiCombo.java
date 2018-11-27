/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.NurcahyaNaniaAnabela.Library;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author NurcahyaNaniaA
 */
public class TransaksiCombo {
    private HashMap<String , Float> items = new HashMap<>();

    //Konstruktor class TransaksiCombo
    public TransaksiCombo() {
        this.items.put("Gula", new Float(30000));
        this.items.put("Kopi", new Float(10000));
        this.items.put("Susu", new Float(20000));
    }
    
    //method untuk menambahkan nama item
    public ArrayList<String> getNama(){
        ArrayList<String> string = new ArrayList<>();
        for(String item : this.items.keySet()){
            string.add(item);
        }
        return string;
    }
    
    //method untuk menambahkan harga item
    public ArrayList<Float> getHarga(){
        ArrayList<Float> flt = new ArrayList<>();
        for(float item : this.items.values()){
            flt.add(item);
        }
        return flt;
    }
    
    //untuk mengambil nama dan harga item
    public void addItem(String nama, float harga){
        this.items.put(nama, harga);
    }
}
