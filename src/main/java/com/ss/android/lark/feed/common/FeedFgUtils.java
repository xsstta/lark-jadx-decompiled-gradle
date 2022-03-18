package com.ss.android.lark.feed.common;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.featuregating.service.util.FeedFgSyncUtil;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0007J\b\u0010\u0018\u001a\u00020\u0014H\u0007J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0007J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0007J\b\u0010\u001d\u001a\u00020\u0016H\u0007J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0007R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006 "}, d2 = {"Lcom/ss/android/lark/feed/common/FeedFgUtils;", "", "()V", "listenerMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/lark/feed/common/FeedFgUtils$OnInitReadyCallback;", "getListenerMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "setListenerMap", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "sEnableFeedV2", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getSEnableFeedV2", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setSEnableFeedV2", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "sInit", "getSInit", "setSInit", "enableNewFeedCursor", "", "init", "", "callback", "isFeedFilterEnable", "onFeedFgFetched", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "registerInitReadyCallback", "reset", "unInit", "unRegisterInitReadyCallback", "OnInitReadyCallback", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.a.e */
public final class FeedFgUtils {

    /* renamed from: a */
    public static final FeedFgUtils f95680a = new FeedFgUtils();

    /* renamed from: b */
    private static AtomicBoolean f95681b = new AtomicBoolean(false);

    /* renamed from: c */
    private static AtomicBoolean f95682c = new AtomicBoolean(false);

    /* renamed from: d */
    private static ConcurrentHashMap<OnInitReadyCallback, Object> f95683d = new ConcurrentHashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/feed/common/FeedFgUtils$OnInitReadyCallback;", "", "onInitReady", "", "isEnableFeedV2", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.a.e$a */
    public interface OnInitReadyCallback {
        /* renamed from: a */
        void mo136996a(boolean z);
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m146773b() {
        return true;
    }

    private FeedFgUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m146769a() {
        f95682c.compareAndSet(true, false);
        f95681b.set(false);
        f95683d.clear();
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m146775c() {
        if (!C37239a.m146648b().mo136951a("feed_cursor_optimization") || !FeedFgSyncUtil.m146721a()) {
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m146776d(OnInitReadyCallback aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        f95683d.remove(aVar);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m146772b(OnInitReadyCallback aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        f95682c.compareAndSet(true, false);
        f95681b.set(false);
        m146770a(aVar);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m146774c(OnInitReadyCallback aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        f95683d.put(aVar, new Object());
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m146770a(OnInitReadyCallback aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        if (!f95682c.get()) {
            f95681b.set(true);
            f95682c.set(true);
            aVar.mo136996a(true);
            f95680a.m146771a(true);
        }
    }

    /* renamed from: a */
    private final void m146771a(boolean z) {
        Set<Map.Entry<OnInitReadyCallback, Object>> entrySet = f95683d.entrySet();
        Intrinsics.checkExpressionValueIsNotNull(entrySet, "listenerMap.entries");
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            ((OnInitReadyCallback) it.next().getKey()).mo136996a(z);
        }
    }
}
