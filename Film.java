/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan32.daftarfilm;

/**
 *
 * @author
 * NAMA     : Aditiya Musthafa Kamil
 * KELAS    : IF-2
 * NIM      : 10119075
 * Deskripsi Program : Class untuk objek Film
 * 
 * 
 */
public class Film {
    public String filmName, filmGenre;
    public Double filmRating;
    public int filmDuration;
    
    public void nowPlaying() {
        System.out.println("Judul Film : ".concat(filmName));
        System.out.println("Genre Film : ".concat(filmGenre));
        System.out.println("Rating Film : ".concat(Double.toString(filmRating)));
        System.out.println("Duration Film : ".concat(Integer.toString(filmDuration).concat(" Menit")));
        System.out.println("");
    }
    
}