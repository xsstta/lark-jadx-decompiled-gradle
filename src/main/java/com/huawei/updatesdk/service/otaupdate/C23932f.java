package com.huawei.updatesdk.service.otaupdate;

import com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.AbstractC23865a;
import com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.C23868c;
import com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.C23869d;
import com.huawei.updatesdk.p1046b.p1053e.p1054a.C23888b;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.appmgr.bean.C23907a;
import com.huawei.updatesdk.service.appmgr.bean.C23909b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.updatesdk.service.otaupdate.f */
public class C23932f {

    /* renamed from: a */
    private static String f59208a = "com.huawei.appmarket";

    /* renamed from: b */
    private static AbstractC23926b f59209b;

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.updatesdk.service.otaupdate.f$b */
    public static class C23934b implements AbstractC23865a {
        private C23934b() {
        }

        @Override // com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.AbstractC23865a
        /* renamed from: a */
        public void mo85620a(C23868c cVar, C23869d dVar) {
        }

        @Override // com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.AbstractC23865a
        /* renamed from: b */
        public void mo85621b(C23868c cVar, C23869d dVar) {
            List<ApkUpgradeInfo> list;
            if (dVar instanceof C23909b) {
                C23909b bVar = (C23909b) dVar;
                if (dVar.mo85642d() == 0 && dVar.mo85643e() == 0) {
                    ArrayList<ApkUpgradeInfo> arrayList = bVar.list_;
                    if ((arrayList != null && arrayList.size() != 0) || ((list = bVar.notRcmList_) != null && list.size() != 0)) {
                        ApkUpgradeInfo b = C23932f.m87498b(bVar.list_);
                        if (C23932f.f59209b != null) {
                            C23932f.f59209b.mo85829a(b);
                        }
                    } else if (C23932f.f59209b != null) {
                        C23932f.f59209b.mo85828a(dVar.mo85642d());
                    }
                } else if (C23932f.f59209b != null) {
                    C23932f.f59209b.mo85830b(dVar.mo85642d());
                }
            } else if (C23932f.f59209b != null) {
                C23932f.f59209b.mo85828a(dVar.mo85642d());
            }
        }
    }

    /* renamed from: a */
    public static void m87496a(AbstractC23926b bVar) {
        f59209b = bVar;
    }

    /* renamed from: a */
    public static void m87497a(String str) {
        f59208a = str;
        C23907a n = C23907a.m87394n(str);
        n.mo85675a(C23936h.m87510g().mo85884e() ? 34 : 0);
        C23888b.m87346a(n, new C23934b());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static ApkUpgradeInfo m87498b(List<ApkUpgradeInfo> list) {
        if (list == null) {
            return null;
        }
        for (ApkUpgradeInfo apkUpgradeInfo : list) {
            String str = f59208a;
            if (str != null && str.equals(apkUpgradeInfo.getPackage_())) {
                return apkUpgradeInfo;
            }
        }
        return null;
    }
}
