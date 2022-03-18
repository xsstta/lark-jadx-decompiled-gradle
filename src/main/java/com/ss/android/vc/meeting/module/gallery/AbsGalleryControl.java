package com.ss.android.vc.meeting.module.gallery;

import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61298f;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import com.ss.android.vc.meeting.module.multi.gridcontent.TriggerType;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\fH&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u0013H&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\fH&J\b\u0010\u001a\u001a\u00020\fH&J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\fH&J>\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010!\u001a\u00020\"2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010$H&J\b\u0010%\u001a\u00020\tH&J\u0018\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\fH&J\u0010\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0011H&J\u0016\u0010+\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&J\b\u0010-\u001a\u00020\tH&J\u0010\u0010.\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H&J\b\u0010/\u001a\u00020\tH&J\u0010\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\fH&J\u0010\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\fH&J\u0010\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\u0018H&J\u0010\u00106\u001a\u00020\t2\u0006\u00101\u001a\u00020\fH&J\u0018\u00107\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u000fH&J\u0010\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u0018H&J\u0010\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u0018H&J\b\u0010=\u001a\u00020\tH&J\b\u0010>\u001a\u00020\tH&J\u0010\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u0011H&¨\u0006A"}, d2 = {"Lcom/ss/android/vc/meeting/module/gallery/AbsGalleryControl;", "Lcom/ss/android/vc/meeting/module/base/BaseControl;", "Lcom/ss/android/vc/meeting/framework/meeting/IMeetingInfoUpdate;", "Lcom/ss/android/vc/meeting/model/MeetingSpecificData$OnMeetingDataChangeListener;", "Lcom/ss/android/vc/meeting/module/gallery/IGalleryViewListener;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "addViewListeners", "", "listener", "getCanUpdateSubscribe", "", "getGalleryIsShowing", "getGalleryModelByKey", "Lcom/ss/android/vc/meeting/module/gallery/GalleryModel;", "participantKey", "", "getGalleryModels", "", "getParticipants", "", "Lcom/ss/android/vc/entity/Participant;", "getParticipantsSize", "", "isLastGalleryVideoShow", "isScreenSharePortraitMode", "onScreenSharePortraitModeChange", "isPortraitMode", "processAsReorder", "newAsJoinId", "hasValidAS", "sortedParticipants", "triggerType", "Lcom/ss/android/vc/meeting/module/multi/gridcontent/TriggerType;", "newEnterParticipants", "Ljava/util/HashSet;", "reBuildGalleryModels", "refreshActiveSpeaker", "asJoinId", "isSpeaking", "refreshByRtcJoinId", "rtcJoinId", "refreshParticipants", "participant", "registerSdkListener", "removeViewListeners", "resetGalleryModel", "saveLastGalleryVideoShow", "show", "setCanUpdateSubscribe", "canSubscribe", "setFirstVisiblePosition", "startPosition", "setGalleryIsShowing", "setGalleryModelByKey", "galleryModel", "setLastVisiblePosition", "endPosition", "setPageDevicesSize", "size", "unregisterSdkListener", "updateGallerySubscribe", "updateParticipantSubscribe", "key", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.gallery.a */
public abstract class AbsGalleryControl extends AbstractC61420b implements AbstractC61298f, MeetingSpecificData.OnMeetingDataChangeListener, IGalleryViewListener {
    /* renamed from: a */
    public abstract void mo214323a();

    /* renamed from: a */
    public abstract void mo214324a(int i);

    /* renamed from: a */
    public abstract void mo214325a(IGalleryViewListener gVar);

    /* renamed from: a */
    public abstract void mo214326a(String str, boolean z);

    /* renamed from: a */
    public abstract void mo214327a(String str, boolean z, List<Participant> list, TriggerType triggerType, HashSet<String> hashSet);

    /* renamed from: a */
    public abstract void mo214328a(boolean z);

    /* renamed from: b */
    public abstract int mo214329b();

    /* renamed from: b */
    public abstract void mo214330b(int i);

    /* renamed from: b */
    public abstract void mo214331b(IGalleryViewListener gVar);

    /* renamed from: b */
    public abstract void mo214332b(String str);

    /* renamed from: c */
    public abstract GalleryModel mo214333c(String str);

    /* renamed from: c */
    public abstract List<Participant> mo214334c();

    /* renamed from: c */
    public abstract void mo214335c(int i);

    /* renamed from: c */
    public abstract void mo214336c(boolean z);

    /* renamed from: d */
    public abstract Map<String, GalleryModel> mo214337d();

    /* renamed from: d */
    public abstract void mo214338d(boolean z);

    /* renamed from: e */
    public abstract void mo214339e(boolean z);

    /* renamed from: e */
    public abstract boolean mo214340e();

    /* renamed from: f */
    public abstract void mo214341f();

    /* renamed from: g */
    public abstract void mo214342g();

    /* renamed from: h */
    public abstract boolean mo214343h();

    /* renamed from: i */
    public abstract boolean mo214344i();

    /* renamed from: j */
    public abstract void mo214345j();

    /* renamed from: k */
    public abstract boolean mo214346k();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsGalleryControl(C61303k kVar) {
        super(kVar);
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }
}
