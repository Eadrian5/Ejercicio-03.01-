/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bandera;

/**
 *
 * @author Adrian
 */
public class Bandera {

    public static void main(String[] args) {
        
        var v1 = new Ventana_1("FlowLayout");
        v1.setVisible(true);

        var v2 = new Ventana_2("GridLayout");
        v2.setVisible(true);
        
        var v3 = new Ventana_3("BorderLayout");
        v3.setVisible(true);
        
        var v4 = new Ventana_4("Border_Bandera");
        v4.setVisible(true);
        
    }
}
