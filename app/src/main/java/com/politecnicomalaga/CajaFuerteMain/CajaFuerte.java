/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.CajaFuerteMain;


/**
 *
 * @author mint
 */
public class CajaFuerte {
    //ATRIBUTOS
    private String pass;

    //COMPORTAMIENTOS
    
    //Constructor
    public CajaFuerte(){
        pass = "0000";
    }
    public boolean changePass(String oldPass, String newPass){
        
        if(oldPass.equals(pass)){
            
            if(newPass.length() != 4 || newPass.equals(pass)){  
                System.out.println("La contraseña debe tener 4 caracteres y ser diferente de la actual");
                return false;
            }
            else{
                pass = newPass; //guarda la contraseña introducida como contraseña predeterminada
                return true;
            }  
        }
        else{
            System.out.println("Combinación errónea");
                    
            if(newPass.length() < 4){   
            System.out.println("La combinación introducida tiene menos de 4 caracteres");
            }
            else if(newPass.length() > 4){   
            System.out.println("La combinación introducida tiene más de 4 caracteres");
            }
            return false;
        }
    }
    public boolean open(String newPass){
        
        return newPass.equals(pass); //Si es cierta esta igualdad --> return true; Sino --> return false;
    }
}
