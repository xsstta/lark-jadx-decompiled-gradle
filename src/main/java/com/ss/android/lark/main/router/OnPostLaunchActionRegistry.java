package com.ss.android.lark.main.router;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0007R2\u0010\u0004\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00020\u0002 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00070\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/main/router/OnPostLaunchActionRegistry;", "", "Lcom/ss/android/lark/main/router/PostLaunchAction;", "()V", "actions", "", "kotlin.jvm.PlatformType", "", "lock", "", "invokeActionsAndClear", "", "activity", "Landroid/app/Activity;", "iterator", "", "register", "action", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.router.a */
public final class OnPostLaunchActionRegistry implements Iterable<PostLaunchAction>, KMappedMarker {

    /* renamed from: a */
    public static final OnPostLaunchActionRegistry f112857a = new OnPostLaunchActionRegistry();

    /* renamed from: b */
    private static final Object f112858b = new Object();

    /* renamed from: c */
    private static final List<PostLaunchAction> f112859c = Collections.synchronizedList(new ArrayList());

    private OnPostLaunchActionRegistry() {
    }

    @Override // java.lang.Iterable
    public Iterator<PostLaunchAction> iterator() {
        return f112859c.iterator();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m176546a(PostLaunchAction postLaunchAction) {
        Intrinsics.checkParameterIsNotNull(postLaunchAction, "action");
        synchronized (f112858b) {
            f112859c.add(postLaunchAction);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m176545a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        synchronized (f112858b) {
            List<PostLaunchAction> list = f112859c;
            Intrinsics.checkExpressionValueIsNotNull(list, "actions");
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo157938a(activity);
            }
            f112859c.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
