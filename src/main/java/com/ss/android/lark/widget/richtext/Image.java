package com.ss.android.lark.widget.richtext;

import com.larksuite.framework.utils.CollectionUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Image implements Serializable {
    private static final long serialVersionUID = -2514439118477067808L;
    private int height;
    private boolean isAvatar;
    private String key = "";
    private String token;
    private Type type = Type.ENCRYPTED;
    private List<String> urls = new ArrayList();
    private int width;

    public enum Type {
        NORMAL(1),
        ENCRYPTED(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 1) {
                return NORMAL;
            }
            if (i != 2) {
                return null;
            }
            return ENCRYPTED;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public int getHeight() {
        return this.height;
    }

    public String getKey() {
        return this.key;
    }

    public String getToken() {
        return this.token;
    }

    public Type getType() {
        return this.type;
    }

    public List<String> getUrls() {
        return this.urls;
    }

    public int getWidth() {
        return this.width;
    }

    public String getFirstUrl() {
        if (CollectionUtils.isNotEmpty(this.urls)) {
            return this.urls.get(0);
        }
        return "";
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(Type type2) {
        this.type = type2;
    }

    public void setUrls(List<String> list) {
        this.urls = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
