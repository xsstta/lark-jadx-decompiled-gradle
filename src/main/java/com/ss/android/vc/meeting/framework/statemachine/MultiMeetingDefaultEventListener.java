package com.ss.android.vc.meeting.framework.statemachine;

import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.MeetingConfig;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.busyring.C61543c;
import com.ss.android.vc.meeting.module.feedback.C61677e;
import com.ss.android.vc.meeting.module.foregroundservice.ForegroundService;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.multi.MeetingNetDisconnectActivity;
import com.ss.android.vc.meeting.module.sharebox.AbstractC63022a;
import com.ss.android.vc.meeting.utils.C63492g;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserService;
import com.ss.android.vc.statistics.event.LocalShareEvent;
import com.ss.android.vc.statistics.event.MeetingChargingEvent;
import com.ss.android.vc.trace.C63784a;
import com.ss.android.vc.trace.VCLauncherStatistics;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/ss/android/vc/meeting/framework/statemachine/MultiMeetingDefaultEventListener;", "Lcom/ss/android/vc/meeting/framework/statemachine/MeetingDefaultEventListener;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "endOnTheCall", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "endRinging", "endWaiting", "enterOnTheCallState", "enterRingingState", "enterWaitingState", "exitRingingState", "exitWaitingState", "initAudioVideoMute", "showExitToast", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.framework.statemachine.m */
public class MultiMeetingDefaultEventListener extends MeetingDefaultEventListener {

    /* renamed from: a */
    public static final Companion f153710a = new Companion(null);

