package com.larksuite.framework.apiplugin.p1178d;

import com.bytedance.ee.lark.plugin_annotation.bean.C12924a;
import com.bytedance.ee.lark.plugin_annotation.bean.C12925b;
import com.bytedance.ee.lark.plugin_annotation.p642a.AbstractC12921a;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.larksuite.framework.apiplugin.d.a */
public class C25933a {

    /* renamed from: a */
    private List<String> f64234a;

    /* renamed from: b */
    private final Map<Class<? extends AbstractC25937e>, Map<String, C12925b>> f64235b;

    /* renamed from: com.larksuite.framework.apiplugin.d.a$a */
    public static class C25935a {

        /* renamed from: a */
        public static final C25933a f64236a = new C25933a();
    }

    /* renamed from: b */
    private void m93900b() {
    }

    /* renamed from: a */
    public static C25933a m93899a() {
        return C25935a.f64236a;
    }

    private C25933a() {
        this.f64234a = new ArrayList();
        this.f64235b = new ConcurrentHashMap();
        m93900b();
        m93901c();
    }

    /* renamed from: c */
    private void m93901c() {
        for (int i = 0; i < this.f64234a.size(); i++) {
            String replace = this.f64234a.get(i).replace("/", ".");
            try {
                mo92259a(((AbstractC12921a) Class.forName(replace.substring(0, replace.indexOf(".class"))).newInstance()).mo48783a());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public Map<String, C12925b> mo92257a(Class<? extends AbstractC25937e> cls) {
        return this.f64235b.get(cls);
    }

    /* renamed from: a */
    public void mo92259a(Map<Class, C12924a> map) {
        for (Map.Entry<Class, C12924a> entry : map.entrySet()) {
            Map<String, C12925b> map2 = this.f64235b.get(entry.getKey());
            if (map2 == null) {
                map2 = new HashMap<>();
            }
            C12924a value = entry.getValue();
            if (!(value == null || value.mo48795a() == null || value.mo48795a().isEmpty())) {
                for (C12925b bVar : value.mo48795a()) {
                    map2.put(bVar.f34418a, bVar);
                }
                this.f64235b.put(entry.getKey(), map2);
            }
        }
    }

    /* renamed from: a */
    public void mo92258a(Class cls, Map<String, C12925b> map) {
        Map<String, C12925b> map2 = this.f64235b.get(cls);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        for (Map.Entry<String, C12925b> entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue());
        }
        this.f64235b.put(cls, map2);
    }
}
