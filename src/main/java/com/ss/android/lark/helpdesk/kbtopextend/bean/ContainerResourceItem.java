package com.ss.android.lark.helpdesk.kbtopextend.bean;

import com.google.gson.JsonObject;

public class ContainerResourceItem {
    private Action action;
    private Confirm confirm;
    private Image_key_themed image_key_themed;
    private Image_url_themed image_url_themed;
    private JsonObject text_i18n;

    public Action getAction() {
        return this.action;
    }

    public Confirm getConfirm() {
        return this.confirm;
    }

    public Image_key_themed getImage_key_themed() {
        return this.image_key_themed;
    }

    public Image_url_themed getImage_url_themed() {
        return this.image_url_themed;
    }

    public JsonObject getText_i18n() {
        return this.text_i18n;
    }

    public void setAction(Action action2) {
        this.action = action2;
    }

    public void setConfirm(Confirm confirm2) {
        this.confirm = confirm2;
    }

    public void setImage_key_themed(Image_key_themed image_key_themed2) {
        this.image_key_themed = image_key_themed2;
    }

    public void setImage_url_themed(Image_url_themed image_url_themed2) {
        this.image_url_themed = image_url_themed2;
    }

    public void setText_i18n(JsonObject jsonObject) {
        this.text_i18n = jsonObject;
    }
}
