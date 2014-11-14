package PersonaPKG;
/**
 * @author Marina Sauca
 * @version 0.1
 * @since 13.11.2014
 */


public class ControladorPersones {
    private cjtPersona Persones;

    /**
     * Constructora de la clase
     */
    public ControladorPersones(){
        Persones = new cjtPersona();
    }
    /**
     * funcio que permet afegir una persona al conjunt.
     * @param id id de la persona a afegir
     * @param nom nom de la persona a afegir
     */
    public void afegirPersona(int id, String nom){
        Persones.addPersona(id, nom);
    }

    /**
     * Funció que permet eliminar una persona al conjunt.
     * @param id id de la persona a eliminar
     */
    public void eliminarPersona(int id){
        Persones.deletePersona(id);
    }

    /**
     * Consultora d'una persona determinada
     * @param id id de la persona a consultar
     * @return Persona amb l'id indicat
     */
    public Persona consultaPersona(int id){
        return Persones.getPersona(id);
    }

    /**
     * Consultora del numero de persones presents al conjunt.
     * @return numero de persones al conjunt
     */
    public int getNumPersones(){
        return Persones.getNumPersones();
    }

    /**
     * Modificadora de una persona
     * @param id de la persona a modificar
     * @param nom nombre nuevo para la persona
     */
    public void modificarPersona(int id, String nom){
        Persona aux = Persones.getPersona(id);
        aux.setNom(nom);
    }
}
