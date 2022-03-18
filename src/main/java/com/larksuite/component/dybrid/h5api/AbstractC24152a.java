package com.larksuite.component.dybrid.h5api;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.larksuite.component.dybrid.h5api.api.AbstractC24166i;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.C24160c;
import com.larksuite.component.dybrid.h5api.api.C24162e;
import com.larksuite.component.dybrid.h5api.api.H5PluginConfig;
import com.larksuite.component.dybrid.h5api.p1070a.AbstractC24153a;
import com.ss.android.lark.openapi.jsapi.AbstractC48759a;
import java.util.Map;

/* renamed from: com.larksuite.component.dybrid.h5api.a */
public interface AbstractC24152a {
    void addPluginConfig(H5PluginConfig h5PluginConfig);

    AbstractC24168k createH5Page(C24162e eVar, C24160c cVar, WebView webView);

    boolean exitService();

    WebResourceResponse getOfflineResByPath(String str, String str2);

    Map<String, AbstractC48759a<String>> h5PluginConfigToJSHandlers(AbstractC24168k kVar);

    void init(Context context, AbstractC24166i iVar);

    void setOpenBrowserListener(AbstractC24153a aVar);

    void startH5Page(C24162e eVar, C24160c cVar);
}
