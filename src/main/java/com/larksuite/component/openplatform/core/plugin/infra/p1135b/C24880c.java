package com.larksuite.component.openplatform.core.plugin.infra.p1135b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.api.ConnectionResult;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@ApiSupportType(apiName = {"prepareLocalFaceVerify"}, support = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.b.c */
public class C24880c extends AbstractC24877a {

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.infra.b.c$a */
    public static class C24883a<T> {

        /* renamed from: a */
        private T f61041a;

        /* renamed from: a */
        public T mo87935a() {
            return this.f61041a;
        }

        /* renamed from: a */
        public void mo87936a(T t) {
            this.f61041a = t;
        }
    }

    public C24880c() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("prepareLocalFaceVerify");
    }

    @Override // com.larksuite.component.openplatform.core.plugin.infra.p1135b.AbstractC24877a
    /* renamed from: b */
    public void mo87934b() {
        mo87930a(C67501b.bf).flush();
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("OfflineFaceVerifyPrepare", "handle api " + mo230472e());
        m90052a((long) ((Integer) bVar.mo234985a("timeout", 30)).intValue());
    }

    /* renamed from: a */
    private void m90052a(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        CrossProcessDataEntity b = CrossProcessDataEntity.C67574a.m263013a().mo234760a("app_id", (Object) C67432a.m262319a(mo230473f()).getAppInfo().appId).mo234763b();
        final C24883a aVar = new C24883a();
        C67560a.m262959a("face_offline_prepare", b, new AbstractC67565b() {
            /* class com.larksuite.component.openplatform.core.plugin.infra.p1135b.C24880c.C248811 */

            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
            /* renamed from: a */
            public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                AppBrandLogger.m52830i("OfflineFaceVerifyPrepare", "OfflineFaceVerifyPrepare getIpcCallback");
                if (crossProcessDataEntity == null) {
                    aVar.mo87936a(C24880c.this.mo87931a(false, -1, "callbackData is null"));
                } else {
                    aVar.mo87936a(crossProcessDataEntity);
                }
                countDownLatch.countDown();
            }
        });
        Observable.create(new Action() {
            /* class com.larksuite.component.openplatform.core.plugin.infra.p1135b.C24880c.C248822 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                try {
                    countDownLatch.await(j, TimeUnit.SECONDS);
                    CrossProcessDataEntity crossProcessDataEntity = (CrossProcessDataEntity) aVar.mo87935a();
                    if (crossProcessDataEntity == null) {
                        AppBrandLogger.m52829e("OfflineFaceVerifyPrepare", "OfflineFaceVerifyPrepare timeout , timeout =  " + j);
                        crossProcessDataEntity = C24880c.this.mo87931a(false, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, "offline_prepare_timeout");
                    }
                    C24880c.this.mo87933a(crossProcessDataEntity);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    public C24880c(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    @Override // com.larksuite.component.openplatform.core.plugin.infra.p1135b.AbstractC24877a
    /* renamed from: a */
    public void mo87932a(int i, String str, JSONObject jSONObject) {
        mo87930a(C67501b.bg).setErrorCode(String.valueOf(i)).setErrorMessage(str).flush();
    }
}
