package ppai.Patrones.Iterator;

import ppai.Entidades.Localidades;

public class IteratorLocalidades implements Iterator {
    
    private Localidades[] localidades;
    private int posicion;

    public IteratorLocalidades(Object[] elementos) {
        this.localidades = (Localidades[]) elementos;
    }

    @Override
    public void primero() {
        posicion = 0;
    }

    @Override
    public boolean haTerminado() {
        return !(posicion < localidades.length && localidades[posicion] != null);
    }

    @Override
    public Object actual() {
        return localidades[posicion];
    }

    @Override
    public void siguiente() {
        posicion++;
    }

}
