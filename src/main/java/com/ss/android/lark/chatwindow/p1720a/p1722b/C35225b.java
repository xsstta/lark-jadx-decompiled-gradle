package com.ss.android.lark.chatwindow.p1720a.p1722b;

import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.chatwindow.a.b.b */
public class C35225b implements AbstractC35227d {
    @Override // com.ss.android.lark.chatwindow.p1720a.p1722b.AbstractC35227d
    /* renamed from: a */
    public void mo129687a(Channel channel, int i, int i2, boolean z) {
        Log.m165389i("chatwindow", "clear Badge, channel: " + channel + " maxPosition: " + i);
        C32848e.m126401b().mo121251a(channel, i, i2, z);
    }
}
