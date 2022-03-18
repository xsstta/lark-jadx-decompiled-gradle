package com.ss.android.lark.chat.api.service.impl;

import android.util.ArrayMap;
import com.larksuite.framework.thread.ThreadFactoryC26153m;
import com.ss.android.lark.biz.im.api.preview.IPreviewCache;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.exception.entity.AbstractCallableC37029a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u001e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0002J,\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J,\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J>\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00062\u001a\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0017\u0018\u00010\u0006H\u0016J,\u0010\u001d\u001a\u00020\u00122\"\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u001fj\b\u0012\u0004\u0012\u00020\u0005` 0\u0004H\u0002J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\"\u001a\u00020\u0012H\u0016J2\u0010#\u001a\u00020\u00122 \u0010$\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00062\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0007H\u0002R)\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/chat/api/service/impl/PreviewCache;", "Lcom/ss/android/lark/biz/im/api/preview/IPreviewCache;", "()V", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "getCache", "()Ljava/util/concurrent/ConcurrentHashMap;", "executor", "Ljava/util/concurrent/ExecutorService;", "observers", "Lcom/ss/android/lark/biz/im/api/preview/IPreviewCache$PreviewCacheObserver;", "", "readWriteLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "addPreviewCacheObserver", "", "observer", "fetchMessagePreview", "messageId", "previewIds", "", "getUrlPreviewEntities", "getUrlPreviewFromCache", "previewId", "getUrlPreviewsFromCache", "updateIds", "onCacheUpdate", "updateMaps", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "removePreviewCacheObserver", "resetCache", "updateCache", "entities", "notify", "", "updateCachePreviewItem", "item", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.api.service.b.f */
public final class PreviewCache implements IPreviewCache {

