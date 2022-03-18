package com.ss.android.vc.meeting.module.screenmonitor;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.receiver.VcScreenMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/meeting/module/screenmonitor/ScreenMonitorForCamera;", "Lcom/ss/android/vc/meeting/module/receiver/VcScreenMonitor$IScreenMonitor;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "onScreenOff", "", "onScreenOn", "onUserPresent", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.m.a */
public final class ScreenMonitorForCamera implements VcScreenMonitor.AbstractC62891b {

    /* renamed from: a */
    public static final Companion f156207a = new Companion(null);

    /* renamed from: b */
    private final C61303k f156208b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/screenmonitor/ScreenMonitorForCamera$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.m.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.receiver.VcScreenMonitor.AbstractC62891b
    /* renamed from: a */
    public void mo212174a() {
        C60700b.m235851b("ScreenMonitorForCamera", "[onScreenOn]", "onScreenOn");
    }

    @Override // com.ss.android.vc.meeting.module.receiver.VcScreenMonitor.AbstractC62891b
    /* renamed from: c */
    public void mo212176c() {
        boolean F = this.f156208b.mo212092J().mo212509F();
        C60700b.m235851b("ScreenMonitorForCamera", "[onUserPresent]", "pendingOpenCamera: " + F);
        if (F) {
            this.f156208b.mo212092J().mo212551j(false);
            this.f156208b.ai().mo213011a(false, false);
        }
    }

    @Override // com.ss.android.vc.meeting.module.receiver.VcScreenMonitor.AbstractC62891b
    /* renamed from: b */
    public void mo212175b() {
        boolean A = this.f156208b.mo212092J().mo212504A();
        boolean a = C60788y.m236247a(ar.m236694a());
        C60700b.m235851b("ScreenMonitorForCamera", "[onScreenOff]", "isVideoMuted: " + A + " permission: " + a);
        if (!A && a) {
            this.f156208b.mo212092J().mo212551j(true);
            this.f156208b.ai().mo213011a(true, false);
        }
    }

    public ScreenMonitorForCamera(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f156208b = kVar;
        boolean b = VcScreenMonitor.m246180b(ar.m236694a());
        C60700b.m235851b("ScreenMonitorForCamera", "[init]", "isScreenOn: " + b);
    }
}
