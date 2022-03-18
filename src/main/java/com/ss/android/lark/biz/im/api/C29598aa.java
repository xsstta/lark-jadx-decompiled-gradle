package com.ss.android.lark.biz.im.api;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.biz.im.api.aa */
public class C29598aa {

    /* renamed from: a */
    private MessageInfo f74161a;

    /* renamed from: b */
    private Chat f74162b;

    /* renamed from: c */
    private ThreadTopic f74163c;

    /* renamed from: d */
    private List<MessageInfo> f74164d;

    /* renamed from: e */
    private List<MessageInfo> f74165e;

    /* renamed from: a */
    public MessageInfo mo106644a() {
        return this.f74161a;
    }

    /* renamed from: b */
    public Chat mo106645b() {
        return this.f74162b;
    }

    /* renamed from: c */
    public ThreadTopic mo106646c() {
        return this.f74163c;
    }

    /* renamed from: d */
    public List<MessageInfo> mo106647d() {
        return this.f74164d;
    }

    /* renamed from: e */
    public List<MessageInfo> mo106648e() {
        return this.f74165e;
    }

    public C29598aa(MessageInfo messageInfo, Chat chat, ThreadTopic threadTopic, List<MessageInfo> list, List<MessageInfo> list2) {
        this.f74161a = messageInfo;
        this.f74162b = chat;
        this.f74163c = threadTopic;
        this.f74164d = list;
        this.f74165e = list2;
    }
}
