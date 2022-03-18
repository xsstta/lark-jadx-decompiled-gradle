package com.ss.android.vc.meeting.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\b\u0010\u0010\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/meeting/utils/ProximityUtil;", "", "()V", "detector", "Lcom/ss/android/vc/meeting/utils/ProximityDetector;", "check", "", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "enable", "", "runTask", "runnable", "Ljava/lang/Runnable;", "stop", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.utils.l */
public final class ProximityUtil {

    /* renamed from: a */
    public static final ProximityUtil f160437a = new ProximityUtil();

    /* renamed from: b */
    private static final ProximityDetector f160438b = new ProximityDetector();

    private ProximityUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m248868a() {
        m248870a(RunnableC63502b.f160440a);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.l$a */
    public static final class RunnableC63501a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f160439a;

        RunnableC63501a(boolean z) {
            this.f160439a = z;
        }

        public final void run() {
            ProximityUtil lVar = ProximityUtil.f160437a;
            ProximityUtil.f160438b.mo219642a(this.f160439a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.l$b */
    static final class RunnableC63502b implements Runnable {

        /* renamed from: a */
        public static final RunnableC63502b f160440a = new RunnableC63502b();

        RunnableC63502b() {
        }

        public final void run() {
            ProximityUtil lVar = ProximityUtil.f160437a;
            ProximityUtil.f160438b.mo219643b();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m248871a(boolean z) {
        m248870a(new RunnableC63501a(z));
    }

    @JvmStatic
    /* renamed from: a */
    private static final void m248870a(Runnable runnable) {
        Handler e = C60735ab.m236017e();
        Intrinsics.checkExpressionValueIsNotNull(e, "VCThreadUtils.getLowPriorityBackgroundHandler()");
        Looper looper = e.getLooper();
        Intrinsics.checkExpressionValueIsNotNull(looper, "VCThreadUtils.getLowPrio…ackgroundHandler().looper");
        if (Intrinsics.areEqual(Looper.myLooper(), looper)) {
            runnable.run();
        } else {
            C60735ab.m236017e().post(runnable);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m248869a(Activity activity, C61303k kVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        if (kVar != null) {
            if (!kVar.mo212101S() && (kVar.mo212064m() || (kVar.mo212065n() && !C60776r.m236143a(activity)))) {
                MeetingAudioManager k = MeetingAudioManager.m239471k();
                Intrinsics.checkExpressionValueIsNotNull(k, "MeetingAudioManager.getInstance()");
                if (k.mo212681A() && !kVar.mo212092J().mo212510G()) {
                    z = true;
                    m248871a(z);
                }
            }
            z = false;
            m248871a(z);
        }
    }
}
