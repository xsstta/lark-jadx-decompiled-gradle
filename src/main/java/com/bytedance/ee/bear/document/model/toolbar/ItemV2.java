package com.bytedance.ee.bear.document.model.toolbar;

import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.util.io.NonProguard;
import java.util.Arrays;
import java.util.Objects;

public class ItemV2 implements NonProguard {
    private boolean adminLimit;
    private Children children;
    private boolean enable;
    private String id;
    private ItemIdV2 itemId;
    private String[] list;
    private boolean selected;
    private String value;

    public static class Children implements NonProguard {
        private int count;
        private ItemV2[] items;
        private int orientationType;

        public int getCount() {
            return this.count;
        }

        public ItemV2[] getItems() {
            return this.items;
        }

        public int getOrientationType() {
            return this.orientationType;
        }

        public boolean isHorizontal() {
            if (this.orientationType == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((Arrays.hashCode(this.items) * 31) + Objects.hashCode(Integer.valueOf(this.count))) * 31) + Objects.hashCode(Integer.valueOf(this.orientationType));
        }

        public String toString() {
            return "Children{items=" + Arrays.toString(this.items) + ", count:" + this.count + ", orientationType" + this.orientationType + '}';
        }

        public void setCount(int i) {
            this.count = i;
        }

        public void setItems(ItemV2[] itemV2Arr) {
            this.items = itemV2Arr;
        }

        public void setOrientationType(int i) {
            this.orientationType = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Children children = (Children) obj;
            if (Arrays.equals(this.items, children.items) && this.count == children.count && this.orientationType == children.orientationType) {
                return true;
            }
            return false;
        }
    }

    public ItemV2() {
    }

    public Children getChildren() {
        return this.children;
    }

    public String[] getList() {
        return this.list;
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

    public String getId() {
        String str = this.id;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getValue() {
        String str = this.value;
        if (str == null) {
            return "";
        }
        return str;
    }

    public ItemIdV2 id() {
        ItemIdV2 itemIdV2 = this.itemId;
        if (itemIdV2 == null) {
            return ItemIdV2.ConstId.unknown;
        }
        return itemIdV2;
    }

    public int valueIndexInList() {
        return valueIndexInList(this.value);
    }

    public ItemV2[] getChildrenItems() {
        Children children2 = this.children;
        if (children2 == null || children2.getItems() == null) {
            return new ItemV2[0];
        }
        return this.children.getItems();
    }

    public int hashCode() {
        return Objects.hash(this.id, this.itemId, this.value, Boolean.valueOf(this.enable), Boolean.valueOf(this.adminLimit), Boolean.valueOf(this.selected), this.children, this.list);
    }

    public void setAdminLimit(boolean z) {
        this.adminLimit = z;
    }

    public void setChildren(Children children2) {
        this.children = children2;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setItemId(ItemIdV2 itemIdV2) {
        this.itemId = itemIdV2;
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

    public ItemV2(ItemIdV2 itemIdV2) {
        this.id = itemIdV2.name();
        this.itemId = itemIdV2;
    }

    public int valueIndexInList(String str) {
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ItemV2 itemV2 = (ItemV2) obj;
        if (this.enable != itemV2.enable || this.adminLimit != itemV2.adminLimit || this.selected != itemV2.selected || !Objects.equals(this.id, itemV2.id) || !Objects.equals(this.itemId, itemV2.itemId) || !Objects.equals(this.value, itemV2.value) || !Arrays.equals(this.list, itemV2.list) || !Objects.equals(this.children, itemV2.children)) {
            return false;
        }
        return true;
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
