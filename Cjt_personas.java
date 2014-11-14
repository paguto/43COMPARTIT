package PersonaPKG;
import java.util.HashMap;
import java.util.Map;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehdi.taleb
 */

public class cjtPersona {
    private static int idcount = 0;
    private Map<Integer, Persona> cjt_pers;
    private int id;

//Constructoras

public cjtPersona() {
    cjt_pers = new HashMap<Integer, Persona>();
     id = idcount;
    idcount = idcount + 1;

}

    public cjtPersona(int id) {
        this.id = id;
    }

    //Consultoras

    public int getId() {
        return id;
    }
    
     public int getNumPersones() {
        return cjt_pers.size();
    }
    
     public HashMap<Integer, Persona> getcjtPersona() {
        return cjt_pers;
    }
    
      public Persona getPersona (int id){
          if(cjt_pers.containsKey(id)) {
             return cjt_pers.get(id);
          }
          else return null;
      }

    //Modificadores
    
   
    public void setId(int id) {
        this.id = id;
    }
    
     public void addPersona(int id, String nom){
         cjt_pers.put(id,nom);
     }
     
     public void deletePersona(int id){
         cjt_pers.remove(id);
     }
    
     
     

}


