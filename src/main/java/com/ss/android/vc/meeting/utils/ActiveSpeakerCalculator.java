package com.ss.android.vc.meeting.utils;

import android.text.TextUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.entity.ActiveUserConfig;
import com.ss.android.vc.entity.C60938g;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VcVideoSortConfig;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.irtc.RtcAudioVolumeInfo;
import com.ss.android.vc.meeting.framework.manager.C61282e;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.multi.gridcontent.TriggerType;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0006\u0018\u0000 Y2\u00020\u0001:\u0003WXYB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J;\u00103\u001a\u0002042\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u001806j\b\u0012\u0004\u0012\u00020\u0018`72\f\u00108\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u0010;\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010<J \u0010=\u001a\u0002042\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u001806j\b\u0012\u0004\u0012\u00020\u0018`7H\u0002J\u0016\u0010>\u001a\u0002042\f\u0010?\u001a\b\u0012\u0004\u0012\u00020:0@H\u0002J\u0016\u0010A\u001a\u0002042\f\u0010?\u001a\b\u0012\u0004\u0012\u00020:0@H\u0002J\b\u0010B\u001a\u000204H\u0002J\u0010\u0010C\u001a\u00020\f2\u0006\u0010D\u001a\u00020\u0006H\u0002J\u0010\u0010E\u001a\u00020\f2\u0006\u0010D\u001a\u00020\u0006H\u0002J\u0006\u0010F\u001a\u000204J\u0006\u0010G\u001a\u000204J\u0019\u0010H\u001a\u0002042\f\u00108\u001a\b\u0012\u0004\u0012\u00020I09¢\u0006\u0002\u0010JJ\b\u0010K\u001a\u000204H\u0002J\u0018\u0010L\u001a\u0002042\u0006\u0010D\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\fH\u0002J\u0018\u0010N\u001a\u0002042\u0006\u0010D\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\fH\u0002J\u0010\u0010O\u001a\u0002042\u0006\u0010P\u001a\u00020QH\u0002J.\u0010R\u001a\u0002042\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00060T2\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u001806j\b\u0012\u0004\u0012\u00020\u0018`7H\u0002J9\u0010U\u001a\b\u0012\u0004\u0012\u00020:092\f\u00108\u001a\b\u0012\u0004\u0012\u00020I092\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u001806j\b\u0012\u0004\u0012\u00020\u0018`7H\u0002¢\u0006\u0002\u0010VR\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR6\u0010\t\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nj\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b`\rX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R*\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\nj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013`\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R6\u0010*\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nj\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b`\rX\u000e¢\u0006\u0002\n\u0000R8\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,0\nj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,`\r8FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006Z"}, d2 = {"Lcom/ss/android/vc/meeting/utils/ActiveSpeakerCalculator;", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "mASCountMap", "Ljava/util/HashMap;", "Ljava/util/LinkedList;", "", "Lkotlin/collections/HashMap;", "mASLRUCache", "Lcom/ss/android/vc/meeting/utils/FindableLRUCache;", "mAsRtcJoinId", "mCount", "mGridSortScoreMap", "", "mHasValidAS", "", "mSortedParticipants", "", "Lcom/ss/android/vc/entity/Participant;", "getMSortedParticipants", "()Ljava/util/List;", "setMSortedParticipants", "(Ljava/util/List;)V", "value", "Lcom/ss/android/vc/meeting/utils/ActiveSpeakerCalculator$ActiveSpeakerListener;", "mSpeakListener", "getMSpeakListener", "()Lcom/ss/android/vc/meeting/utils/ActiveSpeakerCalculator$ActiveSpeakerListener;", "setMSpeakListener", "(Lcom/ss/android/vc/meeting/utils/ActiveSpeakerCalculator$ActiveSpeakerListener;)V", "mSpeakerSpeakListener", "Lcom/ss/android/vc/meeting/utils/ActiveSpeakerCalculator$ActiveSpeakerSpeakListener;", "getMSpeakerSpeakListener", "()Lcom/ss/android/vc/meeting/utils/ActiveSpeakerCalculator$ActiveSpeakerSpeakListener;", "setMSpeakerSpeakListener", "(Lcom/ss/android/vc/meeting/utils/ActiveSpeakerCalculator$ActiveSpeakerSpeakListener;)V", "mTimeMap", "mWeightMap", "", "getMWeightMap", "()Ljava/util/HashMap;", "setMWeightMap", "(Ljava/util/HashMap;)V", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "calculateActiveSpeaker", "", "validParticipants", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "speaker", "", "Lcom/ss/android/vc/meeting/utils/VideoSortInfo;", "isOpen", "(Ljava/util/ArrayList;[Lcom/ss/android/vc/meeting/utils/VideoSortInfo;Z)V", "calculateGridSortScore", "checkAndCreateASCountMap", "list", "", "checkAndCreateTimeMap", "dumpTimeMap", "getASCountTime", "rtcJoinId", "getTime", "onInMeetingInfoUpdate", "onPageInit", "onTick", "Lcom/ss/android/vc/irtc/RtcAudioVolumeInfo;", "([Lcom/ss/android/vc/irtc/RtcAudioVolumeInfo;)V", "processCornerCase", "putASCount", "active", "putTime", "sortParticipantsAndNotify", "triggerType", "Lcom/ss/android/vc/meeting/module/multi/gridcontent/TriggerType;", "sortParticipantsBySortScore", "onTheCallParticipantSet", "", "traverseSpeakerArray", "([Lcom/ss/android/vc/irtc/RtcAudioVolumeInfo;Ljava/util/ArrayList;)[Lcom/ss/android/vc/meeting/utils/VideoSortInfo;", "ActiveSpeakerListener", "ActiveSpeakerSpeakListener", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.utils.a */
public final class ActiveSpeakerCalculator {

    /* renamed from: c */
    public static ActiveUserConfig f160349c = new ActiveUserConfig();

    /* renamed from: d */
    public static final Companion f160350d = new Companion(null);

    /* renamed from: p */
    private static VcVideoSortConfig f160351p = new VcVideoSortConfig();

    /* renamed from: a */
    public boolean f160352a;

    /* renamed from: b */
    public String f160353b;

    /* renamed from: e */
    private final String f160354e = "ActiveSpeakerCalculator";

    /* renamed from: f */
    private HashMap<String, LinkedList<Integer>> f160355f = new HashMap<>();

    /* renamed from: g */
    private HashMap<String, LinkedList<Integer>> f160356g = new HashMap<>();

    /* renamed from: h */
    private final C63486c<String, String> f160357h = new C63486c<>(5);

    /* renamed from: i */
    private HashMap<String, Float> f160358i = new HashMap<>();

    /* renamed from: j */
    private List<Participant> f160359j = new LinkedList();

    /* renamed from: k */
    private int f160360k = 0;

    /* renamed from: l */
    private HashMap<String, Double> f160361l = new HashMap<>();

    /* renamed from: m */
    private ActiveSpeakerListener f160362m;

    /* renamed from: n */
    private ActiveSpeakerSpeakListener f160363n;

    /* renamed from: o */
    private final C61303k f160364o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J.\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&JF\u0010\r\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000fj\b\u0012\u0004\u0012\u00020\u0005`\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/meeting/utils/ActiveSpeakerCalculator$ActiveSpeakerListener;", "", "onGetLatestAs", "", "asRtcJoinId", "", "sortedParticipants", "", "Lcom/ss/android/vc/entity/Participant;", "hasValidAS", "", "triggerType", "Lcom/ss/android/vc/meeting/module/multi/gridcontent/TriggerType;", "onParticipantChange", "newEnterParticipants", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.a$a */
    public interface ActiveSpeakerListener {
        /* renamed from: a */
        void mo212171a(String str);

        /* renamed from: a */
        void mo212172a(List<Participant> list, boolean z, String str, TriggerType triggerType);

        /* renamed from: a */
        void mo212173a(List<Participant> list, boolean z, String str, TriggerType triggerType, HashSet<String> hashSet);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/meeting/utils/ActiveSpeakerCalculator$ActiveSpeakerSpeakListener;", "", "onAsSpeakChanged", "", "asRtcJoinId", "", "isSpeaking", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.a$b */
    public interface ActiveSpeakerSpeakListener {
        /* renamed from: a */
        void mo215966a(String str, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/meeting/utils/ActiveSpeakerCalculator$Companion;", "", "()V", "RTC_MIN_VOLUME", "", "asConfig", "Lcom/ss/android/vc/entity/ActiveUserConfig;", "videoSortConfig", "Lcom/ss/android/vc/entity/VcVideoSortConfig;", "getASConfig", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.a$c */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final ActiveUserConfig mo219614a() {
            return ActiveSpeakerCalculator.f160349c;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final List<Participant> mo219600a() {
        return this.f160359j;
    }

    /* renamed from: c */
    public final ActiveSpeakerListener mo219609c() {
        return this.f160362m;
    }

    /* renamed from: d */
    public final ActiveSpeakerSpeakListener mo219610d() {
        return this.f160363n;
    }

    /* renamed from: a */
    public final void mo219606a(RtcAudioVolumeInfo[] rtcAudioVolumeInfoArr) {
        Intrinsics.checkParameterIsNotNull(rtcAudioVolumeInfoArr, "speaker");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C61383d I = this.f160364o.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        C61388g b = I.mo212494b();
        Intrinsics.checkExpressionValueIsNotNull(b, "meeting.meetingData.participantData");
        objectRef.element = (T) new HashSet(b.mo212606k().keySet());
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        C61383d I2 = this.f160364o.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I2, "meeting.meetingData");
        C61388g b2 = I2.mo212494b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "meeting.meetingData.participantData");
        objectRef2.element = (T) new ArrayList(b2.mo212600e());
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        AbsBreakoutRoomControl al = this.f160364o.al();
        Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
        booleanRef.element = al.mo213181h();
        C60735ab.m236016d(new RunnableC63481f(this, rtcAudioVolumeInfoArr, objectRef2, booleanRef, objectRef));
    }

    /* renamed from: a */
    public final VideoSortInfo[] mo219607a(RtcAudioVolumeInfo[] rtcAudioVolumeInfoArr, ArrayList<Participant> arrayList) {
        ParticipantSettings participantSettings;
        ArrayList arrayList2 = new ArrayList();
        for (RtcAudioVolumeInfo rtcAudioVolumeInfo : rtcAudioVolumeInfoArr) {
            C61383d I = this.f160364o.mo212091I();
            Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
            Participant participant = I.mo212494b().f153887a.get(rtcAudioVolumeInfo.f152887a);
            if (C60752f.m236080a(participant)) {
                participant = ParticipantUtil.m248703a(rtcAudioVolumeInfo.f152887a, arrayList);
            }
            if (!C60752f.m236080a(participant) && !C60938g.m237062b(participant)) {
                ParticipantSettings participantSettings2 = participant.getParticipantSettings();
                Intrinsics.checkExpressionValueIsNotNull(participantSettings2, "participant.participantSettings");
                String str = rtcAudioVolumeInfo.f152887a;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.uid");
                arrayList2.add(new VideoSortInfo(str, !participantSettings2.isCameraMuted(), rtcAudioVolumeInfo));
            }
            if (rtcAudioVolumeInfo.f152889c > f160349c.getMinSpeakerVolume() && participant != null && (participantSettings = participant.getParticipantSettings()) != null && participantSettings.isMicrophoneMuted()) {
                CheckMuteStateConflictUtil bVar = CheckMuteStateConflictUtil.f160383a;
                VideoChat e = this.f160364o.mo212056e();
                Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
                String deviceId = participant.getDeviceId();
                Intrinsics.checkExpressionValueIsNotNull(deviceId, "participant.deviceId");
                bVar.mo219623a(e, deviceId);
            }
        }
        Object[] array = arrayList2.toArray(new VideoSortInfo[0]);
        if (array != null) {
            return (VideoSortInfo[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: e */
    public final void mo219611e() {
        m248765a(TriggerType.PUSH);
    }

    /* renamed from: f */
    public final void mo219612f() {
        m248765a(TriggerType.INIT);
    }

    /* renamed from: b */
    public final HashMap<String, Double> mo219608b() {
        return new HashMap<>(this.f160361l);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.a$e */
    public static final class RunnableC63480e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ActiveSpeakerCalculator f160365a;

        /* renamed from: b */
        final /* synthetic */ Ref.IntRef f160366b;

        RunnableC63480e(ActiveSpeakerCalculator aVar, Ref.IntRef intRef) {
            this.f160365a = aVar;
            this.f160366b = intRef;
        }

        public final void run() {
            boolean z;
            ActiveSpeakerSpeakListener d = this.f160365a.mo219610d();
            if (d != null) {
                String str = this.f160365a.f160353b;
                if (this.f160366b.element > ActiveSpeakerCalculator.f160349c.getMinSpeakerVolume()) {
                    z = true;
                } else {
                    z = false;
                }
                d.mo215966a(str, z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.a$f */
    static final class RunnableC63481f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ActiveSpeakerCalculator f160367a;

        /* renamed from: b */
        final /* synthetic */ RtcAudioVolumeInfo[] f160368b;

        /* renamed from: c */
        final /* synthetic */ Ref.ObjectRef f160369c;

        /* renamed from: d */
        final /* synthetic */ Ref.BooleanRef f160370d;

        /* renamed from: e */
        final /* synthetic */ Ref.ObjectRef f160371e;

        RunnableC63481f(ActiveSpeakerCalculator aVar, RtcAudioVolumeInfo[] rtcAudioVolumeInfoArr, Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef2) {
            this.f160367a = aVar;
            this.f160368b = rtcAudioVolumeInfoArr;
            this.f160369c = objectRef;
            this.f160370d = booleanRef;
            this.f160371e = objectRef2;
        }

        public final void run() {
            this.f160367a.mo219604a(this.f160369c.element, this.f160367a.mo219607a(this.f160368b, this.f160369c.element), this.f160370d.element);
            this.f160367a.mo219603a((ArrayList<Participant>) this.f160369c.element);
            this.f160367a.mo219605a(this.f160371e.element, this.f160369c.element);
            this.f160367a.mo219613g();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) new LinkedList();
            if (!this.f160367a.mo219600a().isEmpty()) {
                objectRef.element.addAll(this.f160367a.mo219600a());
            }
            C26171w.m94675a(new Runnable(this) {
                /* class com.ss.android.vc.meeting.utils.ActiveSpeakerCalculator.RunnableC63481f.RunnableC634821 */

                /* renamed from: a */
                final /* synthetic */ RunnableC63481f f160372a;

                {
                    this.f160372a = r1;
                }

                public final void run() {
                    ActiveSpeakerListener c = this.f160372a.f160367a.mo219609c();
                    if (c != null) {
                        c.mo212172a(objectRef.element, this.f160372a.f160367a.f160352a, this.f160372a.f160367a.f160353b, TriggerType.TICK);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.a$g */
    public static final class RunnableC63483g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ActiveSpeakerCalculator f160374a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f160375b;

        /* renamed from: c */
        final /* synthetic */ Ref.ObjectRef f160376c;

        /* renamed from: d */
        final /* synthetic */ Ref.ObjectRef f160377d;

        /* renamed from: e */
        final /* synthetic */ TriggerType f160378e;

        RunnableC63483g(ActiveSpeakerCalculator aVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, TriggerType triggerType) {
            this.f160374a = aVar;
            this.f160375b = objectRef;
            this.f160376c = objectRef2;
            this.f160377d = objectRef3;
            this.f160378e = triggerType;
        }

        public final void run() {
            this.f160374a.mo219603a((ArrayList<Participant>) this.f160375b.element);
            this.f160374a.mo219605a(this.f160376c.element, this.f160375b.element);
            this.f160374a.mo219613g();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) new LinkedList();
            if (!this.f160374a.mo219600a().isEmpty()) {
                objectRef.element.addAll(this.f160374a.mo219600a());
            }
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) new HashSet();
            if (!this.f160377d.element.isEmpty()) {
                objectRef2.element.addAll(this.f160377d.element);
            }
            C60735ab.m236001a(new Runnable(this) {
                /* class com.ss.android.vc.meeting.utils.ActiveSpeakerCalculator.RunnableC63483g.RunnableC634841 */

                /* renamed from: a */
                final /* synthetic */ RunnableC63483g f160379a;

                {
                    this.f160379a = r1;
                }

                public final void run() {
                    ActiveSpeakerListener c = this.f160379a.f160374a.mo219609c();
                    if (c != null) {
                        c.mo212173a(objectRef.element, false, "", this.f160379a.f160378e, objectRef2.element);
                    }
                }
            });
        }
    }

    /* renamed from: g */
    public final void mo219613g() {
        if (this.f160359j.size() == 1) {
            C60700b.m235844a(this.f160354e, "[processCornerCase]", "Active speaker is me, the only one in meeting.", 10000);
            String b = ParticipantUtil.m248728b(this.f160364o);
            Intrinsics.checkExpressionValueIsNotNull(b, "ParticipantUtil.getSelfRtcJoinId(meeting)");
            this.f160353b = b;
        }
        String c = this.f160364o.mo212092J().mo212531c();
        C61383d I = this.f160364o.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        if (!I.mo212494b().f153887a.containsKey(c)) {
            C60700b.m235851b(this.f160354e, "[processCornerCase2]", "Active speaker leave the room.");
            String b2 = ParticipantUtil.m248728b(this.f160364o);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ParticipantUtil.getSelfRtcJoinId(meeting)");
            this.f160353b = b2;
        }
        String b3 = this.f160364o.mo212092J().mo212527b();
        if (!TextUtils.isEmpty(b3)) {
            C61383d I2 = this.f160364o.mo212091I();
            Intrinsics.checkExpressionValueIsNotNull(I2, "meeting.meetingData");
            if (!I2.mo212494b().f153887a.containsKey(b3)) {
                C60700b.m235851b(this.f160354e, "[processCornerCase3]", "Pre active speaker leave the room.");
                this.f160364o.mo212092J().mo212522a("");
            }
        }
    }

    /* renamed from: a */
    public final void mo219602a(ActiveSpeakerSpeakListener bVar) {
        this.f160363n = bVar;
    }

    /* renamed from: a */
    public final void mo219601a(ActiveSpeakerListener aVar) {
        this.f160362m = aVar;
        if (aVar != null) {
            aVar.mo212171a(this.f160353b);
        }
    }

    /* renamed from: a */
    private final int m248764a(String str) {
        LinkedList<Integer> linkedList = this.f160355f.get(str);
        if (linkedList == null) {
            return -1;
        }
        Intrinsics.checkExpressionValueIsNotNull(linkedList, "mTimeMap[rtcJoinId] ?: return -1");
        Iterator<Integer> it = linkedList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "freq");
            i += next.intValue();
        }
        return i;
    }

    /* renamed from: b */
    private final int m248768b(String str) {
        LinkedList<Integer> linkedList = this.f160356g.get(str);
        int i = 0;
        if (linkedList == null) {
            return 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(linkedList, "mASCountMap[rtcJoinId] ?: return 0");
        Iterator<Integer> it = linkedList.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "freq");
            i += next.intValue();
        }
        return i * f160349c.getTickTime();
    }

    /* renamed from: a */
    private final void m248765a(TriggerType triggerType) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C61383d I = this.f160364o.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        C61388g b = I.mo212494b();
        Intrinsics.checkExpressionValueIsNotNull(b, "meeting.meetingData.participantData");
        objectRef.element = (T) new HashSet(b.mo212606k().keySet());
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        C61383d I2 = this.f160364o.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I2, "meeting.meetingData");
        C61388g b2 = I2.mo212494b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "meeting.meetingData.participantData");
        objectRef2.element = (T) new HashSet(b2.mo212607l());
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        C61383d I3 = this.f160364o.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I3, "meeting.meetingData");
        C61388g b3 = I3.mo212494b();
        Intrinsics.checkExpressionValueIsNotNull(b3, "meeting.meetingData.participantData");
        objectRef3.element = (T) new ArrayList(b3.mo212600e());
        C60735ab.m236016d(new RunnableC63483g(this, objectRef3, objectRef, objectRef2, triggerType));
    }

    public ActiveSpeakerCalculator(C61303k kVar) {
        ActiveUserConfig activeUserConfig;
        VcVideoSortConfig vcVideoSortConfig;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f160364o = kVar;
        String b = ParticipantUtil.m248728b(kVar);
        Intrinsics.checkExpressionValueIsNotNull(b, "ParticipantUtil.getSelfRtcJoinId(meeting)");
        this.f160353b = b;
        VideoChatManager a = VideoChatManager.m249444a();
        Intrinsics.checkExpressionValueIsNotNull(a, "VideoChatManager.getInstance()");
        C61282e k = a.mo220133k();
        f160349c = (k == null || (activeUserConfig = k.mo211946g()) == null) ? new ActiveUserConfig() : activeUserConfig;
        VideoChatManager a2 = VideoChatManager.m249444a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "VideoChatManager.getInstance()");
        C61282e k2 = a2.mo220133k();
        f160351p = (k2 == null || (vcVideoSortConfig = k2.mo211943d()) == null) ? new VcVideoSortConfig() : vcVideoSortConfig;
    }

    /* renamed from: b */
    private final void m248770b(List<VideoSortInfo> list) {
        if (!CollectionUtils.isEmpty(list)) {
            for (VideoSortInfo pVar : list) {
                if (!this.f160356g.containsKey(pVar.mo219680a())) {
                    this.f160356g.put(pVar.mo219680a(), new LinkedList<>());
                }
            }
        }
    }

    /* renamed from: a */
    private final void m248767a(List<VideoSortInfo> list) {
        if (!CollectionUtils.isEmpty(list)) {
            for (VideoSortInfo pVar : list) {
                if (!this.f160355f.containsKey(pVar.mo219680a())) {
                    this.f160355f.put(pVar.mo219680a(), new LinkedList<>());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo219603a(ArrayList<Participant> arrayList) {
        float f;
        Iterator<Map.Entry<String, LinkedList<Integer>>> it = this.f160356g.entrySet().iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            String key = it.next().getKey();
            if (!Intrinsics.areEqual(this.f160353b, key) || !this.f160352a) {
                i = 0;
            }
            m248769b(key, i);
        }
        if (this.f160352a) {
            C63486c<String, String> cVar = this.f160357h;
            String str = this.f160353b;
            cVar.mo219632a(str, str);
        }
        for (T t : arrayList) {
            String rtcJoinId = t.getRtcJoinId();
            Intrinsics.checkExpressionValueIsNotNull(rtcJoinId, "participant.rtcJoinId");
            float b = ((float) m248768b(rtcJoinId)) * f160351p.getFactorAS();
            int a = this.f160357h.mo219631a(t.getRtcJoinId());
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (a < 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = ((float) (f160351p.getMaxIndex() - a)) * f160351p.getFactorIndex();
            }
            ParticipantSettings participantSettings = t.getParticipantSettings();
            Intrinsics.checkExpressionValueIsNotNull(participantSettings, "participant.participantSettings");
            if (!participantSettings.isCameraMuted()) {
                f2 = f160351p.getFactorCamera();
            }
            String rtcJoinId2 = t.getRtcJoinId();
            Intrinsics.checkExpressionValueIsNotNull(rtcJoinId2, "participant.rtcJoinId");
            this.f160358i.put(rtcJoinId2, Float.valueOf(b + f + f2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.a$d */
    public static final class C63479d<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(t2.mo219681b().f152889c), Integer.valueOf(t.mo219681b().f152889c));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/vc/entity/Participant;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.a$h */
    public static final class C63485h<T> implements Comparator<Participant> {

        /* renamed from: a */
        public static final C63485h f160382a = new C63485h();

        C63485h() {
        }

        /* renamed from: a */
        public final int compare(Participant participant, Participant participant2) {
            if (participant == null && participant2 == null) {
                return 0;
            }
            if (participant != null) {
                if (participant2 != null && !ParticipantUtil.m248732c(participant)) {
                    if (!ParticipantUtil.m248732c(participant2)) {
                        float floatValue = participant.getGridSortScore().floatValue();
                        Float gridSortScore = participant2.getGridSortScore();
                        Intrinsics.checkExpressionValueIsNotNull(gridSortScore, "o2.gridSortScore");
                        float f = (float) 0;
                        if (floatValue - gridSortScore.floatValue() <= f) {
                            float floatValue2 = participant.getGridSortScore().floatValue();
                            Float gridSortScore2 = participant2.getGridSortScore();
                            Intrinsics.checkExpressionValueIsNotNull(gridSortScore2, "o2.gridSortScore");
                            if (floatValue2 - gridSortScore2.floatValue() >= f) {
                                return (participant.getJoinTime() > participant2.getJoinTime() ? 1 : (participant.getJoinTime() == participant2.getJoinTime() ? 0 : -1));
                            }
                        }
                    }
                }
                return -1;
            }
            return 1;
        }
    }

    /* renamed from: b */
    private final void m248769b(String str, int i) {
        LinkedList<Integer> linkedList = this.f160356g.get(str);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.f160356g.put(str, linkedList);
        }
        int timeScope = f160351p.getTimeScope() / f160349c.getTickTime();
        if (linkedList.size() < timeScope) {
            linkedList.add(Integer.valueOf(i));
        } else if (linkedList.size() == timeScope) {
            linkedList.remove(0);
            linkedList.add(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    private final void m248766a(String str, int i) {
        LinkedList<Integer> linkedList = this.f160355f.get(str);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.f160355f.put(str, linkedList);
        }
        int maxRecordTime = f160349c.getMaxRecordTime() / f160349c.getTickTime();
        if (linkedList.size() < maxRecordTime) {
            linkedList.add(Integer.valueOf(i));
        } else if (linkedList.size() == maxRecordTime) {
            linkedList.remove(0);
            linkedList.add(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void mo219605a(Set<String> set, ArrayList<Participant> arrayList) {
        Float f;
        this.f160359j.clear();
        this.f160359j.addAll(arrayList);
        HashMap hashMap = new HashMap(this.f160358i);
        if (CollectionUtils.isEmpty(this.f160359j)) {
            C60700b.m235851b(this.f160354e, "[sortParticipantsBySortScore]", "mSortedParticipants is null");
            return;
        }
        ArrayList arrayList2 = null;
        Iterator<Participant> it = this.f160359j.iterator();
        while (it.hasNext()) {
            Participant next = it.next();
            if (next.getStatus() != Participant.Status.ON_THE_CALL) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(next);
                it.remove();
            } else {
                if (set.contains(ParticipantUtil.m248706a(next))) {
                    hashMap.remove(next.getRtcJoinId());
                }
                if (this.f160358i.containsKey(next.getRtcJoinId())) {
                    f = this.f160358i.get(next.getRtcJoinId());
                } else {
                    ParticipantSettings participantSettings = next.getParticipantSettings();
                    Intrinsics.checkExpressionValueIsNotNull(participantSettings, "p.participantSettings");
                    if (!participantSettings.isCameraMuted()) {
                        f = Float.valueOf(f160351p.getFactorCamera());
                    } else {
                        f = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
                    }
                }
                next.setGridSortScore(f);
            }
        }
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                this.f160358i.remove(str);
                this.f160356g.remove(str);
                this.f160357h.mo219633b(str);
            }
        }
        CollectionsKt.sortWith(this.f160359j, C63485h.f160382a);
        if (arrayList2 != null) {
            this.f160359j.addAll(arrayList2);
        }
    }

    /* renamed from: a */
    public final void mo219604a(ArrayList<Participant> arrayList, VideoSortInfo[] pVarArr, boolean z) {
        String str;
        int i;
        Iterator<T> it;
        String str2;
        double d;
        int i2;
        boolean z2;
        Ref.IntRef intRef = new Ref.IntRef();
        int i3 = -127;
        intRef.element = -127;
        ArrayList arrayList2 = new ArrayList();
        for (VideoSortInfo pVar : pVarArr) {
            if (Intrinsics.areEqual(pVar.mo219681b().f152887a, this.f160353b)) {
                intRef.element = pVar.mo219681b().f152889c;
            }
            if (pVar.mo219681b().f152889c > f160349c.getMinSpeakerVolume()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList2.add(pVar);
            }
        }
        List<VideoSortInfo> sortedWith = CollectionsKt.sortedWith(arrayList2, new C63479d());
        m248767a(sortedWith);
        for (Map.Entry<String, LinkedList<Integer>> entry : this.f160355f.entrySet()) {
            String key = entry.getKey();
            Iterator<VideoSortInfo> it2 = sortedWith.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.areEqual(it2.next().mo219680a(), key)) {
                        i2 = 1;
                        break;
                    }
                } else {
                    i2 = 0;
                    break;
                }
            }
            m248766a(key, i2);
        }
        C60735ab.m236001a(new RunnableC63480e(this, intRef));
        double d2 = -1.0d;
        mo219608b().clear();
        Iterator<T> it3 = sortedWith.iterator();
        String str3 = "";
        String str4 = str3;
        int i4 = 0;
        int i5 = 1;
        while (it3.hasNext()) {
            RtcAudioVolumeInfo b = it3.next().mo219681b();
            if (i4 == 0) {
                i3 = b.f152889c;
                i5 = 1;
            } else if (sortedWith.get(i4).mo219681b().f152889c != i3) {
                i5++;
                i3 = sortedWith.get(i4).mo219681b().f152889c;
            }
            String str5 = b.f152887a;
            Intrinsics.checkExpressionValueIsNotNull(str5, "volume.uid");
            int a = m248764a(str5);
            if (a != -1) {
                str = str3;
                str2 = str4;
                double rankBase = ((double) f160349c.getRankBase()) / ((double) i5);
                if (a == 0) {
                    d = 0.0d;
                    it = it3;
                    i = i3;
                } else {
                    it = it3;
                    i = i3;
                    d = Math.log((double) a) / Math.log((double) f160349c.getTimeBase());
                }
                double d3 = rankBase + d;
                String str6 = b.f152887a;
                Intrinsics.checkExpressionValueIsNotNull(str6, "volume.uid");
                mo219608b().put(str6, Double.valueOf(d3));
                if (d2 < d3) {
                    String str7 = b.f152887a;
                    Intrinsics.checkExpressionValueIsNotNull(str7, "volume.uid");
                    if (z) {
                        Iterator<Participant> it4 = arrayList.iterator();
                        str4 = str7;
                        while (true) {
                            d2 = d3;
                            while (it4.hasNext()) {
                                Participant next = it4.next();
                                Intrinsics.checkExpressionValueIsNotNull(next, "p");
                                if (Intrinsics.areEqual(next.getRtcJoinId(), b.f152887a)) {
                                    str4 = b.f152887a;
                                    Intrinsics.checkExpressionValueIsNotNull(str4, "volume.uid");
                                }
                            }
                            break;
                        }
                    } else {
                        str4 = b.f152887a;
                        Intrinsics.checkExpressionValueIsNotNull(str4, "volume.uid");
                        d2 = d3;
                    }
                    i4++;
                    str3 = str;
                    it3 = it;
                    i3 = i;
                }
            } else {
                it = it3;
                i = i3;
                str = str3;
                str2 = str4;
            }
            str4 = str2;
            i4++;
            str3 = str;
            it3 = it;
            i3 = i;
        }
        if (!Intrinsics.areEqual(str4, str3)) {
            this.f160353b = str4;
            this.f160352a = true;
        } else {
            this.f160352a = false;
        }
        m248770b(sortedWith);
    }
}
