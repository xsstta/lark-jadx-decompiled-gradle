package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.platform.diskmanage.DiskManageProvider;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.C57849k;

public class InitCacheCleanTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: b */
    public int mo43824b() {
        return 20;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        if (((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isUseDiskManage()) {
            DiskManageProvider.m200842c().mo177932a();
            if (!C57744a.m224104a().getBoolean("has_deleted_old_cache_file", false)) {
                C57744a.m224104a().putBoolean("has_deleted_old_cache_file", true);
                C57849k.m224529c(context);
            }
        } else if (!C57765ac.m224187a(context)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - C57744a.m224104a().getLong("key_clean_data_date", 0)) - 86400000 > 0) {
                C57744a.m224104a().putLong("key_clean_data_date", currentTimeMillis);
                C57849k.m224537j(context);
            }
            if (Math.abs(currentTimeMillis - C57744a.m224104a().getLong("key_weekly_clean_date", 0)) - 604800000 > 0) {
                C57744a.m224104a().putLong("key_weekly_clean_date", currentTimeMillis);
                C57849k.m224538k(context);
            }
            if (Math.abs(currentTimeMillis - C57744a.m224104a().getLong("key_monthly_clean_date", 0)) - -1702967296 > 0) {
                C57744a.m224104a().putLong("key_monthly_clean_date", currentTimeMillis);
                C57849k.m224539l(context);
            }
            if (!C57744a.m224104a().getBoolean("has_deleted_old_cache_file", false)) {
                C57744a.m224104a().putBoolean("has_deleted_old_cache_file", true);
                C57849k.m224529c(context);
            }
        }
    }
}
