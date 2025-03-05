package ppo;

public class spisok {
    public static void main(String[] args) {
        gora everest = new gora("эверест","непал",8848 );
        gora elbrus = new gora("эльбрус","россия",5642 );
        gora kilimanjaro = new gora("килиманжаро","танзания",5895 );

        grupe grup1 = new grupe(everest, true);
        grupe grup2 = new grupe(elbrus,true);
        grupe grup3 = new grupe(kilimanjaro,true);

        grup1.gornikis(new gorniki("петя", 26,"новгород"));
        grup1.gornikis(new gorniki("вася", 23,"моксва"));
        grup1.gornikis(new gorniki("саня", 21,"киев"));

        grup2.gornikis(new gorniki("стас", 27,"питер"));
        grup2.gornikis(new gorniki("сергей", 36,"саратов"));
        grup2.gornikis(new gorniki("андрей", 31,"нижнийновгород"));

        grup3.gornikis(new gorniki("ваня", 34,"ставрополь"));
        grup3.gornikis(new gorniki("леша", 25,"одеса"));
        grup3.gornikis(new gorniki("гена", 22,"херсон"));

        grup1.vyvode();
        grup2.vyvode();
        grup3.vyvode();
    }
}
