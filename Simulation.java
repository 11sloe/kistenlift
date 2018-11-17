
public class Simulation
{
    
    

    private Stapel links;
    private Stapel rechts;
    private Aufzug aufzug;

    public Simulation()
    {
        links = new Stapel();
        rechts = new Stapel();
        aufzug = new Aufzug();
    }

    public void setup()
    {
        System.out.println("---------- Start ----------");
        links.einfuegen(new Kiste(15));
        links.einfuegen(new Kiste(30));
        links.einfuegen(new Kiste(25));
        links.einfuegen(new Kiste(10));
        links.einfuegen(new Kiste(30));
        links.einfuegen(new Kiste(45));
        links.einfuegen(new Kiste(23));
        links.einfuegen(new Kiste(50));
        links.einfuegen(new Kiste(55));
        links.einfuegen(new Kiste(34));
        links.einfuegen(new Kiste(20));
        links.einfuegen(new Kiste(40));
        System.out.println("Stapel links: " );
        links.ausgeben();

    }

    public void start()
    {
        System.out.println("-----von links nach rechts ----- ");
        abarbeiten(links,rechts);
        
        System.out.println("Stapel links: ");
        links.ausgeben();
        System.out.println("Stapel rechts: ");
        rechts.ausgeben();
        System.out.println("Aufzug: " + aufzug.getAktLast());
        System.out.println("----------------");
        
        
        System.out.println("----- von rechts nach links ----- ");
        System.out.println("Der rechte Stapel wird abgearbeitet");
        abarbeiten(rechts,links);
        System.out.println("Stapel links: ");
        links.ausgeben();
        System.out.println("Stapel rechts: ");
        rechts.ausgeben();
        System.out.println("nach dem zweiten Arbeitsschritt:");
        System.out.println("Aufzug: " + aufzug.getAktLast());
    }

    public void abarbeiten(Stapel s1, Stapel s2)
    {
        while (!s1.istLeer())
        {
            Kiste k = s1.entnehmen();
            if (k.getMasse()+aufzug.getAktLast()<=100)
            {
                aufzug.hinzufuegen(k.getMasse());
                System.out.println("Kiste "+ k.getMasse() + " in den Aufzug eingeladen");
                aufzug.fahren();
            }
            else
            {
                s2.einfuegen(k);
                System.out.println("Kiste "+ k.getMasse() + " passt nicht in den Aufzug");
            }
        }
    }
}

