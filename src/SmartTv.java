public class SmartTv {

  private boolean ligada;
  private int canal;
  private int volume;

  public SmartTv() {
    ligada = false;
    canal = 0;
    volume = 20;
  }

  public void mudarCanal(int novoCanal) {
    if (getLigada()) {
      this.canal = novoCanal;
    } else {
      System.out.println("TV desligada!");
    }

  }

  public void aumentarVolume() {
    if (getLigada()) {
      this.volume++;
    } else {
      System.out.println("TV desligada!");
    }
  }

  public void diminuirVolume() {
    if (getLigada()) {
      this.volume--;
    } else {
      System.out.println("TV desligada!");
    }
  }

  public void ligar() {
    this.ligada = true;
  }

  public void desligar() {
    this.ligada = false;
  }

  public boolean getLigada() {
    return ligada;
  }

  public void setLigada(boolean ligada) {
    this.ligada = ligada;
  }

  public int getCanal() {
    return canal;
  }

  public void setCanal(int canal) {
    this.canal = canal;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  @Override
  public String toString() {
    return "SmartTv \n[ligada=" + ligada + "\ncanal=" + canal + "\nvolume=" + volume + "]";
  }

}