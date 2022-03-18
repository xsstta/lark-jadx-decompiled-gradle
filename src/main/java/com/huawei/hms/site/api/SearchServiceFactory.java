package com.huawei.hms.site.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.site.C23752f;
import com.huawei.hms.site.C23756h;
import com.huawei.hms.site.C23759k;
import java.util.Locale;

public class SearchServiceFactory {
    public static synchronized SearchService create(Context context, String str) {
        C23752f fVar;
        synchronized (SearchServiceFactory.class) {
            if (context == null) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "%s is empty!", "context"));
            } else if (!TextUtils.isEmpty(str)) {
                C23759k.m86927a();
                C23756h hVar = new C23756h();
                Api api = new Api("Site.API");
                if (context instanceof Activity) {
                    fVar = new C23752f((Activity) context, api, (AbstractClientBuilder) hVar, str);
                } else {
                    fVar = new C23752f(context, api, hVar, str);
                }
            } else {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "%s is empty!", "apiKey"));
            }
        }
        return fVar;
    }
}
