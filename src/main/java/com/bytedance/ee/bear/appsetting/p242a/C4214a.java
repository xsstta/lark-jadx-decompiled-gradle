package com.bytedance.ee.bear.appsetting.p242a;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.appsetting.AbstractC4216b;
import com.bytedance.ee.log.C13479a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.appsetting.a.a */
public class C4214a {

    /* renamed from: a */
    private final Set<AbstractC4216b> f12723a;

    /* renamed from: b */
    private final Map<String, Object> f12724b = new ConcurrentHashMap();

    /* renamed from: c */
    private final Map<C4215a, Object> f12725c = new ConcurrentHashMap();

    /* renamed from: a */
    public void mo16543a() {
        this.f12724b.clear();
        this.f12725c.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.appsetting.a.a$a */
    public static class C4215a {

        /* renamed from: a */
        String f12726a;

        /* renamed from: b */
        Class<?> f12727b;

        /* renamed from: c */
        boolean f12728c;

        public int hashCode() {
            int i;
            String str = this.f12726a;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            Class<?> cls = this.f12727b;
            if (cls != null) {
                i2 = cls.hashCode();
            }
            return ((i3 + i2) * 31) + (this.f12728c ? 1 : 0);
        }

        public C4215a(String str, Class<?> cls, boolean z) {
            this.f12726a = str;
            this.f12727b = cls;
            this.f12728c = z;
        }
    }

    public C4214a(Set<AbstractC4216b> set) {
        this.f12723a = set;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <V> V m17523a(Object obj, V v) {
        if (obj.getClass().equals(v.getClass())) {
            return obj;
        }
        try {
            return (V) JSONObject.parseObject(JSONObject.toJSONString(obj), v.getClass());
        } catch (Exception e) {
            C13479a.m54759a("AppSettingDataManager", "getCachedValue, parseObject fail", e);
            return v;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <V> V m17524a(String str, V v) throws NumberFormatException {
        if (v instanceof String) {
            return TextUtils.isEmpty(str) ? v : str;
        }
        if (v instanceof Boolean) {
            return (V) Boolean.valueOf(str);
        }
        if (v instanceof Integer) {
            return (V) Integer.valueOf(str);
        }
        if (v instanceof Long) {
            return (V) Long.valueOf(str);
        }
        if (v instanceof Double) {
            return (V) Double.valueOf(str);
        }
        if (v instanceof Float) {
            return (V) Float.valueOf(str);
        }
        C13479a.m54758a("AppSettingDataManager", "parseString, unSupportType");
        return v;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <V> V mo16541a(String str, V v, boolean z) {
        Object obj = this.f12724b.get(str);
        if (obj != null) {
            return (V) m17523a(obj, v);
        }
        Object b = m17525b(str, v, z);
        if (b != 0) {
            v = b;
        }
        this.f12724b.put(str, v);
        return v;
    }

    /* renamed from: b */
    private <V> V m17525b(String str, V v, boolean z) {
        for (AbstractC4216b bVar : this.f12723a) {
            if (bVar.mo16547a(str, v.getClass())) {
                if (v instanceof Boolean) {
                    return (V) Boolean.valueOf(bVar.mo16548a(str, v.booleanValue(), z));
                }
                try {
                    return (V) m17524a(bVar.mo16545a(str, ""), (Object) v);
                } catch (NumberFormatException e) {
                    C13479a.m54759a("AppSettingDataManager", "getStoredValue, parseString fail", e);
                    return v;
                }
            }
        }
        C13479a.m54758a("AppSettingDataManager", "getStoredValue error, no match repository. key = " + str + ", repository size = " + this.f12723a.size());
        return v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[Catch:{ Exception -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends com.bytedance.ee.util.io.NonProguard> T mo16540a(java.lang.String r5, java.lang.Class<T> r6, T r7) {
        /*
            r4 = this;
            com.bytedance.ee.bear.appsetting.a.a$a r0 = new com.bytedance.ee.bear.appsetting.a.a$a
            r1 = 0
            r0.<init>(r5, r6, r1)
            java.util.Map<com.bytedance.ee.bear.appsetting.a.a$a, java.lang.Object> r1 = r4.f12725c
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x0011
            com.bytedance.ee.util.io.NonProguard r1 = (com.bytedance.ee.util.io.NonProguard) r1
            return r1
        L_0x0011:
            java.lang.String r1 = "AppSettingDataManager"
            if (r7 == 0) goto L_0x0020
            java.lang.String r2 = com.alibaba.fastjson.JSON.toJSONString(r7)     // Catch:{ Exception -> 0x001a }
            goto L_0x0022
        L_0x001a:
            r2 = move-exception
            java.lang.String r3 = "getValue, fastJson toJsonString fail"
            com.bytedance.ee.log.C13479a.m54759a(r1, r3, r2)
        L_0x0020:
            java.lang.String r2 = "{}"
        L_0x0022:
            r3 = 1
            java.lang.Object r5 = r4.mo16541a(r5, r2, r3)     // Catch:{ Exception -> 0x003a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x003a }
            java.lang.Object r5 = com.alibaba.fastjson.JSON.parseObject(r5, r6)     // Catch:{ Exception -> 0x003a }
            com.bytedance.ee.util.io.NonProguard r5 = (com.bytedance.ee.util.io.NonProguard) r5     // Catch:{ Exception -> 0x003a }
            if (r5 == 0) goto L_0x0036
            java.util.Map<com.bytedance.ee.bear.appsetting.a.a$a, java.lang.Object> r6 = r4.f12725c     // Catch:{ Exception -> 0x003a }
            r6.put(r0, r5)     // Catch:{ Exception -> 0x003a }
        L_0x0036:
            if (r5 == 0) goto L_0x0039
            r7 = r5
        L_0x0039:
            return r7
        L_0x003a:
            r5 = move-exception
            java.lang.String r6 = "getValue, fastJson parseObject fail"
            com.bytedance.ee.log.C13479a.m54759a(r1, r6, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.appsetting.p242a.C4214a.mo16540a(java.lang.String, java.lang.Class, com.bytedance.ee.util.io.NonProguard):com.bytedance.ee.util.io.NonProguard");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e A[Catch:{ Exception -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> java.util.List<T> mo16542a(java.lang.String r6, java.lang.Class<T> r7, java.util.List<T> r8) {
        /*
            r5 = this;
            com.bytedance.ee.bear.appsetting.a.a$a r0 = new com.bytedance.ee.bear.appsetting.a.a$a
            r1 = 1
            r0.<init>(r6, r7, r1)
            java.util.Map<com.bytedance.ee.bear.appsetting.a.a$a, java.lang.Object> r2 = r5.f12725c
            java.lang.Object r2 = r2.get(r0)
            if (r2 == 0) goto L_0x0011
            java.util.List r2 = (java.util.List) r2
            return r2
        L_0x0011:
            java.lang.String r2 = "AppSettingDataManager"
            if (r8 == 0) goto L_0x0020
            java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r8)     // Catch:{ Exception -> 0x001a }
            goto L_0x0022
        L_0x001a:
            r3 = move-exception
            java.lang.String r4 = "getValueArray, fastJson toJsonString fail"
            com.bytedance.ee.log.C13479a.m54759a(r2, r4, r3)
        L_0x0020:
            java.lang.String r3 = "[]"
        L_0x0022:
            java.lang.Object r6 = r5.mo16541a(r6, r3, r1)     // Catch:{ Exception -> 0x003c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x003c }
            java.util.List r6 = com.alibaba.fastjson.JSON.parseArray(r6, r7)     // Catch:{ Exception -> 0x003c }
            if (r6 == 0) goto L_0x0033
            java.util.Map<com.bytedance.ee.bear.appsetting.a.a$a, java.lang.Object> r7 = r5.f12725c     // Catch:{ Exception -> 0x003c }
            r7.put(r0, r6)     // Catch:{ Exception -> 0x003c }
        L_0x0033:
            boolean r7 = com.bytedance.ee.util.p702e.C13657b.m55421a(r6)     // Catch:{ Exception -> 0x003c }
            if (r7 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r8 = r6
        L_0x003b:
            return r8
        L_0x003c:
            r6 = move-exception
            java.lang.String r7 = "getValue, fastJson parseObject fail"
            com.bytedance.ee.log.C13479a.m54759a(r2, r7, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.appsetting.p242a.C4214a.mo16542a(java.lang.String, java.lang.Class, java.util.List):java.util.List");
    }
}
