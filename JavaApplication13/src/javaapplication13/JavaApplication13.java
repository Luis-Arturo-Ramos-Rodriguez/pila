/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int pila[]= new int[10];
        pila objetopilaenteros = new pila(pila);
        //agregamos (operacion push) elementos a la pila de datos
        //el fondo de la pila seria 90 y la sima 12
//        objetopilaenteros.insertar(90);
//        objetopilaenteros.insertar(56);
//        objetopilaenteros.insertar(23);
//        objetopilaenteros.insertar(12);
//        objetopilaenteros.mostrarPila();
        System.out.println("Elige tu opcion:"
                + "\n 1.- Insertar"
                + "\n 2.- Quitar"
                + "\n 3.- Mostrar"
                + "\n 4.- Cima"
                + "\n 5.- Fondo"
                + "\n 6.- Salir");
        int opcion=r.nextInt();
        if(opcion==1){
            System.out.println("Introduzca el dato a insertar");
            int dato=r.nextInt();
            objetopilaenteros.insertar(dato);
            objetopilaenteros.mostrarPila();
        }if(opcion==2){
            objetopilaenteros.retirar();
            System.out.println("Dato Borrado");
        }if(opcion==3){
            objetopilaenteros.mostrarPila();
        }if(opcion==4){
        objetopilaenteros.cima();
        }if(opcion==5){
            objetopilaenteros.fondo();
    
    
        }
    }}
