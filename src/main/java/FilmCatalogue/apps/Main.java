package FilmCatalogue.apps;

import FilmCatalogue.Model.Film;

public class Main {
    
    public static void main(String[] args) {
        FilmCatalogue catalogue = new FilmCatalogue("Catalogo nuevo");
        catalogue.setOrder(2);
        catalogue.add(new Film("El Rey Leon", 2018, "Disney", "Un leon", "Animacion", 8, "2h"));
        catalogue.add(new Film("Buscando a Nemo", 2020, "Disney", "Un pez", "Animacion", 6, "2h"));
        catalogue.add(new Film("Soul", 2021, "Disney", "Un alma", "Animacion", 10, "2h"));
        System.out.println(catalogue.toString());
    }
}
