package com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c;

import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.AbstractC23840f;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.AbstractC23841g;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.updatesdk.a.b.d.c.c */
public class C23868c {
    public static final String CLIENT_API = "clientApi";
    private static final String END_FLAG = "_";
    private static String url;
    private String method_;
    private String ver_ = "1.1";

    /* renamed from: a */
    private String m87269a(Field field) throws IllegalAccessException, IllegalArgumentException {
        Object obj = field.get(this);
        if (obj != null && (obj instanceof AbstractC23866b)) {
            return ((AbstractC23866b) obj).toJson();
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    /* renamed from: c */
    public static void m87270c(String str) {
        url = str;
    }

    /* renamed from: a */
    public String mo85628a() throws IllegalAccessException, IllegalArgumentException, ArrayIndexOutOfBoundsException {
        mo85634e();
        Map<String, Field> c = mo85632c();
        int size = c.size();
        String[] strArr = new String[size];
        c.keySet().toArray(strArr);
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            String a = m87269a(c.get(strArr[i]));
            if (a != null) {
                String a2 = AbstractC23841g.m87138a(a);
                sb.append(strArr[i]);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(a2);
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            i++;
        } while (i < size);
        int length = sb.length();
        if (length > 0) {
            int i2 = length - 1;
            if (sb.charAt(i2) == '&') {
                sb.deleteCharAt(i2);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo85629a(String str) {
        this.method_ = str;
    }

    /* renamed from: b */
    public String mo85630b() {
        return this.method_;
    }

    /* renamed from: b */
    public void mo85631b(String str) {
        this.ver_ = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, Field> mo85632c() {
        HashMap hashMap = new HashMap();
        Field[] a = AbstractC23840f.m87137a(getClass());
        for (Field field : a) {
            field.setAccessible(true);
            String name = field.getName();
            if (name.endsWith(END_FLAG)) {
                hashMap.put(name.substring(0, name.length() - 1), field);
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    public String mo85633d() {
        return url + CLIENT_API;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo85634e() {
    }
}
