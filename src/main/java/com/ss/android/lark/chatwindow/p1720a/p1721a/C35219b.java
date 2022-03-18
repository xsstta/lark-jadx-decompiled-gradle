package com.ss.android.lark.chatwindow.p1720a.p1721a;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatWindowPrepareData;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.chatwindow.a.a.b */
public class C35219b {

    /* renamed from: a */
    public boolean f90951a;

    /* renamed from: b */
    public String f90952b;

    /* renamed from: c */
    public int f90953c;

    /* renamed from: d */
    public boolean f90954d;

    /* renamed from: e */
    public String f90955e;

    /* renamed from: f */
    public Chat f90956f;

    /* renamed from: g */
    public ChatChatter f90957g;

    /* renamed from: h */
    public ChatChatter f90958h;

    /* renamed from: i */
    public boolean f90959i;

    /* renamed from: j */
    public OpenApp f90960j;

    /* renamed from: k */
    public TopicGroup f90961k;

    /* renamed from: l */
    public boolean f90962l;

    /* renamed from: m */
    public String f90963m;

    /* renamed from: n */
    public boolean f90964n;

    /* renamed from: o */
    public Long f90965o = 100001L;

    /* renamed from: p */
    public Bundle f90966p;

    /* renamed from: a */
    public boolean mo129685a() {
        if (TextUtils.isEmpty(this.f90955e)) {
            Log.m165383e("ChatWindowInitData", "open chat failed，chatId is null!!!");
            return false;
        }
        Chat chat = this.f90956f;
        if (chat == null) {
            Log.m165383e("ChatWindowInitData", "open chat failed，chat is null，chatId:" + this.f90955e);
            return false;
        } else if (chat.getType() == Chat.Type.P2P && this.f90957g == null) {
            Log.m165383e("ChatWindowInitData", "open chat failed，chatter is null, chatId:" + this.f90955e);
            return false;
        } else if (this.f90958h != null) {
            return true;
        } else {
            Log.m165383e("ChatWindowInitData", "open chat failed, self is null，chatId:" + this.f90955e);
            return false;
        }
    }

    /* renamed from: a */
    public static C35219b m137557a(ChatBundle chatBundle, ChatWindowPrepareData chatWindowPrepareData) {
        C35219b bVar = new C35219b();
        bVar.f90951a = chatBundle.f74044r;
        bVar.f90952b = chatBundle.f74030d;
        bVar.f90954d = chatBundle.f74036j;
        bVar.f90953c = chatBundle.f74029c;
        bVar.f90955e = chatBundle.f74027a;
        bVar.f90959i = chatBundle.f74041o;
        bVar.f90963m = chatBundle.f74031e;
        bVar.f90965o = Long.valueOf(chatBundle.f74049w);
        bVar.f90964n = chatBundle.f74051y;
        bVar.f90966p = chatBundle.f74047u;
        if (chatWindowPrepareData == null) {
            chatWindowPrepareData = chatBundle.f74040n;
        }
        if (chatWindowPrepareData != null) {
            bVar.f90956f = chatWindowPrepareData.chat;
            bVar.f90957g = chatWindowPrepareData.p2pChatter;
            bVar.f90958h = chatWindowPrepareData.self;
            bVar.f90960j = chatWindowPrepareData.openApp;
            bVar.f90961k = chatWindowPrepareData.topicGroup;
        }
        bVar.f90959i = chatBundle.f74041o;
        bVar.f90962l = chatBundle.f74048v;
        return bVar;
    }
}
