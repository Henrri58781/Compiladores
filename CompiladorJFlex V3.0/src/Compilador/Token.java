/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compilador;

/**
 *
 * @author Henrr
 */
public class Token {
   private Tipos tipo;
   private String valor;
    
   public Tipos getTipo() {
        return tipo;
    }
 
    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }
 
    public String getValor() {
        return valor;
    }
 
    public void setValor(String valor) {
        this.valor = valor;
    }

    // Diccionario    
    enum Tipos {
        NUMERO ("[0-9]+"),
        INICIO ("INCIO"),
        FIN ("FIN"),
        OPERADORARTIMETICO ("[*+\\/-]"),
        OPERADORRELACIONAL("[<><<>=]=|[<>·{}\\[\\]\\(\\)\\\\.,;]"),
        PALABRARESEVADA("program|if|else|for|while|case|switch|default|break|private|public|class|void|catch|try");       
        public final String patron;
        Tipos(String s) {
            this.patron = s;
        }
    }   
}

