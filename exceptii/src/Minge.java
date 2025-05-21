public class Minge {
  private int x;
  private int y;

  public Minge(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void suteaza(int genX, int genY) throws Out, Gol, Corner {

    x = genX;
    y = genY;

    if (y == 0 || y == 50) {
      throw new Out();
    }
    if (x == 0 || x == 100) {
      if (y >= 20 && y <= 30) throw new Gol();
      else throw new Corner();
    }

  }
  
}
