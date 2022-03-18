package com.bytedance.ee.bear.task;

import android.content.Context;
import com.bytedance.ee.bear.assemble.config.OnBoardingMissionConfigs;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.onboarding.export.AbstractC10386a;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import com.bytedance.ee.bear.onboarding.p515b.C10380a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13629i;
import com.larksuite.framework.launch.task.ILaunchTask;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class DocsOnBoardingTask extends BaseAsyncLaunchTask {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DocsCentralTask.class);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47569a(AccountService.Account account) throws Exception {
        if (account != null) {
            m47571a(account.f14584a, account.f14591h);
        } else {
            C13606d.m55245a("DocsOnBoardingTask", new IllegalStateException("LocalAccountService findLoginUser account == null!"));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m47570a(AbstractC10386a aVar) throws Exception {
        C10380a aVar2 = new C10380a(C13615c.f35773a);
        for (Map.Entry<String, String> entry : OnBoardingMissionConfigs.m17823b().entrySet()) {
            if (!aVar.mo39517a(entry.getKey())) {
                aVar2.mo39535a(entry.getValue());
            }
        }
    }

    @Override // com.bytedance.ee.bear.task.BaseAsyncLaunchTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39508a(C13615c.f35773a, this.f30742a, OnBoardingMissionConfigs.m17822a());
        ((an) KoinJavaComponent.m268610a(an.class)).mo16405c().mo238018d(new Consumer() {
            /* class com.bytedance.ee.bear.task.$$Lambda$DocsOnBoardingTask$C8aLGsbRARtbNxH60T34vPFMpkA */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DocsOnBoardingTask.this.m47569a((DocsOnBoardingTask) ((AccountService.Account) obj));
            }
        });
    }

    /* renamed from: a */
    private void m47571a(String str, String str2) {
        ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39509a(str2, str);
        ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39510b();
        if (C13629i.m55308c()) {
            ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39520c().mo238001b($$Lambda$DocsOnBoardingTask$kkhCsCc2EbMYtfASB_tWta7b_No.INSTANCE, $$Lambda$DocsOnBoardingTask$P8EklznLOaFRiFdQ3RikYdbu1UU.INSTANCE);
        }
    }
}
