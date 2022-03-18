package com.larksuite.component.openplatform.core.plugin.infra.storage.storage;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67699a;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@ApiSupportType(apiName = {"getStorageSync"}, support = {AppType.GadgetAPP, AppType.WebGadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.storage.storage.f */
public class C24980f extends AbstractC65802d {
    public C24980f() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getStorageSync");
    }

    /* renamed from: a */
    private void m90243a(String str) {
        AbstractC67699a aVar;
        if (!AppbrandApplicationImpl.getInst(this.f165819i).isMainJsLoadCompleted() && (aVar = (AbstractC67699a) this.f165819i.findServiceByInterface(AbstractC67699a.class)) != null) {
            aVar.mo234976a(str);
        }
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d
    /* renamed from: a */
    public ApiCallResult mo87217a(C67701b bVar) {
        try {
            AbstractC12910a aVar = (AbstractC12910a) mo230473f().findServiceByInterface(AbstractC12910a.class);
            String str = (String) bVar.mo234984a("key");
            if (TextUtils.isEmpty(str)) {
                return mo230497a(ApiCode.GETSTORAGE_KEY_ILLEGAL);
            }
            Object b = aVar.mo48697b(str);
            String c = aVar.mo48700c(str);
            AppBrandLogger.m52830i("ApiHandler", "key:" + str, "type:" + c);
            JSONObject jSONObject = new JSONObject();
            if (b == null) {
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "");
                jSONObject.put("dataType", "String");
                ApiCode apiCode = ApiCode.GETSTORAGE_KEY_NOT_FOUND;
                return mo230499a(apiCode.msg, apiCode.code, jSONObject);
            }
            m90243a(str);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, b);
            jSONObject.put("dataType", c);
            return mo230501a(jSONObject);
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiHandler", e);
            return mo230500a(e);
        }
    }

    public C24980f(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
