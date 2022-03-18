package com.bytedance.ee.bear.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.ee.bear.basesdk.AbstractC4463c;
import com.bytedance.ee.bear.basesdk.AbstractC4482e;
import com.bytedance.ee.bear.basesdk.apisupport.AbstractC4429o;
import com.bytedance.ee.bear.basesdk.apisupport.AbstractC4432r;
import com.bytedance.ee.bear.basesdk.apisupport.AbstractC4433s;
import com.bytedance.ee.bear.basesdk.apisupport.C4438x;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.editor.config.SdkLogConfig;
import com.bytedance.ee.bear.integrator.di.KoinSetupTask;
import com.bytedance.ee.bear.integrator.p400b.C7897c;
import com.bytedance.ee.bear.integrator.p400b.C7910d;
import com.bytedance.ee.bear.integrator.p407c.C7917a;
import com.bytedance.ee.bear.integrator.p408d.C7924b;
import com.bytedance.ee.bear.lark.p414b.AbstractC8008q;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.db.DBController;
import com.bytedance.ee.util.p699b.C13595b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13629i;
import java.util.Collections;
import org.koin.java.KoinJavaComponent;

public class DocsBaseTask extends BaseTask {
    /* renamed from: g */
    private void m47564g() {
        C13595b.m55175a(((AbstractC8008q) KoinJavaComponent.m268610a(AbstractC8008q.class)).mo31022a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m47563b(AbstractC4432r rVar) {
        if (rVar != null) {
            rVar.mo17161b();
        }
        C4438x.m18351c().mo17155b();
    }

    /* renamed from: a */
    private void m47562a(AbstractC4432r rVar) {
        C4438x.m18351c().mo17153a();
        if (rVar != null) {
            rVar.mo17160a();
        }
        C4438x.m18348a(new AbstractC4482e() {
            /* class com.bytedance.ee.bear.task.$$Lambda$DocsBaseTask$hZD_mhgttsGBxaEuN1oxkNnHVc0 */

            @Override // com.bytedance.ee.bear.basesdk.AbstractC4482e
            public final void onInit() {
                DocsBaseTask.m47563b(AbstractC4432r.this);
            }
        });
    }

    @Override // com.bytedance.ee.bear.task.BaseTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        try {
            AbstractC4429o e = C4438x.m18353e();
            m47561a(e.application(), e.docBaseConfig());
            AbstractC4433s dependency = e.dependency();
            C7910d.m31643a().add(dependency.mo17162a());
            KoinSetupTask.m31646a(context);
            KoinSetupTask.m31648b(context);
            C4438x.m18351c().mo17154a(dependency);
            m47564g();
            m47562a((AbstractC4432r) KoinJavaComponent.m268610a(AbstractC4432r.class));
            C7924b.m31660a();
            KoinJavaComponent.m268614a().mo246616a(Collections.singletonList(C7897c.m31642a(this.f30744a)));
            C4511g.m18589a(C4438x.m18353e().docBaseConfig());
            C4511g.m18590a(C4438x.m18353e().docDynamicConfig());
            boolean booleanValue = ((Boolean) new PersistenceSharedPreference("debug_config").mo34038b("database_encrypt", Boolean.TRUE)).booleanValue();
            DBController.m55314a().mo50587a(C4511g.m18595j().mo20227d().mo20246a());
            DBController.m55314a().mo50589a(booleanValue);
        } catch (Throwable th) {
            C13606d.m55246b("DocsBaseTask", th);
        }
        new C7917a().mo30745a(C13615c.f35773a, C4438x.m18351c().mo17156c(), true, new SdkLogConfig(context).mo30549a());
    }

    /* renamed from: a */
    private void m47561a(Application application, AbstractC4463c cVar) {
        C13615c.f35773a = application;
        C13629i.m55301a(cVar.mo17230a(application));
    }
}
