package com.example.android.miwok;

public class Word {
    private String miwokWord;
    private String engWord;
    private int AudioResourceId;

    private int numMiwoImage=-1;
    private static final int hasImage=-1;



    public Word(String EngWord, String MiwoWord) {
        miwokWord = MiwoWord;
        engWord = EngWord;


    }
    public Word(String EngWord, String MiwoWord, int imageMiwo, int AudioId) {
        miwokWord = MiwoWord;
         numMiwoImage= imageMiwo;
        engWord = EngWord;
        AudioResourceId=AudioId;

    }
    public Word(String EngWord, String MiwoWord, int imageMiwo) {
        miwokWord = MiwoWord;
        numMiwoImage= imageMiwo;
        engWord = EngWord;
    }
    public String getMiwokWord(){
        return miwokWord;
    }
    public boolean hasImage(){
        return numMiwoImage!=hasImage;


    }
    public int getMiwoImage(){return numMiwoImage;}
    public String getEngWord(){
        return engWord;
    }
}
