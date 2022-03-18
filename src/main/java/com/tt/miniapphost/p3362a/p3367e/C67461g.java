package com.tt.miniapphost.p3362a.p3367e;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67435c;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67436d;
import java.security.InvalidParameterException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tt.miniapphost.a.e.g */
public class C67461g implements AbstractC67436d {

    /* renamed from: a */
    private Map<Class, IBaseService> f170097a = new ConcurrentHashMap();

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67436d
    /* renamed from: a */
    public void mo234173a() {
        if (this.f170097a.isEmpty()) {
            AppBrandLogger.m52830i("ServiceManagerImpl", "Services is empty!");
            return;
        }
        AppBrandLogger.m52830i("ServiceManagerImpl", "destroy");
        for (IBaseService iBaseService : this.f170097a.values()) {
            if (iBaseService != null) {
                iBaseService.release();
            }
        }
        this.f170097a.clear();
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67436d
    /* renamed from: a */
    public <T> T mo234172a(Class<T> cls) {
        if (this.f170097a.containsKey(cls)) {
            return (T) this.f170097a.get(cls);
        }
        AppBrandLogger.m52829e("ServiceManagerImpl", "service name is not register:" + cls.getName());
        return null;
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67436d
    /* renamed from: a */
    public <T extends IBaseService> boolean mo234174a(Class<T> cls, T t) {
        if ((t instanceof AbstractC67457c) || (t instanceof AbstractC67435c)) {
            AppBrandLogger.m52830i("ServiceManagerImpl", "register service:" + cls.getName());
            if (cls.getName().contains("com.tt.miniapphost.data.AppSingletonInstance")) {
                AppBrandLogger.m52829e("falcon ", cls.getName() + " registerService success onAppRoute  mServices:" + this);
            }
            if (this.f170097a.put(cls, t) == null) {
                return true;
            }
            return false;
        }
        throw new InvalidParameterException("register failed,need serviceImpl instance BaseService serviceName:" + cls.getName());
    }
}
