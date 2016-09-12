/**
 * Created by yassirhessane on 18/08/16.
 */
public class Vehicule extends Sujet {

    protected String description;
    protected double prix;

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
        this.notifie();
    }

    public double getPrix()
    {
        return this.prix;
    }

    public void setPrix(double prix)
    {
        this.prix = prix;
        this.notifie();
    }

}
