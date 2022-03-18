package com.larksuite.component.openplatform.core.plugin.messenger;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.validator.format.Max;
import com.larksuite.framework.apiplugin.validator.format.Min;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapphost.AbstractC67550j;
import java.util.ArrayList;
import java.util.List;

public class ShowActionSheetHandlerPlugin extends OPPlugin {

    public static class ShowActionSheetHandlerRequest extends C25920a {
        @LKRequiredParam
        @Max(value = 6.0d, warning = "item list length too big")
        @Min(value = 1.0d, warning = "item list length: 0")
        @JSONField(name = "itemList")
        public List<String> mItemList;
    }

    public static class ShowActionSheetHandlerResponse extends C25921b {
        @JSONField(name = "tapIndex")
        public int mTapIndex;
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"showActionSheet"})
    public void showActionSheetAsync(final ShowActionSheetHandlerRequest showActionSheetHandlerRequest, final AbstractC25897h<ShowActionSheetHandlerResponse> hVar, final AbstractC25895f fVar) {
        final ShowActionSheetHandlerResponse showActionSheetHandlerResponse = new ShowActionSheetHandlerResponse();
        List<String> list = showActionSheetHandlerRequest.mItemList;
        if (list != null) {
            ILogger b = fVar.mo92190b();
            b.mo92224i("ShowActionSheetHandlerPlugin", "item list length:" + list.size());
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                String str = null;
                try {
                    str = list.get(i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
            new Handler(getAppContext().getApplicationContext().getMainLooper()).post(new Runnable() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.ShowActionSheetHandlerPlugin.RunnableC250901 */

                public void run() {
                    Activity f = ShowActionSheetHandlerPlugin.this.getApiDependency().mo235051f();
                    if (f == null) {
                        ShowActionSheetHandlerPlugin.this.fillFailedResponse(showActionSheetHandlerResponse, C25906a.f64080j, "activity is null");
                        hVar.callback(showActionSheetHandlerResponse);
                        fVar.mo92190b().mo92223e("ShowActionSheetHandlerPlugin", "activity is null");
                        return;
                    }
                    int size = arrayList.size();
                    String[] strArr = new String[size];
                    for (int i = 0; i < size; i++) {
                        strArr[i] = (String) arrayList.get(i);
                    }
                    ShowActionSheetHandlerPlugin.this.getApiDependency().mo235026a(f, showActionSheetHandlerRequest.toString(), strArr, new AbstractC67550j.AbstractC67551a<Integer>() {
                        /* class com.larksuite.component.openplatform.core.plugin.messenger.ShowActionSheetHandlerPlugin.RunnableC250901.C250911 */

                        /* renamed from: a */
                        public void onNativeModuleCall(Integer num) {
                            int intValue = num.intValue();
                            if (intValue < 0) {
                                ShowActionSheetHandlerPlugin showActionSheetHandlerPlugin = ShowActionSheetHandlerPlugin.this;
                                ShowActionSheetHandlerResponse showActionSheetHandlerResponse = showActionSheetHandlerResponse;
                                C25906a aVar = C25906a.f64080j;
                                showActionSheetHandlerPlugin.fillFailedResponse(showActionSheetHandlerResponse, aVar, "native module call fail, result:" + intValue);
                                hVar.callback(showActionSheetHandlerResponse);
                                ILogger b = fVar.mo92190b();
                                b.mo92223e("ShowActionSheetHandlerPlugin", "native module call fail, result:" + intValue);
                                return;
                            }
                            showActionSheetHandlerResponse.mTapIndex = intValue;
                            hVar.callback(showActionSheetHandlerResponse);
                        }
                    });
                }
            });
            return;
        }
        fillFailedResponse(showActionSheetHandlerResponse, C25906a.f64072b, "array = null");
        hVar.callback(showActionSheetHandlerResponse);
    }
}
