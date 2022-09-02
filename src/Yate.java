import javax.swing.tree.DefaultMutableTreeNode;

public class Yate extends Embarcacion implements Comparable{
    private byte cantidadDeCamarotes;


    public Yate(Capitan capitan, double precio, double valorAdicional, int anioDeFabricacion, double eslora, byte cantidadDeCamarotes) {
        super(capitan, precio, valorAdicional, anioDeFabricacion, eslora);
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }


    public byte getCantidadDeCamarotes() {
        return cantidadDeCamarotes;
    }

    public void setCantidadDeCamarotes(byte cantidadDeCamarotes) {
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }

    @Override
    public int compareTo(Object object) {

        Yate otroYate = (Yate)object;

        if (otroYate.cantidadDeCamarotes < this.cantidadDeCamarotes) {
            return 1;
        } else if (otroYate.cantidadDeCamarotes > this.cantidadDeCamarotes) {
            return -1;
            } else {
            return 0;
        }
    }
}
