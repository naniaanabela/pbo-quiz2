/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.NurcahyaNaniaAnabela.Library;

import java.util.HashMap;

/**
 *
 * @author NurcahyaNaniaA
 */
public class TranComboModel {
    private HashMap<String, Float> items = new HashMap<>();
    
    public TranComboModel() {
        this.items.put("Gula", new Float(30000));
        this.items.put("Kopi", new Float(10000));
        this.items.put("Susu", new Float(20000));
    }
}
