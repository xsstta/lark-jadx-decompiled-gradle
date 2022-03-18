package com.ss.android.vc.meeting.module.base;

import androidx.lifecycle.AbstractC1142af;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatCombinedInfo;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61299g;
import com.ss.android.vc.meeting.framework.meeting.ByteRtc;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.C61312m;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.multi.presenter.MeetingPageModel;
import com.ss.android.vc.meeting.module.p3119f.AbstractC61653b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.module.base.o */
public class C61437o extends AbstractC1142af implements AbstractC61299g, AbstractC61653b {
    private DisplayMode mDisplayMode = DisplayMode.NONE;
    private List<AbstractC61299g> mList = new CopyOnWriteArrayList();
    private C61312m mMeetingFacade;
    private List<AbstractC61653b> pageSwitchListeners = new CopyOnWriteArrayList();

    /* access modifiers changed from: protected */
    public C61312m getMeetingFacade() {
        return this.mMeetingFacade;
    }

    public void destroy() {
        List<AbstractC61299g> list = this.mList;
        if (list != null) {
            list.clear();
        }
        C61312m mVar = this.mMeetingFacade;
        if (mVar != null) {
            mVar.mo212177a();
        }
    }

    /* access modifiers changed from: protected */
    public ByteRtc getByteRtc() {
        C61312m mVar = this.mMeetingFacade;
        if (mVar != null) {
            return mVar.mo212182c();
        }
        return null;
    }

    public C61303k getMeeting() {
        C61312m mVar = this.mMeetingFacade;
        if (mVar != null) {
            return mVar.mo212181b();
        }
        return null;
    }

    public void setDisplayMode(DisplayMode displayMode) {
        this.mDisplayMode = displayMode;
    }

    public void removeMeetingListener(AbstractC61299g gVar) {
        this.mList.remove(gVar);
    }

    public void removePageSwitchListener(AbstractC61653b bVar) {
        this.pageSwitchListeners.remove(bVar);
    }

    public void addMeetingListener(AbstractC61299g gVar) {
        if (!this.mList.contains(gVar)) {
            this.mList.add(gVar);
        }
    }

    public void addPageSwitchListener(AbstractC61653b bVar) {
        if (!this.pageSwitchListeners.contains(bVar)) {
            this.pageSwitchListeners.add(bVar);
        }
    }

    public boolean init(String str) {
        C61312m mVar = new C61312m(str, this.mDisplayMode);
        this.mMeetingFacade = mVar;
        mVar.mo212178a(this);
        return true;
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61299g
    public void onMeetingCombinedInfo(VideoChatCombinedInfo videoChatCombinedInfo) {
        for (AbstractC61299g gVar : this.mList) {
            gVar.onMeetingCombinedInfo(videoChatCombinedInfo);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61299g
    public void onMeetingVideoChat(VideoChat videoChat) {
        for (AbstractC61299g gVar : this.mList) {
            gVar.onMeetingVideoChat(videoChat);
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3119f.AbstractC61653b
    public void onVpPageSwitch(MeetingPageModel meetingPageModel, MeetingPageModel meetingPageModel2) {
        for (AbstractC61653b bVar : this.pageSwitchListeners) {
            bVar.onVpPageSwitch(meetingPageModel, meetingPageModel2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61299g
    public void onStateTransform(int i, int i2, int i3) {
        C60700b.m235851b("MeetingViewModel@", "onStateTransform", i + " " + i2 + "" + i3);
        for (AbstractC61299g gVar : this.mList) {
            gVar.onStateTransform(i, i2, i3);
        }
    }
}
