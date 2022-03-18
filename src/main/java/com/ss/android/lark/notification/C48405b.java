package com.ss.android.lark.notification;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.C36529b;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.DrawerParams;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.notification.dto.NotificationSettingV2;
import com.ss.android.lark.notification.setting.impl.badgestyle.BadgeStyleSettingsActivity;
import com.ss.android.lark.notification.setting.impl.badgestyle.C48583a;
import com.ss.android.lark.notification.setting.impl.setting.C48601b;
import com.ss.android.lark.notification.setting.impl.setting.NotificationSettingsActivity;
import com.ss.android.lark.notification.setting.impl.setting.SpecificMessageActivity;
import com.ss.android.lark.notification.setting.impl.setting.SpecificMessageFragment;
import com.ss.android.lark.notification.setting.impl.zen.C48680b;
import com.ss.android.lark.notification.setting.impl.zen.ZenSettingActivity;
import com.ss.android.lark.notification.statistics.NoticeHitPoint;

/* renamed from: com.ss.android.lark.notification.b */
public class C48405b {

    /* renamed from: a */
    private static final String f121883a = C48398a.m190922a().mo169341d().mo169429j();

    /* renamed from: b */
    public static void m190970b(Context context) {
        if (DesktopUtil.m144301a(context)) {
            DrawerParams a = new DrawerParams.C36565a(DesktopConstants.UIType.DRAWER_NORMAL_C1).mo134930b();
            C36512a.m144041a().mo134761a(new C48583a(), a);
            return;
        }
        context.startActivity(new Intent(context, BadgeStyleSettingsActivity.class));
    }

    /* renamed from: c */
    public static void m190971c(Context context) {
        if (DesktopUtil.m144301a(context)) {
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
            C36512a.m144041a().mo134762a(new C48680b(), a);
            return;
        }
        context.startActivity(new Intent(context, ZenSettingActivity.class));
    }

    /* renamed from: a */
    public static void m190967a(Context context) {
        if (DesktopUtil.m144301a(context)) {
            MainWindowParams a = new MainWindowParams.C36570a(ContainerType.Right).mo134958a(f121883a).mo134930b();
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
    public static void m190968a(Context context, String str) {
        C48398a.m190922a().mo169353p().mo169363a(context, str);
    }

    /* renamed from: a */
    public static void m190969a(Context context, boolean z) {
        if (DesktopUtil.m144301a(context)) {
            MainWindowParams a = new MainWindowParams.C36570a(ContainerType.Right).mo134958a(f121883a).mo134930b();
            C48601b bVar = new C48601b();
            Bundle bundle = new Bundle();
            bundle.putBoolean("highLight", z);
            bVar.setArguments(bundle);
            C36512a.m144041a().mo134763a(bVar, a);
        } else {
            Intent intent = new Intent(context, NotificationSettingsActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("highLight", z);
            context.startActivity(intent);
        }
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.notification.C48405b.RunnableC484061 */

            public void run() {
                NoticeHitPoint.f122125b.mo169608b();
            }
        });
    }

    /* renamed from: a */
    public static void m190966a(Activity activity, C36516a aVar, NotificationSettingV2 notificationSettingV2) {
        if (DesktopUtil.m144301a((Context) activity)) {
            DrawerParams a = new DrawerParams.C36565a(DesktopConstants.UIType.DRAWER_NORMAL_C1).mo134930b();
            SpecificMessageFragment specificMessageFragment = new SpecificMessageFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("options_key_v2", notificationSettingV2);
            specificMessageFragment.setArguments(bundle);
            C36512a.m144041a().mo134759a(aVar, specificMessageFragment, a, 233);
            return;
        }
        Intent intent = new Intent(activity, SpecificMessageActivity.class);
        intent.putExtra("options_key_v2", notificationSettingV2);
        activity.startActivityForResult(intent, 233);
    }
}
