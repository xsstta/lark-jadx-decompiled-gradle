package com.bytedance.ee.larkbrand.p650e;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.p649d.C12989b;
import com.tt.option.p3387h.C67633a;

/* renamed from: com.bytedance.ee.larkbrand.e.j */
public class C13002j extends C67633a {
    @Override // com.tt.option.p3387h.C67633a, com.tt.option.p3387h.AbstractC67635b
    public AppBrandLogger.ILogger createLogger() {
        return new AppBrandLogger.ILogger() {
            /* class com.bytedance.ee.larkbrand.p650e.C13002j.C130031 */

            @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
            public void flush() {
            }

            @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
            public void logD(String str, String str2) {
                if (LarkExtensionManager.getInstance().getExtension() != null) {
                    LarkExtensionManager.getInstance().getExtension().mo49573a(str, C13002j.this.mo48955a(str, str2));
                }
            }

            @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
            public void logE(String str, String str2) {
                if (LarkExtensionManager.getInstance().getExtension() != null) {
                    LarkExtensionManager.getInstance().getExtension().mo49577d(str, C13002j.this.mo48955a(str, str2));
                }
            }

            @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
            public void logI(String str, String str2) {
                if (LarkExtensionManager.getInstance().getExtension() != null) {
                    LarkExtensionManager.getInstance().getExtension().mo49575b(str, C13002j.this.mo48955a(str, str2));
                }
            }

            @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
            public void logW(String str, String str2) {
                if (LarkExtensionManager.getInstance().getExtension() != null) {
                    LarkExtensionManager.getInstance().getExtension().mo49576c(str, C13002j.this.mo48955a(str, str2));
                }
            }

            @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
            public void logE(String str, String str2, Throwable th) {
                StackTraceElement[] stackTrace;
                if (LarkExtensionManager.getInstance().getExtension() != null) {
                    StringBuilder sb = new StringBuilder(str2);
                    if (!(th == null || (stackTrace = th.getStackTrace()) == null)) {
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            sb.append("\n\tat ");
                            sb.append(stackTraceElement.toString());
                        }
                    }
                    LarkExtensionManager.getInstance().getExtension().mo49577d(str, C13002j.this.mo48955a(str, sb.toString()));
                }
            }
        };
    }

    /* renamed from: a */
    public String mo48955a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (str2.length() > 4096) {
            str2 = str2.substring(0, 4096);
        }
        String str3 = C12989b.m53447a().f34593b;
        if (TextUtils.isEmpty(str3) || !str2.contains(str3)) {
            return str2;
        }
        return str2.replace(str3, "******");
    }
}
