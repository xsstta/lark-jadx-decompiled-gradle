package com.bytedance.ee.bear.document.oops;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class OopsModel implements NonProguard {
    private List<C6044Button> buttons;
    private String code;
    private String content;
    private String title;

    /* renamed from: com.bytedance.ee.bear.document.oops.OopsModel$Button */
    public static class C6044Button implements NonProguard {
        private int id;
        private String text;

        public int getId() {
            return this.id;
        }

        public String getText() {
            return this.text;
        }

        public void setId(int i) {
            this.id = i;
        }

        public void setText(String str) {
            this.text = str;
        }
    }

    public List<C6044Button> getButtons() {
        return this.buttons;
    }

    public String getCode() {
        return this.code;
    }

    public String getContent() {
        return this.content;
    }

    public String getTitle() {
        return this.title;
    }

    public void setButtons(List<C6044Button> list) {
        this.buttons = list;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
