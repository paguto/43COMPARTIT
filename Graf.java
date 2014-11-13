/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;
/**
 *
 * @author kilian.peiro
 */
public class Graf {
    private ArrayList<Vertex> vertexArray;
    private ArrayList<Aresta> arestaArray;
    private Vertex vertexInici;
    private Vertex vertexFi;

    /* Pre: cert
     * Post: El resultat es un graf buit
     */
    public Graf(){
        vertexArray = new ArrayList<Vertex>();
        arestaArray = new ArrayList<Aresta>();   
    }
    
    /* Pre:
     * Post: Et diu si el vertex implícit existeix al graf
     */
    public boolean existseixVertex(Vertex v){
        for(int i = 0; i < vertexArray.size(); ++i){
            if(vertexArray.get(i).getId() == v.getId()) return true;
        }
        return false;
    }
    
    /* Pre:
     * Post: Et diu si la aresta implícita existeix al graf
     */
    public boolean existseixAresta(Aresta a){
        for(int i = 0; i < arestaArray.size(); ++i){
            if(arestaArray.get(i).getId_vertex_adjunt()== a.getId_vertex_adjunt()
                    && arestaArray.get(i).getId_vertex_original() == a.getId_vertex_original()) return true;
        }
        return false;
    }
    
    /* Pre: 
     * Post: Afegeix el vertex implícit al graf, si aquest vertex ja hi era al graf, no fa res
     */
    public void afegirVertex(Vertex v){
        if(!existsVertex(v)) {
            vertexArray.add(v);
        }
    }
    
    /* Pre:
     * Post: Elimina el vertex del graf
     */
    public void eliminarVertex(Vertex v){
        for(int i = 0; i < vertexArray.size(); ++i){
            if(vertexArray.get(i).getId() == v.getId()){
                for(int j = 0; j < arestaArray.size(); ++j){
                    if(arestaArray.get(j).getId_vertex_adjunt()== vertexArray.get(i).getId()
                        || arestaArray.get(j).getId_vertex_original() == vertexArray.get(i).getId()){
                        arestaArray.remove(j);
                        --j;
                    }
                }
                vertexArray.remove(i);
            }
        }      
    }    

    /* Pre:
     * Post: Afegeis la aresta al graf, si la aresta ja existia no fa res
     */
    public void afegirAresta(Aresta a){
        if(!existsAresta(a)){
            if(getVertex(a.getId_vertex_adjunt()) != null &&
                    getVertex(a.getId_vertex_original()) != null)
                arestaArray.add(a);
        }
    }    

    /* Pre:
     * Post: Elimina l'aresta del graf
     */
    public void eliminarAresta(Aresta a){
        for(int i = 0; i < arestaArray.size(); ++i){
            if(arestaArray.get(i).getId_vertex_adjunt()== a.getId_vertex_adjunt()
                    && arestaArray.get(i).getId_vertex_original() == a.getId_vertex_original())
                arestaArray.remove(i);
        }
    }
    
    /* Pre:
     * Post: Retorna el vertex inici del graf
     */
    public Vertex getInici(){
        return vertexInici;
    }

    /* Pre:
     * Post: El vertex implícit ara és el vertex inici del graf
     */
    public void setInici(Vertex v){
        vertexInici = v;
    }    
    
    /* Pre: 
     * Post: Retorna el vertex fi del graf
     */
    public Vertex getFi(){
        return vertexFi;
    }
    
    /* Pre:
     * Post: El vertex implícit ara és el vertex fi del graf
     */
    public void setFi(Vertex v){
        vertexFi = v;
    }
    
    /* Pre:
     * post: Retorna el numero de vertexs del graf
     */
    public int getDimensio(){
        return vertexArray.size();
    }
    
    /* Pre: 
     * Post: Si hi ha algun vertex amb la id implicita al graf, ho retorna, si no, retorna null
     */
    public Vertex getVertex(int id){
        for(int i = 0; i < vertexArray.size(); ++i){
            if(vertexArray.get(i).getId() == id) return vertexArray.get(i);
        }
        return null;
    }
    
    /* Pre:
     * Post: Si els vetrtexs implicits son correctes, retorna l'aresta, si no, retorna null
     */
    public Aresta getAresta(Vertex u, Vertex v) {
         for(int i = 0; i < arestaArray.size(); ++i){
             if(
                arestaArray.get(i).getId_vertex_original() == u.getId() 
                     && arestaArray.get(i).getId_vertex_adjunt() == v.getId()
                 )
             return arestaArray.get(i);
         }
         return null;
    }
    
    /* Pre:
     * Post: Si el vertex existeix, retorna els vertexs adjacents, si no, retorna una llista buida
     */
    public ArrayList<Vertex> getAdjacents(Vertex v){
        ArrayList<Vertex> adjacents = new ArrayList<Vertex>();
        for(int i = 0; i<arestaArray.size(); ++i){
            if(arestaArray.get(i).getId_vertex_original() == v.getId())
                adjacents.add(getVertex(arestaArray.get(i).getId_vertex_adjunt()));
            if(arestaArray.get(i).getId_vertex_adjunt() == v.getId())
                adjacents.add(getVertex(arestaArray.get(i).getId_vertex_original()));
        }
        return adjacents;
    }
}



Classe Graf
Atributs
- vertexInici : Vertex [1]
- vertexFi : Vertex [1]
Associacions
- aresta : Aresta [*]
- vertex : Vertex [*]
- controladorGraf : controladorGraf [0..1]


Classe controladorGraf
Operacions
ARESTA:

+ Integer getCostAresta (iD : Integer)
+ Integer getCapAresta (iD : Integer)
+ Integer getFluxeAresta (iD : Integer)
+ Void modificarFluxeAresta (iD : Integer)
+ Void modificarCostAresta (iD : Integer)
+ Void modificarCapAresta (iD : Integer)

GRAF:
+ Void modificarIniciGraf (iD : Integer)
+ Void modificarFiGraf (iD : Integer)
+ Vertex getInici ()
+ Vertex getFi ()
+ Void afegirVertex (iD : Integer)
+ Void afegirAresta (Inici : Integer, Fi : Integer, Cost : Integer, Flux : Integer)
+ Void eliminarVertex (iD : Integer)
+ Void eliminarAresta (iD : Integer)
Associacions
- graf : Graf [0..1]
