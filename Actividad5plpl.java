/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad5plpl;

/**
 *
 * @author alvarof
 */
/*
esta clase inicializa al árbitro indicándole el número de jugadores y lanza los hilos de los jugadores, asignando un identificador a cada hilo y enviándoles el objeto árbitro que tienen que compartir.
*/

public class Actividad5plpl {
    public static void main(String[] args) throws InterruptedException {

	//Creo un arbitro al que le paso un número de jugadores (3 en este caso)
        Arbitro a = new Arbitro(3);
        
	//Creo a los 3 jugadores y les paso su id junto con el arbitro
        Jugador j1 = new Jugador(1, a);
        Jugador j2 = new Jugador(2, a);
        Jugador j3 = new Jugador(3, a);
        
        //Inicializo a cada jugador
        j1.start();
        j2.start();
        j3.start();
    }
}

