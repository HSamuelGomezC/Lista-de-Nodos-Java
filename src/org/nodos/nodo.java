
package org.nodos;

import java.util.Objects;


public class nodo {
    private int nodo_ID;
    private String nodo_nombre;
    private double nodo_peso;

    public int getNodo_ID() {
        return nodo_ID;
    }

    public void setNodo_ID(int nodo_ID) {
        this.nodo_ID = nodo_ID;
    }

    public String getNodo_nombre() {
        return nodo_nombre;
    }

    public void setNodo_nombre(String nodo_nombre) {
        this.nodo_nombre = nodo_nombre;
    }

    public double getNodo_peso() {
        return nodo_peso;
    }

    public void setNodo_peso(double nodo_peso) {
        this.nodo_peso = nodo_peso;
    }
    
   public int hasCode(){
       return Objects.hash(nodo_ID);
   }
   
    @Override
   public boolean equals(Object obj){
       if(this == obj){
           return true;
       }
       if(obj == null){
           return false;
       }
       if(getClass() != obj.getClass()){
           return false;
       }
       
       nodo nodo = (nodo) obj;
       return Objects.equals(nodo_ID, nodo.nodo_ID);
   }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.nodo_ID;
        hash = 31 * hash + Objects.hashCode(this.nodo_nombre);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.nodo_peso) ^ (Double.doubleToLongBits(this.nodo_peso) >>> 32));
        return hash;
    }
}

