package com.ss.android.lark.chatwindow.view.tip.p1729b;

import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.chatwindow.view.tip.b.d */
public class C35322d implements AbstractC35321c {

    /* renamed from: a */
    private AbstractC35320b<Chat> f91284a;

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
    /* renamed from: b */
    public int mo129962b() {
        return this.f91284a.get().getLastThreadPositionBadgeCount();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: c */
    public int mo129963c() {
        return this.f91284a.get().getLastThreadPosition();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: d */
    public Chat.MessagePosition mo129964d() {
        return C34339g.m133171e(this.f91284a.get());
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: f */
    public int mo129966f() {
        return this.f91284a.get().getReadThreadPositionBadgeCount();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: g */
    public int mo129967g() {
        return this.f91284a.get().getReadThreadPosition();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: a */
    public int mo129960a() {
        Chat chat = this.f91284a.get();
        return Math.min(chat.getLastThreadPositionBadgeCount() - chat.getReadThreadPositionBadgeCount(), chat.getLastThreadPosition() - chat.getReadThreadPosition());
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: i */
    public Map<String, Integer> mo129969i() {
        HashMap hashMap = new HashMap();
        hashMap.put("singular", Integer.valueOf((int) R.string.Lark_TopicChannel_OneNewTopic));
        hashMap.put("plural", Integer.valueOf((int) R.string.Lark_TopicChannel_XNewTopics));
        return hashMap;
    }

    public C35322d(AbstractC35320b<Chat> bVar) {
        this.f91284a = bVar;
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: a */
    public int mo129961a(Message message) {
        if (message.isAtAll()) {
            return message.getPosition();
        }
        return 0;
    }
}
