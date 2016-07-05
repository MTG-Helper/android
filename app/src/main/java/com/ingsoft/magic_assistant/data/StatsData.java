package com.ingsoft.magic_assistant.data;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luciano on 03/07/16.
 */

public class StatsData implements Serializable {

    public int quantityDuels;
    public int quantityDuelsPerOpen;
    public int quantityDownloadedCardsImages;
    public int quantitySearchedCards;
    public int quantityUsedDice;
    public int quantityUsedCoin;
    public int quantityLifeVictories;
    public int quantityPoisonVictories;
    public DiceFacesRecord diceFacesRecord;

    public StatsData(int quantityDuels, int quantityDuelsPerOpen, int quantityDownloadedCardsImages, int quantitySearchedCards, int quantityUsedDice, int quantityUsedCoin, int quantityLifeVictories, int quantityPoisonVictories, DiceFacesRecord diceFacesRecord) {
        this.quantityDuels = quantityDuels;
        this.quantityDuelsPerOpen = quantityDuelsPerOpen;
        this.quantityDownloadedCardsImages = quantityDownloadedCardsImages;
        this.quantitySearchedCards = quantitySearchedCards;
        this.quantityUsedDice = quantityUsedDice;
        this.quantityUsedCoin = quantityUsedCoin;
        this.quantityLifeVictories = quantityLifeVictories;
        this.quantityPoisonVictories = quantityPoisonVictories;
        this.diceFacesRecord = diceFacesRecord;
    }

    public StatsData(){}

    public List<String> toStats(){
        List stats = new ArrayList<String>();
        stats.add("Cantidad de duelos: " + String.valueOf(quantityDuels));
        stats.add("Cantidad de duelos por partida: " + String.valueOf(quantityDuelsPerOpen));
        stats.add("Cantidad de imagenes de cartas descargadas: " + String.valueOf(quantityDownloadedCardsImages));
        stats.add("Cantidad de cartas buscadas: " + String.valueOf(quantitySearchedCards));
        stats.add("Cantidad de dados usados: " + String.valueOf(quantityUsedDice));
        stats.add("Cantidad de monedas usadas: " + String.valueOf(quantityUsedCoin));
        stats.add("Cantidad de victorias por vidas agotadas: " + String.valueOf(quantityLifeVictories));
        stats.add("Cantidad de victorias por venenos: " + String.valueOf(quantityPoisonVictories));
        return stats;
    }

    public void sum(StatsData other){
        quantityDuels += other.quantityDuels;
        quantityDuelsPerOpen += other.quantityDuelsPerOpen;
        quantityDownloadedCardsImages += other.quantityDownloadedCardsImages;
        quantitySearchedCards += other.quantitySearchedCards;
        quantityUsedDice += other.quantityUsedDice;
        quantityUsedCoin += other.quantityUsedCoin;
        quantityLifeVictories += other.quantityLifeVictories;
        quantityPoisonVictories += other.quantityPoisonVictories;
        //diceFacesRecord.sum(other.diceFacesRecord);
    }

}

