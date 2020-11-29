/*
 * Copyright 2020 Jose Ramon Albiach Vaño - joseramon.albiach.alum@iescamp.es.
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
package org.japo.java.libraries;

/**
 *
 * @author Jose Ramon Albiach Vaño - joseramon.albiach.alum@iescamp.es
 */
public class UtilesPrimitivos {
    
    public static final double calcularMedia(double n1, double n2) {
        double media = (n1 + n2) / 2;
        return media;
    }
    
    public static final int analizarRango(double num, double min, double max) {
        int rango;
        
        if (num > max) {
            rango = 2;
            
        } else if (num < min) {
            rango = 1;
            
        } else {
            rango = 0;
        }
        
        return rango;
    }
    
    public static final boolean validar(int num, char ctr, String letras) {       
        return calcular(num, letras) == ctr;
    }
    
    public static final char calcular(int num, String letras) {
        int letraDni = num % 23;
        return (letras.charAt(letraDni));
    }
}
