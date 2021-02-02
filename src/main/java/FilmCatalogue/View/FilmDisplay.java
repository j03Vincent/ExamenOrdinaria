package FilmCatalogue.View;

import FilmCatalogue.Model.Film;

public interface FilmDisplay {
    void display(Film movie);
    
    Film getFilm();
}
