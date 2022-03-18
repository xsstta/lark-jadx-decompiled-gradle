package com.ss.android.vc.meeting.module.base.util;

import com.bytedance.lark.pb.basic.v1.Command;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.pb.videoconference.v1.UpdateVideoChatRequest;
import com.ss.android.lark.pb.videoconference.v1.UpdateVideoChatResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.p3092a.C60930c;
import com.ss.android.vc.entity.response.ax;
import com.ss.android.vc.meeting.framework.meeting.ByteRtc;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.base.AbstractC61417a;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62299v;
import com.ss.android.vc.meeting.module.p3148o.AbstractC62555a;
import com.ss.android.vc.meeting.module.p3148o.AbstractC62604b;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.VcBizTask;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.route.request.EquipmentChangedEvent;
import com.ss.android.vc.statistics.p3180a.C63693e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ&\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0015\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ)\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u0016\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u0016\u0010 \u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u0016\u0010!\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/vc/meeting/module/base/util/DataAdapterUtil;", "", "()V", "TAG", "", "changeLocalAudioData", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "muted", "", "needNotifyServer", "requestByHost", "changeLocalVideoData", "isVideoMute", "isLocalAudioMuted", "isLocalFrontCamera", "isLocalVideoMuted", "isShareScreen", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)Ljava/lang/Boolean;", "needShowMoreBtn", "sendMuteACK", "Lcom/ss/android/vc/net/request/VcBizTask;", "Lcom/ss/android/vc/entity/response/UpdateVideoChatEntity;", "meetingId", "globalSeqId", "", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/ss/android/vc/net/request/VcBizTask;", "setupLocalView", "switchCamera", "unableTurnOnCamera", "unableTurnOnMicrophone", "unableTurnOnMyCamera", "unableTurnOnMyMicrophone", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.base.a.a */
public final class DataAdapterUtil {

    /* renamed from: a */
    public static final DataAdapterUtil f154006a = new DataAdapterUtil();

    /* renamed from: b */
    private static final String f154007b = f154007b;

    private DataAdapterUtil() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.base.a.a$a */
    public static final class RunnableC61418a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f154008a;

        /* renamed from: b */
        final /* synthetic */ boolean f154009b;

        /* renamed from: c */
        final /* synthetic */ C61303k f154010c;

        RunnableC61418a(boolean z, boolean z2, C61303k kVar) {
            this.f154008a = z;
            this.f154009b = z2;
            this.f154010c = kVar;
        }

