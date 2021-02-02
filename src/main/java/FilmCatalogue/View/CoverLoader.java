package FilmCatalogue.View;

import FilmCatalogue.Model.FilmCover;
import java.util.List;

public interface CoverLoader {
    List<FilmCover> load();
    
}
