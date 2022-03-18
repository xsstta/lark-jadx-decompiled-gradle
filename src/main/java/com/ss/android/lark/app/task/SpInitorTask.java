package com.ss.android.lark.app.task;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.C36420d;
import com.ss.android.lark.C36888e;
import com.ss.android.lark.app.taskv2.central.InitKVDataStoreTask;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.ApiUtils;
import com.tencent.mmkv.MMKV;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class SpInitorTask extends AsyncLaunchTask {
    /* renamed from: a */
    public String mo102764a(String str) {
        int lastIndexOf;
        if (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(46)) <= -1 || lastIndexOf >= str.length()) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: b */
    private void m106319b(final Context context) {
        if (C26252ad.m94993b(context)) {
            final MMKV mmkvWithID = MMKV.mmkvWithID("lark", 4);
            if (!mmkvWithID.getBoolean("lark", false)) {
                MMKV.mmkvWithID("lark").importFromSharedPreferences(context.getSharedPreferences("lark", 0));
                mmkvWithID.putBoolean("lark", true);
            }
            if (!mmkvWithID.getBoolean("login_host_env_import", false)) {
                m106318a("lark", context);
                mmkvWithID.putBoolean("login_host_env_import", true);
            }
            String userId = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
            if (TextUtils.isEmpty(userId)) {
                userId = "unlogin";
            }
            if (!mmkvWithID.getBoolean(userId, false)) {
                MMKV.mmkvWithID(userId).importFromSharedPreferences(context.getSharedPreferences(userId, 0));
                mmkvWithID.putBoolean(userId, true);
            }
            CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable() {
                /* class com.ss.android.lark.app.task.SpInitorTask.RunnableC289812 */

                public void run() {
                    File file = new File(context.getFilesDir().getParent() + "/shared_prefs/");
                    if (file.exists()) {
                        for (File file2 : file.listFiles()) {
                            String name = file2.getName();
                            if (name.matches("\\d{19}\\.xml")) {
                                String a = SpInitorTask.this.mo102764a(name);
                                if (!TextUtils.isEmpty(a) && !mmkvWithID.getBoolean(a, false)) {
                                    MMKV.mmkvWithID(a).importFromSharedPreferences(context.getSharedPreferences(a, 0));
                                    mmkvWithID.putBoolean(a, true);
                                }
                            }
                        }
                    }
                    InitKVDataStoreTask.m106694g();
                }
            }, 5000, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        C36888e.m145599a(context, new C36888e.AbstractC36891a() {
            /* class com.ss.android.lark.app.task.SpInitorTask.C289801 */

            @Override // com.ss.android.lark.C36888e.AbstractC36891a
            public String getUserId() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
            }
        }, new C36420d(1));
        m106319b(context);
    }

    /* renamed from: a */
    private void m106318a(String str, Context context) {
        C57744a.m224104a().putString("login_host_env", PreferenceManager.getDefaultSharedPreferences(context).getString("login_host_env", ""));
    }
}
