package com.ss.android.lark.chatwindow.view.tip.p1729b;

import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.chatwindow.view.tip.b.e */
public class C35323e implements AbstractC35321c {

    /* renamed from: a */
    private AbstractC35320b<ThreadTopic> f91285a;

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: e */
    public int mo129965e() {
        return 0;
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: h */
    public boolean mo129968h() {
        return false;
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: j */
    public /* synthetic */ boolean mo129970j() {
        return AbstractC35321c.CC.$default$j(this);
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: k */
    public /* synthetic */ int mo129971k() {
        return AbstractC35321c.CC.$default$k(this);
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: d */
    public Chat.MessagePosition mo129964d() {
        return Chat.MessagePosition.RECENT_LEFT;
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: b */
    public int mo129962b() {
        return this.f91285a.get().getLastMsgPosBadgeCount();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: c */
    public int mo129963c() {
        return this.f91285a.get().getLastMsgPos();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: f */
    public int mo129966f() {
        return this.f91285a.get().getReadPosBadgeCount();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: g */
    public int mo129967g() {
        return this.f91285a.get().getReadPos();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: a */
    public int mo129960a() {
        ThreadTopic threadTopic = this.f91285a.get();
        return Math.min(threadTopic.getLastMsgPos() - threadTopic.getReadPos(), threadTopic.getLastMsgPosBadgeCount() - threadTopic.getReadPosBadgeCount());
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: i */
    public Map<String, Integer> mo129969i() {
        HashMap hashMap = new HashMap();
        hashMap.put("singular", Integer.valueOf((int) R.string.Lark_Legacy_NewMessageCountSingular));
        hashMap.put("plural", Integer.valueOf((int) R.string.Lark_Legacy_NewMessageCount));
        return hashMap;
    }

    public C35323e(AbstractC35320b<ThreadTopic> bVar) {
        this.f91285a = bVar;
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: a */
    public int mo129961a(Message message) {
        return message.getThreadPosition();
    }
}
