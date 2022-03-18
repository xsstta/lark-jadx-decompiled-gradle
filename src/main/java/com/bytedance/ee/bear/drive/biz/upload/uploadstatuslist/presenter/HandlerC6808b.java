package com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.presenter;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.drive.DriveCommonConstants;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.AbstractC6803c;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.C6801a;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.C6802b;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.C6804d;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.AbstractC6822d;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.presenter.b */
public class HandlerC6808b extends Handler {

    /* renamed from: a */
    public AbstractC6822d f18514a;

    /* renamed from: b */
    public AbstractC6803c f18515b;

    /* renamed from: c */
    public List<C6802b> f18516c;

    /* renamed from: d */
    public int f18517d = 1000;

    /* renamed from: e */
    private C6806a f18518e;

    /* renamed from: f */
    private List<C6802b> f18519f = new ArrayList();

    /* renamed from: g */
    private C68289a f18520g = new C68289a();

    /* renamed from: h */
    private DriveCommonConstants.DriveRustFgConfig f18521h;

    /* renamed from: i */
    private boolean f18522i;

    /* renamed from: h */
    public void mo26833h() {
        mo26823c();
    }

    /* renamed from: f */
    public void mo26830f() {
        this.f18518e.mo26811b();
    }

    /* renamed from: i */
    public void mo26835i() {
        this.f18520g.mo237935a();
    }

    /* renamed from: b */
    public void mo26819b() {
        sendMessage(Message.obtain(this, (int) HwBuildEx.VersionCodes.CUR_DEVELOPMENT));
    }

    /* renamed from: c */
    public void mo26823c() {
        sendMessage(Message.obtain(this, 10003));
    }

    /* renamed from: d */
    public void mo26826d() {
        sendMessage(Message.obtain(this, 10005));
    }

    /* renamed from: g */
    public void mo26832g() {
        this.f18518e.mo26813c();
        this.f18522i = false;
    }

