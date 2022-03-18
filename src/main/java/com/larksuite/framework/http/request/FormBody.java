package com.larksuite.framework.http.request;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FormBody extends RequestBody {
    private final Charset charset;
    private final Map<String, String> name2Value;

    public Charset getCharset() {
        return this.charset;
    }

    /* renamed from: com.larksuite.framework.http.request.FormBody$a */
    public static final class C26008a {

        /* renamed from: a */
        private final Map<String, String> f64366a;

        /* renamed from: b */
        private final Charset f64367b;

        public C26008a() {
            this(null);
        }

        /* renamed from: a */
        public FormBody mo92431a() {
            return new FormBody(this.f64366a, this.f64367b);
        }

        public C26008a(Charset charset) {
            this.f64366a = new HashMap();
            this.f64367b = charset;
        }

        /* renamed from: a */
        public C26008a mo92430a(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.f64366a.put(str, str2);
            return this;
        }
    }

    public Map<String, String> getName2Value() {
        return new HashMap(this.name2Value);
    }

    FormBody(Map<String, String> map, Charset charset2) {
        HashMap hashMap = new HashMap();
        this.name2Value = hashMap;
        hashMap.clear();
        hashMap.putAll(map);
        this.charset = charset2;
    }
}
