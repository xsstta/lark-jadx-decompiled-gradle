package com.ss.android.appcenter.business.net.badge;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/appcenter/business/net/badge/AppBadgeSettingData;", "Ljava/io/Serializable;", "()V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "items", "", "Lcom/ss/android/appcenter/business/net/badge/AppBadgeSettingInfo;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "pageToken", "", "getPageToken", "()Ljava/lang/String;", "setPageToken", "(Ljava/lang/String;)V", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AppBadgeSettingData implements Serializable {
    @SerializedName("has_more")
    private boolean hasMore;
    private List<AppBadgeSettingInfo> items;
    @SerializedName("page_token")
    private String pageToken;

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<AppBadgeSettingInfo> getItems() {
        return this.items;
    }

    public final String getPageToken() {
        return this.pageToken;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setItems(List<AppBadgeSettingInfo> list) {
        this.items = list;
    }

    public final void setPageToken(String str) {
        this.pageToken = str;
    }
}
