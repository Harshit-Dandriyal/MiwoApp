package com.example.android.miwok;

public class Word {
    private String miwokWord;
    private String engWord;

    private int numMiwoImage;


    public Word(String EngWord, String MiwoWord) {
        miwokWord = MiwoWord;
        engWord = EngWord;


    }
    public Word(String EngWord, String MiwoWord, int imageMiwo) {
        miwokWord = MiwoWord;
         numMiwoImage= imageMiwo;
        engWord = EngWord;


    }
    public String getMiwokWord(){
        return miwokWord;
    }
    public int getMiwoImage(){return numMiwoImage;}
    public String getEngWord(){
        return engWord;
    }
}
