package com.bytedance.ttnet.config;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.ttnet.utils.C20793d;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.config.d */
public class C20756d {

    /* renamed from: a */
    private static volatile C20756d f50843a;

    /* renamed from: a */
    public static C20756d m75629a() {
        if (f50843a == null) {
            synchronized (C20756d.class) {
                if (f50843a == null) {
                    f50843a = new C20756d();
                }
            }
        }
        return f50843a;
    }

    /* renamed from: a */
    private List<String> m75630a(String str) {
        ArrayList arrayList = new ArrayList();
        if (StringUtils.isEmpty(str)) {
            return arrayList;
        }
        String[] split = str.split(",");
        for (String str2 : split) {
            if (!StringUtils.isEmpty(str2)) {
                arrayList.add(str2.trim());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<String> m75631a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            String[] split = str.split(";");
            for (String str2 : split) {
                if (!StringUtils.isEmpty(str2)) {
                    arrayList.add(str2.trim());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo70036a(final String str, final String str2) {
        if (!str2.equals(str)) {
            new ThreadPlus("Sync-Cookie") {
                /* class com.bytedance.ttnet.config.C20756d.C207571 */

                @Override // com.bytedance.common.utility.concurrent.ThreadPlus
                public void run() {
                    C20756d.this.mo70037b(str, str2);
                }
            }.start();
        }
    }

    /* renamed from: b */
    public void mo70037b(String str, String str2) {
        CookieHandler cookieHandler = CookieHandler.getDefault();
        if (cookieHandler == null) {
            Logger.m15170e("ShareCookieHostsSync", "Default CookieHandler is null.");
            return;
        }
        List<String> a = m75630a(str);
        List<String> a2 = m75630a(str2);
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        for (String str3 : a2) {
            if (C20793d.m75745a(str3, a)) {
                Logger.m15167d("ShareCookieHostsSync", "kept hosts add: " + str3);
                arrayList.add(str3);
            } else {
                Logger.m15167d("ShareCookieHostsSync", "added hosts add: " + str3);
                arrayList2.add(str3);
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                arrayList = arrayList2;
            }
            Map<String, List<String>> hashMap = new HashMap<>();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str4 = (String) it.next();
                try {
                    hashMap = cookieHandler.get(new URI("https://" + str4 + "/"), null);
                    if (hashMap.size() > 0) {
                        Logger.m15167d("ShareCookieHostsSync", "Sync cookie from host: " + str4 + " sync cookies: " + hashMap.toString());
                        break;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (!(hashMap == null || hashMap.isEmpty())) {
                List<String> list = hashMap.get("Cookie");
                if (!((list == null || list.isEmpty()) && ((list = hashMap.get(ConvertOfficeToSpaceService.f88309g)) == null || list.isEmpty()))) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    List<String> a3 = m75631a(list);
                    for (String str5 : arrayList2) {
                        ArrayList arrayList3 = new ArrayList();
                        try {
                            URI uri = new URI("https://" + str5 + "/");
                            for (String str6 : a3) {
                                if (!StringUtils.isEmpty(str6)) {
                                    arrayList3.add(str6 + "; Domain=" + str5);
                                }
                            }
                            linkedHashMap.put("Set-Cookie", arrayList3);
                            cookieHandler.put(uri, linkedHashMap);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
