package com.ss.android.lark.account_provider.integrator.env;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.account_provider.integrator.env.b */
public class C28519b implements IEnv {

    /* renamed from: a */
    private int f71672a;

    /* renamed from: b */
    private final String f71673b;

    @Override // com.ss.android.lark.account_provider.integrator.env.IEnv
    /* renamed from: a */
    public int mo101493a() {
        return this.f71672a;
    }

    @Override // com.ss.android.lark.account_provider.integrator.env.IEnv
    /* renamed from: b */
    public String mo101494b() {
        return this.f71673b;
    }

    public C28519b(int i, String str) {
        this.f71672a = i;
        this.f71673b = str;
        if (i != 2 && i != 3) {
            this.f71672a = 1;
        }
    }
}
