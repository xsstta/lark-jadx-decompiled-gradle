package com.bytedance.ee.bear.sheet.tab.jsdata;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Arrays;

public class SheetModalPanelData implements NonProguard {
    private ModalItem[] items;
    private String title;

    public static class ModalItem implements NonProguard {
        private boolean enable;
        private String groupId;
        private String id;
        private boolean isShowLeftIcon;
        private RightIconsItem[] rightIcons;
        private String tableId;
        private String title;

        public ModalItem() {
        }

        public String getGroupId() {
            return this.groupId;
        }

        public String getId() {
            return this.id;
        }

        public RightIconsItem[] getRightIcons() {
            return this.rightIcons;
        }

        public String getTableId() {
            return this.tableId;
        }

        public String getTitle() {
            return this.title;
        }

        public boolean isEnable() {
            return this.enable;
        }

        public boolean isShowLeftIcon() {
            return this.isShowLeftIcon;
        }

        public String toString() {
            return "Item{enable=" + this.enable + ", id='" + this.id + '\'' + ", title='" + this.title + '\'' + ", tableId='" + this.tableId + '\'' + ", isShowLeftIcon=" + this.isShowLeftIcon + ", groupId=" + this.groupId + ", rightIcons=" + Arrays.toString(this.rightIcons) + '}';
        }

        public void setEnable(boolean z) {
            this.enable = z;
        }

        public void setGroupId(String str) {
            this.groupId = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setRightIcons(RightIconsItem[] rightIconsItemArr) {
            this.rightIcons = rightIconsItemArr;
        }

        public void setShowLeftIcon(boolean z) {
            this.isShowLeftIcon = z;
        }

        public void setTableId(String str) {
            this.tableId = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public ModalItem(boolean z, String str, String str2, String str3, boolean z2) {
            this.enable = z;
            this.id = str;
            this.title = str2;
            this.tableId = str3;
            this.isShowLeftIcon = z2;
        }
    }

    public static class RightIconsItem implements NonProguard {
        private boolean enable;
        private String id;

        public String getId() {
            return this.id;
        }

        public boolean isEnable() {
            return this.enable;
        }

        public String toString() {
            return "RightIconsItem{id='" + this.id + '\'' + ", enable=" + this.enable + '}';
        }

        public void setEnable(boolean z) {
            this.enable = z;
        }

        public void setId(String str) {
            this.id = str;
        }
    }

    public ModalItem[] getItems() {
        return this.items;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "ModelViewData{title='" + this.title + '\'' + ", items=" + Arrays.toString(this.items) + '}';
    }

    public void setItems(ModalItem[] modalItemArr) {
        this.items = modalItemArr;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public static boolean isValid(SheetModalPanelData sheetModalPanelData) {
        ModalItem[] modalItemArr;
        if (sheetModalPanelData == null || (modalItemArr = sheetModalPanelData.items) == null || modalItemArr.length <= 0) {
            return false;
        }
        return true;
    }
}
