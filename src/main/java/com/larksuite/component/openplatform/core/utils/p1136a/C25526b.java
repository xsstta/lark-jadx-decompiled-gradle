package com.larksuite.component.openplatform.core.utils.p1136a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;

/* renamed from: com.larksuite.component.openplatform.core.utils.a.b */
public class C25526b {
    /* renamed from: a */
    public static void m91116a(String str, IAppContext iAppContext, String str2, String str3, String str4) {
        C25525a aVar = new C25525a(str, iAppContext);
        if (TextUtils.equals(str2, "success")) {
            aVar.setResultTypeSuccess();
        } else if (TextUtils.equals(str2, "fail")) {
            aVar.setResultTypeFail();
        }
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            aVar.addCategoryValue(str3, str4);
        }
        aVar.flush();
    }
}
