package com.ss.android.vc.meeting.module.gallery;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.irtc.VcByteStream;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61293a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.multi.gridcontent.TriggerType;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a;
import com.ss.android.vc.meeting.module.multi.presenter.GridSortUtil;
import com.ss.android.vc.meeting.module.preview.MeetingDeviceSwitchStateUtil;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b0*\u0001\u001d\u0018\u0000 w2\u00020\u00012\u00020\u0002:\u0001wB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H\u0016J@\u0010$\u001a\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150&2\b\u0010'\u001a\u0004\u0018\u00010\u00122\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\t2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010,H\u0002J\u0016\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u00100\u001a\u00020\"H\u0016J\b\u00101\u001a\u00020\tH\u0016J\b\u00102\u001a\u00020\tH\u0016J\b\u00103\u001a\u00020\tH\u0016J\u0012\u00104\u001a\u0004\u0018\u00010\u00122\u0006\u00105\u001a\u00020\u0007H\u0016J\u0014\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001207H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\b\u00109\u001a\u00020\u000eH\u0016J\u001e\u0010:\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150&H\u0002J\u0010\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u0007H\u0002J\b\u0010=\u001a\u00020\tH\u0016J$\u0010>\u001a\u00020\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150&2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00150&H\u0002J4\u0010>\u001a\u00020\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150&2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00150&2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000eH\u0002J\b\u0010B\u001a\u00020\tH\u0016J\b\u0010C\u001a\u00020\"H\u0016J\u0010\u0010D\u001a\u00020\"2\u0006\u0010E\u001a\u00020\u0007H\u0016J\u0012\u0010F\u001a\u00020\"2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J>\u0010I\u001a\u00020\"2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010K\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u00072\u0006\u0010(\u001a\u00020)2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010,H\u0016J\u0010\u0010L\u001a\u00020\"2\u0006\u0010M\u001a\u00020\tH\u0016J\u0010\u0010N\u001a\u00020\"2\u0006\u0010O\u001a\u00020\tH\u0016J.\u0010P\u001a\u00020\"2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010K\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u00072\u0006\u0010(\u001a\u00020)H\u0016J>\u0010Q\u001a\u00020\"2\u0006\u0010R\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010(\u001a\u00020)2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010,H\u0016J\b\u0010S\u001a\u00020\"H\u0016J\u0016\u0010T\u001a\u00020\"2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\n\u0010U\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010V\u001a\u00020\"2\u0006\u0010W\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\tH\u0016J\u0010\u0010Y\u001a\u00020\"2\u0006\u0010E\u001a\u00020\u0007H\u0016J\u0010\u0010Z\u001a\u00020\"2\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0016\u0010\\\u001a\u00020\"2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\b\u0010]\u001a\u00020\"H\u0016J\b\u0010^\u001a\u00020\"H\u0016J\u0010\u0010_\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H\u0016J\u0016\u0010`\u001a\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150&H\u0002J\b\u0010a\u001a\u00020\"H\u0016J\u0010\u0010b\u001a\u00020\"2\u0006\u0010c\u001a\u00020\tH\u0016J\u0010\u0010d\u001a\u00020\"2\u0006\u0010e\u001a\u00020\u0007H\u0016J\u0010\u0010f\u001a\u00020\"2\u0006\u0010g\u001a\u00020\tH\u0016J\u0010\u0010h\u001a\u00020\"2\u0006\u0010i\u001a\u00020\u000eH\u0016J\u0010\u0010j\u001a\u00020\"2\u0006\u0010c\u001a\u00020\tH\u0016J\u0018\u0010k\u001a\u00020\"2\u0006\u00105\u001a\u00020\u00072\u0006\u0010l\u001a\u00020\u0012H\u0016J\u0010\u0010m\u001a\u00020\"2\u0006\u0010n\u001a\u00020\u000eH\u0016J\u0010\u0010o\u001a\u00020\"2\u0006\u0010p\u001a\u00020\u000eH\u0016J\b\u0010q\u001a\u00020\"H\u0016J\b\u0010r\u001a\u00020\"H\u0016J\b\u0010s\u001a\u00020\"H\u0016J\u0010\u0010t\u001a\u00020\"2\u0006\u0010[\u001a\u00020\u0007H\u0016J>\u0010u\u001a\u00020.2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010K\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u00072\u0006\u0010(\u001a\u00020)2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010,H\u0002J(\u0010v\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150&2\u0006\u0010(\u001a\u00020)H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00120\u0011X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u001b\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006x"}, d2 = {"Lcom/ss/android/vc/meeting/module/gallery/GalleryControl;", "Lcom/ss/android/vc/meeting/module/gallery/AbsGalleryControl;", "Lcom/ss/android/vc/meeting/model/MeetingSpecificData$OnMeetingDataChangeListener;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "mAsRtcJoinId", "", "mCameraMuted", "", "Ljava/lang/Boolean;", "mCanUpdateSubscribe", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mFirstVisiblePosition", "", "mGalleryIsShowing", "mGalleryModels", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/vc/meeting/module/gallery/GalleryModel;", "mGalleryParticipants", "", "Lcom/ss/android/vc/entity/Participant;", "mGalleryViewListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/vc/meeting/module/gallery/IGalleryViewListener;", "mLastVisiblePosition", "mMicrophoneMuted", "mPageDevicesSize", "mRtcListener", "com/ss/android/vc/meeting/module/gallery/GalleryControl$mRtcListener$1", "Lcom/ss/android/vc/meeting/module/gallery/GalleryControl$mRtcListener$1;", "mScreenSharePortraitMode", "mSortedParticipants", "addViewListeners", "", "listener", "adjustCurrPageParticipants", "newParticipants", "", "asModel", "triggerType", "Lcom/ss/android/vc/meeting/module/multi/gridcontent/TriggerType;", "isFirstPage", "newEnterParticipants", "Ljava/util/HashSet;", "checkLocalCameraMicrophone", "Lcom/ss/android/vc/meeting/utils/ParticipantUtil$DIFF_TYPE;", "participants", "destroyGallery", "galleryVideoListVisible", "getCanUpdateSubscribe", "getGalleryIsShowing", "getGalleryModelByKey", "participantKey", "getGalleryModels", "", "getParticipants", "getParticipantsSize", "isASInFirstPage", "isAsFromOtherPage", "asRtcJoinId", "isLastGalleryVideoShow", "isSameScope", "oldParticipants", "from", "to", "isScreenSharePortraitMode", "notifyRefreshAll", "onActiveSpeakerChanged", "rtcJoinId", "onInMeetingInfoUpdate", "inMeetingInfo", "Lcom/ss/android/vc/entity/VideoChatInMeetingInfo;", "onParticipantChange", "sortedParticipants", "hasValidAS", "onScreenSharePortraitModeChange", "isPortraitMode", "onVideoMute", "muted", "onVideoSort", "processAsReorder", "newAsJoinId", "reBuildGalleryModels", "recordLocalCameraMicrophone", "refreshASModel", "refreshActiveSpeaker", "asJoinId", "isSpeaking", "refreshByRtcJoinId", "refreshParticipantUI", "key", "refreshParticipants", "refreshShownGalleryUI", "registerSdkListener", "removeViewListeners", "replaceCurrPageParticipants", "resetGalleryModel", "saveLastGalleryVideoShow", "show", "setActiveSpeakerName", "name", "setCanUpdateSubscribe", "canSubscribe", "setFirstVisiblePosition", "startPosition", "setGalleryIsShowing", "setGalleryModelByKey", "galleryModel", "setLastVisiblePosition", "endPosition", "setPageDevicesSize", "size", "showGallery", "unregisterSdkListener", "updateGallerySubscribe", "updateParticipantSubscribe", "updateParticipants", "willReorderForAs", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.gallery.c */
public final class GalleryControl extends AbsGalleryControl implements MeetingSpecificData.OnMeetingDataChangeListener {

