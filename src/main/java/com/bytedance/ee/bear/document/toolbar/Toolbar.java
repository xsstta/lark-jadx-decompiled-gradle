package com.bytedance.ee.bear.document.toolbar;

import com.bytedance.ee.bear.document.toolbar.ItemId;
import java.util.ArrayList;

public class Toolbar extends Item {
    private ItemId.AbstractC6203a[] supportedItems;

    public void setItems(Item[] itemArr) {
        setChildren(itemArr);
    }

    private ItemId findItemId(Item item) {
        return findItemId(item, this.supportedItems);
    }

    public void initFromJsBridge(ItemId.AbstractC6203a[] aVarArr) {
        this.supportedItems = aVarArr;
        initIds(getChildren());
        removeInvalidOrUnsupportedItems(this);
    }

    public boolean supportSubToolbar(ItemId itemId) {
        if (itemId.children() != null) {
            return true;
        }
        return false;
    }

    private void initIds(Item[] itemArr) {
        for (Item item : itemArr) {
            item.setItemId(findItemId(item));
            initIds(item.getChildren());
        }
    }

    /* access modifiers changed from: protected */
    public boolean adminLimit(ItemId itemId) {
        Item[] children = getChildren();
        boolean z = false;
        for (Item item : children) {
            if (item.id() == itemId) {
                z = item.isAdminLimit();
            }
        }
        return z;
    }

    public boolean contains(ItemId itemId) {
        Item[] children = getChildren();
        ItemId[] itemIdArr = new ItemId[children.length];
        for (int i = 0; i < children.length; i++) {
            itemIdArr[i] = children[i].id();
        }
        return contains(itemId, itemIdArr);
    }

    private void removeInvalidOrUnsupportedItems(Item item) {
        Item[] children = item.getChildren();
        if (children.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (Item item2 : children) {
                if (!(item2.id() instanceof ItemId.ConstId)) {
                    removeInvalidOrUnsupportedItems(item2);
                    arrayList.add(item2);
                }
            }
            setChildren(arrayList);
        }
    }

    public static <T extends Toolbar> boolean equals(T t, T t2) {
        if (t != null) {
            return t.equals(t2);
        }
        if (t2 == null) {
            return true;
        }
        return false;
    }

    private boolean contains(ItemId itemId, ItemId[] itemIdArr) {
        if (itemIdArr == null) {
            return false;
        }
        for (ItemId itemId2 : itemIdArr) {
            if (itemId == itemId2) {
                return true;
            }
        }
        for (ItemId itemId3 : itemIdArr) {
            if (contains(itemId, itemId3.children())) {
                return true;
            }
        }
        return false;
    }

    private ItemId findItemId(Item item, ItemId[] itemIdArr) {
        if (itemIdArr == null) {
            return ItemId.ConstId.unknown;
        }
        for (ItemId itemId : itemIdArr) {
            if (itemId.name().equals(item.getId())) {
                return itemId;
            }
        }
        for (ItemId itemId2 : itemIdArr) {
            ItemId findItemId = findItemId(item, itemId2.children());
            if (!(findItemId instanceof ItemId.ConstId)) {
                return findItemId;
            }
        }
        return ItemId.ConstId.unknown;
    }
}
