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
    private static final ArrayList<String> itemCategory = new ArrayList<String>();
//  Replace static content with Dynamic content's of Decore
    private static final int COUNT = 3;
    static {
        addItemCategory();
    }

    private static void addItemCategory() {
        itemCategory.add("Painting");
        itemCategory.add("Home Decor");
        itemCategory.add("Sculpture");
    }

    public ArrayList getItemCategory(){
        return this.itemCategory;
    }
}