package com.ss.android.appcenter.business.net.badge;

import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.common.util.C28183g;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR,\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ss/android/appcenter/business/net/badge/AppBadgeSettingInfo;", "Ljava/io/Serializable;", "()V", "avatarKey", "", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "(Ljava/lang/String;)V", "clientId", "getClientId", "setClientId", "i18nName", "", "getI18nName", "()Ljava/util/Map;", "setI18nName", "(Ljava/util/Map;)V", "name", "getName", "setName", "needShow", "", "getNeedShow", "()Z", "setNeedShow", "(Z)V", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AppBadgeSettingInfo implements Serializable {
    @SerializedName("avatar_key")
    private String avatarKey;
    @SerializedName("client_id")
    private String clientId;
    @SerializedName("i18n_name")
    private Map<String, String> i18nName;
    private String name;
    @SerializedName("need_show")
    private boolean needShow;

    public final String getAvatarKey() {
        return this.avatarKey;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final Map<String, String> getI18nName() {
        return this.i18nName;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getNeedShow() {
        return this.needShow;
    }

    public final String name() {
        Map<String, String> map = this.i18nName;
        if (map == null) {
            return this.name;
        }
        String str = map.get(C28183g.m103240a());
        if (str != null) {
            return str;
        }
        return this.name;
    }

    public final void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }

    public final void setI18nName(Map<String, String> map) {
        this.i18nName = map;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNeedShow(boolean z) {
        this.needShow = z;
    }
}
