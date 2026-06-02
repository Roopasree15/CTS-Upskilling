interface Playable {
    void play();
}
class Guitar implements Playable {
    public void play() {
        System.out.println("Guitar is playing");
    }
}
class Piano implements Playable {
    public void play() {
        System.out.println("Piano is playing");
    }
}
public class Interface {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        Piano p = new Piano();
        g.play();
        p.play();
    }
}