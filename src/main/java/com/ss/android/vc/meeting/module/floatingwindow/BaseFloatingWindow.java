package com.ss.android.vc.meeting.module.floatingwindow;

import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.feedback.C61676d;
import com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent;
import com.ss.android.vc.meeting.module.follow.common.C61806b;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.p3130k.p3131a.C62003a;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserService;
import com.ss.android.vc.service.impl.IAppConfigurationChangeListener;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event.bk;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vcxp.C63785a;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import java.util.Iterator;

@XClass
public class BaseFloatingWindow extends AbsFloatingWindow implements IFloatWindowPresent, IAppConfigurationChangeListener {

    /* renamed from: b */
    protected FloatWindowLaunchType f154761b;

    /* renamed from: c */
    protected FrameLayout f154762c;

    /* renamed from: d */
    protected boolean f154763d;

    /* renamed from: e */
    protected boolean f154764e;

    /* renamed from: f */
    protected boolean f154765f;

    /* renamed from: g */
    protected VideoChatFloatWindow f154766g;

    /* renamed from: h */
    protected MeetingFloatWindow f154767h;

    /* renamed from: i */
    protected LocalShareFloatWindow f154768i;

    /* renamed from: j */
    protected boolean f154769j = VideoChatModuleDependency.getMultiTaskDependency().mo196453b();

    /* renamed from: k */
    private VideoChatUser f154770k;

    /* renamed from: l */
    private VideoChatUser f154771l;

    /* renamed from: m */
    private final IFloatWindowPresent.FloatWindowType f154772m;

