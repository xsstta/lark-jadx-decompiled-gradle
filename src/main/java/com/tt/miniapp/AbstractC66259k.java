package com.tt.miniapp;

import android.os.SystemClock;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.he.loader.LoadScriptSample;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.event.C66037e;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.falcon.runtime.IJsRuntime;
import com.tt.miniapp.manager.C66464n;
import com.tt.miniapp.p3293h.C66194c;
import com.tt.miniapp.progress.TMALaunchProgress;
import com.tt.miniapp.streamloader.FileAccessLogger;
import com.tt.miniapp.util.MpTimeLineReporter;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.refer.common.util.C67866g;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.k */
public abstract class AbstractC66259k implements IJsRuntime {
    private static final long EPOCH_CPU_TIME_START = (SystemClock.elapsedRealtime() - (System.nanoTime() / 1000000));
    private static final long EPOCH_START = (System.currentTimeMillis() - (System.nanoTime() / 1000000));
    public IAppContext appContext;
    public volatile boolean localPkgReady;
    private TimeMeter mJsSDKLoadStartTimer;
    public volatile int mJsSdkLoadState = 2;
    private final JSONObject mMpReportExtra;
    private final MpTimeLineReporter mMpTimeLineReporter;

    /* access modifiers changed from: protected */
    public abstract String getJsCoreFileName();

    /* access modifiers changed from: protected */
    public abstract void setLoadScriptSampleCallback(LoadScriptSample.Callback callback);

    /* access modifiers changed from: protected */
    public abstract void setRootPathToNative(String str);

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public int getJsSdkLoadState() {
        return this.mJsSdkLoadState;
    }

    /* access modifiers changed from: protected */
    public void reportLoadJsCoreBegin() {
        this.mJsSDKLoadStartTimer = TimeMeter.newAndStart();
        this.mMpTimeLineReporter.addPoint("load_coreJs_begin", this.mMpReportExtra);
    }