    /* renamed from: a */
    public static final Companion f155445a = new Companion(null);

    /* renamed from: b */
    private List<Participant> f155446b = new LinkedList();

    /* renamed from: c */
    private List<Participant> f155447c = new LinkedList();

    /* renamed from: d */
    private ConcurrentHashMap<String, GalleryModel> f155448d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private CopyOnWriteArrayList<IGalleryViewListener> f155449e = new CopyOnWriteArrayList<>();

    /* renamed from: f */
    private String f155450f;

    /* renamed from: g */
    private AtomicBoolean f155451g = new AtomicBoolean(false);

    /* renamed from: h */
    private boolean f155452h;

    /* renamed from: i */
    private volatile boolean f155453i;

    /* renamed from: j */
    private int f155454j;

    /* renamed from: k */
    private int f155455k;

    /* renamed from: l */
    private int f155456l = 4;

    /* renamed from: m */
    private Boolean f155457m;

    /* renamed from: n */
    private Boolean f155458n;

    /* renamed from: o */
    private final C61904b f155459o;

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    /* renamed from: a */
    public void mo212577a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
    }

    @Override // com.ss.android.vc.meeting.module.gallery.IGalleryViewListener
    /* renamed from: f */
    public void mo214357f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
    }

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    public void j_(boolean z) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/gallery/GalleryControl$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: c */
    public List<Participant> mo214334c() {
        return this.f155446b;
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: i */
    public boolean mo214344i() {
        return this.f155452h;
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: k */
    public boolean mo214346k() {
        return this.f155453i;
    }

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    /* renamed from: a */
    public void mo212579a(List<Participant> list, boolean z, String str, TriggerType triggerType, HashSet<String> hashSet) {
        Intrinsics.checkParameterIsNotNull(list, "sortedParticipants");
        Intrinsics.checkParameterIsNotNull(str, "asRtcJoinId");
        Intrinsics.checkParameterIsNotNull(triggerType, "triggerType");
        C60700b.m235851b("GalleryControl@", "[onParticipantChange]", "rtcJoinId = " + str);
        if (this.f155453i && m241810b(list, z, str, triggerType, hashSet) != ParticipantUtil.DIFF_TYPE.SAME) {
            mo214359m();
        }
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: b */
    public int mo214329b() {
        return this.f155446b.size();
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: d */
    public Map<String, GalleryModel> mo214337d() {
        return this.f155448d;
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: e */
    public boolean mo214340e() {
        return this.f155451g.get();
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: h */
    public boolean mo214343h() {
        return MeetingDeviceSwitchStateUtil.m245168c();
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: f */
    public void mo214341f() {
        C60700b.m235851b("GalleryControl@", "[registerSdkListener]", "registerSdkListener");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.mo212164x().mo211751a(this.f155459o);
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: g */
    public void mo214342g() {
        C60700b.m235851b("GalleryControl@", "[unregisterSdkListener]", "unregisterSdkListener");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.mo212164x().mo211761b(this.f155459o);
    }

    @Override // com.ss.android.vc.meeting.module.gallery.IGalleryViewListener
    /* renamed from: m */
    public void mo214359m() {
        Iterator<IGalleryViewListener> it = this.f155449e.iterator();
        while (it.hasNext()) {
            it.next().mo214359m();
        }
    }

    @Override // com.ss.android.vc.meeting.module.gallery.IGalleryViewListener
    /* renamed from: n */
    public void mo214360n() {
        Iterator<IGalleryViewListener> it = this.f155449e.iterator();
        while (it.hasNext()) {
            it.next().mo214360n();
        }
    }

    @Override // com.ss.android.vc.meeting.module.gallery.IGalleryViewListener
    /* renamed from: o */
    public boolean mo214361o() {
        Iterator<IGalleryViewListener> it = this.f155449e.iterator();
        while (it.hasNext()) {
            IGalleryViewListener next = it.next();
            if (next != null) {
                return next.mo214361o();
            }
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: j */
    public void mo214345j() {
        C60700b.m235851b("GalleryControl@", "[resetGalleryModel]", "resetGalleryModel");
        for (GalleryModel eVar : this.f155448d.values()) {
            eVar.mo214364a(false);
        }
    }

    /* renamed from: p */
    private final GalleryModel m241813p() {
        GalleryModel eVar = null;
        for (GalleryModel eVar2 : this.f155448d.values()) {
            Intrinsics.checkExpressionValueIsNotNull(eVar2, "galleryModel");
            Participant m = eVar2.mo216208m();
            Intrinsics.checkExpressionValueIsNotNull(m, "galleryModel.participant");
            if (TextUtils.equals(m.getRtcJoinId(), this.f155450f)) {
                eVar2.mo216199b(true);
                eVar = eVar2;
            } else {
                eVar2.mo216199b(false);
            }
        }
        return eVar;
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: a */
    public void mo214323a() {
        System.currentTimeMillis();
        for (GalleryModel eVar : this.f155448d.values()) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            AbstractC62485a az = meeting.az();
            Intrinsics.checkExpressionValueIsNotNull(eVar, "galleryModel");
            if (az.mo216035a(eVar.mo216208m())) {
                C60700b.m235851b("GalleryControl@", "[updateGallerySubscribe]", "show in fullscreen");
            } else {
                eVar.mo214365b();
            }
        }
        System.currentTimeMillis();
    }

    /* renamed from: l */
    public void mo214358l() {
        C60700b.m235851b("GalleryControl@", "[reBuildGalleryModels]", "reBuildGalleryModels");
        ConcurrentHashMap<String, GalleryModel> concurrentHashMap = new ConcurrentHashMap<>();
        for (Participant participant : this.f155446b) {
            if (participant != null) {
                String a = ParticipantUtil.m248706a(participant);
                if (this.f155448d.containsKey(a)) {
                    GalleryModel eVar = this.f155448d.get(a);
                    if (eVar != null) {
                        eVar.mo216198a(participant);
                    }
                    GalleryModel eVar2 = this.f155448d.get(a);
                    if (eVar2 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(eVar2, "it");
                        eVar2.mo216199b(TextUtils.equals(this.f155450f, participant.getRtcJoinId()));
                        Intrinsics.checkExpressionValueIsNotNull(a, "participantKey");
                        concurrentHashMap.put(a, eVar2);
                    }
                } else {
                    C61303k kVar = this.mMeeting;
                    Intrinsics.checkExpressionValueIsNotNull(kVar, "mMeeting");
                    GalleryModel eVar3 = new GalleryModel(kVar, participant);
                    if (TextUtils.equals(this.f155450f, participant.getRtcJoinId())) {
                        eVar3.mo216199b(true);
                    }
                    Intrinsics.checkExpressionValueIsNotNull(a, "participantKey");
                    concurrentHashMap.put(a, eVar3);
                }
            }
        }
        this.f155448d = concurrentHashMap;
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: e */
    public void mo214339e(boolean z) {
        this.f155453i = z;
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: c */
    public void mo214336c(boolean z) {
        MeetingDeviceSwitchStateUtil.m245162a(Boolean.valueOf(z));
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: a */
    public void mo214328a(boolean z) {
        this.f155451g.set(z);
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: b */
    public void mo214331b(IGalleryViewListener gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "listener");
        this.f155449e.remove(gVar);
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: c */
    public GalleryModel mo214333c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "participantKey");
        return this.f155448d.get(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/vc/net/service/VideoChatUser;", "kotlin.jvm.PlatformType", "onGetUserInfo"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.c$c */
    static final class C61905c implements GetUserInfoListener {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f155462a;

        C61905c(Ref.ObjectRef objectRef) {
            this.f155462a = objectRef;
        }

        @Override // com.ss.android.vc.net.service.GetUserInfoListener
        public final void onGetUserInfo(VideoChatUser videoChatUser) {
            Ref.ObjectRef objectRef = this.f155462a;
            Intrinsics.checkExpressionValueIsNotNull(videoChatUser, "it");
            T t = (T) videoChatUser.getName();
            Intrinsics.checkExpressionValueIsNotNull(t, "it.name");
            objectRef.element = t;
        }
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: a */
    public void mo214324a(int i) {
        if (i >= 0) {
            this.f155454j = i;
            C60700b.m235851b("GalleryControl@", "[setFirstVisiblePosition]", "startPosition = " + i);
        }
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: b */
    public void mo214330b(int i) {
        if (i >= 0) {
            this.f155455k = i;
            C60700b.m235851b("GalleryControl@", "[setLastVisiblePosition]", "endPosition = " + i);
        }
    }

    @Override // com.ss.android.vc.meeting.module.gallery.IGalleryViewListener
    /* renamed from: e */
    public void mo214356e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Iterator<IGalleryViewListener> it = this.f155449e.iterator();
        while (it.hasNext()) {
            it.next().mo214356e(str);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        if (!this.f155453i) {
            C60700b.m235851b("GalleryControl@", "[onInMeetingInfoUpdate]", "content view is null or not create");
            return;
        }
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.mo212163w().mo219611e();
    }

    /* renamed from: b */
    private final void m241811b(List<Participant> list) {
        Boolean bool;
        Participant c = ParticipantUtil.m248731c(list);
        if (c != null) {
            ParticipantSettings participantSettings = c.getParticipantSettings();
            Boolean bool2 = null;
            if (participantSettings != null) {
                bool = Boolean.valueOf(participantSettings.isCameraMuted());
            } else {
                bool = null;
            }
            this.f155457m = bool;
            ParticipantSettings participantSettings2 = c.getParticipantSettings();
            if (participantSettings2 != null) {
                bool2 = Boolean.valueOf(participantSettings2.isMicrophoneMuted());
            }
            this.f155458n = bool2;
        }
    }

    /* renamed from: g */
    private final boolean m241812g(String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        int i = 0;
        for (T t : this.f155446b) {
            if (i >= this.f155456l) {
                return true;
            }
            if (TextUtils.equals(str2, this.f155446b.get(i).getRtcJoinId())) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: c */
    public void mo214335c(int i) {
        if (i > 0) {
            this.f155456l = i;
        }
        C60700b.m235851b("GalleryControl@", "[setPageDevicesSize]", "size = " + i + ", mPageDevicesSize = " + this.f155456l);
    }

    /* renamed from: d */
    public void mo214355d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
        for (Participant participant : this.f155446b) {
            if (ParticipantUtil.m248716a(participant, str)) {
                String a = ParticipantUtil.m248706a(participant);
                Intrinsics.checkExpressionValueIsNotNull(a, "key");
                mo214356e(a);
                return;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryControl(C61303k kVar) {
        super(kVar);
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        if (kVar.mo212092J() != null) {
            this.f155450f = kVar.mo212092J().mo212531c();
        }
        if (TextUtils.isEmpty(this.f155450f)) {
            this.f155450f = VideoChatModuleDependency.m236629b();
        }
        kVar.mo212092J().mo212520a(this);
        this.f155459o = new C61904b(this, kVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r0, r3.f155458n)) != false) goto L_0x003b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ss.android.vc.meeting.utils.ParticipantUtil.DIFF_TYPE m241808a(java.util.List<com.ss.android.vc.entity.Participant> r4) {
        /*
            r3 = this;
            com.ss.android.vc.entity.Participant r4 = com.ss.android.vc.meeting.utils.ParticipantUtil.m248731c(r4)
            if (r4 == 0) goto L_0x0060
            com.ss.android.vc.entity.ParticipantSettings r0 = r4.getParticipantSettings()
            r1 = 0
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isCameraMuted()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            java.lang.Boolean r2 = r3.f155457m
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x003b
            com.ss.android.vc.entity.ParticipantSettings r0 = r4.getParticipantSettings()
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.isMicrophoneMuted()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            java.lang.Boolean r2 = r3.f155458n
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0060
        L_0x003b:
            com.ss.android.vc.entity.ParticipantSettings r0 = r4.getParticipantSettings()
            if (r0 == 0) goto L_0x004a
            boolean r0 = r0.isCameraMuted()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x004b
        L_0x004a:
            r0 = r1
        L_0x004b:
            r3.f155457m = r0
            com.ss.android.vc.entity.ParticipantSettings r4 = r4.getParticipantSettings()
            if (r4 == 0) goto L_0x005b
            boolean r4 = r4.isMicrophoneMuted()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
        L_0x005b:
            r3.f155458n = r1
            com.ss.android.vc.meeting.utils.ParticipantUtil$DIFF_TYPE r4 = com.ss.android.vc.meeting.utils.ParticipantUtil.DIFF_TYPE.STATIC_VIEW_DIFF
            return r4
        L_0x0060:
            com.ss.android.vc.meeting.utils.ParticipantUtil$DIFF_TYPE r4 = com.ss.android.vc.meeting.utils.ParticipantUtil.DIFF_TYPE.SAME
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.gallery.GalleryControl.m241808a(java.util.List):com.ss.android.vc.meeting.utils.ParticipantUtil$DIFF_TYPE");
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: b */
    public void mo214332b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        C60700b.m235851b("GalleryControl@", "[updateGallerySubscribe]", "key = " + str);
        GalleryModel c = mo214333c(str);
        if (c != null) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            if (meeting.az().mo216035a(c.mo216208m())) {
                C60700b.m235851b("GalleryControl@", "[updateGallerySubscribe2]", "show in fullscreen " + str);
                return;
            }
            c.mo214365b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: d */
    public void mo214338d(boolean z) {
        if (z != this.f155452h) {
            C60700b.m235851b("GalleryControl@", "[onScreenSharePortraitModeChange]", "isProtraintMode = " + z);
            this.f155452h = z;
            mo214359m();
        }
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: a */
    public void mo214325a(IGalleryViewListener gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "listener");
        if (!this.f155449e.contains(gVar)) {
            this.f155449e.add(gVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/vc/meeting/module/gallery/GalleryControl$mRtcListener$1", "Lcom/ss/android/vc/meeting/framework/meeting/AbsByteRtcListener;", "onFirstRemoteVideoFrame", "", "rtcjoinId", "", "width", "", "height", "onStreamAdd", "stream", "Lcom/ss/android/vc/irtc/VcByteStream;", "streamInfo", "onStreamRemove", "rtcJoinId", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.c$b */
    public static final class C61904b extends AbstractC61293a {

        /* renamed from: a */
        final /* synthetic */ GalleryControl f155460a;

        /* renamed from: b */
        final /* synthetic */ C61303k f155461b;

        C61904b(GalleryControl cVar, C61303k kVar) {
            this.f155460a = cVar;
            this.f155461b = kVar;
        }

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: a */
        public void mo211750a(VcByteStream vcByteStream, String str) {
            Intrinsics.checkParameterIsNotNull(vcByteStream, "stream");
            Intrinsics.checkParameterIsNotNull(str, "streamInfo");
            List<Participant> c = this.f155460a.mo214334c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            for (Participant participant : c) {
                if (ParticipantUtil.m248716a(participant, vcByteStream.f152908b)) {
                    String a = ParticipantUtil.m248706a(participant);
                    GalleryControl cVar = this.f155460a;
                    Intrinsics.checkExpressionValueIsNotNull(a, "key");
                    GalleryModel c2 = cVar.mo214333c(a);
                    if (c2 != null && c2.mo214367d()) {
                        this.f155460a.mo214332b(a);
                        this.f155461b.ax().mo214356e(a);
                        return;
                    }
                    return;
                }
            }
        }

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: b */
        public void mo211764b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
            Intrinsics.checkParameterIsNotNull(str2, "streamInfo");
            if (!TextUtils.isEmpty(str)) {
                List<Participant> c = this.f155460a.mo214334c();
                if (c == null) {
                    Intrinsics.throwNpe();
                }
                for (Participant participant : c) {
                    if (ParticipantUtil.m248716a(participant, str)) {
                        ParticipantSettings participantSettings = participant.getParticipantSettings();
                        Intrinsics.checkExpressionValueIsNotNull(participantSettings, "data.participantSettings");
                        boolean isCameraMuted = participantSettings.isCameraMuted();
                        ParticipantSettings participantSettings2 = participant.getParticipantSettings();
                        Intrinsics.checkExpressionValueIsNotNull(participantSettings2, "data.participantSettings");
                        participantSettings2.setCameraMuted(true);
                        this.f155460a.mo214355d(str);
                        ParticipantSettings participantSettings3 = participant.getParticipantSettings();
                        Intrinsics.checkExpressionValueIsNotNull(participantSettings3, "data.participantSettings");
                        participantSettings3.setCameraMuted(isCameraMuted);
                    }
                }
            }
        }

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: a */
        public void mo211752a(String str, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(str, "rtcjoinId");
            C60700b.m235851b("GalleryControl@", "[onFirstRemoteVideoFrame]", String.valueOf(str));
            String a = ParticipantUtil.m248706a(ParticipantUtil.m248703a(str, this.f155460a.mo214334c()));
            GalleryControl cVar = this.f155460a;
            Intrinsics.checkExpressionValueIsNotNull(a, "participantKey");
            cVar.mo214356e(a);
            AbstractC62485a az = this.f155461b.az();
            Intrinsics.checkExpressionValueIsNotNull(az, "meeting.fullScreenVideoControl");
            if (az.mo216034a()) {
                this.f155461b.az().mo216033a(str);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: a */
    public void mo214326a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "asJoinId");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        Participant a = ParticipantUtil.m248703a(str, meeting.ax().mo214334c());
        String a2 = ParticipantUtil.m248706a(a);
        Intrinsics.checkExpressionValueIsNotNull(a2, "ParticipantUtil.getKeyForParticipant(participant)");
        GalleryModel c = mo214333c(a2);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        if (z && c != null && c.mo216206k() && !c.mo216204i()) {
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            String d = meeting2.mo212055d();
            Intrinsics.checkExpressionValueIsNotNull(a, "participant");
            UserInfoService.getUserInfoById(d, a.getId(), a.getParticipantType(), new C61905c(objectRef));
        }
        C60700b.m235844a("GalleryControl@", "[refreshActiveSpeaker]", "asJoinId = " + str + ", isSpeaking = " + z, 10000);
        Iterator<IGalleryViewListener> it = this.f155449e.iterator();
        while (it.hasNext()) {
            it.next().mo214357f(objectRef.element);
        }
    }

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    /* renamed from: a */
    public void mo212578a(List<Participant> list, boolean z, String str, TriggerType triggerType) {
        Intrinsics.checkParameterIsNotNull(list, "sortedParticipants");
        Intrinsics.checkParameterIsNotNull(str, "asRtcJoinId");
        Intrinsics.checkParameterIsNotNull(triggerType, "triggerType");
        if (this.f155453i) {
            C60700b.m235844a("GalleryControl@", "[onVideoSort]", "asRtcJoinId = " + str + ", hasValidAS = " + z + ", triggerType = " + triggerType.name(), 10000);
            if (m241810b(list, z, str, triggerType, null) != ParticipantUtil.DIFF_TYPE.SAME) {
                mo214359m();
            }
        }
    }

    /* renamed from: a */
    private final void m241809a(List<? extends Participant> list, GalleryModel eVar, TriggerType triggerType, boolean z, HashSet<String> hashSet) {
        int i = this.f155456l;
        int i2 = this.f155454j;
        int i3 = this.f155455k;
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        C61383d I = meeting.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        C61388g b = I.mo212494b();
        Intrinsics.checkExpressionValueIsNotNull(b, "meeting.meetingData.participantData");
        GridSortUtil.m244531a(false, this.f155446b, list, eVar, triggerType, z, i, i2, i3, ParticipantUtil.m248706a(b.mo212605j()), hashSet);
    }

    /* renamed from: b */
    private final ParticipantUtil.DIFF_TYPE m241810b(List<Participant> list, boolean z, String str, TriggerType triggerType, HashSet<String> hashSet) {
        List<Participant> list2 = list;
        if (CollectionUtils.isEmpty(list2)) {
            return ParticipantUtil.DIFF_TYPE.SAME;
        }
        ParticipantUtil.DIFF_TYPE a = ParticipantUtil.m248705a(this.f155447c, list, VideoChatModuleDependency.m236629b());
        if (a == ParticipantUtil.DIFF_TYPE.SAME) {
            a = m241808a(list);
        }
        if (a != ParticipantUtil.DIFF_TYPE.SAME) {
            m241811b(list);
        }
        boolean z2 = false;
        String str2 = str;
        if (!TextUtils.isEmpty(str2) && z && !TextUtils.equals(this.f155450f, str2)) {
            this.f155450f = str;
            z2 = true;
        }
        if (a != null) {
            int i = C61906d.f155463a[a.ordinal()];
            if (i == 1) {
                mo214327a(str, z, list, triggerType, hashSet);
                this.f155447c = CollectionsKt.toMutableList((Collection) list2);
                return ParticipantUtil.DIFF_TYPE.ALL_DIFF;
            } else if (i == 2) {
                mo214327a(str, z, list, triggerType, hashSet);
                this.f155447c = CollectionsKt.toMutableList((Collection) list2);
                return ParticipantUtil.DIFF_TYPE.STATIC_VIEW_DIFF;
            }
        }
        if (!z2 && triggerType != TriggerType.INIT && (!z || this.f155454j != 0 || !m241812g(str))) {
            return ParticipantUtil.DIFF_TYPE.SAME;
        }
        mo214327a(str, z, list, triggerType, hashSet);
        this.f155447c = CollectionsKt.toMutableList((Collection) list2);
        return ParticipantUtil.DIFF_TYPE.ALL_DIFF;
    }

    @Override // com.ss.android.vc.meeting.module.gallery.AbsGalleryControl
    /* renamed from: a */
    public void mo214327a(String str, boolean z, List<Participant> list, TriggerType triggerType, HashSet<String> hashSet) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(str, "newAsJoinId");
        Intrinsics.checkParameterIsNotNull(list, "newParticipants");
        Intrinsics.checkParameterIsNotNull(triggerType, "triggerType");
        if (!TextUtils.isEmpty(str) && z) {
            this.f155450f = str;
        }
        GalleryModel p = m241813p();
        if (!z) {
            p = null;
        }
        if (this.f155454j == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        m241809a(list, p, triggerType, z2, hashSet);
        mo214358l();
    }
}
