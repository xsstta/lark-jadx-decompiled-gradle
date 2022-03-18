package com.ss.android.lark.app.task.initor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.base.C29517a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57858o;
import java.util.Locale;

public class BaseModuleDependencyInitorForSimple {

    /* renamed from: a */
    private static Context f72665a;

    /* renamed from: a */
    public static void m106365a(Context context) {
        f72665a = context;
        C29517a.m108725a(new C29517a.AbstractC29519b() {
            /* class com.ss.android.lark.app.task.initor.BaseModuleDependencyInitorForSimple.C289881 */

            @Override // com.ss.android.lark.base.C29517a.AbstractC29519b
            /* renamed from: a */
            public void mo102665a(Activity activity, int i) {
                if (RomUtils.m94934a(activity, activity.getWindow())) {
                    StatusBarUtil.setColorNoTranslucent(activity, i);
                }
            }

            @Override // com.ss.android.lark.base.C29517a.AbstractC29519b
            /* renamed from: b */
            public void mo102666b(Activity activity, int i) {
                if (RomUtils.m94941b(activity, activity.getWindow())) {
                    StatusBarUtil.setColorNoTranslucent(activity, i);
                }
            }
        });
        C29517a.m108724a(new C29517a.AbstractC29518a() {
            /* class com.ss.android.lark.app.task.initor.BaseModuleDependencyInitorForSimple.C289892 */

            @Override // com.ss.android.lark.base.C29517a.AbstractC29518a
            /* renamed from: a */
            public void mo102786a(Activity activity) {
            }

            @Override // com.ss.android.lark.base.C29517a.AbstractC29518a
            /* renamed from: a */
            public boolean mo102789a(Activity activity, KeyEvent keyEvent) {
                return false;
            }

            @Override // com.ss.android.lark.base.C29517a.AbstractC29518a
            /* renamed from: b */
            public void mo102790b(Activity activity) {
            }

            @Override // com.ss.android.lark.base.C29517a.AbstractC29518a
            /* renamed from: a */
            public boolean mo102788a() {
                return !LKUIDisplayManager.m91879b();
            }

            @Override // com.ss.android.lark.base.C29517a.AbstractC29518a
            /* renamed from: a */
            public Intent mo102785a(Intent intent) {
                return C57858o.m224558a(intent);
            }

            @Override // com.ss.android.lark.base.C29517a.AbstractC29518a
            /* renamed from: a */
            public Context mo102784a(Context context) {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).setContextLocale(context, new Locale("zh", "cn"));
            }

            @Override // com.ss.android.lark.base.C29517a.AbstractC29518a
            /* renamed from: a */
            public void mo102787a(Activity activity, boolean z) {
                Statistics.onCreate(activity);
                if (z && !((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin()) {
                    BaseModuleDependencyInitor.m106345a(activity.getClass().getName());
                }
            }
        });
    }
}
