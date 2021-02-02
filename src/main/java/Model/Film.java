package Model;

public class Film {
    private String titulo, director, actor, genero, duracion;
    private int estreno, valoracion;
    
    public Film(String titulo, int estreno, String director, String actor, 
            String genero, int valoracion, String duracion){
        this.titulo = titulo;
        this.estreno = estreno;
        this.director = director;
        this.actor = actor;
        this.genero = genero;
        this.duracion = duracion;
        this.valoracion = valoracion;
        
    }
    
    public String getTitle(){
        return titulo;
    }
    
    public int getYear(){
        return estreno;
    }
    
    public String getDirector(){
        return director;
    }

    public String getActor() {
        return actor;
    }

    public String getGenre() {
        return genero;
    }

    public String getDuration() {
        return duracion;
    }

    public int getRating() {
        return valoracion;
    }
    
    @Override
    public String toString(){
        return this.titulo + " " + this.estreno + " " + this.director + " "
                + this.actor + " " + this.genero + " " + this.valoracion + " " + this.duracion;
    }
    
}
