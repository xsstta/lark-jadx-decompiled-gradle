package com.bytedance.ee.bear.lark.announcement.moredialog;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class MoreDialogModel implements NonProguard {
    private List<MoreDialogItem> items;

    public static class MoreDialogItem implements NonProguard {
        private boolean enable;
        private String id;
        private String text;

        public String getId() {
            return this.id;
        }

        public String getText() {
            return this.text;
        }

        public boolean isEnable() {
            return this.enable;
        }

        public String toString() {
            return "MoreDialogItem{id='" + this.id + '\'' + ", text='" + this.text + '\'' + ", enable=" + this.enable + '}';
        }

        public void setEnable(boolean z) {
            this.enable = z;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setText(String str) {
            this.text = str;
        }
    }

    public List<MoreDialogItem> getItems() {
        return this.items;
    }

    public String toString() {
        return "MoreDialogModel{items=" + this.items + '}';
    }

    public void setItems(List<MoreDialogItem> list) {
        this.items = list;
    }
}
