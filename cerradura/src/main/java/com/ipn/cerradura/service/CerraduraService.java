package com.ipn.cerradura.service;

import java.util.ArrayList;
import java.util.List;

public class CerraduraService {

    // Método para generar cadenas binarias de longitud n
    private List<String> generarCadenasBinarias(int n) {
        List<String> cadenas = new ArrayList<>();
        int max = (int) Math.pow(2, n);  // 2^n posibles combinaciones

        for (int i = 0; i < max; i++) {
            String binario = Integer.toBinaryString(i);
            while (binario.length() < n) {
                binario = "0" + binario;  // Rellenar con ceros a la izquierda
            }
            cadenas.add(binario);
        }

        return cadenas;
    }

    // Cerradura de Kleene (incluye cadena vacía)
    public List<String> cerraduraKleene(int n) {
        List<String> resultado = new ArrayList<>();
        resultado.add("");  // Agregar la cadena vacía
        resultado.addAll(generarCadenasBinarias(n));
        return resultado;
    }

    // Cerradura positiva (excluye cadena vacía)
    public List<String> cerraduraPositiva(int n) {
        return generarCadenasBinarias(n);
    }
}
