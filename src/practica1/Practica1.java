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
        Scanner sn=new Scanner(System.in);
        int menu;
        int i=0;
        int j=0;
        int min=0;
        int max=0;
        int minsyb=0;
        int maxsyb=0;
        int aleatorio=0;
        int aleatorio2=0;
        int aleatorio3=0;
        int aleatorio4=0;
        int cantjuga=0;
        int cantsub=0;
        int cantbaj=0;
        int nose=0;
        int nos=0;
        int casillas =0;
        char jk=45;
        char jug1 = 0;
        char jug2=0;
        char jug3=0;
        char jug4=0;
        int contador1=0;
        int contador2=0;
        int contador3=0;
        int contador4=0;
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        boolean llenado=true;
        String vacio;
        int contf1=0;
        int contf2=0;
        int contf3=0;
        int contf4=0;
        int nfila1=1;
        int nfila2=1;
        int nfila3=1;
        int nfila4=1;
        int alef1;
        int alec1;
        int alef2;
        int alec2;
        int pisado=0;
        int turn1=0;
        int turn2=0;
        int turn3=0;
        do{
            casillas=i*j;
            char[]matriz;
            matriz = new char[casillas];
            char matriz1[][]=new char[i][j];
            for (int q= 0; q <casillas; q++) {
                        matriz[q]=jk;
            }
            for(int w=0;w<matriz1.length;w++){
                                for(int e=0;e<matriz1[0].length;e++){
                                    matriz1[w][e]=45;    
                                }
                            }
            if(i==5){
                while(cantsub>=0){
                alef1=generaNumAleatorio(0,4);
                alec1=generaNumAleatorio(1,6);
                matriz1[alef1][alec1]=42;
                    while(!(matriz1[alef1][alec1-1]==45 && matriz1[alef1][alec1+1]==45)){
                    matriz1[alef1][alec1]=45;
                    alef1=generaNumAleatorio(0,4);
                    alec1=generaNumAleatorio(1,6);
                    matriz1[alef1][alec1]=42;
                    }
                cantsub--;
                }
                while(cantbaj>=0){
                alef2=generaNumAleatorio(0,4);
                alec2=generaNumAleatorio(1,6);
                matriz1[alef2][alec2]=43;
                    while(!(matriz1[alef2][alec2-1]==45 && matriz1[alef2][alec2+1]==45)){
                        matriz1[alef2][alec2]=45;
                        alef2=generaNumAleatorio(0,4);
                    alec2=generaNumAleatorio(1,6);
                    matriz1[alef2][alec2]=43;
                    }
                cantbaj--;
                }
            }else if(i==20){
                while(cantsub>=0){
                alef1=generaNumAleatorio(0,19);
                alec1=generaNumAleatorio(1,8);
                matriz1[alef1][alec1]=42;
                    while(!(matriz1[alef1][alec1-1]==45 && matriz1[alef1][alec1+1]==45)){
                    matriz1[alef1][alec1]=45;
                    alef1=generaNumAleatorio(0,19);
                    alec1=generaNumAleatorio(1,8);
                    matriz1[alef1][alec1]=42;
                    }
                cantsub--;
                }
                while(cantbaj>=0){
                alef2=generaNumAleatorio(0,19);
                alec2=generaNumAleatorio(1,8);
                matriz1[alef2][alec2]=43;
                    while(!(matriz1[alef2][alec2-1]==45 && matriz1[alef2][alec2+1]==45)){
                        matriz1[alef2][alec2]=45;
                        alef2=generaNumAleatorio(0,19);
                        alec2=generaNumAleatorio(1,8);
                        matriz1[alef2][alec2]=43;
                    }
                cantbaj--;
                }
            }
            System.out.println("1.Dificultad del juego");
            System.out.println("2.Parametros iniciales");
            System.out.println("3.Iniciar juego");
            System.out.println("4.Salir");
            System.out.println("Introduzca el número de la opción que desee");
            menu=sn.nextInt();
            switch(menu){
                case 1:
                    int menu1;
                    do{
                    System.out.println("1.Facil");
                    System.out.println("2.Dificil");
                    System.out.println("3.Regresar");
                    System.out.println("Introduzca el número de la opción que desee");
                    menu1=sn.nextInt();
                        switch(menu1){
                            case 1:
                                i=5;
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
                            case 2:
                                i=20;
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
                    }while(menu1>0 && menu1<3);
                    break;
                case 2:
                    int menu2;
                    do{
                        System.out.println("1.Jugadores");
                        System.out.println("2.Subidas y bajones");
                        System.out.println("3.Regresar");
                        System.out.println("Introduzca el número de la opción que desee");
                        menu2=sn.nextInt();
                            switch(menu2){
                                case 1:
                                    if((i<=5)){
                                        System.out.println("Ingrese el numero de jugadores");
                                        cantjuga=sn.nextInt();    
                                        while(!(cantjuga>=2 && 3>=cantjuga)){
                                            System.out.println("numero de jugadores invalido para dificultad");
                                            System.out.println("ingrese el numero de jugadores");
                                            cantjuga=sn.nextInt();
                                        }
                                        if(cantjuga<=2){
                                            turn1=generaNumAleatorio(0,1);
                                            if(turn1==0){
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            }
                                            if(turn1==1){
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            }
                                        }else{
                                            turn2=generaNumAleatorio(0,1);
                                            if(turn2==0){
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 3");
                                            jug3=sn.next().charAt(0);
                                            }
                                            if(turn2==1){
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 3");
                                            jug3=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            }
                                        }
                                    }else{
                                        System.out.println("Ingrese el numero de jugadores");
                                        cantjuga=sn.nextInt();    
                                        while(!(cantjuga>=2 && 4>=cantjuga)){
                                            System.out.println("numero de jugadores invalido para dificultad");
                                            System.out.println("ingrese el numero de jugadores");
                                            cantjuga=sn.nextInt();    
                                            }
                                        if(cantjuga<=2){
                                            turn1=generaNumAleatorio(0,1);
                                            if(turn1==0){
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            }
                                            if(turn1==1){
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            }
                                        }else if(cantjuga>2 && cantjuga<4){
                                            turn2=generaNumAleatorio(0,1);
                                            if(turn2==0){
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 3");
                                            jug3=sn.next().charAt(0);
                                            }
                                            if(turn2==1){
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 3");
                                            jug3=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            }
                                        }else if(cantjuga>3){
                                            turn3=generaNumAleatorio(0,1);
                                            if(turn3==0){
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 1");
                                            jug1=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 2");
                                            jug2=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 3");
                                            jug3=sn.next().charAt(0);
                                            System.out.println("Ingrese el simbolo que repreesentara a su jugador 4");
                                            jug4=sn.next().charAt(0);
                                            }
                                            if(turn3==1){
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
                                case 2:
                                    if((i<=5)){
                                        System.out.println("Ingrese el numero de subidas");
                                        cantsub=sn.nextInt();    
                                        while(!(cantsub>=5 && 10>=cantsub)){
                                            System.out.println("numero de subidas invalido para dificultad");
                                            System.out.println("ingrese el numero de subidas");
                                            cantsub=sn.nextInt();
                                        }
                                        System.out.println("Ingrese el numero de bajadas");
                                        cantbaj=sn.nextInt();    
                                        while(!(cantbaj>=5 && 10>=cantbaj)){
                                            System.out.println("numero de bajadas invalido para dificultad");
                                            System.out.println("ingrese el numero de bajdas");
                                            cantbaj=sn.nextInt();
                                        }
                                    }else{
                                        System.out.println("Ingrese el numero de subidas");
                                        cantsub=sn.nextInt();    
                                        while(!(cantsub>=20 && 40>=cantsub)){
                                            System.out.println("numero de subidas invalido para dificultad");
                                            System.out.println("ingrese el numero de subidas");
                                            cantsub=sn.nextInt();
                                        }
                                        System.out.println("Ingrese el numero de bajadas");
                                        cantbaj=sn.nextInt();
                                        while(!(cantbaj>=20 && 40>=cantbaj)){
                                            System.out.println("numero de bajadas invalido para dificultad");
                                            System.out.println("ingrese el numero de bajdas");
                                            cantbaj=sn.nextInt();
                                        }
                                    }    
                                    break;
                            }
                    }while(menu2>0 && menu2<3);
                    break;
                case 3:
                    sn.nextLine();
                    while(llenado=true){
                        contador1=cont1;
                        aleatorio=generaNumAleatorio(min,max);
                        System.out.println("jugador 1");
                        System.out.println("Se movera "+aleatorio+" lugares");
                        System.out.println("Presione enter para continuar");
                        matriz[contador1+aleatorio]=jug1;
                        contador1=contador1+aleatorio;
                        cont1=contador1;
                        sn.nextLine();
                        contador2=cont2;
                        aleatorio2=generaNumAleatorio(min,max);
                        System.out.println("jugador 2");
                        System.out.println("Se movera "+aleatorio2+" lugares");
                        System.out.println("Presione enter para continuar");
                        matriz[contador2+aleatorio2]=jug2;
                        contador2=contador2+aleatorio2;
                        cont2=contador2;
                        sn.nextLine();
                        if(cantjuga>2 && cantjuga<=4){
                            contador3=cont3;
                            aleatorio3=generaNumAleatorio(min,max);
                            System.out.println("jugador 3");
                            System.out.println("Se movera "+aleatorio3+" lugares");
                            System.out.println("Presione enter para continuar");
                            matriz[contador3+aleatorio3]=jug3;
                            contador3=contador3+aleatorio3;
                            cont3=contador3;
                            sn.nextLine();
                        }
                        if(cantjuga==4){
                            contador4=cont4;
                            aleatorio4=generaNumAleatorio(min,max);
                            System.out.println("jugador 4");
                            System.out.println("Se movera "+aleatorio4+" lugares");
                            System.out.println("Presione enter para continuar");
                            matriz[contador4+aleatorio4]=jug4;
                            contador4=contador4+aleatorio4;
                            cont4=contador4;
                            sn.nextLine();
                        }
                        if(llenado=true){
                                if(contador1>=j){
                                contf1++;
                                if(!(nfila1%2==0)){
                                    while(contador1>=j){
                                    contador1=contador1-j;
                                    }
                                if(i-contf1-1<0){
                                    System.out.println("jugador 1 gana");
                                    System.exit(0);
                                }
                                if(matriz1[i-contf1-1][contador1]==42){
                                contador1++;
                                    System.out.println("casilla especial avanzar jugudor1");
                                    if(contador1==j){
                                    contador1--;
                                    }
                                }
                                if(matriz1[i-contf1-1][contador1]==43){
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
                                if(matriz1[i-contf1-1][contador1]==42){
                                contador1--;
                                System.out.println("casilla especial avanzar jugudor1");
                                    if(contador1==j){
                                    contador1++;
                                    }
                                }
                                if(matriz1[i-contf1-1][contador1]==43){
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
                                if(matriz1[i-contf1-1][contador1]==42){
                                contador1++;
                                System.out.println("casilla especial avanzar jugudor1");
                                    if(contador1==j){
                                    contador1--;
                                    }
                                }
                                if(matriz1[i-contf1-1][contador1]==43){
                                contador1--;
                                System.out.println("casilla especial retroceder jugudor1");
                                    if(contador1==0){
                                    contador1++;
                                    }
                                }   
                            matriz1[i-contf1-1][contador1]=matriz[cont1];
                            }
                            if(contador2>=j){
                                contf2++;
                                if(!(nfila2%2==0)){
                                    while(contador2>=j){
                                    contador2=contador2-j;
                                    }
                                if(i-contf2-1<0){
                                    System.out.println("jugador 2 gana");
                                    System.exit(0);
                                }
                                if(matriz1[i-contf2-1][contador2]==42){
                                contador2++;
                                System.out.println("casilla especial avanzar jugudor2");
                                    if(contador2==j){
                                    contador2--;
                                    }
                                }
                                if(matriz1[i-contf2-1][contador2]==43){
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
                                if(matriz1[i-contf2-1][contador2]==42){
                                contador2--;
                                System.out.println("casilla especial avanzar jugudor2");
                                    if(contador2==j){
                                    contador2++;
                                    }
                                }
                                if(matriz1[i-contf2-1][contador2]==43){
                                contador2++;
                                System.out.println("casilla especial retroceder jugudor1");
                                    if(contador2==0){
                                    contador2--;
                                    }
                                }
                                if(i-contf2-1<0){
                                    System.out.println("jugador 2 gana");
                                    System.exit(0);
                                }
                                matriz1[i-contf2-1][j-contador2]=matriz[cont2];
                                }
                            }else{
                                if(matriz1[i-contf2-1][contador2]==42){
                                contador2++;
                                System.out.println("casilla especial avanzar jugudor2");
                                    if(contador2==j){
                                    contador2--;
                                    }
                                }
                                if(matriz1[i-contf2-1][contador2]==43){
                                contador2--;
                                System.out.println("casilla especial retroceder jugudor2");
                                    if(contador2==0){
                                    contador2++;
                                    }
                                }
                            matriz1[i-contf2-1][contador2]=matriz[cont2];
                            }
                            if(cantjuga>2 && cantjuga<=4){
                                    if(contador3>=j){
                                    contf3++;
                                    if(!(nfila3%2==0)){
                                        while(contador3>=j){
                                        contador3=contador3-j;
                                        }
                                    if(i-contf3-1<0){
                                    System.out.println("jugador 3 gana");
                                    System.exit(0);
                                    }
                                    if(matriz1[i-contf3-1][contador3]==42){
                                    contador3++;
                                    System.out.println("casilla especial avanzar jugudor3");
                                        if(contador3==j){
                                        contador3--;
                                        }
                                    }
                                    if(matriz1[i-contf3-1][contador3]==43){
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
                                    if(matriz1[i-contf3-1][contador3]==42){
                                    contador3--;
                                    System.out.println("casilla especial avanzar jugudor3");
                                        if(contador3==j){
                                        contador3++;
                                        }
                                    }
                                    if(matriz1[i-contf3-1][contador3]==43){
                                    contador3++;
                                    System.out.println("casilla especial retroceder jugudor3");
                                        if(contador3==0){
                                        contador3--;
                                        }
                                    }
                                    if(i-contf3-1<0){
                                    System.out.println("jugador 3 gana");
                                    System.exit(0);
                                    }
                                    matriz1[i-contf3-1][j-contador3]=matriz[cont3];
                                    }
                                }else{
                                    if(matriz1[i-contf3-1][contador3]==42){
                                    contador3++;
                                    System.out.println("casilla especial avanzar jugudor3");
                                        if(contador3==j){
                                        contador3--;
                                        }
                                    }
                                    if(matriz1[i-contf3-1][contador3]==43){
                                    contador3--;
                                    System.out.println("casilla especial retroceder jugudor3");
                                        if(contador3==0){
                                        contador3++;
                                        }
                                    }
                                matriz1[i-contf3-1][contador3]=matriz[cont3];
                                }    
                            }
                            if(cantjuga==4){
                                    if(contador4>=j){
                                    contf4++;
                                    if(!(nfila4%2==0)){
                                        while(contador4>=j){
                                        contador4=contador4-j;
                                        }
                                    if(i-contf4-1<0){
                                    System.out.println("jugador 4 gana");
                                    System.exit(0);
                                    }
                                    if(matriz1[i-contf4-1][contador4]==42){
                                    contador4++;
                                    System.out.println("casilla especial avanzar jugudor4");
                                        if(contador4==j){
                                        contador4--;
                                        }
                                    }
                                    if(matriz1[i-contf4-1][contador4]==43){
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
                                    if(matriz1[i-contf4-1][contador4]==42){
                                    contador4--;
                                    System.out.println("casilla especial avanzar jugudor4");
                                        if(contador4==j){
                                        contador4++;
                                        }
                                    }
                                    if(matriz1[i-contf4-1][contador4]==43){
                                    contador4++;
                                    System.out.println("casilla especial retroceder jugudor4");
                                        if(contador4==0){
                                        contador4--;
                                        }
                                    }
                                    if(i-contf4-1<0){
                                    System.out.println("jugador 4 gana");
                                    System.exit(0);
                                    }
                                    matriz1[i-contf4-1][j-contador4]=matriz[cont4];
                                     }
                                }else{
                                    if(matriz1[i-contf4-1][contador4]==42){
                                    contador4++;
                                    System.out.println("casilla especial avanzar jugudor4");
                                        if(contador4==j){
                                        contador4--;
                                        }
                                    }
                                    if(matriz1[i-contf4-1][contador4]==43){
                                    contador4--;
                                    System.out.println("casilla especial retroceder jugudor4");
                                        if(contador4==0){
                                        contador4++;
                                        }
                                    }
                                matriz1[i-contf4-1][contador4]=matriz[cont4];
                                } 
                            }
                            if(j==10){
                            for(int w=0;w<matriz1.length;w++){
                                System.out.println("--------------------------------------------------------------------------------");        
                                for(int e=0;e<matriz1[0].length;e++){
                                    System.out.print(matriz1[w][e]+"\t");    
                                }
                            System.out.println("");
                            }
                            }else{
                            for(int w=0;w<matriz1.length;w++){
                                System.out.println("---------------------------------------------------------");        
                                for(int e=0;e<matriz1[0].length;e++){
                                    System.out.print(matriz1[w][e]+"\t");    
                                }
                            System.out.println("");
                            }
                            }
                            for(int w=0;w<matriz1.length;w++){
                                for(int e=0;e<matriz1[0].length;e++){
                                if(!(matriz1[w][e]==42 || matriz1[w][e]==43))    
                                    matriz1[w][e]=45;    
                                }
                            }
                        }
                         
                        
                    }
                    
                     break;    
            } 
        }while(menu<4);
    
    }
    public static int generaNumAleatorio(int minimo,int maximo){
    
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }
}