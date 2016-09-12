/**
 * Created by yassirhessane on 18/08/16.
 */
public class VueVehicule implements Observateur {

    protected Vehicule vehicule;
    protected String texte;
    protected String nomVue;

    public VueVehicule(String nomVue,Vehicule vehicule) {
        this.vehicule = vehicule;
        this.nomVue = nomVue;
        vehicule.ajoute(this);
        //completer
        this.metAJourTexte();
    }



    @Override
    public void actualise()
    {
        this.metAJourTexte();
        this.redessine();

    }

    public void redessine()
    {
        System.out.println(this.texte);
    }

    public void metAJourTexte()
    {
        this.texte = this.nomVue + " : "+this.vehicule.getDescription() + " : "+this.vehicule.getPrix();
    }
}
