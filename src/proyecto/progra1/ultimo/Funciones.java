/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.progra1.ultimo;

import java.util.Scanner;

/**
 *
 * @author Renan
 */
public class Funciones {
    private boolean continuar;
    private char YorN;
    private Scanner lea;
    private int[] lineaArriba;
    int nivel;
    Nivel1 _nivel1 = new Nivel1 (10,11,1);
    Nivel2 _nivel2 = new Nivel2 (15,15,1);
    Nivel3 _nivel3 = new Nivel3 (20,20,1);
    public Funciones () {
        
    }
    
    public void chooseNivel(){
        do{ 
            boolean numCorrecto = true;
            do{
                System.out.println("\nEliga el nivel que desea.\n\t1. Facil\n\t2. Intermedio\n\t3. Dificil");
                setLea(this.lea);
                nivel = getLea().nextInt();
                switch (nivel){
                    case 1:
                        _nivel1.setNivel1();
                        _nivel1.setEspacio();
                        System.out.println("\nNivel 1\n");
                        imprimir(_nivel1.getFila(),_nivel1.getColumna(),_nivel1.getNivel1(),_nivel1.getEspacio());
                        buscar1(_nivel1.getCant(),_nivel1);
                        continuar = isContinuar();
                        numCorrecto = false;
                        break;
                    case 2:
                        _nivel2.setNivel2();
                        _nivel2.setEspacio();
                        System.out.println("\nNivel 2\n");
                        imprimir(_nivel2.getFila(),_nivel2.getColumna(),_nivel2.getNivel2(),_nivel2.getEspacio());
                        buscar2(_nivel2.getCant(),_nivel2);
                        continuar = isContinuar();
                        numCorrecto = false;
                        break;
                    case 3:
                        _nivel3.setNivel3();
                        _nivel3.setEspacio();
                        System.out.println("\nNivel 3\n");
                        imprimir(_nivel3.getFila(),_nivel3.getColumna(),_nivel3.getNivel3(),_nivel3.getEspacio());
                        buscar3(_nivel3.getCant(),_nivel3);
                        continuar = isContinuar();
                        numCorrecto = false;
                        break;
                    default: 
                        System.out.println("Ingreso mal el numero del nivel. Ingreselo de nuevo");
                        break;
                }
            }while (numCorrecto);
            if (isContinuar()==false)
                System.out.println("Gracias por jugar.\nSaliendo...");
        }while (isContinuar());
    }

    public boolean isContinuar() {
        return continuar;
    }

    public void setContinuar(boolean continuar) {
        
        this.continuar = continuar;
    }

    public char getYorN() {
        return YorN;
    }

    public void setYorN(char YorN) {
        this.YorN = YorN;
    }
    
    public void imprimir(int fila, int columna, char[][]nivel, String[][]espacio){
        System.out.print("\t");
        setLineaArriba(lineaArriba);
        System.out.println("\n");
        int lado = 1;
        for (int i = 0; i < fila; i++) {
            System.out.print(lado+"\t");
            for (int j = 0; j < columna; j++) {
                    System.out.print (nivel[i][j]+espacio[i][j]);
                }
                System.out.println();
                lado++;
        }
        System.out.println();
    }
    
