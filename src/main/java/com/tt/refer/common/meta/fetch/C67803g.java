package com.tt.refer.common.meta.fetch;

import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.tt.miniapp.manager.appinfo.C66411c;
import com.tt.refer.common.meta.fetch.C67803g.AbstractC67804a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tt.refer.common.meta.fetch.g */
public class C67803g<T extends AbstractC67804a> {

    /* renamed from: a */
    private List<T> f170757a = new ArrayList();

    /* renamed from: b */
    private String f170758b;

    /* renamed from: c */
    private C66411c f170759c;

    /* renamed from: d */
    private long f170760d;

    /* renamed from: e */
    private Map<String, Object> f170761e;

    /* renamed from: f */
    private Map<String, String> f170762f;

    /* renamed from: g */
    private String f170763g;

    /* renamed from: h */
    private String f170764h;

    /* renamed from: i */
    private C12827e f170765i;

    /* renamed from: a */
    public Map<String, String> mo235306a() {
        return this.f170762f;
    }

    /* renamed from: b */
    public Map<String, Object> mo235310b() {
        return this.f170761e;
    }

    /* renamed from: c */
    public String mo235312c() {
        return this.f170764h;
    }

    /* renamed from: d */
    public String mo235313d() {
        return this.f170758b;
    }

    /* renamed from: e */
    public C66411c mo235314e() {
        return this.f170759c;
    }

    /* renamed from: f */
    public String mo235315f() {
        return this.f170763g;
    }

    /* renamed from: g */
    public List<T> mo235316g() {
        return this.f170757a;
    }

    /* renamed from: h */
    public long mo235317h() {
        return this.f170760d;
    }

    /* renamed from: a */
    public void mo235307a(C12827e eVar) {
        this.f170765i = eVar;
    }

    /* renamed from: b */
    public void mo235311b(Map<String, Object> map) {
        this.f170761e = map;
    }

    /* renamed from: a */
    public void mo235308a(T t) {
        if (t != null) {
            this.f170757a.add(t);
        }
    }

    /* renamed from: a */
    public void mo235309a(Map<String, String> map) {
        this.f170762f = map;
    }

    /* renamed from: com.tt.refer.common.meta.fetch.g$a */
    public static abstract class AbstractC67804a {

        /* renamed from: c */
        public String f170766c;

        /* renamed from: d */
        public String f170767d;

        /* renamed from: e */
        public String f170768e;

        /* renamed from: a */
        public abstract JSONObject mo50354a(C67803g gVar);

        public AbstractC67804a(String str, String str2) {
            this.f170766c = str;
            this.f170767d = str2;
        }
    }

    public C67803g(String str, String str2, String str3, C66411c cVar) {
        this.f170758b = str2;
        this.f170763g = str3;
        this.f170759c = cVar;
        this.f170764h = str;
    }
}
