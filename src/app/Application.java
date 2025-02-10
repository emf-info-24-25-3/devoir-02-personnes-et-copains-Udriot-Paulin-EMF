package app;

import models.Personne;

public class Application {
    public static void main(String[] args) {
        Personne p1 = new Personne("Alex", "Terrieur");
        Personne p2 = new Personne("John", "D'Oeuf");
        Personne p3 = new Personne("Mac", "Haroni");
        Personne p4 = new Personne("Alain", "Terrieur");

        p1.ajouterCopain(p2);
        p1.ajouterCopain(p3);
        p1.ajouterCopain(p4);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
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


