package com.ss.android.lark.chat.chatwindow.chat.p1616c.p1617a;

import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33213c;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.c.a.b */
public class C33195b implements AbstractC33200e<C33213c> {

    /* renamed from: a */
    private AtomicInteger f85399a = new AtomicInteger(0);

    /* renamed from: a */
    public String mo122410b(C33213c cVar) {
        return cVar.mo122430a() + "_" + this.f85399a.incrementAndGet();
    }

    /* renamed from: b */
    public String mo122408a(C33213c cVar) {
        return cVar.mo122430a() + "_" + this.f85399a.get();
    }
}
