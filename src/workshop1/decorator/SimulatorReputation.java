package workshop1.decorator;

public class SimulatorReputation extends ReputationDecorator {

  public SimulatorReputation(Reputation reputation) {
    super(reputation);
  }

  @Override
  public void buildReputation(Long sellerId) {
    super.buildReputation(sellerId);
    System.out.println("En la nueva versión tu color será: rojo, salud -> mal");
  }

}
