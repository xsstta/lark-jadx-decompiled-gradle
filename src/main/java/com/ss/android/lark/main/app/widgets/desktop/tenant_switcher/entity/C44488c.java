package com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity;

import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.c */
public class C44488c {
    /* renamed from: a */
    public static C44487b m176496a(TenantInfo tenantInfo) {
        boolean z;
        String P = C44134a.m174959a().mo133196P();
        if (P == null || !P.equals(tenantInfo.getUserId())) {
            z = false;
        } else {
            z = true;
        }
        tenantInfo.setCurrentUser(z);
        return new C44487b(tenantInfo);
    }

    /* renamed from: a */
    public static List<C44487b> m176497a(List<TenantInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (TenantInfo tenantInfo : list) {
            arrayList.add(m176496a(tenantInfo));
        }
        return arrayList;
    }
}
