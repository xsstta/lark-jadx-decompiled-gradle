package com.bytedance.ee.bear.drive.biz.versions;

import android.content.Context;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.biz.versions.model.DriveVersionHistoryRecord;
import com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6905a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.versions.b */
public class C6840b extends AbstractC6905a<AbstractC6835a> {

    /* renamed from: a */
    private C68289a f18607a = new C68289a();

    /* renamed from: b */
    private VersionHistoryRepository f18608b = new VersionHistoryRepository((NetService) KoinJavaComponent.m268610a(NetService.class));

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d, com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6905a
    /* renamed from: f */
    public void mo25893f() {
        super.mo25893f();
        this.f18607a.mo237935a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m27009b(Throwable th) throws Exception {
        C13479a.m54761a("VersionOperationRecordPresenter", th);
        if (mo27153l()) {
            ((AbstractC6835a) mo27154m()).mo26879a(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27006a(NetService.Result result) throws Exception {
        if (mo27153l()) {
            if (result.getData() != null) {
                ((AbstractC6835a) mo27154m()).mo26881b(((DriveVersionHistoryRecord) result.getData()).isHasMore(), ((DriveVersionHistoryRecord) result.getData()).getList(), ((DriveVersionHistoryRecord) result.getData()).getUsers());
            } else {
                ((AbstractC6835a) mo27154m()).mo26881b(false, null, null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m27008b(NetService.Result result) throws Exception {
        if (mo27153l()) {
            if (result.getData() != null) {
                ((AbstractC6835a) mo27154m()).mo26880a(((DriveVersionHistoryRecord) result.getData()).isHasMore(), ((DriveVersionHistoryRecord) result.getData()).getList(), ((DriveVersionHistoryRecord) result.getData()).getUsers());
            } else {
                ((AbstractC6835a) mo27154m()).mo26880a(false, null, null);
            }
        }
    }

    public C6840b(Context context, C10917c cVar) {
        super(context);
    }

    /* renamed from: a */
    public void mo26899a(String str, long j) {
        this.f18607a.mo237937a(this.f18608b.mo26875a(str, 20, j).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.versions.$$Lambda$b$9xzE1vHPRKKkT6xfjdKQVDbmxA */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6840b.this.m27006a((C6840b) ((NetService.Result) obj));
            }
        }, $$Lambda$b$dK88Rt6a20b_NqJ2gel99kCVh0.INSTANCE));
    }

    /* renamed from: a */
    public void mo26900a(String str, boolean z) {
        if (z && mo27154m() != null) {
            ((AbstractC6835a) mo27154m()).mo26882e();
        }
        this.f18607a.mo237937a(this.f18608b.mo26875a(str, 20, 0).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.versions.$$Lambda$b$QVT9UwVrgPiWhEuCovb3Op_iSTw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6840b.this.m27008b((C6840b) ((NetService.Result) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.versions.$$Lambda$b$iBneGuNOw2h6TMLPrcv5LNAdJ4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6840b.this.m27009b((C6840b) ((Throwable) obj));
            }
        }));
    }
}
