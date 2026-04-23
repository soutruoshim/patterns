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

    public static void main(String[] args) {
        BoardDirector bd1 = BoardDirector.getInstance();
        BoardDirector bd2 = BoardDirector.getInstance();
        BoardDirector bd3 = BoardDirector.getInstance();

        bd1.approve("Annual Budget");

        System.out.println(bd1 == bd2);
        System.out.println(bd2 == bd3);
    }
}
