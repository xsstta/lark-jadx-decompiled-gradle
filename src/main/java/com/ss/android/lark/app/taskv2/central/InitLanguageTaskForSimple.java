package com.ss.android.lark.app.taskv2.central;

import android.app.Application;
import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.utils.Reflect;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Locale;

public class InitLanguageTaskForSimple extends AbstractLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        if (context instanceof Application) {
            m106700a((Application) context);
        }
    }

    /* renamed from: a */
    private void m106700a(Application application) {
        Reflect.m94918a(application).mo93334a("mBase", ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).setContextLocale(application.getBaseContext(), new Locale("zh", "cn")));
    }
}
