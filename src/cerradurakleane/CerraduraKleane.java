/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerradurakleane;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yef
 */
public class CerraduraKleane {

    /**
     * @param args the command line arguments
     */
    public List resultados;
    
    public CerraduraKleane() {
        resultados= new ArrayList();
    }
    
    
    public  void potencias(char[] palabra, String actual, int veces) {
        if (veces == 0) {
            resultados.add(actual);
            
        } else {
            for (int i = 0; i < palabra.length; i++) {
                potencias(palabra, actual+palabra[i], veces - 1);
            }
        }
    }

    public List getResultados() {
        return resultados;
    }

    public void setResultados(List resultados) {
        this.resultados = resultados;
    }

   
}
