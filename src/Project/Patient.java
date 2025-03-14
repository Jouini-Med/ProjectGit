package Project;

import java.util.Objects;

public class Patient {
    private int cin;
    private String nom;
    private String prenom;
    private int numSecuriteSociale;

    // Default constructor
    public Patient() {
    }

    // Parameterized constructor
    public Patient(int cin, String nom, String prenom, int numSecuriteSociale) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numSecuriteSociale = numSecuriteSociale;
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

    public int getNumSecuriteSociale() {
        return numSecuriteSociale;
    }

    public void setNumSecuriteSociale(int numSecuriteSociale) {
        this.numSecuriteSociale = numSecuriteSociale;
    }

    // Override toString() for better readability
    @Override
    public String toString() {
        return "Patient{" +
                "cin=" + cin +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numSecuriteSociale=" + numSecuriteSociale +
                '}';
    }

    // Override equals() for proper equality comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the object is compared with itself
        if (obj == null || getClass() != obj.getClass()) return false; // Check for null and class type

        Patient patient = (Patient) obj; // Cast the object to Patient
        return cin == patient.cin && numSecuriteSociale == patient.numSecuriteSociale; // Compare fields
    }

    // Override hashCode() to maintain the contract with equals()
    @Override
    public int hashCode() {
        return Objects.hash(cin, numSecuriteSociale); // Use Java's utility method for generating hash code
    }
}