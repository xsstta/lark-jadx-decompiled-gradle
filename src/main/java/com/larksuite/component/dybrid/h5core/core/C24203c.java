package com.larksuite.component.dybrid.h5core.core;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.dybrid.h5api.api.H5Param;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5api.p1071b.C24176c;
import com.larksuite.component.dybrid.h5core.core.impl.C24208c;
import com.larksuite.component.dybrid.h5core.p1076d.C24212a;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import com.larksuite.component.dybrid.offlineresource.C24256d;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.larksuite.component.dybrid.h5core.core.c */
public class C24203c {

    /* renamed from: b */
    private static C24203c f59821b;

    /* renamed from: a */
    private List<C24208c> f59822a;

    private C24203c() {
        if (this.f59822a == null) {
            this.f59822a = new LinkedList();
            m88402b();
        }
    }

    /* renamed from: a */
    public static C24203c m88400a() {
        if (f59821b == null) {
            synchronized (C24203c.class) {
                if (f59821b == null) {
                    f59821b = new C24203c();
                }
            }
        }
        return f59821b;
    }

    /* renamed from: b */
    private void m88402b() {
        this.f59822a.add(new C24208c("inl", "isNeedLogin", H5Param.ParamType.BOOLEAN, true));
        this.f59822a.add(new C24208c("u", "url", H5Param.ParamType.STRING, ""));
        this.f59822a.add(new C24208c("aid", "appId", H5Param.ParamType.STRING, ""));
        this.f59822a.add(new C24208c("nt", "newTab", H5Param.ParamType.BOOLEAN, false));
        this.f59822a.add(new C24208c("st", "showTitle", H5Param.ParamType.BOOLEAN, true));
        this.f59822a.add(new C24208c("sib", "showInitBack", H5Param.ParamType.BOOLEAN, true));
        this.f59822a.add(new C24208c("stb", "showTitleBg", H5Param.ParamType.BOOLEAN, true));
        this.f59822a.add(new C24208c("nfdu", "needFilterDriveUrl", H5Param.ParamType.BOOLEAN, true));
        this.f59822a.add(new C24208c("tt", "transition", H5Param.ParamType.BOOLEAN, false));
        this.f59822a.add(new C24208c("sf", "startFlag", H5Param.ParamType.INT, 0));
        this.f59822a.add(new C24208c("bn", "bizName", H5Param.ParamType.STRING, "H5Container"));
        this.f59822a.add(new C24208c("isl", "isShowLoading", H5Param.ParamType.BOOLEAN, true));
        this.f59822a.add(new C24208c("si", "sourceId", H5Param.ParamType.INT, -1));
        this.f59822a.add(new C24208c("orp", "offlineResPath", H5Param.ParamType.STRING, ""));
        this.f59822a.add(new C24208c("icb", "isCanBack", H5Param.ParamType.BOOLEAN, true));
        this.f59822a.add(new C24208c("tb", "titleBackgroundTranslate", H5Param.ParamType.STRING, ""));
        this.f59822a.add(new C24208c("sfp", "screenForcePortrait", H5Param.ParamType.STRING, ""));
        this.f59822a.add(new C24208c("ua", "userAgent", H5Param.ParamType.STRING, ""));
    }

    /* renamed from: a */
    private void m88401a(Bundle bundle) {
        long currentTimeMillis = System.currentTimeMillis();
        C24256d.m88585a().mo86887b();
        C24174b.m88296a("H5ParamParser", "syncAllResource:" + (System.currentTimeMillis() - currentTimeMillis));
        String a = C24246a.m88555a(bundle, "url");
        bundle.putString("url", a);
        if (!TextUtils.isEmpty(C24246a.m88555a(bundle, "bizName"))) {
            bundle.putBoolean("screenForcePortrait", !TextUtils.equals("no", C24246a.m88555a(bundle, "screenForcePortrait")));
        }
        Uri a2 = C24176c.m88304a(a);
        if (a2 != null && !TextUtils.isEmpty(a2.getScheme()) && !TextUtils.equals("file", a2.getScheme()) && !TextUtils.isEmpty(a2.getHost())) {
            String a3 = C24246a.m88555a(bundle, "bizName");
            if (C24212a.m88458b() != null && !TextUtils.isEmpty(a3)) {
                String a4 = C24256d.m88585a().mo86884a(a3);
                StringBuilder sb = new StringBuilder();
                sb.append("Have offlineResRootPath:");
                sb.append(!TextUtils.isEmpty(a4));
                sb.append(" bizName:");
                sb.append(a3);
                C24174b.m88296a("H5ParamParser", sb.toString());
                if (!TextUtils.isEmpty(a4)) {
                    bundle.putBoolean("isShowLoading", false);
                    bundle.putString("offlineResPath", a4);
                }
            }
        }
    }

    /* renamed from: a */
    public Bundle mo86831a(Bundle bundle, boolean z) {
        if (bundle == null) {
            return null;
        }
        for (C24208c cVar : this.f59822a) {
            bundle = cVar.mo86841a(bundle, z);
        }
        m88401a(bundle);
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86832a(android.os.Bundle r5, java.lang.String r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0035
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0009
            goto L_0x0035
        L_0x0009:
            java.util.List<com.larksuite.component.dybrid.h5core.core.impl.c> r0 = r4.f59822a
            java.util.Iterator r0 = r0.iterator()
        L_0x000f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0035
            java.lang.Object r1 = r0.next()
            com.larksuite.component.dybrid.h5core.core.impl.c r1 = (com.larksuite.component.dybrid.h5core.core.impl.C24208c) r1
            java.lang.String r2 = r1.mo86842a()
            java.lang.String r1 = r1.mo86843b()
            boolean r3 = r6.equals(r2)
            if (r3 != 0) goto L_0x002f
            boolean r3 = r6.equals(r1)
            if (r3 == 0) goto L_0x000f
        L_0x002f:
            r5.remove(r2)
            r5.remove(r1)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.dybrid.h5core.core.C24203c.mo86832a(android.os.Bundle, java.lang.String):void");
    }
}
