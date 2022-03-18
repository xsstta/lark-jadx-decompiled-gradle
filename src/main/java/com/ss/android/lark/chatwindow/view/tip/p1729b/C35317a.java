package com.ss.android.lark.chatwindow.view.tip.p1729b;

import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.util.ChatTabFgUtil;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.utils.C34339g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.chatwindow.view.tip.b.a */
public class C35317a implements AbstractC35321c {

    /* renamed from: a */
    private final AbstractC35320b<Chat> f91281a;

    /* renamed from: b */
    private final AbstractC35318a f91282b;

    /* renamed from: c */
    private final AbstractC35319b f91283c;

    /* renamed from: com.ss.android.lark.chatwindow.view.tip.b.a$a */
    public interface AbstractC35318a {
        /* renamed from: a */
        boolean mo122140a();
    }

    /* renamed from: com.ss.android.lark.chatwindow.view.tip.b.a$b */
    public interface AbstractC35319b {
        /* renamed from: a */
        int mo122141a();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: h */
    public boolean mo129968h() {
        return this.f91282b.mo122140a();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: k */
    public int mo129971k() {
        return this.f91283c.mo122141a();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: a */
    public int mo129960a() {
        return this.f91281a.get().getUnReadBadgeCount();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: b */
    public int mo129962b() {
        return this.f91281a.get().getLastMessagePositionBadgeCount();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: c */
    public int mo129963c() {
        return this.f91281a.get().getLastMessagePosition();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: d */
    public Chat.MessagePosition mo129964d() {
        return C34339g.m133171e(this.f91281a.get());
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: e */
    public int mo129965e() {
        return this.f91281a.get().getFirstMessagePosition();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: f */
    public int mo129966f() {
        return this.f91281a.get().getReadPositionBadgeCount();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: g */
    public int mo129967g() {
        return this.f91281a.get().getReadPosition();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: j */
    public boolean mo129970j() {
        return ChatTabFgUtil.f86815a.mo123637a(this.f91281a.get());
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: i */
    public Map<String, Integer> mo129969i() {
        HashMap hashMap = new HashMap();
        hashMap.put("singular", Integer.valueOf((int) R.string.Lark_Legacy_NewMessageCountSingular));
        hashMap.put("plural", Integer.valueOf((int) R.string.Lark_Legacy_NewMessageCount));
        return hashMap;
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c
    /* renamed from: a */
    public int mo129961a(Message message) {
        return message.getPosition();
    }

    public C35317a(AbstractC35320b<Chat> bVar, AbstractC35318a aVar, AbstractC35319b bVar2) {
        this.f91281a = bVar;
        this.f91282b = aVar;
        this.f91283c = bVar2;
    }
}
