package homework_20;

public class FishType extends FishSport{

    // Название рыбы
    private String nameFish;
    // Вес рыбы
    private double fishWeight;

    public FishType(String nameOzera, int glubinaOzera, String snasti, String nameFish, double fishWeight) {
        super(nameOzera, glubinaOzera, snasti);
        this.nameFish = nameFish;
        this.fishWeight = fishWeight;
    }

    public String info() {
        return super.info() + "Название пойманной рыбы : " + nameFish + ", Вес пойманной рыбы : " + fishWeight + " kg";
    }

}


