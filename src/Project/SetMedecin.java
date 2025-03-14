import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetMedecin {

    private Set<Medecin> setM;

    public SetMedecin() {
        setM = new HashSet<>();
    }

    public void ajouterMedecin(Medecin m) {
        setM.add(m);
    }

    // Using Stream API to check if a Medecin with the given CIN exists
    public boolean rechercherMedecin(int cin) {
        return setM.stream().anyMatch(medecin -> medecin.getCin() == cin);
    }

    // Using Stream API to print all Medecins
    public void afficherMedecins() {
        setM.forEach(System.out::println);
    }

    // Using Stream API to count the number of Medecins
    public long nombreMedecins() {
        return setM.size(); // Directly using size() is more efficient than stream().count()
    }

    // Using Stream API to sort Medecins by CIN and return a TreeSet
    public TreeSet<Medecin> trierMedecins() {
        return setM.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>((x, y) -> x.getCin() - y.getCin())));
    }
}