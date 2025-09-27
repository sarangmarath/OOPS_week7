class Content {
    protected String title;

    public Content(String title) { this.title = title; }

    public void play() { System.out.println("Playing: " + title); }
}

class MovieContent extends Content {
    private double rating;

    public MovieContent(String title, double rating) {
        super(title);
        this.rating = rating;
    }

    public void showSubtitles() { System.out.println("Showing subtitles for " + title); }
}

class TVSeriesContent extends Content {
    private int season;

    public TVSeriesContent(String title, int season) {
        super(title);
        this.season = season;
    }

    public void nextEpisode() { System.out.println("Next episode for " + title + " (Season " + season + ")"); }
}

public class StreamingPlatform {
    public static void main(String[] args) {
        Content c = new MovieContent("Avengers", 8.5);
        c.play();

        if (c instanceof MovieContent) {
            MovieContent m = (MovieContent) c;
            m.showSubtitles();
        }

        c = new TVSeriesContent("Friends", 5);
        c.play();

        if (c instanceof TVSeriesContent) {
            TVSeriesContent t = (TVSeriesContent) c;
            t.nextEpisode();
        }
    }
}
