package com.bytedance.ee.bear.middleground.calendar.toolbar;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class ToolbarModel implements NonProguard {
    private List<ToolbarItem> items;

    public static class ToolbarItem implements NonProguard {
        private boolean enable;
        private String id;
        private String name;
        private boolean selected;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public boolean isEnable() {
            return this.enable;
        }

        public boolean isSelected() {
            return this.selected;
        }

        public void setEnable(boolean z) {
            this.enable = z;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setSelected(boolean z) {
            this.selected = z;
        }
    }

    public List<ToolbarItem> getItems() {
        return this.items;
    }

    public void setItems(List<ToolbarItem> list) {
        this.items = list;
    }
}
