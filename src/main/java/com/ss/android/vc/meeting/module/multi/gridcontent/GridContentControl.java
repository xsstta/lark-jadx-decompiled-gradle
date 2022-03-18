package com.ss.android.vc.meeting.module.multi.gridcontent;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.common.singleinstance.AbsSingleInstanceControl;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.irtc.VcByteStream;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamManagerGlobal;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamSpec;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a;
import com.ss.android.vc.meeting.module.multi.presenter.C62526c;
import com.ss.android.vc.meeting.module.multi.presenter.C62527d;
import com.ss.android.vc.meeting.module.multi.presenter.MeetingPageModel;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.p3182c.C63726b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\u001aH\u0016J\b\u0010\"\u001a\u00020\u001aH\u0016J\b\u0010#\u001a\u00020\u0011H\u0016J\b\u0010$\u001a\u00020\u0018H\u0002J\b\u0010%\u001a\u00020\u0018H\u0016J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0007H\u0016J\b\u0010(\u001a\u00020\u0018H\u0002J\u0010\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u0007H\u0016J\u0012\u0010+\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J>\u0010.\u001a\u00020\u00112\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0015002\u0006\u00101\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u000105H\u0016J\u0010\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u0018H\u0016J.\u00108\u001a\u00020\u00112\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0015002\u0006\u00101\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u00072\u0006\u00102\u001a\u000203H\u0016J\u0010\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u001aH\u0016J\b\u0010;\u001a\u00020\u0011H\u0016J\u0010\u0010<\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0007H\u0016J\b\u0010=\u001a\u00020\u0011H\u0002J\b\u0010>\u001a\u00020\u0011H\u0002J\b\u0010?\u001a\u00020\u0011H\u0016J\u0012\u0010@\u001a\u00020\u00112\b\u0010'\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010A\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0012\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010D\u001a\u00020\u0007H\u0016J\u0012\u0010E\u001a\u0004\u0018\u00010\u001c2\u0006\u0010F\u001a\u00020\u0007H\u0016J,\u0010G\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00072\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010L\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0010\u0010M\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\tH\u0016J\b\u0010O\u001a\u00020\u0011H\u0016J\u0010\u0010P\u001a\u00020\u00112\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020\u0011H\u0016J>\u0010T\u001a\u00020U2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u0015002\u0006\u00101\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u000105H\u0002J\b\u0010W\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/gridcontent/GridContentControl;", "Lcom/ss/android/vc/meeting/module/multi/gridcontent/AbsGridContentControl;", "Lcom/ss/android/vc/meeting/model/MeetingSpecificData$OnMeetingDataChangeListener;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "TAG", "", "floatByteviewUser", "Lcom/ss/android/vc/entity/ByteviewUser;", "gridContentListeners", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/multi/gridcontent/AbsGridContentControl$IGridContentViewListener;", "mMeetingPageManager", "Lcom/ss/android/vc/meeting/module/multi/presenter/MeetingPageManager;", "myUser", "addGridContentViewListener", "", "listener", "cancelInvite", "participant", "Lcom/ss/android/vc/entity/Participant;", "dumpPageInfos", "force", "", "getCurrentPage", "", "getCurrentPageModel", "Lcom/ss/android/vc/meeting/module/multi/presenter/MeetingPageModel;", "getFloatByteviewUser", "getMeetingPageManager", "getPageCount", "getPageModel", "page", "getParticipantCount", "initMeetingPageManager", "isShowFullScreenVideo", "isTwoInMeeting", "isUserShowing", "rtcJoinId", "isViewValid", "onActiveSpeakerChanged", "asRtcJoinId", "onInMeetingInfoUpdate", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/vc/entity/VideoChatInMeetingInfo;", "onParticipantChange", "sortedParticipants", "", "hasValidAS", "triggerType", "Lcom/ss/android/vc/meeting/module/multi/gridcontent/TriggerType;", "newEnterParticipants", "Ljava/util/HashSet;", "onVideoMute", "muted", "onVideoSort", "onVpPageSelected", "newPage", "refresh", "refreshGridViewByRtcJoinId", "refreshInner", "refreshView", "refreshWhenGoToBackground", "refreshWhenStreamRemove", "removeGridContentViewListener", "retrieveGridModelById", "Lcom/ss/android/vc/meeting/module/multi/presenter/MeetingGridModel;", "gridId", "retrievePageModelById", "pageId", "sendEvent", "event", "action", "extendObject", "Lorg/json/JSONObject;", "setCurrentPage", "setFloatByteviewUser", "user", "showGridContent", "subscribeWhenStreamAdd", "stream", "Lcom/ss/android/vc/irtc/VcByteStream;", "switchMasterVideoView", "updateParticipants", "Lcom/ss/android/vc/meeting/utils/ParticipantUtil$DIFF_TYPE;", "participantList", "updateStreamSubscribe", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.gridcontent.c */
public final class GridContentControl extends AbsGridContentControl implements MeetingSpecificData.OnMeetingDataChangeListener {

