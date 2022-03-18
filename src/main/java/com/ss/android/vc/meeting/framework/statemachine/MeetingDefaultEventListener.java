package com.ss.android.vc.meeting.framework.statemachine;

import com.larksuite.framework.thread.C26171w;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.ByteRtc;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.base.util.DataAdapterUtil;
import com.ss.android.vc.meeting.module.busyring.C61543c;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event.C63778z;
import com.ss.android.vc.statistics.p3180a.C63693e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/ss/android/vc/meeting/framework/statemachine/MeetingDefaultEventListener;", "Lcom/ss/android/vc/meeting/framework/statemachine/MeetingEventListener;", "()V", "TAG1", "", "getTAG1", "()Ljava/lang/String;", "endOnTheCall", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "enterOnTheCallState", "initAudioVideoMute", "joinChannelOnTheCall", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.framework.statemachine.g */
public class MeetingDefaultEventListener extends MeetingEventListener {

    /* renamed from: a */
    private final String f153697a = "MeetingDefaultEventListener";

    /* renamed from: b */
    public void mo212314b(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.framework.statemachine.g$a */
    static final class RunnableC61341a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C61303k f153698a;

        RunnableC61341a(C61303k kVar) {
            this.f153698a = kVar;
        }

        public final void run() {
            DataAdapterUtil.f154006a.mo212861g(this.f153698a);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: d */
    public void mo212316d(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        C60700b.m235841a(kVar.mo212056e(), "StateEngine", "UI", "dismissOnTheCallFragment", this.f153697a, "[endOnTheCall] listener = default");
        kVar.mo212165y().mo212017d();
        kVar.mo212165y().mo212021f();
        kVar.mo212165y().mo212007b();
        C61543c.m240215b(kVar);
        kVar.mo212092J().mo212514K();
        kVar.mo212091I().mo212500g();
    }

    /* renamed from: c */
    public void mo212315c(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        C26171w.m94675a(new RunnableC61341a(kVar));
        VideoChat e = kVar.mo212056e();
        C60700b.m235841a(e, "UI", "RtcSDK", "joinChannel meeting_id = " + kVar.mo212092J().mo212537e(), this.f153697a, "[joinChannelOnTheCall] join channel");
        C63693e.m249681a(kVar);
        ByteRtc y = kVar.mo212165y();
        String f = kVar.mo212092J().mo212540f();
        String e2 = kVar.mo212092J().mo212537e();
        VideoChat e3 = kVar.mo212056e();
        Intrinsics.checkExpressionValueIsNotNull(e3, "meeting.videoChat");
        y.mo212002a(f, e2, e3.getZoomUserId(), MeetingUtil.m238372c(kVar.mo212056e()));
        C63778z.m250404a(kVar.mo212056e());
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: a */
    public void mo212313a(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        kVar.mo212165y().mo211989a();
        kVar.mo212091I().mo212491a(kVar.mo212056e());
        MeetingSpecificData J = kVar.mo212092J();
        VideoChat e = kVar.mo212056e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
        J.mo212519a(e);
        VideoChat e2 = kVar.mo212056e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "meeting.videoChat");
        List<Participant> participants = e2.getParticipants();
        if (participants != null) {
            for (Participant participant : participants) {
                if (ParticipantUtil.m248732c(participant)) {
                    MeetingSpecificData J2 = kVar.mo212092J();
                    Intrinsics.checkExpressionValueIsNotNull(participant, "participant");
                    ParticipantSettings participantSettings = participant.getParticipantSettings();
                    Intrinsics.checkExpressionValueIsNotNull(participantSettings, "participant.participantSettings");
                    J2.mo212554l(participantSettings.isPlayMeetingTone());
                }
            }
        }
        C61237h.m238223a().mo210563u();
        VideoChatService d = VideoChatService.m249602d();
        Intrinsics.checkExpressionValueIsNotNull(d, "VideoChatService.inst()");
        if (d.isLiveInFloat()) {
            VideoChatService.m249602d().interruptFloatLive();
        }
    }
}
