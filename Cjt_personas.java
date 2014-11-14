
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
    
     public int getNumPersonas() {
        return cjt_pers.size();
    }
    
     public HashMap<Integer, Persona> getcjtPersona() {
        return cjt_pers;
        
    }

    //Modificadores
    
   
    public void setId(int id) {
        this.id = id;
    }
     
     

}


