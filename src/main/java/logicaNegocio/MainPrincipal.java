/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

public class MainPrincipal {

    public static void main(String[] args) {
        Delfin delfin1 = new Delfin();

        Leon leon21 = new Leon();

        Perro perro1 = new Perro();
        
        delfin1.getHabitat();
        delfin1.obtenerDieta();
        delfin1.emitirSonido();
        
        leon21.emitirSonido();
        leon21.obtenerDieta();
        leon21.getHabitat();
        
        
        
        perro1.emitirSonido();
        perro1.getHabitat();
        perro1.obtenerDieta();
    }
}
