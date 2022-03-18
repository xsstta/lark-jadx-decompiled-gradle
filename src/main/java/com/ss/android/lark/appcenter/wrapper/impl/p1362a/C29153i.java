package com.ss.android.lark.appcenter.wrapper.impl.p1362a;

import android.content.Context;
import com.bytedance.ee.larkbrand.permission.AbstractC13298i;
import com.ss.android.appcenter.business.activity.appsetting.LittleAppPermissionData;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27543h;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;
import com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency;
import com.tt.refer.common.base.AppType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.a.i */
public class C29153i implements AbstractC27543h {

    /* renamed from: a */
    private IAppCenterModuleDependency.AbstractC29134e f72972a = AppCenterModule.m107044a().getLittleAppDependency();

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27543h
    /* renamed from: a */
    public void mo98192a(Context context, String str) {
        IAppCenterModuleDependency.AbstractC29134e eVar = this.f72972a;
        if (eVar != null) {
            eVar.mo103382a(context, str);
        }
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27543h
    /* renamed from: b */
    public void mo98196b(Context context, String str) {
        IAppCenterModuleDependency.AbstractC29134e eVar = this.f72972a;
        if (eVar != null) {
            eVar.mo103387b(context, str);
        }
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27543h
    /* renamed from: a */
    public List<LittleAppPermissionData> mo98191a(Context context, String str, AppType appType) {
        IAppCenterModuleDependency.AbstractC29134e eVar = this.f72972a;
        if (eVar != null) {
            return eVar.mo103379a(context, str, appType);
        }
        return new ArrayList();
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27543h
    /* renamed from: a */
    public void mo98193a(Context context, String str, String str2) {
        IAppCenterModuleDependency.AbstractC29134e eVar = this.f72972a;
        if (eVar != null) {
            eVar.mo103383a(context, str, str2);
        }
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27543h
    /* renamed from: a */
    public void mo98194a(Context context, String str, String str2, AppType appType, AbstractC13298i iVar) {
        IAppCenterModuleDependency.AbstractC29134e eVar = this.f72972a;
        if (eVar != null) {
            eVar.mo103384a(context, str, str2, appType, iVar);
        }
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27543h
    /* renamed from: a */
    public void mo98195a(Context context, String str, String str2, List<LittleAppPermissionData> list, AppType appType, String str3, Integer num) {
        IAppCenterModuleDependency.AbstractC29134e eVar = this.f72972a;
        if (eVar != null) {
            eVar.mo103385a(context, str, str2, list, appType, str3, num);
        }
    }
}
