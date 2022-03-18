package com.bytedance.retrofit2;

/* renamed from: com.bytedance.retrofit2.e */
public final class C20596e {

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.retrofit2.e$a */
    public static class C20597a implements AbstractC20595d {

        /* renamed from: a */
        private final String f50191a;

        /* renamed from: b */
        private final String f50192b;

        @Override // com.bytedance.retrofit2.AbstractC20595d
        /* renamed from: a */
        public String mo69392a() {
            return this.f50191a;
        }

        C20597a(String str, String str2) {
            this.f50191a = str;
            this.f50192b = str2;
        }
    }

    /* renamed from: a */
    public static AbstractC20595d m74962a(String str) {
        return new C20597a(str, "default");
    }
}
