package com.ss.android.lark.chat.service.impl;

import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.chat.service.impl.y */
public class C34289y {

    /* renamed from: a */
    private static Map<String, Integer> f88582a = new ConcurrentHashMap();

    /* renamed from: b */
    private static AbstractC34290a f88583b;

    /* renamed from: com.ss.android.lark.chat.service.impl.y$a */
    public interface AbstractC34290a {
        /* renamed from: a */
        void mo126753a(List<String> list, List<String> list2);
    }

    /* renamed from: a */
    private static void m132971a() {
        String key;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Map.Entry<String, Integer>> it = f88582a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> next = it.next();
            if (!(next == null || (key = next.getKey()) == null)) {
                if (next.getValue() == null || next.getValue().intValue() <= 0) {
                    arrayList2.add(key);
                    it.remove();
                } else {
                    arrayList.add(key);
                }
            }
        }
        f88583b.mo126753a(arrayList, arrayList2);
    }

    /* renamed from: a */
    public static void m132972a(AbstractC34290a aVar) {
        f88583b = aVar;
    }

    /* renamed from: b */
    public static void m132974b(String str) {
        if (str != null) {
            Integer num = f88582a.get(str);
            if (num == null) {
                num = 0;
            }
            Integer valueOf = Integer.valueOf(num.intValue() - 1);
            if (valueOf.intValue() <= 0) {
                valueOf = 0;
            }
            Log.m165389i("PushChatSubscribeCenter", "unSubscribe chatid: " + str + "  count: " + valueOf);
            f88582a.put(str, valueOf);
            m132971a();
        }
    }

    /* renamed from: a */
    public static void m132973a(String str) {
        if (str != null) {
            Integer num = f88582a.get(str);
            if (num == null || num.intValue() <= 0) {
                num = 0;
            }
            Integer valueOf = Integer.valueOf(num.intValue() + 1);
            Log.m165389i("PushChatSubscribeCenter", "subscribe chatid: " + str + "  count: " + valueOf);
            f88582a.put(str, valueOf);
            m132971a();
        }
    }
}
