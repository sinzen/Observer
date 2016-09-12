import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by yassirhessane on 18/08/16.
 */
abstract class Sujet {

    protected ArrayList< Observateur> observateurs = new ArrayList<>();
    protected int i=0;

    public void ajoute(Observateur observateur){
        this.observateurs.add(i,observateur);
        i++;
    }

    public void retire(Observateur observateur)
    {
        boolean key = observateurs.contains(observateur);
        if (key != false)
        {
            observateurs.remove(observateur);
        }
    }

    public void notifie()
    {
        for (Observateur o: this.observateurs)
        {
            o.actualise();
        }
    }
}
