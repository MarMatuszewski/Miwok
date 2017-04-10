package com.example.android.miwok;

/**
 * Created by Matusz on 06.04.2017.
 */

public class Word {

    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImageResourceId = IMAGE_RESOURCE_ID;
    private static final int IMAGE_RESOURCE_ID = -1;
    private int mAudioResourceId;

    public Word(String englishTranslation, String miwokTranslation, int audioResourceId){
        this.mMiwokTranslation = miwokTranslation;
        this.mEnglishTranslation = englishTranslation;
        this.mAudioResourceId = audioResourceId;

    }

    public Word(String englishTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        this.mMiwokTranslation = miwokTranslation;
        this.mEnglishTranslation = englishTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getEnglishTranslation(){
        return mEnglishTranslation;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage(){
        return mImageResourceId != IMAGE_RESOURCE_ID;
    }

    public int getAudioResourceId() { return mAudioResourceId; }
}
