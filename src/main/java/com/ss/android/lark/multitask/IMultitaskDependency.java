package com.ss.android.lark.multitask;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.multitask.task.C48376q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0013\u0014J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/multitask/IMultitaskDependency;", "", "getContext", "Landroid/content/Context;", "getCurrentTenantId", "", "getCurrentUserId", "getInitializationBeforeStartTask", "Lkotlin/Function1;", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "", "getRecentStoppedActivityInfo", "Lcom/ss/android/lark/multitask/IMultitaskDependency$ActivityInfo;", "getTopActivity", "Landroid/app/Activity;", "registerAppStateObserver", "observer", "Lcom/ss/android/lark/multitask/IMultitaskDependency$AppStateObserver;", "unRegisterAppStateObserver", "ActivityInfo", "AppStateObserver", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.a */
public interface IMultitaskDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/multitask/IMultitaskDependency$AppStateObserver;", "", "onAppStateChanged", "", "topProcess", "", "isForeground", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.a$b */
    public interface AppStateObserver {
        /* renamed from: a */
        void mo168882a(String str, boolean z);
    }

    /* renamed from: a */
    Context mo168869a();

    /* renamed from: a */
    void mo168870a(AppStateObserver bVar);

    /* renamed from: b */
    Activity mo168871b();

    /* renamed from: c */
    ActivityInfo mo168872c();

    /* renamed from: d */
    String mo168873d();

    /* renamed from: e */
    String mo168874e();

    /* renamed from: f */
    Function1<C48376q, Unit> mo168875f();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/multitask/IMultitaskDependency$ActivityInfo;", "", "activityString", "", "process", "activityRef", "Landroid/app/Activity;", "(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V", "getActivityRef", "()Landroid/app/Activity;", "getActivityString", "()Ljava/lang/String;", "getProcess", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.a$a */
    public static final class ActivityInfo {

        /* renamed from: a */
        private final String f121561a;

        /* renamed from: b */
        private final String f121562b;

        /* renamed from: c */
        private final Activity f121563c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityInfo)) {
                return false;
            }
            ActivityInfo aVar = (ActivityInfo) obj;
            return Intrinsics.areEqual(this.f121561a, aVar.f121561a) && Intrinsics.areEqual(this.f121562b, aVar.f121562b) && Intrinsics.areEqual(this.f121563c, aVar.f121563c);
        }

        public int hashCode() {
            String str = this.f121561a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f121562b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Activity activity = this.f121563c;
            if (activity != null) {
                i = activity.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "ActivityInfo(activityString=" + this.f121561a + ", process=" + this.f121562b + ", activityRef=" + this.f121563c + ")";
        }

        /* renamed from: a */
        public final String mo168876a() {
            return this.f121561a;
        }

        /* renamed from: b */
        public final String mo168877b() {
            return this.f121562b;
        }

        /* renamed from: c */
        public final Activity mo168878c() {
            return this.f121563c;
        }

        public ActivityInfo(String str, String str2, Activity activity) {
            Intrinsics.checkParameterIsNotNull(str, "activityString");
            Intrinsics.checkParameterIsNotNull(str2, "process");
            this.f121561a = str;
            this.f121562b = str2;
            this.f121563c = activity;
        }
    }
}
