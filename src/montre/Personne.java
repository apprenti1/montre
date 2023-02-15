package montre;

public class Personne {


    private String prenom;
    private String nom;
    private Montre montre;


    public Personne(String prenom, String nom, Montre montre){
        this.prenom = prenom;
        this.nom = nom;
        this.montre = montre;
    }
    public String demandeHeure(Personne personne){
        return this.prenom+" : "+personne.getPrenom()+" ? Quel heure est-il ? "+personne.getPrenom()+" : "+personne.lireHeure();
    }

    public String lireHeure(){return this.montre.getHeure()+" : "+this.montre.getMinute();}
    public Montre retireMontre(){
        Montre montre = this.montre;
        this.montre = null;
        return montre;
    }

    public String getPrenom() {return prenom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public Montre getMontre() {return montre;}
    public void attacheMontre(Montre montre) {this.montre = montre;}
}
