package com.ss.android.lark;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.ss.android.lark.a */
public class C28472a {

    /* renamed from: a */
    static volatile AbstractC28473a f71605a;

    /* renamed from: com.ss.android.lark.a$a */
    public interface AbstractC28473a {
        /* renamed from: a */
        ScheduledExecutorService mo34073a();

        /* renamed from: b */
        Context mo34074b();
    }

    /* renamed from: a */
    public static AbstractC28473a m104336a() {
        return f71605a;
    }

    /* renamed from: a */
    public static void m104337a(AbstractC28473a aVar) {
        f71605a = aVar;
    }
}
