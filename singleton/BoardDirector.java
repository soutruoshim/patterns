package patterns.singleton;

public class BoardDirector {
    private static BoardDirector obj;

    private BoardDirector() {
        System.out.println("BoardDirector object created.");
    }

    public static BoardDirector getInstance() {
        if (obj == null) {
            obj = new BoardDirector();
        }
        return obj;
    }

    public void approve(String decision) {
        System.out.println("Approved: " + decision);
    }
}
