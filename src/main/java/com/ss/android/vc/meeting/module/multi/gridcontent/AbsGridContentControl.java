package com.ss.android.vc.meeting.module.multi.gridcontent;

import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.irtc.VcByteStream;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import com.ss.android.vc.meeting.module.multi.presenter.C62526c;
import com.ss.android.vc.meeting.module.multi.presenter.MeetingPageModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u00016B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0010H&J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0010H&J\b\u0010\u0019\u001a\u00020\u0010H&J\b\u0010\u001a\u001a\u00020\u0006H&J\b\u0010\u001b\u001a\u00020\u000eH&J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH&J\u0012\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010!H&J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0010H&J\b\u0010$\u001a\u00020\u0006H&J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001eH&J\b\u0010&\u001a\u00020\u0006H&J\u0012\u0010'\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J\u0010\u0010(\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u001eH&J\u0012\u0010,\u001a\u0004\u0018\u00010\u00172\u0006\u0010-\u001a\u00020\u001eH&J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0010H&J\u0010\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0012H&J\b\u00101\u001a\u00020\u0006H&J\u0010\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u000204H&J\b\u00105\u001a\u00020\u0006H&¨\u00067"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/gridcontent/AbsGridContentControl;", "Lcom/ss/android/vc/meeting/module/base/BaseControl;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "addGridContentViewListener", "", "listener", "Lcom/ss/android/vc/meeting/module/multi/gridcontent/AbsGridContentControl$IGridContentViewListener;", "cancelInvite", "participant", "Lcom/ss/android/vc/entity/Participant;", "dumpPageInfos", "force", "", "getCurrentPage", "", "getFloatByteviewUser", "Lcom/ss/android/vc/entity/ByteviewUser;", "getMeetingPageManager", "Lcom/ss/android/vc/meeting/module/multi/presenter/MeetingPageManager;", "getPageCount", "getPageModel", "Lcom/ss/android/vc/meeting/module/multi/presenter/MeetingPageModel;", "page", "getParticipantCount", "initMeetingPageManager", "isTwoInMeeting", "isUserShowing", "rtcJoinId", "", "onInMeetingInfoUpdate", "inMeetingInfo", "Lcom/ss/android/vc/entity/VideoChatInMeetingInfo;", "onVpPageSelected", "newPage", "refresh", "refreshGridViewByRtcJoinId", "refreshWhenGoToBackground", "refreshWhenStreamRemove", "removeGridContentViewListener", "retrieveGridModelById", "Lcom/ss/android/vc/meeting/module/multi/presenter/MeetingGridModel;", "gridId", "retrievePageModelById", "pageId", "setCurrentPage", "setFloatByteviewUser", "user", "showGridContent", "subscribeWhenStreamAdd", "stream", "Lcom/ss/android/vc/irtc/VcByteStream;", "switchMasterVideoView", "IGridContentViewListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.gridcontent.a */
public abstract class AbsGridContentControl extends AbstractC61420b {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\nH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/gridcontent/AbsGridContentControl$IGridContentViewListener;", "", "getPageViewByRtcJoinId", "Lcom/ss/android/vc/meeting/module/multi/InMeetingPageView;", "rtcJoinId", "", "isActivityInvalid", "", "isViewValid", "refreshGridViewByRtcJoinId", "", "refreshView", "refreshWhenGoToBackground", "showGridContent", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.gridcontent.a$a */
    public interface IGridContentViewListener {
        /* renamed from: a */
        void mo216156a(String str);

        /* renamed from: b */
        void mo216157b();

        /* renamed from: c */
        boolean mo216158c();

        /* renamed from: d */
        void mo216159d();

        /* renamed from: i */
        boolean mo216160i();

        /* renamed from: j */
        void mo216161j();
    }

    /* renamed from: a */
    public abstract MeetingPageModel mo216136a(int i);

    /* renamed from: a */
    public abstract void mo216137a();

    /* renamed from: a */
    public abstract void mo216138a(Participant participant);

    /* renamed from: a */
    public abstract void mo216139a(VcByteStream vcByteStream);

    /* renamed from: a */
    public abstract void mo216140a(IGridContentViewListener aVar);

    /* renamed from: b */
    public abstract int mo216141b();

    /* renamed from: b */
    public abstract void mo216142b(IGridContentViewListener aVar);

    /* renamed from: b */
    public abstract void mo216143b(String str);

    /* renamed from: b */
    public abstract boolean mo216144b(int i);

    /* renamed from: c */
    public abstract int mo216145c();

    /* renamed from: c */
    public abstract C62526c mo216146c(String str);

    /* renamed from: d */
    public abstract MeetingPageModel mo216147d(String str);

    /* renamed from: d */
    public abstract boolean mo216148d();

    /* renamed from: e */
    public abstract int mo216149e();

    /* renamed from: e */
    public abstract void mo216150e(String str);

    /* renamed from: f */
    public abstract ByteviewUser mo216151f();

    /* renamed from: g */
    public abstract void mo216152g();

    /* renamed from: h */
    public abstract void mo216153h();

    /* renamed from: i */
    public abstract void mo216154i();

    /* renamed from: j */
    public abstract void mo216155j();

    public AbsGridContentControl(C61303k kVar) {
        super(kVar);
    }
}
