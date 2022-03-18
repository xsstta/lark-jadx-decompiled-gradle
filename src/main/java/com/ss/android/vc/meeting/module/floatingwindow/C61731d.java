package com.ss.android.vc.meeting.module.floatingwindow;

import android.app.Activity;
import android.content.Context;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.lifecycle.C60790a;
import com.ss.android.vc.common.lifecycle.C60793b;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.base.MeetingShadowActivity;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.p3130k.p3131a.C62003a;
import com.ss.android.vc.meeting.module.preview.MeetingDeviceSwitchStateUtil;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.service.impl.VideoChatService;

/* renamed from: com.ss.android.vc.meeting.module.floatingwindow.d */
public class C61731d extends AbstractC61728a {

    /* renamed from: a */
    private GeneralFloatingWindow f154907a;

    /* renamed from: b */
    private AbstractC61735h f154908b;

    /* renamed from: c */
    private boolean f154909c;

    /* renamed from: e */
    private void m240979e() {
        C60790a.m236265a().mo208390a(this);
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a
    /* renamed from: a */
    public void mo213804a() {
        GeneralFloatingWindow generalFloatingWindow = this.f154907a;
        if (generalFloatingWindow != null) {
            generalFloatingWindow.dismiss();
            this.f154907a = null;
        }
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a
    /* renamed from: b */
    public void mo213809b() {
        GeneralFloatingWindow generalFloatingWindow = this.f154907a;
        if (generalFloatingWindow != null) {
            generalFloatingWindow.mo213661j();
            this.f154907a = null;
        }
    }

    /* renamed from: c */
    public ParticipantSettings.EquipmentStatus mo213818c() {
        if (!C60788y.m236247a(ar.m236694a())) {
            return ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        return ParticipantSettings.EquipmentStatus.NORMAL;
    }

    /* renamed from: d */
    public ParticipantSettings.EquipmentStatus mo213819d() {
        if (!C60788y.m236250b(ar.m236694a())) {
            return ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        return ParticipantSettings.EquipmentStatus.NORMAL;
    }

    /* renamed from: f */
    private void m240980f() {
        C60700b.m235851b("FloatWindowControl", "[meetUpdateLocalUser]", "meetUpdateLocalUser");
        Participant j = getMeeting().mo212091I().mo212494b().mo212605j();
        if (j != null) {
            ParticipantSettings participantSettings = j.getParticipantSettings();
            if (participantSettings == null) {
                C60700b.m235851b("FloatWindowControl", "[updateLocalUser]", "local settings is null.");
                return;
            }
            boolean isMicrophoneMuted = participantSettings.isMicrophoneMuted();
            boolean isCameraMuted = participantSettings.isCameraMuted();
            if (isMicrophoneMuted != getMeeting().mo212092J().mo212505B()) {
                C60700b.m235851b("FloatWindowControl", "[meetUpdateLocalUser]", "set audio muted, serverMicrophoneMuted = " + isMicrophoneMuted);
                getMeeting().mo212092J().mo212542f(isMicrophoneMuted);
                getMeeting().mo212165y().mo212016c(isMicrophoneMuted);
            }
            if (isCameraMuted && !getMeeting().mo212092J().mo212504A()) {
                C60700b.m235851b("FloatWindowControl", "[meetUpdateLocalUser2]", isCameraMuted + " " + getMeeting().mo212092J().mo212504A());
                getMeeting().mo212092J().mo212539e(isCameraMuted);
                getMeeting().mo212165y().mo212018d(isCameraMuted);
            } else if (!isCameraMuted && getMeeting().mo212092J().mo212504A()) {
                participantSettings.setCameraMuted(true);
                VcBizService.changeOwnSetting(getMeeting().mo212055d(), participantSettings, mo213818c(), mo213819d(), C60788y.m236247a(ar.m236694a()), C60788y.m236250b(ar.m236694a()));
            }
        }
    }

    public C61731d(C61303k kVar) {
        super(kVar);
        m240979e();
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a, com.ss.android.vc.meeting.framework.meeting.AbstractC61300h
    /* renamed from: a */
    public synchronized void mo212080a(VideoChat.Type type) {
        AbstractC61735h hVar = this.f154908b;
        if (hVar != null) {
            hVar.mo212080a(type);
        }
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a
    /* renamed from: b */
    public void mo213810b(AbstractC61735h hVar) {
        C60700b.m235851b("FloatWindowControl", "[removeListener]", "removeListener");
        if (this.f154908b == hVar) {
            this.f154908b = null;
        }
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a, com.ss.android.vc.meeting.framework.meeting.AbstractC61298f
    public synchronized void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        GeneralFloatingWindow generalFloatingWindow = this.f154907a;
        if (generalFloatingWindow != null && generalFloatingWindow.mo213675q() && getMeeting().mo212058g() == VideoChat.Type.MEET) {
            m240980f();
        }
        AbstractC61735h hVar = this.f154908b;
        if (hVar != null) {
            hVar.onInMeetingInfoUpdate(videoChatInMeetingInfo);
        }
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a
    /* renamed from: a */
    public void mo213806a(Activity activity) {
        if (!this.f154909c) {
            C60700b.m235851b("FloatWindowControl", "[preRequestFloatPermission]", "preRequestFloatPermission");
            if (MeetingDeviceSwitchStateUtil.m245169d() < 3 && !C28460b.m104296a(activity) && C60773o.m236120a(activity)) {
                KeyboardUtils.hideKeyboard(activity);
                MeetingDeviceSwitchStateUtil.m245164a((Integer) 1);
                VCDialogUtils.m236160a((Context) activity, (int) R.string.View_N_FloatingWindowPermission, 1, UIHelper.mustacheFormat((int) R.string.View_G_EnablePopUpsToReceiveCallNotifications, "appName", VideoChatModuleDependency.getLarkAppDependency().mo196409b()), (int) R.string.View_G_CancelButton, (int) R.string.View_G_ConfirmButton, false, UDUiModeUtils.m93320a(activity.getResources().getConfiguration()));
                this.f154909c = true;
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a
    /* renamed from: a */
    public void mo213807a(AbstractC61735h hVar) {
        C60700b.m235851b("FloatWindowControl", "[addListener]", "addListener");
        this.f154908b = hVar;
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a, com.ss.android.vc.dependency.AbstractC60908v.AbstractC60910b
    public void onAppLifecycleChanged(C60793b bVar, C60793b bVar2) {
        AbstractC61735h hVar;
        if (bVar2.f152000b && (hVar = this.f154908b) != null) {
            hVar.mo213671p();
        }
        C62003a.m242249a();
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a
    /* renamed from: a */
    public void mo213805a(long j, FloatWindowLaunchType floatWindowLaunchType) {
        C60700b.m235851b("FloatWindowControl", "[showFloatWindow]", "");
        if (VideoChatService.m249602d().isLiveInFloat()) {
            C60700b.m235851b("FloatWindowControl", "[showFloatWindow]", "interruptFloatLive");
            VideoChatService.m249602d().interruptFloatLive();
        }
        if (this.f154907a == null) {
            this.f154907a = new GeneralFloatingWindow(this.mMeeting, true);
        }
        getMeeting().ab().mo213873c();
        this.f154907a.mo213660a(j, floatWindowLaunchType);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61297e, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public synchronized void onDisplayModeChange(DisplayMode displayMode, DisplayMode displayMode2) {
        C60700b.m235851b("FloatWindowControl", "[onDisplayModeChange]", "src " + displayMode + " dst " + displayMode2);
        AbstractC61735h hVar = this.f154908b;
        if (hVar != null) {
            hVar.onDisplayModeChange(displayMode, displayMode2);
        }
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a
    /* renamed from: a */
    public boolean mo213808a(Activity activity, long j) {
        ByteRTCMeetingActivity byteRTCMeetingActivity;
        KeyboardUtils.hideKeyboard(activity);
        if (C28460b.m104296a(activity)) {
            if (this.mMeeting != null && !this.mMeeting.aE().mo208293c()) {
                mo213805a(j, FloatWindowLaunchType.NORMAL);
            }
            if (this.mMeeting == null || !this.mMeeting.aE().mo208293c()) {
                activity.finish();
                return true;
            }
            Context a = ar.m236694a();
            if (activity instanceof ByteRTCMeetingActivity) {
                byteRTCMeetingActivity = (ByteRTCMeetingActivity) activity;
            } else {
                byteRTCMeetingActivity = null;
            }
            MeetingShadowActivity.m239604a(a, false, byteRTCMeetingActivity);
            return true;
        }
        if (C60773o.m236120a(activity)) {
            VCDialogUtils.m236160a((Context) activity, (int) R.string.View_N_FloatingWindowPermission, 1, UIHelper.mustacheFormat((int) R.string.View_G_PopupPermission, "appName", VideoChatModuleDependency.getLarkAppDependency().mo196409b()), (int) R.string.View_G_CancelButton, (int) R.string.View_G_ConfirmButton, false, UDUiModeUtils.m93320a(activity.getResources().getConfiguration()));
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onTransform(int i, int i2, int i3) {
        AbstractC61735h hVar = this.f154908b;
        if (hVar != null) {
            hVar.onTransform(i, i2, i3);
        }
        if (i2 == 5) {
            C60790a.m236265a().mo208391b(this);
            this.f154907a = null;
            this.f154908b = null;
        }
    }
}
