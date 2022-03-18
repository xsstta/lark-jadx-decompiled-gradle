package com.ss.android.vc.meeting.module.multi.presenter;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.irtc.VcByteStream;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamSpec;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.VCStream;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;

/* renamed from: com.ss.android.vc.meeting.module.multi.presenter.c */
public class C62526c {

    /* renamed from: a */
    private Participant f157346a;

    /* renamed from: b */
    protected C61303k f157347b;

    /* renamed from: c */
    private MeetingPageModel f157348c;

    /* renamed from: d */
    private int f157349d;

    /* renamed from: e */
    private boolean f157350e;

    /* renamed from: e */
    public MeetingPageModel mo216200e() {
        return this.f157348c;
    }

    /* renamed from: k */
    public boolean mo216206k() {
        return this.f157350e;
    }

    /* renamed from: m */
    public Participant mo216208m() {
        return this.f157346a;
    }

    /* renamed from: f */
    public String mo216201f() {
        return ParticipantUtil.m248706a(this.f157346a);
    }

    /* renamed from: g */
    public String mo216202g() {
        return this.f157346a.getDeviceId();
    }

    /* renamed from: l */
    public boolean mo216207l() {
        return ParticipantUtil.m248732c(this.f157346a);
    }

    /* renamed from: j */
    public boolean mo216205j() {
        Participant participant = this.f157346a;
        if (participant == null || participant.getStatus() != Participant.Status.ON_THE_CALL) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public boolean mo216203h() {
        Participant participant = this.f157346a;
        if (participant == null || participant.getParticipantSettings() == null) {
            return true;
        }
        return this.f157346a.getParticipantSettings().isCameraMuted();
    }

    /* renamed from: i */
    public boolean mo216204i() {
        Participant participant = this.f157346a;
        if (participant == null || participant.getParticipantSettings() == null) {
            return true;
        }
        return this.f157346a.getParticipantSettings().isMicrophoneMuted();
    }

    /* renamed from: b */
    public void mo214365b() {
        String str;
        StreamSpec.Resolution resolution;
        Participant participant = this.f157346a;
        if (participant == null) {
            C60700b.m235861e("MeetingGridModel", "[refreshStreamSubscribe]", "mParticipant is null");
            return;
        }
        VideoChatUser userInfoInCache = UserInfoService.getUserInfoInCache(participant.getId(), this.f157346a.getParticipantType());
        if (userInfoInCache != null) {
            str = userInfoInCache.getName();
        } else {
            str = "unknown";
        }
        VcByteStream e = this.f157347b.mo212102T().mo212228e(this.f157346a.getRtcJoinId());
        if (e != null) {
            if (!this.f157348c.mo216180d() || mo216203h()) {
                this.f157347b.mo212102T().mo212214a(e, StreamSpec.Scene.GRID_VIEW, StreamSpec.Resolution.UNKNOWN, true);
                return;
            }
            StreamSpec.Resolution resolution2 = StreamSpec.Resolution.UNKNOWN;
            int f = this.f157348c.mo216182f();
            if (f == 1) {
                resolution = StreamSpec.Resolution.FULL_SCREEN;
            } else if (f == 2) {
                resolution = StreamSpec.Resolution.HALF_SCREEN;
            } else if (f != 3) {
                resolution = StreamSpec.Resolution.QUATER_SCREEN;
            } else if (this.f157349d == 0) {
                resolution = StreamSpec.Resolution.HALF_SCREEN;
            } else {
                resolution = StreamSpec.Resolution.QUATER_SCREEN;
            }
            if (this.f157347b.mo212102T().mo212214a(e, StreamSpec.Scene.GRID_VIEW, resolution, false)) {
                C60700b.m235843a("MeetingGridModel", "[refreshStreamSubscribe2]", "[Unmute]User is " + str + ", stream id is " + e.f152907a);
            }
        }
    }

    public String toString() {
        VCStream cVar;
        String str;
        String str2;
        VideoChatUser userInfoInCache = UserInfoService.getUserInfoInCache(this.f157346a.getId(), this.f157346a.getParticipantType());
        VcByteStream e = this.f157347b.mo212102T().mo212228e(this.f157346a.getRtcJoinId());
        if (e != null) {
            cVar = this.f157347b.mo212102T().mo212231g(e.f152907a);
        } else {
            cVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MeetingGridModel {Name=");
        String str3 = "unknown";
        if (userInfoInCache == null) {
            str = str3;
        } else {
            str = userInfoInCache.getName();
        }
        sb.append(str);
        sb.append(", mParticipant=");
        sb.append(ParticipantUtil.m248727b(this.f157346a));
        sb.append(", mPagePos=");
        sb.append(this.f157349d);
        sb.append(", mIsActiveSpeaker=");
        sb.append(this.f157350e);
        sb.append(", subVideo=");
        if (cVar == null) {
            str2 = str3;
        } else {
            str2 = String.valueOf(cVar.mo212241b());
        }
        sb.append(str2);
        sb.append(", subAudio=");
        if (cVar != null) {
            str3 = String.valueOf(cVar.mo212242c());
        }
        sb.append(str3);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private void m244540a(C61303k kVar) {
        this.f157347b = kVar;
    }

    /* renamed from: b */
    public void mo216199b(boolean z) {
        this.f157350e = z;
    }

    /* renamed from: a */
    public void mo216198a(Participant participant) {
        this.f157346a = participant;
    }

    /* renamed from: a */
    public static C62526c m244539a(C61303k kVar, MeetingPageModel meetingPageModel, int i, Participant participant) {
        return new C62526c(kVar, meetingPageModel, i, participant);
    }

    protected C62526c(C61303k kVar, MeetingPageModel meetingPageModel, int i, Participant participant) {
        this.f157348c = meetingPageModel;
        this.f157349d = i;
        this.f157346a = participant;
        m244540a(kVar);
    }
}
