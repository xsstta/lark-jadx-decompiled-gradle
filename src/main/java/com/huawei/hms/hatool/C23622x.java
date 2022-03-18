package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.huawei.secure.android.common.p1021a.p1026d.C23808a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.huawei.hms.hatool.x */
public class C23622x {

    /* renamed from: b */
    public static C23622x f58340b = new C23622x();

    /* renamed from: a */
    public C23623a f58341a = new C23623a();

    /* renamed from: com.huawei.hms.hatool.x$a */
    public class C23623a {

        /* renamed from: a */
        public String f58342a;

        /* renamed from: b */
        public String f58343b;

        /* renamed from: c */
        public String f58344c;

        /* renamed from: d */
        public long f58345d = 0;

        public C23623a() {
        }

        /* renamed from: a */
        public void mo83172a(long j) {
            C23622x.this.f58341a.f58345d = j;
        }

        /* renamed from: a */
        public void mo83173a(String str) {
            C23622x.this.f58341a.f58344c = str;
        }

        /* renamed from: b */
        public void mo83174b(String str) {
            C23622x.this.f58341a.f58342a = str;
        }

        /* renamed from: c */
        public void mo83175c(String str) {
            C23622x.this.f58341a.f58343b = str;
        }
    }

    /* renamed from: f */
    public static C23622x m85946f() {
        return f58340b;
    }

    /* renamed from: a */
    public String mo83167a() {
        return this.f58341a.f58344c;
    }

    /* renamed from: b */
    public long mo83168b() {
        return this.f58341a.f58345d;
    }

    /* renamed from: c */
    public String mo83169c() {
        return this.f58341a.f58343b;
    }

    /* renamed from: d */
    public void mo83170d() {
        long b = mo83168b();
        if (b == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            String e = mo83171e();
            if (TextUtils.isEmpty(e)) {
                C23625y.m85982f("hmsSdk", "get rsa pubkey config error");
                return;
            }
            String b2 = C23808a.m87019b(16);
            String a = C23600e.m85678a(e, b2);
            this.f58341a.mo83174b(e);
            this.f58341a.mo83172a(currentTimeMillis);
            this.f58341a.mo83175c(b2);
            this.f58341a.mo83173a(a);
            return;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (currentTimeMillis2 - b > 43200000) {
            String str = this.f58341a.f58342a;
            String b3 = C23808a.m87019b(16);
            String a2 = C23600e.m85678a(str, b3);
            this.f58341a.mo83172a(currentTimeMillis2);
            this.f58341a.mo83175c(b3);
            this.f58341a.mo83173a(a2);
        }
    }

    /* renamed from: e */
    public final String mo83171e() {
        InputStream inputStream;
        Throwable th;
        try {
            inputStream = AbstractC23596b.m85619f().getResources().getAssets().open("hianalytics_njjn");
            try {
                String a = r0.m85904a(inputStream);
                r0.m85905a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                try {
                    C23625y.m85982f("hmsSdk", "read pubKey error,the file is corrupted");
                    r0.m85905a((Closeable) inputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    r0.m85905a((Closeable) inputStream);
                    throw th;
                }
            }
        } catch (IOException unused2) {
            inputStream = null;
            C23625y.m85982f("hmsSdk", "read pubKey error,the file is corrupted");
            r0.m85905a((Closeable) inputStream);
            return null;
        } catch (Throwable th3) {
            inputStream = null;
            th = th3;
            r0.m85905a((Closeable) inputStream);
            throw th;
        }
    }
}
