class Art {
    protected String title;
    public Art(String title) { this.title = title; }
    public void display() { System.out.println("Displaying art: " + title); }
}

class Painting extends Art {
    public Painting(String title) { super(title); }
    public void brushTechnique() { System.out.println(title + " uses oil brush techniques."); }
}

class Sculpture extends Art {
    public Sculpture(String title) { super(title); }
    public void material() { System.out.println(title + " made of marble."); }
}

public class DigitalArtGallery {
    public static void main(String[] args) {
        Art art = new Painting("Starry Night");
        art.display();

        if (art instanceof Painting) {
            Painting p = (Painting) art;
            p.brushTechnique();
        }

        art = new Sculpture("David");
        art.display();

        if (art instanceof Sculpture) {
            Sculpture s = (Sculpture) art;
            s.material();
        }
    }
}
