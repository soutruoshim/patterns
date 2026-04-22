package patterns.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        BoardDirector bd1 = BoardDirector.getInstance();
        BoardDirector bd2 = BoardDirector.getInstance();
        BoardDirector bd3 = BoardDirector.getInstance();

        bd1.approve("Annual Budget");

        System.out.println(bd1 == bd2);
        System.out.println(bd2 == bd3);
    }
}

