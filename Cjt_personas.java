
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

public class Cjt_personas {
    private static int idcount = 0;
    public Map<Integer, Persona> cjt_pers;
    private int id;

//Constructoras

public Cjt_personas() {
    cjt_pers = new HashMap<Integer, Persona>();
     id = idcount;
    idcount = idcount + 1;

}

    public Cjt_personas(int id) {
        this.id = id;
    }

    //Consultoras

    public int getId() {
        return id;
    }
    
     public int getNumPersonas() {
        return cjt_pers.size();
    }

    //Modificadores
    public void setId(int id) {
        this.id = id;
    }
     
     

}


