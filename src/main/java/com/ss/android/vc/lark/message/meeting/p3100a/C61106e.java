package com.ss.android.vc.lark.message.meeting.p3100a;

import com.ss.android.lark.chat.export.entity.message.MessageType;
import com.ss.android.lark.chat.export.entity.message.OpenMessageInfo;
import com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter;
import com.ss.android.vc.dto.VideoChatContent;

/* renamed from: com.ss.android.vc.lark.message.meeting.a.e */
public class C61106e implements IOpenMsgVOConverter<VideoMeetingContentVO> {
    @Override // com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter
    /* renamed from: a */
    public MessageType mo120418a() {
        return MessageType.VIDEO_CHAT;
    }

    /* renamed from: a */
    public VideoMeetingContentVO mo120419b(OpenMessageInfo cVar) {
        VideoChatContent videoChatContent = (VideoChatContent) cVar.getMessage().getContent();
        if (videoChatContent == null) {
            return null;
        }
        if (videoChatContent.type == 1 || videoChatContent.type == 2) {
            return new VideoMeetingContentVO(videoChatContent);
        }
        return null;
    }

    @Override // com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter
    /* renamed from: c */
    public CharSequence mo120420c(OpenMessageInfo cVar) {
        return VideoMeetingMessageDisplay.f153038a.mo211354a((VideoChatContent) cVar.getMessage().getContent());
    }
}
