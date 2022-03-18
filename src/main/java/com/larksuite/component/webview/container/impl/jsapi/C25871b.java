package com.larksuite.component.webview.container.impl.jsapi;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.bridge.JsCallBack;
import com.bytedance.ee.larkwebview.bridge.Status;
import com.bytedance.lark.webview.container.impl.p837c.AbstractC19871a;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.larksuite.component.webview.container.impl.inject.AbstractC25867d;
import com.larksuite.component.webview.container.impl.inject.C25864c;
import com.ss.android.lark.log.Log;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.larksuite.component.webview.container.impl.jsapi.b */
public class C25871b {
    /* renamed from: a */
    public void mo92026a(AbstractC25869a aVar) {
        aVar.mo91862a();
    }

    /* renamed from: b */
    public AbstractC19871a<String> mo92028b(final AbstractC25869a aVar) {
        return new AbstractC19871a<String>() {
            /* class com.larksuite.component.webview.container.impl.jsapi.C25871b.C258721 */

            /* renamed from: a */
            public void mo30815a(String str, final JsCallBack gVar, String str2, LarkWebView larkWebView) {
                AbstractC25869a aVar = aVar;
                if (aVar == null || !aVar.mo91996t()) {
                    Log.m165389i("InjectJSApiAdapterV2", "on JS Api Handler receive data , handler is not valid");
                    return;
                }
                Log.m165389i("InjectJSApiAdapterV2", "on JS Api Handler receive data");
                aVar.mo92023a(str, (AbstractC25832c) new AbstractC25832c() {
                    /* class com.larksuite.component.webview.container.impl.jsapi.C25871b.C258721.C258731 */

                    @Override // com.larksuite.component.webview.container.dto.AbstractC25832c
                    /* renamed from: a */
                    public void mo91903a(String str, boolean z) {
                    }

                    @Override // com.larksuite.component.webview.container.dto.AbstractC25832c
                    /* renamed from: a */
                    public void mo91902a(String str) {
                        Log.m165389i("InjectJSApiAdapterV2", "on JS Api Handler process data success");
                        gVar.mo49778a(Status.SUCCESS, str);
                    }

                    @Override // com.larksuite.component.webview.container.dto.AbstractC25832c
                    /* renamed from: b */
                    public void mo91904b(String str) {
                        Log.m165389i("InjectJSApiAdapterV2", "on JS Api Handler process data failed : " + str);
                        gVar.mo49778a(Status.FAILURE, str);
                    }
                });
            }
        };
    }

    /* renamed from: a */
    public void mo92027a(AbstractC25869a aVar, Activity activity, Fragment fragment, ConcurrentHashMap<String, Object> concurrentHashMap, IWebContainerContract.IWebContainerView iWebContainerView, IWebContainerContract.AbstractC25826a aVar2) {
        ((AbstractC25867d) C25864c.m93607a()).mo92011a(aVar, activity, fragment, concurrentHashMap, iWebContainerView, aVar2);
        aVar.mo91860a(activity.getIntent().getExtras());
    }
}
