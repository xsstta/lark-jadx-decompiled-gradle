package com.bytedance.ee.bear.bitable.panel;

import android.text.TextUtils;
import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class BitablePanelModel implements NonProguard {
    private BitablePanelItem bottomFixedData;
    private BitablePanelItem[] data;
    private String title;

    public static class BitablePanelItem implements NonProguard {
        private boolean active;
        private String groupId;
        private GroupPosition groupPosition = GroupPosition.SINGLE;
        private String id;
        private String leftIconId;
        private String tableId;
        private String text;
        private String viewId;

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

        public String getLeftIconId() {
            return this.leftIconId;
        }

        public String getTableId() {
            return this.tableId;
        }

        public String getText() {
            return this.text;
        }

        public String getViewId() {
            return this.viewId;
        }

        public boolean isActive() {
            return this.active;
        }

        public BitablePanelItem() {
        }

        public EPanelItemIcon getEPanelLeftIcon() {
            return EPanelItemIcon.getEPanelItemIconById(this.leftIconId);
        }

        public String toString() {
            return "Item{active=" + this.active + ", id='" + this.id + '\'' + '}';
        }

        public void setActive(boolean z) {
            this.active = z;
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

        public void setLeftIconId(String str) {
            this.leftIconId = str;
        }

        public void setTableId(String str) {
            this.tableId = str;
        }

        public void setText(String str) {
            this.text = str;
        }

        public void setViewId(String str) {
            this.viewId = str;
        }

        public static void sortByGroupId(BitablePanelItem[] bitablePanelItemArr) {
            if (bitablePanelItemArr != null && bitablePanelItemArr.length > 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i = 0;
                for (BitablePanelItem bitablePanelItem : bitablePanelItemArr) {
                    if (TextUtils.isEmpty(bitablePanelItem.groupId)) {
                        bitablePanelItem.setGroupId(bitablePanelItem.id);
                    }
                    List list = (List) linkedHashMap.get(bitablePanelItem.groupId);
                    if (list == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(bitablePanelItem);
                        linkedHashMap.put(bitablePanelItem.groupId, arrayList);
                    } else {
                        if (list.size() == 1) {
                            ((BitablePanelItem) list.get(0)).setGroupPosition(GroupPosition.TOP);
                        }
                        if (list.size() > 1) {
                            ((BitablePanelItem) list.get(list.size() - 1)).setGroupPosition(GroupPosition.CENTER);
                        }
                        bitablePanelItem.setGroupPosition(GroupPosition.BOTTOM);
                        list.add(bitablePanelItem);
                    }
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    for (BitablePanelItem bitablePanelItem2 : (List) entry.getValue()) {
                        bitablePanelItemArr[i] = bitablePanelItem2;
                        i++;
                    }
                }
            }
        }

        public BitablePanelItem(boolean z, String str, String str2, String str3, String str4, boolean z2) {
            this.active = z;
            this.id = str;
            this.text = str2;
            this.tableId = str3;
            this.viewId = str4;
        }
    }

    public BitablePanelItem getBottomFixedData() {
        return this.bottomFixedData;
    }

    public BitablePanelItem[] getData() {
        return this.data;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (Objects.hash(this.title, this.bottomFixedData) * 31) + Arrays.hashCode(this.data);
    }

    public String toString() {
        return "BitablePanelModel{title='" + this.title + '\'' + ", data=" + Arrays.toString(this.data) + ", bottomFixedData=" + this.bottomFixedData + '}';
    }

    public void setBottomFixedData(BitablePanelItem bitablePanelItem) {
        this.bottomFixedData = bitablePanelItem;
    }

    public void setData(BitablePanelItem[] bitablePanelItemArr) {
        this.data = bitablePanelItemArr;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public static boolean isValid(BitablePanelModel bitablePanelModel) {
        BitablePanelItem[] bitablePanelItemArr;
        if (bitablePanelModel == null || (bitablePanelItemArr = bitablePanelModel.data) == null || bitablePanelItemArr.length <= 0) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BitablePanelModel bitablePanelModel = (BitablePanelModel) obj;
        if (!Objects.equals(this.title, bitablePanelModel.title) || !Arrays.equals(this.data, bitablePanelModel.data) || !Objects.equals(this.bottomFixedData, bitablePanelModel.bottomFixedData)) {
            return false;
        }
        return true;
    }
}
