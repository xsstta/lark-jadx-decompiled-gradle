package com.bytedance.memory.p847c;

import com.bytedance.memory.heap.C20092a;
import com.bytedance.memory.p846b.C20060b;
import com.bytedance.memory.p846b.C20063c;
import java.io.File;

/* renamed from: com.bytedance.memory.c.a */
public class C20071a {

    /* renamed from: a */
    private static volatile C20071a f49013a;

    private C20071a() {
    }

    /* renamed from: b */
    public void mo68040b() {
        C20060b.f49007b.mo68035a(new Runnable() {
            /* class com.bytedance.memory.p847c.C20071a.RunnableC200721 */

            public void run() {
                try {
                    long d = C20092a.m73301a().mo68094d();
                    if (d != 0 && System.currentTimeMillis() - d > 259200000) {
                        C20092a.m73301a().mo68104n();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }, "DumpFileController-checkWidgetFolder");
    }

    /* renamed from: a */
    public static C20071a m73238a() {
        if (f49013a == null) {
            synchronized (C20071a.class) {
                if (f49013a == null) {
                    f49013a = new C20071a();
                }
            }
        }
        return f49013a;
    }

    /* renamed from: b */
    private boolean m73239b(File file) {
        C20063c.m73220a("lastModified %d now %d", Long.valueOf(file.lastModified()), Long.valueOf(System.currentTimeMillis()));
        if (System.currentTimeMillis() - file.lastModified() > 604800000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo68039a(File file) {
        File[] listFiles;
        if (file.isFile()) {
            if (m73239b(file) || file.length() == 0) {
                file.delete();
            }
        } else if (file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                mo68039a(file2);
            }
        }
    }
}
