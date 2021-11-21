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
Árbitro: contiene el número a adivinar, el turno y muestra el resultado. 
Se definen los siguientes atributos: el número total de jugadores, el turno
, el número a adivinar y si el juego acabó o no. En el constructor se recibe
el número de jugadores que participan y se inicializan el número a adivinar 
y el turno. Tiene varios métodos: uno que devuelve el turno, otro que indica
si el juego se acabó o no y otro método que comprueba la jugada del jugador 
y averigua a quien le toca a continuación, este método recibirá el identificador
de jugador y el número que ha jugado. En este método se indicará cual es el 
siguiente turno y si el juego ha finalizado porque algún jugador ha acertado 
el número.
*/
public class Arbitro {
    //Declaro el número, turno, número de jugadores y la comprobación para terminar el juego
    private int num, turno, numJugadores;
    private boolean termino = false;

    //Arbitro donde le paso el num de jugadores (constructor)
    public Arbitro(int numJugadores) {
        //Creo el número aleatorio
        this.num = 1+(int)(10*Math.random());
        //Creo el turno en 1
        this.turno = 1;
        this.numJugadores = numJugadores;
        
        //Muestro el mensaje que se indica en el ejercicio con el número
        System.out.println("Número a adivinar : " + num);
        
    }

    //el getTurno
    public int getTurno() {
        return turno;
    }

    //Synchronized de si ha terminado
    public synchronized boolean isAcabo() {
        return termino;
    }

    //Creo la función para verificar al que le paso el id y el número de jugador
    public synchronized void verificar(int idJug, int numJugador){
        //Muestro el mensaje que se indica en cada adivinanza
        System.out.println("Jugador " + idJug + " dice: " + numJugador);
        
        //Incremento el turno
        turno++;
        
        //Cuando el turno es mayor al numero de jugadores, ponemos en 1
        if(turno>numJugadores){
            turno = 1;
        }
        
        //Cuando es acertado el numero el terminado lo cambiamos a true y salimos del programa. En caso contrario, seguirá naturalmente
        if(numJugador == num){
            System.out.println("El jugador " + idJug + " gana, ¡ha adivinado el número!");
            termino = true;
            System.exit(0);
        }else{
            System.out.println("Le toca al jugador " + turno);
        }
    }
}

