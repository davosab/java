public class Mig extends AvionLupta {
  
  public Mig(String planeID, int totalEnginePower) {
    super(planeID, totalEnginePower);
  }

  public void highSpeedGeometry() {
    System.out.println(this.getPlaneID() + " - High speed geometry selected");
  }

  public void normalGeometry() {
    System.out.println(this.getPlaneID() + " - Normal geometry selected");
  }
}
