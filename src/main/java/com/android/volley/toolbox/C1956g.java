package com.android.volley.toolbox;

import com.android.volley.AbstractC1921a;
import com.android.volley.C1930e;
import com.android.volley.C1933h;
import com.android.volley.C1941m;
import com.huawei.hms.framework.common.ContainerUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

/* renamed from: com.android.volley.toolbox.g */
public class C1956g {
    /* renamed from: a */
    private static SimpleDateFormat m8662a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: a */
    static String m8660a(long j) {
        return m8662a().format(new Date(j));
    }

    /* renamed from: a */
    public static long m8658a(String str) {
        try {
            return m8662a().parse(str).getTime();
        } catch (ParseException e) {
            C1941m.m8603a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: a */
    public static AbstractC1921a.C1922a m8659a(C1933h hVar) {
        long j;
        long j2;
        long j3;
        boolean z;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = hVar.f6599c;
        String str = map.get("Date");
        if (str != null) {
            j = m8658a(str);
        } else {
            j = 0;
        }
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j3 = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j3 = 0;
            j2 = 0;
        }
        String str3 = map.get("Expires");
        if (str3 != null) {
            j4 = m8658a(str3);
        } else {
            j4 = 0;
        }
        String str4 = map.get("Last-Modified");
        if (str4 != null) {
            j5 = m8658a(str4);
        } else {
            j5 = 0;
        }
        String str5 = map.get("ETag");
        if (z) {
            j7 = currentTimeMillis + (j3 * 1000);
            if (i != 0) {
                j8 = j7;
            } else {
                Long.signum(j2);
                j8 = (j2 * 1000) + j7;
            }
            j6 = j8;
        } else {
            j6 = 0;
            if (j <= 0 || j4 < j) {
                j7 = 0;
            } else {
                j7 = currentTimeMillis + (j4 - j);
                j6 = j7;
            }
        }
        AbstractC1921a.C1922a aVar = new AbstractC1921a.C1922a();
        aVar.f6561a = hVar.f6598b;
        aVar.f6562b = str5;
        aVar.f6566f = j7;
        aVar.f6565e = j6;
        aVar.f6563c = j;
        aVar.f6564d = j5;
        aVar.f6567g = map;
        aVar.f6568h = hVar.f6600d;
        return aVar;
    }

    /* renamed from: a */
    static List<C1930e> m8663a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new C1930e(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: a */
    static Map<String, String> m8664a(List<C1930e> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C1930e eVar : list) {
            treeMap.put(eVar.mo9799a(), eVar.mo9800b());
        }
        return treeMap;
    }

    /* renamed from: a */
    public static String m8661a(Map<String, String> map, String str) {
        String str2 = map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split(ContainerUtils.KEY_VALUE_DELIMITER, 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }
}
