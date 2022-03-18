package com.larksuite.component.openplatform.core.plugin.infra.storage.storage;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d;
import com.tt.miniapp.util.C67070z;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67699a;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"removeStorageSync"}, support = {AppType.GadgetAPP, AppType.WebGadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.storage.storage.h */
public class C24982h extends AbstractC65802d {
    public C24982h() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("removeStorageSync");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d
    /* renamed from: a */
    public ApiCallResult mo87217a(C67701b bVar) {
        String str = (String) bVar.mo234984a("key");
        if (TextUtils.isEmpty(str)) {
            return mo230497a(ApiCode.REMOVESTORAGE_KEY_ILLEGAL);
        }
        AppBrandLogger.m52830i("ApiHandler", "remove key:" + str);
        AbstractC12910a aVar = (AbstractC12910a) mo230473f().findServiceByInterface(AbstractC12910a.class);
        if (aVar.mo48697b(str) == null) {
            return mo230497a(ApiCode.REMOVESTORAGE_KEY_NOT_FOUND);
        }
        if (!aVar.mo48704d(str)) {
            return mo230497a(ApiCode.GENERAL_UNKONW_ERROR);
        }
        AbstractC67699a aVar2 = (AbstractC67699a) mo230473f().findServiceByInterface(AbstractC67699a.class);
        if (aVar2 != null) {
            aVar2.mo234978b(str);
        }
        long a = C67070z.m261383a(aVar.mo48694b(), true);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currentSize", a);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiHandler", e);
        }
        return mo230501a(jSONObject);
    }

    public C24982h(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
