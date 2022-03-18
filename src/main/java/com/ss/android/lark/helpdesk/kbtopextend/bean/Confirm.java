package com.ss.android.lark.helpdesk.kbtopextend.bean;

import com.google.gson.JsonObject;

public class Confirm {
    private Action cancel_action;
    private JsonObject cancel_text_i18n;
    private Action confirm_action;
    private JsonObject confirm_text_i18n;
    private JsonObject content_i18n;
    private JsonObject title_i18n;

    public Action getCancel_action() {
        return this.cancel_action;
    }

    public JsonObject getCancel_text_i18n() {
        return this.cancel_text_i18n;
    }

    public Action getConfirm_action() {
        return this.confirm_action;
    }

    public JsonObject getConfirm_text_i18n() {
        return this.confirm_text_i18n;
    }

    public JsonObject getContent_i18n() {
        return this.content_i18n;
    }

    public JsonObject getTitle_i18n() {
        return this.title_i18n;
    }

    public void setCancel_action(Action action) {
        this.cancel_action = action;
    }

    public void setCancel_text_i18n(JsonObject jsonObject) {
        this.cancel_text_i18n = jsonObject;
    }

    public void setConfirm_action(Action action) {
        this.confirm_action = action;
    }

    public void setConfirm_text_i18n(JsonObject jsonObject) {
        this.confirm_text_i18n = jsonObject;
    }

    public void setContent_i18n(JsonObject jsonObject) {
        this.content_i18n = jsonObject;
    }

    public void setTitle_i18n(JsonObject jsonObject) {
        this.title_i18n = jsonObject;
    }
}
