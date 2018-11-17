
public class Knoten extends Listenelement
{
    private Kiste inhalt;
    private Listenelement naechster;

    public Knoten(Kiste inhalt_)
    {
        inhalt = inhalt_;
    }

    public void setNaechster(Listenelement elem)
    {
        naechster = elem;
    }

    public void ausgeben()
    {
        inhalt.ausgeben();
        naechster.ausgeben();
    }

    public boolean istLeer()
    {
        return false;
    }

    public  Kiste getInhalt()
    {
        return inhalt;
    }

    public Listenelement getNaechster()
    {
        return naechster;
    }
}
