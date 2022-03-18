package com.ss.android.vc.meeting.model.util;

import com.larksuite.framework.thread.C26171w;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.common.p3076a.C60694a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61293a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event.C63731ab;
import com.ss.android.vc.statistics.event.C63754d;
import com.ss.android.vc.statistics.event.C63761k;
import com.ss.android.vc.statistics.event.C63764m;
import com.ss.android.vc.statistics.event.bl;
import com.ss.android.vc.statistics.monitor.C63780b;
import com.ss.android.vc.statistics.p3182c.C63724a;
import com.ss.android.vc.statistics.p3182c.C63726b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000*\u0001\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/meeting/model/util/InVideoChatRtcListenerHelper;", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "TAG", "", "mByteRtcListener", "com/ss/android/vc/meeting/model/util/InVideoChatRtcListenerHelper$mByteRtcListener$1", "Lcom/ss/android/vc/meeting/model/util/InVideoChatRtcListenerHelper$mByteRtcListener$1;", "addRtcListener", "", "removeRtcListener", "sendEvent", "event", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.model.b.a */
public final class InVideoChatRtcListenerHelper {

    /* renamed from: a */
    public final String f153804a = "InVideoChatRtcListenerHelper";

    /* renamed from: b */
    public C61376b f153805b = new C61376b(this);

    /* renamed from: c */
    public final C61303k f153806c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.model.b.a$a */
    static final class RunnableC61375a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InVideoChatRtcListenerHelper f153807a;

        RunnableC61375a(InVideoChatRtcListenerHelper aVar) {
            this.f153807a = aVar;
        }

