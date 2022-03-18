package com.bytedance.ee.larkbrand.permission;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.permission.p662a.C13282a;
import com.ss.android.lark.littleapp.entity.LittleAppPermissionData;
import com.tt.miniapp.permission.C66578b;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.ee.larkbrand.permission.e */
public class C13288e {

    /* renamed from: a */
    private Context f35188a;

    /* renamed from: b */
    private HashMap<String, List<LittleAppPermissionData>> f35189b = new HashMap<>();

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.larkbrand.permission.e$a */
    public static class C13289a {

        /* renamed from: a */
        static C13288e f35190a = new C13288e();
    }

    /* renamed from: a */
    public static C13288e m54115a() {
        return C13289a.f35190a;
    }

    /* renamed from: b */
    public void mo49529b() {
        HashMap<String, List<LittleAppPermissionData>> hashMap = this.f35189b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public void mo49525a(Context context) {
        this.f35188a = context;
    }

    /* renamed from: a */
    public void mo49526a(String str) {
        HashMap<String, List<LittleAppPermissionData>> hashMap = this.f35189b;
        if (hashMap != null && hashMap.containsKey(str)) {
            this.f35189b.remove(str);
        }
    }

    /* renamed from: b */
    public synchronized List<LittleAppPermissionData> mo49528b(Context context, String str, IAppContext iAppContext) {
        List<LittleAppPermissionData> a;
        a = m54116a(context, str, null, iAppContext);
        if (a != null) {
            m54117a(a, str, iAppContext);
        }
        return a;
    }

    /* renamed from: a */
    private void m54117a(List<LittleAppPermissionData> list, String str, IAppContext iAppContext) {
        for (LittleAppPermissionData littleAppPermissionData : list) {
            for (C66578b.C66579a aVar : C13282a.m54094a(str, iAppContext)) {
                if (aVar.mo232177a() == littleAppPermissionData.getPermission()) {
                    littleAppPermissionData.setName(aVar.mo232178b());
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized List<LittleAppPermissionData> mo49523a(Context context, String str, IAppContext iAppContext) {
        List<LittleAppPermissionData> list;
        if (this.f35189b.containsKey(str)) {
            AppBrandLogger.m52830i("PermissionDataCenter", "Preference synced, read from dataCenter appId:" + str);
            list = this.f35189b.get(str);
        } else {
            list = m54116a(context, str, null, iAppContext);
            AppBrandLogger.m52830i("PermissionDataCenter", "Preference not sync, sync it, appid:" + str + " : " + list.size());
            this.f35189b.put(str, list);
        }
        if (list != null) {
            m54117a(list, str, iAppContext);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized List<LittleAppPermissionData> mo49524a(Context context, String str, AppType appType) {
        IAppContext a = C13282a.m54091a(context, str, appType);
        if (!LarkExtensionManager.getInstance().getExtension().getFeatureGating("gadget.open_app.badge")) {
            return mo49523a(context, str, a);
        } else if (appType == AppType.WebAPP) {
            return mo49523a(context, str, a);
        } else {
            return mo49528b(context, str, a);
        }
    }

    /* renamed from: a */
    public synchronized void mo49527a(String str, LittleAppPermissionData littleAppPermissionData, IAppContext iAppContext) {
        boolean z = true;
        if (this.f35189b.containsKey(str)) {
            AppBrandLogger.m52830i("PermissionDataCenter", "receive permission change, data synced, appId: " + str);
            List<LittleAppPermissionData> list = this.f35189b.get(str);
            for (LittleAppPermissionData littleAppPermissionData2 : list) {
                if (littleAppPermissionData2.getPermission() == littleAppPermissionData.getPermission()) {
                    littleAppPermissionData2.setGranted(littleAppPermissionData.isGranted());
                    z = false;
                }
            }
            if (z) {
                list.add(littleAppPermissionData);
            }
        } else {
            AppBrandLogger.m52830i("PermissionDataCenter", "receive permission change, data not synced, appId: " + str);
            this.f35189b.put(str, m54116a(this.f35188a, str, littleAppPermissionData, iAppContext));
        }
    }

    /* renamed from: a */
    private List<LittleAppPermissionData> m54116a(Context context, String str, LittleAppPermissionData littleAppPermissionData, IAppContext iAppContext) {
        ArrayList arrayList = new ArrayList();
        AbstractC67733a aVar = (AbstractC67733a) iAppContext.findServiceByInterface(AbstractC67733a.class);
        for (C66578b.C66579a aVar2 : C13282a.m54094a(str, iAppContext)) {
            if (littleAppPermissionData != null && aVar2.mo232177a() == littleAppPermissionData.getPermission()) {
                arrayList.add(littleAppPermissionData);
            } else if (aVar.mo50180a(context, str, aVar2.mo232177a())) {
                arrayList.add(new LittleAppPermissionData(aVar2.mo232177a(), aVar2.mo232178b(), aVar.mo50185b(str, aVar2.mo232177a())));
            }
        }
        return arrayList;
    }
}
