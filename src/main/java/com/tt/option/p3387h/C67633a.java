package com.tt.option.p3387h;

import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.option.AbstractC67593a;

/* renamed from: com.tt.option.h.a */
public class C67633a extends AbstractC67593a<AbstractC67635b> implements AbstractC67635b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC67635b mo232057b() {
        return null;
    }

    @Override // com.tt.option.p3387h.AbstractC67635b
    public AppBrandLogger.ILogger createLogger() {
        return new AppBrandLogger.ILogger() {
            /* class com.tt.option.p3387h.C67633a.C676341 */

            @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
            public void flush() {
            }

            @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
            public void logD(String str, String str2) {
                Log.d(str, str2);
            }

            @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
            public void logE(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
            public void logI(String str, String str2) {
                Log.i(str, str2);
            }

            @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
            public void logW(String str, String str2) {
                Log.w(str, str2);
            }

            @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
            public void logE(String str, String str2, Throwable th) {
                Log.e(str, str2, th);
            }
        };
    }
}