    public void buscar1(int cant, Nivel1 _nivel){
        boolean microsoft=false; boolean pantalla=false; boolean apple=false; boolean disco=false; boolean sistema=false; boolean mouse=false;
        for (int nivel = 0; nivel < cant; nivel++) {
            System.out.println("Ingrese la palabra que encontro. ");
            String palabra = getLea().next();
            int length = palabra.length();
            if (palabra.equalsIgnoreCase("microsoft")||palabra.equalsIgnoreCase("pantalla")||palabra.equalsIgnoreCase("apple")||palabra.equalsIgnoreCase("disco")||
                    palabra.equalsIgnoreCase("sistema")||palabra.equalsIgnoreCase("mouse")){
                switch (palabra){
                    case "microsoft":
                        if (microsoft==false&&palabra.equalsIgnoreCase("microsoft")){
                            busqueda1 (length,_nivel);
                            microsoft = true;

                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "pantalla":
                        if (pantalla==false&&palabra.equalsIgnoreCase("pantalla")){
                            busqueda1 (length,_nivel);
                            pantalla = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "apple":
                        if (apple==false&&palabra.equalsIgnoreCase("apple")){
                            busqueda1 (length,_nivel);
                            apple = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "disco":
                        if (disco==false&&palabra.equalsIgnoreCase("disco")){
                            busqueda1 (length,_nivel);
                            disco = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "sistema":
                        if (sistema==false&&palabra.equalsIgnoreCase("sistema")){
                            busqueda1 (length,_nivel);
                            sistema = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "mouse":
                        if (mouse==false&&palabra.equalsIgnoreCase("mouse")){
                            busqueda1 (length,_nivel);
                            mouse = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    default:
                        System.out.println("Ingrese la palabra en minusculas.\n");
                        nivel--;
                        break;
                }
            }
            else {
                System.out.println("Palabra no se encuentra en la sopa de letras, ingrese otra palabra.\n");
                nivel--;
            }
        }
        ganar();
    }
    
    public void busqueda1 (int length, Nivel1 _nivel){
        for (int i = 0; i < length; i++) {
            System.out.println("Ingrese las coordenadas. ");
            System.out.print("Fila: ");
            int fila = getLea().nextInt();
            System.out.print("Columna: ");
            int columna = getLea().nextInt();
            for (int m = 0; m < fila; m++) {
                for (int n = 0; n < columna; n++) {
                    if (m==fila-1 && n==columna-2) 
                        _nivel.getEspacio() [m][n] = " - ";
                    if (m==fila-1 && n==columna-1) 
                        _nivel.getEspacio() [m][n] = " - ";
                }
            }
            imprimir(_nivel.getFila(),_nivel.getColumna(),_nivel.getNivel1(),_nivel.getEspacio());
        }
    }
    public void buscar2(int cant, Nivel2 _nivel){
        boolean juan=false, pedro=false, pablo=false, camilo=false, carlos=false, francisco=false, mauricio=false, carolina=false, doris=false, sebastian=false;
        for (int nivel = 0; nivel < cant; nivel++) {
            System.out.println("Ingrese la palabra que encontro. ");
            String palabra = getLea().next();
            int length = palabra.length();
            if (palabra.equalsIgnoreCase("juan")||palabra.equalsIgnoreCase("pedro")||palabra.equalsIgnoreCase("pablo")||palabra.equalsIgnoreCase("camilo")||palabra.equalsIgnoreCase("carlos")||
                    palabra.equalsIgnoreCase("francisco")||palabra.equalsIgnoreCase("mauricio")||palabra.equalsIgnoreCase("carolina")||palabra.equalsIgnoreCase("doris")||palabra.equalsIgnoreCase("sebastian")){
                switch (palabra){
                    case "juan":
                        if (juan==false&&palabra.equalsIgnoreCase("juan")){
                            busqueda2 (length,_nivel);
                            juan = true;

                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "pedro":
                        if (pedro==false&&palabra.equalsIgnoreCase("pedro")){
                            busqueda2 (length,_nivel);
                            pedro = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "pablo":
                        if (pablo==false&&palabra.equalsIgnoreCase("pablo")){
                            busqueda2 (length,_nivel);
                            pablo = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "francisco":
                        if (francisco==false&&palabra.equalsIgnoreCase("francisco")){
                            busqueda2 (length,_nivel);
                            francisco = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "camilo":
                        if (camilo==false&&palabra.equalsIgnoreCase("camilo")){
                            busqueda2 (length,_nivel);
                            camilo = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "mauricio":
                        if (mauricio==false&&palabra.equalsIgnoreCase("mauricio")){
                            busqueda2 (length,_nivel);
                            mauricio = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "carolina":
                        if (carolina==false&&palabra.equalsIgnoreCase("carolina")){
                            busqueda2 (length,_nivel);
                            carolina = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "doris":
                        if (doris==false&&palabra.equalsIgnoreCase("doris")){
                            busqueda2 (length,_nivel);
                            doris = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "carlos":
                        if (carlos==false&&palabra.equalsIgnoreCase("carlos")){
                            busqueda2 (length,_nivel);
                            carlos = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "sebastian":
                        if (sebastian==false&&palabra.equalsIgnoreCase("sebastian")){
                            busqueda2 (length,_nivel);
                            sebastian = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    default:
                        System.out.println("Ingrese la palabra en minusculas.\n");
                        nivel--;
                        break;
                }
            }
            else {
                System.out.println("Palabra no se encuentra en la sopa de letras, ingrese otra palabra.\n");
                nivel--;
            }
        }
        ganar();
    }
    
    public void busqueda2 (int length, Nivel2 _nivel){
        for (int i = 0; i < length; i++) {
            System.out.println("Ingrese las coordenadas. ");
            System.out.print("Fila: ");
            int fila = getLea().nextInt();
            System.out.print("Columna: ");
            int columna = getLea().nextInt();
            for (int m = 0; m < fila; m++) {
                for (int n = 0; n < columna; n++) {
                    if (m==fila-1 && n==columna-2) 
                        _nivel.getEspacio() [m][n] = " - ";
                    if (m==fila-1 && n==columna-1) 
                        _nivel.getEspacio() [m][n] = " - ";
                }
            }
            imprimir(_nivel.getFila(),_nivel.getColumna(),_nivel.getNivel2(),_nivel.getEspacio());
        }
    }
    
    public void buscar3(int cant, Nivel3 _nivel){
        boolean enero=false, febrero=false, marzo=false, abril=false, mayo=false, junio=false, julio=false, agosto=false, septiembre=false, octubre=false;
        boolean diciembre=false, lunes=false, martes=false, miercoles=false, jueves=false, viernes=false, sabado=false, domingo=false;
        for (int nivel = 0; nivel < cant; nivel++) {
            System.out.println("Ingrese la palabra que encontro. ");
            String palabra = getLea().next();
            int length = palabra.length();
            if (palabra.equalsIgnoreCase("enero")||palabra.equalsIgnoreCase("febrero")||palabra.equalsIgnoreCase("marzo")||palabra.equalsIgnoreCase("abril")||palabra.equalsIgnoreCase("mayo")||
                    palabra.equalsIgnoreCase("junio")||palabra.equalsIgnoreCase("julio")||palabra.equalsIgnoreCase("agosto")||palabra.equalsIgnoreCase("septiembre")||palabra.equalsIgnoreCase("octubre")
                    ||palabra.equalsIgnoreCase("diciembre")||palabra.equalsIgnoreCase("lunes")||palabra.equalsIgnoreCase("martes")||palabra.equalsIgnoreCase("miercoles")||palabra.equalsIgnoreCase("jueves")
                    ||palabra.equalsIgnoreCase("viernes")||palabra.equalsIgnoreCase("sabado")||palabra.equalsIgnoreCase("domingo")){
                switch (palabra){
                    case "enero":
                        if (enero==false&&palabra.equalsIgnoreCase("enero")){
                            busqueda3 (length,_nivel);
                            enero = true;

                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "febrero":
                        if (febrero==false&&palabra.equalsIgnoreCase("febrero")){
                            busqueda3 (length,_nivel);
                            febrero = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "marzo":
                        if (marzo==false&&palabra.equalsIgnoreCase("marzo")){
                            busqueda3 (length,_nivel);
                            marzo = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "abril":
                        if (abril==false&&palabra.equalsIgnoreCase("abril")){
                            busqueda3 (length,_nivel);
                            abril = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "mayo":
                        if (mayo==false&&palabra.equalsIgnoreCase("mayo")){
                            busqueda3 (length,_nivel);
                            mayo = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "junio":
                        if (junio==false&&palabra.equalsIgnoreCase("junio")){
                            busqueda3 (length,_nivel);
                            junio = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "julio":
                        if (julio==false&&palabra.equalsIgnoreCase("julio")){
                            busqueda3 (length,_nivel);
                            julio = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "agosto":
                        if (agosto==false&&palabra.equalsIgnoreCase("agosto")){
                            busqueda3 (length,_nivel);
                            agosto = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "septiembre":
                        if (septiembre==false&&palabra.equalsIgnoreCase("septiembre")){
                            busqueda3 (length,_nivel);
                            septiembre = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "octubre":
                        if (octubre==false&&palabra.equalsIgnoreCase("octubre")){
                            busqueda3 (length,_nivel);
                            octubre = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "diciembre":
                        if (diciembre==false&&palabra.equalsIgnoreCase("diciembre")){
                            busqueda3 (length,_nivel);
                            diciembre = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "lunes":
                        if (lunes==false&&palabra.equalsIgnoreCase("lunes")){
                            busqueda3 (length,_nivel);
                            lunes = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "martes":
                        if (martes==false&&palabra.equalsIgnoreCase("martes")){
                            busqueda3 (length,_nivel);
                            martes = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "miercoles":
                        if (miercoles==false&&palabra.equalsIgnoreCase("miercoles")){
                            busqueda3 (length,_nivel);
                            miercoles = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "jueves":
                        if (jueves==false&&palabra.equalsIgnoreCase("jueves")){
                            busqueda3 (length,_nivel);
                            jueves = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "viernes":
                        if (viernes==false&&palabra.equalsIgnoreCase("viernes")){
                            busqueda3 (length,_nivel);
                            viernes = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "sabado":
                        if (sabado==false&&palabra.equalsIgnoreCase("sabado")){
                            busqueda3 (length,_nivel);
                            sabado = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    case "domingo":
                        if (domingo==false&&palabra.equalsIgnoreCase("domingo")){
                            busqueda3 (length,_nivel);
                            domingo = true;
                        }else {
                            System.out.println("Palabra ya fue ingresada.\n");
                            nivel--;
                        }
                        break;
                    
                    default:
                        System.out.println("Ingrese la palabra en minusculas.\n");
                        nivel--;
                        break;
                }
            }
            else {
                System.out.println("Palabra no se encuentra en la sopa de letras, ingrese otra palabra.\n");
                nivel--;
            }
        }
        ganar();
    }
    
    public void busqueda3 (int length, Nivel3 _nivel){
        for (int i = 0; i < length; i++) {
            System.out.println("Ingrese las coordenadas. ");
            System.out.print("Fila: ");
            int fila = getLea().nextInt();
            System.out.print("Columna: ");
            int columna = getLea().nextInt();
            for (int m = 0; m < fila; m++) {
                for (int n = 0; n < columna; n++) {
                    if (m==fila-1 && n==columna-2) 
                        _nivel.getEspacio() [m][n] = " - ";
                    if (m==fila-1 && n==columna-1) 
                        _nivel.getEspacio() [m][n] = " - ";
                }
            }
            imprimir(_nivel.getFila(),_nivel.getColumna(),_nivel.getNivel3(),_nivel.getEspacio());
        }
    }
    
    public void ganar (){
        System.out.print("\n\n¡¡¡Felicidades ha encontrado todas las palabras!!!\n\n");
        System.out.println("Desea continuar. Y o N ");
        setYorN(getLea().next().charAt(0));
        if (getYorN()==('y')||getYorN()=='Y')
            setContinuar(true);
        else setContinuar(false);
    }
    
    public Scanner getLea() {
        return lea;
    }

    public void setLea(Scanner lea) {
        lea = new Scanner (System.in);
        this.lea = lea;
    }   

    public int[] getLineaArriba() {
        return lineaArriba;
    }

    public void setLineaArriba(int[] lineaArriba) {
        int x;
        switch (nivel) {
            case 1:
                this.lineaArriba = new int [_nivel1.getColumna()];
                x=_nivel1.getColumna();
                for (int i = 1; i <= x; i++) {
                    System.out.print(i+"   ");
                }
                break;
            case 2:
                this.lineaArriba = new int [_nivel2.getColumna()];
                x=_nivel2.getColumna();
                for (int i = 1; i <= x; i++) {
                    System.out.print(i+"   ");
                }   break;
            case 3:
                this.lineaArriba = new int [_nivel3.getColumna()];
                x=_nivel3.getColumna();
                for (int i = 1; i <= x; i++) {
                    System.out.print(i+"   ");
                }   break;
            default:
                break;
        }
        this.lineaArriba = lineaArriba;
    }
}
