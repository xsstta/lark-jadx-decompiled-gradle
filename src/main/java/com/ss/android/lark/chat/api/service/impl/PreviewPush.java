package com.ss.android.lark.chat.api.service.impl;

import android.util.ArrayMap;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.UrlPreviewEntity;
import com.bytedance.lark.pb.im.v1.PushMessagePreviewsRequest;
import com.larksuite.framework.thread.ThreadFactoryC26153m;
import com.ss.android.lark.biz.im.api.preview.IPreviewCache;
import com.ss.android.lark.parser.internal.ModelParserPreview;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/api/service/impl/PreviewPush;", "", "()V", "mPushPreviewListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/biz/im/api/preview/IPreviewCache$PreviewCacheObserver;", "sPushExecutorService", "Ljava/util/concurrent/Executor;", "onPushMessagePreview", "", "request", "", "reset", "startPush", "listener", "stopPush", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.api.service.b.g */
public final class PreviewPush {

    /* renamed from: a */
    public static final Lazy f84454a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C32868b.INSTANCE);

    /* renamed from: b */
    public static final Companion f84455b = new Companion(null);

    /* renamed from: c */
    private final Executor f84456c;

    /* renamed from: d */
    private final CopyOnWriteArrayList<IPreviewCache.PreviewCacheObserver> f84457d = new CopyOnWriteArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/api/service/impl/PreviewPush$Companion;", "", "()V", "TAG", "", "THREAD_POOL_PUSH_PREVIEW", "instance", "Lcom/ss/android/lark/chat/api/service/impl/PreviewPush;", "getInstance", "()Lcom/ss/android/lark/chat/api/service/impl/PreviewPush;", "instance$delegate", "Lkotlin/Lazy;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.g$a */
    public static final class Companion {
        /* renamed from: a */
        public final PreviewPush mo121331a() {
            Lazy lazy = PreviewPush.f84454a;
            Companion aVar = PreviewPush.f84455b;
            return (PreviewPush) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/api/service/impl/PreviewPush;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.g$b */
    static final class C32868b extends Lambda implements Function0<PreviewPush> {
        public static final C32868b INSTANCE = new C32868b();

        C32868b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PreviewPush invoke() {
            return new PreviewPush();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.g$d */
    public static final class RunnableC32870d implements Runnable {

        /* renamed from: a */
        public static final RunnableC32870d f84459a = new RunnableC32870d();

        RunnableC32870d() {
        }

        public final void run() {
            PreviewCache.f84447c.mo121325a().mo121321a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.g$f */
    public static final class C32873f implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final C32873f f84462a = new C32873f();

        C32873f() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.PUSH_MESSAGE_PREVIEWS);
        }
    }

    /* renamed from: a */
    public final void mo121327a() {
        this.f84456c.execute(RunnableC32870d.f84459a);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.g$e */
    public static final class C32871e implements C53246j.AbstractC53247a {

        /* renamed from: a */
        final /* synthetic */ PreviewPush f84460a;

        C32871e(PreviewPush gVar) {
            this.f84460a = gVar;
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.PUSH_MESSAGE_PREVIEWS, new C53248k.AbstractC53250a(this) {
                /* class com.ss.android.lark.chat.api.service.impl.PreviewPush.C32871e.C328721 */

                /* renamed from: a */
                final /* synthetic */ C32871e f84461a;

                {
                    this.f84461a = r1;
                }

                @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                    PreviewPush gVar = this.f84461a.f84460a;
                    Intrinsics.checkExpressionValueIsNotNull(bArr, "request");
                    gVar.mo121329a(bArr);
                }
            });
        }
    }

    public PreviewPush() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC26153m("thread-pool-message-preview-push"));
        Intrinsics.checkExpressionValueIsNotNull(newSingleThreadExecutor, "Executors.newSingleThrea…HREAD_POOL_PUSH_PREVIEW))");
        this.f84456c = newSingleThreadExecutor;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.g$c */
    public static final class RunnableC32869c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PushMessagePreviewsRequest f84458a;

        RunnableC32869c(PushMessagePreviewsRequest pushMessagePreviewsRequest) {
            this.f84458a = pushMessagePreviewsRequest;
        }

        public final void run() {
            HashMap hashMap = new HashMap();
            Map<String, PreviewEntityPair> map = this.f84458a.preview_entities;
            Intrinsics.checkExpressionValueIsNotNull(map, "pushMessagePreviewResponse.preview_entities");
            for (Map.Entry<String, PreviewEntityPair> entry : map.entrySet()) {
                ArrayMap arrayMap = new ArrayMap();
                Map<String, UrlPreviewEntity> map2 = entry.getValue().preview_entity;
                Intrinsics.checkExpressionValueIsNotNull(map2, "entry.value.preview_entity");
                for (Map.Entry<String, UrlPreviewEntity> entry2 : map2.entrySet()) {
                    UrlPreviewEntity value = entry2.getValue();
                    Intrinsics.checkExpressionValueIsNotNull(value, "innerEntry.value");
                    com.ss.android.lark.chat.entity.preview.UrlPreviewEntity a = ModelParserPreview.m222175a(value);
                    if (a != null) {
                        arrayMap.put(entry2.getKey(), a);
                    }
                }
                hashMap.put(entry.getKey(), arrayMap);
            }
            PreviewCache.f84447c.mo121325a().mo121323a((Map<String, ? extends Map<String, ? extends com.ss.android.lark.chat.entity.preview.UrlPreviewEntity>>) hashMap, true);
        }
    }

    /* renamed from: a */
    public final void mo121328a(IPreviewCache.PreviewCacheObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        C53246j.m205910a(this.f84457d, aVar, new C32871e(this));
    }

    /* renamed from: b */
    public final void mo121330b(IPreviewCache.PreviewCacheObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        C53246j.m205911b(this.f84457d, aVar, C32873f.f84462a);
        mo121327a();
    }

    /* renamed from: a */
    public final void mo121329a(byte[] bArr) {
        this.f84456c.execute(new RunnableC32869c(PushMessagePreviewsRequest.ADAPTER.decode(bArr)));
    }
}
