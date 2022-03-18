package com.ss.android.appcenter.business.activity.appsetting;

import android.app.Activity;
import android.os.CountDownTimer;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u00017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0012J\u0006\u0010.\u001a\u00020,J\u001e\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020\u00182\u0006\u0010-\u001a\u00020%2\u0006\u00101\u001a\u00020\u0004J&\u00102\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R\u001a\u0010(\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\t¨\u00068"}, d2 = {"Lcom/ss/android/appcenter/business/activity/appsetting/GadgetUpdateControl;", "", "()V", "TAG", "", "appId", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "checkNewVersionCountDown", "Landroid/os/CountDownTimer;", "getCheckNewVersionCountDown", "()Landroid/os/CountDownTimer;", "setCheckNewVersionCountDown", "(Landroid/os/CountDownTimer;)V", "checkUpdateCallback", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/appcenter/business/activity/appsetting/GadgetUpdateControl$UpdateCheckCallback;", "getCheckUpdateCallback", "()Ljava/lang/ref/WeakReference;", "setCheckUpdateCallback", "(Ljava/lang/ref/WeakReference;)V", "context", "Landroid/app/Activity;", "getContext", "setContext", "downloadCountDown", "getDownloadCountDown", "setDownloadCountDown", "gadgetUpdateAction", "Lcom/ss/android/appcenter/business/activity/appsetting/GadgetUpdateAction;", "getGadgetUpdateAction", "()Lcom/ss/android/appcenter/business/activity/appsetting/GadgetUpdateAction;", "setGadgetUpdateAction", "(Lcom/ss/android/appcenter/business/activity/appsetting/GadgetUpdateAction;)V", "gadgetUpdateCallback", "Lcom/ss/android/appcenter/business/activity/appsetting/GadgetUpdateCallback;", "getGadgetUpdateCallback", "setGadgetUpdateCallback", "scheme", "getScheme", "setScheme", "checkGadgetUpdate", "", "callback", "clean", "init", "ctx", "id", "onGadgetCheckUpdateDone", "hasNew", "", "currentVersion", "latestVersion", "UpdateCheckCallback", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.activity.appsetting.d */
public final class GadgetUpdateControl {

    /* renamed from: a */
    public static final GadgetUpdateControl f69118a = new GadgetUpdateControl();

    /* renamed from: b */
    private static WeakReference<GadgetUpdateCallback> f69119b;

    /* renamed from: c */
    private static WeakReference<Activity> f69120c;

    /* renamed from: d */
    private static WeakReference<UpdateCheckCallback> f69121d;

    /* renamed from: e */
    private static String f69122e = "";

    /* renamed from: f */
    private static CountDownTimer f69123f;

    /* renamed from: g */
    private static CountDownTimer f69124g;

    /* renamed from: h */
    private static String f69125h = "";

    /* renamed from: i */
    private static GadgetUpdateAction f69126i = new C27670c();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/appcenter/business/activity/appsetting/GadgetUpdateControl$UpdateCheckCallback;", "", "onCheckCallback", "", "hasNew", "", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appsetting.d$a */
    public interface UpdateCheckCallback {
        /* renamed from: a */
        void mo98543a(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/appcenter/business/activity/appsetting/GadgetUpdateControl$gadgetUpdateAction$1", "Lcom/ss/android/appcenter/business/activity/appsetting/GadgetUpdateAction;", "checkUpdateAndDownload", "", "appId", "", "restartGadgetApp", "retryDownloadGadgetApp", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appsetting.d$c */
    public static final class C27670c implements GadgetUpdateAction {
        C27670c() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\b"}, d2 = {"com/ss/android/appcenter/business/activity/appsetting/GadgetUpdateControl$gadgetUpdateAction$1$retryDownloadGadgetApp$1$1$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "appcenter_release", "com/ss/android/appcenter/business/activity/appsetting/GadgetUpdateControl$gadgetUpdateAction$1$$special$$inlined$let$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.appcenter.business.activity.appsetting.d$c$a */
        public static final class CountDownTimerC27671a extends CountDownTimer {

            /* renamed from: a */
            final /* synthetic */ String f69128a;

            public void onTick(long j) {
            }

            public void onFinish() {
                GadgetUpdateCallback cVar;
                C28184h.m103248b("GadgetUpdateControl", "retry download gadget  timeout");
                WeakReference<GadgetUpdateCallback> a = GadgetUpdateControl.f69118a.mo98571a();
                if (a != null && (cVar = a.get()) != null) {
                    cVar.mo98546b(this.f69128a);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            CountDownTimerC27671a(long j, long j2, String str) {
                super(j, j2);
                this.f69128a = str;
            }
        }

        @Override // com.ss.android.appcenter.business.activity.appsetting.GadgetUpdateAction
        /* renamed from: b */
        public void mo98569b(String str) {
            Activity activity;
            Intrinsics.checkParameterIsNotNull(str, "appId");
            WeakReference<Activity> b = GadgetUpdateControl.f69118a.mo98577b();
            if (b != null && (activity = b.get()) != null) {
                C28184h.m103250d("GadgetUpdateControl", "checkUpdateAndDownload gadget");
                C27548m m = C27548m.m100547m();
                Intrinsics.checkExpressionValueIsNotNull(m, "Providers.getInstance()");
                m.mo98224h().mo98192a(activity, str);
            }
        }

        @Override // com.ss.android.appcenter.business.activity.appsetting.GadgetUpdateAction
        /* renamed from: c */
        public void mo98570c(String str) {
            Activity activity;
            Intrinsics.checkParameterIsNotNull(str, "appId");
            WeakReference<Activity> b = GadgetUpdateControl.f69118a.mo98577b();
            if (b != null && (activity = b.get()) != null) {
                C27548m m = C27548m.m100547m();
                Intrinsics.checkExpressionValueIsNotNull(m, "Providers.getInstance()");
                m.mo98224h().mo98196b(activity, str);
                GadgetUpdateControl.f69118a.mo98573a(new CountDownTimerC27671a(5000, 1000, str).start());
            }
        }

        @Override // com.ss.android.appcenter.business.activity.appsetting.GadgetUpdateAction
        /* renamed from: a */
        public void mo98568a(String str) {
            Activity activity;
            Activity activity2;
            Intrinsics.checkParameterIsNotNull(str, "appId");
            WeakReference<Activity> b = GadgetUpdateControl.f69118a.mo98577b();
            if (b != null && (activity = b.get()) != null) {
                C28184h.m103250d("GadgetUpdateControl", "restart gadget");
                C27548m m = C27548m.m100547m();
                Intrinsics.checkExpressionValueIsNotNull(m, "Providers.getInstance()");
                m.mo98224h().mo98193a(activity, str, GadgetUpdateControl.f69118a.mo98579d());
                WeakReference<Activity> b2 = GadgetUpdateControl.f69118a.mo98577b();
                if (b2 != null && (activity2 = b2.get()) != null) {
                    activity2.finish();
                }
            }
        }
    }

    private GadgetUpdateControl() {
    }

    /* renamed from: a */
    public final WeakReference<GadgetUpdateCallback> mo98571a() {
        return f69119b;
    }

    /* renamed from: b */
    public final WeakReference<Activity> mo98577b() {
        return f69120c;
    }

    /* renamed from: c */
    public final WeakReference<UpdateCheckCallback> mo98578c() {
        return f69121d;
    }

    /* renamed from: d */
    public final String mo98579d() {
        return f69122e;
    }

    /* renamed from: e */
    public final CountDownTimer mo98580e() {
        return f69124g;
    }

    /* renamed from: f */
    public final String mo98581f() {
        return f69125h;
    }

    /* renamed from: g */
    public final GadgetUpdateAction mo98582g() {
        return f69126i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/appcenter/business/activity/appsetting/GadgetUpdateControl$onGadgetCheckUpdateDone$1$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appsetting.d$d */
    public static final class CountDownTimerC27672d extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ boolean f69129a;

        /* renamed from: b */
        final /* synthetic */ String f69130b;

        public void onTick(long j) {
        }

        public void onFinish() {
            GadgetUpdateCallback cVar;
            C28184h.m103248b("GadgetUpdateControl", "download gadget  timeout");
            WeakReference<GadgetUpdateCallback> a = GadgetUpdateControl.f69118a.mo98571a();
            if (a != null && (cVar = a.get()) != null) {
                cVar.mo98546b(this.f69130b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        CountDownTimerC27672d(long j, long j2, boolean z, String str) {
            super(j, j2);
            this.f69129a = z;
            this.f69130b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/appcenter/business/activity/appsetting/GadgetUpdateControl$checkGadgetUpdate$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appsetting.d$b */
    public static final class CountDownTimerC27669b extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ WeakReference f69127a;

        public void onTick(long j) {
        }

        public void onFinish() {
            C28184h.m103248b("GadgetUpdateControl", "check gadget update timeout");
            WeakReference<UpdateCheckCallback> c = GadgetUpdateControl.f69118a.mo98578c();
            if (c != null) {
                c.clear();
            }
            UpdateCheckCallback aVar = (UpdateCheckCallback) this.f69127a.get();
            if (aVar != null) {
                aVar.mo98543a(false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        CountDownTimerC27669b(WeakReference weakReference, long j, long j2) {
            super(j, j2);
            this.f69127a = weakReference;
        }
    }

    /* renamed from: h */
    public final void mo98583h() {
        f69125h = "";
        f69122e = "";
        f69121d = null;
        WeakReference<Activity> weakReference = f69120c;
        if (weakReference != null) {
            weakReference.clear();
        }
        WeakReference<GadgetUpdateCallback> weakReference2 = f69119b;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        CountDownTimer countDownTimer = f69123f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = f69124g;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
    }

    /* renamed from: a */
    public final void mo98573a(CountDownTimer countDownTimer) {
        f69124g = countDownTimer;
    }

    /* renamed from: a */
    public final void mo98575a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        f69122e = str;
    }

    /* renamed from: a */
    public final void mo98574a(UpdateCheckCallback aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        C28184h.m103250d("GadgetUpdateControl", "check gadget update start");
        WeakReference<UpdateCheckCallback> weakReference = new WeakReference<>(aVar);
        f69121d = weakReference;
        f69126i.mo98569b(f69125h);
        f69123f = new CountDownTimerC27669b(weakReference, 3000, 1000).start();
    }

    /* renamed from: a */
    public final void mo98572a(Activity activity, GadgetUpdateCallback cVar, String str) {
        Intrinsics.checkParameterIsNotNull(activity, "ctx");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        Intrinsics.checkParameterIsNotNull(str, "id");
        C28184h.m103250d("GadgetUpdateControl", "init GadgetUpdateControl");
        f69125h = str;
        f69120c = new WeakReference<>(activity);
        f69119b = new WeakReference<>(cVar);
    }

    /* renamed from: a */
    public final void mo98576a(String str, boolean z, String str2, String str3) {
        UpdateCheckCallback aVar;
        UpdateCheckCallback aVar2;
        Intrinsics.checkParameterIsNotNull(str, "appId");
        Intrinsics.checkParameterIsNotNull(str2, "currentVersion");
        Intrinsics.checkParameterIsNotNull(str3, "latestVersion");
        C28184h.m103250d("GadgetUpdateControl", "check gadget update done, has update: " + z + ", " + str2 + ", " + str3);
        if (Intrinsics.areEqual(str, f69125h)) {
            C27710b.m101284c(str, str2, str3);
            WeakReference<UpdateCheckCallback> weakReference = f69121d;
            if (weakReference == null || (aVar2 = weakReference.get()) == null) {
                C28184h.m103248b("GadgetUpdateControl", "check update callback null");
                return;
            }
            aVar2.mo98543a(z);
            f69121d = null;
            CountDownTimer countDownTimer = f69123f;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            if (z) {
                f69124g = new CountDownTimerC27672d(5000, 1000, z, str).start();
                return;
            }
            return;
        }
        C28184h.m103248b("GadgetUpdateControl", "check gadget update id not match");
        WeakReference<UpdateCheckCallback> weakReference2 = f69121d;
        if (weakReference2 != null && (aVar = weakReference2.get()) != null) {
            aVar.mo98543a(false);
            f69121d = null;
            CountDownTimer countDownTimer2 = f69123f;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
            }
        }
    }
}
