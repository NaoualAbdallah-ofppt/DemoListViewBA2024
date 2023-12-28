package aa.bb.demolistview;

import java.util.ArrayList;

public class Logiciel {
    public static ArrayList<Logiciel> lstLogiciels= new ArrayList<>();
    private int logo;

    public Logiciel(int logo, String nom, String editeur) {
        this.logo = logo;
        this.nom = nom;
        this.editeur = editeur;
    }

    @Override
    public String toString() {
        return "Logiciel{" +
                "logo=" + logo +
                ", nom='" + nom + '\'' +
                ", editeur='" + editeur + '\'' +
                '}';
    }

    private String nom;

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    private String editeur;


}
