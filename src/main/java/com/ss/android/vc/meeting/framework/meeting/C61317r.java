package com.ss.android.vc.meeting.framework.meeting;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatCombinedInfo;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.r */
public class C61317r extends C61312m implements AbstractC61299g {
    @Override // com.ss.android.vc.meeting.framework.meeting.C61312m, com.ss.android.vc.meeting.framework.meeting.AbstractC61299g
    public void onMeetingCombinedInfo(VideoChatCombinedInfo videoChatCombinedInfo) {
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.C61312m, com.ss.android.vc.meeting.framework.meeting.AbstractC61299g
    public void onMeetingVideoChat(VideoChat videoChat) {
    }

    public C61317r(C61303k kVar) {
        super(kVar, DisplayMode.WINDOW);
    }

    /* renamed from: a */
    public void mo212206a(DisplayMode displayMode) {
        if (this.f153607a != null) {
            this.f153607a.mo212188a(displayMode, hashCode());
        }
    }
}
