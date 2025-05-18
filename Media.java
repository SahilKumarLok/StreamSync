public abstract class Media {
    protected String id, title, genre;
    protected double rating;

    public Media(String id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = 0.0;
    }

    public abstract void displayInfo();

    public void updateRating(double newRating) {
        this.rating = (this.rating + newRating) / 2;
    }

    public String getGenre() { return genre; }
    public String getTitle() { return title; }
    public double getRating() { return rating; }
}

// ======= Movie.java =======
class Movie extends Media {
    private int runtime;
    private String director;

    public Movie(String id, String title, String genre, int runtime, String director) {
        super(id, title, genre);
        this.runtime = runtime;
        this.director = director;
    }

    public void displayInfo() {
        System.out.println("Movie: " + title + ", Director: " + director);
    }

    public String getDirector() { return director; }
}

// ======= TVSeries.java =======
class TVSeries extends Media {
    private int episodes, seasons;

    public TVSeries(String id, String title, String genre, int episodes, int seasons) {
        super(id, title, genre);
        this.episodes = episodes;
        this.seasons = seasons;
    }

    public void displayInfo() {
        System.out.println("TV Series: " + title + ", Seasons: " + seasons);
    }

    public int getEpisodes() { return episodes; }
    public int getSeasons() { return seasons; }
}
