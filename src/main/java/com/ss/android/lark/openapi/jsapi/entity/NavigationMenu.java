package com.ss.android.lark.openapi.jsapi.entity;

import java.util.List;

public class NavigationMenu implements BaseJSModel {
    private String backgroundColor;
    private List<MenuItem> items;
    private String textColor;

    public static class MenuItem implements BaseJSModel {
        private String iconId;
        private String id;
        private String imageBase64;
        private String text;

        public String getIconId() {
            return this.iconId;
        }

        public String getId() {
            return this.id;
        }

        public String getImageBase64() {
            return this.imageBase64;
        }

        public String getText() {
            return this.text;
        }

        public String toString() {
            return "id:" + this.id + "," + "iconId:" + this.iconId + "," + "text:" + this.text + "," + "imageBase64" + this.imageBase64 + ";";
        }

        public void setIconId(String str) {
            this.iconId = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setImageBase64(String str) {
            this.imageBase64 = str;
        }

        public void setText(String str) {
            this.text = str;
        }
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public List<MenuItem> getItems() {
        return this.items;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("backgroundColor:");
        sb.append(this.backgroundColor);
        sb.append("\n");
        sb.append("textColor:");
        sb.append(this.textColor);
        sb.append("\n");
        sb.append("menu items:\n");
        List<MenuItem> list = this.items;
        if (list != null) {
            for (MenuItem menuItem : list) {
                sb.append(menuItem.toString());
            }
        }
        return sb.toString();
    }

    public void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public void setItems(List<MenuItem> list) {
        this.items = list;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }
}
