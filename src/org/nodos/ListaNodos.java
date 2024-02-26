
package org.nodos;

import java.util.ArrayList;


public class ListaNodos {
    private ArrayList<nodo> lista;
    
    public ListaNodos(ArrayList<nodo> lista){
        this.lista = lista;
    }
    
    public void AgregarNodo(nodo nodo){
        this.lista.add(nodo);
    }
    
    public ArrayList<nodo> getActualizar(){
        return this.lista;
    }
    
    public nodo BuscarNodo(nodo nodo){
        nodo aux = null;
        
        for(nodo n: lista){
            if(n.getNodo_ID()==nodo.getNodo_ID()){
                aux = new nodo();
                aux.setNodo_ID(n.getNodo_ID());
                aux.setNodo_nombre(n.getNodo_nombre());
                aux.setNodo_peso(n.getNodo_peso());
            }  
        }
        return aux;
    }
    
    public int nuevoNodo(){
        return 0;
    }
    
    public void eliminarNodo(nodo nodo){ 
        lista.remove(nodo);
    }
    
    public void editarNodo(nodo nodo){
        
    }
    
}
