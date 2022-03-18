package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.C14041b;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.DnsResult;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.Dns;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.i */
public class C14048i implements Dns {

    /* renamed from: b */
    private static volatile C14048i f36825b;

    /* renamed from: a */
    private final String f36826a = C14048i.class.getSimpleName();

    /* renamed from: c */
    private ConcurrentMap<String, CopyOnWriteArrayList<C14050k>> f36827c = new ConcurrentHashMap();

    /* renamed from: a */
    public static C14048i m56873a() {
        if (f36825b == null) {
            synchronized (C14048i.class) {
                if (f36825b == null) {
                    f36825b = new C14048i();
                }
            }
        }
        return f36825b;
    }

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        String str2 = this.f36826a;
        Logger.m15167d(str2, "lookup address list for " + str);
        DnsResult a = C14041b.m56829a().mo51685a(str);
        if (a == null || (a.ipv4List.isEmpty() && a.ipv6List.isEmpty())) {
            return Dns.SYSTEM.lookup(str);
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : a.ipv6List) {
            arrayList.add(InetAddress.getByName(str3));
        }
        for (String str4 : a.ipv4List) {
            arrayList.add(InetAddress.getByName(str4));
        }
        if (this.f36827c.containsKey(str)) {
            Iterator<C14050k> it = this.f36827c.get(str).iterator();
            while (it.hasNext()) {
                C14050k next = it.next();
                if (next.f36851U.isEmpty() && next.f36850T == DnsResult.Source.UNKNOWN) {
                    next.f36850T = a.source;
                    next.f36851U.addAll(a.ipv6List);
                    next.f36851U.addAll(a.ipv4List);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo51720a(String str, C14050k kVar) {
        if (kVar != null) {
            if (this.f36827c.containsKey(str)) {
                this.f36827c.get(str).add(kVar);
                return;
            }
            CopyOnWriteArrayList<C14050k> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(kVar);
            this.f36827c.put(str, copyOnWriteArrayList);
        }
    }

    /* renamed from: b */
    public void mo51721b(String str, C14050k kVar) {
        if (!TextUtils.isEmpty(str) && this.f36827c.containsKey(str)) {
            this.f36827c.get(str).remove(kVar);
            if (this.f36827c.get(str).isEmpty()) {
                this.f36827c.remove(str);
            }
        }
    }
}
