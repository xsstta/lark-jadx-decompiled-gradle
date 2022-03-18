package com.larksuite.component.openplatform.core.plugin.infra.storage.storage;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.bytedance.ee.lark.infra.storage.sp.biz.SetValueIOException;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"setStorageSync"}, support = {AppType.GadgetAPP, AppType.WebGadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.storage.storage.j */
public class C24984j extends AbstractC65802d {
    public C24984j() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("setStorageSync");
    }

    /* renamed from: b */
    private AbstractC12910a m90252b() {
        return (AbstractC12910a) mo230473f().findServiceByInterface(AbstractC12910a.class);
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d
    /* renamed from: a */
    public ApiCallResult mo87217a(C67701b bVar) {
        try {
            String str = (String) bVar.mo234984a("key");
            if (TextUtils.isEmpty(str)) {
                return mo230497a(ApiCode.SETSTORAGE_KEY_ILLEGAL);
            }
            String str2 = (String) bVar.mo234984a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            String str3 = (String) bVar.mo234984a("dataType");
            if (DebugUtil.debug()) {
                AppBrandLogger.m52828d("ApiHandler", "key ", str, " \n value", str2, " \n dataType", str3);
            }
            AppBrandLogger.m52830i("ApiHandler", "key:" + str, "dataType:" + str3);
            AbstractC12910a b = m90252b();
            if (!b.mo48693a(str, str2, str3)) {
                return mo230498a(ApiCode.GENERAL_UNKONW_ERROR, "set storage fail");
            }
            long a = C67070z.m261383a(b.mo48694b(), true);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("currentSize", a);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("ApiHandler", e);
            }
            return mo230501a(jSONObject);
        } catch (SetValueIOException e2) {
            AppBrandLogger.m52829e("ApiHandler", e2);
            if (e2.getCode() == 10) {
                return mo230497a(ApiCode.SETSTORAGE_ITEM_STORAGE_EXCEED);
            }
            if (e2.getCode() == 20) {
                return mo230497a(ApiCode.SETSTORAGE_TOTAL_STORAGE_EXCEED);
            }
            return mo230498a(ApiCode.GENERAL_UNKONW_ERROR, e2.getMessage());
        }
    }

    public C24984j(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
