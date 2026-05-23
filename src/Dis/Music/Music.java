package Dis.Music;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Music {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        playlist.add("Ramshtain");
        playlist.add("Mayby Bayby");
        playlist.add("Serega Pirat");
        ListIterator<String> iterator = playlist.listIterator();
          System.out.println("VKL");
          if (iterator.hasNext()){
              System.out.println(iterator.next());
          }
          if (iterator.hasNext()){
              System.out.println(iterator.next());
          }
          if(iterator.hasPrevious()){
              System.out.println(iterator.previous());
          }
          if(iterator.hasPrevious()){
              iterator.previous();

              iterator.next();
              System.out.println(iterator.next());
          }
          System.out.println(playlist);
          System.out.println("Удаляем");
          iterator.remove();
          System.out.println(playlist);
          Collections.shuffle(playlist);
          System.out.println(playlist);
    }

}
