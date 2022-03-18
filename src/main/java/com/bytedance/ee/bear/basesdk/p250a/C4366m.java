package com.bytedance.ee.bear.basesdk.p250a;

import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13608f;
import com.bytedance.ee.util.p701d.C13615c;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.bytedance.ee.bear.basesdk.a.m */
public class C4366m {
    /* renamed from: a */
    public static void m18008a() {
        C13479a.m54764b("PreLoadClass", "PreLoadClass start ");
        C13608f.m55249a($$Lambda$m$Qej2z7bIZYYuYIzyvKLXNXBos8.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m18010c() {
        if (((Boolean) new PersistenceSharedPreference("debug_config").mo34038b("docs_preload_class", Boolean.TRUE)).booleanValue()) {
            long currentTimeMillis = System.currentTimeMillis();
            m18009b();
            C13479a.m54764b("PreLoadClass", "PreLoadClass end  time: " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: b */
    private static void m18009b() {
        InputStream inputStream;
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        try {
            inputStream = C13615c.f35773a.getAssets().open("preloadclass.txt");
        } catch (Exception e) {
            C13479a.m54759a("PreLoadClass", "doPreLoadClass... err happens ", e);
            inputStream = null;
        }
        if (inputStream != null) {
            try {
                if (inputStream.available() > 0) {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            try {
                                Class.forName(readLine);
                            } catch (Throwable th2) {
                                C13479a.m54764b("PreLoadClass", "PreLoadClass1 e " + th2);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                C13479a.m54761a("PreLoadClass", th);
                                return;
                            } finally {
                                C5890a.m23701a((Closeable) inputStream);
                                C5890a.m23701a(bufferedReader);
                            }
                        }
                    }
                    bufferedReader2 = bufferedReader;
                    C5890a.m23701a((Closeable) inputStream);
                    C5890a.m23701a(bufferedReader2);
                }
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                C13479a.m54761a("PreLoadClass", th);
                return;
            }
        }
        C13479a.m54758a("PreLoadClass", "convertString()... steam is invalid");
        C5890a.m23701a((Closeable) inputStream);
        C5890a.m23701a(bufferedReader2);
    }
}
