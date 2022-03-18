package com.ss.android.lark.openapi.jsapi.entity;

import java.util.List;

public class ActionSheetModel implements BaseJSModel {
    private String cancelButton;
    private List<String> otherButtons;
    private String title;

    public String getCancelButton() {
        return this.cancelButton;
    }

    public List<String> getOtherButtons() {
        return this.otherButtons;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCancelButton(String str) {
        this.cancelButton = str;
    }

    public void setOtherButtons(List<String> list) {
        this.otherButtons = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
