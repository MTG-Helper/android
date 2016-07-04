package com.ingsoft.magic_assistant.data;

import com.ingsoft.magic_assistant.services.StatsServiceDummy;
import com.ingsoft.magic_assistant.services.StatsServiceDummy.Stats;

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

    public List<SingleStats> toStats(){
        List stats = new ArrayList<SingleStats>();
        stats.add(new SingleStats("Cantidad de duelos" , quantityDuels));
        stats.add(new SingleStats("Cantidad de duelos por partida" , quantityDuelsPerOpen));
        stats.add(new SingleStats("Cantidad de imagenes de cartas descargadas" , quantityDownloadedCardsImages));
        stats.add(new SingleStats("Cantidad de cartas buscadas" , quantitySearchedCards));
        stats.add(new SingleStats("Cantidad de dados usados" , quantityUsedDice));
        stats.add(new SingleStats("Cantidad de monedas usadas" , quantityUsedCoin));
        stats.add(new SingleStats("Cantidad de victorias por vidas agotadas" , quantityLifeVictories));
        stats.add(new SingleStats("Cantidad de victorias por venenos" , quantityPoisonVictories));
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

