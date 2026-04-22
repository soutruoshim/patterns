package patterns.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        IPrototype p1 = new ProposalPrototype("New System", "School", 5000);
        IPrototype p2 = p1.Clone();

        IPrototype r1 = new ReportPrototype("Annual Report", 100, "Dara");
        IPrototype r2 = r1.Clone();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == r2);
    }
}
