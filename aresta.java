/**
 * Classe Aresta
 * @author arnau.santamaria
 */
public class Aresta {
    private int cost;
    private int capacitat;
    private int id_vertex_original;
    private int id_vertex_adjunt;
	private int flux;

    /* pre: cert
     * post: El resultat és una aresta buida.
     */
    public Aresta() {
    }
    
    /* pre: cost i capacitat son vàlids.
     * post: El resultat és una Aresta amb els paràmetres implícits.
     */
    public Aresta(int cost, int capacitat, int id_vertex_inici, int id_vertex_final) {
        this.cost = cost;
        this.capacitat = capacitat;
    }

    /*
     * Pre:  El vertex és vàlid.
     * Post: Retorna el ID del vertex original( del que surt la aresta)
     */
    public int getId_vertex_original() {
        return id_vertex_original;
    }

    /*
     * Pre:  El vertex és vàlid.
     * Post: id_vertex_original pren el valor del paràmetre implícit.
     */
    public void setId_vertex_original(int id_vertex_original) {
        this.id_vertex_original = id_vertex_original;
    }

    /*
     * Pre:  El vertex és vàlid.
     * Post: Retorna el ID del vertex adjunt( del que surt la aresta)
     */
    public int getId_vertex_adjunt() {
        return id_vertex_adjunt;
    }
        
    /*
     * Pre:  El vertex és vàlid.
     * Post: vertex_adjunt pren el valor del paràmetre implícit.
    */
    public void setId_vertex_adjunt(int id_vertex_adjunt) {
        this.id_vertex_adjunt = id_vertex_adjunt;
    }
    
    /* pre: Aresta amb cost vàlid.
     * post: retorna el cost de la Aresta.
     */
    public int getCost() {
        return cost;
    }
    
    /* pre: La Aresta és vàlida.
     * post: cost pren el valor del paràmetre implícit.
     */
    public void setCost(int cost) {
        this.cost = cost;
    }
    
    /* pre: Aresta amb capacitat vàlida.
     * post: retorna la capacitat de la Aresta.
     */
    public int getCapacitat() {
        return capacitat;
    }
    
    /* La Aresta és vàlida.
     * capacitat pren el valor del paràmetre implícit.
     */
    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }  
	
	 /* pre: Aresta amb flux valid
     * post: retorna el flux de la Aresta.
     */
    public int getFlux() {
        return flux;
    }
    
    /* La Aresta és vàlida.
     * flux pren el valor del paràmetre implícit.
     */
    public void setFlux(int flux) {
        this.flux = flux;
    }  
}
