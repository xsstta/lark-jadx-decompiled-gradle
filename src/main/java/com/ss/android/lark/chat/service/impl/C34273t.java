package com.ss.android.lark.chat.service.impl;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.service.impl.p1682b.AbstractC34179a;
import com.ss.android.lark.chat.service.impl.p1682b.C34184c;
import com.ss.android.lark.chat.service.impl.p1682b.C34185d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.service.impl.t */
public class C34273t {

    /* renamed from: a */
    private static volatile Map<Message.Type, AbstractC34179a> f88560a;

    /* renamed from: a */
    private static AbstractC34179a m132942a(Message message) {
        if (f88560a == null) {
            f88560a = new HashMap(4);
            f88560a.put(Message.Type.MEDIA, new C34184c());
            f88560a.put(Message.Type.POST, new C34185d());
        }
        return f88560a.get(message.getType());
    }

    /* renamed from: a */
    public static void m132943a(Message message, IGetDataCallback<String> iGetDataCallback) {
        AbstractC34179a a = m132942a(message);
        if (a != null) {
            a.mo126722a(message, iGetDataCallback, false);
        } else {
            C32848e.m126401b().mo121264b(message.getSendMessageParams(), iGetDataCallback);
        }
    }

    /* renamed from: b */
    public static void m132944b(Message message, IGetDataCallback<String> iGetDataCallback) {
        AbstractC34179a a = m132942a(message);
        if (a != null) {
            a.mo126722a(message, iGetDataCallback, true);
        } else {
            C32848e.m126401b().mo121086a(message.getSendMessageParams(), iGetDataCallback);
        }
    }
}
