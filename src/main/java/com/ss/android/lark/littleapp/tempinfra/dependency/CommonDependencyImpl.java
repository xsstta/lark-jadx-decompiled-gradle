package com.ss.android.lark.littleapp.tempinfra.dependency;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.dependency.ICommonDependency;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/littleapp/tempinfra/dependency/CommonDependencyImpl;", "Lcom/bytedance/ee/lark/infra/foundation/dependency/ICommonDependency;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TAG", "", "getContext", "()Landroid/content/Context;", "getAppbrandContext", "getDeviceId", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "getFgValue", "", "key", "getGlobalTrace", "Lcom/ss/android/lark/optrace/api/TracingCoreSpan;", "getGlobalUniqueId", "getIsolatePrefix", "getLarkSession", "getSpPrefixPath", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.littleapp.e.a.a */
public final class CommonDependencyImpl implements ICommonDependency {

    /* renamed from: a */
    private final String f105112a = "CommonDependencyImpl";

    /* renamed from: b */
    private final Context f105113b;

    @Override // com.bytedance.ee.lark.infra.foundation.dependency.ICommonDependency
    /* renamed from: e */
    public Context mo48304e() {
        AppbrandContext inst = AppbrandContext.getInst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandContext.getInst()");
        return inst.getApplicationContext();
    }

    @Override // com.bytedance.ee.lark.infra.foundation.dependency.ICommonDependency
    /* renamed from: a */
    public String mo48297a() {
        HostDependManager inst = HostDependManager.getInst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "HostDependManager.getInst()");
        String spPrefixPath = inst.getSpPrefixPath();
        Intrinsics.checkExpressionValueIsNotNull(spPrefixPath, "HostDependManager.getInst().spPrefixPath");
        return spPrefixPath;
    }

    @Override // com.bytedance.ee.lark.infra.foundation.dependency.ICommonDependency
    /* renamed from: b */
    public String mo48300b() {
        HostDependManager inst = HostDependManager.getInst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "HostDependManager.getInst()");
        String prefixPath = inst.getPrefixPath();
        Intrinsics.checkExpressionValueIsNotNull(prefixPath, "HostDependManager.getInst().prefixPath");
        return prefixPath;
    }

    @Override // com.bytedance.ee.lark.infra.foundation.dependency.ICommonDependency
    /* renamed from: c */
    public TracingCoreSpan mo48302c() {
        AppbrandContext inst = AppbrandContext.getInst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandContext.getInst()");
        OPTrace tracing = inst.getTracing();
        Intrinsics.checkExpressionValueIsNotNull(tracing, "AppbrandContext.getInst().tracing");
        return tracing;
    }

    @Override // com.bytedance.ee.lark.infra.foundation.dependency.ICommonDependency
    /* renamed from: d */
    public String mo48303d() {
        AppbrandContext inst = AppbrandContext.getInst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandContext.getInst()");
        String uniqueId = inst.getUniqueId();
        Intrinsics.checkExpressionValueIsNotNull(uniqueId, "AppbrandContext.getInst().uniqueId");
        return uniqueId;
    }

    public CommonDependencyImpl(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f105113b = context;
    }

    @Override // com.bytedance.ee.lark.infra.foundation.dependency.ICommonDependency
    /* renamed from: a */
    public boolean mo48299a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return HostDependManager.getInst().getFeatureGating(str);
    }

    @Override // com.bytedance.ee.lark.infra.foundation.dependency.ICommonDependency
    /* renamed from: a */
    public String mo48298a(IAppContext iAppContext) {
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        IBaseService findServiceByInterface = iAppContext.findServiceByInterface(AbstractC67724a.class);
        Intrinsics.checkExpressionValueIsNotNull(findServiceByInterface, "appContext.findServiceBy…IHostService::class.java)");
        return ((AbstractC67724a) findServiceByInterface).mo50470k();
    }

    @Override // com.bytedance.ee.lark.infra.foundation.dependency.ICommonDependency
    /* renamed from: b */
    public String mo48301b(IAppContext iAppContext) {
        String str = null;
        if (iAppContext != null) {
            AbstractC67724a aVar = (AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class);
            AppBrandLogger.m52828d(this.f105112a, " appContext getAppType:" + iAppContext.getAppType() + " appContextKey:" + iAppContext.getAppId());
            if (aVar != null) {
                return aVar.mo50459d();
            }
            return str;
        }
        CrossProcessDataEntity f = C67556a.m262949f();
        if (f == null || !f.mo234742a("sessionId")) {
            return str;
        }
        return f.mo234744b("sessionId");
    }
}
