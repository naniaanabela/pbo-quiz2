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
public class TransaksiTabel {
    private String[] kolom; //Variable Array bertipe string untuk menyimpan kolom nama
    
    //Konstruktor
    public TransaksiTabel() {
        this.kolom = new String[]{
            "Nama" , "Harga", "Jumlah"
        };
    }
    
    //getter kolomNama

    public String[] getKolomNama() {
        return this.kolom;
    }
}
