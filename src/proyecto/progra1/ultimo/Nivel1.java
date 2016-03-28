/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.progra1.ultimo;

/**
 *
 * @author Renan
 */
public class Nivel1 {
    private int fila,columna,cant;
    private char [][] nivel1;
    private String [][] espacio;
    
    public Nivel1(int fila, int columna, int cant){
        this.cant = cant;
        this.nivel1 = new char [fila][columna];
        this.espacio = new String [fila][columna];
        this.fila = fila;
        this.columna = columna;
    }
    
    public char[][] getNivel1() {
        return nivel1;
    }
    
    public void setNivel1() {
        nivel1[0][0] = 'a'; nivel1[0][1] = 'm'; nivel1[0][2] = 'i'; nivel1[0][3] = 'c'; nivel1[0][4] = 'r'; nivel1[0][5] = 'o'; nivel1[0][6] = 's'; nivel1[0][7] = 'o'; nivel1[0][8] = 'f'; nivel1[0][9] = 't'; nivel1[0][10] = 'p';
        nivel1[1][0] = 'a'; nivel1[1][1] = 'm'; nivel1[1][2] = 'b'; nivel1[1][3] = 'x'; nivel1[1][4] = 'h'; nivel1[1][5] = 'f'; nivel1[1][6] = 'l'; nivel1[1][7] = 's'; nivel1[1][8] = 'w'; nivel1[1][9] = 'n'; nivel1[1][10] = 'c';
        nivel1[2][0] = 'a'; nivel1[2][1] = 't'; nivel1[2][2] = 'p'; nivel1[2][3] = 'a'; nivel1[2][4] = 'n'; nivel1[2][5] = 't'; nivel1[2][6] = 'a'; nivel1[2][7] = 'l'; nivel1[2][8] = 'l'; nivel1[2][9] = 'a'; nivel1[2][10] = 'k';
        nivel1[3][0] = 'a'; nivel1[3][1] = 'c'; nivel1[3][2] = 'l'; nivel1[3][3] = 's'; nivel1[3][4] = 'o'; nivel1[3][5] = 'l'; nivel1[3][6] = 'y'; nivel1[3][7] = 'j'; nivel1[3][8] = 'w'; nivel1[3][9] = 'j'; nivel1[3][10] = 'y';
        nivel1[4][0] = 'a'; nivel1[4][1] = 'b'; nivel1[4][2] = 'a'; nivel1[4][3] = 'p'; nivel1[4][4] = 'p'; nivel1[4][5] = 'l'; nivel1[4][6] = 'e'; nivel1[4][7] = 'w'; nivel1[4][8] = 'c'; nivel1[4][9] = 'x'; nivel1[4][10] = 'c';
        nivel1[5][0] = 'a'; nivel1[5][1] = 'o'; nivel1[5][2] = 't'; nivel1[5][3] = 't'; nivel1[5][4] = 'd'; nivel1[5][5] = 'e'; nivel1[5][6] = 'n'; nivel1[5][7] = 'h'; nivel1[5][8] = 'f'; nivel1[5][9] = 't'; nivel1[5][10] = 'q';
        nivel1[6][0] = 'a'; nivel1[6][1] = 'a'; nivel1[6][2] = 't'; nivel1[6][3] = 'r'; nivel1[6][4] = 'b'; nivel1[6][5] = 'm'; nivel1[6][6] = 'o'; nivel1[6][7] = 'u'; nivel1[6][8] = 's'; nivel1[6][9] = 'e'; nivel1[6][10] = 'e';
        nivel1[7][0] = 'a'; nivel1[7][1] = 's'; nivel1[7][2] = 'd'; nivel1[7][3] = 'i'; nivel1[7][4] = 's'; nivel1[7][5] = 'c'; nivel1[7][6] = 'o'; nivel1[7][7] = 'g'; nivel1[7][8] = 's'; nivel1[7][9] = 'r'; nivel1[7][10] = 'o';
        nivel1[8][0] = 'a'; nivel1[8][1] = 'j'; nivel1[8][2] = 'c'; nivel1[8][3] = 'd'; nivel1[8][4] = 'd'; nivel1[8][5] = 'i'; nivel1[8][6] = 'c'; nivel1[8][7] = 'c'; nivel1[8][8] = 'n'; nivel1[8][9] = 'h'; nivel1[8][10] = 't';
        nivel1[9][0] = 'a'; nivel1[9][1] = 't'; nivel1[9][2] = 'u'; nivel1[9][3] = 's'; nivel1[9][4] = 'i'; nivel1[9][5] = 's'; nivel1[9][6] = 't'; nivel1[9][7] = 'e'; nivel1[9][8] = 'm'; nivel1[9][9] = 'a'; nivel1[9][10] = 'f';
        this.nivel1 = nivel1;
    }
    
    public String[][] getEspacio() {
        return espacio;
    }

    public void setEspacio() {
        for (int x = 0; x < this.getFila(); x++)
            for (int y = 0; y < this.getColumna(); y++)
                espacio[x][y]="   ";
        this.espacio = espacio;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public int getCant() {
        return cant;
    }
}
