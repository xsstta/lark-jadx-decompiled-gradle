package com.tt.miniapp.falcon.snapshot;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.lark.falcon.engine.bridge.JavaOnlyMap;
import com.lark.falcon.engine.holder.AndroidFalconShellHolder;
import com.lark.falcon.engine.holder.C23974a;
import com.lark.falcon.engine.inspect.InspectorClient;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.miniapp.falcon.runtime.C66067a;

/* renamed from: com.tt.miniapp.falcon.snapshot.i */
public class C66083i extends C66067a {

    /* renamed from: b */
    private static final String[] f166802b = {"{\"id\":1,\"method\":\"Runtime.enable\",\"params\":{}}", "{\"id\":2,\"method\":\"Debugger.enable\",\"params\":{\"maxScriptsCacheSize\":100000000}}", "{\"id\":3,\"method\":\"Debugger.setPauseOnExceptions\",\"params\":{\"state\":\"none\"}}", "{\"id\":4,\"method\":\"Debugger.setAsyncCallStackDepth\",\"params\":{\"maxDepth\":32}}", "{\"id\":5,\"method\":\"Profiler.enable\",\"params\":{}}", "{\"id\":6,\"method\":\"Runtime.getIsolateId\",\"params\":{}}", "{\"id\":7,\"method\":\"Debugger.setBlackboxPatterns\",\"params\":{\"patterns\":[]}}", "{\"id\":8,\"method\":\"Runtime.runIfWaitingForDebugger\",\"params\":{}}"};

    /* renamed from: c */
    private static final String[] f166803c = {"{\"id\":9,\"method\":\"HeapProfiler.enable\",\"params\":{}}", "{\"id\":10,\"method\":\"Profiler.setSamplingInterval\",\"params\":{\"interval\":100}}", "{\"id\":11,\"method\":\"Profiler.start\",\"params\":{}}", "{\"id\":12,\"method\":\"Debugger.setAsyncCallStackDepth\",\"params\":{\"maxDepth\":0}}", "{\"id\":13,\"method\":\"Debugger.disable\",\"params\":{}}"};

    /* renamed from: d */
    private final C66070a f166804d;

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.falcon.runtime.C66067a
    /* renamed from: c */
    public void mo231202c() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.falcon.runtime.C66067a
    /* renamed from: f */
    public void mo231205f() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.falcon.runtime.C66067a
    /* renamed from: g */
    public void mo231206g() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.falcon.runtime.C66067a
    /* renamed from: e */
    public void mo231204e() {
        mo231200a().mo86087a("this.getApp().startApp()", "");
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.falcon.runtime.C66067a
    /* renamed from: h */
    public JavaOnlyMap mo231208h() {
        JavaOnlyMap h = super.mo231208h();
        h.remove("TMAConfig");
        return h;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.falcon.runtime.C66067a
    /* renamed from: d */
    public String mo231203d() {
        return "-Snapshot(" + this.f166804d.mo231214a() + ")";
    }

    /* renamed from: a */
    public void mo231239a(C66067a aVar) {
        if (aVar == null) {
            AppBrandLogger.m52829e("SnapshotJsRuntime", "transferInspectorClient: currentRuntime == null");
            return;
        }
        C66076d b = aVar.mo231201b();
        if (b == null || !b.mo231229a()) {
            AppBrandLogger.m52829e("SnapshotJsRuntime", "transferInspectorClient: session == null || !session.isOpen()");
            return;
        }
        InspectorClient a = aVar.mo231200a().mo86076a();
        if (a == null) {
            AppBrandLogger.m52829e("SnapshotJsRuntime", "transferInspectorClient: inspectorClient == null");
            return;
        }
        AppBrandLogger.m52830i("SnapshotJsRuntime", "transferInspectorClient: start");
        aVar.mo231200a().mo86082a((InspectorClient) null);
        mo231200a().mo86076a().mo86117e();
        mo231200a().mo86082a(a);
        a.mo86111a(mo231200a());
        mo231200a().mo86094e();
        for (String str : f166802b) {
            mo231200a().mo86085a(str);
        }
        if (b.mo231230b()) {
            AppBrandLogger.m52830i("SnapshotJsRuntime", "transferInspectorClient: send profiler protocols");
            for (String str2 : f166803c) {
                mo231200a().mo86085a(str2);
            }
        }
        AppBrandLogger.m52830i("SnapshotJsRuntime", "transferInspectorClient: end");
    }

    public C66083i(IAppContext iAppContext, C66070a aVar) {
        super(iAppContext, m258793a(aVar, iAppContext));
        this.f166804d = aVar;
    }

    /* renamed from: a */
    private static AndroidFalconShellHolder m258793a(C66070a aVar, IAppContext iAppContext) {
        AppBrandLogger.m52830i("SnapshotJsRuntime", "createShellHolder: ");
        aVar.mo231216c().mo231227c();
        AndroidFalconShellHolder androidFalconShellHolder = new AndroidFalconShellHolder(new C23974a.C23976a().mo86108b(C25529d.m91170k(iAppContext)).mo86106a(true).mo86105a(aVar.mo231215b().mo231235b()).mo86107a());
        aVar.mo231216c().mo231228d();
        return androidFalconShellHolder;
    }
}
