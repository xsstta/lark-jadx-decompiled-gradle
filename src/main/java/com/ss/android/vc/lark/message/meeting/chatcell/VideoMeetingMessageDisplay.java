package com.ss.android.vc.lark.message.meeting.chatcell;

import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.dto.VideoChatContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/lark/message/meeting/chatcell/VideoMeetingMessageDisplay;", "", "()V", "getVideoMeetingMessageDisplayText", "", "content", "Lcom/ss/android/vc/dto/VideoChatContent;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.lark.message.meeting.a.d */
public final class VideoMeetingMessageDisplay {

    /* renamed from: a */
    public static final VideoMeetingMessageDisplay f153038a = new VideoMeetingMessageDisplay();

    private VideoMeetingMessageDisplay() {
    }

    /* renamed from: a */
    public final String mo211354a(VideoChatContent videoChatContent) {
        Intrinsics.checkParameterIsNotNull(videoChatContent, "content");
        return UIHelper.getString(R.string.View_G_VideoMeetingInviteLabel) + videoChatContent.meetingCard.topic;
    }
}
