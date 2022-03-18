package com.bytedance.ee.bear.document.model.toolbar;

import android.text.TextUtils;
import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.bear.document.model.toolbar.ItemV2;
import com.bytedance.ee.util.io.NonProguard;
import java.util.Arrays;

public class ToolbarV2 implements NonProguard {
    private ItemV2[] items;
    private String showingItemId;
    private int type;

    public ItemV2[] getItems() {
        return this.items;
    }

    public String getShowingItemId() {
        return this.showingItemId;
    }

    public int getType() {
        return this.type;
    }

    public boolean shouldShowSubToolbar() {
        ItemV2[] itemV2Arr = this.items;
        if (itemV2Arr == null || itemV2Arr.length <= 0) {
            return false;
        }
        ItemV2 itemV2 = itemV2Arr[0];
        if (TextUtils.isEmpty(this.showingItemId) || !this.showingItemId.equals(itemV2.id().name())) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "ToolbarV2{items=" + Arrays.toString(this.items) + ", type=" + this.type + ", showingItemId='" + this.showingItemId + '\'' + '}';
    }

    public void initFromJsBridge(ItemIdV2.AbstractC5875a[] aVarArr) {
        initIds(aVarArr);
    }

    public void setItems(ItemV2[] itemV2Arr) {
        this.items = itemV2Arr;
    }

    public void setShowingItemId(String str) {
        this.showingItemId = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public boolean supportSubToolbar(ItemIdV2 itemIdV2) {
        if (itemIdV2.displayMode() == ItemIdV2.DisplayMode.FunctionPanel) {
            return true;
        }
        return false;
    }

    public boolean contains(ItemIdV2 itemIdV2) {
        ItemV2[] itemV2Arr = this.items;
        ItemIdV2[] itemIdV2Arr = new ItemIdV2[itemV2Arr.length];
        for (int i = 0; i < itemV2Arr.length; i++) {
            itemIdV2Arr[i] = itemV2Arr[i].id();
        }
        return contains(itemIdV2, itemIdV2Arr);
    }

    private void initIds(ItemIdV2.AbstractC5875a[] aVarArr) {
        ItemV2[] itemV2Arr = this.items;
        if (!(itemV2Arr == null || itemV2Arr.length == 0)) {
            for (ItemV2 itemV2 : itemV2Arr) {
                ItemIdV2 findItemId = findItemId(itemV2, aVarArr);
                itemV2.setItemId(findItemId);
                ItemV2.Children children = itemV2.getChildren();
                if (!(children == null || children.getItems() == null)) {
                    ItemV2[] items2 = children.getItems();
                    for (ItemV2 itemV22 : items2) {
                        itemV22.setItemId(findItemId(itemV22, findItemId.children()));
                    }
                }
            }
        }
    }

    public static <T extends ToolbarV2> boolean equals(T t, T t2) {
        if (t != null) {
            return t.equals(t2);
        }
        if (t2 == null) {
            return true;
        }
        return false;
    }

    private ItemIdV2 findItemId(ItemV2 itemV2, ItemIdV2[] itemIdV2Arr) {
        if (itemIdV2Arr == null) {
            return ItemIdV2.ConstId.unknown;
        }
        for (ItemIdV2 itemIdV2 : itemIdV2Arr) {
            if (itemIdV2.name().equals(itemV2.getId())) {
                return itemIdV2;
            }
        }
        return ItemIdV2.ConstId.unknown;
    }

    private boolean contains(ItemIdV2 itemIdV2, ItemIdV2[] itemIdV2Arr) {
        if (itemIdV2Arr == null) {
            return false;
        }
        for (ItemIdV2 itemIdV22 : itemIdV2Arr) {
            if (itemIdV2 == itemIdV22) {
                return true;
            }
        }
        for (ItemIdV2 itemIdV23 : itemIdV2Arr) {
            if (contains(itemIdV2, itemIdV23.children())) {
                return true;
            }
        }
        return false;
    }
}
