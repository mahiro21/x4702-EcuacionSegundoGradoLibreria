/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public final class UtilesEntrada {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    
    // Constantes
    public static final String MSG_USR = "Introduce un número ..:";
    public static final String MSG_OUT = "Número introducido ...: ";
    public static final String MSG_ERR = "ERROR: Entrada incorrecta";
    
    public static double obtener = 0;

    public static final double obtener(String msgUsr, String msgErr) {
        
         double obtener = 0;
        //Proceso entrada
        boolean errorOk = true;
        do {
            try {
                System.out.print(msgUsr);
                obtener = SCN.nextDouble();
                errorOk = false;
                
            } catch (Exception e) {
                //Mensaje error
                System.out.print(MSG_ERR);

                //Separador
                System.out.println("---");
            }
            finally{
            SCN.nextLine();
            }
        } while (errorOk);
        return obtener;
    }
    
    public static final int leerEntero(String msgUsr, String msgErr) {
        
        obtener = 0;
        //Proceso entrada
        boolean errorOk = true;
        do {
            try {
                System.out.print(msgUsr);
                obtener = SCN.nextDouble();
                errorOk = false;
                
            } catch (Exception e) {
                //Mensaje error
                System.out.println(MSG_ERR);

                //Separador
                System.out.println("---");
            }
            finally{
            SCN.nextLine();
            }
        } while (errorOk);
        return (int)obtener;
    }
}
