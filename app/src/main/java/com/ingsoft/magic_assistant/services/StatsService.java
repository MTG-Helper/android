package com.ingsoft.magic_assistant.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class StatsService {

    /**
     * An array of sample (dummy) items.
     */
    public static List<Stats> ITEMS = new ArrayList<Stats>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, Stats> ITEM_MAP = new HashMap<String, Stats>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(Stats item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static Stats createDummyItem(int position) {
        return new Stats(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Detalles de sobre la estadistica: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Stats {
        public String id;
        public String content;
        public String details;

        public Stats(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
