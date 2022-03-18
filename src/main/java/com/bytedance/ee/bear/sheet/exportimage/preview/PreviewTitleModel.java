package com.bytedance.ee.bear.sheet.exportimage.preview;

import com.bytedance.ee.util.io.NonProguard;

public class PreviewTitleModel implements NonProguard {
    private Item rightItem;
    private Item titleItem;

    public static class Item implements NonProguard {
        String id;
        String text;

        public String getId() {
            return this.id;
        }

        public String getText() {
            return this.text;
        }

        public String toString() {
            return "Item{text='" + this.text + '\'' + ", id='" + this.id + '\'' + '}';
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setText(String str) {
            this.text = str;
        }
    }

    public Item getRightItem() {
        return this.rightItem;
    }

    public Item getTitleItem() {
        return this.titleItem;
    }

    public String toString() {
        return "PreviewTitleModel{rightItem=" + this.rightItem + ", titleItem=" + this.titleItem + '}';
    }

    public void setRightItem(Item item) {
        this.rightItem = item;
    }

    public void setTitleItem(Item item) {
        this.titleItem = item;
    }
}
