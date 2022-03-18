package com.ss.android.lark.chatwindow.p1720a.p1722b;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.utils.C34339g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.chatwindow.a.b.a */
public class C35222a {

    /* renamed from: a */
    private Map<Chat.MessagePosition, AbstractC35227d> f90978a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatwindow.a.b.a$a */
    public static class C35224a {

        /* renamed from: a */
        static C35222a f90979a = new C35222a();
    }

    /* renamed from: a */
    public static C35222a m137559a() {
        return C35224a.f90979a;
    }

    private C35222a() {
        this.f90978a = new HashMap(2);
    }

    /* renamed from: a */
    public AbstractC35227d mo129686a(Chat chat) {
        Chat.MessagePosition e = C34339g.m133171e(chat);
        AbstractC35227d dVar = this.f90978a.get(e);
        if (dVar == null) {
            if (e == Chat.MessagePosition.NEWEST_UNREAD) {
                dVar = new C35225b();
            } else {
                dVar = new C35226c();
            }
            this.f90978a.put(e, dVar);
        }
        return dVar;
    }
}
