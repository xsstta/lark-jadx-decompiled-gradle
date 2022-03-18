package com.ss.sys.ces.p3236g;

import android.content.Context;
import com.huawei.hms.android.HwBuildEx;
import com.ss.sys.ces.C65386a;
import java.util.Locale;
import javax.net.ssl.TrustManager;
import p001a.p002a.p003a.p004a.C0000a;
import p001a.p002a.p003a.p004a.C0007b;
import p001a.p002a.p003a.p004a.C0008c;
import p001a.p002a.p003a.p004a.C0009d;

/* renamed from: com.ss.sys.ces.g.a */
public abstract class AbstractC65402a implements C0000a.AbstractC0004d {

    /* renamed from: d */
    private static String f164666d = "";

    /* renamed from: a */
    private final C0000a.C0003c f164667a;

    /* renamed from: b */
    private final C0000a.C0005e f164668b;

    /* renamed from: c */
    private final String f164669c;

    AbstractC65402a(int i, C0000a.C0003c cVar) {
        String a = m256481a(i);
        if (a != null) {
            this.f164669c = C0007b.m17c(0) + a;
            this.f164668b = m256480a();
            this.f164667a = cVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private static synchronized C0000a.C0005e m256480a() {
        C0000a.C0005e eVar;
        synchronized (AbstractC65402a.class) {
            eVar = new C0000a.C0005e();
            eVar.f18a = false;
            eVar.f19b = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
            eVar.f20c = "application/octet-stream";
            eVar.f21d = "POST";
            eVar.f22e = f164666d;
            eVar.f23f = new C0008c();
            eVar.f24g = new TrustManager[]{new C0009d()};
        }
        return eVar;
    }

    /* renamed from: a */
    private static String m256481a(int i) {
        String str = i != 0 ? i != 1 ? i != 2 ? null : "u" : "r" : "s";
        if (str == null) {
            return null;
        }
        return String.format(Locale.CHINA, "/v3/%s?os=0&m=%d", str, 3);
    }

    /* renamed from: a */
    public static synchronized void m256482a(String str) {
        synchronized (AbstractC65402a.class) {
            if (f164666d.length() <= 0 || !f164666d.equals(str)) {
                f164666d = str;
            }
        }
    }

    /* renamed from: a */
    protected static boolean m256483a(Context context, Object obj, int i) {
        AbstractC65402a aVar;
        byte[] bArr;
        if (i == 222) {
            try {
                aVar = new C65403b(context);
            } catch (Throwable unused) {
            }
        } else {
            aVar = i == 224 ? new C65405d(context) : i == 223 ? new C65404c(context) : null;
        }
        if (!(aVar == null || (bArr = (byte[]) C65386a.metas(i, context, obj)) == null)) {
            if (bArr.length != 0) {
                return aVar.m256484a(bArr);
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m256484a(byte[] bArr) {
        return new C0000a(this.f164668b, this, this.f164669c).mo6a(bArr, this.f164667a) == 0;
    }
}
