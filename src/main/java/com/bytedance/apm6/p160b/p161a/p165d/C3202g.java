package com.bytedance.apm6.p160b.p161a.p165d;

import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p160b.p161a.C3159a;
import com.bytedance.apm6.p160b.p161a.p163b.C3163a;
import com.bytedance.apm6.p160b.p161a.p163b.C3164b;
import com.bytedance.apm6.p160b.p161a.p164c.C3177b;
import com.bytedance.apm6.p160b.p161a.p165d.AbstractC3198f;
import com.bytedance.apm6.util.p195b.C3350b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.apm6.b.a.d.g */
public class C3202g {

    /* renamed from: a */
    private static AtomicInteger f10246a = new AtomicInteger(0);

    /* renamed from: b */
    private static final List<String> f10247b = Arrays.asList("tracing");

    /* renamed from: c */
    private static final List<AbstractC3198f> f10248c;

    /* renamed from: d */
    private static final AbstractC3198f.C3199a f10249d;

    /* renamed from: e */
    private static final AbstractC3198f.C3201c f10250e;

    /* renamed from: f */
    private static final AbstractC3198f.C3200b f10251f;

    /* renamed from: a */
    public static List<AbstractC3198f> m13382a() {
        return f10248c;
    }

    static {
        AbstractC3198f.C3199a aVar = new AbstractC3198f.C3199a();
        f10249d = aVar;
        AbstractC3198f.C3201c cVar = new AbstractC3198f.C3201c();
        f10250e = cVar;
        AbstractC3198f.C3200b bVar = new AbstractC3198f.C3200b();
        f10251f = bVar;
        ArrayList arrayList = new ArrayList();
        f10248c = arrayList;
        arrayList.add(aVar);
        arrayList.add(cVar);
        arrayList.add(bVar);
    }

    /* renamed from: a */
    private static AbstractC3198f m13381a(JSONObject jSONObject) {
        String optString = jSONObject.optString("log_type");
        if (C3159a.f10111b.contains(optString)) {
            return f10249d;
        }
        if (f10247b.contains(optString)) {
            return f10250e;
        }
        return f10251f;
    }

    /* renamed from: a */
    private static void m13384a(Map<Long, List<C3177b>> map) {
        if (C3318a.m13915u()) {
            String str = C3159a.f10110a;
            C3350b.m13932a(str, "sendLog: input sendList merged into " + map.size() + " group(s)");
            int i = 0;
            for (Long l : map.keySet()) {
                List<C3177b> list = map.get(l);
                C3350b.m13932a(C3159a.f10110a, "----------------");
                C3163a a = C3164b.m13245a().mo13196a(String.valueOf(l));
                String str2 = C3159a.f10110a;
                StringBuilder sb = new StringBuilder();
                sb.append("group ");
                int i2 = i + 1;
                sb.append(i);
                sb.append(" header:");
                sb.append(a);
                C3350b.m13932a(str2, sb.toString());
                for (int i3 = 0; i3 < list.size(); i3++) {
                    String str3 = C3159a.f10110a;
                    C3350b.m13932a(str3, "  log[" + i3 + "]=" + list.get(i3).toString());
                }
                C3350b.m13932a(C3159a.f10110a, "----------------");
                i = i2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0139  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<com.bytedance.apm6.p160b.p161a.p165d.AbstractC3198f, byte[]> m13383a(java.util.List<com.bytedance.apm6.p160b.p161a.p164c.C3176a> r22, int r23) {
        /*
        // Method dump skipped, instructions count: 441
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm6.p160b.p161a.p165d.C3202g.m13383a(java.util.List, int):java.util.Map");
    }
}
