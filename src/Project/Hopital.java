package Project;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hopital {

    public Map<Medecin, ListPatients> medecinPatiens;

    public Hopital() {
        medecinPatiens = new HashMap();
    }
    public void ajouterMedecin(Medecin m) {
        medecinPatiens.put(m, new ListPatients());

    }
    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatiens.containsKey(m)) {
            medecinPatiens.get(m).ajouterPatient(p);

        } else {
            ajouterMedecin(m);
            medecinPatiens.get(m).ajouterPatient(p);
        }
    }
    public void afficherMap() {
        medecinPatiens.keySet().stream().forEach(m -> {
            System.out.println(m);
            medecinPatiens.get(m).afficherPatients();
        });

    }
    public void afficherMedecinPatiens() {
        medecinPatiens.keySet().stream().filter(e -> e.getNom().equals("mohamed")).forEach(o -> {
            System.out.println(o);
            medecinPatiens.get(o).afficherPatients();
        });

    }
    public List<String> RetournerNomPatients() {
        return medecinPatiens.values().stream().map(l -> l.getListP())
                .findFirst().get().stream().filter(p -> p.getNumSecuriteSociale() == 1)
                .map(p -> p.getNom()).collect(Collectors.toList());
    }

}
