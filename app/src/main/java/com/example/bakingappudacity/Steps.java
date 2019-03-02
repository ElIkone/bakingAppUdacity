package com.example.bakingappudacity;

import android.os.Parcel;
import android.os.Parcelable;

public class Steps implements Parcelable {
    public  static final Parcelable.Creator<Steps> CREATOR
            = new Parcelable.Creator<Steps>() {
        public  Steps createFromParcel(Parcel in) {
            return new Steps(in);
        }
        public  Steps[] newArray(int size) {
            return new Steps[size];
        }
    };

    private int id;
    private String shortDescription;
    private String videoURL;
    private String thumbnailURL;

    public Steps(Parcel in) {
        id = in.readInt();
        shortDescription = in.readString();
        videoURL = in.readString();
        thumbnailURL = in.readString();
    }
    public Steps() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public String getThumbnailURL() {
        return thumbnailURL;
    }

    public void setThumbnailURL(String thumbnailURL) {
        this.thumbnailURL = thumbnailURL;
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(shortDescription);
        parcel.writeString(videoURL);
        parcel.writeString(thumbnailURL);
    }

    @Override
    public int describeContents() {
        return 0;
    }
}
