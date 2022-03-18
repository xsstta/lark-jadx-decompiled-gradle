package com.ss.android.lark.feed.common;

import com.ss.android.lark.feed.app.entity.FeedFilter;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/feed/common/FeedTabUtil;", "", "()V", "switchListenerRef", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/feed/common/FeedTabUtil$SwitchTabListener;", "getSwitchListenerRef", "()Ljava/lang/ref/WeakReference;", "setSwitchListenerRef", "(Ljava/lang/ref/WeakReference;)V", "setListener", "", "listener", "switchTab", "filter", "Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "SwitchTabListener", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.a.g */
public final class FeedTabUtil {

    /* renamed from: a */
    public static final FeedTabUtil f95685a = new FeedTabUtil();

    /* renamed from: b */
    private static WeakReference<SwitchTabListener> f95686b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/feed/common/FeedTabUtil$SwitchTabListener;", "", "switchTab", "", "filter", "Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.a.g$a */
    public interface SwitchTabListener {
        /* renamed from: a */
        void mo136997a(FeedFilter feedFilter);
    }

    private FeedTabUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m146779a(SwitchTabListener aVar) {
        WeakReference<SwitchTabListener> weakReference;
        if (aVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(aVar);
        }
        f95686b = weakReference;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m146780a(FeedFilter feedFilter) {
        SwitchTabListener aVar;
        Intrinsics.checkParameterIsNotNull(feedFilter, "filter");
        WeakReference<SwitchTabListener> weakReference = f95686b;
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            aVar.mo136997a(feedFilter);
        }
    }
}
