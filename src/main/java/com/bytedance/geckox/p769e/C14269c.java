package com.bytedance.geckox.p769e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.geckox.e.c */
public class C14269c {

    /* renamed from: a */
    private static Map<String, Map<String, List<AbstractC14267a>>> f37523a;

    /* renamed from: b */
    private static C14269c f37524b;

    private C14269c() {
        f37523a = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static C14269c m57588a() {
        if (f37524b == null) {
            synchronized (C14269c.class) {
                if (f37524b == null) {
                    f37524b = new C14269c();
                }
            }
        }
        return f37524b;
    }

    /* renamed from: b */
    public synchronized List<AbstractC14267a> mo52243b(String str, String str2) {
        Map<String, List<AbstractC14267a>> map = f37523a.get(str);
        if (map == null) {
            return null;
        }
        return map.remove(str2);
    }

    /* renamed from: a */
    public List<AbstractC14267a> mo52241a(String str, String str2) {
        Map<String, List<AbstractC14267a>> map = f37523a.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    /* renamed from: a */
    public synchronized void mo52242a(String str, String str2, AbstractC14267a aVar) {
        List<AbstractC14267a> list;
        Map<String, List<AbstractC14267a>> map = f37523a.get(str);
        if (map != null) {
            list = map.get(str2);
            if (list == null) {
                list = Collections.synchronizedList(new ArrayList());
            }
        } else {
            map = new ConcurrentHashMap<>();
            list = Collections.synchronizedList(new ArrayList());
        }
        list.add(aVar);
        map.put(str2, list);
        f37523a.put(str, map);
    }
}
