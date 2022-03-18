package com.bytedance.ee.bear.document.toolbar;

import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import java.util.Arrays;
import java.util.List;

public class Item implements BaseJSModel {
    private boolean adminLimit;
    private Item[] children;
    private boolean enable;
    private String id;
    private ItemId itemId;
    private String[] list;
    private boolean selected;
    private String value;

    public Item() {
    }

    public boolean isAdminLimit() {
        return this.adminLimit;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public String toString() {
        return this.id;
    }

    public Item[] getChildren() {
        Item[] itemArr = this.children;
        if (itemArr == null) {
            return new Item[0];
        }
        return itemArr;
    }

    public String getId() {
        String str = this.id;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String[] getList() {
        String[] strArr = this.list;
        if (strArr == null) {
            return new String[0];
        }
        return strArr;
    }

    public String getValue() {
        String str = this.value;
        if (str == null) {
            return "";
        }
        return str;
    }

    public ItemId id() {
        ItemId itemId2 = this.itemId;
        if (itemId2 == null) {
            return ItemId.ConstId.unknown;
        }
        return itemId2;
    }

    public int valueIndexInList() {
        return valueIndexInList(this.value);
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.id;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        ItemId itemId2 = this.itemId;
        if (itemId2 != null) {
            i2 = itemId2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return ((((((((((i5 + i3) * 31) + Arrays.hashCode(this.list)) * 31) + (this.enable ? 1 : 0)) * 31) + (this.selected ? 1 : 0)) * 31) + (this.adminLimit ? 1 : 0)) * 31) + Arrays.hashCode(this.children);
    }

    public void setAdminLimit(boolean z) {
        this.adminLimit = z;
    }

    public void setChildren(Item[] itemArr) {
        this.children = itemArr;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setItemId(ItemId itemId2) {
        this.itemId = itemId2;
    }

    public void setList(String[] strArr) {
        this.list = strArr;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public Item(ItemId itemId2) {
        this.id = itemId2.name();
        this.itemId = itemId2;
    }

    private int valueIndexInList(String str) {
        if (this.list == null || str == null) {
            return -1;
        }
        int i = 0;
        while (true) {
            String[] strArr = this.list;
            if (i >= strArr.length) {
                return 0;
            }
            if (str.equals(strArr[i])) {
                return i;
            }
            i++;
        }
    }

    public void setChildren(List<Item> list2) {
        if (list2 == null) {
            this.children = null;
            return;
        }
        Item[] itemArr = new Item[list2.size()];
        this.children = itemArr;
        list2.toArray(itemArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Item item = (Item) obj;
        if (this.enable != item.enable || this.selected != item.selected || this.adminLimit != item.adminLimit) {
            return false;
        }
        String str = this.id;
        if (str == null ? item.id != null : !str.equals(item.id)) {
            return false;
        }
        ItemId itemId2 = this.itemId;
        if (itemId2 == null ? item.itemId != null : !itemId2.equals(item.itemId)) {
            return false;
        }
        String str2 = this.value;
        if (str2 == null ? item.value != null : !str2.equals(item.value)) {
            return false;
        }
        if (!Arrays.equals(this.list, item.list)) {
            return false;
        }
        return Arrays.equals(this.children, item.children);
    }

    public String nextValueInList(String str, boolean z) {
        int i;
        int valueIndexInList = valueIndexInList(str);
        if (valueIndexInList < 0) {
            return str;
        }
        if (z) {
            i = valueIndexInList + 1;
        } else {
            i = valueIndexInList - 1;
        }
        String[] list2 = getList();
        if (i < 0 || i >= list2.length) {
            return str;
        }
        return list2[i];
    }
}
