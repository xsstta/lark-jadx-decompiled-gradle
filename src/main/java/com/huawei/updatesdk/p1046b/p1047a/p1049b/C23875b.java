package com.huawei.updatesdk.p1046b.p1047a.p1049b;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.ArrayMap;
import android.util.ArraySet;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.AbstractC23841g;
import com.huawei.updatesdk.p1046b.p1047a.p1049b.C23873a;
import com.huawei.updatesdk.p1046b.p1047a.p1049b.C23876c;
import java.io.File;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.huawei.updatesdk.b.a.b.b */
public class C23875b {

    /* renamed from: b */
    private static C23875b f59117b;

    /* renamed from: a */
    private final Map<String, C23873a> f59118a = new HashMap();

    private C23875b() {
    }

    /* renamed from: a */
    public static synchronized C23875b m87303a() {
        C23875b bVar;
        synchronized (C23875b.class) {
            if (f59117b == null) {
                f59117b = new C23875b();
            }
            bVar = f59117b;
        }
        return bVar;
    }

    /* renamed from: a */
    private static void m87304a(C23873a aVar) {
        m87303a().f59118a.put(aVar.mo85657c(), aVar);
    }

    /* renamed from: b */
    private static ArrayList<String> m87305b(PackageInfo packageInfo) {
        ArraySet<String> arraySet;
        C23873a aVar = new C23873a();
        aVar.mo85655a(packageInfo.packageName);
        File file = new File(packageInfo.applicationInfo.sourceDir);
        if (!file.exists()) {
            return null;
        }
        aVar.mo85653a(file.lastModified());
        C23876c.C23877a a = C23876c.m87307a(file);
        ArrayMap<String, ArraySet<PublicKey>> arrayMap = a.f59119a;
        if (arrayMap == null || arrayMap.isEmpty() || (arraySet = a.f59120b) == null || arraySet.isEmpty()) {
            m87304a(aVar);
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, ArraySet<PublicKey>> entry : a.f59119a.entrySet()) {
            if (a.f59120b.contains(entry.getKey())) {
                Iterator<PublicKey> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC23841g.m87139a(it.next().getEncoded()));
                }
            }
        }
        C23873a.C23874a aVar2 = new C23873a.C23874a();
        aVar2.mo85659a(arrayList);
        aVar.mo85654a(aVar2);
        m87304a(aVar);
        return arrayList;
    }

    /* renamed from: a */
    public List<String> mo85660a(PackageInfo packageInfo) {
        String str;
        if (Build.VERSION.SDK_INT < 21 || packageInfo == null || (str = packageInfo.applicationInfo.sourceDir) == null) {
            return null;
        }
        long lastModified = new File(str).lastModified();
        C23873a aVar = m87303a().f59118a.get(packageInfo.packageName);
        if (aVar == null || aVar.mo85656b() != lastModified) {
            return m87305b(packageInfo);
        }
        if (aVar.mo85652a() == null) {
            return null;
        }
        return aVar.mo85652a().mo85658a();
    }
}
