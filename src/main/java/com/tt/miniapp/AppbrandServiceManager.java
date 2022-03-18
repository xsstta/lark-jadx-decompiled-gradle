package com.tt.miniapp;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public final class AppbrandServiceManager {

    /* renamed from: a */
    private AppbrandApplicationImpl f165574a;

    /* renamed from: b */
    private LifeCycleManager f165575b;

    /* renamed from: c */
    private Map<Class, ServiceBase> f165576c = new HashMap();

    public static abstract class ServiceBase {
        public AppbrandApplicationImpl mApp;

        public ServiceBase(AppbrandApplicationImpl appbrandApplicationImpl) {
            this.mApp = appbrandApplicationImpl;
        }
    }

    public AppbrandServiceManager(AppbrandApplicationImpl appbrandApplicationImpl) {
        this.f165574a = appbrandApplicationImpl;
        LifeCycleManager lifeCycleManager = new LifeCycleManager(appbrandApplicationImpl);
        this.f165575b = lifeCycleManager;
        this.f165576c.put(LifeCycleManager.class, lifeCycleManager);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <T extends ServiceBase> T mo230237b(Class<T> cls) {
        if (!this.f165576c.containsKey(cls)) {
            AppBrandLogger.m52829e("AppbrandServiceManager", "should not run here，not register class:" + cls.getName());
            mo230236a(cls);
        }
        return (T) this.f165576c.get(cls);
    }

    /* renamed from: a */
    public <T extends ServiceBase> T mo230236a(Class<T> cls) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(AppbrandApplicationImpl.class);
            declaredConstructor.setAccessible(true);
            T newInstance = declaredConstructor.newInstance(this.f165574a);
            this.f165576c.put(cls, newInstance);
            this.f165575b.addLifeCycleListener(newInstance);
            return newInstance;
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            AppBrandLogger.eWithThrowable("AppbrandServiceManager", "Register service failed: " + cls.getSimpleName(), e);
            return null;
        }
    }
}