    /* renamed from: b */
    private final String f153711b = "MultiMeetingDefaultEventListener";

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: k */
    public void mo212324k(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/framework/statemachine/MultiMeetingDefaultEventListener$Companion;", "", "()V", "SP_KEY_IS_REJOIN", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.framework.statemachine.m$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.framework.statemachine.m$b */
    static final class RunnableC61347b implements Runnable {

        /* renamed from: a */
        public static final RunnableC61347b f153712a = new RunnableC61347b();

        RunnableC61347b() {
        }

        public final void run() {
            ForegroundService.m241663a();
        }
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingDefaultEventListener, com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: d */
    public void mo212316d(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        mo212342m(kVar);
        super.mo212316d(kVar);
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: j */
    public void mo212323j(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        ByteRTCMeetingActivity.f157054h.mo215874d(kVar, false);
        ForegroundService.m241663a();
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: i */
    public void mo212322i(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        C60700b.m235841a(kVar.mo212056e(), "StateEngine", "UI", "dismissRingingFragment", this.f153711b, "[endRinging] listener = default");
        kVar.mo212165y().mo212007b();
        kVar.mo212092J().mo212514K();
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: l */
    public void mo212325l(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        super.mo212325l(kVar);
        kVar.mo212165y().mo212017d();
        kVar.mo212165y().mo212007b();
        C61543c.m240215b(kVar);
        kVar.mo212092J().mo212514K();
        kVar.mo212091I().mo212500g();
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: h */
    public void mo212321h(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        String str = this.f153711b;
        C60700b.m235851b(str, "[exitRingingState4]", "meetingIdHash=" + (kVar.mo212055d() + ',' + kVar.hashCode()) + ", real play stop");
        C61367r.m239117a(ar.m236694a()).mo212393a();
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingDefaultEventListener, com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: a */
    public void mo212313a(C61303k kVar) {
        List<Participant> participants;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        C63784a.m250428a("[VideoChat_MultiMeetingDefaultEventListener_enterOnTheCallState]");
        C63784a.m250430c("[VideoChat_MultiMeetingDefaultEventListener_enterOnTheCallState]");
        super.mo212313a(kVar);
        VideoChat e = kVar.mo212056e();
        mo212314b(kVar);
        mo212315c(kVar);
        if (!(kVar.mo212067p() == DisplayMode.WINDOW || kVar.mo212067p() == DisplayMode.FAST_ENTRY)) {
            Intrinsics.checkExpressionValueIsNotNull(e, "videoChat");
            String hostId = e.getHostId();
            VideoChatUser currentUser = VideoChatUserService.getCurrentUser();
            Intrinsics.checkExpressionValueIsNotNull(currentUser, "VideoChatUserService.getCurrentUser()");
            if (!Intrinsics.areEqual(hostId, currentUser.getId()) || (participants = e.getParticipants()) == null || participants.size() != 1) {
                ByteRTCMeetingActivity.f157054h.mo215869a(kVar, false, false);
            } else {
                ByteRTCMeetingActivity.f157054h.mo215869a(kVar, false, true);
            }
        }
        if (C61677e.m240742c()) {
            VcBizService.initForFeedback();
        }
        C26171w.m94676a(RunnableC61347b.f153712a, 2000);
        VCLauncherStatistics.m250421a();
        VCLauncherStatistics.m250424b();
        C63784a.m250431d("[VideoChat_Launch_1]");
        C63784a.m250430c("[VideoChat_Launch_2]");
        C63784a.m250431d("[VideoChat_MultiMeetingDefaultEventListener_enterOnTheCallState]");
        C63784a.m250429b("[VideoChat_MultiMeetingDefaultEventListener_enterOnTheCallState]");
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: g */
    public void mo212320g(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        C60700b.m235841a(kVar.mo212056e(), "StateEngine", "UI", "showRingingFragment, foreground = " + VCAppLifeCycle.m236255b(), this.f153711b, "[enterRingingState] listener = default");
        ByteRTCMeetingActivity.f157054h.mo215873c(kVar, false);
        String str = kVar.mo212055d() + ',' + kVar.hashCode();
        C60700b.m235851b(this.f153711b, "[enterRingingState]", "meetingIdHash=" + str);
        if (kVar.mo212060i()) {
            C60700b.m235851b(this.f153711b, "[enterRingingState2]", "meeting.isIdleByTransition");
            return;
        }
        ForegroundService.m241663a();
        C60700b.m235851b(this.f153711b, "[enterRingingState3]", "meetingIdHash=" + str + ", real play start");
        C61367r.m239117a(ar.m236694a()).mo212395b();
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingDefaultEventListener
    /* renamed from: b */
    public void mo212314b(C61303k kVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        VideoChat e = kVar.mo212056e();
        Intrinsics.checkExpressionValueIsNotNull(e, "videoChat");
        boolean z8 = false;
        if (!ParticipantUtil.m248722a(e.getHostId(), e.getHostType(), e.getHostDeviceId())) {
            MeetingConfig meetingConfig = e.getMeetingConfig();
            if (meetingConfig != null) {
                z5 = !meetingConfig.isAudioOn;
                z4 = !meetingConfig.isCameraOn;
            } else {
                z5 = false;
                z4 = true;
            }
            if (meetingConfig == null) {
                if (e.getParticipants() != null) {
                    Iterator<Participant> it = e.getParticipants().iterator();
                    z6 = false;
                    loop0:
                    while (true) {
                        z4 = true;
                        while (true) {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            Participant next = it.next();
                            if (ParticipantUtil.m248732c(next)) {
                                Intrinsics.checkExpressionValueIsNotNull(next, "p");
                                ParticipantSettings participantSettings = next.getParticipantSettings();
                                if (participantSettings != null) {
                                    z6 = participantSettings.isMicrophoneMuted();
                                } else {
                                    z6 = false;
                                }
                                ParticipantSettings participantSettings2 = next.getParticipantSettings();
                                if (participantSettings2 != null) {
                                    z4 = participantSettings2.isCameraMuted();
                                }
                            }
                        }
                    }
                } else {
                    z6 = false;
                    z4 = true;
                }
                VideoChatSettings videoChatSettings = e.getVideoChatSettings();
                if (videoChatSettings != null) {
                    z7 = videoChatSettings.isMicrophoneMuted();
                } else {
                    z7 = false;
                }
                if (z7 || z6) {
                    z8 = true;
                }
                Unit unit = Unit.INSTANCE;
                z5 = z8;
            }
            kVar.mo212092J().mo212539e(z4);
            kVar.mo212092J().mo212542f(z5);
            String str = this.f153711b;
            StringBuilder sb = new StringBuilder();
            sb.append("not host, uid = ");
            VideoChatUser currentUser = VideoChatUserService.getCurrentUser();
            Intrinsics.checkExpressionValueIsNotNull(currentUser, "VideoChatUserService.getCurrentUser()");
            sb.append(currentUser.getId());
            sb.append(", audioMute = ");
            sb.append(z5);
            sb.append(", videoMuted = ");
            sb.append(z4);
            C60700b.m235851b(str, "[enterOnTheCallState]", sb.toString());
        } else if (C57744a.m224104a().getBoolean("is_rejoin", false)) {
            C57744a.m224104a().remove("is_rejoin");
            if (e.getParticipants() != null) {
                Iterator<Participant> it2 = e.getParticipants().iterator();
                z2 = false;
                loop2:
                while (true) {
                    z = true;
                    while (true) {
                        if (!it2.hasNext()) {
                            break loop2;
                        }
                        Participant next2 = it2.next();
                        if (ParticipantUtil.m248732c(next2)) {
                            Intrinsics.checkExpressionValueIsNotNull(next2, "p");
                            ParticipantSettings participantSettings3 = next2.getParticipantSettings();
                            if (participantSettings3 != null) {
                                z2 = participantSettings3.isMicrophoneMuted();
                            } else {
                                z2 = false;
                            }
                            ParticipantSettings participantSettings4 = next2.getParticipantSettings();
                            if (participantSettings4 != null) {
                                z = participantSettings4.isCameraMuted();
                            }
                        }
                    }
                }
            } else {
                z2 = false;
                z = true;
            }
            VideoChatSettings videoChatSettings2 = e.getVideoChatSettings();
            if (videoChatSettings2 != null) {
                z3 = videoChatSettings2.isMicrophoneMuted();
            } else {
                z3 = false;
            }
            if (z3 || z2) {
                z8 = true;
            }
            kVar.mo212092J().mo212539e(z);
            kVar.mo212092J().mo212542f(z8);
        }
        boolean A = kVar.mo212092J().mo212504A();
        boolean B = kVar.mo212092J().mo212505B();
        C60700b.m235851b(this.f153711b, "[initAudioVideoMute]", "muteStream cameraMute: " + A + ", audioMute: " + B);
        kVar.mo212165y().mo212018d(A);
        kVar.mo212165y().mo212016c(B);
        kVar.mo212165y().mo212020e(A ^ true);
    }

    /* renamed from: m */
    public final void mo212342m(C61303k kVar) {
        VideoChat videoChat;
        VideoChatSettings.SubType subType;
        VideoChatSettings videoChatSettings;
        if (kVar != null) {
            videoChat = kVar.mo212056e();
        } else {
            videoChat = null;
        }
        if (!C60752f.m236080a(videoChat) && !C60752f.m236080a(videoChat.getParticipants())) {
            String str = this.f153711b;
            C60700b.m235851b(str, "[showExitToast]", "videoChat.id = " + videoChat.getId());
            Participant c = ParticipantUtil.m248731c(videoChat.getParticipants());
            if (c == null) {
                return;
            }
            if (videoChat.getEndReason() == VideoChat.EndReason.SDK_EXCEPTION) {
                if (!(VCAppLifeCycle.m236256c() instanceof MeetingNetDisconnectActivity)) {
                    C60738ac.m236025a((int) R.string.View_G_Disconnected, 3000);
                }
            } else if (videoChat.getEndReason() == VideoChat.EndReason.CONNECTION_FAILED) {
                C60738ac.m236025a((int) R.string.View_G_Disconnected, 3000);
            } else {
                if (c == null) {
                    Intrinsics.throwNpe();
                }
                if (c.getStatus() == Participant.Status.IDLE) {
                    if (c.getOfflineReason() == Participant.OfflineReason.KICK_OUT) {
                        C63492g.m248824b(false, Boolean.valueOf(kVar.mo212092J().mo212512I()));
                        C60738ac.m236025a((int) R.string.View_M_HostRemovedYou, 3000);
                    } else if (c.getOfflineReason() == Participant.OfflineReason.END) {
                        AbstractC63022a ak = kVar.ak();
                        Intrinsics.checkExpressionValueIsNotNull(ak, "meeting.shareBoxControl");
                        if (ak.mo217756b()) {
                            C60738ac.m236025a((int) R.string.View_G_SharingToRoomStopped, 1000);
                            VideoChat e = kVar.mo212056e();
                            Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
                            LocalShareEvent.m249994a("force_leave", e, kVar.mo212093K());
                        } else if (kVar.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && kVar.mo212089G() == ParticipantRole.INTERVIEWEE) {
                            C60738ac.m236025a((int) R.string.View_M_YouLeftMeeting, 1000);
                        } else {
                            C60738ac.m236025a((int) R.string.View_M_HostEndedMeeting, 1000);
                        }
                    } else if (c.getOfflineReason() == Participant.OfflineReason.OVERTIME) {
                        C60700b.m235851b(this.f153711b, "[showExitToast]", "OVERTIME");
                        MeetingChargingEvent.m249931a(MeetingChargingEvent.DurationPopType.Ending);
                        C63492g.m248824b(false, Boolean.valueOf(kVar.mo212092J().mo212512I()));
                        C60738ac.m236024a(R.drawable.icon_toast_info, R.string.View_G_MeetingEndedDueToTimeLimit, 3000);
                    } else if (c.getOfflineReason() == Participant.OfflineReason.LEAVE) {
                        VideoChat e2 = kVar.mo212056e();
                        if (e2 == null || (videoChatSettings = e2.getVideoChatSettings()) == null) {
                            subType = null;
                        } else {
                            subType = videoChatSettings.getSubType();
                        }
                        if (subType == VideoChatSettings.SubType.SCREEN_SHARE) {
                            C60738ac.m236025a((int) R.string.View_MV_AlreadyStoppedSharing, 1000);
                            VideoChat e3 = kVar.mo212056e();
                            Intrinsics.checkExpressionValueIsNotNull(e3, "meeting.videoChat");
                            LocalShareEvent.m249994a("force_leave", e3, kVar.mo212093K());
                        }
                    }
                } else if (videoChat.getEndReason() == VideoChat.EndReason.HANGUP) {
                    C61383d I = kVar.mo212091I();
                    Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
                    C61381c a = I.mo212490a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "meeting.meetingData.inMeetingInfoData");
                    if (a.mo212476h()) {
                        C61383d I2 = kVar.mo212091I();
                        Intrinsics.checkExpressionValueIsNotNull(I2, "meeting.meetingData");
                        C61388g b = I2.mo212494b();
                        Intrinsics.checkExpressionValueIsNotNull(b, "meeting.meetingData.participantData");
                        if (b.mo212599d() > 1) {
                            C60738ac.m236025a((int) R.string.View_M_YouLeftMeeting, 1000);
                        } else if (kVar.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && kVar.mo212089G() == ParticipantRole.INTERVIEWEE) {
                            C60738ac.m236025a((int) R.string.View_M_YouLeftMeeting, 1000);
                        } else {
                            C60738ac.m236025a((int) R.string.View_M_YouEndedMeeting, 1000);
                        }
                    } else {
                        AbstractC63022a ak2 = kVar.ak();
                        Intrinsics.checkExpressionValueIsNotNull(ak2, "meeting.shareBoxControl");
                        if (ak2.mo217756b()) {
                            C60738ac.m236025a((int) R.string.View_G_SharingToRoomStopped, 1000);
                        } else {
                            C60738ac.m236025a((int) R.string.View_M_YouLeftMeeting, 1000);
                        }
                    }
                } else if (videoChat.getEndReason() == VideoChat.EndReason.TRIAL_TIMEOUT) {
                    C60700b.m235851b(this.f153711b, "[showExitToast]", "TRIAL_TIMEOUT");
                    MeetingChargingEvent.m249931a(MeetingChargingEvent.DurationPopType.Ending);
                    C63492g.m248824b(false, Boolean.valueOf(kVar.mo212092J().mo212512I()));
                    C60738ac.m236024a(R.drawable.icon_toast_info, R.string.View_G_MeetingEndedDueToTimeLimit, 3000);
                }
            }
        }
    }
}
