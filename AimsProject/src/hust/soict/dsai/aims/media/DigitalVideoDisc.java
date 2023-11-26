package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.media.Media;

//Nguyen Xuan Tung - 20215162
public class DigitalVideoDisc extends Disc implements Playable {

    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(int id, String title, String category, float cost, String director, float length) {
        super(id, title, category, cost, director, length);
        nbDigitalVideoDiscs++;
    }


    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

}
