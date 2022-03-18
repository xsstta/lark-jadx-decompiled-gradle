package com.bytedance.ee.bear.drive.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.drive.DriveOfflineDoc;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.PreloadEntity;
import com.bytedance.ee.bear.contract.drive.sdk.preview.PreviewAction;
import com.bytedance.ee.bear.drive.biz.cache.manual.ManualCacheDownloadManager;
import com.bytedance.ee.bear.drive.biz.external.C6416c;
import com.bytedance.ee.bear.drive.biz.fg.DriveSdkConfig;
import com.bytedance.ee.bear.drive.biz.importfile.exception.DriveNoImportPermissionException;
import com.bytedance.ee.bear.drive.biz.importfile.p328b.C6476a;
import com.bytedance.ee.bear.drive.biz.importfile.request.C6496a;
import com.bytedance.ee.bear.drive.biz.plugin.C6527a;
import com.bytedance.ee.bear.drive.biz.plugin.C6535d;
import com.bytedance.ee.bear.drive.biz.upload.C6751d;
import com.bytedance.ee.bear.drive.biz.upload.error.C6763e;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.UploadListActivity;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.UploadListMainProcActivity;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.common.activity.DriveCarrierActivity;
import com.bytedance.ee.bear.drive.common.mvpframeworks.app.AbstractC6900a;
import com.bytedance.ee.bear.drive.common.p341a.C6887a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.drive.p325b.C6319a;
import com.bytedance.ee.bear.drive.preload.C7110a;
import com.bytedance.ee.bear.drive.preload.C7111b;
import com.bytedance.ee.bear.drive.services.C7189m;
import com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor;
import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.UploadCallback;
import com.bytedance.ee.bear.middleground.drive.export.UploadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.plugin.common.log.ILog;
import com.bytedance.ee.plugin.common.log.PluginLog;
import com.bytedance.ee.util.p699b.C13595b;
import com.bytedance.ee.util.p718t.C13748k;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Function;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.services.m */
public class C7189m extends AbstractC7174b {

    /* renamed from: a */
    public Application f19304a;

    /* renamed from: b */
    public WeakReference<Activity> f19305b;

    /* renamed from: c */
    public String f19306c;

    /* renamed from: d */
    private boolean f19307d;

    /* renamed from: e */
    private C7111b f19308e;

    /* renamed from: f */
    private boolean f19309f;

    /* renamed from: g */
    private ManualCacheDownloadManager f19310g;

    /* renamed from: h */
    private C6763e f19311h;

    /* renamed from: i */
    private C68289a f19312i = new C68289a();

