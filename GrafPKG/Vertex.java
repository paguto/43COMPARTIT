package GrafPKG;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Marina Sauca
 * @version 0.1
 * @since 13.11.2014
 */
public class Vertex {
    private int ID;
    private ArrayList <Integer> arestOrigen;
    private ArrayList <Integer> arestDesti;
    private ArrayList <Integer> arestInvert;

    /**
     * Creadora de la clase
     * @param ID identificador de la clase
     */
    Vertex (int ID){
        this.ID = ID;
        arestOrigen = new ArrayList <Integer>();
        arestDesti = new ArrayList <Integer>();
        arestInvert = new ArrayList <Integer>();
    }

    /**
     * Consultora del ID
     * @return ID del vertex
     */
    public int getId(){
        return ID;
    }

    /**
     * Consultora de l'array d'arestes que tenen aquest vertex com a origen
     * @return ArrayList que conté la llista d'id de les arestes
     */
    public ArrayList<Integer> getOrigens(){
        return arestOrigen;
    }
    /**
     * Consultora de l'array d'arestes que tenen aquest vertex com a desti
     * @return ArrayList que conté la llista d'id de les arestes
     */
    public ArrayList<Integer> getDestins(){
        return arestDesti;
    }
    /**
     * Consultora de l'array d'arestes invertides relacionades amb aquest vertex
     * @return ArrayList que conté la llista d'id de les arestes
     */
    public ArrayList<Integer> getInvertides(){
        return arestInvert;
    }

    /**
     * Fucnió encarregada d'afegir una aresta a la llista d'origens
     * @param idOrigen id de l'aresta a afegir
     */
    public void addOrigen(int idOrigen){
        arestOrigen.add(idOrigen);
    }
    /**
     * Fucnió encarregada d'afegir una aresta a la llista de destins
     * @param idDesti id de l'aresta a afegir
     */
    public void addDesti(int idDesti){
        arestDesti.add(idDesti);
    }
    /**
     * Fucnió encarregada d'afegir una aresta a la llista d'arestes invertides
     * @param idInvert id de l'aresta a afegir
     */
    public void addInvertida(int idInvert){
        arestInvert.add(idInvert);
    }

    /**
     * eliminadora d'una aresta de la llista d'origens
     * @param idOrigen id de l'aresta a eliminar
     * @return true si existia i pertant s'ha eliminat, false si no existia.
     */
    public boolean removeOrigen(int idOrigen){
        boolean deleted = false;
        if (!arestOrigen.isEmpty()) {
            Iterator<Integer> it = arestOrigen.iterator();
            while (it.hasNext())
                if (idOrigen == it.next()) {
                    it.remove();
                    deleted = true;
                }
        }
        return deleted;
    }
    /**
     * eliminadora d'una aresta de la llista de destins
     * @param idDesti id de l'aresta a eliminar
     * @return true si existia i pertant s'ha eliminat, false si no existia.
     */
    public boolean removeDesti(int idDesti){
        boolean deleted = false;
        if (!arestDesti.isEmpty()) {
            Iterator<Integer> it = arestDesti.iterator();
            while (it.hasNext())
                if (idDesti == it.next()) {
                    it.remove();
                    deleted = true;
                }
        }
        return deleted;
    }
    /**
     * eliminadora d'una aresta de la llista d'invertides
     * @param idInvert id de l'aresta a eliminar
     * @return true si existia i pertant s'ha eliminat, false si no existia.
     */
    public boolean removeInvert(int idInvert){
        boolean deleted = false;
        if (!arestInvert.isEmpty()) {
            Iterator<Integer> it = arestInvert.iterator();
            while (it.hasNext())
                if (idInvert == it.next()) {
                    it.remove();
                    deleted = true;
                }
        }
        return deleted;
    }

}
