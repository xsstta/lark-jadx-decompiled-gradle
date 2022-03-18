package com.bytedance.apm6.cpu;

import android.text.TextUtils;
import com.bytedance.apm6.util.C3356f;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.p725f.p726a.p727a.AbstractC13853c;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.apm6.cpu.a */
public class C3223a {

    /* renamed from: b */
    private static volatile C3223a f10336b;

    /* renamed from: a */
    private CopyOnWriteArraySet<String> f10337a = new CopyOnWriteArraySet<>();

    /* renamed from: com.bytedance.apm6.cpu.a$a */
    public interface AbstractC3224a {
        /* renamed from: a */
        void mo13340a(double d, double d2, String str, AbstractC13853c.C13854a aVar, NetworkUtils.NetworkType networkType);
    }

    /* renamed from: com.bytedance.apm6.cpu.a$b */
    public interface AbstractC3225b {
        /* renamed from: a */
        boolean mo13341a();
    }

    /* renamed from: com.bytedance.apm6.cpu.a$c */
    public interface AbstractC3226c {
        /* renamed from: a */
        void mo13342a(double d);
    }

    /* renamed from: c */
    public CopyOnWriteArraySet<String> mo13339c() {
        return this.f10337a;
    }

    private C3223a() {
    }

    /* renamed from: a */
    public static C3223a m13484a() {
        if (f10336b == null) {
            synchronized (C3223a.class) {
                if (f10336b == null) {
                    f10336b = new C3223a();
                }
            }
        }
        return f10336b;
    }

    /* renamed from: b */
    public String mo13338b() {
        String a = C3356f.m13963a(this.f10337a.toArray(), "#");
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return "";
    }
}
