package com.ss.android.vc.service.impl;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import com.ss.android.vc.dto.VideoChatContent;
import com.ss.android.vc.entity.p3092a.C60932d;
import com.ss.android.vc.lark.message.meeting.p3101b.C61107a;
import com.ss.android.vc.service.AbstractC63632a;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import com.ss.android.vcxp.annotation.XSingleton;

@XClass(isSingleton = true, runOnProcess = XProcess.VC)
public class ChatVideoMeetingCardService implements AbstractC63632a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.service.impl.ChatVideoMeetingCardService$a */
    public static final class C63648a {

        /* renamed from: a */
        public static final ChatVideoMeetingCardService f160667a = new ChatVideoMeetingCardService();
    }

    @XSingleton
    /* renamed from: a */
    public static ChatVideoMeetingCardService m249562a() {
        return C63648a.f160667a;
    }

    @Override // com.ss.android.vc.service.AbstractC63632a
    @XMethod
    public VideoChatContent parseVideoChatContent(Object obj) {
        return C60932d.m237031a(obj);
    }

    @Override // com.ss.android.vc.service.AbstractC63632a
    /* renamed from: a */
    public AbstractC58992f<MessageInfo, ? extends RecyclerView.ViewHolder> mo220138a(Context context, Chat chat) {
        return new C61107a(context);
    }
}
