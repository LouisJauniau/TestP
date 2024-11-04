public class Main {
    public static void main(String[] args) {
        // Test avec des entiers
        ListChainee<Integer> listeEntiers = new ListChainee<>();
        listeEntiers.add(1);
        listeEntiers.add(2);
        listeEntiers.add(3);
        System.out.println("Liste d'entiers: " + listeEntiers);

        // Test de la méthode get
        Noeud<Integer> noeudEntier = listeEntiers.get(1);
        if (noeudEntier != null) {
            System.out.println("Noeud à l'indice 1: " + noeudEntier.getValeur());
        } else {
            System.out.println("Noeud à l'indice 1: null");
        }

        // Test de la méthode insert
        listeEntiers.insert(1, 4); // Insère 4 à l'indice 1
        System.out.println("Après insertion à l'indice 1: " + listeEntiers);

        // Test de la méthode remove
        listeEntiers.remove(2); // Supprime l'élément à l'indice 2
        System.out.println("Après suppression à l'indice 2: " + listeEntiers);

        // Test avec des chaînes de caractères
        ListChainee<String> listeChaines = new ListChainee<>();
        listeChaines.add("premier");
        listeChaines.add("deuxième");
        listeChaines.add("troisième");
        System.out.println("Liste de chaînes: " + listeChaines);

        // Test de la méthode get
        Noeud<String> noeudChaine = listeChaines.get(0);
        if (noeudChaine != null) {
            System.out.println("Noeud à l'indice 0: " + noeudChaine.getValeur());
        } else {
            System.out.println("Noeud à l'indice 0: null");
        }

        // Test de la méthode insert
        listeChaines.insert(0, "nouveau premier");
        System.out.println("Après insertion à l'indice 0: " + listeChaines);

        /* Exception in thread "main" java.lang.NullPointerException: Cannot invoke "up.mi.paa.td06.Noeud.getE()" because "courant" is null
	at up.mi.paa.td06.ListChainee.add(ListChainee.java:17)
	at up.mi.paa.td06.Main.main(Main.java:7)*/
        // Test de la méthode remove
        listeChaines.remove(3); // Supprime l'élément à l'indice 3
        System.out.println("Après suppression à l'indice 3: " + listeChaines);
    }
}
