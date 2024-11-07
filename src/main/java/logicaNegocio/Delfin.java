package logicaNegocio;

public class Delfin extends Animal {

    String sonido;
    String dieta;
    TipoHabitat habitat;

    public Delfin() {
        this.habitat = TipoHabitat.ACUATICO;
    }

    @Override
    public String emitirSonido() {
        return "Chirrido";
    }

    @Override
    public String obtenerDieta() {
        return "Pescado";
    }
    // TODO: Aquí va tu código


    @Override
    public TipoHabitat getHabitat() {
        return habitat;
    }

    
    
}
