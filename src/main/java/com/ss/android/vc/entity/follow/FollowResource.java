package com.ss.android.vc.entity.follow;

import java.io.Serializable;

public class FollowResource implements Serializable {
    private static final long serialVersionUID = 1;
    private String content;
    private String id;
    private boolean isEntry;
    private JsContext jsContext;
    private String path;
    private Type type;
    private String version;

    public enum JsContext {
        UNKNOWN(0),
        PREFER_PRELOAD(1),
        WEBVIEW(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static JsContext valueOf(int i) {
            return forNumber(i);
        }

        public static JsContext forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return PREFER_PRELOAD;
            }
            if (i != 2) {
                return null;
            }
            return WEBVIEW;
        }

        private JsContext(int i) {
            this.value = i;
        }
    }

    public enum Type {
        UNKNOWN(0),
        JS(1),
        JSON_STRING(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return JS;
            }
            if (i != 2) {
                return null;
            }
            return JSON_STRING;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public String getContent() {
        return this.content;
    }

    public String getId() {
        return this.id;
    }

    public JsContext getJsContext() {
        return this.jsContext;
    }

    public String getPath() {
        return this.path;
    }

    public Type getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isEntry() {
        return this.isEntry;
    }

    public String toString() {
        return "FollowResource{id='" + this.id + '\'' + ", version='" + this.version + '\'' + ", type=" + this.type + ", content='" + this.content + '\'' + ", path='" + this.path + '\'' + ", isEntry=" + this.isEntry + ", jsContext=" + this.jsContext + '}';
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setEntry(boolean z) {
        this.isEntry = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setJsContext(JsContext jsContext2) {
        this.jsContext = jsContext2;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setType(Type type2) {
        this.type = type2;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
