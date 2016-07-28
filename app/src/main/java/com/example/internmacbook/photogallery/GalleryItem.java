package com.example.internmacbook.photogallery;

/**
 * Created by internmacbook on 7/28/16.
 */
public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mURl;


    @Override
    public String toString(){
        return mCaption;
    }

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getURl() {
        return mURl;
    }

    public void setURl(String URl) {
        mURl = URl;
    }


}
