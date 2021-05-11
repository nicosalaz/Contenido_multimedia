/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimedia;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Salazar
 */
public class Almacenamiento {
    ArrayList<Video> videos = new ArrayList<>();    
    ArrayList<Imagen> imagenes = new ArrayList<>();   
    ArrayList<Audio> audios = new ArrayList<>();   

    public Almacenamiento() {
        //Relleno los arreglos
        videos.add(new Video("Logitech", "500 KB", "mp4", "HD", "2 min"));
        videos.add(new Video("Django", "800 KB", "mp4", "SD", "7 min"));
        videos.add(new Video("mobile", "1 GB", "mp4", "HD", "12 min"));
        imagenes.add(new Imagen("HD", "Bosque", "150 KB", "JPG",10,20));
        imagenes.add(new Imagen("HD", "Florero", "300 KB", "JPG",20,40));
        imagenes.add(new Imagen("HD", "Laguna", "180 KB", "JPG",15,15));
        audios.add(new Audio("Estereo", "3 min", "Partes de un pc", "200 KB", "MP3"));
        audios.add(new Audio("Estereo", "8 min", "Narracion de un cuento", "600 KB", "WMA"));
        audios.add(new Audio("Estereo", "2 min", "guia de viaje", "100 KB", "MP3"));

    }
    
    public void mostrar_videos(){
        for (int i = 0; i < videos.size(); i++) {
            System.out.println((i+1)+". "+videos.get(i).toString());
        }
    }
    public String reproducir_video(int ite){
        return videos.get(ite).getNombre();
    }
    public void mostrar_audios(){
        for (int i = 0; i < audios.size(); i++) {
            System.out.println((i+1)+". "+audios.get(i).toString());
        }
    }
     public String reproducir_imagen(int ite){
        return imagenes.get(ite).getNombre();
    }
    public void mostrar_imagenes(){
        for (int i = 0; i < imagenes.size(); i++) {
            System.out.println((i+1)+". "+imagenes.get(i).toString());
        }
    }
     public String reproducir_audio(int ite){
        return audios.get(ite).getNombre();
    }
    public void agregar_video(Video v){
        videos.add(v);
    }
    public void agregar_imagen(Imagen i){
        imagenes.add(i);
    }
    public void agregar_audio(Audio a){
        audios.add(a);
    }

    
    
    
}
