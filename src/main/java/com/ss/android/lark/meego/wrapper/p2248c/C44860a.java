package com.ss.android.lark.meego.wrapper.p2248c;

import android.app.Application;
import com.ss.android.lark.flutter.container.api.ILKFlutter;
import com.ss.android.lark.flutter.container.api.INativeRouteHandler;
import com.ss.android.lark.flutter.container.api.InitParams;
import com.ss.android.lark.meego.wrapper.MeegoModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.meego.wrapper.c.a */
public class C44860a {
    /* renamed from: a */
    public static void m177849a(final Application application, ILKFlutter iLKFlutter) {
        iLKFlutter.init(new InitParams() {
            /* class com.ss.android.lark.meego.wrapper.p2248c.C44860a.C448611 */

            @Override // com.ss.android.lark.flutter.container.api.InitParams
            public Application getAppContext() {
                return application;
            }

            @Override // com.ss.android.lark.flutter.container.api.InitParams
            public INativeRouteHandler getNativeRouteHandler() {
                return new C44862b();
            }

            @Override // com.ss.android.lark.flutter.container.api.InitParams
            public Map<String, String> getAppInfo() {
                HashMap hashMap = new HashMap(MeegoModule.m177824d().getAppInfo(application));
                hashMap.put("pluginVersionCode", "0");
                hashMap.put("hostAbiBit", "");
                hashMap.put("flt_pid", "");
                return hashMap;
            }
        });
    }
}
