package com.example.user.blackjackandroidproject;

import static android.R.attr.name;

/**
 * Created by user on 10/07/2017.
 */

public enum Pics {

    ACESPADES(11, R.drawable.s1),
    TWOSPADES(2, R.drawable.s2),
    THREESPADES(3, R.drawable.s3),
    FOURSPADES(4, R.drawable.s4),
    FIVESPADES(5, R.drawable.s5),
    SIXSPADES(6, R.drawable.s6),
    SEVENSPADES(7, R.drawable.s7),
    EIGHTSPADES(8, R.drawable.s8),
    NINESPADES(9, R.drawable.s9),
    TENSPADES(10, R.drawable.s10),
    JACKSPADES( 10, R.drawable.s13),
    QUEENSPADES( 10, R.drawable.s12),
    KINGSPADES( 10, R.drawable.s11),
    ACECLUBS(11, R.drawable.c1),
    TWOCLUBS(2, R.drawable.c2),
    THREECLUBS(3, R.drawable.c3),
    FOURCLUBS(4, R.drawable.c4),
    FIVECLUBS(5, R.drawable.c5),
    SIXCLUBS(6, R.drawable.c6),
    SEVENCLUBS(7, R.drawable.c7),
    EIGHTCLUBS(8, R.drawable.c8),
    NINECLUBS(9, R.drawable.c9),
    TENCLUBS(10, R.drawable.c10),
    QUEENCLUBS(10, R.drawable.c12),
    KINGCLUBS(10, R.drawable.c11),
    ACEDI(11, R.drawable.d1),
    TWODI(2, R.drawable.d2),
    THREEDI(3, R.drawable.d3),
    FOURDI(4, R.drawable.d4),
    FIVEDI(5, R.drawable.d5),
    SIXDI(6, R.drawable.d6),
    SEVENDI(7, R.drawable.d7),
    EIGHTDI(8, R.drawable.d8),
    NINEDI(9, R.drawable.d9),
    TENDI(10, R.drawable.d10),
    JACKDI( 10, R.drawable.d13),
    QUEENDI(10, R.drawable.d12),
    KINGDI( 10, R.drawable.d11),
    ACEH(11, R.drawable.h1),
    TWOH(2, R.drawable.h2),
    THREEH(3, R.drawable.h3),
    FOURH(4, R.drawable.h4),
    FIVEH(5, R.drawable.h5),
    SIXH(6, R.drawable.h6),
    SEVENH(7, R.drawable.h7),
    EIGHTH(8, R.drawable.h8),
    NINEH(9, R.drawable.h9),
    TENH(10, R.drawable.h10),
    JACKH(10, R.drawable.h13),
    QUEENH(10, R.drawable.h12),
    KINGH(10, R.drawable.h11);






    private int value;
    private  int img;


private Pics( int value, int img){
    this.value = value;
    this.img = img;
    }


    public int getPic(){
        return img;
    }

    public int getValue(){
        return value;
    }


}
