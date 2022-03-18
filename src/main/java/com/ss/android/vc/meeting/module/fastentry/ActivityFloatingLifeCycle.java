package com.ss.android.vc.meeting.module.fastentry;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.vc.dependency.AbstractC60908v;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/meeting/module/fastentry/ActivityFloatingLifeCycle;", "Lcom/ss/android/vc/dependency/ILifeCycleDependency$IActivityObserver;", "()V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.fastentry.b */
public final class ActivityFloatingLifeCycle implements AbstractC60908v.AbstractC60909a {

    /* renamed from: a */
    public static final Lazy f154672a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C61659b.INSTANCE);

    /* renamed from: b */
    public static final Companion f154673b = new Companion(null);

    /* renamed from: a */
    public static final ActivityFloatingLifeCycle m240666a() {
        return f154673b.mo213590a();
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60909a
    /* renamed from: a */
    public void mo208382a(Activity activity) {
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60909a
    /* renamed from: a */
    public void mo208383a(Activity activity, Bundle bundle) {
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60909a
    /* renamed from: b */
    public void mo208385b(Activity activity, Bundle bundle) {
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60909a
    /* renamed from: e */
    public void mo208389e(Activity activity) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/meeting/module/fastentry/ActivityFloatingLifeCycle$Companion;", "", "()V", "instance", "Lcom/ss/android/vc/meeting/module/fastentry/ActivityFloatingLifeCycle;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/meeting/module/fastentry/ActivityFloatingLifeCycle;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.fastentry.b$a */
    public static final class Companion {
        /* renamed from: a */
        public final ActivityFloatingLifeCycle mo213590a() {
            Lazy lazy = ActivityFloatingLifeCycle.f154672a;
            Companion aVar = ActivityFloatingLifeCycle.f154673b;
            return (ActivityFloatingLifeCycle) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/meeting/module/fastentry/ActivityFloatingLifeCycle;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.fastentry.b$b */
    static final class C61659b extends Lambda implements Function0<ActivityFloatingLifeCycle> {
        public static final C61659b INSTANCE = new C61659b();

        C61659b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ActivityFloatingLifeCycle invoke() {
            return new ActivityFloatingLifeCycle();
        }
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60909a
    /* renamed from: d */
    public void mo208387d(Activity activity) {
        ActivityFloatingView.m240633b().mo213569a(true);
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60909a
    /* renamed from: b */
    public void mo208384b(Activity activity) {
        if (!(activity instanceof ByteRTCMeetingActivity)) {
            ActivityFloatingView.m240633b().mo213567a(activity);
            ActivityFloatingView.m240633b().mo213566a(300);
        }
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60909a
    /* renamed from: c */
    public void mo208386c(Activity activity) {
        ActivityFloatingView.m240633b().mo213569a(false);
        ActivityFloatingView.m240633b().mo213565a();
        ActivityFloatingView.m240633b().mo213570b(activity);
    }
}
