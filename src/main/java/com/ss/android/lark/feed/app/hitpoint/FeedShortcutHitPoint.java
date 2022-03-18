package com.ss.android.lark.feed.app.hitpoint;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.feed.app.binder.C37394h;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u0013\u001a\u00020\f*\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/feed/app/hitpoint/FeedShortcutHitPoint;", "", "()V", "ACTION", "", "SDK_COST", "appreciableKey", "clear", "", "end", "error", "errorCode", "", "isShortCut", "", "spanEnd", "latencyDetailKey", "spanStart", "start", "toInt", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.a.e */
public final class FeedShortcutHitPoint {

    /* renamed from: a */
    public static final FeedShortcutHitPoint f95785a = new FeedShortcutHitPoint();

    /* renamed from: b */
    private static String f95786b;

    private FeedShortcutHitPoint() {
    }

    /* renamed from: b */
    private final void m146915b() {
        f95786b = null;
    }

    /* renamed from: a */
    public final void mo137122a() {
        String str = f95786b;
        if (str != null) {
            AppreciableKit.f73094h.mo103524a().mo103515a(str);
            f95785a.m146915b();
        }
    }

    /* renamed from: b */
    private final int m146914b(boolean z) {
        if (!z) {
            return 1;
        }
        if (z) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public final void mo137126b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "latencyDetailKey");
        String str2 = f95786b;
        if (str2 != null) {
            AppreciableKit.f73094h.mo103524a().mo103521b(str2, str);
        }
    }

    /* renamed from: a */
    public final void mo137124a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "latencyDetailKey");
        String str2 = f95786b;
        if (str2 != null) {
            AppreciableKit.f73094h.mo103524a().mo103517a(str2, str);
        }
    }

    /* renamed from: a */
    public final void mo137125a(boolean z) {
        f95786b = AppreciableKit.m107388a(AppreciableKit.f73094h.mo103524a(), Biz.Messenger, Scene.Feed, Event.shortcut_action, Reflection.getOrCreateKotlinClass(C37394h.class).getSimpleName(), false, null, null, null, MapsKt.mapOf(TuplesKt.to("action", Integer.valueOf(m146914b(z)))), 224, null);
    }

    /* renamed from: a */
    public final void mo137123a(int i, boolean z) {
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Feed, Event.shortcut_action, ErrorType.SDK, ErrorLevel.Exception, i, null, null, null, false, null, null, MapsKt.mapOf(TuplesKt.to("action", Integer.valueOf(m146914b(z)))), 3520, null));
        m146915b();
    }
}
