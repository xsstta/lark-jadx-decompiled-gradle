package com.ss.android.lark.monitor;

import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.monitor.r */
public class C48248r {

    /* renamed from: a */
    static volatile AbstractC48249a f121464a;

    /* renamed from: com.ss.android.lark.monitor.r$a */
    public interface AbstractC48249a {
        /* renamed from: a */
        ScheduledExecutorService mo102824a();

        /* renamed from: b */
        JSONObject mo102825b();
    }

    /* renamed from: a */
    public static AbstractC48249a m190383a() {
        return f121464a;
    }

    /* renamed from: a */
    public static void m190384a(AbstractC48249a aVar) {
        f121464a = aVar;
    }
}
