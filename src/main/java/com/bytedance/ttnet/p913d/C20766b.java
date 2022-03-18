package com.bytedance.ttnet.p913d;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.retrofit.C14078a;
import com.bytedance.frameworks.baselib.network.http.util.UrlBuilder;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.frameworks.core.p747a.C14092a;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.utils.C20786a;
import com.bytedance.ttnet.utils.C20790c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.d.b */
public final class C20766b extends C14078a {

    /* renamed from: a */
    private static volatile boolean f50882a;

    /* renamed from: a */
    public static void m75669a(boolean z) {
        f50882a = z;
    }

    /* renamed from: a */
    private String m75668a(String str) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> parseUrlWithValueList = UrlUtils.parseUrlWithValueList(str, linkedHashMap);
            if (parseUrlWithValueList == null) {
                return str;
            }
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null) {
                        List list = (List) entry.getValue();
                        if (list != null) {
                            if (!list.isEmpty()) {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    if (linkedHashSet.contains(str2)) {
                                        it.remove();
                                    } else {
                                        linkedHashSet.add(str2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            UrlBuilder urlBuilder = new UrlBuilder(((String) parseUrlWithValueList.first) + ((String) parseUrlWithValueList.second));
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (entry2 != null) {
                        if (entry2.getKey() != null) {
                            List<String> list2 = (List) entry2.getValue();
                            if (list2 != null) {
                                if (!list2.isEmpty()) {
                                    for (String str3 : list2) {
                                        urlBuilder.addParam((String) entry2.getKey(), str3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return urlBuilder.build();
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.frameworks.baselib.network.http.retrofit.C14078a
    /* renamed from: a */
    public Request mo51791a(Request request) throws IOException {
        Request a = super.mo51791a(request);
        if (a == null) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Request.C20591a newBuilder = a.newBuilder();
        String a2 = m75668a(a.getUrl());
        newBuilder.mo69377a(a2);
        if (a.getMetrics() != null) {
            a.getMetrics().f50257C = SystemClock.uptimeMillis() - uptimeMillis;
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        ArrayList arrayList = new ArrayList();
        if (a.getHeaders() != null) {
            arrayList.addAll(a.getHeaders());
        }
        if (f50882a) {
            try {
                LinkedList<Pair> linkedList = new LinkedList();
                String a3 = C14092a.m57057a(a2, linkedList);
                if (a3 != null) {
                    newBuilder.mo69377a(a3);
                }
                if (!linkedList.isEmpty()) {
                    for (Pair pair : linkedList) {
                        if (pair != null) {
                            arrayList.add(new Header((String) pair.first, (String) pair.second));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (a.getMetrics() != null) {
            a.getMetrics().f50258D = SystemClock.uptimeMillis() - valueOf.longValue();
        }
        Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
        try {
            String a4 = C20790c.m75734a(a2);
            if (!StringUtils.isEmpty(a4)) {
                arrayList.add(new Header("X-SS-REQ-TICKET", a4));
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (a.getMetrics() != null) {
            a.getMetrics().f50259E = SystemClock.uptimeMillis() - valueOf2.longValue();
        }
        Long valueOf3 = Long.valueOf(SystemClock.uptimeMillis());
        C20786a.m75723a(a2, arrayList);
        if (a.getMetrics() != null) {
            a.getMetrics().f50261G = SystemClock.uptimeMillis() - valueOf3.longValue();
        }
        ClientKeyManager.m75584a().mo70011a(arrayList, a.getMetrics());
        newBuilder.mo69379a(arrayList);
        return newBuilder.mo69380b();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b6  */
    @Override // com.bytedance.frameworks.baselib.network.http.retrofit.C14078a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo51792a(com.bytedance.retrofit2.client.Request r18, com.bytedance.retrofit2.SsResponse r19) throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 547
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p913d.C20766b.mo51792a(com.bytedance.retrofit2.client.Request, com.bytedance.retrofit2.SsResponse):void");
    }
}
