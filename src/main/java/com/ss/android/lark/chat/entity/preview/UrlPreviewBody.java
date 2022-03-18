package com.ss.android.lark.chat.entity.preview;

import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/UrlPreviewBody;", "Ljava/io/Serializable;", "urlPreviewComponents", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewComponents;", "actions", "", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewAction;", "cardUrl", "Lcom/ss/android/lark/chat/entity/preview/Url;", "(Lcom/ss/android/lark/chat/entity/preview/UrlPreviewComponents;Ljava/util/Map;Lcom/ss/android/lark/chat/entity/preview/Url;)V", "getActions", "()Ljava/util/Map;", "getCardUrl", "()Lcom/ss/android/lark/chat/entity/preview/Url;", "getUrlPreviewComponents", "()Lcom/ss/android/lark/chat/entity/preview/UrlPreviewComponents;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UrlPreviewBody implements Serializable {
    private final Map<String, UrlPreviewAction> actions;
    private final Url cardUrl;
    private final UrlPreviewComponents urlPreviewComponents;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.chat.entity.preview.UrlPreviewBody */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UrlPreviewBody copy$default(UrlPreviewBody urlPreviewBody, UrlPreviewComponents urlPreviewComponents2, Map map, Url url, int i, Object obj) {
        if ((i & 1) != 0) {
            urlPreviewComponents2 = urlPreviewBody.urlPreviewComponents;
        }
        if ((i & 2) != 0) {
            map = urlPreviewBody.actions;
        }
        if ((i & 4) != 0) {
            url = urlPreviewBody.cardUrl;
        }
        return urlPreviewBody.copy(urlPreviewComponents2, map, url);
    }

    public final UrlPreviewComponents component1() {
        return this.urlPreviewComponents;
    }

    public final Map<String, UrlPreviewAction> component2() {
        return this.actions;
    }

    public final Url component3() {
        return this.cardUrl;
    }

    public final UrlPreviewBody copy(UrlPreviewComponents urlPreviewComponents2, Map<String, UrlPreviewAction> map, Url url) {
        return new UrlPreviewBody(urlPreviewComponents2, map, url);
    }

    public String toString() {
        return "UrlPreviewBody(urlPreviewComponents=" + this.urlPreviewComponents + ", actions=" + this.actions + ", cardUrl=" + this.cardUrl + ")";
    }

    public final Map<String, UrlPreviewAction> getActions() {
        return this.actions;
    }

    public final Url getCardUrl() {
        return this.cardUrl;
    }

    public final UrlPreviewComponents getUrlPreviewComponents() {
        return this.urlPreviewComponents;
    }

    public int hashCode() {
        int i;
        UrlPreviewComponents urlPreviewComponents2 = this.urlPreviewComponents;
        int i2 = 0;
        if (urlPreviewComponents2 != null) {
            i = urlPreviewComponents2.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Map<String, UrlPreviewAction> map = this.actions;
        if (map != null) {
            i2 = map.hashCode();
        }
        return i3 + i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlPreviewBody)) {
            return false;
        }
        UrlPreviewBody urlPreviewBody = (UrlPreviewBody) obj;
        if (!(!Intrinsics.areEqual(this.urlPreviewComponents, urlPreviewBody.urlPreviewComponents)) && !(!Intrinsics.areEqual(this.actions, urlPreviewBody.actions))) {
            return true;
        }
        return false;
    }

    public UrlPreviewBody(UrlPreviewComponents urlPreviewComponents2, Map<String, UrlPreviewAction> map, Url url) {
        this.urlPreviewComponents = urlPreviewComponents2;
        this.actions = map;
        this.cardUrl = url;
    }
}
