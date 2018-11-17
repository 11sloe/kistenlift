
public class Aufzug
{

    private int aktLast;
    private int maxLast = 100;
    private int minLast = 80;

    public Aufzug()
    {

    }

    public void fahren()
    {
        if (aktLast >= minLast && aktLast <= maxLast)
        {
             System.out.println("----------------------------------");
            System.out.println("Der Aufzug fährt mit: " + aktLast);
            System.out.println("----------------------------------");
            aktLast = 0;
        }
    }

    public void hinzufuegen(int masse)
    {
        aktLast = aktLast + masse;
        if (aktLast > maxLast)
        {
            System.out.println("Fehler!");
        }
    }
    public int getAktLast()
    {
        return aktLast;
    }

  
}
