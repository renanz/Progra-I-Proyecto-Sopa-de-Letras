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
public class Nivel3 {
    private int fila,columna,cant;
    private char [][] nivel3;
    private String [][] espacio;
    
    public Nivel3(int fila, int columna, int cant){
        this.cant = cant;
        this.nivel3 = new char [fila][columna];
        this.espacio = new String [fila][columna];
        this.fila = fila;
        this.columna = columna;
    }
    
    public char[][] getNivel3() {
        return nivel3;
    }
    //20 20
    public void setNivel3() {
        nivel3[0][0] = 'a'; nivel3[0][1] = 'm'; nivel3[0][2] = 'a'; nivel3[0][3] = 'r'; nivel3[0][4] = 't'; nivel3[0][5] = 'e'; nivel3[0][6] = 's'; nivel3[0][7] = 'g'; nivel3[0][8] = 'f'; nivel3[0][9] = 't'; nivel3[0][10] = 'f'; nivel3[0][11] = 'e'; nivel3[0][12] = 'b'; nivel3[0][13] = 'r'; nivel3[0][14] = 'e'; nivel3[0][15] = 'r'; nivel3[0][16] = 'o'; nivel3[0][17] = 'p'; nivel3[0][18] = 'p'; nivel3[0][19] = 'u';
        nivel3[1][0] = 'a'; nivel3[1][1] = 'm'; nivel3[1][2] = 'f'; nivel3[1][3] = 'r'; nivel3[1][4] = 'a'; nivel3[1][5] = 'n'; nivel3[1][6] = 'c'; nivel3[1][7] = 'i'; nivel3[1][8] = 's'; nivel3[1][9] = 'c'; nivel3[1][10] = 'o'; nivel3[1][11] = 'p'; nivel3[1][12] = 'p'; nivel3[1][13] = 'l'; nivel3[1][14] = 'u'; nivel3[1][15] = 'n'; nivel3[1][16] = 'e'; nivel3[1][17] = 's'; nivel3[1][18] = 'l'; nivel3[1][19] = 'y';
        nivel3[2][0] = 'a'; nivel3[2][1] = 't'; nivel3[2][2] = 'p'; nivel3[2][3] = 'a'; nivel3[2][4] = 'n'; nivel3[2][5] = 'c'; nivel3[2][6] = 'a'; nivel3[2][7] = 'r'; nivel3[2][8] = 'l'; nivel3[2][9] = 'o'; nivel3[2][10] = 's'; nivel3[2][11] = 'p'; nivel3[2][12] = 'p'; nivel3[2][13] = 'p'; nivel3[2][14] = 'j'; nivel3[2][15] = 'p'; nivel3[2][16] = 'b'; nivel3[2][17] = 'p'; nivel3[2][18] = 'p'; nivel3[2][19] = 'o';
        nivel3[3][0] = 'a'; nivel3[3][1] = 'a'; nivel3[3][2] = 'b'; nivel3[3][3] = 'r'; nivel3[3][4] = 'i'; nivel3[3][5] = 'l'; nivel3[3][6] = 'e'; nivel3[3][7] = 'b'; nivel3[3][8] = 'a'; nivel3[3][9] = 's'; nivel3[3][10] = 't'; nivel3[3][11] = 'i'; nivel3[3][12] = 'a'; nivel3[3][13] = 'n'; nivel3[3][14] = 'g'; nivel3[3][15] = 'y'; nivel3[3][16] = 'l'; nivel3[3][17] = 'g'; nivel3[3][18] = 'i'; nivel3[3][19] = 'p';
        nivel3[4][0] = 'a'; nivel3[4][1] = 'b'; nivel3[4][2] = 'a'; nivel3[4][3] = 'p'; nivel3[4][4] = 'p'; nivel3[4][5] = 'a'; nivel3[4][6] = 'b'; nivel3[4][7] = 'l'; nivel3[4][8] = 'o'; nivel3[4][9] = 'a'; nivel3[4][10] = 'g'; nivel3[4][11] = 'o'; nivel3[4][12] = 's'; nivel3[4][13] = 't'; nivel3[4][14] = 'o'; nivel3[4][15] = 'p'; nivel3[4][16] = 'j'; nivel3[4][17] = 'h'; nivel3[4][18] = 'p'; nivel3[4][19] = 'p';
        nivel3[5][0] = 'a'; nivel3[5][1] = 'o'; nivel3[5][2] = 't'; nivel3[5][3] = 't'; nivel3[5][4] = 's'; nivel3[5][5] = 'e'; nivel3[5][6] = 'p'; nivel3[5][7] = 't'; nivel3[5][8] = 'i'; nivel3[5][9] = 'e'; nivel3[5][10] = 'm'; nivel3[5][11] = 'b'; nivel3[5][12] = 'r'; nivel3[5][13] = 'e'; nivel3[5][14] = 'm'; nivel3[5][15] = 'e'; nivel3[5][16] = 'p'; nivel3[5][17] = 'p'; nivel3[5][18] = 'y'; nivel3[5][19] = 'g';
        nivel3[6][0] = 'a'; nivel3[6][1] = 'c'; nivel3[6][2] = 'a'; nivel3[6][3] = 'r'; nivel3[6][4] = 'o'; nivel3[6][5] = 'l'; nivel3[6][6] = 'i'; nivel3[6][7] = 'n'; nivel3[6][8] = 'a'; nivel3[6][9] = 's'; nivel3[6][10] = 'e'; nivel3[6][11] = 'p'; nivel3[6][12] = 'p'; nivel3[6][13] = 'k'; nivel3[6][14] = 'l'; nivel3[6][15] = 'p'; nivel3[6][16] = 'r'; nivel3[6][17] = 'p'; nivel3[6][18] = 't'; nivel3[6][19] = 's';
        nivel3[7][0] = 'a'; nivel3[7][1] = 's'; nivel3[7][2] = 'h'; nivel3[7][3] = 'i'; nivel3[7][4] = 'g'; nivel3[7][5] = 'c'; nivel3[7][6] = 'o'; nivel3[7][7] = 'g'; nivel3[7][8] = 's'; nivel3[7][9] = 'a'; nivel3[7][10] = 'b'; nivel3[7][11] = 'a'; nivel3[7][12] = 'd'; nivel3[7][13] = 'o'; nivel3[7][14] = 'j'; nivel3[7][15] = 'g'; nivel3[7][16] = 'f'; nivel3[7][17] = 'f'; nivel3[7][18] = 'r'; nivel3[7][19] = 'h';
        nivel3[8][0] = 'a'; nivel3[8][1] = 'j'; nivel3[8][2] = 'c'; nivel3[8][3] = 'd'; nivel3[8][4] = 'd'; nivel3[8][5] = 'i'; nivel3[8][6] = 'c'; nivel3[8][7] = 'c'; nivel3[8][8] = 'n'; nivel3[8][9] = 'p'; nivel3[8][10] = 'e'; nivel3[8][11] = 'd'; nivel3[8][12] = 'r'; nivel3[8][13] = 'o'; nivel3[8][14] = 'g'; nivel3[8][15] = 's'; nivel3[8][16] = 'g'; nivel3[8][17] = 'p'; nivel3[8][18] = 'q'; nivel3[8][19] = 'k';
        nivel3[9][0] = 'a'; nivel3[9][1] = 'j'; nivel3[9][2] = 'u'; nivel3[9][3] = 'n'; nivel3[9][4] = 'i'; nivel3[9][5] = 'o'; nivel3[9][6] = 't'; nivel3[9][7] = 'j'; nivel3[9][8] = 'm'; nivel3[9][9] = 'd'; nivel3[9][10] = 'o'; nivel3[9][11] = 'm'; nivel3[9][12] = 'i'; nivel3[9][13] = 'n'; nivel3[9][14] = 'g'; nivel3[9][15] = 'o'; nivel3[9][16] = 'r'; nivel3[9][17] = 'e'; nivel3[9][18] = 'p'; nivel3[9][19] = 'r';
        nivel3[10][0] = 'a'; nivel3[10][1] = 't'; nivel3[10][2] = 'j'; nivel3[10][3] = 'd'; nivel3[10][4] = 'o'; nivel3[10][5] = 'r'; nivel3[10][6] = 'i'; nivel3[10][7] = 's'; nivel3[10][8] = 'a'; nivel3[10][9] = 'l'; nivel3[10][10] = 'k'; nivel3[10][11] = 'p'; nivel3[10][12] = 'p'; nivel3[10][13] = 'h'; nivel3[10][14] = 'f'; nivel3[10][15] = 'p'; nivel3[10][16] = 'p'; nivel3[10][17] = 'p'; nivel3[10][18] = 'w'; nivel3[10][19] = 't';
        nivel3[11][0] = 'a'; nivel3[11][1] = 'q'; nivel3[11][2] = 'g'; nivel3[11][3] = 'm'; nivel3[11][4] = 'i'; nivel3[11][5] = 'e'; nivel3[11][6] = 'r'; nivel3[11][7] = 'c'; nivel3[11][8] = 'o'; nivel3[11][9] = 'l'; nivel3[11][10] = 'e'; nivel3[11][11] = 's'; nivel3[11][12] = 'n'; nivel3[11][13] = 's'; nivel3[11][14] = 'l'; nivel3[11][15] = 'p'; nivel3[11][16] = 'p'; nivel3[11][17] = 'p'; nivel3[11][18] = 'e'; nivel3[11][19] = 'y';
        nivel3[12][0] = 'j'; nivel3[12][1] = 'd'; nivel3[12][2] = 'a'; nivel3[12][3] = 'n'; nivel3[12][4] = 'i'; nivel3[12][5] = 'r'; nivel3[12][6] = 'r'; nivel3[12][7] = 'r'; nivel3[12][8] = 'i'; nivel3[12][9] = 'p'; nivel3[12][10] = 'g'; nivel3[12][11] = 'q'; nivel3[12][12] = 'l'; nivel3[12][13] = 'a'; nivel3[12][14] = 'j'; nivel3[12][15] = 'm'; nivel3[12][16] = 'a'; nivel3[12][17] = 'y'; nivel3[12][18] = 'o'; nivel3[12][19] = 'o';
        nivel3[13][0] = 'a'; nivel3[13][1] = 't'; nivel3[13][2] = 'u'; nivel3[13][3] = 'c'; nivel3[13][4] = 'a'; nivel3[13][5] = 'm'; nivel3[13][6] = 'i'; nivel3[13][7] = 'l'; nivel3[13][8] = 'j'; nivel3[13][9] = 'u'; nivel3[13][10] = 'e'; nivel3[13][11] = 'v'; nivel3[13][12] = 'e'; nivel3[13][13] = 's'; nivel3[13][14] = 'h'; nivel3[13][15] = 'p'; nivel3[13][16] = 'p'; nivel3[13][17] = 'p'; nivel3[13][18] = 'd'; nivel3[13][19] = 'q';
        nivel3[14][0] = 't'; nivel3[14][1] = 'q'; nivel3[14][2] = 'u'; nivel3[14][3] = 'd'; nivel3[14][4] = 'i'; nivel3[14][5] = 's'; nivel3[14][6] = 'g'; nivel3[14][7] = 'k'; nivel3[14][8] = 'r'; nivel3[14][9] = 'o'; nivel3[14][10] = 'g'; nivel3[14][11] = 'u'; nivel3[14][12] = 'y'; nivel3[14][13] = 'k'; nivel3[14][14] = 'o'; nivel3[14][15] = 'p'; nivel3[14][16] = 'p'; nivel3[14][17] = 'p'; nivel3[14][18] = 'h'; nivel3[14][19] = 'v';
        nivel3[15][0] = 't'; nivel3[15][1] = 'q'; nivel3[15][2] = 'u'; nivel3[15][3] = 'd'; nivel3[15][4] = 'i'; nivel3[15][5] = 'c'; nivel3[15][6] = 'i'; nivel3[15][7] = 'e'; nivel3[15][8] = 'm'; nivel3[15][9] = 'b'; nivel3[15][10] = 'r'; nivel3[15][11] = 'e'; nivel3[15][12] = 'o'; nivel3[15][13] = 'k'; nivel3[15][14] = 'o'; nivel3[15][15] = 'p'; nivel3[15][16] = 'p'; nivel3[15][17] = 'p'; nivel3[15][18] = 'p'; nivel3[15][19] = 'x';
        nivel3[16][0] = 't'; nivel3[16][1] = 'o'; nivel3[16][2] = 'c'; nivel3[16][3] = 't'; nivel3[16][4] = 'u'; nivel3[16][5] = 'b'; nivel3[16][6] = 'r'; nivel3[16][7] = 'e'; nivel3[16][8] = 'r'; nivel3[16][9] = 'o'; nivel3[16][10] = 'g'; nivel3[16][11] = 'u'; nivel3[16][12] = 'y'; nivel3[16][13] = 'k'; nivel3[16][14] = 'm'; nivel3[16][15] = 'a'; nivel3[16][16] = 'r'; nivel3[16][17] = 'z'; nivel3[16][18] = 'o'; nivel3[16][19] = 'z';
        nivel3[17][0] = 't'; nivel3[17][1] = 'g'; nivel3[17][2] = 'r'; nivel3[17][3] = 'd'; nivel3[17][4] = 'i'; nivel3[17][5] = 's'; nivel3[17][6] = 'g'; nivel3[17][7] = 'k'; nivel3[17][8] = 'r'; nivel3[17][9] = 'j'; nivel3[17][10] = 'u'; nivel3[17][11] = 'l'; nivel3[17][12] = 'i'; nivel3[17][13] = 'o'; nivel3[17][14] = 'o'; nivel3[17][15] = 'p'; nivel3[17][16] = 'p'; nivel3[17][17] = 'p'; nivel3[17][18] = 'p'; nivel3[17][19] = 'k';
        nivel3[18][0] = 't'; nivel3[18][1] = 'j'; nivel3[18][2] = 'u'; nivel3[18][3] = 'f'; nivel3[18][4] = 'i'; nivel3[18][5] = 's'; nivel3[18][6] = 'g'; nivel3[18][7] = 'k'; nivel3[18][8] = 'r'; nivel3[18][9] = 'o'; nivel3[18][10] = 'g'; nivel3[18][11] = 'u'; nivel3[18][12] = 'y'; nivel3[18][13] = 'k'; nivel3[18][14] = 'o'; nivel3[18][15] = 'p'; nivel3[18][16] = 'p'; nivel3[18][17] = 'p'; nivel3[18][18] = 'p'; nivel3[18][19] = 'd';
        nivel3[19][0] = 't'; nivel3[19][1] = 'e'; nivel3[19][2] = 'n'; nivel3[19][3] = 'e'; nivel3[19][4] = 'r'; nivel3[19][5] = 'o'; nivel3[19][6] = 'g'; nivel3[19][7] = 'k'; nivel3[19][8] = 'r'; nivel3[19][9] = 'o'; nivel3[19][10] = 'v'; nivel3[19][11] = 'i'; nivel3[19][12] = 'e'; nivel3[19][13] = 'r'; nivel3[19][14] = 'n'; nivel3[19][15] = 'e'; nivel3[19][16] = 's'; nivel3[19][17] = 'p'; nivel3[19][18] = 'p'; nivel3[19][19] = 'p';
        this.nivel3 = nivel3;
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
