package logica;

/**
 *
 * @author LAURA C
 */
public class LogicaJuego {

    private String[][] matrizJuego = new String[3][3];

    //llenar matriz 
    public void llenarMatriz(int x, int y, String ficha) {
        this.matrizJuego[x][y] = ficha;
    }

    //Analisis del juego para rvisar si se gano la partida 
    public boolean evaluarPartda(String ficha) {
        if ((matrizJuego[0][0] == ficha) && (matrizJuego[1][0] == ficha)
                && (matrizJuego[2][0] == ficha)) {
            return true;
        } else if ((matrizJuego[0][1] == ficha) && (matrizJuego[1][1] == ficha)
                && (matrizJuego[2][1] == ficha)) {
            return true;
        } else if ((matrizJuego[0][2] == ficha) && (matrizJuego[1][2] == ficha)
                && (matrizJuego[2][2] == ficha)) {
            return true;
        } else if ((matrizJuego[0][0] == ficha) && (matrizJuego[0][1] == ficha)
                && (matrizJuego[0][2] == ficha)) {
            return true;
        } else if ((matrizJuego[1][0] == ficha) && (matrizJuego[1][1] == ficha)
                && (matrizJuego[1][2] == ficha)) {
            return true;
        } else if ((matrizJuego[2][0] == ficha) && (matrizJuego[2][1] == ficha)
                && (matrizJuego[2][2] == ficha)) {
            return true;
        } else if ((matrizJuego[0][0] == ficha) && (matrizJuego[1][1] == ficha)
                && (matrizJuego[2][2] == ficha)) {
            return true;
        } else if ((matrizJuego[2][0] == ficha) && (matrizJuego[1][1] == ficha)
                && (matrizJuego[0][2] == ficha)) {
            return true;
        }
        return false;
    }

    public boolean evaluarEmpate(int cont, String ficha) {
        if ((cont == 9) && (evaluarPartda(ficha) == false)) {
            return true;
        }
        return false;
    }

    public void reiniciarMatriz() {
        for (int i = 0; i < matrizJuego.length; i++) {
            for (int j = 0; j < matrizJuego.length; j++) {
                matrizJuego[i][j] = " ";
            }
        }
    }

    public boolean consultarPosicionDisponible(int x, int y) {
        if (matrizJuego[x][y].equals(" ")) {
            return true;
        }
        return false;
    }

}
