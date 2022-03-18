package com.ss.android.lark.mail.impl;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.mulprocess.C43202a;
import com.ss.android.lark.mail.impl.mulprocess.webprocess.AbstractC43226a;
import ee.android.framework.manis.p3450a.C68182c;

/* renamed from: com.ss.android.lark.mail.impl.b */
public class C41816b {

    /* renamed from: a */
    private static AbstractC41849c f106162a;

    /* renamed from: b */
    private static C43202a f106163b;

    /* renamed from: c */
    private static Context f106164c;

    /* renamed from: a */
    public static AbstractC41849c m166115a() {
        Context context = f106164c;
        if (context != null && C68182c.m264835b(context)) {
            return f106162a;
        }
        if (f106163b == null) {
            f106163b = new C43202a();
        }
        return f106163b;
    }

    /* renamed from: a */
    public static void m166117a(AbstractC43226a aVar) {
        if (f106163b == null) {
            f106163b = new C43202a();
        }
        f106163b.mo154619a(aVar);
    }

    /* renamed from: a */
    public static void m166116a(Context context, AbstractC41849c cVar) {
        Log.m165389i("Host", "init");
        if (cVar != null) {
            f106164c = context;
            Log.m165388i("Host init mAppContext:" + f106164c);
            f106162a = cVar;
            return;
        }
        throw new IllegalArgumentException("Host hostDependency null");
    }
}
