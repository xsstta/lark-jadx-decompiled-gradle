package com.ss.android.vc.meeting.framework.manager.p3106a;

import com.ss.android.vc.entity.VideoChatCombinedInfo;

/* renamed from: com.ss.android.vc.meeting.framework.manager.a.a */
public class C61270a {
    /* renamed from: a */
    public static String m238391a(VideoChatCombinedInfo videoChatCombinedInfo) {
        if (videoChatCombinedInfo == null || videoChatCombinedInfo.getVideoChatInMeetingInfo() == null) {
            return null;
        }
        return videoChatCombinedInfo.getVideoChatInMeetingInfo().getId();
    }
}
