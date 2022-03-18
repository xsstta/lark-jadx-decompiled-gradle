package com.ss.android.lark.openplatform.common;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.openplatform.common.c */
public class C48828c {

    /* renamed from: a */
    private static final Map<String, Boolean> f122655a;

    /* renamed from: a */
    public static Map<String, Boolean> m192372a() {
        return f122655a;
    }

    static {
        HashMap hashMap = new HashMap();
        f122655a = hashMap;
        hashMap.put("lark.app.plus", false);
        hashMap.put("openplatform.web.appweb", false);
        hashMap.put("lark.feed.openapp.v2", false);
        hashMap.put("message.action.list.entry.enable", false);
        hashMap.put("message.action.cross.tenant.enable", false);
        hashMap.put("lark.app.plus.new_api", false);
        hashMap.put("lark.webapp.container.v3", false);
        hashMap.put("webview.larkweb.lisp", false);
        hashMap.put("message.action.entry.enable", false);
    }
}
