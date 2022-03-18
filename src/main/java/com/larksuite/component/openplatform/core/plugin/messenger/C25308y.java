package com.larksuite.component.openplatform.core.plugin.messenger;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"showActionSheet"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.y */
public class C25308y extends AbstractC65797c {
    public C25308y() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("showActionSheet");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        JSONArray jSONArray = (JSONArray) this.f165820j.mo234984a("itemList");
        if (jSONArray != null) {
            AppBrandLogger.m52830i("ShowActionSheetHandler", "item list length:" + jSONArray.length());
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String str = null;
                try {
                    str = jSONArray.getString(i);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() == 0) {
                mo230481a(ApiCode.SHOWACTIONSHEET_EMPTY_ITEM);
                AppBrandLogger.m52829e("ShowActionSheetHandler", "item list length: 0");
            } else if (arrayList.size() > 6) {
                mo230481a(ApiCode.SHOWACTIONSHEET_LIST_OVER_LIMIT);
                AppBrandLogger.m52829e("ShowActionSheetHandler", "item list length too big: length:" + arrayList.size());
            } else {
                new Handler(mo230473f().getApplicationContext().getMainLooper()).post(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.C25308y.RunnableC253091 */

                    public void run() {
                        Activity f = C25308y.this.mo230475h().mo235051f();
                        if (f == null) {
                            C25308y.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                            AppBrandLogger.m52829e("ShowActionSheetHandler", "activity is null");
                            return;
                        }
                        int size = arrayList.size();
                        String[] strArr = new String[size];
                        for (int i = 0; i < size; i++) {
                            strArr[i] = (String) arrayList.get(i);
                        }
                        C25308y.this.mo230475h().mo235026a(f, C25308y.this.f165820j.mo234988d(), strArr, new AbstractC67550j.AbstractC67551a<Integer>() {
                            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25308y.RunnableC253091.C253101 */

                            /* renamed from: a */
                            public void onNativeModuleCall(Integer num) {
                                int intValue = num.intValue();
                                if (intValue < 0) {
                                    C25308y.this.mo230481a(ApiCode.GENERAL_CANCEL);
                                    AppBrandLogger.m52829e("ShowActionSheetHandler", "native module call fail, result:" + intValue);
                                    return;
                                }
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("tapIndex", intValue);
                                    C25308y.this.mo230492b(jSONObject);
                                } catch (JSONException e) {
                                    C25308y.this.mo230481a(ApiCode.GENERAL_JSON_ERROR);
                                    AppBrandLogger.m52830i("ShowActionSheetHandler", "parse json fail", e);
                                }
                            }
                        });
                    }
                });
            }
        } else {
            mo230481a(ApiCode.SHOWACTIONSHEET_EMPTY_ITEM);
        }
    }

    public C25308y(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
