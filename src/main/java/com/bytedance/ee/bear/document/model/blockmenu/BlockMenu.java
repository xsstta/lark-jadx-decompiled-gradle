package com.bytedance.ee.bear.document.model.blockmenu;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import java.util.Objects;

public class BlockMenu implements NonProguard {
    List<MenuItem> items;

    public static class MenuItem implements NonProguard {
        String id;
        String text;

        public MenuItem() {
        }

        public String getId() {
            return this.id;
        }

        public String getText() {
            return this.text;
        }

        public int hashCode() {
            return Objects.hash(this.id, this.text);
        }

        public String toString() {
            return "MenuItem{id='" + this.id + '\'' + ", text='" + this.text + '\'' + '}';
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setText(String str) {
            this.text = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MenuItem menuItem = (MenuItem) obj;
            if (!Objects.equals(this.id, menuItem.id) || !Objects.equals(this.text, menuItem.text)) {
                return false;
            }
            return true;
        }

        public MenuItem(BlockMenuId blockMenuId, String str) {
            this.id = blockMenuId.name();
            this.text = str;
        }
    }

    public List<MenuItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        return Objects.hash(this.items);
    }

    public String toString() {
        return "BlockShortcutMenu{items=" + this.items + '}';
    }

    public void setItems(List<MenuItem> list) {
        this.items = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.items, ((BlockMenu) obj).items);
    }
}
