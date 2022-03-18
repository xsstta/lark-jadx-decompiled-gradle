package com.ss.android.vc.meeting.bytertc;

import android.content.Intent;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.irtc.RtcAudioVolumeInfo;
import com.ss.android.vc.irtc.RtcNetworkQualityInfo;
import com.ss.android.vc.irtc.RtcSystemUsageInfo;
import com.ss.android.vc.irtc.VcByteStream;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61293a;
import com.ss.android.vc.meeting.framework.meeting.ByteRtc;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamManagerGlobal;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.base.AbstractC61417a;
import com.ss.android.vc.meeting.module.floatingwindow.MeetingFloatWindow;
import com.ss.android.vc.meeting.module.multi.MeetingNetDisconnectActivity;
import com.ss.android.vc.meeting.module.p3129j.AbstractC61994a;
import com.ss.android.vc.meeting.module.sharebox.AbstractC63022a;
import com.ss.android.vc.meeting.module.volumeIndicator.AudioVolumeIndicatorControl;
import com.ss.android.vc.meeting.utils.ActiveSpeakerCalculator;
import com.ss.android.vc.meeting.utils.CheckMuteStateConflictUtil;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.p3069b.C60668b;
import com.ss.android.vc.p3069b.C60680d;
import com.ss.android.vc.p3069b.C60685h;
import com.ss.android.vc.p3069b.C60686i;
import com.ss.android.vc.statistics.event.C63730aa;
import com.ss.android.vc.statistics.event.C63732ac;
import com.ss.android.vc.statistics.event.C63749bg;
import com.ss.android.vc.statistics.event.C63761k;
import com.ss.android.vc.statistics.event.C63768q;
import com.ss.android.vc.statistics.event.ao;
import com.ss.android.vc.statistics.event.as;
import com.ss.android.vc.statistics.monitor.C63779a;
import com.ss.android.vc.statistics.monitor.C63780b;
import com.ss.android.vc.statistics.p3180a.C63688c;
import com.ss.android.vc.statistics.p3180a.C63693e;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J#\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\bH\u0016J\"\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J \u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0016J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0011H\u0016J\u0018\u0010'\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0006H\u0016J\"\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\b2\u0006\u0010-\u001a\u00020\u0006H\u0016J\"\u0010.\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\b2\u0006\u0010-\u001a\u00020\u0006H\u0016J\u0018\u0010/\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u00100\u001a\u000201H\u0016J\u001c\u00102\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u00010\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000206H\u0016J\u0018\u00108\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u00109\u001a\u00020\bH\u0016J\u001c\u0010:\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010;\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020>2\u0006\u00109\u001a\u00020\bH\u0016J\u001c\u0010?\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010;\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010@\u001a\u00020\u000e2\b\u00100\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010C\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\bH\u0016J\u001a\u0010E\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010F\u001a\u00020GH\u0016J\u001a\u0010H\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010I\u001a\u00020GH\u0016J\u0010\u0010J\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\bH\u0016J\u000e\u0010L\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u0001J\u000e\u0010N\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u0001R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/ss/android/vc/meeting/bytertc/MeetingSdkListener;", "Lcom/ss/android/vc/meeting/framework/meeting/AbsByteRtcListener;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "MAX_ERROR_REJOIN_TIMES", "", "TAG", "", "errorRejoinedTimes", "mListeners", "", "mMeeting", "onAudioVolumeIndication", "", "speaker", "", "Lcom/ss/android/vc/irtc/RtcAudioVolumeInfo;", "totalVolume", "([Lcom/ss/android/vc/irtc/RtcAudioVolumeInfo;I)V", "onConnectionInterrupted", "onConnectionLost", "onConnectionLostUser", "onError", "err", "onFirstLocalVideoFrame", "width", "height", "onFirstRemoteAudioFrame", "rtcJoinId", "onFirstRemoteScreenFrame", "onFirstRemoteVideoFrame", "onJoinChannelSuccess", "channelName", "onLocalAudioStateChanged", "state", "error", "onLocalAudioVolumeIndication", "rtcAudioVolumeInfo", "onLocalVideoStateChanged", "onMaximumScreenShareFpsUpdated", "fps", "onMediaDeviceError", "deviceType", "deviceId", "code", "onMediaDeviceWarning", "onNetworkQuality", "info", "Lcom/ss/android/vc/irtc/RtcNetworkQualityInfo;", "onRejoinChannelSuccess", "channel", "onReportCpuUsage", "appUsage", "", "totalUsage", "onScreenStreamAdd", "streamId", "onScreenStreamRemove", "streamInfo", "onStreamAdd", "stream", "Lcom/ss/android/vc/irtc/VcByteStream;", "onStreamRemove", "onSystemOverloaded", "Lcom/ss/android/vc/irtc/RtcSystemUsageInfo;", "config", "onUserJoined", "identifier", "onUserMuteAudio", "muted", "", "onUserMuteVideo", "isMute", "onUserOffline", "identifer", "registerSdkListener", "listener", "unregisterSdkListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.bytertc.c */
public final class MeetingSdkListener extends AbstractC61293a {

