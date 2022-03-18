package com.larksuite.component.dybrid.offlineresource;

import com.google.gson.Gson;
import com.larksuite.component.dybrid.offlineresource.bean.DynamicUrlSettingsBean;
import com.larksuite.component.dybrid.offlineresource.p1083a.AbstractC24252b;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;

/* renamed from: com.larksuite.component.dybrid.offlineresource.d */
public class C24256d {

    /* renamed from: b */
    private static C24256d f59917b;

    /* renamed from: c */
    private static DynamicUrlSettingsBean f59918c;

    /* renamed from: a */
    private AbstractC24257e f59919a;

    /* renamed from: c */
    public DynamicUrlSettingsBean mo86889c() {
        return f59918c;
    }

    /* renamed from: a */
    public static C24256d m88585a() {
        synchronized (C24256d.class) {
            if (f59917b == null) {
                f59917b = new C24256d();
            }
        }
        return f59917b;
    }

    /* renamed from: b */
    public void mo86887b() {
        boolean z;
        AbstractC24257e eVar = this.f59919a;
        if (eVar == null || !eVar.mo86775a()) {
            z = false;
        } else {
            z = true;
        }
        m88586a(z);
    }

    /* renamed from: a */
    public void mo86886a(AbstractC24257e eVar) {
        this.f59919a = eVar;
    }

    /* renamed from: a */
    private void m88586a(boolean z) {
        if (C24253b.m88574a().f59911b != null) {
            try {
                for (String str : C24253b.m88574a().f59911b.keySet()) {
                    C24254c.m88579a().mo86882a(str, C24253b.m88574a().mo86874a(str, z));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public String mo86884a(String str) {
        C24250a a = C24253b.m88574a().mo86873a(str);
        if (a == null) {
            return null;
        }
        return C24254c.m88579a().mo86880a(a.f59906a, a.f59907b);
    }

    /* renamed from: b */
    public void mo86888b(String str) {
        try {
            Log.m165379d("OfflineResourceAPi", "registerUrlMapper:" + str);
            DynamicUrlSettingsBean dynamicUrlSettingsBean = (DynamicUrlSettingsBean) new Gson().fromJson(str, DynamicUrlSettingsBean.class);
            if (dynamicUrlSettingsBean != null) {
                DynamicUrlSettingsBean dynamicUrlSettingsBean2 = new DynamicUrlSettingsBean();
                dynamicUrlSettingsBean2.list = new ArrayList();
                for (DynamicUrlSettingsBean.DynamicMapperBean dynamicMapperBean : dynamicUrlSettingsBean.list) {
                    DynamicUrlSettingsBean.DynamicUrlBean urlBean = dynamicMapperBean.getUrlBean();
                    if (urlBean != null) {
                        C24253b.m88574a().mo86875a(urlBean.bizName, new C24250a(urlBean.accessKey, urlBean.channel, urlBean.forceApply));
                        dynamicUrlSettingsBean2.list.add(dynamicMapperBean);
                    }
                }
                f59918c = dynamicUrlSettingsBean2;
            }
            mo86887b();
        } catch (Exception e) {
            Log.m165384e("OfflineResourceAPi", "parse settings json error.", e);
        }
    }

    /* renamed from: a */
    public void mo86885a(AbstractC24252b bVar) {
        boolean z;
        if (C24253b.m88574a().f59911b != null) {
            AbstractC24257e eVar = this.f59919a;
            if (eVar == null || !eVar.mo86775a()) {
                z = false;
            } else {
                z = true;
            }
            try {
                for (String str : C24253b.m88574a().f59911b.keySet()) {
                    C24254c.m88579a().mo86883a(str, C24253b.m88574a().mo86874a(str, z), bVar);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
