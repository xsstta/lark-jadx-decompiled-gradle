package com.bytedance.framwork.core.p748a;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* renamed from: com.bytedance.framwork.core.a.a */
public abstract class AbstractC14109a {

    /* renamed from: a */
    private String f37078a;

    /* renamed from: b */
    private AbstractC14112c f37079b;

    /* renamed from: c */
    protected String f37080c;

    /* renamed from: d */
    protected AbstractC14111b f37081d;

    /* renamed from: e */
    protected C14117d f37082e;

    /* renamed from: f */
    private long f37083f;

    /* renamed from: com.bytedance.framwork.core.a.a$a */
    public static abstract class AbstractC14110a implements AbstractC14111b {
        @Override // com.bytedance.framwork.core.p748a.AbstractC14109a.AbstractC14111b
        /* renamed from: c */
        public int mo51866c() {
            return 4;
        }

        @Override // com.bytedance.framwork.core.p748a.AbstractC14109a.AbstractC14111b
        /* renamed from: d */
        public long mo51867d() {
            return 15000;
        }

        @Override // com.bytedance.framwork.core.p748a.AbstractC14109a.AbstractC14111b
        /* renamed from: e */
        public String mo51868e() {
            return null;
        }

        @Override // com.bytedance.framwork.core.p748a.AbstractC14109a.AbstractC14111b
        /* renamed from: f */
        public long mo51869f() {
            return 604800000;
        }
    }

    /* renamed from: com.bytedance.framwork.core.a.a$b */
    public interface AbstractC14111b {
        /* renamed from: a */
        String mo51870a();

        /* renamed from: b */
        List<String> mo51871b();

        /* renamed from: c */
        int mo51866c();

        /* renamed from: d */
        long mo51867d();

        /* renamed from: e */
        String mo51868e();

        /* renamed from: f */
        long mo51869f();
    }

    /* renamed from: com.bytedance.framwork.core.a.a$c */
    public interface AbstractC14112c {
        /* renamed from: a */
        boolean mo51872a();

        /* renamed from: b */
        long mo51873b();

        /* renamed from: c */
        boolean mo51874c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo51858a(byte[] bArr, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo51860a(String str, byte[] bArr);

    /* renamed from: a */
    public long mo51856a() {
        return this.f37083f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC14111b mo51862b() {
        return this.f37081d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC14112c mo51864c() {
        return this.f37079b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo51865d() {
        return this.f37078a;
    }

    /* renamed from: a */
    public void mo51857a(long j) {
        this.f37083f = j;
    }

    /* renamed from: b */
    public void mo51863b(String str) {
        this.f37078a = str;
    }

    /* renamed from: a */
    public boolean mo51859a(String str) {
        return mo51861a(C14114c.m57115a(str));
    }

    /* renamed from: a */
    public boolean mo51861a(byte[] bArr) {
        return this.f37082e.mo51878a(this.f37080c, bArr);
    }

    public AbstractC14109a(Context context, AbstractC14111b bVar, AbstractC14112c cVar) {
        this.f37081d = bVar;
        this.f37079b = cVar;
        if (bVar == null) {
            throw new IllegalArgumentException("config is null.");
        } else if (cVar != null) {
            String a = bVar.mo51870a();
            this.f37080c = a;
            if (!TextUtils.isEmpty(a)) {
                C14117d a2 = C14117d.m57118a(context);
                this.f37082e = a2;
                a2.mo51877a(this.f37080c, this);
                return;
            }
            throw new IllegalArgumentException("type is empty.");
        } else {
            throw new IllegalArgumentException("responseConfig is null");
        }
    }
}
