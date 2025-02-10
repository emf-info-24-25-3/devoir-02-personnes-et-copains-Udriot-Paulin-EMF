package models;

import java.util.ArrayList;
import java.util.List;

public class Personne {
    private final String prenom;
    private final String nom;
    private static final int MAX_COPAINS = 10;
    private final List<Personne> copains;

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom.toUpperCase();
        this.copains = new ArrayList<>();
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public boolean ajouterCopain(Personne copain) {
        if (copains.size() < MAX_COPAINS && !copains.contains(copain)) {
            copains.add(copain);
            return true;
        }
        return false;
    }

    public boolean supprimerCopain(Personne copain) {
        return copains.remove(copain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(prenom).append(" ").append(nom);
        sb.append(" et ses copains (");
        for (int i = 0; i < copains.size(); i++) {
            sb.append(copains.get(i).prenom).append(" ").append(copains.get(i).nom);
            if (i < copains.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
    
        //
        //              )        (                 ) (           (         (
        //           ( /(   *   ))\ )        (  ( /( )\ )        )\ )  (   )\ )
        //     (   ( )\())` )  /(()/((       )\ )\()|()/(  (    (()/(  )\ (()/(
        //     )\  )((_)\  ( )(_))(_))\    (((_|(_)\ /(_)) )\    /(_)|((_) /(_))
        //    ((_)((_)((_)(_(_()|_))((_)   )\___ ((_|_))_ ((_)  (_)) )\___(_))
        //    __   _____ _____ ___ ___    ___ ___  ___  ___   ___ ___ ___   _
        //    \ \ / / _ \_   _| _ \ __|  / __/ _ \|   \| __| |_ _/ __|_ _| | |
        //     \ V / (_) || | |   / _|  | (_| (_) | |) | _|   | | (__ | |  |_|
        //      \_/ \___/ |_| |_|_\___|  \___\___/|___/|___| |___\___|___| (_)
        //