    public final void setupLoader() {
        C66464n.m259787a(new C66464n.AbstractC66466b() {
            /* class com.tt.miniapp.$$Lambda$k$53SI6f56UB_pdjJbKbVnWRnLMqY */

            @Override // com.tt.miniapp.manager.C66464n.AbstractC66466b
            public final void localPackageReady(String str) {
                AbstractC66259k.this.lambda$setupLoader$0$k(str);
            }
        }, this.appContext);
        setLoadScriptSampleCallback(new LoadScriptSample.Callback() {
            /* class com.tt.miniapp.$$Lambda$k$rIBp9AmDzzNEQR0ZSxzB2eyPhro */

            @Override // com.he.loader.LoadScriptSample.Callback
            public final void onSample(LoadScriptSample loadScriptSample) {
                AbstractC66259k.this.lambda$setupLoader$1$k(loadScriptSample);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void updateLoadJsCoreEnd() {
        ((TMALaunchProgress) AppbrandApplicationImpl.getInst(this.appContext).getService(TMALaunchProgress.class)).updateStatus(3);
        AppBrandLogger.m52828d("falcon", "startup  service.updateStatus");
    }

    /* access modifiers changed from: protected */
    public void updateLoadJsCoreBegin() {
        LarkInnerEventHelper.mpJsCoreLibLoadStart(this.appContext);
        C66037e.m258610a(this.appContext).mo231116a("lib_js_loading");
        TimeLogger instance = TimeLogger.getInstance(this.appContext);
        instance.logTimeDuration("JsRuntime_load_" + getJsCoreFileName());
    }

    /* access modifiers changed from: protected */
    public void reportLoadJsCoreEnd() {
        this.mMpTimeLineReporter.addPoint("load_coreJs_end", this.mMpReportExtra);
        this.mJsSdkLoadState = 0;
        C66036d.m258582a("success", TimeMeter.stop(this.mJsSDKLoadStartTimer), "", this.appContext);
        LarkInnerEventHelper.mpJsCoreLibLoadResult("success", null, 0, null, null, this.appContext);
        TimeLogger instance = TimeLogger.getInstance(this.appContext);
        instance.logTimeDuration("JsRuntime_load_" + getJsCoreFileName() + "_success");
    }

    public static long toEpochCpuTime(long j) {
        return EPOCH_CPU_TIME_START + (j / 1000);
    }

    public static long toEpochTime(long j) {
        return EPOCH_START + (j / 1000);
    }

    public void showLoadError(String str) {
        C66194c.m259173a(str, this.appContext);
    }

    public AbstractC66259k(IAppContext iAppContext) {
        this.appContext = iAppContext;
        this.mMpTimeLineReporter = (MpTimeLineReporter) AppbrandApplicationImpl.getInst(iAppContext).getService(MpTimeLineReporter.class);
        this.mMpReportExtra = new MpTimeLineReporter.C67015a().mo233114a("file_path", getJsCoreFileName()).mo233115a();
    }

    public /* synthetic */ void lambda$setupLoader$0$k(String str) {
        AppBrandLogger.m52830i("JsRuntimeWrapper", "TTAppLoader.loadPackage: " + str);
        setRootPathToNative(str);
        this.localPkgReady = true;
    }

    public /* synthetic */ void lambda$setupLoader$1$k(final LoadScriptSample loadScriptSample) {
        if (HostDependManager.getInst().getFeatureGating("gadget.log.trace")) {
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.AbstractC66259k.C662601 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    MpTimeLineReporter mpTimeLineReporter = (MpTimeLineReporter) AppbrandApplicationImpl.getInst(AbstractC66259k.this.appContext).getService(MpTimeLineReporter.class);
                    JSONObject a = new MpTimeLineReporter.C67015a().mo233114a("file_path", loadScriptSample.path).mo233114a("js_source", Integer.valueOf(AbstractC66259k.this.localPkgReady ? 1 : 0)).mo233115a();
                    ((FileAccessLogger) AppbrandApplicationImpl.getInst(AbstractC66259k.this.appContext).getService(FileAccessLogger.class)).logFileAccess(loadScriptSample.path, AbstractC66259k.toEpochTime(loadScriptSample.start));
                    mpTimeLineReporter.addPoint("v8_load_script_begin", AbstractC66259k.toEpochTime(loadScriptSample.start), AbstractC66259k.toEpochCpuTime(loadScriptSample.start), a, false);
                    mpTimeLineReporter.addPoint("get_file_content_from_ttpkg_begin", AbstractC66259k.toEpochTime(loadScriptSample.loadCodeStart), AbstractC66259k.toEpochCpuTime(loadScriptSample.loadCodeStart), a, false);
                    mpTimeLineReporter.addPoint("v8_load_cache_begin", AbstractC66259k.toEpochTime(loadScriptSample.loadCacheStart), AbstractC66259k.toEpochCpuTime(loadScriptSample.loadCacheStart), a, false);
                    mpTimeLineReporter.addPoint("v8_compile_begin", AbstractC66259k.toEpochTime(loadScriptSample.compileStart), AbstractC66259k.toEpochCpuTime(loadScriptSample.compileStart), a, false);
                    mpTimeLineReporter.addPoint("v8_execute_begin", AbstractC66259k.toEpochTime(loadScriptSample.executeStart), AbstractC66259k.toEpochCpuTime(loadScriptSample.executeStart), a, false);
                    mpTimeLineReporter.addPoint("v8_load_script_end", AbstractC66259k.toEpochTime(loadScriptSample.end), AbstractC66259k.toEpochCpuTime(loadScriptSample.end), a, false);
                }
            }, Schedulers.shortIO());
        } else {
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.AbstractC66259k.C662612 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    MpTimeLineReporter mpTimeLineReporter = (MpTimeLineReporter) AppbrandApplicationImpl.getInst(AbstractC66259k.this.appContext).getService(MpTimeLineReporter.class);
                    JSONObject a = new MpTimeLineReporter.C67015a().mo233114a("file_path", loadScriptSample.path).mo233114a("js_source", Integer.valueOf(AbstractC66259k.this.localPkgReady ? 1 : 0)).mo233115a();
                    ((FileAccessLogger) AppbrandApplicationImpl.getInst(AbstractC66259k.this.appContext).getService(FileAccessLogger.class)).logFileAccess(loadScriptSample.path, AbstractC66259k.toEpochTime(loadScriptSample.start));
                    mpTimeLineReporter.addPoint("v8_load_script_begin", AbstractC66259k.toEpochTime(loadScriptSample.start), AbstractC66259k.toEpochCpuTime(loadScriptSample.start), a, false);
                    mpTimeLineReporter.addPoint("get_file_content_from_ttpkg_begin", AbstractC66259k.toEpochTime(loadScriptSample.loadCodeStart), AbstractC66259k.toEpochCpuTime(loadScriptSample.loadCodeStart), a, false);
                    mpTimeLineReporter.addPoint("v8_load_cache_begin", AbstractC66259k.toEpochTime(loadScriptSample.loadCacheStart), AbstractC66259k.toEpochCpuTime(loadScriptSample.loadCacheStart), a, false);
                    mpTimeLineReporter.addPoint("v8_compile_begin", AbstractC66259k.toEpochTime(loadScriptSample.compileStart), AbstractC66259k.toEpochCpuTime(loadScriptSample.compileStart), a, false);
                    mpTimeLineReporter.addPoint("v8_execute_begin", AbstractC66259k.toEpochTime(loadScriptSample.executeStart), AbstractC66259k.toEpochCpuTime(loadScriptSample.executeStart), a, false);
                    mpTimeLineReporter.addPoint("v8_load_script_end", AbstractC66259k.toEpochTime(loadScriptSample.end), AbstractC66259k.toEpochCpuTime(loadScriptSample.end), a, false);
                }
            }, Schedulers.shortIO());
        }
    }
}
