package com.ss.android.lark.biz.im.api.preview;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0015J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J,\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH&J,\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH&J>\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0018\u00010\u00072\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f\u0018\u00010\u0007H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0003H&J2\u0010\u0011\u001a\u00020\u00032 \u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0014H&¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/biz/im/api/preview/IPreviewCache;", "", "addPreviewCacheObserver", "", "observer", "Lcom/ss/android/lark/biz/im/api/preview/IPreviewCache$PreviewCacheObserver;", "getUrlPreviewEntities", "", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "messageId", "previewIds", "", "getUrlPreviewsFromCache", "updateIds", "removePreviewCacheObserver", "resetCache", "updateCache", "entities", "notify", "", "PreviewCacheObserver", "im_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.im.api.c.a */
public interface IPreviewCache {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0007j\b\u0012\u0004\u0012\u00020\u0006`\b0\u0005H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/biz/im/api/preview/IPreviewCache$PreviewCacheObserver;", "", "onCacheChanged", "", "updateMaps", "", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "im_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.biz.im.api.c.a$a */
    public interface PreviewCacheObserver {
        void onCacheChanged(Map<String, ? extends ArrayList<String>> map);
    }
}
