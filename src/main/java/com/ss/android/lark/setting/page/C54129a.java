package com.ss.android.lark.setting.page;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.C36529b;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.general.C54437c;
import com.ss.android.lark.setting.page.content.general.GeneralSettingActivity;
import com.ss.android.lark.setting.page.content.internal.MineInternalSettingsActivity;
import com.ss.android.lark.setting.page.content.internal.mvp.C54543b;
import com.ss.android.lark.setting.page.statistics.SettingHitPoint;
import com.ss.android.lark.setting.page.v2.MineSystemSettingActivityV2;

/* renamed from: com.ss.android.lark.setting.page.a */
public class C54129a {
    /* renamed from: b */
    public static void m210150b(Context context) {
        if (DesktopUtil.m144301a(context)) {
            MainWindowParams a = new MainWindowParams.C36570a(ContainerType.Right).mo134958a("system_setting").mo134930b();
            C36512a.m144041a().mo134763a(new C54437c(), a);
        } else {
            context.startActivity(new Intent(context, GeneralSettingActivity.class));
        }
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.page.C54129a.RunnableC541312 */

            public void run() {
                SettingHitPoint.f134851a.mo186399c();
            }
        });
    }

    /* renamed from: c */
    public static void m210151c(Context context) {
        if (DesktopUtil.m144301a(context)) {
            MainWindowParams a = new MainWindowParams.C36570a(ContainerType.Right).mo134958a("system_setting").mo134930b();
            C36512a.m144041a().mo134763a(new C54543b(), a);
        } else {
            context.startActivity(new Intent(context, MineInternalSettingsActivity.class));
        }
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.page.C54129a.RunnableC541323 */

            public void run() {
                SettingHitPoint.f134851a.mo186397b();
            }
        });
    }

    /* renamed from: d */
    public static void m210152d(Context context) {
        if (DesktopUtil.m144301a(context)) {
            MainWindowParams a = new MainWindowParams.C36570a(ContainerType.Right).mo134958a("system_setting").mo134930b();
            C36529b bVar = new C36529b();
            Bundle arguments = bVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("holder", R.drawable.empty_default_icon);
            bVar.setArguments(arguments);
            C36512a.m144041a().mo134763a(bVar, a);
        }
    }

    /* renamed from: a */
    public static void m210149a(Context context) {
        if (DesktopUtil.m144301a(context)) {
            C54115c.m210080a().mo178295g().mo178364a(context, "system_setting", null);
        } else {
            Log.m165389i("MineSettingLauncher", "phone use system setting v2");
            Intent intent = new Intent(context, MineSystemSettingActivityV2.class);
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intent, C54115c.m210080a().mo178295g().mo178362a());
            }
        }
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.page.C54129a.RunnableC541301 */

            public void run() {
                SettingHitPoint.f134851a.mo186394a();
            }
        });
    }
}
