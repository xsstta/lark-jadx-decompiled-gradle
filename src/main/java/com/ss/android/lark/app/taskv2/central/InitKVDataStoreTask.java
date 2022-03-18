package com.ss.android.lark.app.taskv2.central;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.C36420d;
import com.ss.android.lark.C36888e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.ApiUtils;
import com.tencent.mmkv.MMKV;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class InitKVDataStoreTask extends AsyncLaunchTask {
    /* renamed from: g */
    public static void m106694g() {
        MMKV.mmkvWithID("mmkv_imported_record", 4).encode("imported_v1", true);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InitLogTask.class);
        return arrayList;
    }

    /* renamed from: d */
    private void m106693d(Context context) {
        C57744a.m224104a().putString("login_host_env", PreferenceManager.getDefaultSharedPreferences(context).getString("login_host_env", ""));
    }

    /* renamed from: a */
    public String mo103035a(String str) {
        int lastIndexOf;
        if (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(46)) <= -1 || lastIndexOf >= str.length()) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: b */
    private void m106691b(Context context) {
        if (C26252ad.m94993b(context) && !MMKV.mmkvWithID("mmkv_imported_record", 4).getBoolean("imported_v1", false)) {
            MMKV.mmkvWithID("lark").importFromSharedPreferences(context.getSharedPreferences("lark", 0));
            m106693d(context);
            MMKV.mmkvWithID("unlogin").importFromSharedPreferences(context.getSharedPreferences("unlogin", 0));
            m106692c(context);
            m106694g();
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        C36888e.m145599a(context, new C36888e.AbstractC36891a() {
            /* class com.ss.android.lark.app.taskv2.central.InitKVDataStoreTask.C290281 */

            @Override // com.ss.android.lark.C36888e.AbstractC36891a
            public String getUserId() {
                String userId = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
                Log.m165389i("InitKVDataStoreTask", "getUserId=" + userId);
                return userId;
            }
        }, new C36420d(1));
        m106691b(context);
    }

    /* renamed from: c */
    private void m106692c(Context context) {
        File file = new File(context.getFilesDir().getParent() + "/shared_prefs/");
        StringBuffer stringBuffer = new StringBuffer();
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                String name = file2.getName();
                if (name.matches("\\d{19}\\.xml")) {
                    String a = mo103035a(name);
                    if (!TextUtils.isEmpty(a)) {
                        stringBuffer.append(",");
                        stringBuffer.append(a);
                    }
                }
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        if (!TextUtils.isEmpty(stringBuffer2)) {
            String[] split = stringBuffer2.split(",");
            for (String str : split) {
                if (str.matches("\\d{19}\\.xml")) {
                    MMKV.mmkvWithID(str).importFromSharedPreferences(context.getSharedPreferences(str, 0));
                }
            }
        }
    }
}
