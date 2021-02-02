package FilmCatalogue.apps;

import FilmCatalogue.Model.Film;
import java.util.*;

public class FilmCatalogue {
    
    private Set<Film> movies;
    private final String catalogue;
    
    public FilmCatalogue(String nombre) {
        this.catalogue = nombre;
        movies = new TreeSet<Film>();
    }
    
    public boolean add(Film pelicula){
        if(movies.contains(pelicula)) return false;
        
        movies.add(pelicula);
        return true;
    }
    
    public void setOrder(int ord){
        Set<Film> moviesCopy;
        if (ord == 0 || ord == 1 || ord == 2){
            switch(ord){
                case 0:
                    moviesCopy = new TreeSet<Film>(new Ord0());
                    break;
                case 1:
                    moviesCopy = new TreeSet<Film>(new Ord1());
                    break;
                case 2:
                    moviesCopy = new TreeSet<Film>(new Ord2());
                    break;
                default:
                    moviesCopy = new TreeSet<Film>(new Ord2());
            }
            
            Iterator iterador = movies.iterator();
            while (iterador.hasNext()){
                moviesCopy.add((Film) iterador.next());
            }
            movies = moviesCopy;
        }
    }
    
    @Override
    public String toString(){
        String res = catalogue + ":";
        int i = 1;
        for (Film m : movies){
            res += "\n" + i + ")" + m;
            i++;
        }
        return res;
    }
    
}

    class Ord0 implements Comparator<Film> {
    
    @Override
    public int compare(Film a, Film b){
        if (a.equals(b)) return 0;
        
        if (a.getGenre().compareTo(b.getGenre()) != 0){
            return (a.getGenre().compareTo(b.getGenre()));
        }
        
        return 0;
    }   
}

    class Ord1 implements Comparator<Film> {
    
    @Override
    public int compare(Film a, Film b){
        if (a.equals(b)) return 0;
        
        if (a.getYear() - b.getYear() != 0) {
            return a.getYear() - b.getYear();
        }
        
        return 0;
    }
}

    class Ord2 implements Comparator<Film> {
    
    @Override
    public int compare(Film a, Film b){
        if (a.equals(b)) return 0;
        
        if (a.getRating() > b.getRating()) {
            return 1;
        }
        
        return -1;
    }
}