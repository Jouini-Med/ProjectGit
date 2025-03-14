package Project;

import java.util.Objects;

public class Medecin {
    private int cin;
    private String nom;
    private String prenom;
    private int numOrdre;

    // Parameterized constructor
    public Medecin(int cin, String nom, String prenom, int numOrdre) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numOrdre = numOrdre;
    }

    // Getters and Setters
    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumOrdre() {
        return numOrdre;
    }

    public void setNumOrdre(int numOrdre) {
        this.numOrdre = numOrdre;
    }

    // Override toString() for better readability
    @Override
    public String toString() {
        return "Medecin{" +
                "cin=" + cin +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numOrdre=" + numOrdre +
                '}';
    }

    // Override equals() for proper equality comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the object is compared with itself
        if (obj == null || getClass() != obj.getClass()) return false; // Check for null and class type

        Medecin medecin = (Medecin) obj; // Cast the object to Medecin
        return cin == medecin.cin; // Compare based on CIN
    }

    // Override hashCode() to maintain the contract with equals()
    @Override
    public int hashCode() {
        return Objects.hash(cin); // Use Java's utility method for generating hash code
    }
}