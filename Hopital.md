Classe : Hopital
Cette classe représente un hôpital qui gère une association entre des médecins (Medecin) et leurs listes de patients (ListPatients). Elle utilise une HashMap pour stocker ces relations et fournit plusieurs méthodes pour manipuler et afficher ces données.

Attributs :
medecinPatiens : Map<Medecin, ListPatients>
Une HashMap qui associe chaque médecin (clé) à une liste de patients (valeur).
Le type Medecin représente un médecin, et ListPatients est une classe personnalisée contenant une liste de patients.
Constructeur :
public Hopital()
Initialise la HashMap medecinPatiens vide.
Méthodes :
public void ajouterMedecin(Medecin m)
Ajoute un médecin m à la HashMap avec une nouvelle instance vide de ListPatients comme valeur associée.
Utilisation : Permet d'enregistrer un médecin sans patients initialement.
public void ajouterPatient(Medecin m, Patient p)
Ajoute un patient p à la liste des patients du médecin m.
Comportement :
Si le médecin m existe déjà dans la HashMap, le patient est ajouté à sa liste via la méthode ajouterPatient de ListPatients.
Sinon, le médecin est d'abord ajouté avec ajouterMedecin(m), puis le patient est ajouté à sa liste.
Utilisation : Associe un patient à un médecin, créant automatiquement une entrée pour le médecin si nécessaire.
public void afficherMap()
Affiche tous les médecins et leurs patients associés.
Fonctionnement :
Utilise un flux (stream) sur l'ensemble des clés (keySet) de la HashMap.
Pour chaque médecin m, affiche ses informations (via toString implicite) et appelle afficherPatients() sur sa liste de patients associée.
Utilisation : Visualisation complète des données de l'hôpital.
public void afficherMedecinPatiens()
Affiche les informations des médecins nommés "mohamed" et leurs patients.
Fonctionnement :
Filtre les médecins dans la HashMap pour ne garder que ceux dont le nom est "mohamed" (via getNom().equals("mohamed")).
Pour chaque médecin filtré, affiche ses informations et la liste de ses patients avec afficherPatients().
Utilisation : Recherche et affichage ciblé d'un médecin spécifique par son nom.
public List<String> RetournerNomPatients()
Retourne une liste des noms des patients ayant un numéro de sécurité sociale égal à 1, à partir de la première liste de patients trouvée dans la HashMap.
Fonctionnement :
Accède aux valeurs (values) de la HashMap (les ListPatients).
Utilise un flux pour récupérer la première liste (findFirst().get()).
Filtre les patients de cette liste ayant getNumSecuriteSociale() == 1.
Extrait les noms des patients filtrés avec getNom() et les collecte dans une List<String>.
Utilisation : Recherche spécifique de noms de patients basée sur un critère (ici, numéro de sécurité sociale).
Dépendances implicites :
Classe Medecin :
Doit avoir une méthode getNom() qui retourne une String (le nom du médecin).
Doit avoir une représentation textuelle (via toString) pour l'affichage.
Classe ListPatients :
Doit avoir une méthode ajouterPatient(Patient p) pour ajouter un patient.
Doit avoir une méthode afficherPatients() pour afficher la liste des patients.
Doit avoir une méthode getListP() qui retourne une collection (ex. List<Patient>) des patients.
Classe Patient :
Doit avoir une méthode getNumSecuriteSociale() qui retourne un entier (probablement le numéro de sécurité sociale).
Doit avoir une méthode getNom() qui retourne une String (le nom du patient).