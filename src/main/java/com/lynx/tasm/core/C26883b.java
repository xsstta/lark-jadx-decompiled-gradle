package com.lynx.tasm.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.provider.AbstractC26936c;
import com.lynx.tasm.provider.AbstractC26942i;
import com.lynx.tasm.provider.C26937d;
import com.lynx.tasm.provider.C26938e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.lynx.tasm.core.b */
public class C26883b {

    /* renamed from: a */
    private static C26883b f66742a;

    /* renamed from: b */
    private LruCache<String, Integer> f66743b = new LruCache<>(100);

    private C26883b() {
    }

    /* renamed from: a */
    public static C26883b m97717a() {
        if (f66742a == null) {
            synchronized (C26883b.class) {
                if (f66742a == null) {
                    f66742a = new C26883b();
                }
            }
        }
        return f66742a;
    }

    /* renamed from: b */
    public void mo95671b(C26937d dVar, AbstractC26936c cVar) {
        boolean z;
        AbstractC26942i h = LynxEnv.m96123e().mo94101h();
        if (h != null) {
            z = true;
        } else {
            z = false;
        }
        LLog.m96420a(z);
        if (h == null) {
            C26938e eVar = new C26938e();
            eVar.mo95794b("don't have ResProvider.Can't Get Resource.");
            cVar.mo50300b(eVar);
            return;
        }
        h.mo50297a(dVar, cVar);
    }

    /* renamed from: a */
    public Integer mo95668a(Context context, String str) {
        String str2;
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            String replace = str.toLowerCase().replace("-", "_");
            Integer num = this.f66743b.get(replace);
            if (num != null) {
                return num;
            }
            int indexOf = replace.indexOf(".");
            if (indexOf <= 0 || indexOf >= replace.length()) {
                str2 = null;
            } else {
                str2 = replace.substring(0, indexOf);
            }
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            synchronized (this) {
                Integer valueOf = Integer.valueOf(context.getResources().getIdentifier(replace, str2, context.getPackageName()));
                if (valueOf.intValue() > 0) {
                    this.f66743b.put(replace, valueOf);
                }
                return valueOf;
            }
        }
    }

    /* renamed from: b */
    public void mo95672b(String str, AbstractC26936c cVar) {
        Integer a = mo95668a(LynxEnv.m96123e().mo94110o(), str.substring(7));
        C26938e eVar = new C26938e();
        if (a != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[]{a.byteValue()});
            eVar.mo95790a(byteArrayInputStream);
            cVar.mo50299a(eVar);
            try {
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        } else {
            eVar.mo95794b("resource not found!");
            cVar.mo50300b(eVar);
        }
    }

    /* renamed from: a */
    public void mo95669a(final C26937d dVar, final AbstractC26936c cVar) {
        final C26938e eVar = new C26938e();
        final String a = dVar.mo95782a();
        if (TextUtils.isEmpty(a)) {
            eVar.mo95794b("url is empty!");
            cVar.mo50300b(eVar);
            LLog.m96427d("lynx_ResManager", "url:" + a + " is empty!");
            return;
        }
        C26880a.m97713a().execute(new Runnable() {
            /* class com.lynx.tasm.core.C26883b.RunnableC268841 */

            public void run() {
                if ((a.startsWith("http://") || a.startsWith("https://")) && a.length() > 8) {
                    C26883b.this.mo95671b(dVar, cVar);
                } else if (a.startsWith("asset:///") && a.length() > 9) {
                    C26883b.this.mo95670a(a, cVar);
                } else if (!a.startsWith("res:///") || a.length() <= 7) {
                    LLog.m96418a(new RuntimeException("illegal url:" + a));
                    C26938e eVar = eVar;
                    eVar.mo95794b("url is illegal:" + a);
                    cVar.mo50300b(eVar);
                } else {
                    C26883b.this.mo95672b(a, cVar);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo95670a(String str, AbstractC26936c cVar) {
        C26938e eVar = new C26938e();
        InputStream inputStream = null;
        try {
            inputStream = LynxEnv.m96123e().mo94110o().getAssets().open(str.substring(9));
            StringBuilder sb = new StringBuilder(inputStream.available());
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                sb.append(new String(bArr, 0, read));
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(sb.toString().getBytes());
            eVar.mo95790a(byteArrayInputStream);
            cVar.mo50299a(eVar);
            byteArrayInputStream.close();
            if (inputStream == null) {
                return;
            }
        } catch (IOException e) {
            eVar.mo95794b(e.toString());
            cVar.mo50300b(eVar);
            if (0 == 0) {
                return;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            throw th;
        }
        try {
            inputStream.close();
        } catch (IOException unused2) {
        }
    }
}
