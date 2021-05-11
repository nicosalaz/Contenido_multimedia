/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimedia;

import java.util.*;

public class Principal {
    
    public static Video insertar_video(){
        String nombre;
        String tamanio_archivo;
        String formato_archivo;
        String resolucion;
        String duracion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tamaño del archivo (GB):");
        tamanio_archivo = entrada.nextLine();
        System.out.println("Ingrese el formato (MP4,WMV...):");
        formato_archivo = entrada.nextLine();
        System.out.println("Ingrese la resoucion (LD,SD,HD):");
        resolucion = entrada.nextLine();
        System.out.println("Ingrese la duracion:");
        duracion = entrada.nextLine();
        
        return (new Video(nombre, tamanio_archivo, formato_archivo, resolucion, duracion));
    }
    
    public static Imagen insertar_imagen(){
        String resolucion;
        String nombre;
        String tamanio_archivo;
        String formato_archivo;
        int alto;
        int ancho;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tamaño del archivo (GB,MB,KB):");
        tamanio_archivo = entrada.nextLine();
        System.out.println("Ingrese el formato (JPG,PNG...):");
        formato_archivo = entrada.nextLine();
        System.out.println("Ingrese la resoucion (LD,SD,HD):");
        resolucion = entrada.nextLine();
        System.out.println("Ingrese el alto de la imagen:");
        alto = entrada.nextInt();
        System.out.println("Ingrese el ancho de la imagen:");
        ancho = entrada.nextInt();
        
        return (new Imagen(resolucion, nombre, tamanio_archivo, formato_archivo,alto,ancho));
    }
    
    public static Audio insertar_audio(){
        String nombre;
        String tamanio_archivo;
        String formato_archivo;
        String canal;
        String duracion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tamaño del archivo (GB):");
        tamanio_archivo = entrada.nextLine();
        System.out.println("Ingrese el formato (MP3,OGG...):");
        formato_archivo = entrada.nextLine();
        System.out.println("Ingrese la resoucion (LD,SD,HD):");
        canal = entrada.nextLine();
        System.out.println("Ingrese la duracion:");
        duracion = entrada.nextLine();
        
        return (new Audio(canal, duracion, nombre, tamanio_archivo, formato_archivo));
    }
    
    public static void main(String[] args) {
        Almacenamiento almacen = new Almacenamiento();
        Almacenamiento almacenDos = new  Almacenamiento();
        Scanner entrada = new Scanner(System.in);
        int menu_incio = 0;
        int interno = 0;
        int rep = 0;
        boolean estado = true;
        do{
        System.out.println("----------------------------------------------------------");
        System.out.println("Bienvenido a la Agencia de Publicidad. Escoja una opcion:");
        System.out.println("1.Agregar un contenido multimedia.\n2.Mostrar Contenido multimedia.");
        System.out.println("----------------------------------------------------------");
        menu_incio = entrada.nextInt();
        switch(menu_incio){
                case 1:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("que contenido desea agregar:");
                    System.out.println("1. Un video.\n2. Una imagen.\n3. Un audio.\n4. volver.");
                    System.out.println("----------------------------------------------------------");
                    interno = entrada.nextInt();
                    switch(interno){
                        case 1:
                            almacen.agregar_video(insertar_video());
                            break;
                        case 2:
                            almacen.agregar_imagen(insertar_imagen());
                            break;
                        case 3:
                            almacen.agregar_audio(insertar_audio());
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Elija la categoria:");
                    System.out.println("1.Video.\n2.Imagen.\n3.Audio.\n4.Volver");
                    System.out.println("----------------------------------------------------------");
                    interno = entrada.nextInt();
                    switch(interno){
                        case 1:
                            almacen.mostrar_videos();
                            System.out.println("Elija el video que quiera reproducir: ");
                            rep = entrada.nextInt();
                            System.out.println("Reproduciendo: "+almacen.reproducir_video((rep-1)));
                            break;
                        case 2:
                            almacen.mostrar_imagenes();
                            System.out.println("Elija la imagen que quiera mostrar: ");
                            rep = entrada.nextInt();
                            System.out.println("Mostrando: "+almacen.reproducir_imagen((rep-1)));
                            break;
                        case 3:
                            almacen.mostrar_audios();
                            System.out.println("Elija el audio que quiera reproducir: ");
                            rep = entrada.nextInt();
                            System.out.println("Reproduciendo: "+almacen.reproducir_audio((rep-1)));
                            break;
                        case 4:
                            break;
                    }
                    break;
        }
        }while(estado == true);
        /*
        System.out.println("Videos");
        almacen.mostrar_videos();
        System.out.println("Audios");
        almacen.mostrar_Audios();
        System.out.println("Imagenes");
        almacen.mostrar_Imagenes();
        */
        
    }
}
