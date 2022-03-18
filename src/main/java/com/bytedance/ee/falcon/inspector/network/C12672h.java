package com.bytedance.ee.falcon.inspector.network;

import java.util.ArrayList;

/* renamed from: com.bytedance.ee.falcon.inspector.network.h */
public class C12672h<T> {

    /* renamed from: a */
    private final ArrayList<C12672h<T>.C12673a> f33921a = new ArrayList<>();

    /* renamed from: com.bytedance.ee.falcon.inspector.network.h$a */
    private class C12673a {

        /* renamed from: b */
        private final boolean f33923b;

        /* renamed from: c */
        private final String f33924c;

        /* renamed from: d */
        private final T f33925d;

        /* renamed from: a */
        public T mo48052a() {
            return this.f33925d;
        }

        /* renamed from: a */
        public boolean mo48053a(String str) {
            if (!str.startsWith(this.f33924c)) {
                return false;
            }
            if (this.f33923b || str.length() == this.f33924c.length()) {
                return true;
            }
            return false;
        }

        public C12673a(String str, T t) {
            if (str.endsWith("*")) {
                this.f33923b = true;
                this.f33924c = str.substring(0, str.length() - 1);
            } else {
                this.f33923b = false;
                this.f33924c = str;
            }
            if (!this.f33924c.contains("*")) {
                this.f33925d = t;
                return;
            }
            throw new IllegalArgumentException("Multiple wildcards present in rule expression " + str);
        }
    }

    /* renamed from: a */
    public T mo48050a(String str) {
        int size = this.f33921a.size();
        for (int i = 0; i < size; i++) {
            C12672h<T>.C12673a aVar = this.f33921a.get(i);
            if (aVar.mo48053a(str)) {
                return (T) aVar.mo48052a();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo48051a(String str, T t) {
        this.f33921a.add(new C12673a(str, t));
    }
}
