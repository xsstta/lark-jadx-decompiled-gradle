package com.bytedance.frameworks.baselib.network.http.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.baselib.network.http.impl.d */
public class C14009d implements AbstractC14008c {

    /* renamed from: a */
    private final Map<URI, List<C14010e>> f36702a = new HashMap();

    /* renamed from: b */
    private URI m56691b(URI uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URI("http", uri.getHost(), null, null);
        } catch (URISyntaxException unused) {
            return uri;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.AbstractC14008c
    /* renamed from: a */
    public synchronized List<C14010e> mo51583a(URI uri) {
        ArrayList arrayList;
        if (uri != null) {
            arrayList = new ArrayList();
            List<C14010e> list = this.f36702a.get(uri);
            if (list != null) {
                Iterator<C14010e> it = list.iterator();
                while (it.hasNext()) {
                    C14010e next = it.next();
                    if (next.mo51611m()) {
                        it.remove();
                    } else {
                        arrayList.add(next);
                    }
                }
            }
            for (Map.Entry<URI, List<C14010e>> entry : this.f36702a.entrySet()) {
                if (!uri.equals(entry.getKey())) {
                    Iterator<C14010e> it2 = entry.getValue().iterator();
                    while (it2.hasNext()) {
                        C14010e next2 = it2.next();
                        if (C14010e.m56699a(next2.mo51597d(), uri.getHost())) {
                            if (next2.mo51611m()) {
                                it2.remove();
                            } else if (!arrayList.contains(next2)) {
                                arrayList.add(next2);
                            }
                        }
                    }
                }
            }
        } else {
            throw new NullPointerException("uri == null");
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.AbstractC14008c
    /* renamed from: a */
    public synchronized void mo51584a(URI uri, C14010e eVar) {
        if (eVar != null) {
            URI b = m56691b(uri);
            List<C14010e> list = this.f36702a.get(b);
            if (list == null) {
                list = new ArrayList<>();
                this.f36702a.put(b, list);
            } else {
                list.remove(eVar);
            }
            list.add(eVar);
        } else {
            throw new NullPointerException("cookie == null");
        }
    }
}
