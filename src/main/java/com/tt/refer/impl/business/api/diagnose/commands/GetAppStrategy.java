package com.tt.refer.impl.business.api.diagnose.commands;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.impl.business.api.diagnose.AbstractC67885a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/tt/refer/impl/business/api/diagnose/commands/GetAppStrategy;", "Lcom/tt/refer/impl/business/api/diagnose/AbsDebugCommand;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "execute", "Lorg/json/JSONObject;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "params", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.api.diagnose.a.e */
public final class GetAppStrategy extends AbstractC67885a {

    /* renamed from: a */
    private final String f170970a = "GetAppStrategy";

    /* renamed from: b */
    public final String mo235515b() {
        return this.f170970a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/tt/refer/impl/business/api/diagnose/commands/GetAppStrategy$execute$1$1", "Lcom/tt/refer/abs/host/IHostService$AppStateCallback;", "onError", "", "errorCode", "", "onSuccess", "state", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.api.diagnose.a.e$a */
    public static final class C67886a implements AbstractC67724a.AbstractC67725a {

        /* renamed from: a */
        final /* synthetic */ GetAppStrategy f170971a;

        /* renamed from: b */
        final /* synthetic */ String f170972b;

        /* renamed from: c */
        final /* synthetic */ Ref.IntRef f170973c;

        /* renamed from: d */
        final /* synthetic */ CountDownLatch f170974d;

        @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a.AbstractC67725a
        /* renamed from: a */
        public void mo235097a(int i) {
            this.f170973c.element = i;
            String b = this.f170971a.mo235515b();
            AppBrandLogger.m52830i(b, "appId " + this.f170972b + ", state " + i);
            this.f170974d.countDown();
        }

        @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a.AbstractC67725a
        /* renamed from: a */
        public void mo235098a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "errorCode");
            String b = this.f170971a.mo235515b();
            AppBrandLogger.m52829e(b, "get appState err " + str);
            this.f170974d.countDown();
        }

        C67886a(GetAppStrategy eVar, String str, Ref.IntRef intRef, CountDownLatch countDownLatch) {
            this.f170971a = eVar;
            this.f170972b = str;
            this.f170973c = intRef;
            this.f170974d = countDownLatch;
        }
    }

    @Override // com.tt.refer.impl.business.api.diagnose.AbstractC67885a
    /* renamed from: a */
    public JSONObject mo235512a(IAppContext iAppContext, JSONObject jSONObject) {
        String optString;
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        if (jSONObject == null || (optString = jSONObject.optString("app_id")) == null) {
            AppBrandLogger.m52829e(this.f170970a, "appId is empty");
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50447a(optString, new C67886a(this, optString, intRef, countDownLatch));
        countDownLatch.await();
        if (intRef.element != -1) {
            return new JSONObject().put("appState", intRef.element);
        }
        String str = this.f170970a;
        AppBrandLogger.m52830i(str, "failed to get appStrategy for " + optString + ", appState: " + intRef.element);
        return null;
    }
}
