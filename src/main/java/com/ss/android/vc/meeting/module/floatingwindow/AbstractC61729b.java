package com.ss.android.vc.meeting.module.floatingwindow;

import android.view.ViewGroup;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.irtc.RtcAudioVolumeInfo;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61293a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent;
import com.ss.android.vc.meeting.module.p3129j.AbstractC61994a;
import com.ss.android.vc.meeting.module.p3155q.AbstractC62782a;

/* renamed from: com.ss.android.vc.meeting.module.floatingwindow.b */
public abstract class AbstractC61729b extends AbstractC61293a implements MeetingAudioManager.AbstractC61403a, AbstractC61733f, AbstractC61734g, AbstractC61994a.AbstractC61995a, AbstractC62782a.AbstractC62783a {

    /* renamed from: a */
    protected IFloatWindowPresent f154904a;

    /* renamed from: b */
    protected IFloatWindowPresent.FloatWindowType f154905b;

    /* renamed from: c */
    protected ViewGroup f154906c;

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61300h
    /* renamed from: a */
    public void mo212080a(VideoChat.Type type) {
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211748a(RtcAudioVolumeInfo rtcAudioVolumeInfo) {
    }

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61994a.AbstractC61995a
    /* renamed from: c */
    public void mo213812c(int i) {
    }

    @Override // com.ss.android.vc.meeting.module.p3155q.AbstractC62782a.AbstractC62783a
    /* renamed from: g */
    public void mo213815g() {
    }

    @Override // com.ss.android.vc.meeting.module.p3155q.AbstractC62782a.AbstractC62783a
    /* renamed from: j */
    public void mo213816j() {
    }

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61994a.AbstractC61995a
    /* renamed from: k */
    public void mo213817k() {
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61734g
    /* renamed from: l */
    public void mo213667l() {
    }

    /* renamed from: m */
    public void mo213690m() {
    }

    /* renamed from: n */
    public void mo213691n() {
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioMuted() {
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateChanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateUnchanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61297e
    public void onDisplayModeChange(DisplayMode displayMode, DisplayMode displayMode2) {
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j
    public void onTransform(int i, int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public IFloatWindowPresent.FloatWindowType mo213814f() {
        return this.f154905b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C61303k mo213813e() {
        return this.f154904a.mo213668m();
    }

    public AbstractC61729b(IFloatWindowPresent iFloatWindowPresent, IFloatWindowPresent.FloatWindowType floatWindowType) {
        this.f154904a = iFloatWindowPresent;
        this.f154905b = floatWindowType;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo213811a(MeetingAudioManager.AudioType audioType, boolean z, MeetingAudioManager.AudioType audioType2, boolean z2) {
        C61303k e = mo213813e();
        if (e != null && e.mo212092J().mo212510G() && audioType2 != MeetingAudioManager.AudioType.Default) {
            C60700b.m235851b("BaseFloatWindow", "[onAudioStateChanged_]", "lastType: " + audioType + ", type: " + audioType2 + "lastOutSpeaker: " + z + ", outSpeaker: " + z2);
            e.mo212092J().mo212552k(false);
            e.mo212165y().mo212022f(false);
        }
    }
}
