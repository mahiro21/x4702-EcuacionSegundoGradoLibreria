/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public final class UtilesPrimitivos {

    //Constantes de Operación
    public static final int AN_PAR = 0;     // Par
    public static final int AN_INP = 1;     // Inpar
    public static final int AN_POS = 2;    // Positivo
    public static final int AN_NEG = 3;    // Negativo
    
    public static final boolean validarPar(double n) {
        return analizar(n, AN_PAR);
    }
    
    public static final boolean validarPos(double n) {
        return analizar(n, AN_POS);
    }
    

    public static final boolean analizar(double n, int an) {
        boolean testOk = true;

        switch (an) {

            case AN_PAR:
                testOk = n % 2 == 0;
                break;
            case AN_INP:
                testOk = n % 2 != 0;
                break;
            case AN_POS:
                testOk = n >= 0;
                break;
            case AN_NEG:
                testOk = n <= 0;
        }
        return testOk;
    }

}
