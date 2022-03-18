package com.ss.android.lark.app.task.initor;

import android.content.Context;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.widget.C58377d;

public class RichTextModuleDependencyInitor {
    /* renamed from: a */
    public static void m106518a(final Context context) {
        C58377d.m226287a(new C58377d.AbstractC58378a() {
            /* class com.ss.android.lark.app.task.initor.RichTextModuleDependencyInitor.C290061 */

            /* renamed from: b */
            private Boolean f72688b;

            @Override // com.ss.android.lark.widget.C58377d.AbstractC58378a
            /* renamed from: b */
            public boolean mo102879b() {
                return DesktopUtil.m144301a(context);
            }

            @Override // com.ss.android.lark.widget.C58377d.AbstractC58378a
            /* renamed from: a */
            public String mo102878a() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
            }

            @Override // com.ss.android.lark.widget.C58377d.AbstractC58378a
            /* renamed from: c */
            public boolean mo102880c() {
                return C37239a.m146648b().mo136951a("lark.chat.richtext.unite");
            }

            @Override // com.ss.android.lark.widget.C58377d.AbstractC58378a
            /* renamed from: d */
            public boolean mo102881d() {
                if (this.f72688b == null) {
                    this.f72688b = Boolean.valueOf(C37239a.m146648b().mo136951a("lark.chat.richtext.markdown.tag"));
                    Log.m165389i("RichText", "isEnableMarkDownTag:" + this.f72688b);
                }
                return this.f72688b.booleanValue();
            }
        });
    }
}
