package com.bytedance.ee.falcon.inspector.p603a;

import android.util.Log;
import com.bytedance.ee.falcon.inspector.p604b.C12648a;
import com.bytedance.ee.falcon.inspector.protocol.module.Console;

/* renamed from: com.bytedance.ee.falcon.inspector.a.a */
public class C12643a {
    /* renamed from: a */
    public static void m52422a(C12648a aVar, Console.MessageLevel messageLevel, Console.MessageSource messageSource, String str) {
        Log.d("CLog", str);
        Console.C12690b bVar = new Console.C12690b();
        bVar.f33954a = messageSource;
        bVar.f33955b = messageLevel;
        bVar.f33956c = str;
        Console.C12691c cVar = new Console.C12691c();
        cVar.f33957a = bVar;
        aVar.mo48022a("Console.messageAdded", cVar);
    }
}
