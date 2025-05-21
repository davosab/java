public class Joc {

  private String echipa1;
  private String echipa2;

  private int goluri1 = 0;
  private int goluri2 = 0;

  private int outuri = 0;
  private int cornere = 0;

  public Joc(String echipa1, String echipa2) {
    this.echipa1 = echipa1;
    this.echipa2 = echipa2;
  }

  public void simuleaza() {
    Minge minge = new Minge(50, 25);
    CoordinateGenerator cg = new CoordinateGenerator();

    for (int i = 0; i < 1000; i++) {
      try {
        minge.suteaza(cg.generateX(), cg.generateY());
      } catch (Out o) {
        outuri++;
        minge = new Minge(minge.getX(), minge.getY());
        System.out.println(o);
      } catch (Gol g) {
        if (minge.getX() == 0)
          goluri1++;
        else
          goluri2++;
        System.out.println(g);
        minge = new Minge(50, 25);
      } catch (Corner c) {
        int cornerX, cornerY;
        cornere++;

        if (minge.getX() == 0)
          cornerX = 0;
        else
          cornerX = 100;

        if (minge.getY() > 30)
          cornerY = 50;
        else
          cornerY = 0;

        System.out.println(c);
        minge = new Minge(cornerX, cornerY);
      } finally {
        System.out.println(echipa1 + " - " + echipa2 + " : Mingea se afla la coordonatele (" + minge.getX() + ", "
            + minge.getY() + ")");
      }
    }

  }

  public String toString() {
    return echipa1 + " vs " + echipa2 + ", \nscor: " + goluri1 + " - " + goluri2 + "\nouturi: " + outuri + "\ncornere: "
        + cornere;
  }

}
