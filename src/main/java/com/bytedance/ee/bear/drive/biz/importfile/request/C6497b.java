package com.bytedance.ee.bear.drive.biz.importfile.request;

import android.content.Context;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5205f;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.b */
public class C6497b {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m26080a(Context context, SimpleRequestResult simpleRequestResult) throws Exception {
        if (simpleRequestResult.code == 0) {
            Toast.showSuccessText(context, context.getString(R.string.Drive_Facade_Reminded), 0);
        } else {
            Toast.showFailureText(context, context.getString(R.string.Drive_Facade_OperateFailedNotify), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m26081a(Context context, Throwable th) throws Exception {
        Toast.showFailureText(context, context.getString(R.string.Drive_Facade_OperateFailedNotify), 0);
        C13479a.m54759a("NotifyAdministratorRequester", "executeRemindAdmin() error:", th);
    }

    /* renamed from: a */
    public void mo25990a(Context context, NetService netService) {
        NetService.AbstractC5075d a = netService.mo20117a(new C5205f());
        NetService.C5077f fVar = new NetService.C5077f("/api/explorer/lark/notifysuitebot/");
        fVar.mo20143a(2);
        a.mo20141a(fVar).mo238001b(new Consumer(context) {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$b$q_5okqur5JO3O2X0b0by0I7Msc */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6497b.m26080a(this.f$0, (SimpleRequestResult) obj);
            }
        }, new Consumer(context) {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$b$Yeg6BwJO3yhmXMnXeiaSTvtqqnY */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6497b.m26081a(this.f$0, (Throwable) obj);
            }
        });
    }
}
