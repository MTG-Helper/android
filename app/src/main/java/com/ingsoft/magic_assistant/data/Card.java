package com.ingsoft.magic_assistant.data;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;


public class Card implements Parcelable{


    private int cmc = 0;
    private String colorIdentity = "";//ver :es una lista
    private String colors = ""; //ver : es una lista
    private String flavor = "";
    private String id = "";
    private String imageName = "";
    private String layout = "";
    private String manaCost = "";
    private int multiverseid = 0;
    private String name = "";
    private String number = "";
    private String power = "";
    private String rarity = "";
    private String subtypes = ""; //ver: una lista
    private String text = "";
    private String toughness = "";
    private String type = "";
    private String types = "";//ver: es lista

    private String artist = "";



    public Card(Context ctx, String artist,int cmc,String colorIdentity,String colors,String flavor,String id,String imageName,
                String layout,String manaCost,int multiverseid,String name,String number,String power,
                String rarity,String subtypes,String text,String toughness,String type,String types ) {
        this(
                artist,
                cmc,
                colorIdentity,
                colors,
                flavor,
                id,
                imageName,
                layout,
                manaCost,
                multiverseid,
                name,
                number,
                power,
                rarity,
                subtypes,
                text,
                toughness,
                type,
                types
        );}


    protected Card(Parcel in){
        artist = in.readString();
        cmc = in.readInt();
        colorIdentity = in.readString();
        colors = in.readString();
        flavor = in.readString();
        id = in.readString();
        imageName = in.readString();
        layout = in.readString();
        manaCost = in.readString();
        multiverseid = in.readInt();
        name = in.readString();
        number = in.readString();
        power = in.readString();
        rarity = in.readString();
        subtypes = in.readString();
        text = in.readString();
        toughness = in.readString();
        type = in.readString();
        types = in.readString();

    }

    public static final Creator<Card> CREATOR = new Creator<Card>() {
        @Override
        public Card createFromParcel(Parcel in) {
            return new Card(in);
        }

        @Override
        public Card[] newArray(int size) {
            return new Card[size];
        }
    };

    public Card(String artist, int cmc, String colorIdentity, String colors, String flavor, String id, String imageName, String layout, String manaCost, int multiverseid, String name, String number, String power, String rarity, String subtypes, String text, String toughness, String type, String types) {
        this.artist = artist;
        this.cmc = cmc;
        this.colorIdentity = colorIdentity;
        this.colors = colors;
        this.flavor = flavor;
        this.id = id;
        this.imageName = imageName;
        this.layout = layout;
        this.manaCost = manaCost;
        this.multiverseid = multiverseid;
        this.name = name;
        this.number = number;
        this.power = power;
        this.rarity = rarity;
        this.subtypes = subtypes;
        this.text = text;
        this.toughness = toughness;
        this.type = type;
        this.types = types;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {


        dest.writeString(artist);
        dest.writeInt(cmc);
        dest.writeString(colorIdentity);
        dest.writeString(colors);
        dest.writeString(flavor);
        dest.writeString(id);
        dest.writeString(imageName);
        dest.writeString(layout);
        dest.writeString(manaCost);
        dest.writeInt(multiverseid);
        dest.writeString(name);
        dest.writeString(number);
        dest.writeString(power);
        dest.writeString(rarity);
        dest.writeString(subtypes);
        dest.writeString(text);
        dest.writeString(toughness);
        dest.writeString(type);
        dest.writeString(types);
    }



    public boolean equals(String string){

        return name.toLowerCase().contains(string.toLowerCase());
    }

    public String getArtist() {
        return artist;
    }

    public int getCmc() {
        return cmc;
    }

    public String getColorIdentity() {
        return colorIdentity;
    }

    public String getColors() {
        return colors;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getId() {
        return id;
    }

    public String getImageName() {
        return imageName;
    }

    public String getLayout() {
        return layout;
    }

    public String getManaCost() {
        return manaCost;
    }

    public int getMultiverseid() {
        return multiverseid;
    }

    public String getNumber() {
        return number;
    }

    public String getPower() {
        return power;
    }

    public String getRarity() {
        return rarity;
    }

    public String getSubtypes() {
        return subtypes;
    }

    public String getText() {
        return text;
    }

    public String getToughness() {
        return toughness;
    }

    public String getType() {
        return type;
    }

    public String getTypes() {
        return types;
    }

    public String getName() {
        return name;
    }


    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setCmc(int cmc) {
        this.cmc = cmc;
    }

    public void setColorIdentity(String colorIdentity) {
        this.colorIdentity = colorIdentity;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public void setMultiverseid(int multiverseid) {
        this.multiverseid = multiverseid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void setSubtypes(String subtypes) {
        this.subtypes = subtypes;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTypes(String types) {
        this.types = types;
    }

}


/*
     //--param--
       artist
       cmc
       colorIdentity
       colors
       flavor
       id
       imageName
       layout
       manaCost
       multiverseid
       name
       number
       power
       rarity
       subtypes
       text
       toughness
       type
       types

*/