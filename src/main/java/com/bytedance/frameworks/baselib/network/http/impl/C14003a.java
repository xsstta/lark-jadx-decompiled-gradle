package com.bytedance.frameworks.baselib.network.http.impl;

import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.baselib.network.http.impl.a */
public class C14003a extends CookieManager {

    /* renamed from: a */
    private AbstractC14008c f36697a;

    /* renamed from: b */
    private AbstractC14004b f36698b;

    public C14003a() {
        this(null, null);
    }

    /* renamed from: a */
    public static String m56682a(String str) {
        if (str == null) {
            return "/";
        }
        return str.substring(0, str.lastIndexOf(47) + 1);
    }

    /* renamed from: a */
    private static List<C14010e> m56683a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && (key.equalsIgnoreCase("Set-cookie") || key.equalsIgnoreCase("Set-cookie2"))) {
                for (String str : entry.getValue()) {
                    try {
                        for (C14010e eVar : C14010e.m56694a(str)) {
                            arrayList.add(eVar);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Map<String, List<String>> m56684a(List<C14010e> list) {
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (C14010e eVar : list) {
            i = Math.min(i, eVar.mo51610l());
        }
        if (i == 1) {
            sb.append("$Version=\"1\"; ");
        }
        sb.append(list.get(0).toString());
        for (int i2 = 1; i2 < list.size(); i2++) {
            sb.append("; ");
            sb.append(list.get(i2).toString());
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(sb.toString()));
    }

    public C14003a(AbstractC14008c cVar, AbstractC14004b bVar) {
        this.f36697a = cVar == null ? new C14009d() : cVar;
        this.f36698b = bVar == null ? AbstractC14004b.f36701c : bVar;
    }

    @Override // java.net.CookieHandler, java.net.CookieManager
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        if (uri == null || map == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (C14010e eVar : this.f36697a.mo51583a(uri)) {
            if (C14010e.m56696a(eVar, uri) && C14010e.m56700b(eVar, uri) && C14010e.m56701c(eVar, uri)) {
                arrayList.add(eVar);
            }
        }
        return m56684a(arrayList);
    }

    @Override // java.net.CookieHandler, java.net.CookieManager
    public void put(URI uri, Map<String, List<String>> map) throws IOException {
        if (uri == null || map == null) {
            throw new IllegalArgumentException();
        }
        for (C14010e eVar : m56683a(map)) {
            if (eVar.mo51597d() == null) {
                eVar.mo51598d(uri.getHost());
            }
            if (eVar.mo51604g() == null) {
                eVar.mo51600e(m56682a(uri.getPath()));
            } else if (!C14010e.m56696a(eVar, uri)) {
            }
            if ("".equals(eVar.mo51605h())) {
                eVar.mo51603f(Integer.toString(SerializableHttpCookie.getEffectivePort(uri.getScheme(), uri.getPort())));
            } else if (eVar.mo51605h() != null && !C14010e.m56701c(eVar, uri)) {
            }
            if (this.f36698b.mo51582a(uri, eVar)) {
                this.f36697a.mo51584a(uri, eVar);
            }
        }
    }
}
