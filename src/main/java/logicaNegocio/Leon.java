package logicaNegocio;

public class Leon extends Animal {

    String sonidoLeon;
    String dietaLeon;
    TipoHabitat habitat;

    public Leon() {
        this.habitat = habitat.TERRESTRE;
    }

    
    
    @Override
    public String emitirSonido() {
        return "Rugido";
    }

    @Override
    public String obtenerDieta() {
        return "Carnívoro";
    }

    @Override
    public TipoHabitat getHabitat() {
        return habitat;
    }
}
