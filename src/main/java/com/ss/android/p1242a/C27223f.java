package com.ss.android.p1242a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.a.f */
public class C27223f {

    /* renamed from: a */
    private boolean f67731a;

    /* renamed from: b */
    private List<C27224a> f67732b = new ArrayList();

    /* renamed from: com.ss.android.a.f$a */
    public static class C27224a {

        /* renamed from: a */
        public String f67733a;

        /* renamed from: b */
        private List<C27225b> f67734b = new ArrayList();

        /* renamed from: a */
        public String mo97092a() {
            return this.f67733a;
        }

        /* renamed from: b */
        public List<C27225b> mo97093b() {
            return this.f67734b;
        }

        public C27224a(String str) {
            this.f67733a = str;
        }

        /* renamed from: a */
        public C27225b mo97091a(String str) {
            for (C27225b bVar : this.f67734b) {
                if (str.equals(bVar.f67735a)) {
                    return bVar;
                }
            }
            C27225b bVar2 = new C27225b(str);
            this.f67734b.add(bVar2);
            return bVar2;
        }
    }

    /* renamed from: com.ss.android.a.f$b */
    public static class C27225b {

        /* renamed from: a */
        public String f67735a;

        /* renamed from: b */
        private String f67736b;

        /* renamed from: a */
        public String mo97094a() {
            return this.f67735a;
        }

        /* renamed from: b */
        public String mo97096b() {
            return this.f67736b;
        }

        public C27225b(String str) {
            this.f67735a = str;
        }

        /* renamed from: a */
        public void mo97095a(String str) {
            this.f67736b = str;
        }
    }

    /* renamed from: a */
    public List<C27224a> mo97089a() {
        return this.f67732b;
    }

    /* renamed from: a */
    public void mo97090a(boolean z) {
        this.f67731a = z;
    }

    public C27223f(boolean z) {
        this.f67731a = z;
    }

    /* renamed from: a */
    public C27224a mo97088a(String str) {
        for (C27224a aVar : this.f67732b) {
            if (str.equals(aVar.f67733a)) {
                return aVar;
            }
        }
        C27224a aVar2 = new C27224a(str);
        this.f67732b.add(aVar2);
        return aVar2;
    }
}