    /* renamed from: b */
    public static final Lazy f84446b = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C32866b.INSTANCE);

    /* renamed from: c */
    public static final Companion f84447c = new Companion(null);

    /* renamed from: a */
    public final ConcurrentHashMap<IPreviewCache.PreviewCacheObserver, Object> f84448a = new ConcurrentHashMap<>();

    /* renamed from: d */
    private final ExecutorService f84449d;

    /* renamed from: e */
    private final ConcurrentHashMap<String, Map<String, UrlPreviewEntity>> f84450e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private final ReentrantReadWriteLock f84451f = new ReentrantReadWriteLock();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/api/service/impl/PreviewCache$Companion;", "", "()V", "INSTANCE", "Lcom/ss/android/lark/chat/api/service/impl/PreviewCache;", "getINSTANCE", "()Lcom/ss/android/lark/chat/api/service/impl/PreviewCache;", "INSTANCE$delegate", "Lkotlin/Lazy;", "TAG", "", "THREAD_POLL_PREVIEW_CACHE", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.f$a */
    public static final class Companion {
        /* renamed from: a */
        public final PreviewCache mo121325a() {
            Lazy lazy = PreviewCache.f84446b;
            Companion aVar = PreviewCache.f84447c;
            return (PreviewCache) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/api/service/impl/PreviewCache;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.f$b */
    static final class C32866b extends Lambda implements Function0<PreviewCache> {
        public static final C32866b INSTANCE = new C32866b();

        C32866b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PreviewCache invoke() {
            return new PreviewCache();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/api/service/impl/PreviewCache$onCacheUpdate$1", "Lcom/ss/android/lark/exception/entity/ExceptionDetectorCallable;", "", "callImpl", "()Ljava/lang/Boolean;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.b.f$c */
    public static final class C32867c extends AbstractCallableC37029a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ PreviewCache f84452a;

        /* renamed from: b */
        final /* synthetic */ ConcurrentHashMap f84453b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean mo102726b() {
            for (Map.Entry<IPreviewCache.PreviewCacheObserver, Object> entry : this.f84452a.f84448a.entrySet()) {
                entry.getKey().onCacheChanged(this.f84453b);
            }
            return true;
        }

        C32867c(PreviewCache fVar, ConcurrentHashMap concurrentHashMap) {
            this.f84452a = fVar;
            this.f84453b = concurrentHashMap;
        }
    }

    public PreviewCache() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC26153m("thread-pool-message-preview-cache"));
        Intrinsics.checkExpressionValueIsNotNull(newSingleThreadExecutor, "Executors.newSingleThrea…READ_POLL_PREVIEW_CACHE))");
        this.f84449d = newSingleThreadExecutor;
    }

    /* renamed from: a */
    public void mo121321a() {
        try {
            this.f84451f.writeLock().lock();
            Log.m165389i("PreviewPushCache", "preview push cache clear");
            this.f84450e.clear();
        } finally {
            this.f84451f.writeLock().unlock();
        }
    }

    /* renamed from: a */
    private final void m126523a(ConcurrentHashMap<String, ArrayList<String>> concurrentHashMap) {
        this.f84449d.submit(new C32867c(this, concurrentHashMap));
    }

    /* renamed from: b */
    public void mo121324b(IPreviewCache.PreviewCacheObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        this.f84448a.remove(aVar);
    }

    /* renamed from: a */
    public void mo121322a(IPreviewCache.PreviewCacheObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        if (!this.f84448a.contains(aVar)) {
            this.f84448a.put(aVar, new Object());
        }
    }

    /* renamed from: a */
    private final boolean m126524a(UrlPreviewEntity urlPreviewEntity) {
        try {
            this.f84451f.writeLock().lock();
            boolean z = true;
            if (this.f84450e.get(urlPreviewEntity.getSourceId()) == null) {
                String sourceId = urlPreviewEntity.getSourceId();
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put(urlPreviewEntity.getPreviewId(), urlPreviewEntity);
                this.f84450e.put(sourceId, arrayMap);
            } else {
                UrlPreviewEntity a = m126522a(urlPreviewEntity.getSourceId(), urlPreviewEntity.getPreviewId());
                Map<String, UrlPreviewEntity> map = this.f84450e.get(urlPreviewEntity.getSourceId());
                if (map != null) {
                    ArrayMap arrayMap2 = (ArrayMap) map;
                    if (a == null) {
                        arrayMap2.put(urlPreviewEntity.getPreviewId(), urlPreviewEntity);
                    } else if (urlPreviewEntity.compareTo(a) >= 0) {
                        arrayMap2.put(urlPreviewEntity.getPreviewId(), urlPreviewEntity);
                    } else {
                        z = false;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.util.ArrayMap<kotlin.String, com.ss.android.lark.chat.entity.preview.UrlPreviewEntity>");
                }
            }
            return z;
        } finally {
            this.f84451f.writeLock().unlock();
        }
    }

    /* renamed from: a */
    public Map<String, Map<String, UrlPreviewEntity>> mo121320a(Map<String, ? extends List<String>> map) {
        try {
            this.f84451f.readLock().lock();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            if (map != null) {
                for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Map<String, UrlPreviewEntity> map2 = this.f84450e.get(key);
                    List list = (List) entry.getValue();
                    if (map2 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, UrlPreviewEntity> entry2 : map2.entrySet()) {
                            if (list.contains(entry2.getKey())) {
                                linkedHashMap.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        concurrentHashMap.put(key, linkedHashMap);
                    }
                }
            }
            return concurrentHashMap;
        } finally {
            this.f84451f.readLock().unlock();
        }
    }

    /* renamed from: a */
    private final UrlPreviewEntity m126522a(String str, String str2) {
        UrlPreviewEntity urlPreviewEntity;
        try {
            this.f84451f.readLock().lock();
            Map<String, UrlPreviewEntity> map = this.f84450e.get(str);
            if (map != null) {
                urlPreviewEntity = map.get(str2);
            } else {
                urlPreviewEntity = null;
            }
            return urlPreviewEntity;
        } finally {
            this.f84451f.readLock().unlock();
        }
    }

    /* renamed from: a */
    public Map<String, UrlPreviewEntity> mo121319a(String str, List<String> list) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        Intrinsics.checkParameterIsNotNull(list, "previewIds");
        try {
            this.f84451f.readLock().lock();
            Map<String, UrlPreviewEntity> map = this.f84450e.get(str);
            if (map != null) {
                Intrinsics.checkExpressionValueIsNotNull(map, "cache[messageId] ?: return null");
                ArrayMap arrayMap = new ArrayMap();
                for (T t : list) {
                    UrlPreviewEntity urlPreviewEntity = map.get(t);
                    if (urlPreviewEntity != null) {
                        UrlPreviewEntity urlPreviewEntity2 = (UrlPreviewEntity) arrayMap.put(t, urlPreviewEntity);
                    }
                }
                return arrayMap;
            }
            this.f84451f.readLock().unlock();
            return null;
        } finally {
            this.f84451f.readLock().unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo121323a(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends com.ss.android.lark.chat.entity.preview.UrlPreviewEntity>> r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.api.service.impl.PreviewCache.mo121323a(java.util.Map, boolean):void");
    }
}
