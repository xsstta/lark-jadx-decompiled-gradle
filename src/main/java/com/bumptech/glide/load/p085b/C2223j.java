package com.bumptech.glide.load.p085b;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.b.j */
public final class C2223j implements AbstractC2220h {

    /* renamed from: c */
    private final Map<String, List<AbstractC2222i>> f7537c;

    /* renamed from: d */
    private volatile Map<String, String> f7538d;

    /* renamed from: com.bumptech.glide.load.b.j$b */
    static final class C2225b implements AbstractC2222i {

        /* renamed from: a */
        private final String f7544a;

        @Override // com.bumptech.glide.load.p085b.AbstractC2222i
        /* renamed from: a */
        public String mo10581a() {
            return this.f7544a;
        }

        public int hashCode() {
            return this.f7544a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f7544a + '\'' + '}';
        }

        C2225b(String str) {
            this.f7544a = str;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2225b) {
                return this.f7544a.equals(((C2225b) obj).f7544a);
            }
            return false;
        }
    }

    public int hashCode() {
        return this.f7537c.hashCode();
    }

    /* renamed from: com.bumptech.glide.load.b.j$a */
    public static final class C2224a {

        /* renamed from: a */
        private static final String f7539a;

        /* renamed from: b */
        private static final Map<String, List<AbstractC2222i>> f7540b;

        /* renamed from: c */
        private boolean f7541c = true;

        /* renamed from: d */
        private Map<String, List<AbstractC2222i>> f7542d = f7540b;

        /* renamed from: e */
        private boolean f7543e = true;

        /* renamed from: c */
        private void m9583c() {
            if (this.f7541c) {
                this.f7541c = false;
                this.f7542d = m9584d();
            }
        }

        static {
            String b = m9582b();
            f7539a = b;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("User-Agent", Collections.singletonList(new C2225b(b)));
            }
            f7540b = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        static String m9582b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: d */
        private Map<String, List<AbstractC2222i>> m9584d() {
            HashMap hashMap = new HashMap(this.f7542d.size());
            for (Map.Entry<String, List<AbstractC2222i>> entry : this.f7542d.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return hashMap;
        }

        /* renamed from: a */
        public C2223j mo10587a() {
            this.f7541c = true;
            return new C2223j(this.f7542d);
        }

        /* renamed from: a */
        private List<AbstractC2222i> m9581a(String str) {
            List<AbstractC2222i> list = this.f7542d.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f7542d.put(str, arrayList);
            return arrayList;
        }

        /* renamed from: a */
        public C2224a mo10586a(String str, String str2) {
            return mo10585a(str, new C2225b(str2));
        }

        /* renamed from: a */
        public C2224a mo10585a(String str, AbstractC2222i iVar) {
            if (this.f7543e && "User-Agent".equalsIgnoreCase(str)) {
                return mo10588b(str, iVar);
            }
            m9583c();
            m9581a(str).add(iVar);
            return this;
        }

        /* renamed from: b */
        public C2224a mo10588b(String str, AbstractC2222i iVar) {
            m9583c();
            if (iVar == null) {
                this.f7542d.remove(str);
            } else {
                List<AbstractC2222i> a = m9581a(str);
                a.clear();
                a.add(iVar);
            }
            if (this.f7543e && "User-Agent".equalsIgnoreCase(str)) {
                this.f7543e = false;
            }
            return this;
        }
    }

    @Override // com.bumptech.glide.load.p085b.AbstractC2220h
    public Map<String, String> getHeaders() {
        if (this.f7538d == null) {
            synchronized (this) {
                if (this.f7538d == null) {
                    this.f7538d = Collections.unmodifiableMap(m9580a());
                }
            }
        }
        return this.f7538d;
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f7537c + '}';
    }

    /* renamed from: a */
    private Map<String, String> m9580a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<AbstractC2222i>> entry : this.f7537c.entrySet()) {
            String a = m9579a(entry.getValue());
            if (!TextUtils.isEmpty(a)) {
                hashMap.put(entry.getKey(), a);
            }
        }
        return hashMap;
    }

    C2223j(Map<String, List<AbstractC2222i>> map) {
        this.f7537c = Collections.unmodifiableMap(map);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2223j) {
            return this.f7537c.equals(((C2223j) obj).f7537c);
        }
        return false;
    }

    /* renamed from: a */
    private String m9579a(List<AbstractC2222i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = list.get(i).mo10581a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }
}
