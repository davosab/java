public class Concorde extends AvionCalatori {
  
  public Concorde(String planeID, int totalEnginePower, int maxPassengers) {
    super(planeID, totalEnginePower, maxPassengers);
  }

  public void goSuperSonic() {
    System.out.println(this.getPlaneID() + " - Supersonic mode activated");
  }

  public void goSubSonic() {
    System.out.println(this.getPlaneID() + " - Supersonic mode deactivated");
  }
}
