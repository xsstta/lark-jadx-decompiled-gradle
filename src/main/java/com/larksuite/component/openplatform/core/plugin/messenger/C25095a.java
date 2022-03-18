package com.larksuite.component.openplatform.core.plugin.messenger;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.ext.AbstractC67619e;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.a */
public class C25095a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "showActionSheet";
    }

    public C25095a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            JSONArray optJSONArray = new JSONObject(this.mArgs).optJSONArray("itemList");
            if (optJSONArray != null) {
                final ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String string = optJSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
                if (arrayList.size() == 0) {
                    callbackFail("itemList不能为空");
                } else if (arrayList.size() > 6) {
                    callbackFail("param.itemList should has at most 6 items");
                } else {
                    AppbrandContext.getMainHandler().post(new Runnable() {
                        /* class com.larksuite.component.openplatform.core.plugin.messenger.C25095a.RunnableC250961 */

                        public void run() {
                            Activity currentActivity = C25095a.this.getAppContext().getCurrentActivity();
                            if (currentActivity == null) {
                                C25095a.this.callbackFail("MiniAppActivity is null");
                                return;
                            }
                            int size = arrayList.size();
                            String[] strArr = new String[size];
                            for (int i = 0; i < size; i++) {
                                strArr[i] = (String) arrayList.get(i);
                            }
                            HostDependManager.getInst().showActionSheet(currentActivity, C25095a.this.mArgs, strArr, new AbstractC67550j.AbstractC67551a<Integer>() {
                                /* class com.larksuite.component.openplatform.core.plugin.messenger.C25095a.RunnableC250961.C250971 */

                                /* renamed from: a */
                                public void onNativeModuleCall(Integer num) {
                                    int intValue = num.intValue();
                                    if (intValue < 0) {
                                        C25095a.this.callbackFail("cancel");
                                        return;
                                    }
                                    HashMap<String, Object> hashMap = new HashMap<>();
                                    hashMap.put("tapIndex", Integer.valueOf(intValue));
                                    C25095a.this.callbackOk(hashMap);
                                }
                            }, C25095a.this.getAppContext());
                        }
                    });
                }
            } else {
                callbackFail("itemList is empty");
            }
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "tma_ApiActionSheetCtrl", e.getStackTrace());
            callbackFail(e);
        }
    }

    public C25095a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
