
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
    public Map<Integer, Persona> cjt_doc = new HashMap<Integer, Persona>();
    private int id;

//Constructoras

public Cjt_personas() {
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
    
     public int getNumDocs() {
        return cjt_doc.size();
    }

    //Modificadores
    public void setId(int id) {
        this.id = id;
    }
     
     

}