    /* renamed from: n */
    private C61999a f154773n;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo213581g() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo213582h() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo213583i() {
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61735h
    /* renamed from: p */
    public void mo213671p() {
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent
    @XMethod(runOnProcess = XProcess.VC)
    public VideoChatUser getLocalUser() {
        return this.f154770k;
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent
    @XMethod(runOnProcess = XProcess.VC)
    public VideoChatUser getRemoteUser() {
        return this.f154771l;
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent
    /* renamed from: o */
    public FrameLayout mo213670o() {
        return this.f154762c;
    }

    /* renamed from: f */
    private void mo213580f() {
        LocalShareFloatWindow iVar = this.f154768i;
        if (iVar != null) {
            iVar.mo213824i();
        }
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent
    /* renamed from: m */
    public C61303k mo213668m() {
        return mo212181b();
    }

    /* access modifiers changed from: protected */
    public void showMeetingFloatingWindowFinally() {
        this.f154766g.mo213771v();
    }

    @XMethod(runOnProcess = XProcess.VC)
    private VideoChat getVideoChat() {
        return mo212181b().mo212056e();
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbsFloatingWindow
    public void dismiss() {
        C60700b.m235851b("BaseFloatingWindow", "[dismiss]", "dismiss");
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow.RunnableC616781 */

            public void run() {
                if (BaseFloatingWindow.this.f154766g != null) {
                    BaseFloatingWindow.this.f154766g.mo213727C();
                    BaseFloatingWindow.this.f154766g = null;
                }
                if (BaseFloatingWindow.this.f154767h != null) {
                    BaseFloatingWindow.this.f154767h.mo213696q();
                    BaseFloatingWindow.this.f154767h = null;
                }
                if (BaseFloatingWindow.this.f154768i != null) {
                    BaseFloatingWindow.this.f154768i.mo213825o();
                    BaseFloatingWindow.this.f154768i = null;
                }
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbsFloatingWindow
    /* renamed from: j */
    public void mo213661j() {
        C60700b.m235851b("BaseFloatingWindow", "[meetingWakeUp]", "meetingWakeUp(");
        VideoChatFloatWindow videoChatFloatWindow = this.f154766g;
        if (videoChatFloatWindow != null) {
            videoChatFloatWindow.mo213725A();
        }
        MeetingFloatWindow meetingFloatWindow = this.f154767h;
        if (meetingFloatWindow != null) {
            meetingFloatWindow.mo213697r();
        }
        LocalShareFloatWindow iVar = this.f154768i;
        if (iVar != null) {
            iVar.mo213826p();
        }
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61734g
    /* renamed from: l */
    public void mo213667l() {
        C60700b.m235851b("BaseFloatingWindow", "[onInit]", "onInit");
        VideoChatFloatWindow videoChatFloatWindow = this.f154766g;
        if (videoChatFloatWindow != null) {
            videoChatFloatWindow.mo213667l();
        }
        MeetingFloatWindow meetingFloatWindow = this.f154767h;
        if (meetingFloatWindow != null) {
            meetingFloatWindow.mo213667l();
        }
        LocalShareFloatWindow iVar = this.f154768i;
        if (iVar != null) {
            iVar.mo213667l();
        }
    }

    @XMethod(runOnProcess = XProcess.Main)
    public void setVideoView() {
        C60700b.m235851b("BaseFloatingWindow", "[setVideoView]", "setVideoView");
        VideoChatFloatWindow videoChatFloatWindow = this.f154766g;
        if (videoChatFloatWindow != null) {
            videoChatFloatWindow.mo213772w();
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow$3 */
    static /* synthetic */ class C616803 {

        /* renamed from: a */
        static final /* synthetic */ int[] f154776a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.vc.entity.VideoChat$EndReason[] r0 = com.ss.android.vc.entity.VideoChat.EndReason.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow.C616803.f154776a = r0
                com.ss.android.vc.entity.VideoChat$EndReason r1 = com.ss.android.vc.entity.VideoChat.EndReason.REFUSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow.C616803.f154776a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.VideoChat$EndReason r1 = com.ss.android.vc.entity.VideoChat.EndReason.CANCEL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow.C616803.f154776a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.VideoChat$EndReason r1 = com.ss.android.vc.entity.VideoChat.EndReason.CONNECTION_FAILED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow.C616803.f154776a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.entity.VideoChat$EndReason r1 = com.ss.android.vc.entity.VideoChat.EndReason.SDK_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow.C616803.f154776a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.vc.entity.VideoChat$EndReason r1 = com.ss.android.vc.entity.VideoChat.EndReason.RING_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow.C616803.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkValid() {
        if (mo212181b().mo212062k()) {
            C60700b.m235851b("BaseFloatingWindow", "[checkValid]", "IDLE!!!");
            dismiss();
            return true;
        } else if (this.f154772m != IFloatWindowPresent.FloatWindowType.BUBBLE || C28460b.m104296a(ar.m236694a())) {
            return false;
        } else {
            C60700b.m235851b("BaseFloatingWindow", "[checkValid2]", "no permission!!!");
            return true;
        }
    }

    /* renamed from: k */
    public void mo213666k() {
        C60700b.m235851b("BaseFloatingWindow", "[onShow]", "onShow");
        if (!checkValid()) {
            mo212206a(DisplayMode.WINDOW);
            mo212181b().ae().mo213807a(this);
            mo213670o().setVisibility(0);
            VideoChatFloatWindow videoChatFloatWindow = this.f154766g;
            if (videoChatFloatWindow != null) {
                videoChatFloatWindow.mo213690m();
            }
            MeetingFloatWindow meetingFloatWindow = this.f154767h;
            if (meetingFloatWindow != null) {
                meetingFloatWindow.mo213690m();
            }
            LocalShareFloatWindow iVar = this.f154768i;
            if (iVar != null) {
                iVar.mo213690m();
            }
        }
    }

    /* renamed from: n */
    public void mo213669n() {
        C60700b.m235851b("BaseFloatingWindow", "[onDismiss]", "onDismiss");
        VideoChatFloatWindow videoChatFloatWindow = this.f154766g;
        if (videoChatFloatWindow != null) {
            videoChatFloatWindow.mo213691n();
            this.f154766g.release();
            this.f154764e = false;
        }
        MeetingFloatWindow meetingFloatWindow = this.f154767h;
        if (meetingFloatWindow != null) {
            meetingFloatWindow.mo213691n();
            this.f154767h.release();
            this.f154763d = false;
        }
        LocalShareFloatWindow iVar = this.f154768i;
        if (iVar != null) {
            iVar.mo213691n();
            this.f154768i.release();
            this.f154765f = false;
        }
        this.f154766g = null;
        this.f154767h = null;
        this.f154768i = null;
        this.f154761b = null;
        mo212181b().ae().mo213810b(this);
        mo212181b().aj().mo216409b();
        C61999a aVar = this.f154773n;
        if (aVar != null) {
            aVar.mo214611a();
            this.f154773n = null;
        }
        VideoChatService.m249602d().mo220180b(this);
        super.mo212177a();
    }

    @XMethod(runOnProcess = XProcess.VC)
    private void setScreenRotation(int i) {
        C61237h.m238223a().mo210524b(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo213576a(long j) {
        this.f154767h.mo213686a(j);
    }

    /* access modifiers changed from: protected */
    public void showStaticFloatingWindowFinally(boolean z) {
        this.f154766g.mo213747e(z);
    }

    @Override // com.ss.android.vc.service.impl.IAppConfigurationChangeListener
    /* renamed from: a */
    public void mo213662a(Configuration configuration) {
        C60700b.m235851b("BaseFloatingWindow", "[onConfigurationChanged]", "newConfig.orientation = " + configuration.orientation);
        C62003a.m242249a();
    }

    @XMethod(runOnProcess = XProcess.VC)
    private LocalShareFloatWindow createLocalShareFloatWindow(LocalShareFloatWindow iVar) {
        boolean z;
        if (this.f154768i == null) {
            LocalShareFloatWindow iVar2 = new LocalShareFloatWindow(this, this.f154772m);
            this.f154768i = iVar2;
            if (mo213581g() || mo213582h()) {
                z = true;
            } else {
                z = false;
            }
            iVar2.mo213821a(z);
            C63785a.m250436a(iVar, this.f154768i);
        }
        return this.f154768i;
    }

    @XMethod(runOnProcess = XProcess.VC)
    private VideoChatFloatWindow createVideoChatFloatWindow(VideoChatFloatWindow videoChatFloatWindow) {
        boolean z;
        if (this.f154766g == null) {
            VideoChatFloatWindow videoChatFloatWindow2 = new VideoChatFloatWindow(this, this.f154772m);
            this.f154766g = videoChatFloatWindow2;
            if (mo213581g() || mo213582h()) {
                z = true;
            } else {
                z = false;
            }
            videoChatFloatWindow2.mo213736a(z);
            C63785a.m250436a(videoChatFloatWindow, this.f154766g);
        }
        return this.f154766g;
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61300h
    /* renamed from: a */
    public void mo212080a(VideoChat.Type type) {
        C60700b.m235851b("BaseFloatingWindow", "[onMeetingUpgrade]", "onMeetingUpgrade");
        m240751b(0, FloatWindowLaunchType.NORMAL);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        VideoChat e;
        C61303k b = mo212181b();
        if (b != null && (e = b.mo212056e()) != null && e.getType() != VideoChat.Type.CALL) {
            if (e.getVideoChatSettings() == null || e.getVideoChatSettings().getSubType() != VideoChatSettings.SubType.SCREEN_SHARE || C61806b.m241475b(videoChatInMeetingInfo.getFollowInfo())) {
                m240751b(0, this.f154761b);
            }
        }
    }

    /* renamed from: a */
    private void m240750a(FloatWindowLaunchType floatWindowLaunchType) {
        C60700b.m235851b("BaseFloatingWindow", "[showCallFloatWindow]", "launchType = " + floatWindowLaunchType);
        if (!checkValid()) {
            if (this.f154764e) {
                C60700b.m235851b("BaseFloatingWindow", "[showCallFloatWindow2]", "return because float bubble is shown");
                return;
            }
            this.f154764e = true;
            this.f154770k = VideoChatUserService.getCurrentUser();
            this.f154771l = mo212181b().mo212088F().getSingleRemoteUser();
            this.f154761b = floatWindowLaunchType;
            showCallFloatWindowInternal(mo212181b().mo212065n(), mo212181b().mo212064m());
            bk.m250182a(getVideoChat(), this.f154772m);
        }
    }

    /* renamed from: b */
    private void m240752b(FloatWindowLaunchType floatWindowLaunchType) {
        C60700b.m235851b("BaseFloatingWindow", "[showLocalShareWindow]", "launchType = " + floatWindowLaunchType);
        if (!checkValid()) {
            if (this.f154765f) {
                C60700b.m235851b("BaseFloatingWindow", "[showLocalShareWindow2]", "return because float bubble is shown");
                return;
            }
            this.f154765f = true;
            mo213663a(floatWindowLaunchType, mo212181b().mo212056e());
        }
    }

    public BaseFloatingWindow(C61303k kVar, IFloatWindowPresent.FloatWindowType floatWindowType) {
        super(kVar);
        this.f154772m = floatWindowType;
    }

    /* renamed from: b */
    private void m240751b(long j, FloatWindowLaunchType floatWindowLaunchType) {
        C60700b.m235851b("BaseFloatingWindow", "[showFloat]", j + " " + floatWindowLaunchType);
        if (!checkValid()) {
            if (this.f154763d) {
                C60700b.m235851b("BaseFloatingWindow", "[showFloat2]", "return because float bubble is shown");
                return;
            }
            this.f154763d = true;
            showFloatInternal(j, floatWindowLaunchType, mo212181b().mo212056e());
        }
    }

    @XMethod(runOnProcess = XProcess.VC)
    private MeetingFloatWindow createMeetingFloatWindow(FloatWindowLaunchType floatWindowLaunchType, MeetingFloatWindow meetingFloatWindow) {
        boolean z;
        if (this.f154767h == null) {
            this.f154761b = floatWindowLaunchType;
            MeetingFloatWindow meetingFloatWindow2 = new MeetingFloatWindow(this, this.f154772m);
            this.f154767h = meetingFloatWindow2;
            if (mo213581g() || mo213582h()) {
                z = true;
            } else {
                z = false;
            }
            meetingFloatWindow2.mo213689e(z);
            C63785a.m250436a(meetingFloatWindow, this.f154767h);
        }
        return this.f154767h;
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61297e
    public void onDisplayModeChange(DisplayMode displayMode, DisplayMode displayMode2) {
        C60700b.m235851b("BaseFloatingWindow", "[onDisplayModeChange]", "src " + displayMode + " dst " + displayMode2);
        if (this.f154772m == IFloatWindowPresent.FloatWindowType.BUBBLE) {
            if (displayMode == DisplayMode.WINDOW) {
                dismiss();
            }
        } else if (this.f154772m == IFloatWindowPresent.FloatWindowType.FAST_ENTRY && displayMode == DisplayMode.FAST_ENTRY) {
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void showCallFloatWindowInternal(boolean z, boolean z2) {
        boolean z3;
        if (this.f154766g == null) {
            VideoChatFloatWindow videoChatFloatWindow = new VideoChatFloatWindow(this, this.f154772m);
            this.f154766g = videoChatFloatWindow;
            if (mo213581g() || mo213582h()) {
                z3 = true;
            } else {
                z3 = false;
            }
            videoChatFloatWindow.mo213736a(z3);
            if (mo213581g()) {
                this.f154766g.mo213765s();
                C63785a.m250436a(createVideoChatFloatWindow(this.f154766g), this.f154766g);
            }
        }
        if (z) {
            showMeetingFloatingWindowFinally();
        } else {
            showStaticFloatingWindowFinally(z2);
        }
        setScreenRotation(0);
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbsFloatingWindow
    /* renamed from: a */
    public void mo213660a(long j, FloatWindowLaunchType floatWindowLaunchType) {
        VideoChat e;
        C61303k b = mo212181b();
        if (b != null && (e = b.mo212056e()) != null) {
            if (e.getVideoChatSettings() != null && e.getVideoChatSettings().getSubType() == VideoChatSettings.SubType.SCREEN_SHARE && !C61806b.m241475b(b.mo212091I().mo212490a().mo212480l())) {
                m240752b(floatWindowLaunchType);
            } else if (e.getType() == VideoChat.Type.CALL) {
                m240750a(floatWindowLaunchType);
            } else {
                m240751b(j, floatWindowLaunchType);
            }
            if (C60776r.m236157o()) {
                C60735ab.m236002a($$Lambda$BaseFloatingWindow$6CV6nwftiGivsVgo8NdkzOsAhcA.INSTANCE, 300);
            }
            C61999a aVar = new C61999a(ar.m236694a());
            this.f154773n = aVar;
            aVar.mo214620b(true);
            if (b.aj().mo216408a()) {
                b.aj().mo216401a(this.f154773n);
            }
            FrameLayout frameLayout = this.f154762c;
            if (frameLayout != null) {
                frameLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    /* class com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow.ViewTreeObserver$OnPreDrawListenerC616792 */

                    public boolean onPreDraw() {
                        if (BaseFloatingWindow.this.f154762c != null) {
                            BaseFloatingWindow.this.f154762c.getViewTreeObserver().removeOnPreDrawListener(this);
                        }
                        C63693e.m249692h();
                        return true;
                    }
                });
            }
            VideoChatService.m249602d().mo220179a(this);
            MeetingOnTheCallEvent2.m249823a().mo220307a(b.mo212093K(), true, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo213663a(FloatWindowLaunchType floatWindowLaunchType, VideoChat videoChat) {
        boolean z;
        if (this.f154768i == null) {
            this.f154761b = floatWindowLaunchType;
            LocalShareFloatWindow iVar = new LocalShareFloatWindow(this, this.f154772m);
            this.f154768i = iVar;
            if (mo213581g() || mo213582h()) {
                z = true;
            } else {
                z = false;
            }
            iVar.mo213821a(z);
            if (mo213581g()) {
                C63785a.m250436a(createLocalShareFloatWindow(this.f154768i), this.f154768i);
            }
        }
        mo213580f();
    }

    /* access modifiers changed from: protected */
    public void showFloatInternal(long j, FloatWindowLaunchType floatWindowLaunchType, VideoChat videoChat) {
        boolean z;
        if (this.f154767h == null) {
            this.f154761b = floatWindowLaunchType;
            MeetingFloatWindow meetingFloatWindow = new MeetingFloatWindow(this, this.f154772m);
            this.f154767h = meetingFloatWindow;
            if (mo213581g() || mo213582h()) {
                z = true;
            } else {
                z = false;
            }
            meetingFloatWindow.mo213689e(z);
            if (mo213581g()) {
                this.f154767h.mo213692o();
                C63785a.m250436a(createMeetingFloatWindow(floatWindowLaunchType, this.f154767h), this.f154767h);
            }
        }
        VideoChatFloatWindow videoChatFloatWindow = this.f154766g;
        if (videoChatFloatWindow != null) {
            videoChatFloatWindow.mo213726B();
            this.f154766g = null;
            this.f154764e = false;
        }
        LocalShareFloatWindow iVar = this.f154768i;
        if (iVar != null) {
            iVar.release();
            this.f154768i = null;
            this.f154765f = false;
        }
        mo213576a(j);
        C61237h.m238223a().mo210524b(0);
        bk.m250182a(videoChat, this.f154772m);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j
    public void onTransform(int i, int i2, int i3) {
        MeetingFloatWindow meetingFloatWindow;
        C60700b.m235851b("BaseFloatingWindow", "[onTransform]", i + " " + i2 + " " + i3);
        if (i2 == 5) {
            if (mo213668m().mo212058g() == VideoChat.Type.CALL) {
                if (mo212181b() == null || mo212181b().mo212056e() == null || mo212181b().mo212056e().getEndReason() == null) {
                    C60738ac.m236025a((int) R.string.View_G_CallEnded, 1000);
                } else {
                    int i4 = C616803.f154776a[mo213668m().mo212056e().getEndReason().ordinal()];
                    boolean z = true;
                    if (i4 == 1) {
                        C60738ac.m236023a((int) R.string.View_G_CallDeclined);
                    } else if (i4 == 2) {
                        C60738ac.m236023a((int) R.string.View_G_CallCanceled);
                    } else if (i4 == 3 || i4 == 4) {
                        C60738ac.m236025a((int) R.string.View_G_Disconnected, 3000);
                    } else if (i4 != 5) {
                        Iterator<Participant> it = mo212181b().mo212056e().getParticipants().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Participant next = it.next();
                            if (VideoChatUserService.getCurrentUser() != null && TextUtils.equals(next.getId(), VideoChatUserService.getCurrentUser().getId()) && next.getOfflineReason() == Participant.OfflineReason.END && mo213668m().mo212056e().getEndReason() != VideoChat.EndReason.UNKNOWN_END_REASON) {
                                C60738ac.m236031a(UIHelper.mustacheFormat((int) R.string.View_G_CallEndedNameBraces, "name", mo212181b().mo212088F().getSingleRemoteUser().getName()), 1000L);
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            C60738ac.m236025a((int) R.string.View_G_CallEnded, 1000);
                        }
                    } else {
                        C60738ac.m236025a((int) R.string.View_G_CallEnded, 1000);
                    }
                }
                if (i == 4) {
                    C61676d.m240733a(mo212181b());
                }
            }
            dismiss();
        } else if (i == 6 && i2 == 4 && (meetingFloatWindow = this.f154767h) != null) {
            meetingFloatWindow.mo213695p();
        }
    }
}
