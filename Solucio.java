
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo.guizan
 */
public abstract class solucio {
    
    int[] Path;
    protected abstract int trobacami(ControladorGraf G, int[] Path);
        
    public ArrayList<Ruta> cjt_rutas;    
    
   public solucio() { 
       cjt_rutas = new ArrayList<Ruta>();
    }
    public ArrayList<Ruta> getCjt_rutas() {
        return cjt_rutas;
    }
    public void setCjt_rutas(ArrayList<Ruta> cjt_rutas) {
        this.cjt_rutas = cjt_rutas;
    }
    public void Afegir_ruta(Ruta r){
        cjt_rutas.add(r);
    }
    
    
    public void genera_ruta(){
        Vertex ruta_v[] = null; 
        for(int i=0;i<Path.length;++i){
            Vertex v = new Vertex(Path[i]);
            ruta_v[i]=v;
        }
        
        Ruta r= new Ruta();
        
        for(int i = 0 ; i < ruta_v.length -1; i++ ){
            ArrayList<Integer>arestDestins = ruta_v[i].getDestins();
            ArrayList<Integer>arestOrigens = ruta_v[i+1].getOrigens();
              for(int j=0; j < ruta_v[i].getDestins().size();j++){
                  for(int k=0; k < ruta_v[i+1].getOrigens().size();k++){
                    if(arestDestins.get(j)==arestOrigens.get(k)) r.afegirAresta(arestDestins.get(j));
               }
            }
        }
        Afegir_ruta(r);
    }
}
