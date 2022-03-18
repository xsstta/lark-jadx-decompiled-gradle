package com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.presenter;

import com.bytedance.ee.bear.contract.drive.DriveCommonConstants;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.C6801a;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.C6802b;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.ProgressingEntity;
import com.bytedance.ee.bear.middleground.drive.export.UploadCallback;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.google.android.gms.common.ConnectionResult;
import io.reactivex.functions.Consumer;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.presenter.a */
public class C6806a {

    /* renamed from: a */
    public HandlerC6808b f18504a;

    /* renamed from: b */
    public C7130c f18505b;

    /* renamed from: c */
    private BinderIUploadStateMonitor f18506c;

    /* renamed from: d */
    private C10917c f18507d;

    /* renamed from: e */
    private String f18508e;

    /* renamed from: f */
    private String f18509f;

    /* renamed from: g */
    private int f18510g = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

    /* renamed from: h */
    private long f18511h;

    /* renamed from: i */
    private long f18512i;

    /* renamed from: j */
    private long f18513j;

    /* renamed from: a */
    public static int m26854a(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 4;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 1;
            default:
                return -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m26855a(AbstractC7184l lVar) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m26859c(AbstractC7184l lVar) throws Exception {
    }

    /* renamed from: a */
    public List<DriveFile> mo26807a() {
        return ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35621a(this.f18508e, this.f18509f);
    }

    /* renamed from: b */
    public void mo26811b() {
        this.f18506c = new RustUploadStatusMonitor$2(this);
        this.f18507d.mo41508c(AbstractC7184l.class).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.presenter.$$Lambda$a$y8B74lYxUBv38xJn_QKk7TwWGY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6806a.this.m26860d((AbstractC7184l) obj);
            }
        }).mo238001b($$Lambda$a$vQIfnsv8wcjvFe8Ze1n1m3WWbAE.INSTANCE, $$Lambda$a$ofDsTzlEvcIMJGROHAqAZfOM8A.INSTANCE);
    }

    /* renamed from: c */
    public void mo26813c() {
        this.f18507d.mo41508c(AbstractC7184l.class).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.presenter.$$Lambda$a$sRoz5iQYH085c3EStriRTXY9fOs */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6806a.this.m26857b((C6806a) ((AbstractC7184l) obj));
            }
        }).mo238001b($$Lambda$a$mI8ZVzKUWVpECexq1_YJmAcze_g.INSTANCE, $$Lambda$a$23cK27QzFkcqJ0plAnZUBJhRw5o.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m26857b(AbstractC7184l lVar) throws Exception {
        lVar.unRegisterUploadStateMonitor(this.f18506c);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m26860d(AbstractC7184l lVar) throws Exception {
        lVar.registerUploadStateMonitor(this.f18508e, this.f18509f, this.f18506c);
    }

    /* renamed from: b */
    public void mo26812b(String str) {
        ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35616a(str, new UploadCallback() {
            /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.presenter.C6806a.C68071 */

            @Override // com.bytedance.ee.bear.middleground.drive.export.UploadCallback
            public boolean onFailed(String str, int i, String str2, long j) {
                return false;
            }

            @Override // com.bytedance.ee.bear.middleground.drive.export.UploadCallback
            public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7) {
                boolean z;
                if (status == DriveFile.Status.SUCCESS) {
                    C6806a.this.f18505b.mo27945c(str2, str3);
                }
                if (status == DriveFile.Status.SUCCESS || status == DriveFile.Status.FAILED || status == DriveFile.Status.CANCEL) {
                    C7130c cVar = C6806a.this.f18505b;
                    if (status == DriveFile.Status.SUCCESS) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.mo27925a(str3, str, z, str2);
                }
                return false;
            }
        });
    }

    /* renamed from: a */
    public void mo26809a(String str) {
        ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35617a(new String[]{str});
        ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35615a(str);
    }

    /* renamed from: a */
    public void mo26810a(List<C6802b> list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35615a(list.get(i).mo26796f());
            strArr[i] = list.get(i).mo26796f();
        }
        ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35617a(strArr);
        list.clear();
    }

    /* renamed from: a */
    public void mo26808a(int i, ProgressingEntity progressingEntity, C6801a aVar) {
        if (i == 4) {
            C13479a.m54764b("UpdateListTAG", "name + " + C13598b.m55197d(progressingEntity.mo35701a()) + " status " + i + " progress " + progressingEntity.mo35707c());
            if (System.currentTimeMillis() > this.f18513j) {
                C13479a.m54764b("UpdateListTAG", "reset delay time");
                this.f18510g = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            }
            this.f18504a.mo26816a(aVar, this.f18510g);
            this.f18510g += 1000;
            this.f18513j = System.currentTimeMillis() + ((long) this.f18510g) + 500;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f18512i = currentTimeMillis;
        if (i == 1 || currentTimeMillis - this.f18511h >= 400 || progressingEntity.mo35707c() == 0) {
            C13479a.m54764b("UpdateListTAG", "name + " + C13598b.m55197d(progressingEntity.mo35701a()) + " status " + i + " progress " + progressingEntity.mo35707c());
            this.f18504a.mo26816a(aVar, 0);
        }
        this.f18511h = this.f18512i;
    }

    public C6806a(DriveCommonConstants.DriveRustFgConfig driveRustFgConfig, C10917c cVar, HandlerC6808b bVar, String str, String str2, C7130c cVar2) {
        this.f18507d = cVar;
        this.f18504a = bVar;
        this.f18508e = str;
        this.f18509f = str2;
        this.f18505b = cVar2;
    }
}
