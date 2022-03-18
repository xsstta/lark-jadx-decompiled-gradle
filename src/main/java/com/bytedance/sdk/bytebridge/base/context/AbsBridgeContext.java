package com.bytedance.sdk.bytebridge.base.context;

import android.app.Activity;
import com.bytedance.sdk.bytebridge.base.ByteBridge;
import com.bytedance.sdk.bytebridge.base.auth.AbsBridgeAuthenticator;
import com.bytedance.sdk.bytebridge.base.error.BridgeErrorType;
import com.bytedance.sdk.bytebridge.base.error.GeneralCallError;
import com.bytedance.sdk.bytebridge.base.model.BridgeInfo;
import com.bytedance.sdk.bytebridge.base.model.SynchronizeType;
import com.bytedance.sdk.bytebridge.base.monitor.BridgeMonitor;
import com.bytedance.sdk.bytebridge.base.monitor.BridgeMonitorInfo;
import com.bytedance.sdk.bytebridge.base.monitor.OriginInfo;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\"H&J\n\u0010$\u001a\u0004\u0018\u00010%H&J\b\u0010&\u001a\u00020\"H&J\u000e\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010+\u001a\u00020\u0019H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006,"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/context/AbsBridgeContext;", "Lcom/bytedance/sdk/bytebridge/base/context/IBridgeContext;", "originInfo", "Lcom/bytedance/sdk/bytebridge/base/monitor/OriginInfo;", "authenticator", "Lcom/bytedance/sdk/bytebridge/base/auth/AbsBridgeAuthenticator;", "(Lcom/bytedance/sdk/bytebridge/base/monitor/OriginInfo;Lcom/bytedance/sdk/bytebridge/base/auth/AbsBridgeAuthenticator;)V", "callType", "Lcom/bytedance/sdk/bytebridge/base/model/SynchronizeType;", "getCallType", "()Lcom/bytedance/sdk/bytebridge/base/model/SynchronizeType;", "getOriginInfo", "()Lcom/bytedance/sdk/bytebridge/base/monitor/OriginInfo;", "shouldReport", "", "getShouldReport", "()Z", "shouldReport$delegate", "Lkotlin/Lazy;", "auth", "bridgeInfo", "Lcom/bytedance/sdk/bytebridge/base/model/BridgeInfo;", "callback", "", "result", "Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "customAuth", "getActivity", "Landroid/app/Activity;", "getBridgeMonitorContext", "Lcom/bytedance/sdk/bytebridge/base/monitor/BridgeMonitorInfo$Context;", "getIBridgeView", "Lcom/bytedance/sdk/bytebridge/base/context/IBridgeView;", "getName", "", "getUrl", "getWebView", "Landroid/webkit/WebView;", "getWebViewName", "monitor", "errorType", "Lcom/bytedance/sdk/bytebridge/base/error/BridgeErrorType;", "monitorAndCallback", "onMethodNotFound", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.c.a */
public abstract class AbsBridgeContext implements IBridgeContext {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f50567a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AbsBridgeContext.class), "shouldReport", "getShouldReport()Z"))};

    /* renamed from: b */
    private final SynchronizeType f50568b;

    /* renamed from: c */
    private final Lazy f50569c = LazyKt.lazy(C20682a.INSTANCE);

    /* renamed from: d */
    private final OriginInfo f50570d;

    /* renamed from: e */
    private final AbsBridgeAuthenticator f50571e;

    /* renamed from: k */
    private final boolean mo69874k() {
        Lazy lazy = this.f50569c;
        KProperty kProperty = f50567a[0];
        return ((Boolean) lazy.getValue()).booleanValue();
    }

    /* renamed from: a */
    public abstract void mo69621a(BridgeSyncResult fVar);

    /* renamed from: e */
    public boolean mo69792e() {
        return false;
    }

    /* renamed from: f */
    public abstract IBridgeView mo69793f();

    /* renamed from: g */
    public abstract String mo69794g();

    /* renamed from: h */
    public abstract Activity mo69795h();

    /* renamed from: i */
    public abstract String mo69796i();

    /* renamed from: b */
    public final SynchronizeType mo69788b() {
        return this.f50568b;
    }

    /* renamed from: j */
    public final OriginInfo mo69797j() {
        return this.f50570d;
    }

    /* renamed from: c */
    public String mo69790c() {
        return this.f50570d.mo69814a();
    }

    /* renamed from: d */
    public BridgeSyncResult mo69791d() {
        return BridgeSyncResult.Companion.m75435a(BridgeSyncResult.f50625b, GeneralCallError.BRIDGE_NOT_FOUND, null, null, 6, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bytebridge.base.c.a$a */
    static final class C20682a extends Lambda implements Function0<Boolean> {
        public static final C20682a INSTANCE = new C20682a();

        C20682a() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return ByteBridge.f50573b.mo69803b().mo69830d();
        }
    }

    /* renamed from: a */
    private final BridgeMonitorInfo.Context mo69620a() {
        String str;
        Class<?> cls;
        Activity h = mo69795h();
        if (h == null || (cls = h.getClass()) == null || (str = cls.getName()) == null) {
            str = "";
        }
        return new BridgeMonitorInfo.Context(str, mo69796i(), mo69794g(), System.currentTimeMillis());
    }

    /* renamed from: a */
    public final boolean mo69787a(BridgeInfo bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "bridgeInfo");
        AbsBridgeAuthenticator bVar2 = this.f50571e;
        if (bVar2 != null) {
            return bVar2.mo69778a(bVar, this);
        }
        return mo69792e();
    }

    /* renamed from: b */
    public final void mo69789b(BridgeSyncResult fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "result");
        if (!Intrinsics.areEqual(fVar, BridgeSyncResult.f50625b.mo69857a())) {
            if (mo69874k()) {
                BridgeMonitor.f50581a.mo69806a(new BridgeMonitorInfo(this.f50570d, fVar.mo69854c(), mo69620a(), fVar, this));
            }
            mo69621a(fVar);
        }
    }

    /* renamed from: a */
    public final void mo69786a(BridgeErrorType bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "errorType");
        if (mo69874k()) {
            BridgeMonitor.f50581a.mo69806a(new BridgeMonitorInfo(this.f50570d, bVar, mo69620a(), null, this));
        }
    }

    public AbsBridgeContext(OriginInfo dVar, AbsBridgeAuthenticator bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "originInfo");
        this.f50570d = dVar;
        this.f50571e = bVar;
        this.f50568b = dVar.mo69815b().getCallType();
    }
}
