package com.huawei.agconnect.core.p1011a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.huawei.agconnect.core.AbstractC23416b;
import com.huawei.agconnect.core.C23410a;
import com.huawei.agconnect.core.ServiceDiscovery;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.huawei.agconnect.core.a.b */
public class C23412b {

    /* renamed from: a */
    private Context f57731a;

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.agconnect.core.a.b$a */
    public static class C23414a implements Serializable, Comparator<Map.Entry<String, Integer>> {
        private C23414a() {
        }

        /* renamed from: a */
        public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry.getValue().intValue() - entry2.getValue().intValue();
        }
    }

    C23412b(Context context) {
        this.f57731a = context;
    }

    /* renamed from: a */
    private <T extends AbstractC23416b> T m84957a(String str) {
        String str2;
        String str3;
        StringBuilder sb;
        try {
            Class<?> cls = Class.forName(str);
            if (AbstractC23416b.class.isAssignableFrom(cls)) {
                return (T) ((AbstractC23416b) Class.forName(str).newInstance());
            }
            Log.e("ServiceRegistrarParser", cls + " must extends from ServiceRegistrar.");
            return null;
        } catch (ClassNotFoundException e) {
            str2 = "Can not found service class, " + e.getMessage();
            Log.e("ServiceRegistrarParser", str2);
            return null;
        } catch (InstantiationException e2) {
            sb = new StringBuilder();
            sb.append("instantiate service class exception ");
            str3 = e2.getLocalizedMessage();
            sb.append(str3);
            str2 = sb.toString();
            Log.e("ServiceRegistrarParser", str2);
            return null;
        } catch (IllegalAccessException e3) {
            sb = new StringBuilder();
            sb.append("instantiate service class exception ");
            str3 = e3.getLocalizedMessage();
            sb.append(str3);
            str2 = sb.toString();
            Log.e("ServiceRegistrarParser", str2);
            return null;
        }
    }

    /* renamed from: b */
    private List<String> m84958b() {
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        Bundle c = m84959c();
        if (c == null) {
            return arrayList;
        }
        HashMap hashMap = new HashMap(10);
        for (String str : c.keySet()) {
            if ("com.huawei.agconnect.core.ServiceRegistrar".equals(c.getString(str))) {
                String[] split = str.split(":");
                if (split.length == 2) {
                    try {
                        hashMap.put(split[0], Integer.valueOf(split[1]));
                    } catch (NumberFormatException e) {
                        sb = new StringBuilder();
                        sb.append("registrar configuration format error:");
                        str = e.getMessage();
                    }
                } else if (split.length == 1) {
                    hashMap.put(split[0], 1000);
                } else {
                    sb = new StringBuilder();
                    sb.append("registrar configuration error, ");
                    sb.append(str);
                    Log.e("ServiceRegistrarParser", sb.toString());
                }
            }
        }
        ArrayList<Map.Entry> arrayList2 = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList2, new C23414a());
        for (Map.Entry entry : arrayList2) {
            arrayList.add(entry.getKey());
        }
        return arrayList;
    }

    /* renamed from: c */
    private Bundle m84959c() {
        PackageManager packageManager = this.f57731a.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(this.f57731a, ServiceDiscovery.class), SmActions.ACTION_ONTHECALL_EXIT);
            if (serviceInfo != null) {
                return serviceInfo.metaData;
            }
            Log.e("ServiceRegistrarParser", "Can not found ServiceDiscovery service.");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ServiceRegistrarParser", "get ServiceDiscovery exception." + e.getLocalizedMessage());
        }
    }

    /* renamed from: a */
    public List<C23410a> mo81795a() {
        Log.i("ServiceRegistrarParser", "getServices");
        List<String> b = m84958b();
        ArrayList arrayList = new ArrayList();
        for (String str : b) {
            AbstractC23416b a = m84957a(str);
            if (a != null) {
                a.mo81798a(this.f57731a);
                List<C23410a> b2 = a.mo81799b(this.f57731a);
                if (b2 != null) {
                    arrayList.addAll(b2);
                }
            }
        }
        Log.i("ServiceRegistrarParser", "services:" + Integer.valueOf(arrayList.size()));
        return arrayList;
    }
}
