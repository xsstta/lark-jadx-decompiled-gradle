package com.larksuite.component.openplatform.core.container;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.framework.apiplugin.LKEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.larksuite.component.openplatform.core.container.a */
public class C24458a {

    /* renamed from: b */
    private static C24458a f60348b;

    /* renamed from: a */
    public final Map<Long, LKEvent> f60349a = new HashMap();

    /* renamed from: c */
    private final Map<String, C24474c> f60350c = new ConcurrentHashMap();

    /* renamed from: a */
    public static C24458a m89213a() {
        if (f60348b == null) {
            synchronized (C24458a.class) {
                if (f60348b == null) {
                    f60348b = new C24458a();
                }
            }
        }
        return f60348b;
    }

    /* renamed from: b */
    public C24474c mo87269b(String str) {
        C24474c cVar;
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("OPDefaultPluginContaine", "get containerID is empty!");
            return null;
        }
        synchronized (this.f60350c) {
            cVar = this.f60350c.get(str);
        }
        return cVar;
    }

    /* renamed from: a */
    public boolean mo87268a(String str) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("OPDefaultPluginContaine", "containerID is empty!");
            return false;
        }
        synchronized (this.f60350c) {
            C24474c remove = this.f60350c.remove(str);
            if (remove == null) {
                return false;
            }
            remove.ah_();
            AppBrandLogger.m52830i("OPDefaultPluginContaine", "containerID:" + str);
            return true;
        }
    }

    /* renamed from: a */
    public C24474c mo87267a(Context context, String str, LKOpenApiAccessConfig lKOpenApiAccessConfig) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("OPDefaultPluginContaine", "containerID is empty!");
            return null;
        }
        synchronized (this.f60350c) {
            if (this.f60350c.containsKey(str)) {
                AppBrandLogger.m52830i("OPDefaultPluginContaine", "createFakeContainer containerID isExist:" + str);
                return this.f60350c.get(str);
            }
            C24474c cVar = new C24474c(context, lKOpenApiAccessConfig, str);
            this.f60350c.put(str, cVar);
            return cVar;
        }
    }
}
