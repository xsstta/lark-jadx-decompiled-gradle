package com.larksuite.component.openplatform.core.plugin.ccm;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"docsPicker"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.ccm.b */
public class C24619b extends AbstractC65797c {
    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    public C24619b() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("docsPicker");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("LarkApiDocPicker", "invoke api");
        Activity f = mo230475h().mo235051f();
        if (f == null) {
            mo230482a(ApiCode.GENERAL_UNKONW_ERROR, "activity is null");
            AppBrandLogger.m52829e("LarkApiDocPicker", "current activity is null");
            return;
        }
        int intValue = ((Integer) bVar.mo234985a("maxNum", 10)).intValue();
        AppBrandLogger.m52830i("LarkApiDocPicker", "invoke startDocSelectActivity");
        mo230475h().mo235040b(f, 30002, intValue, (String) bVar.mo234985a("pickerTitle", f.getString(R.string.lark_brand_select_doc_title)), (String) bVar.mo234985a("pickerConfirm", f.getString(R.string.lark_brand_select_doc_confirm)));
    }

    public C24619b(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a, com.larksuite.framework.apiplugin.AbstractC25937e, com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        AppBrandLogger.m52830i("LarkApiDocPicker", "handleActivityResult, reqCode" + i + " resultCode" + i2);
        if (i == 30002) {
            if (i2 == 0 || intent == null) {
                mo230481a(ApiCode.GENERAL_CANCEL);
                return true;
            } else if (i2 == -1) {
                try {
                    JSONArray jSONArray = new JSONArray(intent.getStringExtra("extra_selected_data"));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("fileList", jSONArray);
                    mo230492b(jSONObject);
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("LarkApiDocPicker", e);
                    mo230481a(ApiCode.GENERAL_JSON_ERROR);
                }
                return true;
            }
        }
        return false;
    }
}
