package com.ss.android.lark.dfcore.p1801c;

import com.ss.android.lark.log.Log;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.dfcore.c.c */
public class C36605c {

    /* renamed from: a */
    private static volatile C36605c f94180a;

    /* renamed from: b */
    private ConcurrentHashMap<String, AbstractC36602a> f94181b = new ConcurrentHashMap<>();

    /* renamed from: b */
    public Collection<AbstractC36602a> mo135034b() {
        return this.f94181b.values();
    }

    private C36605c() {
    }

    /* renamed from: a */
    public static C36605c m144424a() {
        if (f94180a == null) {
            synchronized (C36605c.class) {
                if (f94180a == null) {
                    f94180a = new C36605c();
                }
            }
        }
        return f94180a;
    }

    /* renamed from: b */
    public AbstractC36602a mo135033b(String str) {
        Log.m165379d("DFCore", "getInstallStateListener: " + str);
        return this.f94181b.get(str);
    }

    /* renamed from: a */
    public synchronized void mo135031a(String str) {
        Log.m165379d("DFCore", "removeInstallStateListener: " + str);
        AbstractC36602a b = mo135033b(str);
        if (b != null) {
            b.mo135029d();
            this.f94181b.remove(str);
        }
    }

    /* renamed from: a */
    public synchronized void mo135032a(String str, AbstractC36602a aVar) {
        Log.m165379d("DFCore", "addInstallStateListener: " + str);
        if (mo135033b(str) == null) {
            this.f94181b.put(str, aVar);
            aVar.mo135028c();
        } else {
            Log.m165379d("DFCore", "addInstallStateListener: listener has been registered before");
        }
    }
}