        public final void run() {
            this.f153807a.f153806c.mo212164x().mo211751a(this.f153807a.f153805b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"com/ss/android/vc/meeting/model/util/InVideoChatRtcListenerHelper$mByteRtcListener$1", "Lcom/ss/android/vc/meeting/framework/meeting/AbsByteRtcListener;", "isCallConnected", "", "isRemoteHasAudioPermission", "onCallConnected", "", "isFirstAudioFrame", "onConnectionInterrupted", "onConnectionLost", "onFirstLocalVideoFrame", "width", "", "height", "onFirstRemoteAudioFrame", "uid", "", "onFirstRemoteVideoFrame", "onRejoinChannelSuccess", "channel", "onUserJoined", "rtcJoinId", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.model.b.a$b */
    public static final class C61376b extends AbstractC61293a {

        /* renamed from: a */
        final /* synthetic */ InVideoChatRtcListenerHelper f153808a;

        /* renamed from: b */
        private boolean f153809b;

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: c */
        public void mo211767c() {
            if (this.f153808a.f153806c.mo212057f() != VideoChat.Type.MEET) {
                C60700b.m235851b(this.f153808a.f153804a, "[onConnectionInterrupted]", "for 1v1");
                this.f153808a.f153806c.mo212092J().mo212565q(true);
            }
        }

        /* renamed from: d */
        public final boolean mo212457d() {
            ParticipantSettings.EquipmentStatus equipmentStatus;
            ParticipantSettings participantSettings;
            String h = this.f153808a.f153806c.mo212092J().mo212546h();
            C61383d I = this.f153808a.f153806c.mo212091I();
            Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
            C61388g b = I.mo212494b();
            Intrinsics.checkExpressionValueIsNotNull(b, "meeting.meetingData.participantData");
            Participant b2 = ParticipantUtil.m248723b(h, b.mo212601f());
            if (b2 == null || (participantSettings = b2.getParticipantSettings()) == null) {
                equipmentStatus = null;
            } else {
                equipmentStatus = participantSettings.getMicrophoneStatus();
            }
            if (equipmentStatus == ParticipantSettings.EquipmentStatus.NORMAL) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: a */
        public void mo211743a() {
            VideoChat videoChat;
            if (this.f153808a.f153806c.mo212057f() != VideoChat.Type.MEET) {
                C60700b.m235851b(this.f153808a.f153804a, "[onConnectionLost]", "for 1v1");
                this.f153808a.mo212455a(210);
                C61303k kVar = this.f153808a.f153806c;
                VideoChat videoChat2 = null;
                if (kVar != null) {
                    videoChat = kVar.mo212056e();
                } else {
                    videoChat = null;
                }
                C63761k.m250298a(videoChat, 3, "streaming_sdk_bad");
                C61303k kVar2 = this.f153808a.f153806c;
                if (kVar2 != null) {
                    videoChat2 = kVar2.mo212056e();
                }
                C63780b.m250409a("SDK", videoChat2);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61376b(InVideoChatRtcListenerHelper aVar) {
            this.f153808a = aVar;
        }

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        public void i_(String str) {
            if (this.f153808a.f153806c.mo212057f() != VideoChat.Type.MEET && !mo212457d()) {
                String str2 = this.f153808a.f153804a;
                C60700b.m235851b(str2, "[onUserJoined]", "for 1v1 rtcJoinId=" + str);
                m239180a(false);
            }
        }

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: c */
        public void mo211769c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            if (this.f153808a.f153806c.mo212057f() != VideoChat.Type.MEET) {
                String str2 = this.f153808a.f153804a;
                C60700b.m235851b(str2, "[onFirstRemoteAudioFrame]", "for 1v1 uid=" + str);
                m239180a(true);
            }
        }

        /* renamed from: a */
        private final void m239180a(boolean z) {
            VideoChat videoChat;
            VideoChat videoChat2;
            VideoChat videoChat3;
            VideoChat videoChat4;
            VideoChat videoChat5;
            if (!this.f153809b) {
                this.f153809b = true;
                C63754d p = this.f153808a.f153806c.mo212092J().mo212562p();
                C61303k kVar = this.f153808a.f153806c;
                VideoChat videoChat6 = null;
                if (kVar != null) {
                    videoChat = kVar.mo212056e();
                } else {
                    videoChat = null;
                }
                p.mo220404a(videoChat);
                C63731ab q = this.f153808a.f153806c.mo212092J().mo212564q();
                C61303k kVar2 = this.f153808a.f153806c;
                if (kVar2 != null) {
                    videoChat2 = kVar2.mo212056e();
                } else {
                    videoChat2 = null;
                }
                q.mo220388b(videoChat2);
                if (z) {
                    C63764m r = this.f153808a.f153806c.mo212092J().mo212566r();
                    C61303k kVar3 = this.f153808a.f153806c;
                    if (kVar3 != null) {
                        videoChat4 = kVar3.mo212056e();
                    } else {
                        videoChat4 = null;
                    }
                    r.mo220406a(videoChat4);
                    C61303k kVar4 = this.f153808a.f153806c;
                    if (kVar4 != null) {
                        videoChat5 = kVar4.mo212056e();
                    } else {
                        videoChat5 = null;
                    }
                    bl.m250189b(videoChat5);
                }
                this.f153808a.f153806c.mo212092J().mo212561o(true);
                if (C60694a.m235828a()) {
                    C61303k kVar5 = this.f153808a.f153806c;
                    if (kVar5 != null) {
                        videoChat3 = kVar5.mo212056e();
                    } else {
                        videoChat3 = null;
                    }
                    if (C63724a.m249907a(videoChat3)) {
                        C61303k kVar6 = this.f153808a.f153806c;
                        if (kVar6 != null) {
                            videoChat6 = kVar6.mo212056e();
                        }
                        C63726b.m249913a("vc_monitor_caller_meet_callee", videoChat6);
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("callee_access", System.currentTimeMillis() - C57744a.m224104a().getLong("SP_KEY_ACCEPT_MEET_TIME"));
                        C61303k kVar7 = this.f153808a.f153806c;
                        if (kVar7 != null) {
                            videoChat6 = kVar7.mo212056e();
                        }
                        C63726b.m249915a("vc_monitor_callee_meet_caller", jSONObject, videoChat6);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: a */
        public void mo211746a(int i, int i2) {
            VideoChat videoChat;
            if (this.f153808a.f153806c.mo212057f() != VideoChat.Type.MEET) {
                C60700b.m235851b(this.f153808a.f153804a, "[onFirstLocalVideoFrame]", "for 1v1");
                C61303k kVar = this.f153808a.f153806c;
                if (kVar != null) {
                    videoChat = kVar.mo212056e();
                } else {
                    videoChat = null;
                }
                bl.m250190c(videoChat);
            }
        }

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: e */
        public void mo211771e(String str, String str2) {
            String str3;
            if (this.f153808a.f153806c.mo212057f() != VideoChat.Type.MEET) {
                this.f153808a.f153806c.mo212092J().mo212565q(false);
                String str4 = this.f153808a.f153804a;
                C60700b.m235851b(str4, "[onRejoinChannelSuccess]", "mutedcamera " + this.f153808a.f153806c.mo212092J().mo212504A() + ' ' + "mutedaudio " + this.f153808a.f153806c.mo212092J().mo212505B());
                VcBizService.muteCamera(this.f153808a.f153806c.mo212055d(), this.f153808a.f153806c.mo212092J().mo212504A(), false, C60788y.m236247a(ar.m236694a()));
                boolean b = C60788y.m236250b(ar.m236694a());
                AbsBreakoutRoomControl al = this.f153808a.f153806c.al();
                Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
                if (al.mo213182i()) {
                    AbsBreakoutRoomControl al2 = this.f153808a.f153806c.al();
                    Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
                    if (al2.mo213184k() != null) {
                        AbsBreakoutRoomControl al3 = this.f153808a.f153806c.al();
                        Intrinsics.checkExpressionValueIsNotNull(al3, "meeting.breakoutRoomControl");
                        VCBreakoutRoomInfo k = al3.mo213184k();
                        Intrinsics.checkExpressionValueIsNotNull(k, "meeting.breakoutRoomControl.breakoutRoomInfo");
                        str3 = k.getBreakoutRoomId();
                        Intrinsics.checkExpressionValueIsNotNull(str3, "meeting.breakoutRoomCont…utRoomInfo.breakoutRoomId");
                        VcBizService.muteAudio(this.f153808a.f153806c.mo212055d(), str3, this.f153808a.f153806c.mo212092J().mo212505B(), false, b);
                    }
                }
                str3 = "";
                VcBizService.muteAudio(this.f153808a.f153806c.mo212055d(), str3, this.f153808a.f153806c.mo212092J().mo212505B(), false, b);
            }
        }

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: a */
        public void mo211752a(String str, int i, int i2) {
            VideoChat videoChat;
            Intrinsics.checkParameterIsNotNull(str, "uid");
            if (this.f153808a.f153806c.mo212057f() != VideoChat.Type.MEET) {
                C60700b.m235851b(this.f153808a.f153804a, "[onFirstRemoteAudioFrame]", "for 1v1 uid=" + str);
                C63731ab q = this.f153808a.f153806c.mo212092J().mo212564q();
                C61303k kVar = this.f153808a.f153806c;
                VideoChat videoChat2 = null;
                if (kVar != null) {
                    videoChat = kVar.mo212056e();
                } else {
                    videoChat = null;
                }
                q.mo220387a(videoChat);
                C61303k kVar2 = this.f153808a.f153806c;
                if (kVar2 != null) {
                    videoChat2 = kVar2.mo212056e();
                }
                bl.m250186a(videoChat2);
            }
        }
    }

    /* renamed from: a */
    public final void mo212454a() {
        String str = this.f153804a;
        C60700b.m235851b(str, "[addRtcListener]", "meetingId: " + this.f153806c.mo212055d());
        C26171w.m94675a(new RunnableC61375a(this));
    }

    public InVideoChatRtcListenerHelper(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f153806c = kVar;
    }

    /* renamed from: a */
    public final void mo212455a(int i) {
        this.f153806c.mo212051a(C61344j.m239002a().mo212329a(i).mo212331a(EventSource.EVENT_ACTIVITY));
    }
}