        public final void run() {
            AbstractC61417a W;
            AbstractC62604b G;
            ByteRtc y;
            ByteRtc y2;
            ByteRtc y3;
            ByteRtc y4;
            if (!this.f154008a) {
                C61303k kVar = this.f154010c;
                if (!(kVar == null || (y3 = kVar.mo212165y()) == null)) {
                    y3.mo212014c();
                }
                C61303k kVar2 = this.f154010c;
                if (!(kVar2 == null || (y2 = kVar2.mo212165y()) == null)) {
                    y2.mo212012b(DataAdapterUtil.f154006a.mo212850a(this.f154010c));
                }
                boolean a = DataAdapterUtil.f154006a.mo212850a(this.f154010c);
                C61303k kVar3 = this.f154010c;
                if (kVar3 == null || (y = kVar3.mo212165y()) == null || a != y.mo212029l()) {
                    this.f154010c.mo212165y().mo212019e();
                    C61303k kVar4 = this.f154010c;
                    if (kVar4 != null && (W = kVar4.mo212105W()) != null && (G = W.mo212818G()) != null) {
                        G.mo216378b();
                    }
                }
            } else if (this.f154009b) {
                C62299v.m243371a(this.f154010c);
            } else {
                C61303k kVar5 = this.f154010c;
                if (kVar5 != null && (y4 = kVar5.mo212165y()) != null) {
                    y4.mo212017d();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/entity/response/UpdateVideoChatEntity;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.base.a.a$b */
    public static final class C61419b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C61419b f154011a = new C61419b();

        C61419b() {
        }

        /* renamed from: a */
        public final ax parse(byte[] bArr) {
            return C60930c.m236942a(UpdateVideoChatResponse.ADAPTER.decode(bArr));
        }
    }

    /* renamed from: a */
    public final boolean mo212850a(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        return kVar.mo212092J().mo212513J();
    }

    /* renamed from: b */
    public final boolean mo212853b(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        return kVar.mo212092J().mo212505B();
    }

    /* renamed from: c */
    public final boolean mo212855c(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        return kVar.mo212092J().mo212504A();
    }

    /* renamed from: d */
    public final Boolean mo212857d(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        MeetingSpecificData J = kVar.mo212092J();
        if (J != null) {
            return Boolean.valueOf(J.mo212511H());
        }
        return null;
    }

    /* renamed from: e */
    public final boolean mo212859e(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        if (kVar.mo212057f() == VideoChat.Type.MEET) {
            AbstractC62555a aa = kVar.aa();
            Intrinsics.checkExpressionValueIsNotNull(aa, "meeting.settingMoreControl");
            if (aa.mo216280h() || kVar.aa().mo216286n()) {
                return true;
            }
            return false;
        }
        AbstractC62555a aa2 = kVar.aa();
        Intrinsics.checkExpressionValueIsNotNull(aa2, "meeting.settingMoreControl");
        return aa2.mo216280h();
    }

    /* renamed from: f */
    public final void mo212860f(C61303k kVar) {
        AbstractC62604b G;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        C60700b.m235841a(kVar.mo212056e(), "UI", "RtcSDK", "switchCamera", f154007b, "[initTopBar] switch camera button");
        try {
            ByteRtc y = kVar.mo212165y();
            if (y != null) {
                y.mo212019e();
            }
            AbstractC61417a W = kVar.mo212105W();
            if (!(W == null || (G = W.mo212818G()) == null)) {
                G.mo216378b();
            }
        } catch (Exception e) {
            String str = f154007b;
            C60700b.m235864f(str, "[initTopBar]", "camera switch failed: " + e.getStackTrace());
        }
        kVar.mo212092J().mo212557m(!kVar.mo212092J().mo212513J());
        new EquipmentChangedEvent().mo210473a();
    }

    /* renamed from: g */
    public final void mo212861g(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        if (!kVar.mo212092J().mo212504A()) {
            kVar.mo212165y().mo212014c();
            boolean J = kVar.mo212092J().mo212513J();
            ByteRtc y = kVar.mo212165y();
            Intrinsics.checkExpressionValueIsNotNull(y, "meeting.byteRtc");
            if (J != y.mo212029l()) {
                kVar.mo212165y().mo212019e();
            }
            AbstractC61417a W = kVar.mo212105W();
            Intrinsics.checkExpressionValueIsNotNull(W, "meeting.meetingControl");
            W.mo212818G().mo216378b();
        }
        VideoChat e = kVar.mo212056e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
        Participant c = ParticipantUtil.m248731c(e.getParticipants());
        ParticipantSettings.RtcMode rtcMode = ParticipantSettings.RtcMode.UNKNOWN;
        if (c != null) {
            ParticipantSettings participantSettings = c.getParticipantSettings();
            Intrinsics.checkExpressionValueIsNotNull(participantSettings, "participant.participantSettings");
            rtcMode = participantSettings.getRtcMode();
            Intrinsics.checkExpressionValueIsNotNull(rtcMode, "participant.participantSettings.rtcMode");
        }
        if (rtcMode == ParticipantSettings.RtcMode.UNKNOWN) {
            kVar.mo212165y().mo212013c(ParticipantSettings.RtcMode.NORMAL_MODE.getNumber());
        } else {
            kVar.mo212165y().mo212013c(rtcMode.getNumber());
        }
        kVar.mo212165y().mo212018d(kVar.mo212092J().mo212504A());
        kVar.mo212165y().mo212016c(kVar.mo212092J().mo212505B());
        String str = f154007b;
        C60700b.m235851b(str, "[setupLocalView]", "videoMute = " + kVar.mo212092J().mo212504A());
    }

    /* renamed from: a */
    public final VcBizTask<ax> mo212848a(String str, Long l) {
        UpdateVideoChatRequest.C51140a aVar = new UpdateVideoChatRequest.C51140a();
        aVar.mo176450a(UpdateVideoChatRequest.Action.MUTE_PUSH_ACK).mo176452a(str).mo176451a(l);
        return new VcBizTask<>(Command.UPDATE_VIDEO_CHAT, aVar, C61419b.f154011a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0048, code lost:
        if (r5.getRtcMode() != com.ss.android.vc.entity.ParticipantSettings.RtcMode.NORMAL_MODE) goto L_0x004c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo212854b(com.ss.android.vc.meeting.framework.meeting.C61303k r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.base.util.DataAdapterUtil.mo212854b(com.ss.android.vc.meeting.framework.meeting.k, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0048, code lost:
        if (r5.getRtcMode() != com.ss.android.vc.entity.ParticipantSettings.RtcMode.NORMAL_MODE) goto L_0x004c;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo212858d(com.ss.android.vc.meeting.framework.meeting.C61303k r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.base.util.DataAdapterUtil.mo212858d(com.ss.android.vc.meeting.framework.meeting.k, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo212851a(com.ss.android.vc.meeting.framework.meeting.C61303k r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.base.util.DataAdapterUtil.mo212851a(com.ss.android.vc.meeting.framework.meeting.k, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        if (r8.getRtcMode() != com.ss.android.vc.entity.ParticipantSettings.RtcMode.NORMAL_MODE) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo212856c(com.ss.android.vc.meeting.framework.meeting.C61303k r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.base.util.DataAdapterUtil.mo212856c(com.ss.android.vc.meeting.framework.meeting.k, boolean):boolean");
    }

    /* renamed from: a */
    public final void mo212849a(C61303k kVar, boolean z, boolean z2, boolean z3) {
        C61388g b;
        Participant j;
        ParticipantSettings participantSettings;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        if (!z) {
            C63693e.m249690f();
        }
        kVar.mo212092J().mo212539e(z);
        C61383d I = kVar.mo212091I();
        if (!(I == null || (b = I.mo212494b()) == null || (j = b.mo212605j()) == null || (participantSettings = j.getParticipantSettings()) == null)) {
            participantSettings.setCameraMuted(z);
        }
        ByteRtc y = kVar.mo212165y();
        if (y != null) {
            y.mo212018d(z);
        }
        if (z2) {
            VcBizService.muteCamera(kVar.mo212055d(), z, z3, C60788y.m236247a(ar.m236694a()));
        }
        C60735ab.m236013c(new RunnableC61418a(z, z3, kVar));
    }

    /* renamed from: b */
    public final void mo212852b(C61303k kVar, boolean z, boolean z2, boolean z3) {
        C61388g b;
        Participant j;
        ParticipantSettings participantSettings;
        String str;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        String str2 = f154007b;
        C60700b.m235851b(str2, "[changeLocalAudioData]", "mute = " + z + ", " + "requestByHost = " + z3 + ", " + "needNotifyServer = " + z2);
        kVar.mo212165y().mo212016c(z);
        if (z3 && z) {
            C61383d I = kVar.mo212091I();
            Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
            C61388g b2 = I.mo212494b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "meeting.meetingData.participantData");
            Participant j2 = b2.mo212605j();
            Intrinsics.checkExpressionValueIsNotNull(j2, "meeting.meetingData.part…ipantData.selfParticipant");
            long globalSeqId = j2.getGlobalSeqId();
            C60700b.m235851b(str2, "[changeLocalAudioData]", "globalSeqId:" + globalSeqId);
            VcBizTask<ax> a = mo212848a(kVar.mo212055d(), Long.valueOf(globalSeqId));
            if (a != null) {
                a.mo219889a((AbstractC63598b<ax>) null);
            }
        }
        if (z2) {
            boolean b3 = C60788y.m236250b(ar.m236694a());
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
                    VcBizService.muteAudio(kVar.mo212055d(), str, z, z3, b3);
                }
            }
            str = "";
            VcBizService.muteAudio(kVar.mo212055d(), str, z, z3, b3);
        }
        kVar.mo212092J().mo212542f(z);
        C61383d I2 = kVar.mo212091I();
        if (I2 != null && (b = I2.mo212494b()) != null && (j = b.mo212605j()) != null && (participantSettings = j.getParticipantSettings()) != null) {
            participantSettings.setMicrophoneMuted(z);
        }
    }
}
