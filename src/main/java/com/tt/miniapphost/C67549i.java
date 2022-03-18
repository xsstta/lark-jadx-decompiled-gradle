package com.tt.miniapphost;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.data.C67485a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tt.miniapphost.i */
public class C67549i {

    /* renamed from: a */
    private IAppContext f170355a;

    /* renamed from: b */
    private Map<String, AbstractC67550j> f170356b = new HashMap();

    /* renamed from: c */
    private Map<String, Map<String, AbstractC67550j>> f170357c = new HashMap();

    /* renamed from: a */
    public Map<String, AbstractC67550j> mo234574a() {
        return this.f170356b;
    }

    /* renamed from: a */
    public static C67549i m262706a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234294o();
    }

    public C67549i(IAppContext iAppContext) {
        this.f170355a = iAppContext;
    }

    /* renamed from: a */
    public AbstractC67550j mo234573a(String str) {
        if (!this.f170356b.containsKey(str)) {
            AppBrandLogger.m52830i("ModeManager", "module:" + str + " is not register. so register");
            AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(this.f170355a);
            if (inst != null) {
                inst.onCreate();
            }
        }
        return this.f170356b.get(str);
    }

    /* renamed from: a */
    public void mo234575a(String str, AbstractC67550j jVar) {
        this.f170356b.put(str, jVar);
    }
}
