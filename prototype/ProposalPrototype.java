package patterns.prototype;

public class ProposalPrototype implements IPrototype {
    private String title;
    private String customer;
    private double budget;

    public ProposalPrototype(String title, String customer, double budget) {
        this.title = title;
        this.customer = customer;
        this.budget = budget;
    }

    public ProposalPrototype(ProposalPrototype other) {
        this.title = other.title;
        this.customer = other.customer;
        this.budget = other.budget;
    }

    @Override
    public IPrototype Clone() {
        return new ProposalPrototype(this);
    }

    @Override
    public String toString() {
        return "ProposalPrototype{title='" + title + "', customer='" + customer + "', budget=" + budget + "}";
    }
}

