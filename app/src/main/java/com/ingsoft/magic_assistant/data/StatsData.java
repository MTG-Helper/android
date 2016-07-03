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

    public int quantityDuels					= 1;
    public int quantityDuelsPerOpen			= 0;
    public int quantityDownloadedCardsImages	= 0;
    public int quantitySearchedCards			= 0;
    public int quantityUsedDice				= 0;
    public int quantityUsedCoin				= 0;
    public int quantityLifeVictories			= 0;
    public int quantityPoisonVictories			= 0;
    public DiceFacesRecord diceFacesRecord		= new DiceFacesRecord();

    public List<Stats> toStats(){
        List stats = new ArrayList<Stats>();
        stats.add(quantityDuels);
        stats.add(quantityDuelsPerOpen);
        stats.add(quantityDownloadedCardsImages);
        stats.add(quantitySearchedCards);
        stats.add(quantityUsedDice);
        stats.add(quantityUsedCoin);
        stats.add(quantityLifeVictories);
        stats.add(quantityPoisonVictories);
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
        diceFacesRecord.sum(other.diceFacesRecord);
    }

}