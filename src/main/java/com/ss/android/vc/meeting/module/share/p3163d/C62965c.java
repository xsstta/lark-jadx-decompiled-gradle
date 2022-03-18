package com.ss.android.vc.meeting.module.share.p3163d;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.share.C62955c;
import com.ss.android.vc.meeting.module.share.VideoChatShareItem;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.share.d.c */
public class C62965c {
    /* renamed from: a */
    public static AbstractC61222a m246555a(Activity activity, C61303k kVar, C62955c cVar, List<VideoChatShareItem> list) {
        if (DesktopUtil.m144307b()) {
            return new VideoChatShareDesktopDialog(activity, kVar, cVar, true);
        }
        return new VideoChatShareDialog(activity, kVar, cVar, true, true, list);
    }

    /* renamed from: a */
    public static AbstractC61222a m246556a(Activity activity, C61303k kVar, C62955c cVar, boolean z) {
        if (DesktopUtil.m144307b()) {
            return new VideoChatShareDesktopDialog(activity, kVar, cVar);
        }
        return new VideoChatShareDialog(activity, kVar, cVar, z);
    }

    /* renamed from: a */
    public static AbstractC61222a m246557a(Activity activity, String str, VideoChat.MeetingSource meetingSource, C62955c cVar) {
        VideoChat videoChat = new VideoChat();
        videoChat.setId(str);
        videoChat.setMeetingSource(meetingSource);
        return new VideoChatShareDialog(activity, new C61303k(videoChat), cVar, true);
    }
}
