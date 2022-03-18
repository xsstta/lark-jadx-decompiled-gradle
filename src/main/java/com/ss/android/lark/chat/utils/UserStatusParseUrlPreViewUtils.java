package com.ss.android.lark.chat.utils;

import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.chat.api.service.impl.PreviewService;
import com.ss.android.lark.chat.preview.entity.UrlPreViewEntries;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.p3491a.C69743a;
import org.apache.commons.codec.p3492b.C69745a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001c\u0010\u000f\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\u0013J0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/chat/utils/UserStatusParseUrlPreViewUtils;", "", "()V", "AFTER_REPLACEMENT_CHAR", "", "REPLACEMENT_CHAR", "TAG", "getRecogniseSpansResult", "", "description", "sourceId", "syncDataStrategy", "Lcom/bytedance/lark/pb/basic/v1/SyncDataStrategy;", "callback", "Lcom/ss/android/lark/WidgetModuleDependency$GetRecognizeSpanResultCallBack;", "handleBatchSignUrlRequest", "signUrlPreviewParamsList", "", "Lcom/ss/android/lark/chat/utils/UserStatusParseUrlPreViewUtils$GetSignUrlPreviewParams;", "Lcom/ss/android/lark/chat/utils/UserStatusParseUrlPreViewUtils$GetSignUrlPreViewCallBack;", "parseUrlPreView", "", "Lcom/ss/android/lark/widget/span/RecogniseSpansResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntries;", "GetSignUrlPreViewCallBack", "GetSignUrlPreviewParams", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.utils.z */
public final class UserStatusParseUrlPreViewUtils {

    /* renamed from: a */
    public static final UserStatusParseUrlPreViewUtils f88765a = new UserStatusParseUrlPreViewUtils();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/utils/UserStatusParseUrlPreViewUtils$GetSignUrlPreViewCallBack;", "", "getSignUrlPreViewCallBack", "", "userIdList", "", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.utils.z$a */
    public interface GetSignUrlPreViewCallBack {
        /* renamed from: a */
        void mo123524a(List<String> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/utils/UserStatusParseUrlPreViewUtils$GetSignUrlPreviewParams;", "", "description", "", "userId", "sourceTextMD5", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getSourceTextMD5", "getUserId", "setUserId", "(Ljava/lang/String;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.utils.z$b */
    public static final class GetSignUrlPreviewParams {

        /* renamed from: a */
        private final String f88766a;

        /* renamed from: b */
        private String f88767b;

        /* renamed from: c */
        private final String f88768c;

        /* renamed from: a */
        public final String mo126953a() {
            return this.f88766a;
        }

        /* renamed from: b */
        public final String mo126954b() {
            return this.f88767b;
        }

        /* renamed from: c */
        public final String mo126955c() {
            return this.f88768c;
        }

        public GetSignUrlPreviewParams(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "description");
            Intrinsics.checkParameterIsNotNull(str2, "userId");
            Intrinsics.checkParameterIsNotNull(str3, "sourceTextMD5");
            this.f88766a = str;
            this.f88767b = str2;
            this.f88768c = str3;
        }
    }

    private UserStatusParseUrlPreViewUtils() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/utils/UserStatusParseUrlPreViewUtils$getRecogniseSpansResult$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntries;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.utils.z$c */
    public static final class C34382c implements IGetDataCallback<List<? extends UrlPreViewEntries>> {

        /* renamed from: a */
        final /* synthetic */ C37030f.AbstractC37031a f88769a;

        /* renamed from: b */
        final /* synthetic */ String f88770b;

        /* renamed from: c */
        final /* synthetic */ String f88771c;

        /* renamed from: d */
        final /* synthetic */ String f88772d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f88769a.mo136555a(null);
        }

        /* renamed from: a */
        public void onSuccess(List<UrlPreViewEntries> list) {
            if (list != null) {
                this.f88769a.mo136555a(UserStatusParseUrlPreViewUtils.f88765a.mo126950a(list, CollectionsKt.listOf(new GetSignUrlPreviewParams(this.f88770b, this.f88771c, this.f88772d))));
            }
        }

        C34382c(C37030f.AbstractC37031a aVar, String str, String str2, String str3) {
            this.f88769a = aVar;
            this.f88770b = str;
            this.f88771c = str2;
            this.f88772d = str3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/utils/UserStatusParseUrlPreViewUtils$handleBatchSignUrlRequest$3", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntries;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.utils.z$d */
    public static final class C34383d implements IGetDataCallback<List<? extends UrlPreViewEntries>> {

        /* renamed from: a */
        final /* synthetic */ WeakReference f88773a;

        /* renamed from: b */
        final /* synthetic */ Collection f88774b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            GetSignUrlPreViewCallBack aVar = (GetSignUrlPreViewCallBack) this.f88773a.get();
            if (aVar != null) {
                aVar.mo123524a(null);
            }
        }

        /* renamed from: a */
        public void onSuccess(List<UrlPreViewEntries> list) {
            GetSignUrlPreViewCallBack aVar;
            if (list != null && (aVar = (GetSignUrlPreViewCallBack) this.f88773a.get()) != null) {
                aVar.mo123524a(CollectionsKt.toList(UserStatusParseUrlPreViewUtils.f88765a.mo126950a(list, this.f88774b).keySet()));
            }
        }

        C34383d(WeakReference weakReference, Collection collection) {
            this.f88773a = weakReference;
            this.f88774b = collection;
        }
    }

    /* renamed from: a */
    public final void mo126952a(Collection<GetSignUrlPreviewParams> collection, GetSignUrlPreViewCallBack aVar) {
        Intrinsics.checkParameterIsNotNull(collection, "signUrlPreviewParamsList");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        WeakReference weakReference = new WeakReference(aVar);
        PreviewService a = PreviewService.f84464b.mo121338a();
        Collection<GetSignUrlPreviewParams> collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo126954b());
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it2 = collection2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(it2.next().mo126955c());
        }
        a.mo121337a(arrayList2, arrayList3, SyncDataStrategy.TRY_LOCAL, new UIGetDataCallback<>(new C34383d(weakReference, collection)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x02ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02a6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, com.ss.android.lark.widget.span.RecogniseSpansResult> mo126950a(java.util.List<com.ss.android.lark.chat.preview.entity.UrlPreViewEntries> r19, java.util.Collection<com.ss.android.lark.chat.utils.UserStatusParseUrlPreViewUtils.GetSignUrlPreviewParams> r20) {
        /*
        // Method dump skipped, instructions count: 803
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.utils.UserStatusParseUrlPreViewUtils.mo126950a(java.util.List, java.util.Collection):java.util.Map");
    }

    /* renamed from: a */
    public final void mo126951a(String str, String str2, SyncDataStrategy syncDataStrategy, C37030f.AbstractC37031a aVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(syncDataStrategy, "syncDataStrategy");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        String str3 = str;
        boolean z2 = false;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str4 = str2;
            if (str4 == null || str4.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                char[] a = C69743a.m267688a(C69745a.m267697b(str));
                Intrinsics.checkExpressionValueIsNotNull(a, "Hex.encodeHex(DigestUtils.md5(description))");
                String str5 = new String(a);
                PreviewService.f84464b.mo121338a().mo121337a(CollectionsKt.listOf(str2), CollectionsKt.listOf(str5), syncDataStrategy, new UIGetDataCallback<>(new C34382c(aVar, str, str2, str5)));
                return;
            }
        }
        Log.m165389i("UserStatusParseUrlPreViewUtils", "personal sign is null or userId is null");
    }
}
