package com.ss.android.lark.chat.chatwindow.chat.model.p1636b;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.C29990c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.b.a */
public class C33397a {

    /* renamed from: a */
    private static ConcurrentHashMap<String, AbstractC33398a> f86017a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static ConcurrentHashMap<String, Object> f86018b = new ConcurrentHashMap<>();

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.b.a$a */
    public interface AbstractC33398a<T> {
        /* renamed from: a */
        T mo122929a();

        /* renamed from: b */
        String mo122930b();
    }

    /* renamed from: a */
    public static void m129383a() {
        CoreThreadPool.getDefault().getFixedThreadPool().execute($$Lambda$a$14NJO5yTiwnkQMiqGGqMTqz4SOM.INSTANCE);
    }

    static {
        m129384a(new ChatResourceLoader(C29990c.m110930b().mo134528a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m129385b() {
        Object a;
        for (Map.Entry<String, AbstractC33398a> entry : f86017a.entrySet()) {
            String key = entry.getKey();
            AbstractC33398a value = entry.getValue();
            if (!f86018b.contains(key) && (a = value.mo122929a()) != null) {
                f86018b.put(key, a);
            }
        }
    }

    /* renamed from: a */
    private static void m129384a(AbstractC33398a aVar) {
        String a = m129382a(aVar.getClass(), aVar.mo122930b());
        if (!f86017a.contains(a)) {
            f86017a.put(a, aVar);
        }
    }

    /* renamed from: a */
    private static String m129382a(Class<? extends AbstractC33398a> cls, String str) {
        return cls.toString() + str;
    }
}
