package com.ss.android.vc.meeting.module.fastentry;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.floatingwindow.AbsFloatingWindow;
import com.ss.android.vc.meeting.module.floatingwindow.FloatWindowLaunchType;
import com.ss.android.vcxp.C63785a;
import com.ss.android.vcxp.C63801c;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;

public class FastEntryControl extends AbstractC61658a {

    /* renamed from: a */
    private transient AbsFloatingWindow f154669a;

    @XClass
    private static class FastEntryWindowFactory {
        private FastEntryWindowFactory() {
        }

        @XMethod
        public static FastEntryWindow create(FastEntryWindow fastEntryWindow, C61303k kVar) {
            FastEntryWindow fastEntryWindow2 = new FastEntryWindow(kVar);
            C63785a.m250436a(fastEntryWindow, fastEntryWindow2);
            return fastEntryWindow2;
        }
    }

    @Override // com.ss.android.vc.meeting.module.fastentry.AbstractC61658a
    /* renamed from: b */
    public void mo213574b() {
        C60700b.m235851b("FastEntryControl", "[dismiss]", "dismiss");
        AbsFloatingWindow absFloatingWindow = this.f154669a;
        if (absFloatingWindow != null) {
            absFloatingWindow.dismiss();
            this.f154669a = null;
        }
    }

    @Override // com.ss.android.vc.meeting.module.fastentry.AbstractC61658a
    /* renamed from: c */
    public void mo213575c() {
        C60700b.m235851b("FastEntryControl", "[meetingWakeUp]", "meetingWakeUp");
        AbsFloatingWindow absFloatingWindow = this.f154669a;
        if (absFloatingWindow != null) {
            absFloatingWindow.mo213661j();
            this.f154669a = null;
        }
    }

    @Override // com.ss.android.vc.meeting.module.fastentry.AbstractC61658a
    /* renamed from: a */
    public void mo213572a() {
        if (getMeeting().mo212062k()) {
            C60700b.m235851b("FastEntryControl", "[showFastEntry]", "show fail, meeting is idle");
            return;
        }
        if (this.f154669a != null) {
            C60700b.m235864f("FastEntryControl", "[showFastEntry2]", "last fastEntryWindow no release");
        }
        C60700b.m235851b("FastEntryControl", "[showFastEntry3]", "showFastEntry");
        getMeeting().ab().mo213873c();
        this.f154669a = new FastEntryWindow(getMeeting());
        if (C63801c.m250501b()) {
            C63785a.m250436a(FastEntryWindowFactory.create((FastEntryWindow) this.f154669a, getMeeting()), this.f154669a);
        }
        getMeeting().mo212102T().mo212222c();
        this.f154669a.mo213660a(0, FloatWindowLaunchType.NORMAL);
    }

    public FastEntryControl(C61303k kVar) {
        super(kVar);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61300h
    /* renamed from: a */
    public synchronized void mo212080a(VideoChat.Type type) {
        AbsFloatingWindow absFloatingWindow = this.f154669a;
        if (absFloatingWindow != null) {
            absFloatingWindow.mo212080a(type);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f
    public synchronized void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        AbsFloatingWindow absFloatingWindow = this.f154669a;
        if (absFloatingWindow != null) {
            absFloatingWindow.onInMeetingInfoUpdate(videoChatInMeetingInfo);
        }
    }

    @Override // com.ss.android.vc.meeting.module.fastentry.AbstractC61658a
    /* renamed from: a */
    public boolean mo213573a(AbstractC61661d dVar) {
        C60700b.m235851b("FastEntryControl", "[tryShowFloatWindow]", "from " + dVar);
        if (dVar == null) {
            return false;
        }
        if (dVar.bx_()) {
            C60700b.m235851b("FastEntryControl", "[tryShowFloatWindow2]", "true");
            return true;
        }
        C60700b.m235851b("FastEntryControl", "[tryShowFloatWindow3]", "false");
        return false;
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61297e, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public synchronized void onDisplayModeChange(DisplayMode displayMode, DisplayMode displayMode2) {
        AbsFloatingWindow absFloatingWindow = this.f154669a;
        if (absFloatingWindow != null) {
            absFloatingWindow.onDisplayModeChange(displayMode, displayMode2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onTransform(int i, int i2, int i3) {
        AbsFloatingWindow absFloatingWindow = this.f154669a;
        if (absFloatingWindow != null) {
            absFloatingWindow.onTransform(i, i2, i3);
        }
        if (i2 == 5) {
            mo213574b();
        }
    }
}
