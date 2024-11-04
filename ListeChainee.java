public class ListChainee<E> {
    private Noeud<E> premier;

    public ListChainee() {
        this.premier = null;
    }

    // (i) Ajoute un nouvel élément à la fin de la liste chaînée
    public void add(E valeur) {
        Noeud<E> nouveau = new Noeud<>(valeur);
        if (premier == null) {
            premier = nouveau;
        } else {
            Noeud<E> courant = premier;
            while (courant.getSuivant() != null) {
                courant = courant.getSuivant();
            }
            courant.setSuivant(nouveau);
        }
    }

    // (ii) Retourne le nœud situé à l'indice donné
    public Noeud<E> get(int index) {
        if (index < 0) {
            return null;
        }
        Noeud<E> courant = premier;
        int compteur = 0;
        while (courant != null) {
            if (compteur == index) {
                return courant;
            }
            courant = courant.getSuivant();
            compteur++;
        }
        return null; // Indice hors limites
    }

    // (iii) Insère un nouveau nœud à la position spécifiée
    public void insert(int index, E val) {
        Noeud<E> nouveau = new Noeud<>(val);
        if (index <= 0) {
            nouveau.setSuivant(premier);
            premier = nouveau;
        } else {
            Noeud<E> courant = premier;
            int compteur = 0;
            while (courant != null && compteur < index - 1) {
                courant = courant.getSuivant();
                compteur++;
            }
            if (courant == null) {
                System.err.println("Indice supérieur à la taille de la liste.");
            } else {
                nouveau.setSuivant(courant.getSuivant());
                courant.setSuivant(nouveau);
            }
        }
    }

    // (iv) Retire le nœud situé à la position spécifiée
    public void remove(int index) {
        if (premier == null) {
            System.err.println("La liste est vide.");
            return;
        }
        if (index < 0) {
            System.err.println("L'indice ne peut pas être négatif.");
            return;
        }
        if (index == 0) {
            premier = premier.getSuivant();
        } else {
            Noeud<E> courant = premier;
            int compteur = 0;
            while (courant != null && compteur < index - 1) {
                courant = courant.getSuivant();
                compteur++;
            }
            if (courant == null || courant.getSuivant() == null) {
                System.err.println("Indice hors des limites.");
            } else {
                courant.setSuivant(courant.getSuivant().getSuivant());
            }
        }
    }

    // (v) Retourne une chaîne de caractères représentant les éléments de la liste
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Noeud<E> courant = premier;
        while (courant != null) {
            sb.append(courant.getValeur()).append(" → ");
            courant = courant.getSuivant();
        }
        sb.append("FIN");
        return sb.toString();
    }
}