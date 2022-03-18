package com.bytedance.ee.bear.sheet.panel;

import android.text.TextUtils;
import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SheetItem implements NonProguard {
    protected boolean adminLimit;
    protected boolean enable;
    protected String groupId;
    protected GroupPosition groupPosition = GroupPosition.SINGLE;
    protected String id;
    protected SheetItem[] items;
    protected String[] list;
    protected int max = -1;
    protected int min = -1;
    protected boolean selected;
    protected String title;
    protected String value;

    public enum GroupPosition {
        SINGLE,
        TOP,
        CENTER,
        BOTTOM
    }

    public String getGroupId() {
        return this.groupId;
    }

    public GroupPosition getGroupPosition() {
        return this.groupPosition;
    }

    public String getId() {
        return this.id;
    }

    public SheetItem[] getItems() {
        return this.items;
    }

    public String[] getList() {
        return this.list;
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    public String getTitle() {
        return this.title;
    }

    public String getValue() {
        return this.value;
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

    public int getCurrentIndex() {
        return indexOf(this.value);
    }

    public int valueRange() {
        String[] strArr = this.list;
        if (strArr != null) {
            return strArr.length;
        }
        return (this.max - this.min) + 1;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (getId() != null) {
            i = getId().hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        if (getTitle() != null) {
            i2 = getTitle().hashCode();
        } else {
            i2 = 0;
        }
        int min2 = (((((((((((i5 + i2) * 31) + (isSelected() ? 1 : 0)) * 31) + (isEnable() ? 1 : 0)) * 31) + (isAdminLimit() ? 1 : 0)) * 31) + getMin()) * 31) + getMax()) * 31;
        if (getValue() != null) {
            i3 = getValue().hashCode();
        } else {
            i3 = 0;
        }
        int hashCode = (((((min2 + i3) * 31) + Arrays.hashCode(getList())) * 31) + Arrays.hashCode(getItems())) * 31;
        if (getGroupId() != null) {
            i4 = getGroupId().hashCode();
        }
        return hashCode + i4;
    }

    public String toString() {
        return "SheetItem{id='" + this.id + '\'' + ", title='" + this.title + '\'' + ", selected=" + this.selected + ", enable=" + this.enable + ", min=" + this.min + ", max=" + this.max + ", value='" + this.value + '\'' + ", list=" + Arrays.toString(this.list) + ", items=" + Arrays.toString(this.items) + ", adminLimit=" + this.adminLimit + ", groupId=" + this.groupId + '\'' + ", groupPosition=" + this.groupPosition + '}';
    }

    public void setAdminLimit(boolean z) {
        this.adminLimit = z;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setGroupPosition(GroupPosition groupPosition2) {
        this.groupPosition = groupPosition2;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setItems(SheetItem[] sheetItemArr) {
        this.items = sheetItemArr;
    }

    public void setList(String[] strArr) {
        this.list = strArr;
    }

    public void setMax(int i) {
        this.max = i;
    }

    public void setMin(int i) {
        this.min = i;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public int indexOf(String str) {
        if (this.list != null && str != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.list;
                if (i >= strArr.length) {
                    break;
                } else if (TextUtils.equals(strArr[i], str)) {
                    return i;
                } else {
                    i++;
                }
            }
        }
        if (!(this.min == -1 || this.max == -1)) {
            try {
                return Integer.valueOf(str).intValue() - this.min;
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public String valueAt(int i) {
        if (i >= 0 && i < valueRange()) {
            String[] strArr = this.list;
            if (strArr != null) {
                return strArr[i];
            }
            int i2 = this.min;
            if (!(i2 == -1 || this.max == -1)) {
                return String.valueOf(i2 + i);
            }
        }
        return this.value;
    }

    public static void sortByGroupId(SheetItem[] sheetItemArr) {
        if (sheetItemArr != null && sheetItemArr.length > 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            for (SheetItem sheetItem : sheetItemArr) {
                if (TextUtils.isEmpty(sheetItem.groupId)) {
                    sheetItem.setGroupId(sheetItem.id);
                }
                List list2 = (List) linkedHashMap.get(sheetItem.groupId);
                if (list2 == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(sheetItem);
                    linkedHashMap.put(sheetItem.groupId, arrayList);
                } else {
                    if (list2.size() == 1) {
                        ((SheetItem) list2.get(0)).setGroupPosition(GroupPosition.TOP);
                    }
                    if (list2.size() > 1) {
                        ((SheetItem) list2.get(list2.size() - 1)).setGroupPosition(GroupPosition.CENTER);
                    }
                    sheetItem.setGroupPosition(GroupPosition.BOTTOM);
                    list2.add(sheetItem);
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                for (SheetItem sheetItem2 : (List) entry.getValue()) {
                    sheetItemArr[i] = sheetItem2;
                    i++;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SheetItem)) {
            return false;
        }
        SheetItem sheetItem = (SheetItem) obj;
        if (isSelected() != sheetItem.isSelected() || isEnable() != sheetItem.isEnable() || isAdminLimit() != sheetItem.isAdminLimit() || getMin() != sheetItem.getMin() || getMax() != sheetItem.getMax()) {
            return false;
        }
        if (getId() == null ? sheetItem.getId() != null : !getId().equals(sheetItem.getId())) {
            return false;
        }
        if (getTitle() == null ? sheetItem.getTitle() != null : !getTitle().equals(sheetItem.getTitle())) {
            return false;
        }
        if (getValue() == null ? sheetItem.getValue() != null : !getValue().equals(sheetItem.getValue())) {
            return false;
        }
        if (getGroupId() == null ? sheetItem.getGroupId() != null : !getGroupId().equals(sheetItem.getGroupId())) {
            return false;
        }
        if (!Arrays.equals(getList(), sheetItem.getList())) {
            return false;
        }
        return Arrays.equals(getItems(), sheetItem.getItems());
    }
}
