/**
 * @author Marina Sauca
 * @version 0.1
 * @since 13.11.2014
 */
public class Persona {
    private int iD;
    private String nom;

    /**
     * Creadora de la clase Persona
     * @param iD id de la persona
     * @param nom nom de la persona
     */
    public Persona(int iD, String nom){
        this.iD = iD;
        this.nom = nom;
    }

    /**
     * consultora del id
     * @return iD de la persona
     */
    public int getiD(){
        return iD;
    }

    /**
     * consultora del nom
     * @return nom de la persona
     */
    public String getNom(){
        return nom;
    }

    /**
     * modificadora del id
     * @param iD id nou
     */
    public void setiD(int iD){
        this.iD = iD;
    }

    /**
     * modificadora del nom
     * @param nom nom nou
     */
    public void setNom(String nom){
        this.nom = nom;
    }
}
