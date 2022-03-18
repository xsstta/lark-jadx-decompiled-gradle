package com.ss.android.lark.app.task.initor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.base.C29517a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.utils.p1796b.C36580a;
import com.ss.android.lark.ding.helper.C36644b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57858o;

public class BaseModuleDependencyInitor {

    /* renamed from: a */
    private static Context f72662a;

    /* renamed from: a */
    public static void m106344a(Context context) {
        f72662a = context;
        C29517a.m108725a(new C29517a.AbstractC29519b() {
            /* class com.ss.android.lark.app.task.initor.BaseModuleDependencyInitor.C289841 */

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
            /* class com.ss.android.lark.app.task.initor.BaseModuleDependencyInitor.C289852 */

            @Override // com.ss.android.lark.base.C29517a.AbstractC29518a
            /* renamed from: a */
            public boolean mo102788a() {
                return !LKUIDisplayManager.m91879b();
            }

            @Override // com.ss.android.lark.base.C29517a.AbstractC29518a
            /* renamed from: a */
            public void mo102786a(Activity activity) {
                Statistics.onResume(activity);
            }

            @Override // com.ss.android.lark.base.C29517a.AbstractC29518a
            /* renamed from: b */
            public void mo102790b(Activity activity) {
                Statistics.onPause(activity);
            }

            @Override // com.ss.android.lark.base.C29517a.AbstractC29518a
            /* renamed from: a */
            public Intent mo102785a(Intent intent) {
                return C57858o.m224558a(intent);
            }

            @Override // com.ss.android.lark.base.C29517a.AbstractC29518a
            /* renamed from: a */
            public Context mo102784a(Context context) {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(context);
            }

            @Override // com.ss.android.lark.base.C29517a.AbstractC29518a
            /* renamed from: a */
            public void mo102787a(Activity activity, boolean z) {
                Statistics.onCreate(activity);
                if (z && !((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin()) {
                    BaseModuleDependencyInitor.m106345a(activity.getClass().getName());
                }
            }

            @Override // com.ss.android.lark.base.C29517a.AbstractC29518a
            /* renamed from: a */
            public boolean mo102789a(final Activity activity, KeyEvent keyEvent) {
                return C36580a.m144317a().mo134972a(keyEvent, new C36580a.AbstractC36583b() {
                    /* class com.ss.android.lark.app.task.initor.BaseModuleDependencyInitor.C289852.C289861 */

                    @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
                    /* renamed from: a */
                    public /* synthetic */ boolean mo102792a(int i) {
                        return C36580a.AbstractC36583b.CC.$default$a(this, i);
                    }

                    @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
                    /* renamed from: b */
                    public /* synthetic */ boolean mo102793b() {
                        return C36580a.AbstractC36583b.CC.$default$b(this);
                    }

                    @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
                    /* renamed from: b */
                    public /* synthetic */ boolean mo102794b(int i) {
                        return C36580a.AbstractC36583b.CC.$default$b(this, i);
                    }

                    @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
                    /* renamed from: c */
                    public /* synthetic */ boolean mo102795c() {
                        return C36580a.AbstractC36583b.CC.$default$c(this);
                    }

                    @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
                    /* renamed from: c */
                    public /* synthetic */ boolean mo102796c(int i) {
                        return C36580a.AbstractC36583b.CC.$default$c(this, i);
                    }

                    @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
                    /* renamed from: d */
                    public /* synthetic */ boolean mo102797d() {
                        return C36580a.AbstractC36583b.CC.$default$d(this);
                    }

                    @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
                    /* renamed from: d */
                    public /* synthetic */ boolean mo102798d(int i) {
                        return C36580a.AbstractC36583b.CC.$default$d(this, i);
                    }

                    @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
                    /* renamed from: e */
                    public /* synthetic */ boolean mo102799e(int i) {
                        return C36580a.AbstractC36583b.CC.$default$e(this, i);
                    }

                    @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
                    /* renamed from: f */
                    public /* synthetic */ boolean mo102800f(int i) {
                        return C36580a.AbstractC36583b.CC.$default$f(this, i);
                    }

                    @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
                    /* renamed from: a */
                    public boolean mo102791a() {
                        if (!DesktopUtil.m144301a((Context) activity) || ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isInstanceOfMainActivity(activity)) {
                            return false;
                        }
                        if (!UIUtils.isActivityRunning(activity)) {
                            return true;
                        }
                        activity.finish();
                        Log.m165389i("DesktopModeManager", "desktop esc pressed -- close activity: " + activity.getClass().getSimpleName());
                        return true;
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static void m106345a(String str) {
        String str2 = "NoLoginData makes logout. onNotLoginEvent!!! in activity: " + str;
        Log.m165396w(str2);
        C36644b.m144618a().mo135225h();
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).logout(f72662a, true, str2, new AbstractC49338a() {
            /* class com.ss.android.lark.app.task.initor.BaseModuleDependencyInitor.C289873 */

            @Override // com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a
            public void onResult(boolean z) {
                Log.m165388i("BaseModuleDependencyInitor logout, success: " + z);
            }
        });
    }
}
