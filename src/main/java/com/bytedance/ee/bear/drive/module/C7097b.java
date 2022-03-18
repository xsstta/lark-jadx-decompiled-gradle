package com.bytedance.ee.bear.drive.module;

import android.os.Bundle;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.drive.DriveOfflineDoc;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.drive.loader.download.platform.api.C7058b;
import com.bytedance.ee.bear.drive.loader.download.platform.api.drive.FileInfoV1Puller;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.module.b */
public class C7097b implements AbstractC4967c {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m28364a(AbstractC7184l lVar) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m28374b(AbstractC7184l lVar) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m28378c(AbstractC7184l lVar) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m28380d(AbstractC7184l lVar) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m28382e(AbstractC7184l lVar) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m28384f(AbstractC7184l lVar) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m28386g(AbstractC7184l lVar) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m28388h(AbstractC7184l lVar) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m28390i(AbstractC7184l lVar) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m28392j(AbstractC7184l lVar) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m28394k(AbstractC7184l lVar) throws Exception {
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo19647a(long j) {
        return ar.m20936a().mo41508c(AbstractC7184l.class).mo238014c(new Function(j) {
            /* class com.bytedance.ee.bear.drive.module.$$Lambda$b$fX3xnga93LGvMbpMF0S4QtMgbPA */
            public final /* synthetic */ long f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((AbstractC7184l) obj).cleanDriveCacheFlowable(this.f$0);
            }
        });
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo19645a() {
        return ar.m20936a().mo41508c(AbstractC7184l.class).mo238014c($$Lambda$L0YNC40eIovLG6ZLGh6ds7xhSk4.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: a */
    public void mo19650a(Bundle bundle) {
        ar.m20936a().mo41508c(AbstractC7184l.class).mo238001b(new Consumer(bundle) {
            /* class com.bytedance.ee.bear.drive.module.$$Lambda$b$diEykEl4Tso4uKJOavuM2KNBoQ */
            public final /* synthetic */ Bundle f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC7184l) obj).openDriveTestActivity(this.f$0);
            }
        }, $$Lambda$b$_GsqASRZCiwYmAgr9X8kjzxi69I.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: a */
    public void mo19654a(String str, String str2, Bundle bundle, int i) {
        ar.m20936a().mo41508c(AbstractC7184l.class).mo238005b((Consumer) new Consumer(str, str2, bundle, i) {
            /* class com.bytedance.ee.bear.drive.module.$$Lambda$b$dN8J7VT03Wmp3c0ZKlYDjkKNRA */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ Bundle f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC7184l) obj).uploadFile(this.f$0, this.f$1, this.f$2, this.f$3);
            }
        }).mo238001b($$Lambda$b$vis8MZxV_5jbN7OmdDzQ8AibhiI.INSTANCE, $$Lambda$b$abY7pbyg5fjoVIa1m0ne4Fzru0.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo19646a(int i, ArrayList<DriveOfflineDoc> arrayList) {
        return ar.m20936a().mo41508c(AbstractC7184l.class).mo238014c(new Function(i, arrayList) {
            /* class com.bytedance.ee.bear.drive.module.$$Lambda$b$spYRn8Kla29Sh1lFytkmBT3krpc */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ ArrayList f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((AbstractC7184l) obj).preloadFile(this.f$0, this.f$1);
            }
        });
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: a */
    public void mo19652a(BinderIUploadStateMonitor binderIUploadStateMonitor) {
        ar.m20936a().mo41508c(AbstractC7184l.class).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.drive.module.$$Lambda$b$B3IsJvK6s86okCPgj_gT9LBxUZk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC7184l) obj).unRegisterUploadStateMonitor(BinderIUploadStateMonitor.this);
            }
        }).mo238001b($$Lambda$b$FD6CQ3UAmnYQ3EtRhdoEn9HS2XM.INSTANCE, $$Lambda$b$0DSknS8GhAC7BpqAsWxNuusY.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: a */
    public void mo19655a(String str, String str2, BinderIUploadStateMonitor binderIUploadStateMonitor) {
        ar.m20936a().mo41508c(AbstractC7184l.class).mo238005b((Consumer) new Consumer(str, str2, binderIUploadStateMonitor) {
            /* class com.bytedance.ee.bear.drive.module.$$Lambda$b$QvCDtH8aasiiMTlWJt8J3OgDZ7s */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ BinderIUploadStateMonitor f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC7184l) obj).registerUploadStateMonitor(this.f$0, this.f$1, this.f$2);
            }
        }).mo238001b($$Lambda$b$xwPqFaRp35A_76OlHKCutzZpIFw.INSTANCE, $$Lambda$b$MMikB4fJVXshRq_utdyyv2tv_ug.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: a */
    public void mo19656a(String str, String str2, String str3) {
        ar.m20936a().mo41508c(AbstractC7184l.class).mo238005b((Consumer) new Consumer(str, str2, str3) {
            /* class com.bytedance.ee.bear.drive.module.$$Lambda$b$YPQlSaUmT5Ba3wuLhiycE29532o */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC7184l) obj).showUploadStateView(this.f$0, this.f$1, this.f$2);
            }
        }).mo238001b($$Lambda$b$5HgmhtKBcsXbNlt6rXTGmRrL5rY.INSTANCE, $$Lambda$b$hoy9qScT7I9uhGvKLtwpebRUpTQ.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: a */
    public void mo19651a(ImportFileEntity importFileEntity) {
        ar.m20936a().mo41508c(AbstractC7184l.class).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.drive.module.$$Lambda$b$tgrdQh3ByNM0Nwh0CvpgL_Pufs */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC7184l) obj).requestImport(ImportFileEntity.this);
            }
        }).mo238001b($$Lambda$b$JEyEAnSK_jT910bn7qLl679kK2o.INSTANCE, $$Lambda$b$pdJ0AchS3cwyp_AG3eSS65swpBA.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: a */
    public void mo19653a(String str) {
        ar.m20936a().mo41508c(AbstractC7184l.class).mo238005b((Consumer) new Consumer(str) {
            /* class com.bytedance.ee.bear.drive.module.$$Lambda$b$KPLZGEp23IWkSdNwZ8x7FKKi6hs */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC7184l) obj).requestPreviewUsingPlatformCapability(this.f$0);
            }
        }).mo238001b($$Lambda$b$d4xA8km0NQhLhdfzU8XmhcrQKYw.INSTANCE, $$Lambda$b$gOrTGbgHHvhlCw6ZaY4BhpHd_BQ.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: a */
    public void mo19658a(boolean z, String str, AbstractC4967c.AbstractC4968a aVar, Bundle bundle) {
        ar.m20936a().mo41508c(AbstractC7184l.class).mo238005b((Consumer) new Consumer(z, str, aVar, bundle) {
            /* class com.bytedance.ee.bear.drive.module.$$Lambda$b$Ni0PClypU9WlOpCsxZWJHSMfrxM */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ AbstractC4967c.AbstractC4968a f$3;
            public final /* synthetic */ Bundle f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7097b.this.m28372a((C7097b) this.f$1, (boolean) this.f$2, (String) this.f$3, (AbstractC4967c.AbstractC4968a) this.f$4, (Bundle) ((AbstractC7184l) obj));
            }
        }).mo238001b($$Lambda$b$ls1rif4aFLcwuEQOl3uY7EPozIQ.INSTANCE, $$Lambda$b$qCWn0D72S4niYyIiqGdEDuAdw.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28372a(boolean z, String str, AbstractC4967c.AbstractC4968a aVar, Bundle bundle, AbstractC7184l lVar) throws Exception {
        lVar.downloadManualOfflineFile(z, str, new DriveInterfaceImpl$1(this, aVar), bundle);
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: a */
    public String mo19649a(DownloadRequestInfo downloadRequestInfo) {
        try {
            return (String) ar.m20936a().mo41508c(AbstractC7184l.class).mo238020d(new Function(downloadRequestInfo) {
                /* class com.bytedance.ee.bear.drive.module.$$Lambda$b$qaDGoG9ML2NeGqylh5p_t4RFo5A */
                public final /* synthetic */ DownloadRequestInfo f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C7097b.this.m28373b(this.f$1, (AbstractC7184l) obj);
                }
            }).mo238023d();
        } catch (Exception e) {
            C13479a.m54761a("DriveInterfaceImpl", e);
            return "";
        }
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: a */
    public void mo19657a(ArrayList<String> arrayList) {
        ar.m20936a().mo41508c(AbstractC7184l.class).mo238005b((Consumer) new Consumer(arrayList) {
            /* class com.bytedance.ee.bear.drive.module.$$Lambda$b$OxtO5Re8WzFdJDXSfU1H7Krsswg */
            public final /* synthetic */ ArrayList f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC7184l) obj).driveCancelDownload(this.f$0);
            }
        }).mo238001b($$Lambda$b$6cq_9e_SipieHNHuDWxG5FozMas.INSTANCE, $$Lambda$b$XMmmky3Xii9YI3AT0k4yAxnMguQ.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: a */
    public AbstractC68307f<Long> mo19648a(String str, String str2) {
        return C7058b.m28085a((NetService) KoinJavaComponent.m268610a(NetService.class)).mo26542a(new FileInfoV1Puller.Params(str, null, str2, null, null, null)).mo238004b(C11678b.m48478b()).mo237985a(C11678b.m48481e()).mo238020d($$Lambda$b$uP5GtxeBpcdShX5_3fiB3Gg6glc.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: b */
    public void mo19660b() {
        ar.m20936a().mo41508c(AbstractC7184l.class).mo238005b((Consumer) $$Lambda$b$4UbQp5GbJRlAeirgAWwo6WyE.INSTANCE).mo238001b($$Lambda$b$hysPdnJLtCP_Jacn4Retl7qaY.INSTANCE, $$Lambda$b$ObFFAfbnp4fq2Rv6yxmrZkYEEko.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Long m28358a(C7086a aVar) throws Exception {
        return Long.valueOf(aVar.mo27322a().f18787c);
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: b */
    public String mo19659b(DownloadRequestInfo downloadRequestInfo) {
        try {
            return (String) ar.m20936a().mo41508c(AbstractC7184l.class).mo238020d(new Function(downloadRequestInfo) {
                /* class com.bytedance.ee.bear.drive.module.$$Lambda$b$vlE8jVWBdSdIjjvt6ics05TNeHY */
                public final /* synthetic */ DownloadRequestInfo f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C7097b.this.m28359a(this.f$1, (AbstractC7184l) obj);
                }
            }).mo238023d();
        } catch (Exception e) {
            C13479a.m54761a("DriveInterfaceImpl", e);
            return "";
        }
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: b */
    public void mo19661b(String str) {
        ar.m20936a().mo41508c(AbstractC7184l.class).mo238005b((Consumer) new Consumer(str) {
            /* class com.bytedance.ee.bear.drive.module.$$Lambda$b$QA3naTuNwxQvx6nngLfxZdVRoE */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC7184l) obj).cancelManualOfflineFile(this.f$0);
            }
        }).mo238001b($$Lambda$b$STxXSMJ6nEU46biHjkuPaXYf8xE.INSTANCE, $$Lambda$b$FyT0n_LV3NJDlKA7VbY4VTsw6OQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m28359a(DownloadRequestInfo downloadRequestInfo, AbstractC7184l lVar) throws Exception {
        return lVar.driveDownloadNormal(downloadRequestInfo.f25116h, downloadRequestInfo.f25109a, downloadRequestInfo.f25113e, downloadRequestInfo.f25114f, downloadRequestInfo.f25118j, downloadRequestInfo.f25117i, downloadRequestInfo.f25124p, new DriveInterfaceImpl$3(this, downloadRequestInfo));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ String m28373b(DownloadRequestInfo downloadRequestInfo, AbstractC7184l lVar) throws Exception {
        int i;
        int i2;
        String str;
        boolean z;
        DownloadRequestInfo.C9356b bVar = downloadRequestInfo.f25122n;
        if (bVar != null) {
            i = bVar.f25142a;
        } else {
            i = 1280;
        }
        if (bVar != null) {
            i2 = bVar.f25143b;
        } else {
            i2 = 1280;
        }
        if (bVar != null) {
            str = bVar.f25144c;
        } else {
            str = "equal";
        }
        if (bVar != null) {
            z = bVar.f25145d;
        } else {
            z = true;
        }
        return lVar.driveDownload(downloadRequestInfo.f25109a, downloadRequestInfo.f25110b, downloadRequestInfo.f25111c, downloadRequestInfo.f25112d, downloadRequestInfo.f25113e, downloadRequestInfo.f25114f, downloadRequestInfo.f25115g.getValue(), downloadRequestInfo.f25119k, downloadRequestInfo.f25120l, i, i2, str, z, downloadRequestInfo.f25123o, downloadRequestInfo.f25124p, new DriveInterfaceImpl$2(this, downloadRequestInfo));
    }

    @Override // com.bytedance.ee.bear.AbstractC4967c
    /* renamed from: b */
    public void mo19662b(String str, String str2, Bundle bundle, int i) {
        ar.m20936a().mo41508c(AbstractC7184l.class).mo238005b((Consumer) new Consumer(str, str2, bundle, i) {
            /* class com.bytedance.ee.bear.drive.module.$$Lambda$b$2PXNSKFlptiGvohmKxD0JczZVMc */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ Bundle f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC7184l) obj).uploadMedia(this.f$0, this.f$1, this.f$2, this.f$3);
            }
        }).mo238001b($$Lambda$b$ireNAvkf3Jkj57zc8sjK58nFKGo.INSTANCE, $$Lambda$b$oDE1HZsz4j8GluEwIJ5uIKXk_g.INSTANCE);
    }
}
