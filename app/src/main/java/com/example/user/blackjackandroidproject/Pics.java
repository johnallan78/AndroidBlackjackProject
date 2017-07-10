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
    TENSPADES("Ten of Spades",10, R.drawable.s10),
    JACKSPADES("Jack of Spades", 10, R.drawable.s13),
    QUEENSPADES("Queen of Spades", 10, R.drawable.s12),
    KINGSPADES("King of Spades", 10, R.drawable.s11),
    ACECLUBS("Ace of Clubs",11, R.drawable.c1),
    TWOCLUBS("Two of Clubs",2, R.drawable.c2),
    THREECLUBS("Three of Clubs",3, R.drawable.c3),
    FOURCLUBS("Four of Clubs",4, R.drawable.c4),
    FIVECLUBS("Five of Clubs",5, R.drawable.c5),
    SIXCLUBS("Six of Clubs",6, R.drawable.c6),
    SEVENCLUBS("Seven of Clubs",7, R.drawable.c7),
    EIGHTCLUBS("Eight of Clubs",8, R.drawable.c8),
    NINECLUBS("Nine of Clubs",9, R.drawable.c9),
    TENCLUBS("Ten of Clubs",10, R.drawable.c10),
    JACKCLUBS("Jack of Clubs", 10, R.drawable.c13),
    QUEENCLUBS("Queen of Clubs", 10, R.drawable.c12),
    KINGCLUBS("King of Clubs", 10, R.drawable.c11),
    ACEDI("Ace of Diamonds",11, R.drawable.d1),
    TWODI("Two of Diamonds",2, R.drawable.d2),
    THREEDI("Three of Diamonds",3, R.drawable.d3),
    FOURDI("Four of Diamonds",4, R.drawable.d4),
    FIVEDI("Five of Diamonds",5, R.drawable.d5),
    SIXDI("Six of Diamonds",6, R.drawable.d6),
    SEVENDI("Seven of Diamonds",7, R.drawable.d7),
    EIGHTDI("Eight of Diamonds",8, R.drawable.d8),
    NINEDI("Nine of Diamonds",9, R.drawable.d9),
    TENDI("Ten of Diamonds",10, R.drawable.d10),
    JACKDI("Jack of Diamonds", 10, R.drawable.d13),
    QUEENDI("Queen of Diamonds", 10, R.drawable.d12),
    KINGDI("King of Diamonds", 10, R.drawable.d11),
    ACEH("Ace of Hearts",11, R.drawable.h1),
    TWOH("Two of Hearts",2, R.drawable.h2),
    THREEH("Three of Hearts",3, R.drawable.h3),
    FOURH("Four of Hearts",4, R.drawable.h4),
    FIVEH("Five of Hearts",5, R.drawable.h5),
    SIXH("Six of Hearts",6, R.drawable.h6),
    SEVENH("Seven of Hearts",7, R.drawable.h7),
    EIGHTH("Eight of Hearts",8, R.drawable.h8),
    NINEH("Nine of Hearts",9, R.drawable.h9),
    TENH("Ten of Hearts",10, R.drawable.h10),
    JACKH("Jack of Hearts", 10, R.drawable.h13),
    QUEENH("Queen of Hearts", 10, R.drawable.h12),
    KINGH("King of Hearts", 10, R.drawable.h11);





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
