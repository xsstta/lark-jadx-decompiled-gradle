package com.bytedance.android.monitor.lynx.config;

import com.bytedance.android.monitor.executor.MonitorExecutor;
import com.bytedance.android.monitor.webview.AbstractC2677a;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R(\u0010%\u001a\u0004\u0018\u00010$2\b\u0010#\u001a\u0004\u0018\u00010$8F@FX\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\b\"\u0004\b0\u0010\n¨\u00061"}, d2 = {"Lcom/bytedance/android/monitor/lynx/config/LynxMonitorConfig;", "", "bizTag", "", "monitor", "Lcom/bytedance/android/monitor/webview/ITTLiveWebViewMonitor;", "(Ljava/lang/String;Lcom/bytedance/android/monitor/webview/ITTLiveWebViewMonitor;)V", "getBizTag", "()Ljava/lang/String;", "setBizTag", "(Ljava/lang/String;)V", "blankDetectType", "getBlankDetectType", "setBlankDetectType", "enableAB", "", "getEnableAB", "()Z", "setEnableAB", "(Z)V", "enableBlankReport", "getEnableBlankReport", "setEnableBlankReport", "enableFetchReport", "getEnableFetchReport", "setEnableFetchReport", "enableJsbReport", "getEnableJsbReport", "setEnableJsbReport", "enableMonitor", "getEnableMonitor", "setEnableMonitor", "enablePerfReport", "getEnablePerfReport", "setEnablePerfReport", "value", "Ljava/util/concurrent/ExecutorService;", "executor", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "setExecutor", "(Ljava/util/concurrent/ExecutorService;)V", "getMonitor", "()Lcom/bytedance/android/monitor/webview/ITTLiveWebViewMonitor;", "setMonitor", "(Lcom/bytedance/android/monitor/webview/ITTLiveWebViewMonitor;)V", "virtualAID", "getVirtualAID", "setVirtualAID", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.lynx.a.b */
public final class LynxMonitorConfig {

    /* renamed from: a */
    private String f8444a;

    /* renamed from: b */
    private boolean f8445b = true;

    /* renamed from: c */
    private boolean f8446c = true;

    /* renamed from: d */
    private boolean f8447d = true;

    /* renamed from: e */
    private String f8448e = "detect_when_load_success";

    /* renamed from: f */
    private boolean f8449f = true;

    /* renamed from: g */
    private boolean f8450g = true;

    /* renamed from: h */
    private AbstractC2677a f8451h;

    /* renamed from: i */
    private boolean f8452i;

    /* renamed from: j */
    private String f8453j;

    /* renamed from: a */
    public final String mo11481a() {
        return this.f8444a;
    }

    /* renamed from: c */
    public final boolean mo11485c() {
        return this.f8446c;
    }

    /* renamed from: d */
    public final boolean mo11486d() {
        return this.f8447d;
    }

    /* renamed from: e */
    public final String mo11487e() {
        return this.f8448e;
    }

    /* renamed from: f */
    public final AbstractC2677a mo11488f() {
        return this.f8451h;
    }

    /* renamed from: h */
    public final boolean mo11490h() {
        return this.f8452i;
    }

    /* renamed from: i */
    public final String mo11491i() {
        return this.f8453j;
    }

    /* renamed from: b */
    public final boolean mo11484b() {
        return this.f8445b;
    }

    /* renamed from: g */
    public final ExecutorService mo11489g() {
        return MonitorExecutor.f8417a.mo11451a();
    }

    /* renamed from: b */
    public final void mo11483b(String str) {
        this.f8453j = str;
    }

    /* renamed from: a */
    public final void mo11482a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f8448e = str;
    }

    public LynxMonitorConfig(String str, AbstractC2677a aVar) {
        Intrinsics.checkParameterIsNotNull(str, "bizTag");
        Intrinsics.checkParameterIsNotNull(aVar, "monitor");
        this.f8444a = str;
        this.f8451h = aVar;
        this.f8453j = "";
    }
}
