package com.bytedance.sdk.bytebridge.base.model;

import com.bytedance.sdk.bytebridge.base.monitor.IBridgeMonitorInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/model/BridgeConfig;", "", "()V", "callSuccessCostEnable", "", "getCallSuccessCostEnable", "()Z", "setCallSuccessCostEnable", "(Z)V", "iBridgeMonitorInterceptor", "Lcom/bytedance/sdk/bytebridge/base/monitor/IBridgeMonitorInterceptor;", "getIBridgeMonitorInterceptor", "()Lcom/bytedance/sdk/bytebridge/base/monitor/IBridgeMonitorInterceptor;", "setIBridgeMonitorInterceptor", "(Lcom/bytedance/sdk/bytebridge/base/monitor/IBridgeMonitorInterceptor;)V", "ignoreNameSpace", "getIgnoreNameSpace", "setIgnoreNameSpace", "isDebug", "setDebug", "safeGetUrl", "getSafeGetUrl", "setSafeGetUrl", "schema", "", "getSchema", "()Ljava/lang/String;", "setSchema", "(Ljava/lang/String;)V", "Builder", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.model.a */
public final class BridgeConfig {

    /* renamed from: a */
    private boolean f50604a;

    /* renamed from: b */
    private String f50605b;

    /* renamed from: c */
    private boolean f50606c;

    /* renamed from: d */
    private IBridgeMonitorInterceptor f50607d;

    /* renamed from: e */
    private boolean f50608e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/model/BridgeConfig$Builder;", "", "()V", "bridgeConfig", "Lcom/bytedance/sdk/bytebridge/base/model/BridgeConfig;", "bridgeMonitorInterceptor", "IBridgeMonitorInterceptor", "Lcom/bytedance/sdk/bytebridge/base/monitor/IBridgeMonitorInterceptor;", "build", "callSuccessCostEnable", "", "isDebug", "safeGetUrl", "safe", "setIgnoreNameSpace", "ignoreNameSpace", "setSchema", "schema", "", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bytebridge.base.model.a$a */
    public static final class Builder {

        /* renamed from: a */
        private BridgeConfig f50609a = new BridgeConfig(null);

        /* renamed from: a */
        public final BridgeConfig mo69831a() {
            return this.f50609a;
        }
    }

    /* renamed from: a */
    public final boolean mo69827a() {
        return this.f50604a;
    }

    /* renamed from: b */
    public final boolean mo69828b() {
        return this.f50606c;
    }

    /* renamed from: c */
    public final IBridgeMonitorInterceptor mo69829c() {
        return this.f50607d;
    }

    /* renamed from: d */
    public final boolean mo69830d() {
        return this.f50608e;
    }

    private BridgeConfig() {
        this.f50605b = "nativeapp";
    }

    public /* synthetic */ BridgeConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
