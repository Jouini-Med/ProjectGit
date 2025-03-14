
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mynet
 */
public class SetMedecin {

    private Set<Medecin>setM;

    public SetMedecin() {
        setM=new HashSet();
   
    }

    public void ajouterMedecin(Medecin m) {
        setM.add(m);

    }

    /* Avec l’api Stream */
    public boolean rechercherMedecin(int cin) {
        return setM.stream().anyMatch(e->e.getCin()==cin);

    }

    /* Avec l’api Stream */
    public void afficherMedecins() {
        setM.stream().forEach(e->System.out.println(e));
    }

    /* Avec l’api Stream */
    public long nombreMedecins() {
        
        return setM.stream().count();
        
    }

    /* Avec l’api Stream */
    public TreeSet<Medecin> trierMedecins() {
       return setM.stream().collect(Collectors.toCollection(()->new TreeSet<Medecin>((x,y)->x.getCin()-y.getCin())));
     
    }
}

