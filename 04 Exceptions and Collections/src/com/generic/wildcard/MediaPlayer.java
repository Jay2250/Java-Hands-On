package com.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    public void myPlayList(List<? extends Media> myplaylist)         //wild card operator (?)
    {
//        myplaylist.add(new Video());                               // Now this can add only the Song type data in the list
        //can not modify the list
        for(Media m : myplaylist)
        {
            m.play();
        }
    }

    public static void main(String[] args) {
        MediaPlayer media = new MediaPlayer();
        List<Song> list = new ArrayList<>();
        list.add(new Song(123,"hbak"));
        list.add(new Song(456,"kasgb"));
        list.add(new Song(789,"dad"));
//        list.add(new Video());

        media.myPlayList(list);
    }
}
