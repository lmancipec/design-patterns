package workshop1.decorator;

public abstract class ReputationDecorator implements Reputation {

  private Reputation reputation;

  ReputationDecorator(Reputation reputation) {
    this.reputation = reputation;
  }

  @Override
  public void buildReputation(Long sellerId) {
    reputation.buildReputation(sellerId);
  }
}
