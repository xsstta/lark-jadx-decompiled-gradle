package com.ss.android.lark.multitask.task;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016R*\u0010\u0003\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005`\u0007X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/multitask/task/ActivityLifecycle;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "_mostRecentActivities", "Ljava/util/LinkedHashSet;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "Lkotlin/collections/LinkedHashSet;", "mostRecentActivities", "", "getMostRecentActivities", "()Ljava/util/List;", "topActivity", "getTopActivity", "()Landroid/app/Activity;", "onActivityCreated", "", "activity", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.multitask.task.b */
public final class ActivityLifecycle implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static final ActivityLifecycle f121792a = new ActivityLifecycle();

    /* renamed from: b */
    private static LinkedHashSet<WeakReference<Activity>> f121793b = new LinkedHashSet<>();

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
    }

    public void onActivityStopped(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
    }

    private ActivityLifecycle() {
    }

    /* renamed from: a */
    public final List<Activity> mo169205a() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = f121793b.iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) it.next().get();
            if (activity != null) {
                arrayList.add(activity);
            }
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.multitask.task.b$a */
    static final class C48364a extends Lambda implements Function1<WeakReference<Activity>, Boolean> {
        final /* synthetic */ Activity $activity;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48364a(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(WeakReference<Activity> weakReference) {
            return Boolean.valueOf(invoke(weakReference));
        }

        public final boolean invoke(WeakReference<Activity> weakReference) {
            Intrinsics.checkParameterIsNotNull(weakReference, "it");
            return Intrinsics.areEqual(weakReference.get(), this.$activity);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.multitask.task.b$b */
    static final class C48365b extends Lambda implements Function1<WeakReference<Activity>, Boolean> {
        final /* synthetic */ Activity $activity;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48365b(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(WeakReference<Activity> weakReference) {
            return Boolean.valueOf(invoke(weakReference));
        }

        public final boolean invoke(WeakReference<Activity> weakReference) {
            Intrinsics.checkParameterIsNotNull(weakReference, "it");
            return Intrinsics.areEqual(weakReference.get(), this.$activity);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        CollectionsKt.removeAll(f121793b, new C48364a(activity));
    }

    public void onActivityStarted(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        CollectionsKt.removeAll(f121793b, new C48365b(activity));
        f121793b.add(new WeakReference<>(activity));
    }
}
