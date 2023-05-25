package workshop1.decorator;

public class Main {
  public static void main(String[] args) {

    System.out.println("Vieja repu: ");
    Reputation oldReputation = new OldReputation();
    oldReputation.buildReputation(12345L);
    System.out.println(" ");

    System.out.println("Nueva repu: ");
    Reputation newReputation = new NewReputation(new OldReputation());
    newReputation.buildReputation(12345L);
    System.out.println(" ");

    System.out.println("Version simulador: ");
    Reputation simulatorReputation = new SimulatorReputation(new NewReputation(new OldReputation()));
    simulatorReputation.buildReputation(12345L);
    System.out.println(" ");

    System.out.println("Vieja repu + simulador: ");
    Reputation oldSimulator = new SimulatorReputation(new OldReputation());
    oldSimulator.buildReputation(12345L);

  }
}
