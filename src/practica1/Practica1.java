/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);//declaracion de entrada de teclado
        int menu;//menu principal para el switch principaal
        int i=0;//inicializa las filas de la matriz
        int j=0;//inicializa las columnas de la matriz
        int min=0;//cantidad minima del aleatorio
        int max=0;//cantidad maxima del aleatorio 
        int minsyb=0;//cantidad minima de subidas
        int maxsyb=0;//cantidad maxima de subidas
        int aleatorio=0;//aleatorio para el jugador 1
        int aleatorio2=0;//aletorio para el jugador 2
        int aleatorio3=0;//aleatorio para el jugador 3
        int aleatorio4=0;//aleatorio para el jugador 4
        int cantjuga=0;//cantidad de jugadores
        int cantsub=0;//cantidad de subidas
        int cantbaj=0;//cantidad de bajadas
        int nose=0;//contine el numero de filas
        int nos=0;//guarda el numero de columnas
        int casillas =0;//cantidad de casillas de la matriz
        char jk=45;// caracter
        char jug1 =0;//caracter jugador 1
        char jug2=0;//caracter jugador 2
        char jug3=0;//caracter jugador 3
        char jug4=0;//caracter jugador 4
        int contador1=0;//posion matriz principal para jugador 1
        int contador2=0;//posion matriz principal para jugador 2
        int contador3=0;//posion matriz principal para jugador 3
        int contador4=0;//posion matriz principal para jugador 4
        int cont1=0;//posion matriz secundaria para jugador 1
        int cont2=0;//posion matriz secundaria para jugador 2
        int cont3=0;//posion matriz secundaria para jugador 3
        int cont4=0;//posion matriz secundaria para jugador 4
        boolean llenado=true;//condicion para que se desarrolle el juego
        String vacio;//tecla enter
        int contf1=0;//contador columnas jugador 1
        int contf2=0;//contador columnas jugador 2
        int contf3=0;//contador columnas jugador 3
        int contf4=0;//contador columnas jugador 4
        int nfila1=1;//numero par o impar
        int nfila2=1;//numero par o impar
        int nfila3=1;//numero par o impar
        int nfila4=1;//numero par o impar
        int alef1;//fila aleatoria 1
        int alec1;//columna aleatoria 1
        int alef2;//fila aleatoria 2
        int alec2;//columna aleatoria 2
        int turn1=0;//aleatoio jugadores caso 1
        int turn2=0;//aleatoio jugadores caso 2
        int turn3=0;//aleatoio jugadores caso 3
        do{//ciclo menu principal
            casillas=i*j;//cantidad de casillas matriz 
            char[]matriz;//matirz principal
            matriz = new char[casillas];
            char matriz1[][]=new char[i][j];
            for (int q= 0; q <casillas; q++) {//ciclo que llena la matriz de - 
                        matriz[q]=jk;
            }
            for(int w=0;w<matriz1.length;w++){//ciclo que llena la matriz1 de -
                                for(int e=0;e<matriz1[0].length;e++){
                                    matriz1[w][e]=45;    
                                }
                            }
            if(i==5){//aleatorio de subidas y bajadas para facil
                while(cantsub>=0){//aleatorio para subidas
                alef1=generaNumAleatorio(0,4);
                alec1=generaNumAleatorio(1,6);
                matriz1[alef1][alec1]=42;
                    while(!(matriz1[alef1][alec1-1]==45 && matriz1[alef1][alec1+1]==45)){//valida que los simbols esten separados
                    matriz1[alef1][alec1]=45;
                    alef1=generaNumAleatorio(0,4);
                    alec1=generaNumAleatorio(1,6);
                    matriz1[alef1][alec1]=42;
                    }
                cantsub--;
                }
                while(cantbaj>=0){//aleatorio para bajadas
                alef2=generaNumAleatorio(0,4);
                alec2=generaNumAleatorio(1,6);
                matriz1[alef2][alec2]=43;
                    while(!(matriz1[alef2][alec2-1]==45 && matriz1[alef2][alec2+1]==45)){//valida que los simbols esten separados
                        matriz1[alef2][alec2]=45;
                        alef2=generaNumAleatorio(0,4);
                    alec2=generaNumAleatorio(1,6);
                    matriz1[alef2][alec2]=43;
                    }
                cantbaj--;
                }
            }else if(i==20){//aletorio de subidas y bajadas para dificil
                while(cantsub>=0){//aleatorio subidas
                alef1=generaNumAleatorio(0,19);
                alec1=generaNumAleatorio(1,8);
                matriz1[alef1][alec1]=42;
                    while(!(matriz1[alef1][alec1-1]==45 && matriz1[alef1][alec1+1]==45)){//valida que los simbols esten separados
                    matriz1[alef1][alec1]=45;
                    alef1=generaNumAleatorio(0,19);
                    alec1=generaNumAleatorio(1,8);
                    matriz1[alef1][alec1]=42;
                    }
                cantsub--;
                }
                while(cantbaj>=0){//aleatorio de bajadas
                alef2=generaNumAleatorio(0,19);
                alec2=generaNumAleatorio(1,8);
                matriz1[alef2][alec2]=43;
                    while(!(matriz1[alef2][alec2-1]==45 && matriz1[alef2][alec2+1]==45)){//valida que los simbols esten separados
                        matriz1[alef2][alec2]=45;
                        alef2=generaNumAleatorio(0,19);
                        alec2=generaNumAleatorio(1,8);
                        matriz1[alef2][alec2]=43;
                    }
                cantbaj--;
                }
            }//menu principal
            System.out.println("1.Dificultad del juego");
            System.out.println("2.Parametros iniciales");
            System.out.println("3.Iniciar juego");
            System.out.println("4.Salir");
            System.out.println("Introduzca el número de la opción que desee");
            menu=sn.nextInt();//entrada menu principal
            switch(menu){//switch para  menu principal
                case 1://dificultad del juego
                    int menu1;//entrada para interactuar el switch del submenu1
                    do{//ciclo sub menu 1
                    System.out.println("1.Facil");
                    System.out.println("2.Dificil");
                    System.out.println("3.Regresar");
                    System.out.println("Introduzca el número de la opción que desee");
                    menu1=sn.nextInt();//entrada submenu 1
                        switch(menu1){//switch para sub menu1
                            case 1://facil
                                i=5;//tamaño,subidas,bajadas y limites  
                                j=8;
                                min=1;
                                max=6;
                                minsyb=5;
                                maxsyb=10;
                                nose=i;
                                nos=j;
                                System.out.println("Dificultad facil seleccionada");
                                System.out.println("jugadores de 2 a 3");
                                System.out.println("Subidas de 5 a 10");
                                System.out.println("Bajones de 5 a 10");
                                break;
                            case 2://dificil
                                i=20;//tamaño,subidas,bajadas y limites
                                j=10;
                                min=1;
                                max=12;
                                minsyb=20;
                                maxsyb=40;
                                System.out.println("Dificultad dificil seleccionada");
                                System.out.println("jugadores de 2 a 4");
                                System.out.println("Subidas de 20 a 40");
                                System.out.println("Bajones de 20 a 40");
                                break;
                        }
                    }while(menu1>0 && menu1<3);//regresar al submenu1
                    break;
                case 2://parametros
                    int menu2;//entrada submenu2
                    do{//ciclo submenu2
                        System.out.println("1.Jugadores");
                        System.out.println("2.Subidas y bajones");
                        System.out.println("3.Regresar");
                        System.out.println("Introduzca el número de la opción que desee");
                        menu2=sn.nextInt();//entrada para switch submenu2
                            switch(menu2){//switch para interactuar el submenu2
                                case 1://jugadores
                                    if((i<=5)){//dificultad facil
                                        System.out.println("Ingrese el numero de jugadores");
                                        cantjuga=sn.nextInt();//cantidad de jugadores    
                                        while(!(cantjuga>=2 && 3>=cantjuga)){//validacion
                                            System.out.println("numero de jugadores invalido para dificultad");
                                            System.out.println("ingrese el numero de jugadores");
                                            cantjuga=sn.nextInt();
                                        }
                                        if(cantjuga<=2){//dos jugadores
                                            turn1=generaNumAleatorio(0,1);
                                            if(turn1==0){//aleatorio 1
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            }
                                            if(turn1==1){//aleatorio 2
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            }
                                        }else{//tres jugadores
                                            turn2=generaNumAleatorio(0,1);
                                            if(turn2==0){//aleatorio 1
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 3");
                                            jug3=sn.next().charAt(0);
                                            }
                                            if(turn2==1){//aleatorio 2
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 3");
                                            jug3=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            }
                                        }
                                    }else{//dificil
                                        System.out.println("Ingrese el numero de jugadores");
                                        cantjuga=sn.nextInt();//cantidad de jugadores    
                                        while(!(cantjuga>=2 && 4>=cantjuga)){//validacion
                                            System.out.println("numero de jugadores invalido para dificultad");
                                            System.out.println("ingrese el numero de jugadores");
                                            cantjuga=sn.nextInt();    
                                            }
                                        if(cantjuga<=2){//dos jugadores
                                            turn1=generaNumAleatorio(0,1);
                                            if(turn1==0){//aleatorio 1
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            }
                                            if(turn1==1){//aleatorio 2
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            }
                                        }else if(cantjuga>2 && cantjuga<4){//tres jugadores
                                            turn2=generaNumAleatorio(0,1);
                                            if(turn2==0){//aleatorio 1
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 3");
                                            jug3=sn.next().charAt(0);
                                            }
                                            if(turn2==1){//aleatorio 2
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 3");
                                            jug3=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            }
                                        }else if(cantjuga>3){//cuatro jugadores
                                            turn3=generaNumAleatorio(0,1);
                                            if(turn3==0){//aleatorio 1
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 3");
                                            jug3=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 4");
                                            jug4=sn.next().charAt(0);
                                            }
                                            if(turn3==1){//aleatorio 2
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 3");
                                            jug3=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 4");
                                            jug4=sn.next().charAt(0);
                                            }
                                        }
                                    }
                                    break;
                                case 2://subidas y bajones
                                    if((i<=5)){//facil
                                        System.out.println("Ingrese el numero de subidas");
                                        cantsub=sn.nextInt();//cantidad de subidas    
                                        while(!(cantsub>=5 && 10>=cantsub)){//validacion
                                            System.out.println("numero de subidas invalido para dificultad");
                                            System.out.println("ingrese el numero de subidas");
                                            cantsub=sn.nextInt();
                                        }
                                        System.out.println("Ingrese el numero de bajadas");
                                        cantbaj=sn.nextInt();//cantidad de bajadas    
                                        while(!(cantbaj>=5 && 10>=cantbaj)){//validacion
                                            System.out.println("numero de bajadas invalido para dificultad");
                                            System.out.println("ingrese el numero de bajdas");
                                            cantbaj=sn.nextInt();
                                        }
                                    }else{//dificil
                                        System.out.println("Ingrese el numero de subidas");
                                        cantsub=sn.nextInt();//cantidad subidas    
                                        while(!(cantsub>=20 && 40>=cantsub)){//validacion
                                            System.out.println("numero de subidas invalido para dificultad");
                                            System.out.println("ingrese el numero de subidas");
                                            cantsub=sn.nextInt();
                                        }
                                        System.out.println("Ingrese el numero de bajadas");
                                        cantbaj=sn.nextInt();//cantidad de bajadas
                                        while(!(cantbaj>=20 && 40>=cantbaj)){//validacion
                                            System.out.println("numero de bajadas invalido para dificultad");
                                            System.out.println("ingrese el numero de bajdas");
                                            cantbaj=sn.nextInt();
                                        }
                                    }    
                                    break;
                            }
                    }while(menu2>0 && menu2<3);//ciclo sub menu2
                    break;
                case 3://inicio de juego
                    sn.nextLine();
                    while(llenado=true){//ciclo de juego 
                        contador1=cont1;//movimiento jugador 1
                        aleatorio=generaNumAleatorio(min,max);
                        System.out.println("jugador 1");
                        System.out.println("Se movera "+aleatorio+" lugares");
                        System.out.println("Presione enter para continuar");
                        matriz[contador1+aleatorio]=jug1;
                        contador1=contador1+aleatorio;
                        cont1=contador1;
                        sn.nextLine();
                        contador2=cont2;//movimiento jugador 2
                        aleatorio2=generaNumAleatorio(min,max);
                        System.out.println("jugador 2");
                        System.out.println("Se movera "+aleatorio2+" lugares");
                        System.out.println("Presione enter para continuar");
                        matriz[contador2+aleatorio2]=jug2;
                        contador2=contador2+aleatorio2;
                        cont2=contador2;
                        sn.nextLine();
                        if(cantjuga>2 && cantjuga<=4){//condicion tres jugaodores
                            contador3=cont3;//movimiento jugador 3
                            aleatorio3=generaNumAleatorio(min,max);
                            System.out.println("jugador 3");
                            System.out.println("Se movera "+aleatorio3+" lugares");
                            System.out.println("Presione enter para continuar");
                            matriz[contador3+aleatorio3]=jug3;
                            contador3=contador3+aleatorio3;
                            cont3=contador3;
                            sn.nextLine();
                        }
                        if(cantjuga==4){//condicion cuatro jugadores
                            contador4=cont4;//movimiento jugador 4
                            aleatorio4=generaNumAleatorio(min,max);
                            System.out.println("jugador 4");
                            System.out.println("Se movera "+aleatorio4+" lugares");
                            System.out.println("Presione enter para continuar");
                            matriz[contador4+aleatorio4]=jug4;
                            contador4=contador4+aleatorio4;
                            cont4=contador4;
                            sn.nextLine();
                        }
                        if(llenado=true){//ciclo llenado
                                if(contador1>=j){//llenado jugador 1
                                contf1++;
                                if(!(nfila1%2==0)){//forma de llenar fila
                                    while(contador1>=j){
                                    contador1=contador1-j;
                                    }
                                if(i-contf1-1<0){//condicion ganador
                                    System.out.println("jugador 1 gana");
                                    System.exit(0);
                                }
                                if(matriz1[i-contf1-1][contador1]==42){//casilla especial
                                contador1++;
                                    System.out.println("casilla especial avanzar jugudor1");
                                    if(contador1==j){
                                    contador1--;
                                    }
                                }
                                if(matriz1[i-contf1-1][contador1]==43){//casilla especial
                                contador1--;
                                System.out.println("casilla  especial retroceder jugudor1");
                                    if(contador1==0){
                                    contador1++;
                                    }
                                }    
                                matriz1[i-contf1-1][contador1]=matriz[cont1];
                                }else{
                                    while(contador1>=j){
                                    contador1=contador1-j;
                                    }
                                if(matriz1[i-contf1-1][contador1]==42){//casilla especial
                                contador1--;
                                System.out.println("casilla especial avanzar jugudor1");
                                    if(contador1==j){
                                    contador1++;
                                    }
                                }
                                if(matriz1[i-contf1-1][contador1]==43){//casilla especial
                                contador1++;
                                System.out.println("casilla especial retrceder jugudor1");
                                    if(contador1==0){
                                    contador1--;
                                    }
                                }
                                if(i-contf1-1==0 && contador1>j-1){
                                    System.out.println("jugador 1 gana");
                                    System.exit(0);
                                }
                                matriz1[i-contf1-1][j-contador1]=matriz[cont1];
                                }
                            }else{
                                if(matriz1[i-contf1-1][contador1]==42){//casilla especial
                                contador1++;
                                System.out.println("casilla especial avanzar jugudor1");
                                    if(contador1==j){
                                    contador1--;
                                    }
                                }
                                if(matriz1[i-contf1-1][contador1]==43){//casilla especial
                                contador1--;
                                System.out.println("casilla especial retroceder jugudor1");
                                    if(contador1==0){
                                    contador1++;
                                    }
                                }   
                            matriz1[i-contf1-1][contador1]=matriz[cont1];
                            }
                            if(contador2>=j){//llenar jugador 2
                                contf2++;
                                if(!(nfila2%2==0)){//modo de llenar fila
                                    while(contador2>=j){
                                    contador2=contador2-j;
                                    }
                                if(i-contf2-1<0){//condicion jugador 2 gana
                                    System.out.println("jugador 2 gana");
                                    System.exit(0);
                                }
                                if(matriz1[i-contf2-1][contador2]==42){//casilla especial
                                contador2++;
                                System.out.println("casilla especial avanzar jugudor2");
                                    if(contador2==j){
                                    contador2--;
                                    }
                                }
                                if(matriz1[i-contf2-1][contador2]==43){//casilla especial
                                contador2--;
                                System.out.println("casilla especial retroceder jugudor1");
                                    if(contador2==0){
                                    contador2++;
                                    }
                                }
                                matriz1[i-contf2-1][contador2]=matriz[cont2];
                                }else{
                                    while(contador2>=j){
                                    contador2=contador2-j;
                                    }
                                if(matriz1[i-contf2-1][contador2]==42){//casilla especial
                                contador2--;
                                System.out.println("casilla especial avanzar jugudor2");
                                    if(contador2==j){
                                    contador2++;
                                    }
                                }
                                if(matriz1[i-contf2-1][contador2]==43){//casilla especial
                                contador2++;
                                System.out.println("casilla especial retroceder jugudor1");
                                    if(contador2==0){
                                    contador2--;
                                    }
                                }
                                if(i-contf2-1<0){//condicion jugador 2 gana
                                    System.out.println("jugador 2 gana");
                                    System.exit(0);
                                }
                                matriz1[i-contf2-1][j-contador2]=matriz[cont2];
                                }
                            }else{
                                if(matriz1[i-contf2-1][contador2]==42){//casilla especial
                                contador2++;
                                System.out.println("casilla especial avanzar jugudor2");
                                    if(contador2==j){
                                    contador2--;
                                    }
                                }
                                if(matriz1[i-contf2-1][contador2]==43){//casilla especial
                                contador2--;
                                System.out.println("casilla especial retroceder jugudor2");
                                    if(contador2==0){
                                    contador2++;
                                    }
                                }
                            matriz1[i-contf2-1][contador2]=matriz[cont2];
                            }
                            if(cantjuga>2 && cantjuga<=4){//llenado jugador 3                  
                                    if(contador3>=j){
                                    contf3++;
                                    if(!(nfila3%2==0)){//modo de llenado de fila 
                                        while(contador3>=j){
                                        contador3=contador3-j;
                                        }
                                    if(i-contf3-1<0){//condicion jugador 3 gana
                                    System.out.println("jugador 3 gana");
                                    System.exit(0);
                                    }
                                    if(matriz1[i-contf3-1][contador3]==42){//casilla especial
                                    contador3++;
                                    System.out.println("casilla especial avanzar jugudor3");
                                        if(contador3==j){
                                        contador3--;
                                        }
                                    }
                                    if(matriz1[i-contf3-1][contador3]==43){//casilla especial
                                    contador3--;
                                    System.out.println("casilla especial retroceder jugudor3");
                                        if(contador3==0){
                                        contador3++;
                                        }
                                    }
                                    matriz1[i-contf3-1][contador3]=matriz[cont3];
                                    }else{
                                        while(contador3>=j){
                                        contador3=contador3-j;
                                        }
                                    if(matriz1[i-contf3-1][contador3]==42){//casilla especial
                                    contador3--;
                                    System.out.println("casilla especial avanzar jugudor3");
                                        if(contador3==j){
                                        contador3++;
                                        }
                                    }
                                    if(matriz1[i-contf3-1][contador3]==43){//casilla especial
                                    contador3++;
                                    System.out.println("casilla especial retroceder jugudor3");
                                        if(contador3==0){
                                        contador3--;
                                        }
                                    }
                                    if(i-contf3-1<0){//condicion jugador 3 gana
                                    System.out.println("jugador 3 gana");
                                    System.exit(0);
                                    }
                                    matriz1[i-contf3-1][j-contador3]=matriz[cont3];
                                    }
                                }else{
                                    if(matriz1[i-contf3-1][contador3]==42){//casilla especial
                                    contador3++;
                                    System.out.println("casilla especial avanzar jugudor3");
                                        if(contador3==j){
                                        contador3--;
                                        }
                                    }
                                    if(matriz1[i-contf3-1][contador3]==43){//casilla especial
                                    contador3--;
                                    System.out.println("casilla especial retroceder jugudor3");
                                        if(contador3==0){
                                        contador3++;
                                        }
                                    }
                                matriz1[i-contf3-1][contador3]=matriz[cont3];
                                }    
                            }
                            if(cantjuga==4){//condicion 4 jugadores
                                    if(contador4>=j){//llenado jugador 4
                                    contf4++;
                                    if(!(nfila4%2==0)){//mode de llenado de fila
                                        while(contador4>=j){
                                        contador4=contador4-j;
                                        }
                                    if(i-contf4-1<0){//condicion jagador 4 
                                    System.out.println("jugador 4 gana");
                                    System.exit(0);
                                    }
                                    if(matriz1[i-contf4-1][contador4]==42){//casilla especial
                                    contador4++;
                                    System.out.println("casilla especial avanzar jugudor4");
                                        if(contador4==j){
                                        contador4--;
                                        }
                                    }
                                    if(matriz1[i-contf4-1][contador4]==43){//casilla especial
                                    contador4--;
                                    System.out.println("casilla especial retroceder jugudor4");
                                        if(contador4==0){
                                        contador4++;
                                        }
                                    }
                                    matriz1[i-contf4-1][contador4]=matriz[cont4];
                                    }else{
                                        while(contador4>=j){
                                        contador4=contador4-j;
                                        }
                                    if(matriz1[i-contf4-1][contador4]==42){//casilla especial
                                    contador4--;
                                    System.out.println("casilla especial avanzar jugudor4");
                                        if(contador4==j){
                                        contador4++;
                                        }
                                    }
                                    if(matriz1[i-contf4-1][contador4]==43){//casilla especial
                                    contador4++;
                                    System.out.println("casilla especial retroceder jugudor4");
                                        if(contador4==0){
                                        contador4--;
                                        }
                                    }
                                    if(i-contf4-1<0){//condicion jugador 4 gana 
                                    System.out.println("jugador 4 gana");
                                    System.exit(0);
                                    }
                                    matriz1[i-contf4-1][j-contador4]=matriz[cont4];
                                     }
                                }else{
                                    if(matriz1[i-contf4-1][contador4]==42){//casilla especial
                                    contador4++;
                                    System.out.println("casilla especial avanzar jugudor4");
                                        if(contador4==j){
                                        contador4--;
                                        }
                                    }
                                    if(matriz1[i-contf4-1][contador4]==43){//casilla especial
                                    contador4--;
                                    System.out.println("casilla especial retroceder jugudor4");
                                        if(contador4==0){
                                        contador4++;
                                        }
                                    }
                                matriz1[i-contf4-1][contador4]=matriz[cont4];
                                } 
                            }
                            if(j==10){//linea para dificil e imppresion de tablero
                            for(int w=0;w<matriz1.length;w++){
                                System.out.println("--------------------------------------------------------------------------------");        
                                for(int e=0;e<matriz1[0].length;e++){
                                    System.out.print(matriz1[w][e]+"\t");    
                                }
                            System.out.println("");
                            }
                            }else{//linea para facil e imppresion de tablero
                            for(int w=0;w<matriz1.length;w++){
                                System.out.println("---------------------------------------------------------");        
                                for(int e=0;e<matriz1[0].length;e++){
                                    System.out.print(matriz1[w][e]+"\t");    
                                }
                            System.out.println("");
                            }
                            }
                            for(int w=0;w<matriz1.length;w++){//vaciar tablero y reasignar casillas
                                for(int e=0;e<matriz1[0].length;e++){
                                if(!(matriz1[w][e]==42 || matriz1[w][e]==43))//condicion para mantener las casillas especiales    
                                    matriz1[w][e]=45;    
                                }
                            }
                        }
                         
                        
                    }
                    
                     break;    
            } 
        }while(menu<4);//condicion para interactuar en el menu principal 
    
    }
    public static int generaNumAleatorio(int minimo,int maximo){//funcion para generar un numero aleatorio
    
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));//limites del numero generado
    }
}