
public class Stapel 
{
    
  private Listenelement erster;
  
  public Stapel()
  {
      erster = new Abschluss();
    }
    
    public void einfuegen(Kiste k)
    {
        Knoten kn = new Knoten(k);
        kn.setNaechster(erster);
        erster = kn;
    }
    
    public void ausgeben()
    {
        erster.ausgeben();
    }
    
    public boolean istLeer()
    {
        return erster.istLeer();
    }
    
    public Kiste entnehmen()
    {
        Kiste k = erster.getInhalt();
        erster = erster.getNaechster();
        return k;
    }
}
