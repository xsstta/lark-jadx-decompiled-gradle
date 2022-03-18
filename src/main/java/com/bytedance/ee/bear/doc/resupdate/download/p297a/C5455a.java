package com.bytedance.ee.bear.doc.resupdate.download.p297a;

import android.text.TextUtils;
import com.bytedance.ee.bear.doc.resupdate.download.AbstractC5454a;
import com.bytedance.ee.bear.doc.resupdate.download.AbstractC5463c;
import com.bytedance.ee.log.C13479a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.doc.resupdate.download.a.a */
public class C5455a {

    /* renamed from: b */
    private static C5455a f15516b;

    /* renamed from: a */
    private final Map<String, C5456b> f15517a = new ConcurrentHashMap();

    /* renamed from: a */
    public static C5455a m22118a() {
        if (f15516b == null) {
            synchronized (C5455a.class) {
                if (f15516b == null) {
                    f15516b = new C5455a();
                }
            }
        }
        return f15516b;
    }

    /* renamed from: a */
    public String mo21832a(String str) {
        return str.substring(str.lastIndexOf("/") + 1);
    }

    /* renamed from: a */
    public void mo21834a(String... strArr) {
        for (String str : strArr) {
            if (this.f15517a.containsKey(str)) {
                this.f15517a.get(str).mo21835a();
            }
        }
    }

    /* renamed from: a */
    public void mo21833a(String str, String str2, String str3, String str4, AbstractC5463c cVar) {
        if (TextUtils.isEmpty(str2)) {
            C13479a.m54775e("DownloadManager", "add(): downloadTask Fail, cause filePath is null");
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = mo21832a(str);
        }
        C5456b bVar = this.f15517a.get(str);
        if (bVar != null) {
            C13479a.m54764b("DownloadManager", "add url = " + str + ", task exist, replace listener");
            AbstractC5463c c = bVar.mo21843c();
            if ((c instanceof AbstractC5454a) && (cVar instanceof AbstractC5454a)) {
                ((AbstractC5454a) cVar).mo21827a(((AbstractC5454a) c).mo21830b());
            }
            bVar.mo21838a(cVar);
            return;
        }
        this.f15517a.put(str, new C5456b(new C5459c(str, str2, str3, str4), cVar));
    }
}
