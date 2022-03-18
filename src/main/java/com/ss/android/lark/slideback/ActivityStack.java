package com.ss.android.lark.slideback;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/slideback/ActivityStack;", "", "()V", "sActivityStack", "Ljava/util/LinkedList;", "Landroid/app/Activity;", "topActivity", "getTopActivity", "()Landroid/app/Activity;", "getPreviousActivity", "curActivity", "init", "", "application", "Landroid/app/Application;", "slideback_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.slideback.b */
public final class ActivityStack {

    /* renamed from: a */
    public static final ActivityStack f135610a = new ActivityStack();

    /* renamed from: b */
    private static final LinkedList<Activity> f135611b = new LinkedList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/slideback/ActivityStack$init$1", "Lcom/ss/android/lark/slideback/SimpleActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "slideback_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.slideback.b$a */
    public static final class C54921a extends SimpleActivityLifecycleCallbacks {
        C54921a() {
        }

        @Override // com.ss.android.lark.slideback.SimpleActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            if (!(activity instanceof NoViewActivity)) {
                ActivityStack bVar = ActivityStack.f135610a;
                ActivityStack.f135611b.remove(activity);
            }
        }

        @Override // com.ss.android.lark.slideback.SimpleActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            if (!(activity instanceof NoViewActivity)) {
                ActivityStack bVar = ActivityStack.f135610a;
                ActivityStack.f135611b.remove(activity);
                ActivityStack bVar2 = ActivityStack.f135610a;
                ActivityStack.f135611b.add(activity);
            }
        }
    }

    private ActivityStack() {
    }

    /* renamed from: a */
    public final void mo187276a(Application application) {
        Intrinsics.checkParameterIsNotNull(application, "application");
        application.registerActivityLifecycleCallbacks(new C54921a());
    }

    /* renamed from: a */
    public final Activity mo187275a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "curActivity");
        LinkedList<Activity> linkedList = f135611b;
        boolean z = false;
        for (int size = linkedList.size() - 1; size >= 0; size--) {
            if (z) {
                Activity activity2 = linkedList.get(size);
                Intrinsics.checkExpressionValueIsNotNull(activity2, "activities[index]");
                Activity activity3 = activity2;
                if (!activity3.isFinishing()) {
                    return activity3;
                }
            } else if (linkedList.get(size) == activity) {
                z = true;
            }
        }
        return null;
    }
}