    /* renamed from: a */
    private final String f157315a = "GridContentControl";

    /* renamed from: b */
    private ArrayList<AbsGridContentControl.IGridContentViewListener> f157316b = new ArrayList<>();

    /* renamed from: c */
    private C62527d f157317c = new C62527d();

    /* renamed from: d */
    private ByteviewUser f157318d;

    /* renamed from: e */
    private ByteviewUser f157319e;

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    /* renamed from: a */
    public void mo212577a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "asRtcJoinId");
    }

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    public void j_(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: f */
    public ByteviewUser mo216151f() {
        return this.f157319e;
    }

    /* renamed from: k */
    public C62527d mo216165k() {
        return this.f157317c;
    }

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    /* renamed from: a */
    public void mo212579a(List<Participant> list, boolean z, String str, TriggerType triggerType, HashSet<String> hashSet) {
        Intrinsics.checkParameterIsNotNull(list, "sortedParticipants");
        Intrinsics.checkParameterIsNotNull(str, "asRtcJoinId");
        Intrinsics.checkParameterIsNotNull(triggerType, "triggerType");
        String str2 = this.f157315a;
        C60700b.m235851b(str2, "[onParticipantChange]", ' ' + str + ", isViewValid " + m244456n());
        if (m244456n()) {
            m244453b(list, z, str, triggerType, hashSet);
            m244459q();
        }
    }

    /* renamed from: l */
    private final MeetingPageModel m244454l() {
        return this.f157317c.mo216216b();
    }

    /* renamed from: q */
    private final void m244459q() {
        m244455m();
        m244457o();
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: b */
    public int mo216141b() {
        return this.f157317c.mo216219c();
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: c */
    public int mo216145c() {
        return this.f157317c.mo216222e();
    }

    /* renamed from: n */
    private final boolean m244456n() {
        Iterator<AbsGridContentControl.IGridContentViewListener> it = this.f157316b.iterator();
        while (it.hasNext()) {
            AbsGridContentControl.IGridContentViewListener next = it.next();
            if (next != null && next.mo216158c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    private final boolean m244458p() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        AbstractC62485a az = meeting.az();
        Intrinsics.checkExpressionValueIsNotNull(az, "meeting.fullScreenVideoControl");
        return az.mo216034a();
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: d */
    public boolean mo216148d() {
        if (mo216149e() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: i */
    public void mo216154i() {
        Iterator<AbsGridContentControl.IGridContentViewListener> it = this.f157316b.iterator();
        while (it.hasNext()) {
            AbsGridContentControl.IGridContentViewListener next = it.next();
            if (next != null) {
                next.mo216159d();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: j */
    public void mo216155j() {
        Iterator<AbsGridContentControl.IGridContentViewListener> it = this.f157316b.iterator();
        while (it.hasNext()) {
            AbsGridContentControl.IGridContentViewListener next = it.next();
            if (next != null) {
                next.mo216161j();
            }
        }
    }

    /* renamed from: o */
    private final void m244457o() {
        C60700b.m235843a(this.f157315a, "[refreshView]", "refreshViewPager");
        Iterator<AbsGridContentControl.IGridContentViewListener> it = this.f157316b.iterator();
        while (it.hasNext()) {
            AbsGridContentControl.IGridContentViewListener next = it.next();
            if (next != null) {
                next.mo216157b();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: e */
    public int mo216149e() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        C61383d I = meeting.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        C61388g b = I.mo212494b();
        Intrinsics.checkExpressionValueIsNotNull(b, "meeting.meetingData.participantData");
        return b.mo212600e().size();
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: h */
    public void mo216153h() {
        String str = this.f157315a;
        C60700b.m235851b(str, "[refresh]", "isViewValid: " + m244456n());
        if (m244456n()) {
            m244459q();
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: a */
    public void mo216137a() {
        C60700b.m235851b(this.f157315a, "[initMeetingPageManager]", "---initMeetingPageManager---.");
        this.f157317c.mo216213a(0);
        this.f157319e = this.f157318d;
        this.f157317c.mo216212a();
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.mo212163w().mo219612f();
    }

    /* renamed from: m */
    private final void m244455m() {
        AbsSingleInstanceControl aE;
        if (m244458p()) {
            C60700b.m235851b(this.f157315a, "[updateStreamSubscribe]", "fullscreen is show. No need to update stream.");
            return;
        }
        C61303k kVar = this.mMeeting;
        if (!(kVar == null || (aE = kVar.aE()) == null || !aE.mo208293c())) {
            C61303k kVar2 = this.mMeeting;
            Intrinsics.checkExpressionValueIsNotNull(kVar2, "mMeeting");
            if (kVar2.mo212067p() != DisplayMode.ACTIVITY) {
                return;
            }
        }
        String str = this.f157315a;
        C60700b.m235851b(str, "[updateStreamSubscribe2]", " Page is : " + mo216141b());
        MeetingPageModel l = m244454l();
        if (l == null) {
            C60700b.m235861e(this.f157315a, "[updateStreamSubscribe3]", "Error: no current page.");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C60775q.m236137a(l.mo216180d(), "[updateStreamSubscribe4]Show page is not showing");
        for (MeetingPageModel meetingPageModel : this.f157317c.mo216223f()) {
            Intrinsics.checkExpressionValueIsNotNull(meetingPageModel, "pageModel");
            for (C62526c cVar : meetingPageModel.mo216174a()) {
                cVar.mo214365b();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        String str2 = this.f157315a;
        C60700b.m235843a(str2, "[updateStreamSubscribe4]", "method duration: " + currentTimeMillis2);
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: g */
    public void mo216152g() {
        if (mo216148d()) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            C61383d I = meeting.mo212091I();
            Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
            C61388g b = I.mo212494b();
            Intrinsics.checkExpressionValueIsNotNull(b, "meeting.meetingData.participantData");
            List<Participant> e = b.mo212600e();
            for (Participant participant : e) {
                Intrinsics.checkExpressionValueIsNotNull(participant, "participant");
                if (participant.getStatus() != Participant.Status.ON_THE_CALL) {
                    return;
                }
            }
            Iterator<Participant> it = e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Participant next = it.next();
                if (!ParticipantUtil.m248714a(next, this.f157319e)) {
                    Intrinsics.checkExpressionValueIsNotNull(next, "participant");
                    this.f157319e = new ByteviewUser(next.getId(), next.getDeviceId(), next.getParticipantType());
                    break;
                }
            }
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            C61383d I2 = meeting2.mo212091I();
            Intrinsics.checkExpressionValueIsNotNull(I2, "meeting.meetingData");
            C61388g b2 = I2.mo212494b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "meeting.meetingData.participantData");
            List<Participant> e2 = b2.mo212600e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "meeting.meetingData.part…Data.validParticipantList");
            m244453b(e2, false, "", TriggerType.SWITCH_FLOAT_WINDOW, null);
            m244459q();
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: a */
    public MeetingPageModel mo216136a(int i) {
        return this.f157317c.mo216220c(i);
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: b */
    public void mo216142b(AbsGridContentControl.IGridContentViewListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f157316b.remove(aVar);
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: c */
    public C62526c mo216146c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "gridId");
        return this.f157317c.mo216210a(str);
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: d */
    public MeetingPageModel mo216147d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "pageId");
        return this.f157317c.mo216217b(str);
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: b */
    public void mo216143b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
        Iterator<AbsGridContentControl.IGridContentViewListener> it = this.f157316b.iterator();
        while (it.hasNext()) {
            AbsGridContentControl.IGridContentViewListener next = it.next();
            if (next != null) {
                next.mo216156a(str);
            }
        }
    }

    /* renamed from: c */
    public void mo216163c(int i) {
        this.f157317c.mo216213a(i);
    }

    /* renamed from: f */
    public boolean mo216164f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
        MeetingPageModel l = m244454l();
        if (l != null) {
            return l.mo216177a(str);
        }
        return false;
    }

    public GridContentControl(C61303k kVar) {
        super(kVar);
        ByteviewUser byteviewUser = new ByteviewUser(VideoChatModuleDependency.m236630c(), VideoChatModuleDependency.m236629b(), ParticipantType.LARK_USER);
        this.f157318d = byteviewUser;
        this.f157319e = byteviewUser;
        this.f157317c.mo216214a(kVar, VideoChatModuleDependency.m236629b());
        if (kVar == null) {
            Intrinsics.throwNpe();
        }
        kVar.mo212092J().mo212520a(this);
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: e */
    public void mo216150e(String str) {
        List<Participant> d = this.f157317c.mo216221d();
        if (d != null) {
            if (d == null) {
                Intrinsics.throwNpe();
            }
            for (Participant participant : d) {
                if (ParticipantUtil.m248716a(participant, str)) {
                    ParticipantSettings participantSettings = participant.getParticipantSettings();
                    Intrinsics.checkExpressionValueIsNotNull(participantSettings, "data.participantSettings");
                    boolean isCameraMuted = participantSettings.isCameraMuted();
                    ParticipantSettings participantSettings2 = participant.getParticipantSettings();
                    Intrinsics.checkExpressionValueIsNotNull(participantSettings2, "data.participantSettings");
                    participantSettings2.setCameraMuted(true);
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                    mo216143b(str);
                    ParticipantSettings participantSettings3 = participant.getParticipantSettings();
                    Intrinsics.checkExpressionValueIsNotNull(participantSettings3, "data.participantSettings");
                    participantSettings3.setCameraMuted(isCameraMuted);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: a */
    public void mo216138a(Participant participant) {
        String str;
        if (participant != null) {
            String id = participant.getId();
            ParticipantType participantType = participant.getParticipantType();
            C61303k meeting = getMeeting();
            if (meeting != null) {
                str = meeting.mo212055d();
            } else {
                str = null;
            }
            C60700b.m235851b(this.f157315a, "[cancelInvite]", "  [uid]" + id + "  [meeting id]" + str);
            if (!TextUtils.isEmpty(id) && !TextUtils.isEmpty(str)) {
                if (getMeeting() != null) {
                    C61303k meeting2 = getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                    if (meeting2.mo212056e() != null) {
                        m244452a("vc_meeting_page_onthecall", "cancel", (JSONObject) null, getMeeting());
                    }
                }
                VcBizSender.m249240b(CollectionsKt.arrayListOf(new ByteviewUser(id, participant.getDeviceId(), participantType)), str).mo219896d();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: b */
    public boolean mo216144b(int i) {
        String str = this.f157315a;
        C60700b.m235851b(str, "[onVpPageSelected]", m244456n() + ", onVpPageSelected page: " + i);
        MeetingPageModel c = this.f157317c.mo216220c(i);
        if (c == null) {
            return false;
        }
        MeetingPageModel c2 = this.f157317c.mo216220c(mo216141b());
        if (i == mo216141b()) {
            Intrinsics.checkExpressionValueIsNotNull(c2, "oldPageModel");
            if (TextUtils.equals(c.mo216181e(), c2.mo216181e())) {
                return false;
            }
        }
        mo216163c(i);
        this.f157317c.mo216215a(mo216165k().mo216221d(), "", false, TriggerType.PAGE_CHANGE, (HashSet<String>) null);
        this.f157317c.mo216218b(i);
        if (m244458p()) {
            return true;
        }
        m244459q();
        return true;
    }

    /* renamed from: a */
    public void mo216162a(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        if (videoChatInMeetingInfo == null || getMeeting() == null) {
            C60700b.m235864f(this.f157315a, "[onInMeetingInfoUpdate]", " activity = null || data == null || meeting == nul");
            return;
        }
        if (videoChatInMeetingInfo.getVideoChatSettings() != null) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            C61383d I = meeting.mo212091I();
            Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
            C61388g b = I.mo212494b();
            Intrinsics.checkExpressionValueIsNotNull(b, "meeting.meetingData.participantData");
            if (b.mo212601f() != null) {
                C61303k meeting2 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                if (!Intrinsics.areEqual(meeting2.mo212055d(), videoChatInMeetingInfo.getId())) {
                    String str = this.f157315a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("current meeting = ");
                    C61303k meeting3 = getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
                    sb.append(meeting3.mo212054c());
                    sb.append(", push id = ");
                    sb.append(videoChatInMeetingInfo.getId());
                    C60700b.m235864f(str, "[onInMeetingInfoUpdate3]", sb.toString());
                    return;
                } else if (!m244456n()) {
                    C60700b.m235851b(this.f157315a, "[onInMeetingInfoUpdate4]", "content view is null or not create");
                    return;
                } else {
                    C61303k meeting4 = getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
                    meeting4.mo212163w().mo219611e();
                    return;
                }
            }
        }
        C60700b.m235864f(this.f157315a, "[onInMeetingInfoUpdate2]", " data = null");
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: a */
    public void mo216139a(VcByteStream vcByteStream) {
        Intrinsics.checkParameterIsNotNull(vcByteStream, "stream");
        if (mo216148d()) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.mo212102T().mo212214a(vcByteStream, StreamSpec.Scene.GRID_VIEW, StreamSpec.Resolution.FULL_SCREEN, false);
        }
        List<Participant> d = this.f157317c.mo216221d();
        if (d != null) {
            if (d == null) {
                Intrinsics.throwNpe();
            }
            for (Participant participant : d) {
                if (ParticipantUtil.m248716a(participant, vcByteStream.f152908b)) {
                    String str = vcByteStream.f152908b;
                    Intrinsics.checkExpressionValueIsNotNull(str, "stream.userId");
                    if (mo216164f(str)) {
                        C61303k meeting2 = getMeeting();
                        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                        StreamManagerGlobal T = meeting2.mo212102T();
                        StreamSpec.Scene scene = StreamSpec.Scene.GRID_VIEW;
                        StreamSpec.Resolution resolution = StreamSpec.Resolution.FULL_SCREEN;
                        ParticipantSettings participantSettings = participant.getParticipantSettings();
                        Intrinsics.checkExpressionValueIsNotNull(participantSettings, "data.participantSettings");
                        T.mo212214a(vcByteStream, scene, resolution, participantSettings.isCameraMuted());
                        String str2 = this.f157315a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("[onStreamAdd]Subscribe stream: ");
                        sb.append(vcByteStream.f152907a);
                        sb.append(", video: ");
                        ParticipantSettings participantSettings2 = participant.getParticipantSettings();
                        Intrinsics.checkExpressionValueIsNotNull(participantSettings2, "data.participantSettings");
                        sb.append(!participantSettings2.isCameraMuted());
                        C60700b.m235843a(str2, "[subscribeWhenStreamAdd]", sb.toString());
                        return;
                    }
                    String str3 = this.f157315a;
                    C60700b.m235843a(str3, "[subscribeWhenStreamAdd2]", "[onStreamAdd]Subscribe stream: " + vcByteStream.f152907a + ", no video");
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl
    /* renamed from: a */
    public void mo216140a(AbsGridContentControl.IGridContentViewListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        if (this.f157316b.size() > 0) {
            for (T t : this.f157316b) {
                String str = this.f157315a;
                C60700b.m235851b(str, "[addGridContentViewListener]", ((Object) t) + ", isActivityInvalid: " + t.mo216160i());
            }
        }
        if (!this.f157316b.contains(aVar)) {
            this.f157316b.add(aVar);
        }
    }

    /* renamed from: a */
    private final void m244452a(String str, String str2, JSONObject jSONObject, C61303k kVar) {
        VideoChat videoChat;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str2);
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            if (kVar != null) {
                videoChat = kVar.mo212056e();
            } else {
                videoChat = null;
            }
            C63726b.m249915a(str, jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.vc.meeting.model.MeetingSpecificData.OnMeetingDataChangeListener
    /* renamed from: a */
    public void mo212578a(List<Participant> list, boolean z, String str, TriggerType triggerType) {
        Intrinsics.checkParameterIsNotNull(list, "sortedParticipants");
        Intrinsics.checkParameterIsNotNull(str, "asRtcJoinId");
        Intrinsics.checkParameterIsNotNull(triggerType, "triggerType");
        if (m244456n()) {
            String str2 = this.f157315a;
            C60700b.m235844a(str2, "[onVideoSort]", "onActiveSpeakerChanged asRtcJoinId = " + str + ", hasValidAS = " + z + ',' + " triggerType = " + triggerType.name() + ", isViewValid = " + m244456n(), 10000);
            if (m244453b(list, z, str, triggerType, null) != ParticipantUtil.DIFF_TYPE.SAME) {
                m244459q();
            }
        }
    }

    /* renamed from: b */
    private final ParticipantUtil.DIFF_TYPE m244453b(List<Participant> list, boolean z, String str, TriggerType triggerType, HashSet<String> hashSet) {
        if (mo216148d()) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!ParticipantUtil.m248714a((Participant) t, this.f157319e)) {
                    arrayList.add(t);
                }
            }
            ParticipantUtil.DIFF_TYPE a = this.f157317c.mo216211a(arrayList, z, str, triggerType, hashSet);
            Intrinsics.checkExpressionValueIsNotNull(a, "mMeetingPageManager.upda…pe, newEnterParticipants)");
            return a;
        }
        this.f157319e = this.f157318d;
        ParticipantUtil.DIFF_TYPE a2 = this.f157317c.mo216211a(list, z, str, triggerType, hashSet);
        Intrinsics.checkExpressionValueIsNotNull(a2, "mMeetingPageManager.upda…pe, newEnterParticipants)");
        return a2;
    }
}
