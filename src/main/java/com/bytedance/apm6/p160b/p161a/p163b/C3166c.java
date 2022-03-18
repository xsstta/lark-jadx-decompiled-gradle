package com.bytedance.apm6.p160b.p161a.p163b;

import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p160b.p161a.C3159a;
import com.bytedance.apm6.p160b.p161a.C3162b;
import com.bytedance.apm6.util.C3352c;
import com.bytedance.apm6.util.C3354d;
import com.bytedance.apm6.util.p195b.C3350b;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.b.a.b.c */
public class C3166c {

    /* renamed from: a */
    private volatile boolean f10164a;

    /* renamed from: b */
    private File f10165b;

    /* renamed from: com.bytedance.apm6.b.a.b.c$a */
    private static class C3168a {

        /* renamed from: a */
        public static final C3166c f10167a = new C3166c();
    }

    /* renamed from: a */
    public static C3166c m13250a() {
        return C3168a.f10167a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13201b() {
        m13252c();
        File file = this.f10165b;
        if (file != null) {
            file.listFiles(new FileFilter() {
                /* class com.bytedance.apm6.p160b.p161a.p163b.C3166c.C31671 */

                public boolean accept(File file) {
                    boolean z = true;
                    try {
                        String name = file.getName();
                        int lastIndexOf = name.lastIndexOf(".bin");
                        if (lastIndexOf != -1) {
                            if (System.currentTimeMillis() - C3169d.m13257a(Long.parseLong(name.substring(0, lastIndexOf))) < 604800000) {
                                z = false;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    if (z) {
                        if (C3318a.m13915u()) {
                            String str = C3159a.f10110a;
                            C3350b.m13932a(str, "deleteExpireHeader:" + file.getName());
                        }
                        C3352c.m13947b(file);
                    }
                    return false;
                }
            });
        }
    }

    /* renamed from: c */
    private synchronized void m13252c() {
        if (!this.f10164a) {
            try {
                File file = new File(C3162b.m13177a(), "header");
                this.f10165b = file;
                if (!file.exists()) {
                    this.f10165b.mkdirs();
                }
            } catch (Throwable th) {
                C3350b.m13937d("APM", "header store init error " + th.toString());
            }
            this.f10164a = true;
        }
    }

    /* renamed from: b */
    private String m13251b(String str) {
        return str + ".bin";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3163a mo13199a(String str) {
        byte[] a;
        m13252c();
        if (this.f10165b == null || (a = C3352c.m13945a(new File(this.f10165b, m13251b(str)))) == null) {
            return null;
        }
        return C3169d.m13258a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13200a(String str, C3163a aVar) {
        JSONObject a;
        m13252c();
        if (this.f10165b != null && (a = C3169d.m13259a(aVar)) != null) {
            File file = new File(this.f10165b, m13251b(str));
            FileChannel fileChannel = null;
            try {
                fileChannel = new FileOutputStream(file).getChannel();
                fileChannel.write(ByteBuffer.wrap(a.toString().getBytes()));
            } catch (Throwable th) {
                C3354d.m13949a(fileChannel);
                throw th;
            }
            C3354d.m13949a(fileChannel);
        }
    }
}
