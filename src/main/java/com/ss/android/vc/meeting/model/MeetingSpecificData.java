package com.ss.android.vc.meeting.model;

import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.larksuite.framework.thread.C26171w;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.multi.gridcontent.TriggerType;
import com.ss.android.vc.meeting.utils.ActiveSpeakerCalculator;
import com.ss.android.vc.meeting.utils.CheckMuteStateConflictUtil;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.statistics.event.C63731ab;
import com.ss.android.vc.statistics.event.C63754d;
import com.ss.android.vc.statistics.event.C63764m;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0016\u0018\u00002\u00020\u0001:\u0002¸\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0007\u0010\u001a\u00030\u0001J\u0007\u0010\u0001\u001a\u00020\u000bJ\u0012\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001J\b\u0010\u0001\u001a\u00030\u0001J\u001a\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u0006J\u0007\u0010\u0001\u001a\u00020\u000bJ\u0007\u0010\u0001\u001a\u00020\u000bJ\u0007\u0010\u0001\u001a\u00020\u000bJ\u0007\u0010\u0001\u001a\u00020\u000bJ\u0007\u0010\u0001\u001a\u00020\u000bJ\u0007\u0010\u0001\u001a\u00020\u000bJ\u0007\u0010\u0001\u001a\u00020\u000bJ\u0007\u0010\u0001\u001a\u00020\u000bJ\u000e\u0010\u0001\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010+J\u0007\u0010\u0001\u001a\u00020\u000bJ\r\u00105\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010+JF\u0010\u0001\u001a\u00030\u00012\u000e\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010K2\u0007\u0010\u0001\u001a\u00020\u000b2\u0007\u0010\u0001\u001a\u00020\u00062\b\u0010\u0001\u001a\u00030\u00012\u0010\u0010\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0001J\u0011\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u0006J4\u0010\u0001\u001a\u00030\u00012\u000e\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010K2\u0007\u0010\u0001\u001a\u00020\u000b2\u0007\u0010\u0001\u001a\u00020\u00062\b\u0010\u0001\u001a\u00030\u0001J\u0011\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020LJ\u0011\u0010\u0001\u001a\u00030\u00012\u0007\u0010 \u0001\u001a\u00020\u000bJ\u0011\u0010¡\u0001\u001a\u00030\u00012\u0007\u0010¢\u0001\u001a\u00020\u000bJ\u0011\u0010£\u0001\u001a\u00030\u00012\u0007\u0010¤\u0001\u001a\u00020\u000bJ\u0011\u0010¥\u0001\u001a\u00030\u00012\u0007\u0010¦\u0001\u001a\u00020\u000bJ\u0010\u0010§\u0001\u001a\u00030\u00012\u0006\u0010(\u001a\u00020\u000bJ\u0011\u0010¨\u0001\u001a\u00030\u00012\u0007\u0010©\u0001\u001a\u00020\u000bJ\u0011\u0010ª\u0001\u001a\u00030\u00012\u0007\u0010«\u0001\u001a\u00020\u000bJ\u0011\u0010¬\u0001\u001a\u00030\u00012\u0007\u0010­\u0001\u001a\u00020\u000bJ\u0011\u0010®\u0001\u001a\u00030\u00012\u0007\u0010 \u0001\u001a\u00020\u000bJ\u0011\u0010¯\u0001\u001a\u00030\u00012\u0007\u0010 \u0001\u001a\u00020\u000bJ\u0011\u0010°\u0001\u001a\u00030\u00012\u0007\u0010 \u0001\u001a\u00020\u000bJ\u0011\u0010±\u0001\u001a\u00030\u00012\u0007\u0010²\u0001\u001a\u00020\u000bJ\u0011\u0010³\u0001\u001a\u00030\u00012\u0007\u0010´\u0001\u001a\u00020\u000bJ\u0011\u0010µ\u0001\u001a\u00030\u00012\u0007\u0010 \u0001\u001a\u00020\u000bJ\u0011\u0010¶\u0001\u001a\u00030\u00012\u0007\u0010 \u0001\u001a\u00020\u000bJ\u0011\u0010·\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020LR\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001a\u0010\"\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u001e\u0010*\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010/\u001a\u000200X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010$\"\u0004\b9\u0010&R\u001a\u0010:\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\b\"\u0004\b<\u0010=R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\b\"\u0004\bF\u0010=R\u001a\u0010G\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\b\"\u0004\bI\u0010=R\u0014\u0010J\u001a\b\u0012\u0004\u0012\u00020L0KX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010N\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010$\"\u0004\bP\u0010&R\u001a\u0010Q\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010$\"\u0004\bS\u0010&R\u001a\u0010T\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\b\"\u0004\bV\u0010=R\u001a\u0010W\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\b\"\u0004\bY\u0010=R\u001a\u0010Z\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\b\"\u0004\b\\\u0010=R\u001a\u0010]\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010\u0004R\u000e\u0010a\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010d\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\b\"\u0004\bf\u0010=R\u000e\u0010g\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010i\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\b\"\u0004\bk\u0010=R\u001e\u0010l\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\bm\u0010+\"\u0004\bn\u0010-R\u001a\u0010o\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\b\"\u0004\bq\u0010=R\u001a\u0010r\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\b\"\u0004\bt\u0010=R\u000e\u0010u\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010v\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010$\"\u0004\bx\u0010&R\u001a\u0010y\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\b\"\u0004\b{\u0010=R\u001a\u0010|\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\b\"\u0004\b~\u0010=¨\u0006¹\u0001"}, d2 = {"Lcom/ss/android/vc/meeting/model/MeetingSpecificData;", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "_callingNoResponse", "Landroidx/lifecycle/MutableLiveData;", "", "_hasRingingAcceptClicked", "_isFirstRemoteAudioAdd", "_isRingingReceived", "_isRtcInterrupted", "byteConnectTimeEvent", "Lcom/ss/android/vc/statistics/event/ByteConnectTimeEvent;", "getByteConnectTimeEvent", "()Lcom/ss/android/vc/statistics/event/ByteConnectTimeEvent;", "setByteConnectTimeEvent", "(Lcom/ss/android/vc/statistics/event/ByteConnectTimeEvent;)V", "callSuccessEvent", "Lcom/ss/android/vc/statistics/event/CallSuccessEvent;", "getCallSuccessEvent", "()Lcom/ss/android/vc/statistics/event/CallSuccessEvent;", "setCallSuccessEvent", "(Lcom/ss/android/vc/statistics/event/CallSuccessEvent;)V", "callingNoResponse", "Landroidx/lifecycle/LiveData;", "getCallingNoResponse", "()Landroidx/lifecycle/LiveData;", "hasRingingAcceptClicked", "getHasRingingAcceptClicked", "hasScreenLocked", "getHasScreenLocked", "()Z", "setHasScreenLocked", "(Z)V", "isFirstRemoteAudioAdd", "isRingingReceived", "isRtcInterrupted", "isVoiceOnlyAccept", "()Ljava/lang/Boolean;", "setVoiceOnlyAccept", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "joinToStreamEvent", "Lcom/ss/android/vc/statistics/event/JoinToStreamEvent;", "getJoinToStreamEvent", "()Lcom/ss/android/vc/statistics/event/JoinToStreamEvent;", "setJoinToStreamEvent", "(Lcom/ss/android/vc/statistics/event/JoinToStreamEvent;)V", "lowConfigTipsShowed", "mAudioMuted", "mAutoShareScreen", "getMAutoShareScreen", "setMAutoShareScreen", "mBizShareScreenDeviceId", "getMBizShareScreenDeviceId", "setMBizShareScreenDeviceId", "(Ljava/lang/String;)V", "mBizShareScreenType", "Lcom/ss/android/vc/entity/ParticipantType;", "getMBizShareScreenType", "()Lcom/ss/android/vc/entity/ParticipantType;", "setMBizShareScreenType", "(Lcom/ss/android/vc/entity/ParticipantType;)V", "mBizShareScreenUid", "getMBizShareScreenUid", "setMBizShareScreenUid", "mChannelName", "getMChannelName", "setMChannelName", "mDataChangListeners", "", "Lcom/ss/android/vc/meeting/model/MeetingSpecificData$OnMeetingDataChangeListener;", "mHasShownPermission", "mIsFrontCamera", "getMIsFrontCamera", "setMIsFrontCamera", "mIsLocalShareToRoom", "getMIsLocalShareToRoom", "setMIsLocalShareToRoom", "mLastActiveSpeakerRtcJoinId", "getMLastActiveSpeakerRtcJoinId", "setMLastActiveSpeakerRtcJoinId", "mLocalDeviceId", "getMLocalDeviceId", "setMLocalDeviceId", "mLocalUid", "getMLocalUid", "setMLocalUid", "mMeeting", "getMMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "setMMeeting", "mPendingOpenCamera", "mPlayInOutMeetingTone", "mPlaybackDigitalMute", "mPreActiveSpeakerRtcJoinId", "getMPreActiveSpeakerRtcJoinId", "setMPreActiveSpeakerRtcJoinId", "mRemoteAudioMuted", "mRemoteVideoMuted", "mShareScreenRtcId", "getMShareScreenRtcId", "setMShareScreenRtcId", "mSpeakerMuted", "getMSpeakerMuted", "setMSpeakerMuted", "mToken", "getMToken", "setMToken", "mTopic", "getMTopic", "setMTopic", "mVideoMuted", "noResponseHandled", "getNoResponseHandled", "setNoResponseHandled", "remoteDeviceId", "getRemoteDeviceId", "setRemoteDeviceId", "remoteUid", "getRemoteUid", "setRemoteUid", "clear", "", "getHasShownPermission", "initData", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "initShareScreenRtcJoinId", "initUserInfo", "id", "remoteId", "isAudioMuted", "isFrontCamera", "isPendingOpenCamera", "isPlayInOutMeetingTone", "isPlaybackDigitalMute", "isRemoteAudioMuted", "isRemoteVideoMuted", "isShareScreen", "isSpeakerMuted", "isVideoMuted", "onParticipantChange", "sortedParticipants", "Lcom/ss/android/vc/entity/Participant;", "hasValidAS", "asRtcJoinId", "triggerType", "Lcom/ss/android/vc/meeting/module/multi/gridcontent/TriggerType;", "newEnterParticipants", "Ljava/util/HashSet;", "putCurrentActiveSpeaker", "registerMeetingDataChangeListener", "listener", "setAudioMuted", "muted", "setCamera", "isFront", "setHasShownPermission", "hasShown", "setIsFirstRemoteAudioAdd", "hasAdd", "setIsRingingReceived", "setLowConfigTipsShowed", "showed", "setPendingOpenCamera", "open", "setPlayInOutMeetingTone", "play", "setPlaybackDigitalMute", "setRemoteAudioMuted", "setRemoteVideoMuted", "setRingingAcceptClicked", "hasAcceptClicked", "setRtcInterrupted", "isInterrupted", "setSpeakerMuted", "setVideoMuted", "unregisterMeetingDataChangeListener", "OnMeetingDataChangeListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.model.e */
public class MeetingSpecificData {

    /* renamed from: A */
    private String f153838A;

    /* renamed from: B */
    private String f153839B;

    /* renamed from: C */
    private ParticipantType f153840C;

    /* renamed from: D */
    private final List<OnMeetingDataChangeListener> f153841D;

    /* renamed from: E */
    private C63754d f153842E;

    /* renamed from: F */
    private C63731ab f153843F;

    /* renamed from: G */
    private C63764m f153844G;

    /* renamed from: H */
    private final C1177w<Boolean> f153845H;

    /* renamed from: I */
    private final LiveData<Boolean> f153846I;

    /* renamed from: J */
    private final LiveData<Boolean> f153847J;

    /* renamed from: K */
    private final C1177w<Boolean> f153848K;

    /* renamed from: L */
    private final LiveData<Boolean> f153849L;

    /* renamed from: M */
    private final C1177w<Boolean> f153850M;

    /* renamed from: N */
    private final LiveData<Boolean> f153851N;

    /* renamed from: O */
    private boolean f153852O;

    /* renamed from: P */
    private boolean f153853P;

    /* renamed from: Q */
    private final C1177w<Boolean> f153854Q;

    /* renamed from: R */
    private final LiveData<Boolean> f153855R;

    /* renamed from: S */
    private boolean f153856S;

    /* renamed from: a */
    public final C1177w<Boolean> f153857a;

    /* renamed from: b */
    private final String f153858b = "MeetingSpecificData";

    /* renamed from: c */
    private C61303k f153859c;

    /* renamed from: d */
    private String f153860d;

    /* renamed from: e */
    private String f153861e;

    /* renamed from: f */
    private String f153862f;

    /* renamed from: g */
    private volatile boolean f153863g;

    /* renamed from: h */
    private volatile boolean f153864h;

    /* renamed from: i */
    private volatile Boolean f153865i;

    /* renamed from: j */
    private volatile boolean f153866j;

    /* renamed from: k */
    private volatile boolean f153867k;

    /* renamed from: l */
    private boolean f153868l;

    /* renamed from: m */
    private volatile boolean f153869m;

    /* renamed from: n */
    private String f153870n;

    /* renamed from: o */
    private volatile String f153871o;

    /* renamed from: p */
    private String f153872p;

    /* renamed from: q */
    private String f153873q;

    /* renamed from: r */
    private String f153874r;

    /* renamed from: s */
    private String f153875s;

    /* renamed from: t */
    private String f153876t;

    /* renamed from: u */
    private volatile boolean f153877u;

    /* renamed from: v */
    private Boolean f153878v;

    /* renamed from: w */
    private volatile boolean f153879w;

    /* renamed from: x */
    private volatile boolean f153880x;

    /* renamed from: y */
    private volatile boolean f153881y;

    /* renamed from: z */
    private boolean f153882z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J>\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000bH&J.\u0010\u0013\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/vc/meeting/model/MeetingSpecificData$OnMeetingDataChangeListener;", "", "onActiveSpeakerChanged", "", "rtcJoinId", "", "onParticipantChange", "sortedParticipants", "", "Lcom/ss/android/vc/entity/Participant;", "hasValidAS", "", "asRtcJoinId", "triggerType", "Lcom/ss/android/vc/meeting/module/multi/gridcontent/TriggerType;", "newEnterParticipants", "Ljava/util/HashSet;", "onVideoMute", "muted", "onVideoSort", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.model.e$a */
    public interface OnMeetingDataChangeListener {
        /* renamed from: a */
        void mo212577a(String str);

        /* renamed from: a */
        void mo212578a(List<Participant> list, boolean z, String str, TriggerType triggerType);

        /* renamed from: a */
        void mo212579a(List<Participant> list, boolean z, String str, TriggerType triggerType, HashSet<String> hashSet);

        void j_(boolean z);
    }

    /* renamed from: A */
    public final boolean mo212504A() {
        return this.f153863g;
    }

    /* renamed from: B */
    public final boolean mo212505B() {
        return this.f153864h;
    }

    /* renamed from: C */
    public final boolean mo212506C() {
        return this.f153867k;
    }

    /* renamed from: D */
    public final boolean mo212507D() {
        return this.f153866j;
    }

    /* renamed from: E */
    public final Boolean mo212508E() {
        return this.f153865i;
    }

    /* renamed from: F */
    public final boolean mo212509F() {
        return this.f153882z;
    }

    /* renamed from: G */
    public final boolean mo212510G() {
        return this.f153881y;
    }

    /* renamed from: I */
    public final boolean mo212512I() {
        return this.f153868l;
    }

    /* renamed from: J */
    public final boolean mo212513J() {
        return this.f153877u;
    }

    /* renamed from: M */
    public final boolean mo212516M() {
        return this.f153869m;
    }

    /* renamed from: a */
    public final C61303k mo212517a() {
        return this.f153859c;
    }

    /* renamed from: b */
    public final String mo212527b() {
        return this.f153861e;
    }

    /* renamed from: c */
    public final String mo212531c() {
        return this.f153862f;
    }

    /* renamed from: d */
    public final String mo212534d() {
        return this.f153870n;
    }

    /* renamed from: e */
    public final String mo212537e() {
        return this.f153871o;
    }

    /* renamed from: f */
    public final String mo212540f() {
        return this.f153872p;
    }

    /* renamed from: g */
    public final String mo212543g() {
        return this.f153873q;
    }

    /* renamed from: h */
    public final String mo212546h() {
        return this.f153875s;
    }

    /* renamed from: i */
    public final String mo212548i() {
        return this.f153876t;
    }

    /* renamed from: j */
    public final Boolean mo212550j() {
        return this.f153878v;
    }

    /* renamed from: m */
    public String mo212556m() {
        return this.f153838A;
    }

    /* renamed from: n */
    public String mo212558n() {
        return this.f153839B;
    }

    /* renamed from: o */
    public ParticipantType mo212560o() {
        return this.f153840C;
    }

    /* renamed from: p */
    public final C63754d mo212562p() {
        return this.f153842E;
    }

    /* renamed from: q */
    public final C63731ab mo212564q() {
        return this.f153843F;
    }

    /* renamed from: r */
    public final C63764m mo212566r() {
        return this.f153844G;
    }

    /* renamed from: s */
    public final LiveData<Boolean> mo212568s() {
        return this.f153846I;
    }

    /* renamed from: t */
    public final LiveData<Boolean> mo212570t() {
        return this.f153847J;
    }

    /* renamed from: u */
    public final LiveData<Boolean> mo212571u() {
        return this.f153849L;
    }

    /* renamed from: v */
    public final LiveData<Boolean> mo212572v() {
        return this.f153851N;
    }

    /* renamed from: w */
    public final boolean mo212573w() {
        return this.f153852O;
    }

    /* renamed from: x */
    public final boolean mo212574x() {
        return this.f153853P;
    }

    /* renamed from: y */
    public final LiveData<Boolean> mo212575y() {
        return this.f153855R;
    }

    /* renamed from: L */
    public final Boolean mo212515L() {
        return Boolean.valueOf(this.f153856S);
    }

    /* renamed from: k */
    public final boolean mo212553k() {
        return this.f153879w;
    }

    /* renamed from: l */
    public final boolean mo212555l() {
        return this.f153880x;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.model.e$c */
    public static final class RunnableC61385c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingSpecificData f153884a;

        RunnableC61385c(MeetingSpecificData eVar) {
            this.f153884a = eVar;
        }

        public final void run() {
            this.f153884a.f153857a.mo5929b((Boolean) true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.model.e$b */
    static final class RunnableC61384b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingSpecificData f153883a;

        RunnableC61384b(MeetingSpecificData eVar) {
            this.f153883a = eVar;
        }

        public final void run() {
            ActiveSpeakerCalculator w = this.f153883a.mo212517a().mo212163w();
            if (w != null) {
                w.mo219602a((ActiveSpeakerCalculator.ActiveSpeakerSpeakListener) null);
            }
        }
    }

    /* renamed from: H */
    public final boolean mo212511H() {
        if (TextUtils.isEmpty(mo212556m()) || TextUtils.isEmpty(mo212558n())) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public final void mo212514K() {
        C60700b.m235851b(this.f153858b, "[clear]", "clear");
        this.f153841D.clear();
        C26171w.m94675a(new RunnableC61384b(this));
    }

    /* renamed from: z */
    public final void mo212576z() {
        String str;
        if (!mo212511H()) {
            this.f153870n = "";
            return;
        }
        String str2 = this.f153858b;
        C60700b.m235851b(str2, "[initShareScreenRtcJoinId]", "mBizShareScreenUid: " + mo212558n() + ", mBizShareScreenDeviceId: " + mo212556m());
        this.f153870n = mo212556m();
        try {
            C61383d I = this.f153859c.mo212091I();
            Intrinsics.checkExpressionValueIsNotNull(I, "mMeeting.meetingData");
            Participant a = I.mo212494b().mo212589a(mo212558n(), mo212560o(), mo212556m());
            String str3 = this.f153858b;
            StringBuilder sb = new StringBuilder();
            sb.append("share participant rtcJoinId: ");
            if (a != null) {
                str = a.getRtcJoinId();
            } else {
                str = null;
            }
            sb.append(str);
            C60700b.m235851b(str3, "[initShareScreenRtcJoinId2]", sb.toString());
            if (a != null) {
                String rtcJoinId = a.getRtcJoinId();
                Intrinsics.checkExpressionValueIsNotNull(rtcJoinId, "it.rtcJoinId");
                this.f153870n = rtcJoinId;
            }
        } catch (Exception e) {
            C60700b.m235864f(this.f153858b, "[initShareScreenRtcJoinId3]", String.valueOf(e.getMessage()));
        }
    }

    /* renamed from: k */
    public final void mo212552k(boolean z) {
        this.f153881y = z;
    }

    /* renamed from: l */
    public final void mo212554l(boolean z) {
        this.f153868l = z;
    }

    /* renamed from: a */
    public void mo212518a(ParticipantType participantType) {
        this.f153840C = participantType;
    }

    /* renamed from: b */
    public final void mo212529b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f153870n = str;
    }

    /* renamed from: c */
    public void mo212532c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f153874r = str;
    }

    /* renamed from: d */
    public final void mo212535d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f153876t = str;
    }

    /* renamed from: e */
    public void mo212538e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f153838A = str;
    }

    /* renamed from: f */
    public void mo212541f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f153839B = str;
    }

    /* renamed from: g */
    public final void mo212545g(boolean z) {
        this.f153867k = z;
    }

    /* renamed from: h */
    public final void mo212547h(boolean z) {
        this.f153866j = z;
    }

    /* renamed from: i */
    public final void mo212549i(boolean z) {
        this.f153865i = Boolean.valueOf(z);
    }

    /* renamed from: j */
    public final void mo212551j(boolean z) {
        this.f153882z = z;
    }

    /* renamed from: m */
    public final void mo212557m(boolean z) {
        this.f153877u = z;
    }

    /* renamed from: r */
    public final void mo212567r(boolean z) {
        this.f153856S = z;
    }

    /* renamed from: s */
    public final void mo212569s(boolean z) {
        this.f153869m = z;
    }

    /* renamed from: a */
    public final void mo212521a(Boolean bool) {
        this.f153878v = bool;
    }

    /* renamed from: b */
    public final void mo212528b(OnMeetingDataChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f153841D.remove(aVar);
    }

    /* renamed from: c */
    public final void mo212533c(boolean z) {
        this.f153852O = z;
    }

    /* renamed from: d */
    public final void mo212536d(boolean z) {
        this.f153853P = z;
    }

    /* renamed from: f */
    public final void mo212542f(boolean z) {
        this.f153864h = z;
        CheckMuteStateConflictUtil.f160383a.mo219628c(this.f153859c);
    }

    /* renamed from: o */
    public final void mo212561o(boolean z) {
        this.f153850M.mo5929b(Boolean.valueOf(z));
    }

    /* renamed from: p */
    public final void mo212563p(boolean z) {
        this.f153848K.mo5929b(Boolean.valueOf(z));
    }

    /* renamed from: q */
    public final void mo212565q(boolean z) {
        this.f153854Q.mo5926a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo212520a(OnMeetingDataChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        if (!C60752f.m236080a(aVar) && !this.f153841D.contains(aVar)) {
            this.f153841D.add(aVar);
        }
    }

    /* renamed from: b */
    public final void mo212530b(boolean z) {
        this.f153880x = z;
    }

    /* renamed from: e */
    public final void mo212539e(boolean z) {
        this.f153863g = z;
        for (OnMeetingDataChangeListener aVar : this.f153841D) {
            aVar.j_(z);
        }
        CheckMuteStateConflictUtil.f160383a.mo219629d(this.f153859c);
    }

    /* renamed from: n */
    public final void mo212559n(boolean z) {
        this.f153845H.mo5926a(Boolean.valueOf(z));
        C26171w.m94676a(new RunnableC61385c(this), 16000);
    }

    /* renamed from: a */
    public final void mo212522a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f153861e = str;
    }

    /* renamed from: a */
    public final void mo212519a(VideoChat videoChat) {
        String str;
        Intrinsics.checkParameterIsNotNull(videoChat, "videoChat");
        C60700b.m235851b(this.f153858b, "[initData]", "initData");
        String zoomUserId = videoChat.getZoomUserId();
        Intrinsics.checkExpressionValueIsNotNull(zoomUserId, "videoChat.zoomUserId");
        mo212532c(zoomUserId);
        String zoomMeetNumber = videoChat.getZoomMeetNumber();
        Intrinsics.checkExpressionValueIsNotNull(zoomMeetNumber, "videoChat.zoomMeetNumber");
        this.f153871o = zoomMeetNumber;
        String zoomUserToken = videoChat.getZoomUserToken();
        Intrinsics.checkExpressionValueIsNotNull(zoomUserToken, "videoChat.zoomUserToken");
        this.f153872p = zoomUserToken;
        VideoChatSettings videoChatSettings = videoChat.getVideoChatSettings();
        if (videoChatSettings == null || (str = videoChatSettings.getTopic()) == null) {
            str = "";
        }
        this.f153860d = str;
        String b = ParticipantUtil.m248728b(this.f153859c);
        Intrinsics.checkExpressionValueIsNotNull(b, "ParticipantUtil.getSelfRtcJoinId(mMeeting)");
        this.f153862f = b;
        this.f153861e = b;
    }

    /* renamed from: g */
    public final void mo212544g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "asRtcJoinId");
        String str2 = str;
        if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str2, this.f153862f)) {
            this.f153861e = this.f153862f;
            this.f153862f = str;
            String str3 = this.f153858b;
            C60700b.m235851b(str3, "[putCurrentActiveSpeaker]", "New As 1: " + this.f153862f);
            for (OnMeetingDataChangeListener aVar : this.f153841D) {
                aVar.mo212577a(this.f153862f);
            }
        }
    }

    public MeetingSpecificData(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f153859c = kVar;
        this.f153860d = "";
        this.f153861e = "";
        this.f153862f = "";
        this.f153868l = true;
        this.f153870n = "";
        this.f153871o = "";
        this.f153872p = "";
        this.f153873q = "";
        this.f153874r = "";
        this.f153875s = "";
        this.f153876t = "";
        this.f153877u = true;
        this.f153838A = "";
        this.f153839B = "";
        this.f153841D = new CopyOnWriteArrayList();
        this.f153842E = new C63754d();
        this.f153843F = new C63731ab();
        this.f153844G = new C63764m();
        C1177w<Boolean> wVar = new C1177w<>();
        this.f153845H = wVar;
        this.f153846I = wVar;
        C1177w<Boolean> wVar2 = new C1177w<>();
        this.f153857a = wVar2;
        this.f153847J = wVar2;
        C1177w<Boolean> wVar3 = new C1177w<>();
        this.f153848K = wVar3;
        this.f153849L = wVar3;
        C1177w<Boolean> wVar4 = new C1177w<>();
        this.f153850M = wVar4;
        this.f153851N = wVar4;
        C1177w<Boolean> wVar5 = new C1177w<>();
        this.f153854Q = wVar5;
        this.f153855R = wVar5;
    }

    /* renamed from: a */
    public final void mo212526a(boolean z) {
        this.f153879w = z;
    }

    /* renamed from: a */
    public final void mo212523a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "remoteId");
        String str3 = this.f153858b;
        C60700b.m235851b(str3, "[initUserInfo]", "id=" + str + " remoteId=" + str2);
        this.f153873q = str;
        String b = VideoChatModuleDependency.m236629b();
        Intrinsics.checkExpressionValueIsNotNull(b, "VideoChatModuleDependency.getDeviceId()");
        mo212532c(b);
        this.f153875s = str2;
        mo212539e(this.f153859c.mo212166z());
        mo212542f(false);
        mo212547h(false);
        mo212545g(false);
    }

    /* renamed from: a */
    public final void mo212524a(List<Participant> list, boolean z, String str, TriggerType triggerType) {
        Intrinsics.checkParameterIsNotNull(list, "sortedParticipants");
        Intrinsics.checkParameterIsNotNull(str, "asRtcJoinId");
        Intrinsics.checkParameterIsNotNull(triggerType, "triggerType");
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.equals(str2, this.f153862f)) {
                this.f153861e = this.f153862f;
                this.f153862f = str;
                String str3 = this.f153858b;
                C60700b.m235851b(str3, "[putCurrentActiveSpeaker]", "New As 2: " + this.f153862f);
                for (OnMeetingDataChangeListener aVar : this.f153841D) {
                    aVar.mo212577a(this.f153862f);
                }
            }
            for (OnMeetingDataChangeListener aVar2 : this.f153841D) {
                aVar2.mo212578a(list, z, str, triggerType);
            }
        }
    }

    /* renamed from: a */
    public final void mo212525a(List<Participant> list, boolean z, String str, TriggerType triggerType, HashSet<String> hashSet) {
        Intrinsics.checkParameterIsNotNull(list, "sortedParticipants");
        Intrinsics.checkParameterIsNotNull(str, "asRtcJoinId");
        Intrinsics.checkParameterIsNotNull(triggerType, "triggerType");
        for (OnMeetingDataChangeListener aVar : this.f153841D) {
            aVar.mo212579a(list, z, str, triggerType, hashSet);
        }
    }
}
