package com.lynx.tasm.behavior.ui.canvas;

import android.content.ContextWrapper;
import android.net.Uri;
import android.util.Log;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.he.lynx.loader.Loader;
import com.he.lynx.loader.Resolver;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.canvas.C26758a;
import com.lynx.tasm.core.C26883b;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.provider.AbstractC26936c;
import com.lynx.tasm.provider.C26937d;
import com.lynx.tasm.provider.C26938e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.lynx.tasm.behavior.ui.canvas.b */
public class C26777b implements Loader {

    /* renamed from: a */
    private ContextWrapper f66395a;

    /* renamed from: b */
    private C26758a.AbstractC26776g f66396b;

    /* renamed from: a */
    public static Thread m97203a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    @Override // com.he.lynx.loader.Loader
    public byte[] loadSync(String str) {
        return mo95230a(str, (Resolver) null);
    }

    /* renamed from: a */
    public static byte[] m97204a(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            int length = bArr[i3].length;
            if (length != 0) {
                System.arraycopy(bArr[i3], 0, bArr3, i2, length);
                i2 += length;
            }
        }
        return bArr3;
    }

    /* renamed from: a */
    private String m97202a(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        Log.d("HeliumResLoader", "redirectUrl " + str);
        int indexOf = str.indexOf("?_lynxId=");
        if (indexOf > 0) {
            str2 = str.substring(str.lastIndexOf("?_lynxId=") + 9);
            str = str.substring(0, indexOf);
        }
        if (str2 != null) {
            try {
                return JSProxy.m97704a(Long.parseLong(str2), str);
            } catch (Exception e) {
                Log.d("redirectUrl", "exception:" + e.toString());
            }
        }
        Log.d("HeliumResLoader", "redirectUrl to" + str);
        return str;
    }

    @Override // com.he.lynx.loader.Loader
    public Uri loadMedia(String str) {
        String a = m97202a(str);
        Log.d("HeliumResLoader", "loadMedia " + a);
        if (a.startsWith("http://") || a.startsWith("https://")) {
            return Uri.parse(a);
        }
        if (a.startsWith("file://")) {
            if (!a.startsWith("file:///")) {
                a = "file:///" + a.substring(7);
            }
            C26758a.AbstractC26776g gVar = this.f66396b;
            if (gVar != null) {
                String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE"};
                if (!gVar.mo95228a(strArr)) {
                    this.f66396b.mo95227a(strArr, new C26758a.AbstractC26775f() {
                        /* class com.lynx.tasm.behavior.ui.canvas.C26777b.C267814 */
                    });
                }
            }
            return Uri.parse(a);
        }
        Log.e("HeliumResLoader", "loadMedia do not support:" + a);
        return Uri.parse(a);
    }

    public C26777b(ContextWrapper contextWrapper, C26758a.AbstractC26776g gVar) {
        this.f66395a = contextWrapper;
        this.f66396b = gVar;
    }

    /* renamed from: c */
    private void m97206c(String str, final Resolver resolver) {
        C26883b.m97717a().mo95669a(new C26937d(str), new AbstractC26936c() {
            /* class com.lynx.tasm.behavior.ui.canvas.C26777b.C267825 */

            @Override // com.lynx.tasm.provider.AbstractC26936c
            /* renamed from: a */
            public void mo50299a(C26938e eVar) {
                try {
                    C26777b.this.mo95229a(eVar.mo95797e(), resolver);
                } catch (Exception e) {
                    eVar.mo95794b(e.toString());
                }
            }

            @Override // com.lynx.tasm.provider.AbstractC26936c
            /* renamed from: b */
            public void mo50300b(C26938e eVar) {
                String c = eVar.mo95795c();
                Log.e("HeliumResLoader", "requestResource error " + c);
                resolver.reject(new IOException(c));
            }
        });
    }

    @Override // com.he.lynx.loader.Loader
    public void load(final String str, final Resolver resolver) {
        m97203a(new Thread(new Runnable() {
            /* class com.lynx.tasm.behavior.ui.canvas.C26777b.RunnableC267781 */

            public void run() {
                C26777b.this.mo95230a(str, resolver);
            }
        })).start();
    }

    @Override // com.he.lynx.loader.Loader
    public void loadUrl(final String str, final Resolver resolver) {
        m97203a(new Thread(new Runnable() {
            /* class com.lynx.tasm.behavior.ui.canvas.C26777b.RunnableC267792 */

            public void run() {
                C26777b.this.mo95230a(str, resolver);
            }
        })).start();
    }

    /* renamed from: b */
    private byte[] m97205b(String str, final Resolver resolver) throws Exception {
        final File file;
        if (str.startsWith("/")) {
            file = new File(str);
        } else {
            file = new File("/" + str);
        }
        C26758a.AbstractC26776g gVar = this.f66396b;
        if (gVar == null) {
            return mo95229a(new FileInputStream(file), resolver);
        }
        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE"};
        if (gVar.mo95228a(strArr)) {
            return mo95229a(new FileInputStream(file), resolver);
        }
        this.f66396b.mo95227a(strArr, new C26758a.AbstractC26775f() {
            /* class com.lynx.tasm.behavior.ui.canvas.C26777b.C267803 */
        });
        if (resolver != null) {
            return null;
        }
        LLog.m96429e("HeliumResLoader", "WARNING: PermissionProvider not set!!!");
        return mo95229a(new FileInputStream(file), (Resolver) null);
    }

    /* renamed from: a */
    public byte[] mo95229a(InputStream inputStream, Resolver resolver) throws Exception {
        int available = inputStream.available();
        if (available <= 0) {
            available = 1024;
        }
        byte[] bArr = new byte[available];
        byte[] bArr2 = new byte[0];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            byte[] bArr3 = new byte[read];
            System.arraycopy(bArr, 0, bArr3, 0, read);
            bArr2 = m97204a(bArr2, bArr3);
        }
        if (resolver != null) {
            resolver.resolve(bArr2, 0, bArr2.length);
        }
        inputStream.close();
        return bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo95230a(java.lang.String r8, com.he.lynx.loader.Resolver r9) {
        /*
        // Method dump skipped, instructions count: 338
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.canvas.C26777b.mo95230a(java.lang.String, com.he.lynx.loader.Resolver):byte[]");
    }
}
