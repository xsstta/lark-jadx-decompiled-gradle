package com.ss.android.vc.meeting.bytertc;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.bottombar.AbstractC61444a;
import com.ss.android.vc.meeting.module.tab3.widgets.utils.DateTimeUtils;
import com.ss.android.vc.net.service.VCSettingsService;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event2.MediaDeviceWarningEvent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0015\u0018\u0000 02\u00020\u0001:\u00010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010#\u001a\u00020\u0013H\u0002J\"\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\b2\u0006\u0010'\u001a\u00020\u000fH\u0016J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0006H\u0002J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0006H\u0002J\b\u0010+\u001a\u00020\u001cH\u0002J\b\u0010,\u001a\u00020\u001cH\u0002J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0006H\u0002J\b\u0010.\u001a\u00020\u001cH\u0002J\b\u0010/\u001a\u00020\u001cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/vc/meeting/bytertc/MediaDeviceWarningControl;", "Lcom/ss/android/vc/meeting/bytertc/AbsMediaDeviceWarningControl;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "DAY_TIME", "", "DEVICE_IGNORE_COUNT", "", "DEVICE_IGNORE_FIRST_TIMESTAMP", "DEVICE_NO_WARNING_START_TIME", "MINUTE_TIME", "SECOND_TIME", "TAG", "deviceIgnoreCount", "", "deviceIgnoreFirstTimestamp", "deviceNoWarningStartTime", "disableInThisMeeting", "", "howlingSettingConfig", "Lcom/ss/android/vc/meeting/bytertc/VcHowlingSettingConfig;", "isHowlingDialogShowing", "meetingIgnoreTimestamps", "Ljava/util/ArrayList;", "meetingLastIgnoreTime", "needShowHowlingDialog", "checkIfNeedShowHowlingDialog", "", "inSecondInterval", "initAdminSettingsData", "initDeviceIgnoreTimestamps", "interruptIgnore", "isHowlingDialogFg", "isHowlingDisableThisDevice", "isHowlingDisableThisMeeting", "onMediaDeviceWarning", "deviceType", "deviceId", "code", "processDeviceIgnore", "timestamp", "processMeetingIgnore", "saveDeviceIgnoreCount", "saveDeviceIgnoreFirstTimestamp", "saveDeviceNoWarningStartTime", "setIgnoreTimestamp", "showHowlingDialog", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.bytertc.b */
public final class MediaDeviceWarningControl extends AbsMediaDeviceWarningControl {

    /* renamed from: c */
    public static final int f153359c = f153359c;

    /* renamed from: d */
    public static final Companion f153360d = new Companion(null);

    /* renamed from: a */
    public final String f153361a = "MediaDeviceWarningControl";

    /* renamed from: b */
    public boolean f153362b;

    /* renamed from: e */
    private C61234d f153363e = new C61234d();

    /* renamed from: f */
    private ArrayList<Long> f153364f = new ArrayList<>();

    /* renamed from: g */
    private long f153365g;

    /* renamed from: h */
    private int f153366h;

    /* renamed from: i */
    private long f153367i;

    /* renamed from: j */
    private long f153368j;

    /* renamed from: k */
    private boolean f153369k;

    /* renamed from: l */
    private boolean f153370l;

    /* renamed from: m */
    private long f153371m = 1000;

    /* renamed from: n */
    private long f153372n = 60000;

    /* renamed from: o */
    private long f153373o = 86400000;

    /* renamed from: p */
    private final String f153374p = "deviceIgnoreFirstTimestamp";

    /* renamed from: q */
    private final String f153375q = "deviceIgnoreCount";