    /* renamed from: e */
    public void mo26828e() {
        this.f18520g.mo237937a(AbstractC68307f.m265083a((Object) this.f18516c).mo238004b(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.presenter.$$Lambda$b$40PeTrTdhXeGEAoIEVqgHyW0nM */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return HandlerC6808b.this.m26871d((List) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<List<C6802b>>() {
            /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.presenter.HandlerC6808b.C68091 */

            /* renamed from: a */
            public void accept(List<C6802b> list) throws Exception {
                boolean z;
                AbstractC6822d dVar = HandlerC6808b.this.f18514a;
                if (HandlerC6808b.this.f18516c.size() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                dVar.mo26855a(z);
                HandlerC6808b.this.f18514a.mo26857c();
            }
        }, $$Lambda$b$e9PR9EfEUZgF6xVzcTWWjgDj2uI.INSTANCE));
    }

    /* renamed from: a */
    public void mo26814a() {
        this.f18516c.clear();
        List<DriveFile> a = this.f18518e.mo26807a();
        for (int i = 0; i < a.size(); i++) {
            DriveFile driveFile = a.get(i);
            int a2 = C6806a.m26854a(a.get(i).status.value());
            C13479a.m54764b("UpdateListTAG", "index= " + i + ", status= " + a2 + ", errorCode= " + driveFile.errorCode);
            this.f18515b.mo26804a(new C6802b(driveFile.fileName, a2, C13675f.m55534g(driveFile.path), driveFile.key, driveFile.errorCode));
        }
        this.f18514a.mo26854a(this.f18516c);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ List m26871d(List list) throws Exception {
        mo26814a();
        return list;
    }

    /* renamed from: f */
    public void mo26831f(C6801a aVar) {
        mo26815a(aVar);
    }

    /* renamed from: a */
    public void mo26817a(String str) {
        this.f18518e.mo26812b(str);
    }

    /* renamed from: a */
    public void mo26815a(C6801a aVar) {
        sendMessage(Message.obtain(this, 10004, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m26868a(Throwable th) throws Exception {
        C13479a.m54758a("UpdateListTAG", "delete specify item failed " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m26869b(Throwable th) throws Exception {
        C13479a.m54758a("UpdateListTAG", "clear all upload failed " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m26870c(Throwable th) throws Exception {
        C13479a.m54758a("UpdateListTAG", "delete complete item failed " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m26872d(Throwable th) throws Exception {
        C13479a.m54758a("UpdateListTAG", "update upload list failed " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m26873e(Throwable th) throws Exception {
        C13479a.m54758a("UpdateListTAG", "init upload list failed " + th);
    }

    /* renamed from: b */
    public void mo26820b(C6801a aVar) {
        sendMessage(Message.obtain(this, 10006, aVar));
    }

    /* renamed from: c */
    public void mo26824c(final C6801a aVar) {
        this.f18520g.mo237937a(AbstractC68307f.m265083a(aVar).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<C6801a>() {
            /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.presenter.HandlerC6808b.C68102 */

            /* renamed from: a */
            public void accept(C6801a aVar) throws Exception {
                C13479a.m54764b("UpdateListTAG", "update status key = " + aVar.mo26783c());
                HandlerC6808b bVar = HandlerC6808b.this;
                bVar.mo26825c(bVar.f18516c);
                HandlerC6808b.this.f18515b.mo26800a(aVar);
                HandlerC6808b.this.f18515b.mo26806b();
                HandlerC6808b.this.f18514a.mo26857c();
                HandlerC6808b.this.f18514a.mo26853a(aVar.mo26781a());
                if (aVar.mo26782b() == 4) {
                    C13479a.m54764b("UpdateListTAG", "dispatch delete message " + aVar.mo26783c());
                    HandlerC6808b bVar2 = HandlerC6808b.this;
                    bVar2.mo26821b(aVar, bVar2.f18517d);
                }
            }
        }, $$Lambda$b$Hc3YbT1bZG4OPLsN0vfu5wRCuG0.INSTANCE));
    }

    /* renamed from: d */
    public void mo26827d(C6801a aVar) {
        this.f18520g.mo237937a(AbstractC68307f.m265083a(aVar).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<C6801a>() {
            /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.presenter.HandlerC6808b.C68113 */

            /* renamed from: a */
            public void accept(C6801a aVar) throws Exception {
                if (SwipeMenuLayout.getViewCache() != null) {
                    SwipeMenuLayout.getViewCache().mo30347d();
                }
                HandlerC6808b.this.f18515b.mo26805b(aVar);
                HandlerC6808b.this.f18515b.mo26806b();
                HandlerC6808b bVar = HandlerC6808b.this;
                bVar.mo26825c(bVar.f18516c);
                HandlerC6808b.this.f18514a.mo26857c();
                if (HandlerC6808b.this.f18516c.size() == 0) {
                    HandlerC6808b.this.f18514a.mo26855a(false);
                    HandlerC6808b.this.f18514a.mo26856b(HandlerC6808b.this.f18516c);
                }
                C13479a.m54764b("UpdateListTAG", "delete = " + aVar.mo26783c());
            }
        }, $$Lambda$b$IfF0olyCZBbk7pQY2wuRDMBEeG8.INSTANCE));
    }

    /* renamed from: c */
    public void mo26825c(List<C6802b> list) {
        String d = this.f18514a.mo26858d();
        for (int i = 0; i < list.size(); i++) {
            C6802b bVar = list.get(i);
            if (TextUtils.equals(d, bVar.mo26796f())) {
                bVar.mo26788a(true);
            } else {
                bVar.mo26788a(false);
            }
        }
    }

    /* renamed from: e */
    public void mo26829e(C6801a aVar) {
        this.f18520g.mo237937a(AbstractC68307f.m265083a(aVar).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<C6801a>() {
            /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.presenter.HandlerC6808b.C68135 */

            /* renamed from: a */
            public void accept(C6801a aVar) throws Exception {
                boolean z;
                int a = HandlerC6808b.this.f18515b.mo26801a(aVar.mo26783c());
                C6801a a2 = HandlerC6808b.this.f18515b.mo26802a(a);
                if (a2.mo26782b() != 4) {
                    HandlerC6808b.this.mo26820b(a2);
                }
                HandlerC6808b.this.f18514a.mo26857c();
                AbstractC6822d dVar = HandlerC6808b.this.f18514a;
                if (HandlerC6808b.this.f18516c.size() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                dVar.mo26855a(z);
                HandlerC6808b.this.f18514a.mo26856b(HandlerC6808b.this.f18516c);
                C13479a.m54764b("UpdateListTAG", "delete item " + a);
            }
        }, $$Lambda$b$kRjmuPlOj_yaOytGG5_KpSdMl8g.INSTANCE));
    }

    /* renamed from: a */
    public void mo26818a(List<C6802b> list) {
        this.f18520g.mo237937a(AbstractC68307f.m265083a((Object) list).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<List<C6802b>>() {
            /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.presenter.HandlerC6808b.C68124 */

            /* renamed from: a */
            public void accept(List<C6802b> list) throws Exception {
                HandlerC6808b.this.mo26822b(list);
                HandlerC6808b.this.mo26826d();
                list.clear();
                HandlerC6808b.this.f18514a.mo26857c();
                HandlerC6808b.this.f18514a.mo26855a(false);
                HandlerC6808b.this.f18514a.mo26856b(list);
                C13479a.m54764b("UpdateListTAG", "cancel all upload");
            }
        }, $$Lambda$b$nF0ynht2f7b022Xt4qsaKXRCI.INSTANCE));
    }

    /* renamed from: b */
    public void mo26822b(List<C6802b> list) {
        this.f18519f.clear();
        this.f18519f.addAll(list);
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case HwBuildEx.VersionCodes.CUR_DEVELOPMENT /*{ENCODED_INT: 10000}*/:
                C13479a.m54764b("UpdateListTAG", "init ui data");
                mo26828e();
                return;
            case UpdateDialogStatusCode.DISMISS /*{ENCODED_INT: 10001}*/:
                C13479a.m54764b("UpdateListTAG", "update " + ((C6801a) message.obj).mo26783c() + " status :" + ((C6801a) message.obj).mo26782b());
                mo26824c((C6801a) message.obj);
                return;
            case UpdateDialogStatusCode.SHOW /*{ENCODED_INT: 10002}*/:
                C13479a.m54764b("UpdateListTAG", "upload complete then delete " + ((C6801a) message.obj).mo26783c() + " status :" + ((C6801a) message.obj).mo26782b());
                mo26827d((C6801a) message.obj);
                return;
            case 10003:
                C13479a.m54764b("UpdateListTAG", "cancel all upload");
                mo26818a(this.f18516c);
                return;
            case 10004:
                C13479a.m54764b("UpdateListTAG", "delete specified key: " + ((C6801a) message.obj).mo26783c());
                mo26829e((C6801a) message.obj);
                return;
            case 10005:
                this.f18518e.mo26810a(this.f18519f);
                return;
            case 10006:
                this.f18518e.mo26809a(((C6801a) message.obj).mo26783c());
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo26816a(C6801a aVar, int i) {
        sendMessageDelayed(Message.obtain(this, UpdateDialogStatusCode.DISMISS, aVar), (long) i);
    }

    /* renamed from: b */
    public void mo26821b(C6801a aVar, int i) {
        sendMessageDelayed(Message.obtain(this, UpdateDialogStatusCode.SHOW, aVar), (long) i);
    }

    public HandlerC6808b(Looper looper, AbstractC6822d dVar, C10917c cVar, String str, String str2, DriveCommonConstants.DriveRustFgConfig driveRustFgConfig, C7130c cVar2) {
        super(looper);
        this.f18514a = dVar;
        this.f18515b = new C6804d();
        this.f18518e = new C6806a(driveRustFgConfig, cVar, this, str, str2, cVar2);
        this.f18516c = this.f18515b.mo26803a();
        this.f18521h = driveRustFgConfig;
    }
}
