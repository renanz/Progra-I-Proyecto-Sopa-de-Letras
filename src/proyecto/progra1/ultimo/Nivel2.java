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
public class Nivel2 {
    private int fila,columna,cant;
    private char [][] nivel2;
    private String [][] espacio;
    
    public Nivel2(int fila, int columna, int cant){
        this.cant = cant;
        this.nivel2 = new char [fila][columna];
        this.espacio = new String [fila][columna];
        this.fila = fila;
        this.columna = columna;
    }
    
    public char[][] getNivel2() {
        return nivel2;
    }
    //15 15
    public void setNivel2() {
        nivel2[0][0] = 'a'; nivel2[0][1] = 'm'; nivel2[0][2] = 'g'; nivel2[0][3] = 'c'; nivel2[0][4] = 'h'; nivel2[0][5] = 'd'; nivel2[0][6] = 's'; nivel2[0][7] = 'g'; nivel2[0][8] = 'f'; nivel2[0][9] = 't'; nivel2[0][10] = 'p'; nivel2[0][11] = 'p'; nivel2[0][12] = 'p'; nivel2[0][13] = 'p'; nivel2[0][14] = 'p';
        nivel2[1][0] = 'a'; nivel2[1][1] = 'm'; nivel2[1][2] = 'f'; nivel2[1][3] = 'r'; nivel2[1][4] = 'a'; nivel2[1][5] = 'n'; nivel2[1][6] = 'c'; nivel2[1][7] = 'i'; nivel2[1][8] = 's'; nivel2[1][9] = 'c'; nivel2[1][10] = 'o'; nivel2[1][11] = 'p'; nivel2[1][12] = 'p'; nivel2[1][13] = 'p'; nivel2[1][14] = 'u';
        nivel2[2][0] = 'a'; nivel2[2][1] = 't'; nivel2[2][2] = 'p'; nivel2[2][3] = 'a'; nivel2[2][4] = 'n'; nivel2[2][5] = 'c'; nivel2[2][6] = 'a'; nivel2[2][7] = 'r'; nivel2[2][8] = 'l'; nivel2[2][9] = 'o'; nivel2[2][10] = 's'; nivel2[2][11] = 'p'; nivel2[2][12] = 'p'; nivel2[2][13] = 'p'; nivel2[2][14] = 'j';
        nivel2[3][0] = 'a'; nivel2[3][1] = 'c'; nivel2[3][2] = 'l'; nivel2[3][3] = 's'; nivel2[3][4] = 'o'; nivel2[3][5] = 's'; nivel2[3][6] = 'e'; nivel2[3][7] = 'b'; nivel2[3][8] = 'a'; nivel2[3][9] = 's'; nivel2[3][10] = 't'; nivel2[3][11] = 'i'; nivel2[3][12] = 'a'; nivel2[3][13] = 'n'; nivel2[3][14] = 'g';
        nivel2[4][0] = 'a'; nivel2[4][1] = 'b'; nivel2[4][2] = 'a'; nivel2[4][3] = 'p'; nivel2[4][4] = 'p'; nivel2[4][5] = 'a'; nivel2[4][6] = 'b'; nivel2[4][7] = 'l'; nivel2[4][8] = 'o'; nivel2[4][9] = 'x'; nivel2[4][10] = 'c'; nivel2[4][11] = 'p'; nivel2[4][12] = 'p'; nivel2[4][13] = 'g'; nivel2[4][14] = 'b';
        nivel2[5][0] = 'a'; nivel2[5][1] = 'o'; nivel2[5][2] = 't'; nivel2[5][3] = 't'; nivel2[5][4] = 'm'; nivel2[5][5] = 'a'; nivel2[5][6] = 'u'; nivel2[5][7] = 'r'; nivel2[5][8] = 'i'; nivel2[5][9] = 'c'; nivel2[5][10] = 'i'; nivel2[5][11] = 'o'; nivel2[5][12] = 'p'; nivel2[5][13] = 'h'; nivel2[5][14] = 'm';
        nivel2[6][0] = 'a'; nivel2[6][1] = 'c'; nivel2[6][2] = 'a'; nivel2[6][3] = 'r'; nivel2[6][4] = 'o'; nivel2[6][5] = 'l'; nivel2[6][6] = 'i'; nivel2[6][7] = 'n'; nivel2[6][8] = 'a'; nivel2[6][9] = 's'; nivel2[6][10] = 'e'; nivel2[6][11] = 'p'; nivel2[6][12] = 'p'; nivel2[6][13] = 'k'; nivel2[6][14] = 'l';
        nivel2[7][0] = 'a'; nivel2[7][1] = 's'; nivel2[7][2] = 'h'; nivel2[7][3] = 'i'; nivel2[7][4] = 'g'; nivel2[7][5] = 'c'; nivel2[7][6] = 'o'; nivel2[7][7] = 'g'; nivel2[7][8] = 's'; nivel2[7][9] = 'r'; nivel2[7][10] = 'o'; nivel2[7][11] = 'p'; nivel2[7][12] = 'p'; nivel2[7][13] = 'm'; nivel2[7][14] = 'j';
        nivel2[8][0] = 'a'; nivel2[8][1] = 'j'; nivel2[8][2] = 'c'; nivel2[8][3] = 'd'; nivel2[8][4] = 'd'; nivel2[8][5] = 'i'; nivel2[8][6] = 'c'; nivel2[8][7] = 'c'; nivel2[8][8] = 'n'; nivel2[8][9] = 'p'; nivel2[8][10] = 'e'; nivel2[8][11] = 'd'; nivel2[8][12] = 'r'; nivel2[8][13] = 'o'; nivel2[8][14] = 'g';
        nivel2[9][0] = 'a'; nivel2[9][1] = 't'; nivel2[9][2] = 'u'; nivel2[9][3] = 'y'; nivel2[9][4] = 'r'; nivel2[9][5] = 's'; nivel2[9][6] = 't'; nivel2[9][7] = 'j'; nivel2[9][8] = 'm'; nivel2[9][9] = 'a'; nivel2[9][10] = 'f'; nivel2[9][11] = 'p'; nivel2[9][12] = 'p'; nivel2[9][13] = 'y'; nivel2[9][14] = 'a';
        nivel2[10][0] = 'a'; nivel2[10][1] = 't'; nivel2[10][2] = 'j'; nivel2[10][3] = 'd'; nivel2[10][4] = 'o'; nivel2[10][5] = 'r'; nivel2[10][6] = 'i'; nivel2[10][7] = 's'; nivel2[10][8] = 'a'; nivel2[10][9] = 'l'; nivel2[10][10] = 'k'; nivel2[10][11] = 'p'; nivel2[10][12] = 'p'; nivel2[10][13] = 'h'; nivel2[10][14] = 'f';
        nivel2[11][0] = 'a'; nivel2[11][1] = 'q'; nivel2[11][2] = 'g'; nivel2[11][3] = 's'; nivel2[11][4] = 'i'; nivel2[11][5] = 's'; nivel2[11][6] = 't'; nivel2[11][7] = 'r'; nivel2[11][8] = 'e'; nivel2[11][9] = 'j'; nivel2[11][10] = 'u'; nivel2[11][11] = 'a'; nivel2[11][12] = 'n'; nivel2[11][13] = 's'; nivel2[11][14] = 'l';
        nivel2[12][0] = 'j'; nivel2[12][1] = 'j'; nivel2[12][2] = 'u'; nivel2[12][3] = 'a'; nivel2[12][4] = 'n'; nivel2[12][5] = 'r'; nivel2[12][6] = 'r'; nivel2[12][7] = 'r'; nivel2[12][8] = 'i'; nivel2[12][9] = 'p'; nivel2[12][10] = 'g'; nivel2[12][11] = 'q'; nivel2[12][12] = 'l'; nivel2[12][13] = 'a'; nivel2[12][14] = 'j';
        nivel2[13][0] = 'a'; nivel2[13][1] = 't'; nivel2[13][2] = 'u'; nivel2[13][3] = 'c'; nivel2[13][4] = 'a'; nivel2[13][5] = 'm'; nivel2[13][6] = 'i'; nivel2[13][7] = 'l'; nivel2[13][8] = 'o'; nivel2[13][9] = 'y'; nivel2[13][10] = 'j'; nivel2[13][11] = 'r'; nivel2[13][12] = 'k'; nivel2[13][13] = 't'; nivel2[13][14] = 'h';
        nivel2[14][0] = 't'; nivel2[14][1] = 'q'; nivel2[14][2] = 'u'; nivel2[14][3] = 'd'; nivel2[14][4] = 'i'; nivel2[14][5] = 's'; nivel2[14][6] = 'g'; nivel2[14][7] = 'k'; nivel2[14][8] = 'r'; nivel2[14][9] = 'o'; nivel2[14][10] = 'g'; nivel2[14][11] = 'u'; nivel2[14][12] = 'y'; nivel2[14][13] = 'k'; nivel2[14][14] = 'o';
        this.nivel2 = nivel2;
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
