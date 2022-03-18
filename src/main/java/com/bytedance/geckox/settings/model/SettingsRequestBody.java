package com.bytedance.geckox.settings.model;

import com.bytedance.geckox.model.Common;
import com.google.gson.annotations.SerializedName;

public class SettingsRequestBody {
    @SerializedName("common")
    private Common common;
    @SerializedName("settings")
    private C14327a settings;

    /* renamed from: com.bytedance.geckox.settings.model.SettingsRequestBody$a */
    public static class C14327a {
    }

    public Common getCommon() {
        return this.common;
    }

    public C14327a getSettings() {
        return this.settings;
    }

    public void setCommon(Common common2) {
        this.common = common2;
    }

    public void setSettings(C14327a aVar) {
        this.settings = aVar;
    }
}
