package com.ss.android.lark.download;

import com.ss.android.lark.biz.core.api.AbstractC29572q;
import com.ss.android.lark.biz.core.api.AbstractC29575r;
import com.ss.android.lark.download.service.p1811a.C36842a;
import com.ss.android.lark.download.service.p1811a.C36853c;

/* renamed from: com.ss.android.lark.download.a */
public class C36840a {

    /* renamed from: a */
    private static volatile AbstractC29575r f94690a;

    /* renamed from: b */
    private static volatile AbstractC36841b f94691b;

    /* renamed from: c */
    public static AbstractC36841b m145413c() {
        return f94691b;
    }

    /* renamed from: b */
    public AbstractC29572q mo135983b() {
        return C36842a.m145418a();
    }

    /* renamed from: a */
    public AbstractC29575r mo135982a() {
        if (f94690a == null) {
            synchronized (C36840a.class) {
                if (f94690a == null) {
                    f94690a = new C36853c();
                }
            }
        }
        return f94690a;
    }

    public C36840a(AbstractC36841b bVar) {
        f94691b = bVar;
    }
}
