package com.bytedance.ee.ref.card.api;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.card.p687b.C13522b;
import com.larksuite.component.openplatform.core.utils.C25528c;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25890a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.lynx.jsbridge.LynxContextModule;
import com.lynx.jsbridge.LynxMethod;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67700a;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3401a.p3402a.C67704c;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONObject;

public class CardAPIModule extends LynxContextModule {
    private IAppContext mCardAppContext;
    public Executor mExecutor = Executors.newSingleThreadExecutor();

    public CardAPIModule(AbstractC26684l lVar, Object obj) {
        super(lVar, obj);
        if (obj instanceof IAppContext) {
            IAppContext iAppContext = (IAppContext) obj;
            this.mCardAppContext = iAppContext;
            C13522b bVar = (C13522b) iAppContext.getExtra();
            if (bVar != null) {
                bVar.mo50276a(lVar);
            }
        }
    }

    @LynxMethod
    public String invoke(final String str, ReadableMap readableMap, final Callback callback) {
        AppBrandLogger.m52830i("card_app_api", String.format("invoke apiName: %s", str));
        C67700a a = ((AbstractC67709b) this.mCardAppContext.findServiceByInterface(AbstractC67709b.class)).mo235011a(C67701b.C67703a.m263358a(str, new C67704c(readableMap)).mo234994a(AppType.CardAPP).mo234992a(new AbstractC65805h() {
            /* class com.bytedance.ee.ref.card.api.CardAPIModule.C135152 */

            @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h
            public void callback(ApiCallResult apiCallResult) {
                Callback callback = callback;
                if (callback != null) {
                    callback.invoke(apiCallResult.toString());
                }
            }
        }).mo234993a(new AbstractC65806i() {
            /* class com.bytedance.ee.ref.card.api.CardAPIModule.C135141 */

            @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i
            public void executeAsyncApiHandle(String str, Runnable runnable) {
                CardAPIModule.this.mExecutor.execute(runnable);
            }
        }).mo234996a());
        if (a.mo234981a()) {
            ApiCallResult b = a.mo234982b();
            if (b == null) {
                return CharacterUtils.empty();
            }
            return b.toString();
        }
        try {
            LKEvent a2 = new LKEvent.C25888a().mo92168a(str).mo92169a(new C67704c(readableMap).mo235000b()).mo92162a(this.mCardAppContext.getCurrentActivity()).mo92171a();
            a2.mo92119a((AbstractC25890a) new AbstractC25890a() {
                /* class com.bytedance.ee.ref.card.api.CardAPIModule.C135163 */

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25890a
                public void executeAsyncApiHandle(String str, Runnable runnable) {
                    CardAPIModule.this.mExecutor.execute(runnable);
                }
            });
            a2.mo92122a((AbstractC25894e) new AbstractC25894e() {
                /* class com.bytedance.ee.ref.card.api.CardAPIModule.C135174 */

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
                /* renamed from: a */
                public void mo48104a(int i, JSONObject jSONObject) {
                    Callback callback = callback;
                    if (callback != null) {
                        callback.invoke(ApiCallResult.Builder.createOk(str).responseData(jSONObject).build().toString());
                    }
                }

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
                /* renamed from: a */
                public void mo48103a(int i, int i2, JSONObject jSONObject) {
                    Callback callback = callback;
                    if (callback != null) {
                        callback.invoke(ApiCallResult.Builder.createFail(str).responseData(jSONObject).errorCode(i2).build().toString());
                    }
                }
            });
            LKBasePluginResult sendEvent = this.mCardAppContext.sendEvent(a2);
            if (sendEvent.mo92268d()) {
                return C25528c.m91124a(sendEvent, str);
            }
        } catch (Throwable th) {
            AppBrandLogger.m52829e("card_app_api", "JSONException", th);
        }
        AppBrandLogger.m52829e("card_app_api", String.format("api %s is not support", str));
        return null;
    }
}
