package com.ss.android.lark.app.taskv2.central;

import android.app.Application;
import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.biz.core.api.AbstractC29540ab;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.af.C51682a;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Locale;

public class InitLanguageTask extends AbstractLaunchTask {
    /* renamed from: a */
    private void m106698a(final Application application) {
        final ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        iCoreApi.updateAppBaseContext(application);
        iCoreApi.initLanguageModule(application, new AbstractC29540ab() {
            /* class com.ss.android.lark.app.taskv2.central.InitLanguageTask.C290291 */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29540ab
            public void onLanguageChange(Locale locale, Locale locale2) {
                iCoreApi.updateAppBaseContext(application);
                iCoreApi.getLocaleWatcher().mo105894a("change_locale_done", application, locale2, locale);
                if (C26252ad.m94993b(application)) {
                    if (!((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isInLoginActivity(iCoreApi.getTopActivity())) {
                        C51682a.m200447a();
                        iCoreApi.onLocaleChange();
                        iCoreApi.getLocaleWatcher().mo105895a("change_locale_main_restart", application);
                        iCoreApi.getMainLauncher().mo105708c(application);
                    }
                }
            }
        });
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        if (context instanceof Application) {
            C51995b.m201718a("init_language", null, 1);
            m106698a((Application) context);
            C51995b.m201714a();
        }
    }
}