    /* renamed from: a */
    public C61303k f153379a;

    /* renamed from: b */
    private final String f153380b = "MeetingSdkListener";

    /* renamed from: c */
    private List<AbstractC61293a> f153381c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private int f153382d;

    /* renamed from: e */
    private final int f153383e = 3;

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211755a(String str, boolean z) {
        C60700b.m235841a(this.f153379a.mo212056e(), "RtcSDK", "UI", "onUserMuteVideo: " + z, this.f153380b, "[onUserMuteVideo] rtcJoinId = " + str + ", muted = " + z);
        for (AbstractC61293a aVar : this.f153381c) {
            aVar.mo211755a(str, z);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: b */
    public void mo211765b(String str, boolean z) {
        C60700b.m235841a(this.f153379a.mo212056e(), "RtcSDK", "UI", "onUserMuteAudio: " + z, this.f153380b, "[onUserMuteAudio] rtcJoinId = " + str + ", muted = " + z);
        for (AbstractC61293a aVar : this.f153381c) {
            aVar.mo211765b(str, z);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211754a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "channelName");
        Intrinsics.checkParameterIsNotNull(str2, "rtcJoinId");
        C61303k kVar = this.f153379a;
        VideoChat videoChat = null;
        VideoChat e = kVar != null ? kVar.mo212056e() : null;
        C60700b.m235841a(e, "RtcSDK", "UI", "onJoinChannelSuccess rtcJoinId = " + str2, this.f153380b, "[onUserJoinChannelSuccess] channel = " + str + ", rtcJoinId = " + str2);
        C61303k kVar2 = this.f153379a;
        if (kVar2 != null) {
            videoChat = kVar2.mo212056e();
        }
        C63730aa.m249940a(videoChat);
        for (AbstractC61293a aVar : this.f153381c) {
            aVar.mo211754a(str, str2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211752a(String str, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
        C61303k kVar = this.f153379a;
        String str2 = null;
        VideoChat e = kVar != null ? kVar.mo212056e() : null;
        C60700b.m235841a(e, "RtcSDK", "UI", "onFirstRemoteVideoFrame identifer = " + str, this.f153380b, "[onFirstRemoteVideoFrame] rtcJoinId = " + str);
        this.f153379a.mo212102T().mo212210a(str);
        C63693e.m249684b(this.f153379a);
        if (this.f153379a.mo212057f() == VideoChat.Type.MEET) {
            C61303k kVar2 = this.f153379a;
            as.m250053a(str, kVar2 != null ? kVar2.mo212056e() : null);
        }
        StreamManagerGlobal T = this.f153379a.mo212102T();
        if (T != null) {
            str2 = T.mo212230f(str);
        }
        C63688c.m249672a(str2);
        for (AbstractC61293a aVar : this.f153381c) {
            aVar.mo211752a(str, i, i2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: b */
    public void mo211764b(String str, String str2) {
        StreamManagerGlobal T;
        StreamManagerGlobal T2;
        StreamManagerGlobal T3;
        VideoChat videoChat = null;
        C63688c.m249675b((str == null || (T3 = this.f153379a.mo212102T()) == null) ? null : T3.mo212230f(str));
        String str3 = str;
        boolean z = false;
        if (!(str3 == null || str3.length() == 0)) {
            C61303k kVar = this.f153379a;
            if (kVar != null) {
                videoChat = kVar.mo212056e();
            }
            C60700b.m235841a(videoChat, "RtcSDK", "UI", "onStreamRemove identifer = " + str, this.f153380b, "[onStreamRemove] identifer = " + str);
            C61303k kVar2 = this.f153379a;
            if (!(kVar2 == null || (T2 = kVar2.mo212102T()) == null)) {
                T2.mo212212a(str, str2);
            }
            for (AbstractC61293a aVar : this.f153381c) {
                aVar.mo211764b(str, str2);
            }
            return;
        }
        String str4 = str2;
        if (str4 == null || str4.length() == 0) {
            z = true;
        }
        if (!z) {
            C61303k kVar3 = this.f153379a;
            if (kVar3 == null) {
                Intrinsics.throwNpe();
            }
            for (Map.Entry<String, VcByteStream> entry : kVar3.mo212102T().mo212217b().entrySet()) {
                String key = entry.getKey();
                if (Intrinsics.areEqual(entry.getValue().f152907a, str2)) {
                    C61303k kVar4 = this.f153379a;
                    if (kVar4 != null) {
                        videoChat = kVar4.mo212056e();
                    }
                    C60700b.m235841a(videoChat, "RtcSDK", "UI", "onStreamRemove rtcJoinId = " + key, this.f153380b, "[onStreamRemove] rtcJoinId = " + key);
                    C61303k kVar5 = this.f153379a;
                    if (!(kVar5 == null || (T = kVar5.mo212102T()) == null)) {
                        T.mo212212a(key, str2);
                    }
                    for (AbstractC61293a aVar2 : this.f153381c) {
                        aVar2.mo211764b(key, str2);
                    }
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211756a(RtcAudioVolumeInfo[] rtcAudioVolumeInfoArr, int i) {
        Intrinsics.checkParameterIsNotNull(rtcAudioVolumeInfoArr, "speaker");
        ActiveSpeakerCalculator w = this.f153379a.mo212163w();
        if (w != null) {
            w.mo219606a(rtcAudioVolumeInfoArr);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211753a(String str, RtcNetworkQualityInfo rtcNetworkQualityInfo) {
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
        Intrinsics.checkParameterIsNotNull(rtcNetworkQualityInfo, "info");
        AbstractC61994a an = this.f153379a.an();
        if (an != null) {
            an.mo214608a(str, rtcNetworkQualityInfo);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211743a() {
        VideoChat videoChat;
        C61303k kVar = this.f153379a;
        if (kVar != null) {
            videoChat = kVar.mo212056e();
        } else {
            videoChat = null;
        }
        C60700b.m235841a(videoChat, "RtcSDK", "UI", "onConnectionLost", this.f153380b, "[onConnectionLost]");
        for (AbstractC61293a aVar : this.f153381c) {
            aVar.mo211743a();
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: c */
    public void mo211767c() {
        VideoChat videoChat;
        C61303k kVar = this.f153379a;
        if (kVar != null) {
            videoChat = kVar.mo212056e();
        } else {
            videoChat = null;
        }
        C60700b.m235841a(videoChat, "RtcSDK", "UI", "onConnectionInterrupted", this.f153380b, "onConnectionInterrupted");
        for (AbstractC61293a aVar : this.f153381c) {
            aVar.mo211767c();
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: b */
    public void mo211757b() {
        C61303k kVar = this.f153379a;
        VideoChat videoChat = null;
        C60700b.m235841a(kVar != null ? kVar.mo212056e() : null, "RtcSDK", "UI", "onConnectionLostUser", this.f153380b, "[onConnectionLostUser]");
        C61303k kVar2 = this.f153379a;
        if (kVar2 != null) {
            VideoChat e = kVar2 != null ? kVar2.mo212056e() : null;
            if (e != null) {
                AbstractC63022a ak = this.f153379a.ak();
                Intrinsics.checkExpressionValueIsNotNull(ak, "mMeeting.shareBoxControl");
                if (!ak.mo217756b()) {
                    try {
                        Intent intent = new Intent(ar.m236694a(), MeetingNetDisconnectActivity.class);
                        intent.putExtra("VideoChatInfo", e);
                        intent.addFlags(268435456);
                        ar.m236694a().startActivity(intent);
                    } catch (Exception e2) {
                        C60775q.m236136a(e2.getMessage());
                    }
                }
            } else {
                return;
            }
        }
        for (AbstractC61293a aVar : this.f153381c) {
            aVar.mo211757b();
        }
        C61303k kVar3 = this.f153379a;
        C63780b.m250409a("SDK", kVar3 != null ? kVar3.mo212056e() : null);
        C61303k kVar4 = this.f153379a;
        if (kVar4 != null) {
            videoChat = kVar4.mo212056e();
        }
        ao.m250026a(videoChat, "streaming_sdk_bad");
        C61344j a = C61344j.m239002a().mo212329a(210).mo212331a(EventSource.EVENT_SDK);
        C61303k kVar5 = this.f153379a;
        if (kVar5 != null) {
            kVar5.mo212051a(a);
        }
    }

    public MeetingSdkListener(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f153379a = kVar;
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211748a(RtcAudioVolumeInfo rtcAudioVolumeInfo) {
        Intrinsics.checkParameterIsNotNull(rtcAudioVolumeInfo, "rtcAudioVolumeInfo");
        AudioVolumeIndicatorControl ap = this.f153379a.ap();
        if (ap != null) {
            ap.mo219553a(rtcAudioVolumeInfo);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: b */
    public void mo211758b(int i) {
        VideoChat videoChat;
        C61303k kVar = this.f153379a;
        if (kVar != null) {
            videoChat = kVar.mo212056e();
        } else {
            videoChat = null;
        }
        C60700b.m235841a(videoChat, "RtcSDK", "UI", "onMaximumScreenShareFpsUpdated fps = " + i, this.f153380b, "[onMaximumScreenShareFpsUpdated] fps = " + i);
        this.f153379a.aj().mo216399a(i);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: c */
    public void mo211769c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
        C61303k kVar = this.f153379a;
        VideoChat videoChat = null;
        C60700b.m235841a(kVar != null ? kVar.mo212056e() : null, "RtcSDK", "UI", "onFirstRemoteAudioFrame identifer = " + str, this.f153380b, "[onFirstRemoteAudioFrame] identifer = " + str);
        C63693e.m249684b(this.f153379a);
        if (this.f153379a.mo212057f() == VideoChat.Type.MEET) {
            C61303k kVar2 = this.f153379a;
            as.m250054b(str, kVar2 != null ? kVar2.mo212056e() : null);
            C61303k kVar3 = this.f153379a;
            if (kVar3 != null) {
                videoChat = kVar3.mo212056e();
            }
            C63749bg.m250163a(str, videoChat);
        }
        for (AbstractC61293a aVar : this.f153381c) {
            aVar.mo211769c(str);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    public void i_(String str) {
        VideoChat videoChat;
        Intrinsics.checkParameterIsNotNull(str, "identifier");
        C61303k kVar = this.f153379a;
        if (kVar != null) {
            videoChat = kVar.mo212056e();
        } else {
            videoChat = null;
        }
        C60700b.m235841a(videoChat, "RtcSDK", "UI", "onUserJoined identifier = " + str, this.f153380b, "[onUserJoined] identifier = " + str);
        if (C60685h.f151809a && C60668b.m235758c()) {
            C60686i.m235797a(this.f153380b, "num = " + (C57744a.m224104a().getInt("sp_key_monitor_part_number") + 1) + ", start monitor!");
            new C60668b().mo208222a(1, ((long) C57744a.m224104a().getInt("sp_key_apm_duration")) * 60, new C61233a(this));
        }
        for (AbstractC61293a aVar : this.f153381c) {
            aVar.i_(str);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211745a(int i) {
        VideoChat e;
        MeetingSpecificData J;
        MeetingSpecificData J2;
        C61303k kVar = this.f153379a;
        VideoChat videoChat = null;
        r1 = null;
        String str = null;
        C60700b.m235848b(kVar != null ? kVar.mo212056e() : null, "RtcSDK", "UI", "onError error = " + i, this.f153380b, "[onError] error = " + i);
        if (i == -1003 && this.f153382d <= this.f153383e) {
            C60700b.m235851b(this.f153380b, "[onError]", "rejoinChannel");
            this.f153382d++;
            for (AbstractC61293a aVar : this.f153381c) {
                aVar.mo211745a(i);
            }
            C63693e.m249681a(this.f153379a);
            ByteRtc y = this.f153379a.mo212165y();
            C61303k kVar2 = this.f153379a;
            String f = (kVar2 == null || (J2 = kVar2.mo212092J()) == null) ? null : J2.mo212540f();
            C61303k kVar3 = this.f153379a;
            String e2 = (kVar3 == null || (J = kVar3.mo212092J()) == null) ? null : J.mo212537e();
            C61303k kVar4 = this.f153379a;
            if (!(kVar4 == null || (e = kVar4.mo212056e()) == null)) {
                str = e.getZoomUserId();
            }
            y.mo212002a(f, e2, str, MeetingUtil.m238372c(this.f153379a.mo212056e()));
        } else if (i < 0) {
            C63688c.m249670a(i, this.f153379a.mo212056e());
            if (this.f153379a.mo212057f() == VideoChat.Type.MEET) {
                C61303k kVar5 = this.f153379a;
                C63780b.m250409a("SDK", kVar5 != null ? kVar5.mo212056e() : null);
                C61303k kVar6 = this.f153379a;
                ao.m250026a(kVar6 != null ? kVar6.mo212056e() : null, "streaming_sdk_bad");
            } else {
                C61303k kVar7 = this.f153379a;
                C63761k.m250298a(kVar7 != null ? kVar7.mo212056e() : null, 3, "streaming_sdk_bad");
            }
            C61344j a = C61344j.m239002a().mo212329a(210).mo212331a(EventSource.EVENT_SDK);
            C61303k kVar8 = this.f153379a;
            if (kVar8 != null) {
                kVar8.mo212051a(a);
            }
            C61303k kVar9 = this.f153379a;
            if (kVar9 != null) {
                videoChat = kVar9.mo212056e();
            }
            C63779a.m250406a(i, videoChat);
        }
    }

    /* renamed from: b */
    public final void mo211761b(AbstractC61293a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        String str = this.f153380b;
        C60700b.m235851b(str, "[unregisterSdkListener]", "isFloat = " + (aVar instanceof MeetingFloatWindow));
        this.f153381c.remove(aVar);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: b */
    public void mo211762b(String str) {
        VideoChat videoChat;
        Intrinsics.checkParameterIsNotNull(str, "identifer");
        C61303k kVar = this.f153379a;
        if (kVar != null) {
            videoChat = kVar.mo212056e();
        } else {
            videoChat = null;
        }
        C60700b.m235841a(videoChat, "RtcSDK", "UI", "onUserOffline identifer = " + str, this.f153380b, "[onUserOffline] identifer = " + str);
    }

    /* renamed from: a */
    public final void mo211751a(AbstractC61293a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f153382d = 0;
        String str = this.f153380b;
        C60700b.m235851b(str, "[registerSdkListener]", "isFloat = " + (aVar instanceof MeetingFloatWindow));
        if (!this.f153381c.contains(aVar)) {
            this.f153381c.add(aVar);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211744a(double d, double d2) {
        this.f153379a.mo212103U().mo215420a(d, d2);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211746a(int i, int i2) {
        String str = this.f153380b;
        C60700b.m235851b(str, "[onFirstLocalVideoFrame]", "width = " + i + ", height = " + i2);
        C63693e.m249691g();
        for (AbstractC61293a aVar : this.f153381c) {
            aVar.mo211746a(i, i2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: b */
    public void mo211759b(int i, int i2) {
        boolean B = this.f153379a.mo212092J().mo212505B();
        String str = this.f153380b;
        C60700b.m235843a(str, "[onLocalAudioStateChanged]", "state = " + i + ", isAudioMuted = " + B + ", error = " + i2);
        for (AbstractC61293a aVar : this.f153381c) {
            aVar.mo211759b(i, i2);
        }
        CheckMuteStateConflictUtil.f160383a.mo219625a(this.f153379a);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    public void b_(String str, String str2) {
        VideoChat videoChat;
        String str3;
        C61303k kVar = this.f153379a;
        StreamManagerGlobal streamManagerGlobal = null;
        if (kVar != null) {
            videoChat = kVar.mo212056e();
        } else {
            videoChat = null;
        }
        C60700b.m235841a(videoChat, "RtcSDK", "UI", "onScreenStreamRemove identifer = " + str, this.f153380b, "[onScreenStreamRemove] identifer = " + str);
        StreamManagerGlobal T = this.f153379a.mo212102T();
        if (T != null) {
            str3 = T.mo212232h(str);
        } else {
            str3 = null;
        }
        C63688c.m249675b(str3);
        C61303k kVar2 = this.f153379a;
        if (kVar2 != null) {
            streamManagerGlobal = kVar2.mo212102T();
        }
        streamManagerGlobal.mo212220b(str, str2);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: c */
    public void mo211768c(int i, int i2) {
        boolean A = this.f153379a.mo212092J().mo212504A();
        String str = this.f153380b;
        C60700b.m235843a(str, "[onLocalVideoStateChanged]", "state = " + i + ", isVideoMuted = " + A + ", error = " + i2);
        for (AbstractC61293a aVar : this.f153381c) {
            aVar.mo211768c(i, i2);
        }
        CheckMuteStateConflictUtil.f160383a.mo219627b(this.f153379a);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: e */
    public void mo211771e(String str, String str2) {
        VideoChat videoChat;
        C61303k kVar = this.f153379a;
        if (kVar != null) {
            videoChat = kVar.mo212056e();
        } else {
            videoChat = null;
        }
        C60700b.m235841a(videoChat, "RtcSDK", "UI", "onRejoinChannelSuccess rtcJoinId = " + str2 + " channel=" + str, this.f153380b, "onRejoinChannelSuccess");
        for (AbstractC61293a aVar : this.f153381c) {
            aVar.mo211771e(str, str2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: c */
    public void mo211770c(String str, String str2) {
        VideoChat videoChat;
        StreamManagerGlobal T;
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
        Intrinsics.checkParameterIsNotNull(str2, "streamId");
        C61303k kVar = this.f153379a;
        if (kVar != null) {
            videoChat = kVar.mo212056e();
        } else {
            videoChat = null;
        }
        C60700b.m235841a(videoChat, "RtcSDK", "UI", "onScreenStreamAdd identifer = " + str, this.f153380b, "[onScreenStreamAdd] identifer = " + str + ", streamId = " + str2);
        C61303k kVar2 = this.f153379a;
        if (!(kVar2 == null || (T = kVar2.mo212102T()) == null)) {
            T.mo212224c(str, str2);
        }
        for (AbstractC61293a aVar : this.f153381c) {
            aVar.mo211770c(str, str2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211749a(RtcSystemUsageInfo rtcSystemUsageInfo, String str) {
        VideoChat videoChat;
        C61303k kVar = this.f153379a;
        if (kVar != null) {
            videoChat = kVar.mo212056e();
        } else {
            videoChat = null;
        }
        String str2 = this.f153380b;
        C60700b.m235841a(videoChat, "RtcSDK", "UI", "onSystemOverloaded", str2, "[onSystemOverloaded] " + rtcSystemUsageInfo + ", " + str);
        C63732ac.m249954a(this.f153379a, rtcSystemUsageInfo, str);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211750a(VcByteStream vcByteStream, String str) {
        StreamManagerGlobal T;
        Intrinsics.checkParameterIsNotNull(vcByteStream, "stream");
        Intrinsics.checkParameterIsNotNull(str, "streamId");
        C61303k kVar = this.f153379a;
        VideoChat videoChat = null;
        C60700b.m235841a(kVar != null ? kVar.mo212056e() : null, "RtcSDK", "UI", "onStreamAdd identifer = " + vcByteStream.f152908b, this.f153380b, "[onStreamAdd] identifer = " + vcByteStream.f152908b + ", streamId = " + str);
        if (!Intrinsics.areEqual(vcByteStream.f152908b, ParticipantUtil.m248728b(this.f153379a))) {
            C61303k kVar2 = this.f153379a;
            if (kVar2 != null) {
                videoChat = kVar2.mo212056e();
            }
            C63768q.m250335a(videoChat, vcByteStream.f152908b);
            C61303k kVar3 = this.f153379a;
            if (!(kVar3 == null || (T = kVar3.mo212102T()) == null)) {
                String str2 = vcByteStream.f152908b;
                Intrinsics.checkExpressionValueIsNotNull(str2, "stream.userId");
                T.mo212211a(str2, vcByteStream);
            }
            for (AbstractC61293a aVar : this.f153381c) {
                aVar.mo211750a(vcByteStream, str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "info", "Lcom/ss/android/vc/apm/VCApmSampleInfo;", "kotlin.jvm.PlatformType", "avgInfo", "finished", "", "onSample"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.bytertc.c$a */
    static final class C61233a implements C60668b.AbstractC60671a {

        /* renamed from: a */
        final /* synthetic */ MeetingSdkListener f153384a;

        C61233a(MeetingSdkListener cVar) {
            this.f153384a = cVar;
        }

        @Override // com.ss.android.vc.p3069b.C60668b.AbstractC60671a
        /* renamed from: a */
        public final void mo208226a(C60680d dVar, C60680d dVar2, boolean z) {
            if (z && this.f153384a.f153379a != null) {
                this.f153384a.f153379a.mo212051a(C61344j.m239002a().mo212329a(99).mo212331a(EventSource.EVENT_DIALOG));
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211747a(int i, String str, int i2) {
        VideoChat videoChat;
        AbstractC61417a W;
        AbsMediaDeviceWarningControl I;
        super.mo211747a(i, str, i2);
        C61303k kVar = this.f153379a;
        if (kVar != null) {
            videoChat = kVar.mo212056e();
        } else {
            videoChat = null;
        }
        C60700b.m235848b(videoChat, "RtcSDK", "UI", "onMediaDeviceWarning code = " + i2, this.f153380b, "[onMediaDeviceWarning] code = " + i2);
        C61303k kVar2 = this.f153379a;
        if (kVar2 != null && (W = kVar2.mo212105W()) != null && (I = W.mo212820I()) != null) {
            I.mo211736a(i, str, i2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: b */
    public void mo211760b(int i, String str, int i2) {
        VideoChat videoChat;
        super.mo211760b(i, str, i2);
        C61303k kVar = this.f153379a;
        if (kVar != null) {
            videoChat = kVar.mo212056e();
        } else {
            videoChat = null;
        }
        C60700b.m235848b(videoChat, "RtcSDK", "UI", "onMediaDeviceError code = " + i2, this.f153380b, "[onMediaDeviceError] code = " + i2);
        if (i2 == -3001) {
            C60700b.m235851b(this.f153380b, "[onMediaDeviceError]", "code = BRERR_VDM_CAMERA_IS_OCCUPIED");
            this.f153379a.mo212165y().mo212017d();
            for (AbstractC61293a aVar : this.f153381c) {
                aVar.mo211760b(i, str, i2);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: b */
    public void mo211763b(String str, int i, int i2) {
        String str2;
        C60700b.m235841a(this.f153379a.mo212056e(), "RtcSDK", "UI", "onFirstRemoteScreenFrame identifer = " + str, this.f153380b, "[onFirstRemoteScreenFrame] identifer = " + str);
        StreamManagerGlobal T = this.f153379a.mo212102T();
        if (T != null) {
            str2 = T.mo212232h(str);
        } else {
            str2 = null;
        }
        C63688c.m249672a(str2);
        for (AbstractC61293a aVar : this.f153381c) {
            aVar.mo211763b(str, i, i2);
        }
    }
}
