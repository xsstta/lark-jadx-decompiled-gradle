package com.ss.android.lark.chat.chatwindow.chat.v2.p1642c;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.o */
public class C33466o {

    /* renamed from: a */
    private List<AbstractC33467a> f86263a = new ArrayList();

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.o$a */
    public interface AbstractC33467a {
        /* renamed from: a */
        void mo123055a();

        /* renamed from: b */
        void mo123056b();
    }

    /* renamed from: a */
    public void mo123118a() {
        for (AbstractC33467a aVar : this.f86263a) {
            aVar.mo123055a();
        }
    }

    /* renamed from: b */
    public void mo123119b() {
        for (AbstractC33467a aVar : this.f86263a) {
            aVar.mo123056b();
        }
    }

    /* renamed from: a */
    public C33466o mo123117a(AbstractC33467a aVar) {
        this.f86263a.add(aVar);
        return this;
    }
}
