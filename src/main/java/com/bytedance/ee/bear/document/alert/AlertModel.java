package com.bytedance.ee.bear.document.alert;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class AlertModel implements NonProguard {
    private List<ButtonsBean> buttons;
    private boolean cancelable = true;
    private String input;
    private String message;
    private OptionsBean options;
    private String title;

    public static class ButtonsBean implements BaseJSModel {
        private int color;
        private String id;
        private String text;

        public int getColor() {
            return this.color;
        }

        public String getId() {
            return this.id;
        }

        public String getText() {
            return this.text;
        }

        public String toString() {
            return "ButtonsBean{text='" + this.text + '\'' + ", id='" + this.id + '\'' + ", color=" + this.color + '}';
        }

        public void setColor(int i) {
            this.color = i;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setText(String str) {
            this.text = str;
        }
    }

    public static class OptionsBean implements BaseJSModel {
        private int message_align = 1;

        public int getMessage_align() {
            return this.message_align;
        }

        public void setMessage_align(int i) {
            this.message_align = i;
        }
    }

    public List<ButtonsBean> getButtons() {
        return this.buttons;
    }

    public String getInput() {
        return this.input;
    }

    public String getMessage() {
        return this.message;
    }

    public OptionsBean getOptions() {
        return this.options;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isCancelable() {
        return this.cancelable;
    }

    public String toString() {
        return "AlertModel{title='" + this.title + '\'' + ", message='" + this.message + '\'' + ", buttons=" + this.buttons + '\'' + ", cancelable=" + this.cancelable + '}';
    }

    public void setButtons(List<ButtonsBean> list) {
        this.buttons = list;
    }

    public void setCancelable(boolean z) {
        this.cancelable = z;
    }

    public void setInput(String str) {
        this.input = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setOptions(OptionsBean optionsBean) {
        this.options = optionsBean;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
