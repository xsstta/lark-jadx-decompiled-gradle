package com.larksuite.component.webview.container.impl.queryapi;

import android.net.Uri;
import android.text.TextUtils;
import com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.larksuite.component.webview.container.impl.queryapi.a */
public class C25876a {

    /* renamed from: a */
    private HashMap<String, AbstractInjectQueryApiHandler> f64005a = new HashMap<>();

    /* renamed from: a */
    public void mo92042a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Uri parse = Uri.parse(URLDecoder.decode(str, "UTF-8"));
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (!CollectionUtils.isEmpty(queryParameterNames)) {
                    for (String str2 : queryParameterNames) {
                        if (this.f64005a.containsKey(str2)) {
                            String queryParameter = parse.getQueryParameter(str2);
                            AbstractInjectQueryApiHandler abstractInjectQueryApiHandler = this.f64005a.get(str2);
                            if (abstractInjectQueryApiHandler != null) {
                                if (abstractInjectQueryApiHandler.mo91996t()) {
                                    abstractInjectQueryApiHandler.mo91866a(queryParameter);
                                }
                            }
                            Log.m165389i("QueryApiManager", "on Query Api Handler receive data , handler is not valid");
                            return;
                        }
                    }
                }
            } catch (UnsupportedEncodingException e) {
                Log.m165399w("OpenQueryManager", e);
            } catch (UnsupportedOperationException e2) {
                Log.m165399w("OpenQueryManager", e2);
            } catch (Exception e3) {
                Log.m165399w("OpenQueryManager", e3);
            }
        }
    }

    /* renamed from: a */
    public void mo92043a(String str, AbstractInjectQueryApiHandler abstractInjectQueryApiHandler) {
        if (!TextUtils.isEmpty(str) && abstractInjectQueryApiHandler != null) {
            this.f64005a.put(str, abstractInjectQueryApiHandler);
        }
    }
}
