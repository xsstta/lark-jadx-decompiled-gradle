package com.ss.android.bytedcert.manager;

/* renamed from: com.ss.android.bytedcert.manager.a */
public class C28396a {

    /* renamed from: a */
    public AbstractC28398b f71408a;

    /* renamed from: b */
    private boolean f71409b;

    /* renamed from: c */
    private byte[] f71410c;

    /* renamed from: d */
    private volatile int f71411d;

    /* renamed from: e */
    private volatile int f71412e;

    /* renamed from: f */
    private String f71413f;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.bytedcert.manager.a$a */
    public static class C28397a {

        /* renamed from: a */
        static final C28396a f71414a = new C28396a();
    }

    /* renamed from: com.ss.android.bytedcert.manager.a$b */
    public interface AbstractC28398b {
        /* renamed from: a */
        void mo101175a(String str);
    }

    /* renamed from: a */
    public static C28396a m104125a() {
        return C28397a.f71414a;
    }

    /* renamed from: b */
    public boolean mo101170b() {
        return this.f71409b;
    }

    /* renamed from: c */
    public byte[] mo101171c() {
        return this.f71410c;
    }

    /* renamed from: d */
    public int mo101172d() {
        return this.f71411d;
    }

    /* renamed from: e */
    public int mo101173e() {
        return this.f71412e;
    }

    /* renamed from: f */
    public String mo101174f() {
        return this.f71413f;
    }

    /* renamed from: a */
    public static void m104126a(String str) {
        if (m104125a().mo101170b()) {
            m104125a().f71408a.mo101175a(str + "\n");
        }
    }
}
