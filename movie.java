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
