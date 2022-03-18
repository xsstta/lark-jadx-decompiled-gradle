package com.ss.android.vc.meeting.module.single;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.MeetingDefaultEventListener;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.foregroundservice.ForegroundService;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserRole;
import com.ss.android.vc.net.service.VideoChatUserService;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/vc/meeting/module/single/SingleMeetingBaseEventListener;", "Lcom/ss/android/vc/meeting/framework/statemachine/MeetingDefaultEventListener;", "()V", "TAG", "", "endCalling", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "endOnTheCall", "endRinging", "enterOnTheCallState", "initAudioVideoMute", "initRtcSettings", "initUser", "muteAudio", "isMuted", "", "muteVideo", "updateAudioVideoSettings", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.single.c */
public class SingleMeetingBaseEventListener extends MeetingDefaultEventListener {

    /* renamed from: a */
    private final String f158931a = "SingleMeetingBaseEventListener";

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingDefaultEventListener
    /* renamed from: b */
    public void mo212314b(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        m247000n(kVar);
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingDefaultEventListener, com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: d */
    public void mo212316d(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        super.mo212316d(kVar);
    }

    /* renamed from: n */
    private final void m247000n(C61303k kVar) {
        C60700b.m235851b(this.f158931a, "[initRtcSettings]", "init");
        if (kVar.mo212166z()) {
            kVar.mo212092J().mo212539e(true);
        }
        m247001o(kVar);
    }

    /* renamed from: o */
    private final void m247001o(C61303k kVar) {
        mo217891b(kVar, kVar.mo212092J().mo212504A());
        mo217890a(kVar, kVar.mo212092J().mo212505B());
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: f */
    public void mo212319f(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        C60700b.m235841a(kVar.mo212056e(), "StateEngine", "UI", "dismissCallingFragmentOrWindow", this.f158931a, "[endCalling] listener = default");
        kVar.mo212165y().mo212007b();
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: i */
    public void mo212322i(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        C60700b.m235841a(kVar.mo212056e(), "StateEngine", "UI", "dismissRingingFragmentOrWindow", this.f158931a, "[endRinging] listener = default");
        kVar.mo212165y().mo212007b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "user", "Lcom/ss/android/vc/net/service/VideoChatUser;", "kotlin.jvm.PlatformType", "onGetUserInfo"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.c$a */
    public static final class C63058a implements GetUserInfoListener {

        /* renamed from: a */
        final /* synthetic */ C61303k f158932a;

        C63058a(C61303k kVar) {
            this.f158932a = kVar;
        }

        @Override // com.ss.android.vc.net.service.GetUserInfoListener
        public final void onGetUserInfo(VideoChatUser videoChatUser) {
            VideoChatUserService F = this.f158932a.mo212088F();
            Intrinsics.checkExpressionValueIsNotNull(F, "meeting.videoChatUserService");
            if (F.getCurrentUserRole() == VideoChatUserRole.SINGLE_CALLER) {
                VideoChatUserService F2 = this.f158932a.mo212088F();
                Intrinsics.checkExpressionValueIsNotNull(F2, "meeting.videoChatUserService");
                F2.setSingleCalleeUser(videoChatUser);
            } else {
                VideoChatUserService F3 = this.f158932a.mo212088F();
                Intrinsics.checkExpressionValueIsNotNull(F3, "meeting.videoChatUserService");
                F3.setSingleCallerUser(videoChatUser);
            }
            ForegroundService.m241663a();
        }
    }

    /* renamed from: m */
    private final void m246999m(C61303k kVar) {
        String str;
        VideoChat e = kVar.mo212056e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
        List<Participant> participants = e.getParticipants();
        VideoChatUser currentUser = VideoChatUserService.getCurrentUser();
        Intrinsics.checkExpressionValueIsNotNull(currentUser, "VideoChatUserService.getCurrentUser()");
        String id = currentUser.getId();
        Iterator<Participant> it = participants.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "";
                break;
            }
            Participant next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "participant");
            if (!Intrinsics.areEqual(next.getId(), id)) {
                str = next.getId();
                Intrinsics.checkExpressionValueIsNotNull(str, "participant.id");
                break;
            }
        }
        MeetingSpecificData J = kVar.mo212092J();
        Intrinsics.checkExpressionValueIsNotNull(id, "localId");
        J.mo212523a(id, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        if (r5 == com.ss.android.vc.entity.ParticipantType.RESERVED_USER_5) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0092, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r17.mo212092J().mo212546h(), "0") != false) goto L_0x0094;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingDefaultEventListener, com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo212313a(com.ss.android.vc.meeting.framework.meeting.C61303k r17) {
        /*
        // Method dump skipped, instructions count: 475
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.single.SingleMeetingBaseEventListener.mo212313a(com.ss.android.vc.meeting.framework.meeting.k):void");
    }

    /* renamed from: b */
    public final void mo217891b(C61303k kVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        String str = this.f158931a;
        C60700b.m235851b(str, "[muteVideo]", "muteVideo " + z);
        kVar.mo212165y().mo212018d(z);
        kVar.mo212165y().mo212020e(z ^ true);
        VcBizService.muteCamera(kVar.mo212055d(), z, false, C60788y.m236247a(ar.m236694a()));
    }

    /* renamed from: a */
    public final void mo217890a(C61303k kVar, boolean z) {
        String str;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        String str2 = this.f158931a;
        C60700b.m235851b(str2, "[muteAudio]", "muteAudio " + z);
        kVar.mo212165y().mo212016c(z);
        boolean b = C60788y.m236250b(ar.m236694a());
        AbsBreakoutRoomControl al = kVar.al();
        Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
        if (al.mo213182i()) {
            AbsBreakoutRoomControl al2 = kVar.al();
            Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
            if (al2.mo213184k() != null) {
                AbsBreakoutRoomControl al3 = kVar.al();
                Intrinsics.checkExpressionValueIsNotNull(al3, "meeting.breakoutRoomControl");
                VCBreakoutRoomInfo k = al3.mo213184k();
                Intrinsics.checkExpressionValueIsNotNull(k, "meeting.breakoutRoomControl.breakoutRoomInfo");
                str = k.getBreakoutRoomId();
                Intrinsics.checkExpressionValueIsNotNull(str, "meeting.breakoutRoomCont…utRoomInfo.breakoutRoomId");
                VcBizService.muteAudio(kVar.mo212055d(), str, z, false, b);
            }
        }
        str = "";
        VcBizService.muteAudio(kVar.mo212055d(), str, z, false, b);
    }
}
