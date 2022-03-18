package com.tt.miniapp.falcon.snapshot;

import android.text.TextUtils;
import com.bytedance.ee.falcon.loader.LoadScriptModule;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.lark.falcon.engine.bridge.JavaOnlyMap;
import com.lark.falcon.engine.snapshot.V8SnapshotCreateShellHolder;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.falcon.jsfunction.LoadScriptFunction;
import com.tt.miniapp.falcon.module.BridgeModule;
import com.tt.miniapp.falcon.p3287c.C66062a;
import com.tt.miniapp.falcon.snapshot.C66071b;
import com.tt.miniapp.jsbridge.C66237b;
import com.tt.miniapp.streamloader.C66876b;
import java.io.File;

/* renamed from: com.tt.miniapp.falcon.snapshot.b */
public class C66071b {

    /* renamed from: a */
    private final IAppContext f166786a;

    /* renamed from: b */
    private final C66070a f166787b;

    /* renamed from: c */
    private volatile boolean f166788c;

    /* renamed from: com.tt.miniapp.falcon.snapshot.b$a */
    public interface AbstractC66073a {
        /* renamed from: a */
        void mo231221a();

        /* renamed from: b */
        void mo231222b();

        /* renamed from: c */
        void mo231223c();

        /* renamed from: d */
        void mo231224d();
    }

    /* renamed from: com.tt.miniapp.falcon.snapshot.b$b */
    private static class C66074b implements AbstractC66073a {
        @Override // com.tt.miniapp.falcon.snapshot.C66071b.AbstractC66073a
        /* renamed from: a */
        public void mo231221a() {
        }

        @Override // com.tt.miniapp.falcon.snapshot.C66071b.AbstractC66073a
        /* renamed from: b */
        public void mo231222b() {
        }

        @Override // com.tt.miniapp.falcon.snapshot.C66071b.AbstractC66073a
        /* renamed from: c */
        public void mo231223c() {
        }

        @Override // com.tt.miniapp.falcon.snapshot.C66071b.AbstractC66073a
        /* renamed from: d */
        public void mo231224d() {
        }

        private C66074b() {
        }
    }

    /* renamed from: a */
    public C66070a mo231218a() {
        return this.f166787b;
    }

    /* renamed from: b */
    public boolean mo231220b() {
        return this.f166787b.mo231216c().mo231225a();
    }

    /* renamed from: c */
    private void m258748c(V8SnapshotCreateShellHolder v8SnapshotCreateShellHolder) {
        ((LoadScriptFunction) v8SnapshotCreateShellHolder.mo86089b(LoadScriptFunction.class)).loadScript("app-service.js");
    }

    /* renamed from: a */
    private void m258745a(V8SnapshotCreateShellHolder v8SnapshotCreateShellHolder) {
        JavaOnlyMap a = new C66062a(this.f166786a).mo231164a();
        a.putBoolean("snapshotLaunch", true);
        v8SnapshotCreateShellHolder.mo86080a(a);
        v8SnapshotCreateShellHolder.mo86091c().registerModule(new BridgeModule(this.f166786a, new C66237b()));
        v8SnapshotCreateShellHolder.mo86091c().registerModule(new LoadScriptModule(new C66876b(this.f166786a)));
    }

    /* renamed from: b */
    private void m258747b(V8SnapshotCreateShellHolder v8SnapshotCreateShellHolder) {
        File file = new File(AppbrandConstant.getJsBundleDir(this.f166786a.getApplicationContext(), this.f166786a), "tma-core.js");
        String readString = IOUtils.readString(file.getAbsolutePath(), "utf-8");
        v8SnapshotCreateShellHolder.mo86093d();
        v8SnapshotCreateShellHolder.mo86087a(readString, file.getName());
    }

    /* renamed from: d */
    private void m258749d(V8SnapshotCreateShellHolder v8SnapshotCreateShellHolder) {
        String str;
        LoadScriptFunction loadScriptFunction = (LoadScriptFunction) v8SnapshotCreateShellHolder.mo86089b(LoadScriptFunction.class);
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f166786a).getAppConfig();
        if (appConfig != null) {
            str = appConfig.mo230042c().get(0);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            loadScriptFunction.loadScript(str + "-service.js");
        }
    }

    /* renamed from: a */
    public void mo231219a(AbstractC66073a aVar) {
        if (this.f166788c) {
            AppBrandLogger.m52829e("BaseSnapshotCreator", "createSnapshot: snapshot has been created. Please do not create it again");
            return;
        }
        this.f166788c = true;
        if (aVar == null) {
            aVar = new C66074b();
        }
        if (!mo231220b()) {
            AppBrandLogger.m52829e("BaseSnapshotCreator", "createSnapshot: disable snapshot");
            aVar.mo231221a();
            return;
        }
        aVar.mo231222b();
        V8SnapshotCreateShellHolder v8SnapshotCreateShellHolder = new V8SnapshotCreateShellHolder(false);
        v8SnapshotCreateShellHolder.mo86083a(new Runnable(v8SnapshotCreateShellHolder, aVar) {
            /* class com.tt.miniapp.falcon.snapshot.$$Lambda$b$4tkXxNKidy11DAOCVnaQeTfE9YY */
            public final /* synthetic */ V8SnapshotCreateShellHolder f$1;
            public final /* synthetic */ C66071b.AbstractC66073a f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C66071b.this.m258746a(this.f$1, this.f$2);
            }
        });
    }

    public C66071b(IAppContext iAppContext, C66070a aVar) {
        this.f166786a = iAppContext;
        this.f166787b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m258746a(V8SnapshotCreateShellHolder v8SnapshotCreateShellHolder, AbstractC66073a aVar) {
        m258745a(v8SnapshotCreateShellHolder);
        m258747b(v8SnapshotCreateShellHolder);
        m258748c(v8SnapshotCreateShellHolder);
        if (this.f166787b.mo231214a() == SnapshotType.KEEP_HOME_PAGE) {
            m258749d(v8SnapshotCreateShellHolder);
        }
        String b = this.f166787b.mo231215b().mo231235b();
        AppBrandLogger.m52830i("BaseSnapshotCreator", "createSnapshot: SnapshotFilePath = " + b);
        if (v8SnapshotCreateShellHolder.mo86204b(b)) {
            AppBrandLogger.m52830i("BaseSnapshotCreator", "createSnapshot: createBlob successfully");
            aVar.mo231223c();
        } else {
            AppBrandLogger.m52829e("BaseSnapshotCreator", "createSnapshot: createBlob failed");
            aVar.mo231224d();
        }
        this.f166787b.mo231215b().mo231236c();
        v8SnapshotCreateShellHolder.mo86096g();
    }

    public C66071b(IAppContext iAppContext, String str, SnapshotType snapshotType) {
        this.f166786a = iAppContext;
        this.f166787b = new C66070a(iAppContext, str, snapshotType);
    }
}
