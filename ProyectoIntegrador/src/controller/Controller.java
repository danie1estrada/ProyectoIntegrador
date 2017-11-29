/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author cencom
 */
public class Controller {
    /* para evaluar si una cadena de texto es un numero*/
    public boolean Validar(String text){
        
        try{
            
            Float.parseFloat(text);
            return true;
            
        }catch(Exception e){
            return false;
        }
        
        
        
    }
    /* para evaluar la longitud de una cadena de String
    en este caso nos basamos en la descripcion*/
    public  boolean ValidarString(String text, int max){
       
        if(text.length() <= max && !text.isEmpty()){
            return true;
        }
        
        return false;
    }
    /*para evaluar la cantidad monetaria de la venta */
    public  boolean ValidarPrecio(float precio){
        
        if(precio < 10000 && precio > 0){
            return true;
        }
        
        return false;
    }

}
