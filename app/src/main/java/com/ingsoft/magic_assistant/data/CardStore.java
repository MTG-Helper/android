package com.ingsoft.magic_assistant.data;

import android.content.Context;
import com.ingsoft.magic_assistant.R;

import java.util.ArrayList;
import java.util.List;


public class CardStore {

    public static List<Card> getAll(Context ctx) {

        List<Card> cards = new ArrayList<>();

        cards.add(new Card(ctx, "Franz Vohwinkel", 4, "", "", "For some customers, the old apothecary shop still opens its doors.", "217kljadw", "apothecary geist", "normal", "{3}{W}", 409740, "Apothecary Geist", "4", "2", "Common", "", "Flying When Aphothecary Geist enters the battlefield, if you control another Spirit, you gain 3 life.", "3", "Creature -- Spirit", ""));

        cards.add(new Card(ctx, "James Ryman", 5, "", "", "Wings that once bore hope are now stained with blood", "3509290fs", "avacyn, the purifier", "double-faced", "{3}{W}", 409742, "Avancyn, the Purifier", "4", "2", "Mythic Rare", "", "Flying When this creature transform into Avacyn.", "5", "Legendary Creature -- Angel", ""));
        cards.add(new Card(ctx, "Juan Perez", 6, "", "", "Para algunos usuarios rompe tablero .", "217k5243dw", "gaucho rojo", "normal", "{2}{W}", 401740, "Gaucho Rojo", "7", "2", "Common", "", "Cuando entra en tablero suma 3 salud.", "3", "Creature -- Spirit", ""));


/*
        cards.add(new Card(ctx, R.string.disc_fencing, R.string.schedule_1, 1, 100, R.drawable.ic_fencing, R.string.disc_fencing_desc));
        cards.add(new Card(ctx, R.string.disc_fire, R.string.schedule_2, 1, 100, R.drawable.ic_fire, R.string.disc_fire_desc));
        cards.add(new Card(ctx, R.string.disc_gaming, R.string.schedule_3, 1, 100, R.drawable.ic_gaming, R.string.disc_gaming_desc));
        cards.add(new Card(ctx, R.string.disc_racing, R.string.schedule_4, 1, 100, R.drawable.ic_racing, R.string.disc_racing_desc));
        cards.add(new Card(ctx, R.string.disc_reading, R.string.schedule_1, 1, 100, R.drawable.ic_reading, R.string.disc_reading_desc));
        cards.add(new Card(ctx, R.string.disc_relay_race, R.string.schedule_2, 1, 100, R.drawable.ic_relay_race, R.string.disc_relay_race_desc));
        cards.add(new Card(ctx, R.string.disc_shooting, R.string.schedule_3, 1, 100, R.drawable.ic_shooting, R.string.disc_shooting_desc));
        cards.add(new Card(ctx, R.string.disc_speed_running, R.string.schedule_4, 1, 100, R.drawable.ic_speed, R.string.disc_speed_running_desc));
        cards.add(new Card(ctx, R.string.disc_typing, R.string.schedule_1, 1, 100, R.drawable.ic_typing, R.string.disc_typing_desc));
        cards.add(new Card(ctx, R.string.disc_walking, R.string.schedule_2, 1, 100, R.drawable.ic_walking, R.string.disc_walking_desc));

        cards.add(new Card(ctx, R.string.disc_fencing, R.string.schedule_1, 2, 100, R.drawable.ic_fencing, R.string.disc_fencing_desc));
        cards.add(new Card(ctx, R.string.disc_fire, R.string.schedule_2, 2, 100, R.drawable.ic_fire, R.string.disc_fire_desc));
        cards.add(new Card(ctx, R.string.disc_gaming, R.string.schedule_3, 2, 100, R.drawable.ic_gaming, R.string.disc_gaming_desc));
        cards.add(new Card(ctx, R.string.disc_racing, R.string.schedule_4, 2, 100, R.drawable.ic_racing, R.string.disc_racing_desc));
        cards.add(new Card(ctx, R.string.disc_reading, R.string.schedule_1, 2, 100, R.drawable.ic_reading, R.string.disc_reading_desc));
        cards.add(new Card(ctx, R.string.disc_relay_race, R.string.schedule_2, 2, 100, R.drawable.ic_relay_race, R.string.disc_relay_race_desc));
        cards.add(new Card(ctx, R.string.disc_shooting, R.string.schedule_3, 2, 100, R.drawable.ic_shooting, R.string.disc_shooting_desc));
        cards.add(new Card(ctx, R.string.disc_speed_running, R.string.schedule_4, 2, 100, R.drawable.ic_speed, R.string.disc_speed_running_desc));
        cards.add(new Card(ctx, R.string.disc_typing, R.string.schedule_1, 2, 100, R.drawable.ic_typing, R.string.disc_typing_desc));
        cards.add(new Card(ctx, R.string.disc_walking, R.string.schedule_2, 2, 100, R.drawable.ic_walking, R.string.disc_walking_desc));
*/

        return cards;
    }

    public static List<Card> filtrar(List<Card> disciplinas,String nombre) {
       List<Card> cartasADevolver = new ArrayList<Card>();

        for (Card a_card : disciplinas) {
            if(a_card.equals(nombre)){
                cartasADevolver.add(a_card);
            }
        }
        return cartasADevolver;
    }
}
