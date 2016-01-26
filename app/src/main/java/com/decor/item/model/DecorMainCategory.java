package com.decor.item.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DecorMainCategory {
    public static final List<DecorItem> ITEMS = new ArrayList<DecorItem>();
    public static final Map<String, DecorItem> ITEM_MAP = new HashMap<String, DecorItem>();
    private static final ArrayList<String> itemCategory = new ArrayList<String>();
//  Replace static content with Dynamic content's of Decore
    private static final int COUNT = 3;
    static {
        addItemCategory();
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDecorItem(i));
        }
    }

    private static void addItemCategory() {
        itemCategory.add("Painting");
        itemCategory.add("Home Decor");
        itemCategory.add("Sculpture");
    }

    //  Make content adder dynamic
    private static void addItem(DecorItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DecorItem createDecorItem(int position) {
        return new DecorItem(String.valueOf(position), itemCategory.get(position-1), makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DecorItem {
        public final String id;
        public final String content;
        public final String details;

        public DecorItem(String id, String content, String details) {
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