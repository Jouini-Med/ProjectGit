package Project;

public class Patient {
    private int cin;
    private String nom;
    private String prenom;
    private int numSecuriteSociale;

    public Patient() {
    }

    public Patient(int cin, String nom, String prenom, int numSecuriteSociale) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numSecuriteSociale = numSecuriteSociale;
    }
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

    public int getNumSecuriteSociale() {
        return numSecuriteSociale;
    }

    public void setNumSecuriteSociale(int numSecuriteSociale) {
        this.numSecuriteSociale = numSecuriteSociale;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String toString() {
        return "CIN="+cin +"Nom="+nom + "Prenom="+prenom;




    }
    public boolean equals(Object obj) {
        if (obj==null)
            return false;
        if(obj==this)
            return true;
        if(obj instanceof Patient)
        {
            Patient p =(Patient) obj ;
            if(p.getNumSecuriteSociale()==numSecuriteSociale && p.getCin()==cin)
                return true;

        }
        return false;

    }

}
