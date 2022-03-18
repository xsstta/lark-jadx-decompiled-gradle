package com.ss.android.lark.chat.chatwindow.chat.p1616c.p1617a;

import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.AbstractC33211a;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.c.a.c */
public class C33196c {

    /* renamed from: a */
    private Map<Class, AbstractC33200e> f85400a;

    /* renamed from: b */
    private C33199d f85401b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.c.a.c$a */
    public static final class C33198a {

        /* renamed from: a */
        public static final C33196c f85402a = new C33196c();
    }

    /* renamed from: a */
    public static C33196c m128273a() {
        return C33198a.f85402a;
    }

    private C33196c() {
        this.f85400a = new HashMap(3);
        this.f85401b = new C33199d();
    }

    /* renamed from: a */
    public String mo122414a(AbstractC33211a aVar) {
        return m128274c(aVar).mo122410b(aVar);
    }

    /* renamed from: b */
    public String mo122416b(AbstractC33211a aVar) {
        return m128274c(aVar).mo122408a(aVar);
    }

    /* renamed from: c */
    private AbstractC33200e m128274c(AbstractC33211a aVar) {
        AbstractC33200e eVar = this.f85400a.get(aVar.getClass());
        if (eVar == null) {
            return this.f85401b;
        }
        return eVar;
    }

    /* renamed from: a */
    public void mo122415a(Class<? extends AbstractC33211a> cls, AbstractC33200e eVar) {
        if (eVar == null) {
            Log.m165383e("DataPreLoadKeyManager", "Unable to register for a empty provider");
        } else {
            this.f85400a.put(cls, eVar);
        }
    }
}
