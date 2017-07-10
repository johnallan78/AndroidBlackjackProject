package com.example.user.blackjackandroidproject;

/**
 * Created by user on 10/07/2017.
 */

public enum Pics {

    ACESPADES("Ace of Spades",11, R.drawable.s1),
    TWOSPADES("Two of Spades",2, R.drawable.s2),
    THREESPADES("Three of Spades",3, R.drawable.s3),
    FOURSPADES("Four of Spades",4, R.drawable.s4),
    FIVESPADES("Five of Spades",5, R.drawable.s5),
    SIXSPADES("Six of Spades",6, R.drawable.s6),
    SEVENSPADES("Seven of Spades",7, R.drawable.s7),
    EIGHTSPADES("Eight of Spades",8, R.drawable.s8),
    NINESPADES("Nine of Spades",9, R.drawable.s9),
    TENSPADES("Ten of Spades",10, R.drawable.s10);


    private String name;
    private int value;
    private  int img;


private Pics(String name, int value, int img){
    this.name = name;
    this.value = value;
    this.img = img;
    }


    public int getPic(){
        return img;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
