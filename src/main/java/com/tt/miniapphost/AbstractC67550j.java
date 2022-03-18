package com.tt.miniapphost;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.frontendapiinterface.IApiOutputParam;

/* renamed from: com.tt.miniapphost.j */
public abstract class AbstractC67550j {

    /* renamed from: a */
    private AppbrandContext f170358a;

    /* renamed from: f */
    public IAppContext f170359f;

    /* renamed from: com.tt.miniapphost.j$a */
    public interface AbstractC67551a<T> {
        void onNativeModuleCall(T t);
    }

    /* renamed from: a */
    public IApiOutputParam mo49105a(IApiInputParam iApiInputParam, AbstractC67551a aVar) throws Exception {
        return null;
    }

    /* renamed from: a */
    public abstract String mo49103a();

    /* renamed from: a */
    public abstract <T> String mo49104a(String str, AbstractC67551a<T> aVar) throws Exception;

    /* renamed from: a */
    public boolean mo49465a(int i, int i2, Intent intent) {
        return false;
    }

    /* renamed from: f */
    public void mo234578f() {
    }

    /* renamed from: g */
    public void mo234579g() {
    }

    /* renamed from: e */
    public Activity mo234577e() {
        return this.f170359f.getCurrentActivity();
    }

    /* renamed from: b */
    public void mo234576b(IAppContext iAppContext) {
        this.f170359f = iAppContext;
    }

    public AbstractC67550j(AppbrandContext appbrandContext) {
        this.f170358a = appbrandContext;
    }
}
