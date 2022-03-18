package com.tt.miniapp.manager.appinfo;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.util.C67064v;
import com.tt.miniapp.util.C67067x;

/* renamed from: com.tt.miniapp.manager.appinfo.d */
public class C66412d {

    /* renamed from: a */
    private static volatile C66411c f167671a;

    /* renamed from: a */
    public static C66411c m259646a(Context context, IAppContext iAppContext) {
        C66411c b;
        if (f167671a == null) {
            synchronized (C66412d.class) {
                if (f167671a == null && (b = m259647b(context, iAppContext)) != null) {
                    f167671a = b;
                }
            }
        }
        return f167671a;
    }

    /* renamed from: b */
    public static C66411c m259647b(Context context, IAppContext iAppContext) {
        String[] strArr = new String[2];
        String str = "";
        for (int i = 3; i > 0; i--) {
            strArr[0] = C67067x.m261375a();
            strArr[1] = C67067x.m261375a();
            byte[] a = C67064v.m261370a(context, strArr[0] + "#" + strArr[1], iAppContext);
            if (a != null) {
                str = Base64.encodeToString(a, 10);
            }
            if (!TextUtils.isEmpty(str)) {
                break;
            }
            AppBrandLogger.m52829e("TTCodeGenerateUtils", "ttCode isEmpty. key:", strArr[0], " iv:", strArr[1], " secret:", a);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C66411c cVar = new C66411c();
        cVar.f167668a = strArr[0];
        cVar.f167669b = strArr[1];
        cVar.f167670c = str;
        return cVar;
    }
}
