package com.bytedance.ee.bear.drive.view.preview.image.progressloader.p368a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.a.e */
public final class C7290e implements AbstractC7283b {

    /* renamed from: c */
    private final Map<String, List<AbstractC7289d>> f19534c;

    /* renamed from: d */
    private volatile Map<String, String> f19535d;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.a.e$b */
    static final class C7292b implements AbstractC7289d {

        /* renamed from: a */
        private final String f19542a;

        @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.p368a.AbstractC7289d
        /* renamed from: a */
        public String mo28469a() {
            return this.f19542a;
        }

        public int hashCode() {
            return this.f19542a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f19542a + '\'' + '}';
        }

        C7292b(String str) {
            this.f19542a = str;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C7292b) {
                return this.f19542a.equals(((C7292b) obj).f19542a);
            }
            return false;
        }
    }

    public int hashCode() {
        return this.f19534c.hashCode();
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.a.e$a */
    public static final class C7291a {

        /* renamed from: a */
        private static final String f19536a;

        /* renamed from: b */
        private static final Map<String, List<AbstractC7289d>> f19537b;

        /* renamed from: c */
        private boolean f19538c = true;

        /* renamed from: d */
        private Map<String, List<AbstractC7289d>> f19539d = f19537b;

        /* renamed from: e */
        private boolean f19540e = true;

        /* renamed from: f */
        private boolean f19541f = true;

        /* renamed from: b */
        private void m29124b() {
            if (this.f19538c) {
                this.f19538c = false;
                this.f19539d = m29125c();
            }
        }

        static {
            String property = System.getProperty("http.agent");
            f19536a = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new C7292b(property)));
            }
            hashMap.put("Accept-Encoding", Collections.singletonList(new C7292b("identity")));
            f19537b = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: c */
        private Map<String, List<AbstractC7289d>> m29125c() {
            HashMap hashMap = new HashMap(this.f19539d.size());
            for (Map.Entry<String, List<AbstractC7289d>> entry : this.f19539d.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return hashMap;
        }

        /* renamed from: a */
        public C7290e mo28475a() {
            this.f19538c = true;
            return new C7290e(this.f19539d);
        }

        /* renamed from: a */
        private List<AbstractC7289d> m29123a(String str) {
            List<AbstractC7289d> list = this.f19539d.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f19539d.put(str, arrayList);
            return arrayList;
        }

        /* renamed from: a */
        public C7291a mo28474a(String str, String str2) {
            return mo28473a(str, new C7292b(str2));
        }

        /* renamed from: a */
        public C7291a mo28473a(String str, AbstractC7289d dVar) {
            if ((this.f19540e && "Accept-Encoding".equalsIgnoreCase(str)) || (this.f19541f && "User-Agent".equalsIgnoreCase(str))) {
                return mo28476b(str, dVar);
            }
            m29124b();
            m29123a(str).add(dVar);
            return this;
        }

        /* renamed from: b */
        public C7291a mo28476b(String str, AbstractC7289d dVar) {
            m29124b();
            if (dVar == null) {
                this.f19539d.remove(str);
            } else {
                List<AbstractC7289d> a = m29123a(str);
                a.clear();
                a.add(dVar);
            }
            if (this.f19540e && "Accept-Encoding".equalsIgnoreCase(str)) {
                this.f19540e = false;
            }
            if (this.f19541f && "User-Agent".equalsIgnoreCase(str)) {
                this.f19541f = false;
            }
            return this;
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.p368a.AbstractC7283b
    /* renamed from: a */
    public Map<String, String> mo28464a() {
        if (this.f19535d == null) {
            synchronized (this) {
                if (this.f19535d == null) {
                    this.f19535d = Collections.unmodifiableMap(m29121b());
                }
            }
        }
        return this.f19535d;
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f19534c + '}';
    }

    /* renamed from: b */
    private Map<String, String> m29121b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<AbstractC7289d>> entry : this.f19534c.entrySet()) {
            StringBuilder sb = new StringBuilder();
            List<AbstractC7289d> value = entry.getValue();
            for (int i = 0; i < value.size(); i++) {
                sb.append(value.get(i).mo28469a());
                if (i != value.size() - 1) {
                    sb.append(',');
                }
            }
            hashMap.put(entry.getKey(), sb.toString());
        }
        return hashMap;
    }

    C7290e(Map<String, List<AbstractC7289d>> map) {
        this.f19534c = Collections.unmodifiableMap(map);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7290e) {
            return this.f19534c.equals(((C7290e) obj).f19534c);
        }
        return false;
    }
}
