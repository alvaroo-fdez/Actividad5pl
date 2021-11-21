/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad5plpl;

/**
 *
 * @author alvarof
 */
/*
Jugador: extiende Thread. Su constructor recibe un identificador de jugador y el árbitro,
todos los hilos comparten el árbitro. El jugador dentro del método run() comprobará si es
su turno, en ese caso generará un número aleatorio entre 1 y 10 y creará la jugada usando
el método correspondiente del árbitro. Este proceso se repetirá hasta que el juego se acabe.
*/

public class Jugador extends Thread {
        //Declaro el id de cada jugador y un arbitro
        private int id_jugador;
        private Arbitro arbitro;

        //Para recibir el jugador y el arbitro
        public Jugador(int id_jugador, Arbitro arbitro) {
            this.id_jugador = id_jugador;
            this.arbitro = arbitro;
        }
        
        //La funcion propia de run
        public void run(){
            //Mientras el juego no acaba
            while(!arbitro.isAcabo()){
                //Cuando le toque su turno, creo un número aleatorio
                if(arbitro.getTurno() == id_jugador){
                    int num = 1+(int)(10*Math.random());
                    //Con la función de verificar de arbitro, determinamos si ha acertado
                    arbitro.verificar(id_jugador, num);
                }
            }
        }        
}
