package workshop1.decorator;

public class OldReputation implements Reputation {

  @Override
  public void buildReputation(Long sellerId) {
    System.out.println(String.format("Reputacion calculada para el seller: %s", sellerId));
  }
}
