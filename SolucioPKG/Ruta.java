package SolucioPKG;

/**
 *Clase que representa el objeto ruta
 * @author Leonardo Andrade
 */
import GrafPKG.Aresta;

import java.util.ArrayList;


public class Ruta {
    /* Atributos de la clase */
    private int id;
    private ArrayList<Aresta>ListaArestas = new ArrayList<Aresta>();
    /*contructor por defecto*/
    public Ruta() {

    }
    /*Funcion obtener id
    *@return id Identificador de clase
    */
    public int getId() {
        return id;
    }
    /*Funcion definir id
    *@param id Identificador de clase
    */
    public void setId(int id) {
        this.id = id;
    }
    /*Funcion obtener estructura de arestas
    *@return id Identificador de clase
    */
    public ArrayList<Aresta> getListaArestas() {
        return ListaArestas;
    }
    /*Funcion obtener estructura de arestas
    *@return id Identificador de clase
    */
    public void setListaArestas(ArrayList<Aresta> ListaArestas) {
        this.ListaArestas = ListaArestas;
    }

}
