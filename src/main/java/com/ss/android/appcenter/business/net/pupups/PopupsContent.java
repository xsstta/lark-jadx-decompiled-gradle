package com.ss.android.appcenter.business.net.pupups;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR2\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/appcenter/business/net/pupups/PopupsContent;", "Ljava/io/Serializable;", "()V", "config", "Lcom/ss/android/appcenter/business/net/pupups/PopupsConfig;", "getConfig", "()Lcom/ss/android/appcenter/business/net/pupups/PopupsConfig;", "setConfig", "(Lcom/ss/android/appcenter/business/net/pupups/PopupsConfig;)V", "i18nElements", "", "", "", "Lcom/ss/android/appcenter/business/net/pupups/PopupsElement;", "getI18nElements", "()Ljava/util/Map;", "setI18nElements", "(Ljava/util/Map;)V", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PopupsContent implements Serializable {
    @SerializedName("config")
    private PopupsConfig config;
    @SerializedName("i18n_elements")
    private Map<String, ? extends List<PopupsElement>> i18nElements;

    public final PopupsConfig getConfig() {
        return this.config;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<com.ss.android.appcenter.business.net.pupups.PopupsElement>>, java.util.Map<java.lang.String, java.util.List<com.ss.android.appcenter.business.net.pupups.PopupsElement>> */
    public final Map<String, List<PopupsElement>> getI18nElements() {
        return this.i18nElements;
    }

    public final void setConfig(PopupsConfig popupsConfig) {
        this.config = popupsConfig;
    }

    public final void setI18nElements(Map<String, ? extends List<PopupsElement>> map) {
        this.i18nElements = map;
    }
}
