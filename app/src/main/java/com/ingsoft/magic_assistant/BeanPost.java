package com.ingsoft.magic_assistant;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class BeanPost implements Parcelable{

    @SerializedName("post_name")
    private String post_name;
    @SerializedName("auther")
    private String auther;
    @SerializedName("date")
    private String date;
    @SerializedName("description")
    private String description;

    public BeanPost(String post_name, String auther, String date, String description) {
        this.post_name = post_name;
        this.auther = auther;
        this.date = date;
        this.description = description;
    }

    protected BeanPost(Parcel in) {
        post_name = in.readString();
        auther = in.readString();
        date = in.readString();
        description = in.readString();
    }

    public static final Creator<BeanPost> CREATOR = new Creator<BeanPost>() {
        @Override
        public BeanPost createFromParcel(Parcel in) {
            return new BeanPost(in);
        }

        @Override
        public BeanPost[] newArray(int size) {
            return new BeanPost[size];
        }
    };

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(post_name);
        dest.writeString(auther);
        dest.writeString(date);
        dest.writeString(description);
    }

}