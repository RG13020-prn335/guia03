/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.enterprise.context.Dependent;

/**
 *
 * @author usuario
 */

@LocalBean
@Dependent
public class Utilities implements Serializable{
     
    
    public String getResume(String texto){
    String cadena="";
    if(texto.length()<20){
     cadena=texto;
    }else{
    for(int i=0;i<20;i++){
        cadena=cadena+texto.charAt(i);
    }  
    }
    return cadena;
    }
    
    
    public String capitalizar(String texto){
    char caracteres[]=texto.toCharArray();
    caracteres[0]=Character.toUpperCase(caracteres[0]);
    for(int i =0;i<texto.length()-2;i++){
    if(caracteres[i]==' '||caracteres[1]=='.'||caracteres[i]==','){
    caracteres[i+1]=Character.toUpperCase(caracteres[i+1]);
    }
    }
    return new String(caracteres);
    }
    
    public int contarCoincidencias(String frase,String texto){
    int posicion,cuantas = 0;
    posicion=texto.indexOf(frase);
    while(posicion!=-1){
    cuantas++;
    posicion=texto.indexOf(frase, posicion+1);
    }
    return cuantas;
    }
    
    
}
