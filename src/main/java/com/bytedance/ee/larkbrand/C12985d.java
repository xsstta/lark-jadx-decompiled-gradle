package com.bytedance.ee.larkbrand;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.larkbrand.d */
public class C12985d {

    /* renamed from: a */
    private CookieManager f34575a;

    /* renamed from: com.bytedance.ee.larkbrand.d$a */
    private static final class C12987a {

        /* renamed from: a */
        public static final C12985d f34576a = new C12985d();
    }

    /* renamed from: a */
    public static C12985d m53431a() {
        return C12987a.f34576a;
    }

    private C12985d() {
        this.f34575a = CookieManager.getInstance();
    }

    /* renamed from: b */
    public void mo48904b() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f34575a.flush();
        }
    }

    /* renamed from: a */
    public void mo48903a(boolean z) {
        this.f34575a.setAcceptCookie(z);
    }

    /* renamed from: a */
    private List<String> m53432a(Uri uri) {
        String path = uri.getPath();
        ArrayList arrayList = new ArrayList();
        arrayList.add("/");
        if (path != null) {
            String[] split = path.split("/");
            StringBuilder sb = new StringBuilder();
            for (String str : split) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append("/");
                    sb.append(str);
                    arrayList.add(sb.toString());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private List<String> m53434b(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            String[] split = str.split("; ");
            for (String str2 : split) {
                int indexOf = str2.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                if (indexOf > 0) {
                    arrayList.add(str2.substring(0, indexOf));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo48901a(String str) {
        Uri parse;
        String host;
        if (!(str == null || (host = (parse = Uri.parse(str)).getHost()) == null)) {
            String str2 = parse.getScheme() + "://" + host;
            List<String> a = m53432a(parse);
            HashMap hashMap = new HashMap();
            List<String> arrayList = new ArrayList<>();
            for (String str3 : a) {
                List<String> b = m53434b(this.f34575a.getCookie(str2 + str3));
                hashMap.put(str3, m53433a(b, arrayList));
                arrayList = b;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    this.f34575a.setCookie(str2, ((String) it.next()) + "=; path=" + ((String) entry.getKey()) + "; ");
                }
            }
            this.f34575a.flush();
        }
    }

    /* renamed from: a */
    public void mo48902a(String str, String str2) {
        this.f34575a.setCookie(str, str2);
    }

    /* renamed from: a */
    private List<String> m53433a(List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!list2.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
