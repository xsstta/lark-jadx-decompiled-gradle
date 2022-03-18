package com.tt.miniapphost.data;

/* renamed from: com.tt.miniapphost.data.e */
public class C67491e {

    /* renamed from: a */
    private C67489c f170200a;

    /* renamed from: b */
    private String f170201b;

    /* renamed from: c */
    private volatile boolean f170202c;

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapphost.data.e$a */
    public static class C67493a {

        /* renamed from: a */
        public static C67491e f170203a = new C67491e();
    }

    private C67491e() {
    }

    /* renamed from: a */
    public static C67491e m262546a() {
        return C67493a.f170203a;
    }

    /* renamed from: c */
    public String mo234319c() {
        return this.f170201b;
    }

    /* renamed from: d */
    public boolean mo234320d() {
        return this.f170202c;
    }

    /* renamed from: b */
    public C67489c mo234318b() {
        if (this.f170200a == null) {
            synchronized (C67489c.class) {
                this.f170200a = new C67489c();
            }
        }
        return this.f170200a;
    }

    /* renamed from: a */
    public void mo234316a(String str) {
        this.f170201b = str;
    }

    /* renamed from: a */
    public void mo234317a(boolean z) {
        this.f170202c = z;
    }
}
