package com.bytedance.ee.ref.p682a.p685c;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.p3362a.p3367e.AbstractC67457c;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observer;

/* renamed from: com.bytedance.ee.ref.a.c.b */
public class C13490b extends AbstractC67457c implements AbstractC67734b {

    /* renamed from: a */
    private Map<String, List<C13491a>> f35539a = new HashMap();

    /* renamed from: b */
    private Map<String, List<C13491a>> f35540b = new HashMap();

    /* renamed from: c */
    private List<Observer> f35541c = new ArrayList();

    /* renamed from: com.bytedance.ee.ref.a.c.b$a */
    public static class C13491a {

        /* renamed from: a */
        public String f35542a;

        /* renamed from: b */
        public boolean f35543b;

        /* renamed from: c */
        public long f35544c = -1;
    }

    /* renamed from: a */
    public boolean mo50197a(String str, String str2) {
        AppBrandLogger.m52830i("WebAppPermissionStorage", "getOrgPermissionGrant: appId->" + str + " orgAuthScopeKey->" + str2);
        List<C13491a> list = this.f35539a.get(str);
        if (this.f35539a.containsKey(str) && list != null) {
            for (C13491a aVar : list) {
                if (aVar != null && str2.equals(aVar.f35542a)) {
                    return aVar.f35543b;
                }
            }
        }
        return false;
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public boolean mo50195a(String str) {
        AppBrandLogger.m52830i("WebAppPermissionStorage", "getOrgPermissionGrant: orgAuthScopeKey->" + str);
        return mo50197a(this.f170082d.getAppId(), str);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public boolean mo50193a(int i, String str) {
        List<C13491a> list = this.f35540b.get(str);
        if (!this.f35540b.containsKey(str) || list == null) {
            AppBrandLogger.m52830i("WebAppPermissionStorage", "appId -> " + str + ", permissionType -> " + i + ", granted -> false");
            return false;
        }
        for (C13491a aVar : list) {
            if (aVar != null && String.valueOf(i).equals(aVar.f35542a)) {
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append("appId -> ");
                sb.append(str);
                sb.append(", permissionType -> ");
                sb.append(i);
                sb.append(", granted -> ");
                sb.append(aVar.f35544c != -1);
                objArr[0] = sb.toString();
                AppBrandLogger.m52830i("WebAppPermissionStorage", objArr);
                if (aVar.f35544c != -1) {
                    return true;
                }
                return false;
            }
        }
        AppBrandLogger.m52830i("WebAppPermissionStorage", "appId -> " + str + ", permissionType -> " + i + ", granted -> false");
        return false;
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public boolean mo50194a(int i, String str, boolean z) {
        AppBrandLogger.m52830i("WebAppPermissionStorage", "getUserPermissionGrant: permissionKey->" + i + " appId->" + str + " defValue->" + z);
        List<C13491a> list = this.f35540b.get(str);
        if (list == null) {
            return z;
        }
        for (C13491a aVar : list) {
            if (aVar != null && String.valueOf(i).equals(aVar.f35542a)) {
                return aVar.f35543b;
            }
        }
        return z;
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public boolean mo50196a(String str, int i) {
        AppBrandLogger.m52830i("WebAppPermissionStorage", "hasRequestTimeInUserPermission: permission->" + i + " appId->" + str);
        return mo50193a(i, str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
        this.f35541c.clear();
    }

    /* renamed from: a */
    public synchronized void mo50191a(Observer observer) {
        this.f35541c.add(observer);
    }

    public C13490b(IAppContext iAppContext) {
        super(iAppContext);
    }

    /* renamed from: a */
    private void m54820a(C13491a aVar) {
        for (Observer observer : this.f35541c) {
            observer.update(null, aVar);
        }
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: b */
    public long mo50198b(int i) {
        AppBrandLogger.m52830i("WebAppPermissionStorage", "getUserPermissionMotifyTime: permission->" + i);
        return mo50186a(i, this.f170082d.getAppId(), -1);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public boolean mo50192a(int i) {
        AppBrandLogger.m52830i("WebAppPermissionStorage", "hasRequestTimeInUserPermission: permission->" + i);
        return mo50193a(i, this.f170082d.getAppId());
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public void mo50187a(int i, long j) {
        AppBrandLogger.m52830i("WebAppPermissionStorage", "setUserPermissionModifyTime: permission->" + i);
        mo50199b(i, this.f170082d.getAppId(), j);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public long mo50186a(int i, String str, long j) {
        AppBrandLogger.m52830i("WebAppPermissionStorage", "getUserPermissionModifyTime: permission->" + i + " appId->" + str + " defValue->" + j);
        List<C13491a> list = this.f35540b.get(str);
        if (list == null) {
            return j;
        }
        for (C13491a aVar : list) {
            if (aVar != null && String.valueOf(i).equals(aVar.f35542a)) {
                return aVar.f35544c;
            }
        }
        return j;
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: b */
    public void mo50199b(int i, String str, long j) {
        AppBrandLogger.m52830i("WebAppPermissionStorage", "setUserPermissionModifyTime: permission->" + i);
        List<C13491a> list = this.f35540b.get(str);
        if (!this.f35540b.containsKey(str) || list == null) {
            list = new ArrayList<>();
            this.f35540b.put(str, list);
        }
        for (C13491a aVar : list) {
            if (aVar != null && String.valueOf(i).equals(aVar.f35542a)) {
                aVar.f35544c = j;
                m54820a(aVar);
                return;
            }
        }
        C13491a aVar2 = new C13491a();
        aVar2.f35544c = j;
        aVar2.f35542a = String.valueOf(i);
        list.add(aVar2);
        m54820a(aVar2);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public void mo50190a(String str, String str2, boolean z) {
        AppBrandLogger.m52830i("WebAppPermissionStorage", "setOrgPermission: appId->" + str + " orgAuthScopeKey->" + str2 + " grant:" + z);
        List<C13491a> list = this.f35539a.get(str);
        if (!this.f35539a.containsKey(str) || list == null) {
            list = new ArrayList<>();
            this.f35539a.put(str, list);
        }
        for (C13491a aVar : list) {
            if (aVar != null && str2.equals(aVar.f35542a)) {
                aVar.f35543b = z;
                return;
            }
        }
        C13491a aVar2 = new C13491a();
        aVar2.f35542a = str2;
        aVar2.f35543b = z;
        list.add(aVar2);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public void mo50188a(int i, String str, boolean z, long j) {
        AppBrandLogger.m52830i("WebAppPermissionStorage", "setUserPermissionTime: permission->" + i + " appId->" + str + " grant->" + z + " time->" + j);
        List<C13491a> list = this.f35540b.get(str);
        if (!this.f35540b.containsKey(str) || list == null) {
            list = new ArrayList<>();
            this.f35540b.put(str, list);
        }
        for (C13491a aVar : list) {
            if (aVar != null && String.valueOf(i).equals(aVar.f35542a)) {
                aVar.f35543b = z;
                aVar.f35544c = j;
                m54820a(aVar);
                return;
            }
        }
        C13491a aVar2 = new C13491a();
        aVar2.f35544c = j;
        aVar2.f35542a = String.valueOf(i);
        aVar2.f35543b = z;
        list.add(aVar2);
        m54820a(aVar2);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public void mo50189a(Context context, int i, String str, long j) {
        AppBrandLogger.m52830i("WebAppPermissionStorage", "setUserPermissionModifyTime: permission->" + i);
        AppBrandLogger.m52830i("WebAppPermissionStorage", "setUserPermissionModifyTime: permission->" + i);
        mo50199b(i, str, j);
    }
}
