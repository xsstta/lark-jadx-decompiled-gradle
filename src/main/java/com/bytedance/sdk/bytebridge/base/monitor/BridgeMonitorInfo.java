package com.bytedance.sdk.bytebridge.base.monitor;

import com.bytedance.sdk.bytebridge.base.context.AbsBridgeContext;
import com.bytedance.sdk.bytebridge.base.error.BridgeErrorType;
import com.bytedance.sdk.bytebridge.base.model.SynchronizeType;
import com.bytedance.sdk.bytebridge.base.result.BridgeSyncResult;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/monitor/BridgeMonitorInfo;", "", "originInfo", "Lcom/bytedance/sdk/bytebridge/base/monitor/OriginInfo;", "bridgeErrorType", "Lcom/bytedance/sdk/bytebridge/base/error/BridgeErrorType;", "context", "Lcom/bytedance/sdk/bytebridge/base/monitor/BridgeMonitorInfo$Context;", "result", "Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "bridgeContext", "Lcom/bytedance/sdk/bytebridge/base/context/AbsBridgeContext;", "(Lcom/bytedance/sdk/bytebridge/base/monitor/OriginInfo;Lcom/bytedance/sdk/bytebridge/base/error/BridgeErrorType;Lcom/bytedance/sdk/bytebridge/base/monitor/BridgeMonitorInfo$Context;Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;Lcom/bytedance/sdk/bytebridge/base/context/AbsBridgeContext;)V", "getBridgeContext", "()Lcom/bytedance/sdk/bytebridge/base/context/AbsBridgeContext;", "getBridgeErrorType", "()Lcom/bytedance/sdk/bytebridge/base/error/BridgeErrorType;", "getContext", "()Lcom/bytedance/sdk/bytebridge/base/monitor/BridgeMonitorInfo$Context;", "isSync", "", "()Z", "isSync$delegate", "Lkotlin/Lazy;", "getOriginInfo", "()Lcom/bytedance/sdk/bytebridge/base/monitor/OriginInfo;", "getResult", "()Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "Context", "EventType", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.d.b */
public final class BridgeMonitorInfo {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f50582a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BridgeMonitorInfo.class), "isSync", "isSync()Z"))};

    /* renamed from: b */
    private final Lazy f50583b = LazyKt.lazy(new C20684c(this));

    /* renamed from: c */
    private final OriginInfo f50584c;

    /* renamed from: d */
    private final BridgeErrorType f50585d;

    /* renamed from: e */
    private final Context f50586e;

    /* renamed from: f */
    private final BridgeSyncResult f50587f;

    /* renamed from: g */
    private final AbsBridgeContext f50588g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/monitor/BridgeMonitorInfo$EventType;", "", "getCallType", "Lcom/bytedance/sdk/bytebridge/base/model/SynchronizeType;", "getEventName", "", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bytebridge.base.d.b$b */
    public interface EventType {
        SynchronizeType getCallType();
    }

    /* renamed from: a */
    public final OriginInfo mo69807a() {
        return this.f50584c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bytebridge.base.d.b$c */
    static final class C20684c extends Lambda implements Function0<Boolean> {
        final /* synthetic */ BridgeMonitorInfo this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20684c(BridgeMonitorInfo bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            if (this.this$0.mo69807a().mo69815b().getCallType() == SynchronizeType.SYNC) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/monitor/BridgeMonitorInfo$Context;", "", "activity", "", "webView", "url", "endTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getActivity", "()Ljava/lang/String;", "getEndTime", "()J", "getUrl", "getWebView", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bytebridge.base.d.b$a */
    public static final class Context {

        /* renamed from: a */
        private final String f50589a;

        /* renamed from: b */
        private final String f50590b;

        /* renamed from: c */
        private final String f50591c;

        /* renamed from: d */
        private final long f50592d;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Context) {
                    Context aVar = (Context) obj;
                    if (Intrinsics.areEqual(this.f50589a, aVar.f50589a) && Intrinsics.areEqual(this.f50590b, aVar.f50590b) && Intrinsics.areEqual(this.f50591c, aVar.f50591c)) {
                        if (this.f50592d == aVar.f50592d) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f50589a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f50590b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f50591c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            long j = this.f50592d;
            return ((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "Context(activity=" + this.f50589a + ", webView=" + this.f50590b + ", url=" + this.f50591c + ", endTime=" + this.f50592d + ")";
        }

        public Context(String str, String str2, String str3, long j) {
            Intrinsics.checkParameterIsNotNull(str, "activity");
            Intrinsics.checkParameterIsNotNull(str2, "webView");
            Intrinsics.checkParameterIsNotNull(str3, "url");
            this.f50589a = str;
            this.f50590b = str2;
            this.f50591c = str3;
            this.f50592d = j;
        }
    }

    public BridgeMonitorInfo(OriginInfo dVar, BridgeErrorType bVar, Context aVar, BridgeSyncResult fVar, AbsBridgeContext aVar2) {
        Intrinsics.checkParameterIsNotNull(dVar, "originInfo");
        Intrinsics.checkParameterIsNotNull(bVar, "bridgeErrorType");
        Intrinsics.checkParameterIsNotNull(aVar, "context");
        this.f50584c = dVar;
        this.f50585d = bVar;
        this.f50586e = aVar;
        this.f50587f = fVar;
        this.f50588g = aVar2;
    }
}
