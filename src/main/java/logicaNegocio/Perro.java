package logicaNegocio;

public class Perro extends Animal implements Domestico {

    String sonidoPerro;
    String dietaPerro;

    TipoHabitat habitat;

    public Perro( ) {
       this.habitat = habitat.TERRESTRE;
    }

    
   

    @Override
    public String emitirSonido() {
        return "Ladrido";
    }

    @Override
    public String obtenerDieta() {
        return "Omnívoro";
    }

    @Override
    public TipoHabitat getHabitat() {
        return habitat;
    }

    // TODO: Aquí va tu código
    @Override
    public String interactuarConHumano() {
        return "El perro mueve la cola y ladra de felicidad";
    }
}
