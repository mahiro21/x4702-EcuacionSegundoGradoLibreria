/* 
 * Copyright 2019 Mario Merlos Abella - mario.merlos.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import org.japo.java.libraries.UtilesEntrada;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public final class App {

    public static final String USR_MSG = "Parametro %c ...:";
    public static final String ERR_MSG = "¡Entrada incorrecta!%n";

    public final void launchApp() {
        System.out.println("SOLUCIONES EQ 2º GRADO");
        System.out.println("======================");
        System.out.println("---");
        System.out.print("ax\u00b2 + bx + c = 0");
        System.out.printf("%n---%n");
        //
        double a = UtilesEntrada.obtener(
                String.format(USR_MSG, 'a'), ERR_MSG);
        // ---
        double b = UtilesEntrada.obtener(
                String.format(USR_MSG, 'b'), ERR_MSG);
        // ---
        double c = UtilesEntrada.obtener(
                String.format(USR_MSG, 'c'), ERR_MSG);
        System.out.println("---");
        System.out.println(calcular(a, b , c));
    }

    public static final double calcular(double x, double y, double z) {
        double x1 = 0;
        double x2 = 0;

        double r = Math.sqrt(y * y - 4 * x * z);
        if (r == Double.NaN) {
            System.out.printf("Solución imaginaria");
        } else {
            x1 = (-y + r) / 2 * x;
            x2 = (-y - r) / 2 * x;
            System.out.printf("Solución 1 ....: %.2f%n", x1);
            System.out.printf("Solución 1 ....: %.2f%n", x2);
        }
    return r;
    }
}
