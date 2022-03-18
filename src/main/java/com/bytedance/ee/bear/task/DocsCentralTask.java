package com.bytedance.ee.bear.task;

import android.content.Context;
import com.bytedance.ee.bear.basesdk.p250a.C4363k;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.externallink.AbstractC7648a;
import com.bytedance.ee.bear.integrator.C7874b;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.bytedance.ee.util.p701d.C13615c;
import com.facebook.react.modules.network.C21215c;
import com.facebook.react.modules.network.C21228i;
import com.larksuite.framework.launch.task.ILaunchTask;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import org.koin.java.KoinJavaComponent;

public class DocsCentralTask extends BaseTask {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DocsBaseTask.class);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ OkHttpClient m47566g() {
        return C12617b.m52365c().mo47928a().mo47917a(new Dispatcher(BearExecutors.m48467b())).mo47919a();
    }

    @Override // com.bytedance.ee.bear.task.BaseTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        C6313i.f17510b = C4511g.m18595j().mo20226c().mo20260a().mo20238a();
        C6313i.f17509a = C4511g.m18595j().mo20226c().f14832a;
        ((an) KoinJavaComponent.m268610a(an.class)).mo16400a(C4511g.m18595j().mo20227d());
        AbstractC7648a.m30631a(new C4363k());
        C21215c.m76974a($$Lambda$rOGLzyYu4nKlHnbfWQa4LSkxqFs.INSTANCE);
        C21228i.m77000a($$Lambda$DocsCentralTask$H7Q_5ChoDKx31pWAtArOJE8ySI.INSTANCE);
        C7874b.m31587a(C13615c.f35773a, this.f30744a);
    }
}