    /* renamed from: a */
    private void m28804a(Application application) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m28806a(Object obj) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m28812c(Boolean bool) throws Exception {
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void onConfigChanged() {
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public AbstractC68307f<Boolean> checkInitPluginFlowable() {
        return AbstractC68307f.m265083a((Object) true);
    }

    /* renamed from: g */
    private Context m28818g() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f19305b;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if (activity != null && !activity.isFinishing()) {
            return activity;
        }
        C13479a.m54772d("DriveServiceImpl", "Activity is null.");
        return this.f19304a;
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public AbstractC68307f<Boolean> cleanDriveCleanableCache() {
        C6920b f = C6920b.m27342f();
        if (f != null) {
            return f.mo27170e().mo27091c();
        }
        C13479a.m54758a("DriveServiceImpl", "driveConfigService is null!!!");
        return AbstractC68307f.m265084a((Throwable) new NullPointerException("driveConfigService is null!!!"));
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        C13479a.m54764b("DriveServiceImpl", "DriveServiceImpl.destroy:  ");
        ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35641g();
        this.f19309f = false;
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public AbstractC68307f<Long> getDriveCleanableCacheSize() {
        C6920b f = C6920b.m27342f();
        if (f != null) {
            return f.mo27170e().mo27092d();
        }
        C13479a.m54758a("DriveServiceImpl", "driveConfigService is null!!!");
        return AbstractC68307f.m265084a((Throwable) new NullPointerException("driveConfigService is null!!!"));
    }

    /* renamed from: d */
    public void mo28172d() {
        try {
            C13479a.m54764b("DriveServiceImpl", "cancelTask() start");
            int h = ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35642h();
            C13479a.m54764b("DriveServiceImpl", "IMGDriveInterfaces.class).cancelAll ret=" + h);
            this.f19310g.mo25445b();
            this.f19308e.mo27837a();
            this.f19312i.mo237935a();
        } catch (Exception e) {
            C13479a.m54761a("DriveServiceImpl", e);
        }
    }

    /* renamed from: f */
    private void m28817f() {
        C13479a.m54764b("TTOfficePlugin", "start init drive plugin ~");
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.services.$$Lambda$m$wuE8s9mex45y1j9xV5eDBl1Tw8U */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7189m.this.m28798a((String) obj);
            }
        }).mo238001b($$Lambda$m$UAEC0mE7Z943ZNcOHPLOw2c3nyU.INSTANCE, $$Lambda$m$9orO_tcRxKldSdq1CClOW2i2jYo.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.service.AbstractC10933f, com.bytedance.ee.bear.drive.services.AbstractC7174b
    /* renamed from: b */
    public Class<?>[] mo16351b() {
        return new Class[]{AbstractC5094ag.class, am.class, AbstractC7197n.class};
    }

    /* renamed from: e */
    public void mo28173e() {
        if (((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35643i() > 0 && ((an) KoinJavaComponent.m268610a(an.class)).mo16409g()) {
            boolean f = C5102ai.m20872j().mo20214f();
            if (!this.f19307d || f) {
                C13479a.m54764b("DriveServiceImpl", "handleAutoResumeUpload cancel_all  ");
                ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35640f().mo238004b(C11678b.m48479c()).mo238036k();
                return;
            }
            C13479a.m54764b("DriveServiceImpl", "handleAutoResumeUpload resume_all  ");
            ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35631b(false).mo238004b(C11678b.m48479c()).mo238036k();
        }
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void openDriveTestActivity(Bundle bundle) {
        C6319a.m25391a(m28818g(), bundle);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void registerOpenMonitor(BinderIDriveOpenMonitor binderIDriveOpenMonitor) {
        DriveOpenMonitorImpl.f19302b.mo28170a(binderIDriveOpenMonitor);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void requestImport(ImportFileEntity importFileEntity) {
        C6319a.m25392a(m28818g(), importFileEntity);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ AbstractC70020b m28814d(Throwable th) throws Exception {
        return AbstractC68307f.m265083a((Object) false);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void unRegisterUploadStateMonitor(BinderIUploadStateMonitor binderIUploadStateMonitor) {
        ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35624a(binderIUploadStateMonitor);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m28810b(Boolean bool) throws Exception {
        C13479a.m54764b("ArchivePlugin", "start init archive plugin end, result=" + bool);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public AbstractC68307f<Integer> canImport(String str) {
        return new C6496a(mo28168c()).mo25988a(str, false).mo238014c(new Function(str) {
            /* class com.bytedance.ee.bear.drive.services.$$Lambda$m$qASldZu312phg8HX490hhiOg4c */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7189m.m28803a(this.f$0, (Integer) obj);
            }
        }).mo238026e($$Lambda$m$1b4l7qu9D7xVtyF0kE5qYkf1UNM.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void cancelManualOfflineFile(String str) {
        ManualCacheDownloadManager manualCacheDownloadManager = this.f19310g;
        if (manualCacheDownloadManager == null) {
            C13479a.m54758a("DriveServiceImpl", "mManualCacheDownloadManager is null");
        } else {
            manualCacheDownloadManager.mo25439a(str).mo238001b($$Lambda$m$ABTDxfHPl9hw3fKSLRpUkQBCRm0.INSTANCE, $$Lambda$m$SNEWsFwiM_FU2Zi64gpJmVNxv0U.INSTANCE);
        }
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public AbstractC68307f<Boolean> deleteDriveCacheByTokens(ArrayList<String> arrayList) {
        C6920b f = C6920b.m27342f();
        if (f == null) {
            return AbstractC68307f.m265083a((Object) false);
        }
        return f.mo27170e().mo27084a(arrayList).mo238026e($$Lambda$m$FMmYsbdJzU4MKWBpBXOh0xfITxQ.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void driveCancelDownload(ArrayList<String> arrayList) {
        ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35630b((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void requestPreviewUsingPlatformCapability(String str) {
        C13479a.m54764b("DriveServiceImpl", "DriveServiceImpl.requestPreviewUsingPlatformCapability");
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        DriveCarrierActivity.m27213a(m28818g(), C6416c.class, bundle);
    }

    /* renamed from: a */
    private String m28800a(int i) {
        if (i == 0) {
            return "BEFORE_LOGOUT";
        }
        if (i == 1) {
            return "LOGIN";
        }
        if (i == 2) {
            return "LOGOUT";
        }
        if (i == 3) {
            return "SWITCH_TENANT_START";
        }
        if (i == 4) {
            return "SWITCH_TENANT_END";
        }
        if (i == 5) {
            return "SWITCH_TENANT_FAILED";
        }
        return "UNKNOWN = " + i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Boolean m28808b(int i) throws Exception {
        if (i == 0 || i == 3 || i == 2) {
            ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35628a(true);
        }
        if (i == 0 || i == 2 || i == 3) {
            mo28172d();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ AbstractC70020b m28816f(Throwable th) throws Exception {
        int a = C6476a.m26020a(th);
        C13479a.m54764b("DriveServiceImpl", "canImport errorCode = " + a);
        return AbstractC68307f.m265083a(Integer.valueOf(a));
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public AbstractC68307f<Boolean> cleanDriveCacheFlowable(long j) {
        C13479a.m54764b("DriveServiceImpl", "cleanDriveCache() beforeTimeInMills=" + j);
        return C6880a.m27065a().mo27083a(j).mo238011b(AbstractC68307f.m265083a((Object) false));
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.drive.services.AbstractC7174b
    public void init(Application application) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f19304a = application;
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            /* class com.bytedance.ee.bear.drive.services.C7189m.C71933 */

            public void onActivityPaused(Activity activity) {
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityStarted(Activity activity) {
            }

            public void onActivityStopped(Activity activity) {
            }

            public void onActivityResumed(Activity activity) {
                C7189m.this.f19305b = new WeakReference<>(activity);
            }

            public void onActivityDestroyed(Activity activity) {
                if (C7189m.this.f19305b != null && activity == C7189m.this.f19305b.get()) {
                    C7189m.this.f19305b = new WeakReference<>(null);
                }
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof AbstractC6900a) {
                    C7189m mVar = C7189m.this;
                    mVar.lazyInit(mVar.f19304a);
                }
            }
        });
        C13479a.m54764b("DriveServiceImpl", "DriveServiceImpl.init finish, cost time=" + (System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void onLoginStatusChangedEvent(int i) {
        C13479a.m54764b("DriveServiceImpl", "onLoginStatusChangedEvent... event = " + m28800a(i));
        AbstractC68307f.m265099b((Callable) new Callable(i) {
            /* class com.bytedance.ee.bear.drive.services.$$Lambda$m$tneHbcxOlIoOS8Q6T6sCcGO4Y0 */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7189m.this.m28808b(this.f$1);
            }
        }).mo238004b(C11678b.m48479c()).mo238010b((Object) false).mo238036k();
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void preloadDriveSdkFile(ArrayList<PreloadEntity> arrayList) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("DriveServiceImpl#preloadDriveSdkFile(), entities size=");
        if (arrayList == null) {
            i = 0;
        } else {
            i = arrayList.size();
        }
        sb.append(i);
        C13479a.m54764b("DriveSdk", sb.toString());
        try {
            new C7110a().mo27834a(arrayList);
        } catch (Exception e) {
            C13479a.m54759a("DriveSdk", "DriveServiceImpl#preloadDriveSdkFile() error=", e);
        }
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void setDocPageVisiable(boolean z) {
        AbstractC68307f.m265083a((Object) true).mo238004b(C11678b.m48482f()).mo238020d(new Function(z) {
            /* class com.bytedance.ee.bear.drive.services.$$Lambda$m$MUkxYiki4QYGnU54gfI5pUUuZLg */
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7189m.m28799a(this.f$0, (Boolean) obj);
            }
        }).mo238001b($$Lambda$m$OcQABzlMRfnBzDqd47ia0MJwtu8.INSTANCE, $$Lambda$m$ryWA4s7bTvYutWV2_VC5WFmUX8.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m28798a(String str) throws Exception {
        if (C6535d.m26238a().mo26082d()) {
            if (C6535d.m26238a().mo26102l()) {
                C6535d.m26238a().mo26084f();
            }
            C6535d.m26238a().mo26096a(mo28168c());
            C6527a.m26177a().mo26084f();
            C6527a.m26177a().mo26096a(mo28168c());
        }
        PluginLog.installLog(new ILog() {
            /* class com.bytedance.ee.bear.drive.services.C7189m.C71922 */

            @Override // com.bytedance.ee.plugin.common.log.ILog
            /* renamed from: d */
            public void mo28176d(String str) {
                C13479a.m54772d("PluginLog", str);
            }

            @Override // com.bytedance.ee.plugin.common.log.ILog
            /* renamed from: e */
            public void mo28177e(String str) {
                C13479a.m54758a("PluginLog", str);
            }

            @Override // com.bytedance.ee.plugin.common.log.ILog
            /* renamed from: i */
            public void mo28179i(String str) {
                C13479a.m54764b("PluginLog", str);
            }

            @Override // com.bytedance.ee.plugin.common.log.ILog
            /* renamed from: e */
            public void mo28178e(Throwable th) {
                C13479a.m54761a("PluginLog", th);
            }
        });
        return true;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.drive.services.AbstractC7174b
    public void lazyInit(Application application) {
        if (!this.f19309f) {
            C13479a.m54764b("DriveServiceImpl", "DriveServiceImpl.lazyInit:  ");
            long currentTimeMillis = System.currentTimeMillis();
            super.lazyInit(application);
            m28804a(application);
            ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35623a();
            final ConnectionService d = C5084ad.m20847d();
            this.f19307d = d.mo20038b().mo20041b();
            this.f19308e = new C7111b(this.f19304a, mo28168c());
            ManualCacheDownloadManager manualCacheDownloadManager = new ManualCacheDownloadManager(mo28168c(), this.f19304a);
            this.f19310g = manualCacheDownloadManager;
            manualCacheDownloadManager.mo25440a();
            C13748k.m55732a(new Runnable() {
                /* class com.bytedance.ee.bear.drive.services.C7189m.RunnableC71901 */

                public void run() {
                    d.mo20037a().mo5925a(new AbstractC1178x<ConnectionService.NetworkState>() {
                        /* class com.bytedance.ee.bear.drive.services.C7189m.RunnableC71901.C71911 */

                        /* renamed from: a */
                        public void onChanged(ConnectionService.NetworkState networkState) {
                            if (networkState != null) {
                                C13479a.m54764b("DriveServiceImpl", "networkState  = " + networkState);
                                C7189m.this.mo28171a(networkState);
                            }
                        }
                    });
                    C5102ai.m20872j().mo20213e().mo5925a(new AbstractC1178x() {
                        /* class com.bytedance.ee.bear.drive.services.$$Lambda$m$1$u1JhETsMYrdQXuEg0ntQxCiBuWk */

                        @Override // androidx.lifecycle.AbstractC1178x
                        public final void onChanged(Object obj) {
                            C7189m.RunnableC71901.this.m28823a((Boolean) obj);
                        }
                    });
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m28823a(Boolean bool) {
                    C7189m.this.mo28173e();
                }
            });
            C6880a e = C6920b.m27342f().mo27170e();
            if (e != null) {
                e.mo27096j(this.f19304a).mo238014c(new Function(e) {
                    /* class com.bytedance.ee.bear.drive.services.$$Lambda$m$SHi1TLrXYWKHumLAZ_5_zRcjhBs */
                    public final /* synthetic */ C6880a f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return C7189m.this.m28809b(this.f$1, (Boolean) obj);
                    }
                }).mo238014c(new Function() {
                    /* class com.bytedance.ee.bear.drive.services.$$Lambda$m$lyk6Ac8S4szipLOpoVrGcRyskU */

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        return C6880a.this.mo27093e();
                    }
                }).mo238001b($$Lambda$m$TbBjwwkwt9UFAfXnjhszHNlhyA0.INSTANCE, $$Lambda$m$6abNkrgMhkglhyKO0i2rZ3UGyuU.INSTANCE);
            }
            C6763e eVar = new C6763e();
            this.f19311h = eVar;
            eVar.mo26597a(application);
            m28817f();
            an anVar = (an) KoinJavaComponent.m268610a(an.class);
            if (anVar != null) {
                anVar.mo16399a(new DriveServiceImpl$2(this));
            }
            DriveSdkConfig.getConfig();
            this.f19309f = true;
            C13479a.m54764b("DriveServiceImpl", "DriveServiceImpl.lazyInit finish, cost time=" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: a */
    public void mo28171a(ConnectionService.NetworkState networkState) {
        if (this.f19307d != networkState.mo20041b()) {
            this.f19307d = networkState.mo20041b();
            mo28173e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ AbstractC70020b m28809b(C6880a aVar, Boolean bool) throws Exception {
        return aVar.mo27097k(this.f19304a);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public AbstractC68307f<Boolean> preloadFile(int i, ArrayList<DriveOfflineDoc> arrayList) {
        return this.f19308e.mo27836a(i, arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m28799a(boolean z, Boolean bool) throws Exception {
        C5102ai.m20872j().mo20209a(z);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m28802a(Integer num, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return AbstractC68307f.m265083a(num);
        }
        return AbstractC68307f.m265084a((Throwable) new DriveNoImportPermissionException());
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void execDriveSdkPreviewAction(String str, ArrayList<PreviewAction> arrayList) {
        C13479a.m54764b("DriveSdk", "DriveServiceImpl#execDriveSdkPreviewAction(), uniqueId=" + str + " ,actions=" + arrayList);
        if (arrayList != null) {
            try {
                Iterator<PreviewAction> it = arrayList.iterator();
                while (it.hasNext()) {
                    C6887a.m27207a().mo27121a(new C6887a.C6888a("drivesdk_preview_action", str, it.next()));
                }
            } catch (Exception e) {
                C13479a.m54759a("DriveSdk", "DriveServiceImpl#execDriveSdkPreviewAction() error=", e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m28803a(String str, Integer num) throws Exception {
        return C6476a.m26025b(str).mo238014c(new Function(num) {
            /* class com.bytedance.ee.bear.drive.services.$$Lambda$m$njOTYLvaFTXQ6Ly6_lAXchOL304 */
            public final /* synthetic */ Integer f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7189m.m28802a(this.f$0, (Boolean) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void registerUploadStateMonitor(String str, String str2, BinderIUploadStateMonitor binderIUploadStateMonitor) {
        ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35626a(str, str2, binderIUploadStateMonitor);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void showUploadStateView(String str, String str2, String str3) {
        Class cls;
        C13479a.m54764b("DriveServiceImpl", "DriveServiceImpl.showUploadStateView:  ");
        try {
            Application application = this.f19304a;
            if (C13595b.m55176a()) {
                cls = UploadListMainProcActivity.class;
            } else {
                cls = UploadListActivity.class;
            }
            Intent intent = new Intent(application, cls);
            Context g = m28818g();
            if (g instanceof Application) {
                intent.addFlags(268435456);
            }
            intent.putExtra("mount_node_token", str);
            intent.putExtra("mount_point", str2);
            intent.putExtra("space_id", str3);
            g.startActivity(intent);
        } catch (Exception e) {
            C13479a.m54759a("DriveServiceImpl", "showUploadStateView: ", e);
        }
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void downloadManualOfflineFile(boolean z, String str, BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, Bundle bundle) {
        ManualCacheDownloadManager manualCacheDownloadManager = this.f19310g;
        if (manualCacheDownloadManager == null) {
            C13479a.m54758a("DriveServiceImpl", "mManualCacheDownloadManager is null");
        } else {
            manualCacheDownloadManager.mo25444a(z, str, binderIDownloadDriveManualCacheCallback, bundle);
        }
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void uploadFile(String str, String str2, Bundle bundle, int i) {
        C13479a.m54764b("DriveServiceImpl", "DriveServiceImpl.uploadFile, mountPoint: " + str2);
        C6751d.m26612a(m28818g(), str, str2, bundle, i);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void uploadMedia(String str, String str2, Bundle bundle, int i) {
        C13479a.m54764b("DriveServiceImpl", "DriveServiceImpl.uploadMedia: mountPoint: " + str2);
        C6751d.m26613b(m28818g(), str, str2, bundle, i);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public String driveUpload(String str, String str2, String str3, String str4, int i, final BinderIUploadCallback binderIUploadCallback) {
        return ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35619a(new UploadRequestInfo.C9359a().mo35739a(str).mo35744c(str2).mo35745d(str3).mo35746e(str4).mo35735a(i).mo35737a(new UploadCallback() {
            /* class com.bytedance.ee.bear.drive.services.C7189m.C71966 */

            @Override // com.bytedance.ee.bear.middleground.drive.export.UploadCallback
            public boolean onFailed(String str, int i, String str2, long j) {
                return binderIUploadCallback.onFailed(str, i, str2);
            }

            @Override // com.bytedance.ee.bear.middleground.drive.export.UploadCallback
            public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7) {
                return binderIUploadCallback.updateProgress(str, status.value(), j, j2, str2, str3, str4, str5);
            }
        }).mo35741a());
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public String driveDownloadNormal(String str, String str2, int i, String str3, boolean z, long j, String str4, final BinderIDownloadCallback binderIDownloadCallback) {
        return ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35632b(new DownloadRequestInfo.C9355a().mo35671f(str).mo35662a(str2).mo35656a(i).mo35670e(str3).mo35663a(z).mo35657a(j).mo35673h(str4).mo35658a(new DownloadCallback() {
            /* class com.bytedance.ee.bear.drive.services.C7189m.C71955 */

            @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
            public boolean onFailed(String str, int i) {
                BinderIDownloadCallback binderIDownloadCallback = binderIDownloadCallback;
                if (binderIDownloadCallback == null) {
                    return false;
                }
                binderIDownloadCallback.onFailed(str, i);
                return false;
            }

            @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
            public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2) {
                BinderIDownloadCallback binderIDownloadCallback = binderIDownloadCallback;
                if (binderIDownloadCallback == null) {
                    return false;
                }
                binderIDownloadCallback.updateProgress(str, status.value(), j, j2, str2);
                return false;
            }
        }).mo35664a());
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public String driveDownload(String str, String str2, String str3, String str4, int i, String str5, int i2, String str6, int i3, int i4, int i5, String str7, boolean z, boolean z2, String str8, final BinderIDownloadCallback binderIDownloadCallback) {
        DownloadRequestInfo.C9355a a = new DownloadRequestInfo.C9355a().mo35662a(str).mo35666b(str2).mo35668c(str3).mo35669d(str4).mo35656a(i).mo35670e(str5).mo35659a(DownloadRequestInfo.DownloadType.fromInt(i2)).mo35672g(str6).mo35665b(i3).mo35667b(z2).mo35673h(str8).mo35658a(new DownloadCallback() {
            /* class com.bytedance.ee.bear.drive.services.C7189m.C71944 */

            @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
            public boolean onFailed(String str, int i) {
                BinderIDownloadCallback binderIDownloadCallback = binderIDownloadCallback;
                if (binderIDownloadCallback == null) {
                    return false;
                }
                binderIDownloadCallback.onFailed(str, i);
                return false;
            }

            @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
            public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2) {
                BinderIDownloadCallback binderIDownloadCallback = binderIDownloadCallback;
                if (binderIDownloadCallback == null) {
                    return false;
                }
                binderIDownloadCallback.updateProgress(str, status.value(), j, j2, str2);
                return false;
            }
        });
        if (i2 == DownloadRequestInfo.DownloadType.COVER.getValue()) {
            a.mo35660a(new DownloadRequestInfo.C9356b(i4, i5, str7, z));
        }
        return ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35618a(a.mo35664a());
    }
}