    /* renamed from: r */
    private final String f153376r = "deviceNoWarningStartTime";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/meeting/bytertc/MediaDeviceWarningControl$Companion;", "", "()V", "HOWLING_WARNING_CODE", "", "getHOWLING_WARNING_CODE", "()I", "isCodeValid", "", "code", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.bytertc.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo211739a() {
            return MediaDeviceWarningControl.f153359c;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo211740a(int i) {
            if (i == mo211739a()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: h */
    private final boolean m238172h() {
        return this.f153369k;
    }

    /* renamed from: k */
    private final void m238175k() {
        C57744a.m224104a().putInt(this.f153375q, this.f153366h);
    }

    /* renamed from: l */
    private final void m238176l() {
        C57744a.m224104a().putLong(this.f153374p, this.f153365g);
    }

    @Override // com.ss.android.vc.meeting.bytertc.AbsMediaDeviceWarningControl
    /* renamed from: a */
    public void mo211735a() {
        if (this.f153370l) {
            m238170f();
            this.f153370l = false;
        }
    }

    /* renamed from: d */
    private final void m238168d() {
        C61234d a = C61234d.m238212a(VCSettingsService.getSettings("vc_howling_warn"));
        Intrinsics.checkExpressionValueIsNotNull(a, "VcHowlingSettingConfig.p…Service.VC_HOWLING_WARN))");
        this.f153363e = a;
    }

    /* renamed from: g */
    private final boolean m238171g() {
        boolean b = C63634c.m249496b("byteview.meeting.android.echo_detection");
        String str = this.f153361a;
        C60700b.m235858d(str, "[isHowlingDialogFg]", "fg = " + b);
        return b;
    }

    /* renamed from: i */
    private final boolean m238173i() {
        if (DateTimeUtils.m248532a() <= this.f153367i + (((long) this.f153363e.f153390f) * this.f153373o)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final boolean m238174j() {
        if (DateTimeUtils.m248532a() <= this.f153368j + (((long) this.f153363e.f153387c) * this.f153371m)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo211737b() {
        C60700b.m235851b(this.f153361a, "setIgnoreTimestamp", "ignore timestamp");
        long a = DateTimeUtils.m248532a();
        m238165a(a);
        m238166b(a);
    }

    /* renamed from: c */
    public final void mo211738c() {
        AbstractC61444a ai2;
        this.f153364f.clear();
        C60700b.m235851b(this.f153361a, "[interruptIgnore]", "refresh bottombar UI");
        C61303k kVar = this.mMeeting;
        if (kVar != null && (ai2 = kVar.ai()) != null) {
            ai2.mo213023d();
        }
    }

    /* renamed from: e */
    private final void m238169e() {
        this.f153365g = C57744a.m224104a().getLong(this.f153374p);
        this.f153366h = C57744a.m224104a().getInt(this.f153375q);
        this.f153367i = C57744a.m224104a().getLong(this.f153376r);
        String str = this.f153361a;
        C60700b.m235851b(str, "[initDeviceIgnoreTimestamps]", "deviceNoWarningStartTime = " + this.f153367i + ", deviceIgnoreCount = " + this.f153366h);
    }

    /* renamed from: f */
    private final void m238170f() {
        DisplayMode displayMode;
        if (!m238171g()) {
            C60700b.m235851b(this.f153361a, "[showHowlingDialog]", "fg false, return");
        } else if (m238172h()) {
            C60700b.m235851b(this.f153361a, "[showHowlingDialog2]", "meeting disable, return");
        } else if (m238173i()) {
            C60700b.m235851b(this.f153361a, "[showHowlingDialog3]", "device disable, return");
        } else if (this.f153362b) {
            C60700b.m235851b(this.f153361a, "[showHowlingDialog4]", "dialog is showing, return");
        } else if (m238174j()) {
            C60700b.m235851b(this.f153361a, "[showHowlingDialog5]", "has shown dialog several seconds before, return");
        } else {
            Activity c = VCAppLifeCycle.m236256c();
            C61303k meeting = getMeeting();
            if (meeting != null) {
                displayMode = meeting.mo212067p();
            } else {
                displayMode = null;
            }
            if (displayMode != DisplayMode.ACTIVITY || c == null || c.isFinishing()) {
                C61303k meeting2 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                if (meeting2.mo212067p() != DisplayMode.WINDOW) {
                    C61303k meeting3 = getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
                    if (meeting3.mo212067p() != DisplayMode.FAST_ENTRY) {
                        return;
                    }
                }
                C60700b.m235851b(this.f153361a, "[showHowlingDialog4]", "floatwindow");
                this.f153370l = true;
                return;
            }
            C60700b.m235851b(this.f153361a, "[showHowlingDialog3]", "meeting");
            this.f153362b = true;
            MediaDeviceWarningEvent.f160825a.mo220260a();
            VCDialogUtils.m236204a((Context) c, (View) null, (int) R.string.View_MV_CheckedFoundEcho, 4, Integer.valueOf((int) R.string.View_MV_SmoothMeetingMute), (int) R.string.View_M_IgnoreButton, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC61231b(this), (int) R.string.View_MV_MuteButton, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC61232c(this), false);
        }
    }

    /* renamed from: c */
    private final void m238167c(long j) {
        C57744a.m224104a().putLong(this.f153376r, j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaDeviceWarningControl(C61303k kVar) {
        super(kVar);
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        m238168d();
        m238169e();
    }

    /* renamed from: a */
    private final void m238165a(long j) {
        if (!this.f153369k) {
            this.f153368j = j;
            this.f153364f.add(Long.valueOf(j));
            long j2 = j - (((long) this.f153363e.f153385a) * this.f153372n);
            int i = 0;
            Iterator<Long> it = this.f153364f.iterator();
            while (it.hasNext()) {
                Long next = it.next();
                Intrinsics.checkExpressionValueIsNotNull(next, "item");
                long longValue = next.longValue();
                if (j2 <= longValue && j >= longValue) {
                    i++;
                }
            }
            if (i >= this.f153363e.f153386b) {
                this.f153369k = true;
                this.f153364f.clear();
            }
        }
    }

    /* renamed from: b */
    private final void m238166b(long j) {
        int i = this.f153366h + 1;
        this.f153366h = i;
        if (i >= this.f153363e.f153389e) {
            if (j - this.f153365g <= ((long) this.f153363e.f153388d) * this.f153373o) {
                C60700b.m235851b(this.f153361a, "[processDeviceIgnore]", "touch device period");
                this.f153367i = j;
                m238167c(j);
            } else {
                C60700b.m235851b(this.f153361a, "[processDeviceIgnore2]", "reset firstTime");
                this.f153365g = j;
            }
            this.f153366h = 0;
        } else if (this.f153366h == 1) {
            this.f153365g = j;
            m238176l();
        }
        m238175k();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.bytertc.b$b */
    public static final class DialogInterface$OnClickListenerC61231b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediaDeviceWarningControl f153377a;

        DialogInterface$OnClickListenerC61231b(MediaDeviceWarningControl bVar) {
            this.f153377a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C60700b.m235851b(this.f153377a.f153361a, "[onClick]", "click ignore");
            this.f153377a.f153362b = false;
            MediaDeviceWarningEvent.f160825a.mo220261a(true);
            this.f153377a.mo211737b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.bytertc.b$c */
    public static final class DialogInterface$OnClickListenerC61232c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediaDeviceWarningControl f153378a;

        DialogInterface$OnClickListenerC61232c(MediaDeviceWarningControl bVar) {
            this.f153378a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C60700b.m235851b(this.f153378a.f153361a, "[onClick2]", "click mute");
            this.f153378a.f153362b = false;
            MediaDeviceWarningEvent.f160825a.mo220261a(false);
            this.f153378a.mo211738c();
        }
    }

    @Override // com.ss.android.vc.meeting.bytertc.AbsMediaDeviceWarningControl
    /* renamed from: a */
    public void mo211736a(int i, String str, int i2) {
        String str2 = this.f153361a;
        C60700b.m235851b(str2, "[onMediaDeviceWarning]", "code = " + i2);
        if (f153360d.mo211740a(i2) && i2 == f153359c) {
            m238170f();
        }
    }
}
