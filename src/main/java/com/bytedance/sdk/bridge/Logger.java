package com.bytedance.sdk.bridge;

import android.util.Log;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.sdk.bridge.api.BridgeService;
import com.ss.android.vc.statistics.p3180a.C63690d;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u001a\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/bytedance/sdk/bridge/Logger;", "", "()V", "bridgeService", "Lcom/bytedance/sdk/bridge/api/BridgeService;", "getBridgeService", "()Lcom/bytedance/sdk/bridge/api/BridgeService;", "bridgeService$delegate", "Lkotlin/Lazy;", C63690d.f160779a, "", "className", "", "message", "e", "reportError", "tag", "w", "bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.l */
public final class Logger {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f50513a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Logger.class), "bridgeService", "getBridgeService()Lcom/bytedance/sdk/bridge/api/BridgeService;"))};

    /* renamed from: b */
    public static final Logger f50514b = new Logger();

    /* renamed from: c */
    private static final Lazy f50515c = LazyKt.lazy(C20675a.INSTANCE);

    /* renamed from: a */
    private final BridgeService m75292a() {
        Lazy lazy = f50515c;
        KProperty kProperty = f50513a[0];
        return (BridgeService) lazy.getValue();
    }

    private Logger() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/sdk/bridge/api/BridgeService;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bridge.l$a */
    static final class C20675a extends Lambda implements Function0<BridgeService> {
        public static final C20675a INSTANCE = new C20675a();

        C20675a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BridgeService invoke() {
            Object obj;
            try {
                Result.Companion aVar = Result.Companion;
                obj = Result.m271569constructorimpl((BridgeService) C20216d.m73783a(BridgeService.class));
            } catch (Throwable th) {
                Result.Companion aVar2 = Result.Companion;
                obj = Result.m271569constructorimpl(C69097g.m265890a(th));
            }
            if (Result.m271575isFailureimpl(obj)) {
                obj = null;
            }
            return (BridgeService) obj;
        }
    }

    /* renamed from: a */
    public final void mo69733a(String str, String str2) {
        Boolean bool;
        Intrinsics.checkParameterIsNotNull(str, "className");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        C20661b a = BridgeManager.f50421a.mo69560a();
        if (a != null) {
            bool = a.mo69544a();
        } else {
            bool = null;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            Log.d("bridge", str + " - " + str2);
        }
    }

    /* renamed from: b */
    public final void mo69734b(String str, String str2) {
        Boolean bool;
        Intrinsics.checkParameterIsNotNull(str, "className");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        C20661b a = BridgeManager.f50421a.mo69560a();
        if (a != null) {
            bool = a.mo69544a();
        } else {
            bool = null;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            Log.w("bridge", str + " - " + str2);
        }
    }

    /* renamed from: c */
    public final void mo69735c(String str, String str2) {
        Boolean bool;
        Intrinsics.checkParameterIsNotNull(str, "className");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        C20661b a = BridgeManager.f50421a.mo69560a();
        if (a != null) {
            bool = a.mo69544a();
        } else {
            bool = null;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            Log.e("bridge", str + " - " + str2);
        }
    }

    /* renamed from: d */
    public final void mo69736d(String str, String str2) {
        Unit unit;
        try {
            Result.Companion aVar = Result.Companion;
            BridgeService a = f50514b.m75292a();
            if (a != null) {
                String str3 = "BridgeReport_" + str;
                if (str2 == null) {
                    str2 = "";
                }
                a.reportErrorInfo(str3, str2);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m271569constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion aVar2 = Result.Companion;
            Result.m271569constructorimpl(C69097g.m265890a(th));
        }
    }
}
