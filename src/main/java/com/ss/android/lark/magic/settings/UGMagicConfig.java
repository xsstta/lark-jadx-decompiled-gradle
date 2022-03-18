package com.ss.android.lark.magic.settings;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR>\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00120\u0011\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/magic/settings/UGMagicConfig;", "", "()V", "displayTimeout", "", "getDisplayTimeout", "()Ljava/lang/Integer;", "setDisplayTimeout", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "feelgoodAppKey", "", "getFeelgoodAppKey", "()Ljava/lang/String;", "setFeelgoodAppKey", "(Ljava/lang/String;)V", "whiteListWithParams", "", "", "getWhiteListWithParams", "()Ljava/util/Map;", "setWhiteListWithParams", "(Ljava/util/Map;)V", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class UGMagicConfig {
    @SerializedName("timeout")
    private Integer displayTimeout = 1000;
    @SerializedName("feelgood_app_key")
    private String feelgoodAppKey;
    @SerializedName("white_list_with_params")
    private Map<String, ? extends Map<String, ? extends List<String>>> whiteListWithParams = MapsKt.emptyMap();

    public final Integer getDisplayTimeout() {
        return this.displayTimeout;
    }

    public final String getFeelgoodAppKey() {
        return this.feelgoodAppKey;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>>, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> */
    public final Map<String, Map<String, List<String>>> getWhiteListWithParams() {
        return this.whiteListWithParams;
    }

    public final void setDisplayTimeout(Integer num) {
        this.displayTimeout = num;
    }

    public final void setFeelgoodAppKey(String str) {
        this.feelgoodAppKey = str;
    }

    public final void setWhiteListWithParams(Map<String, ? extends Map<String, ? extends List<String>>> map) {
        this.whiteListWithParams = map;
    }
}
