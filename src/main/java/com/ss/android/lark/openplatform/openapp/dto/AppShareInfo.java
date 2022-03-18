package com.ss.android.lark.openplatform.openapp.dto;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.common.util.C28183g;
import java.io.Serializable;

public class AppShareInfo implements Serializable {
    @SerializedName("app_ability")
    private int appAbility;
    @SerializedName("cli_id")
    private String appid;
    @SerializedName("avatar_key")
    private String avatarKey;
    @SerializedName("desc")
    private String desc;
    @SerializedName("extra")
    private JsonObject extra;
    @SerializedName("i18n_descs")
    private JsonObject i18nAppDescs;
    @SerializedName("i18n_names")
    private JsonObject i18nAppNames;
    @SerializedName("name")
    private String name;

    public String getAppid() {
        return this.appid;
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public JsonObject getExtra() {
        return this.extra;
    }

    public JsonObject getI18nAppDescs() {
        return this.i18nAppDescs;
    }

    public JsonObject getI18nAppNames() {
        return this.i18nAppNames;
    }

    public AppAbilityType getAppAbilityType() {
        return AppAbilityType.forNumber(this.appAbility);
    }

    public String getAppDesc() {
        String str;
        JsonObject jsonObject = this.i18nAppDescs;
        if (jsonObject != null) {
            str = C28183g.m103241a(jsonObject);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return this.desc;
    }

    public String getAppName() {
        String str;
        JsonObject jsonObject = this.i18nAppNames;
        if (jsonObject != null) {
            str = C28183g.m103241a(jsonObject);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return this.name;
    }

    public boolean canOpenInPC() {
        boolean z;
        JsonObject jsonObject = this.extra;
        if (jsonObject == null) {
            return false;
        }
        if (jsonObject.has("support_pc_mp")) {
            z = this.extra.get("support_pc_mp").getAsBoolean();
        } else {
            z = false;
        }
        if (!this.extra.has("support_pc_web_app")) {
            return z;
        }
        if (z || this.extra.get("support_pc_web_app").getAsBoolean()) {
            return true;
        }
        return false;
    }
}
