package workshop1.decorator;

public class NewReputation extends ReputationDecorator {

  public NewReputation(Reputation reputation) {
    super(reputation);
  }

  @Override
  public void buildReputation(Long sellerId) {
    super.buildReputation(sellerId);
    System.out.println("Color calculado -> naranja, salud -> mala");
  }

}
