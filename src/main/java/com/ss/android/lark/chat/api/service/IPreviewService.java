package com.ss.android.lark.chat.api.service;

import com.larksuite.framework.callback.IGetDataCallback;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u001aJF\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00050\u000bH&J \u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H&J<\u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u00132\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0013H&J4\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062 \u0010\n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00190\u0010H&¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chat/api/service/IPreviewService;", "", "getUrlPreViewEntityList", "", "sourceIdList", "", "", "sourceTextMD5List", "syncDataStrategy", "Lcom/bytedance/lark/pb/basic/v1/SyncDataStrategy;", "callback", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntries;", "putUrlPreviewAction", "request", "Lcom/ss/android/lark/chat/api/service/IPreviewService$UrlPreviewActionRequest;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "syncGetMessagePreview", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "messagePreviewMap", "syncPullUrlPreviewChattersList", "previewId", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "UrlPreviewActionRequest", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.api.service.h */
public interface IPreviewService {
    /* renamed from: a */
    void mo121335a(UrlPreviewActionRequest aVar, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo121336a(String str, IGetDataCallback<ArrayList<String>> iGetDataCallback);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003JE\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/chat/api/service/IPreviewService$UrlPreviewActionRequest;", "", "sourceId", "", "previewId", "actionId", "parameters", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getActionId", "()Ljava/lang/String;", "getParameters", "()Ljava/util/Map;", "getPreviewId", "getSourceId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.h$a */
    public static final class UrlPreviewActionRequest {

        /* renamed from: a */
        private final String f84511a;

        /* renamed from: b */
        private final String f84512b;

        /* renamed from: c */
        private final String f84513c;

        /* renamed from: d */
        private final Map<String, String> f84514d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UrlPreviewActionRequest)) {
                return false;
            }
            UrlPreviewActionRequest aVar = (UrlPreviewActionRequest) obj;
            return Intrinsics.areEqual(this.f84511a, aVar.f84511a) && Intrinsics.areEqual(this.f84512b, aVar.f84512b) && Intrinsics.areEqual(this.f84513c, aVar.f84513c) && Intrinsics.areEqual(this.f84514d, aVar.f84514d);
        }

        public int hashCode() {
            String str = this.f84511a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f84512b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f84513c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Map<String, String> map = this.f84514d;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            return "UrlPreviewActionRequest(sourceId=" + this.f84511a + ", previewId=" + this.f84512b + ", actionId=" + this.f84513c + ", parameters=" + this.f84514d + ")";
        }

        /* renamed from: a */
        public final String mo121393a() {
            return this.f84511a;
        }

        /* renamed from: b */
        public final String mo121394b() {
            return this.f84512b;
        }

        /* renamed from: c */
        public final String mo121395c() {
            return this.f84513c;
        }

        public UrlPreviewActionRequest(String str, String str2, String str3, Map<String, String> map) {
            this.f84511a = str;
            this.f84512b = str2;
            this.f84513c = str3;
            this.f84514d = map;
        }
    }
}
