package com.bytedance.ttnet.p910a;

import com.bytedance.common.utility.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/* renamed from: com.bytedance.ttnet.a.b */
public class C20740b extends Observable {

    /* renamed from: a */
    private static volatile C20740b f50759a = null;

    /* renamed from: b */
    private static volatile String f50760b = "";

    /* renamed from: c */
    private static volatile String f50761c = "";

    /* renamed from: d */
    private static volatile String f50762d = "";

    /* renamed from: a */
    public static C20740b m75544a() {
        if (f50759a == null) {
            synchronized (C20740b.class) {
                if (f50759a == null) {
                    f50759a = new C20740b();
                }
            }
        }
        return f50759a;
    }

    /* renamed from: a */
    private void m75545a(Map<String, Object> map) {
        setChanged();
        notifyObservers(map);
    }

    /* renamed from: a */
    public void mo69982a(String str, String str2, String str3) {
        Logger.m15167d("CronetDataStorageAccess", "onStoreIdcChanged idc: " + str + " region: " + str2 + " source: " + str3);
        f50760b = str;
        f50761c = str2;
        f50762d = str3;
        HashMap hashMap = new HashMap();
        hashMap.put("store_idc", str);
        hashMap.put("store_region", str2);
        hashMap.put("region_source", str3);
        m75545a(hashMap);
    }
}
