package com.ss.android.lark.appcenter.wrapper.impl.p1362a;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27547l;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;
import com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.a.m */
public class C29159m implements AbstractC27547l {

    /* renamed from: a */
    IAppCenterModuleDependency.AbstractC29135f f72979a = AppCenterModule.m107044a().getLoginDependency();

    /* renamed from: b */
    IAppCenterModuleDependency.AbstractC29138i f72980b = AppCenterModule.m107044a().getProfileDependency();

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27547l
    /* renamed from: c */
    public String mo98214c() {
        return this.f72979a.mo103390c();
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27547l
    /* renamed from: d */
    public String mo98215d() {
        return this.f72979a.mo103393f();
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27547l
    /* renamed from: a */
    public String mo98211a() {
        String a = this.f72979a.mo103388a();
        if (a != null) {
            return a;
        }
        Log.m165383e("UserInfoProvider", "getSession is null");
        return "";
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27547l
    /* renamed from: b */
    public String mo98213b() {
        String b = this.f72979a.mo103389b();
        if (b != null) {
            return b;
        }
        Log.m165383e("UserInfoProvider", "userId is null");
        return "";
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27547l
    /* renamed from: a */
    public void mo98212a(IGetDataCallback<String> iGetDataCallback) {
        this.f72980b.mo103395a(mo98213b(), iGetDataCallback);
    }
}
