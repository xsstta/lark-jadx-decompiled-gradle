package com.ss.android.lark.p2851u.p2852a;

import com.ss.android.lark.chat.entity.timetip.PushChatTimeTipNotify;

/* renamed from: com.ss.android.lark.u.a.w */
public class C57334w {
    /* renamed from: a */
    public static PushChatTimeTipNotify m222233a(com.bytedance.lark.pb.im.v1.PushChatTimeTipNotify pushChatTimeTipNotify) {
        PushChatTimeTipNotify pushChatTimeTipNotify2 = new PushChatTimeTipNotify();
        pushChatTimeTipNotify2.mo126053b(pushChatTimeTipNotify.chat_id);
        pushChatTimeTipNotify2.mo126051a(pushChatTimeTipNotify.copy_writing);
        pushChatTimeTipNotify2.mo126050a(PushChatTimeTipNotify.m131907b(pushChatTimeTipNotify.status.getValue()));
        return pushChatTimeTipNotify2;
    }
}
