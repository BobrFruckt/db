package ppo;

public class grupe {
    private boolean plotnostgrupe;
    private gorniki[] gornikis = new gorniki[3];
    private int gornikcountry;
    private gorniki gorniki;

    public grupe(boolean plotnostgrupe, int gorniki) {
        this.plotnostgrupe = plotnostgrupe;
        this.gornikis = new gorniki[gorniki];
        this.gornikcountry = 0;
    }

    public grupe(gora kilimanjaro, boolean plotnostgrupe) {
    }

    public boolean setplotnostgrupe() {
        return plotnostgrupe;
    }

    public void setPlotnost(boolean plotnostgrupe) {
        this.plotnostgrupe = plotnostgrupe;
    }

    public void gornikis(gorniki gorniki) {
        gornikis[gornikcountry++] = gorniki;
    }

    public void vyvode() {
        for (int i = 0; i < this.gornikis.length; i++) {
            System.out.print(gornikis[i].getName() + " " );
            System.out.print(gornikis[i].getAge() + " " );
            System.out.print(gornikis[i].getAddres() + ".\n");
        }
    }
}
