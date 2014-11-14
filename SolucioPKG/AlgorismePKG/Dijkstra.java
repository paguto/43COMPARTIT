package SolucioPKG.AlgorismePKG;

/**
 * @author Enric
 */
import GrafPKG.*;
import java.util.ArrayList;
import java.util.Vector;  //para usar Array List i Vector



public class Dijkstra extends Algoritmo{

    //pre: graf vàlid pot ser G residual
    //post: retorna la capacitat del cami i Path[] la id dels vertex que formenen el cami


    public int trobacami(Graf G, int[] Path){

        int[] Capacitats = Path;
        for(int i = 1; i< Path.size(); i++) Capacitats[i] = -1 ;

        int Flux, Cap, Ida, Idv, Idvi, Control, vcont;
        Aresta a = new Aresta();
        Vertex aux = new Vertex();
        aux = G.getIn();

        ArrayList<int> al_aresta_cos = new ArrayList<int>();
        Iterator<int> it = al_aresta_cos.iterator();

        al_aresta_cos.addAll(aux.getArestesDesti());

        while(it.hasNext()){

            Ida = it.next();
            a = G.getAresta(Ida);
            //retorna l'Aresta amb ID = parametre
            Cap =  a.getCapacitat();
            Idv = a.getId_vertex_adjunt();
            Idvi = a.getId_vertex_original();

            Flux = Capacitats[Idvi];

            if (Capacitats[Idv] == -1){

                if (Flux != -1 && Cap >=  Flux)  Capacitats[Idv] = Flux;		//actualitzem el flux maxim d'un vertex en funcio del flux max entran x una aresta Flux!= -1 excepcio per el vertex inicial
                else Capacitats[Idv] = Cap;

                aux = G.getVertex(Idv);
                al_aresta_cos.addAll(aux.getArestesDesti());				//afegim a la llista les arestes del vertex actual no visitat
            }

            else{
                if (Cap >=  Flux && Capacitats[Idv]  < Flux )  Capacitats[Idv] = Flux;
                else if(Cap <  Flux && Capacitats[Idv]  < Cap)  Capacitats[Idv] = Cap;
            }
        }

        Control = 0;

        aux = G.getIn();
        vcont = aux.getId_Vertex();

        aux = G.getFi();
        Cap = Capacitats[aux.getId_Vertex()];

        if (Cap > 0){									//si cap < 0 no definim el Path

            al_aresta_cos.clear();
            al_aresta_cos.addAll(aux.getArestesOrigen());
            it = al_aresta_cos.iterator();

            while (vcont != aux.getId_Vertex()){					//mentre l'ultim vertex visitat no sigui el d'inici do while

                while ( Control == 0){
                    //mentre no aguem trobat el millor cami (vertex desti millor) seguim miran les arestes del Vertex actual
                    a = G.getAresta(it.next());

                    if ( a.getCapacitat() >= Cap && Capacitat[a.getId_vertex_original()] >= Cap){
                        Idv = a.getId_vertex_original();
                        Path[a.getId_vertex_adjunt()] = Idv ;		//valor en Path[ID vertex actual] = ID del Vertex seguent sen aquest el millor cami
                        Control = 1;
                    }

                }

                al_aresta_cos.clear();
                al_aresta_cos.addAll(getArestesOrigen());			//agafem el conjunt d'arestes del vertex seguent definit anteriorment
                it = al_aresta_cos.iterator();

                aux = G.getVertex(Idv);
                a = G.getAresta(it.next());
                Control = 0;
            }
        }
        return Cap;									//retornem la Cap del camí escollit
    }

}

/*

Funcions i classes que usu:
Graf:
	G.getIn();
	G.getFi();
	G.getVertex(ID); 			 // Retornen un objecta classe Vertex amb id = ID
	G.getAresta(ID) 			 //Retorna un objecta classe Aresta amb id = ID


Vertex:
	aux.getId_Vertex(); 			// Retorna un Int que es la ID del vertex aux
	aux.getArestesDesti() 			// Retorna una ArrayList[Int] o Vector[Int] de ID's de Arestes on el Vertex Origen es aux i tenen un Vertex desti valid
	aux.getArestesOrigen()			// Retorna una ArrayList[Int] o Vector[Int] de ID's de Arestes on el Vertex Origen es valid i el seu Vertex desti es aux


Aresta:
	a.getCapacitat();   			// ret cap de a
	a.getId_vertex_original(); 		//Retorna un Int que es la ID del vertex Origen de l'aresta
	a.getId_vertex_adjunt();  		//Retorna un Int que es la ID del vertex Desti de l'aresta

Classe Vector:

	v.size()

Classe ArrayList:

	Al.addAll(colection) 			//afegeix la coleccio de dades colection (poden ser llistes, vectors etc..)  al final de la llista Al

	Iterator<>
		hasNext() 			 //iterador i 2 metodes per recorrer i controlar la llista
		next()


totes les ID's > 0 suposicio	*/