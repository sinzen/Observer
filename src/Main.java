public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        Vehicule vehicule = new Vehicule();
        vehicule.setDescription("Véhicule bon marché");
        vehicule.setPrix(5000.0);
        VueVehicule vueVehicule = new VueVehicule("Observateur1",vehicule);
        vueVehicule.redessine();
        vehicule.setPrix(4500.0);
        VueVehicule vueVehicule1 = new VueVehicule("Observateur2",vehicule);
        vehicule.setPrix(5500.0);
        vehicule.retire(vueVehicule1);
        vehicule.setPrix(6500.0);
    }
}
