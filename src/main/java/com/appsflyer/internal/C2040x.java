package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.x */
public final class C2040x {

    /* renamed from: ı */
    private boolean f6999;

    /* renamed from: Ι */
    public String f7000;

    /* renamed from: ǃ */
    public final boolean mo10099() {
        return this.f6999;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.x$b */
    public enum EnumC2041b {
        GOOGLE(0),
        AMAZON(1);
        

        /* renamed from: ι */
        private int f7004;

        public final String toString() {
            return String.valueOf(this.f7004);
        }

        private EnumC2041b(int i) {
            this.f7004 = i;
        }
    }

    public final String toString() {
        return String.format("%s,%s", this.f7000, Boolean.valueOf(this.f6999));
    }

    C2040x(String str, boolean z) {
        this.f7000 = str;
        this.f6999 = z;
    }
}
