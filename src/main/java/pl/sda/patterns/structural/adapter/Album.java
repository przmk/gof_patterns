package pl.sda.patterns.structural.adapter;

import java.util.List;

interface Album {
    List<String> listOfSongs();
    String front();
}
