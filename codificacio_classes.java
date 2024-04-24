class Media {
    private String nom;
    private String autor;
    private int duradaSegons;

    public String getNom() {
        return this.nom;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getDurada() {
        return this.duradaSegons;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public void setDurada(int d) { 
        this.duradaSegons = d;
    }
}

class Main {
    public static final void main(String[] args) {
        Media poner_nombre = new Media();
        Media poner_autor = new Media();
        Media poner_durada = new Media();

        poner_nombre.setNom("izan");
        poner_autor.setAutor("Jr.Albert");
        poner_durada.setDurada(12);

        String nombre_correcte = poner_nombre.getNom();
        String autor_correcte = poner_autor.getAutor();
        int durada_correcte = poner_durada.getDurada();
        
        System.out.println(nombre_correcte);
        System.out.println(autor_correcte);
        System.out.println(durada_correcte);
    }
}
