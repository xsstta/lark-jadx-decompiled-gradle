package com.ss.android.lark.desktopmode.p1788b.p1794f;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

/* renamed from: com.ss.android.lark.desktopmode.b.f.a */
public class C36558a {
    /* renamed from: a */
    public static boolean m144263a(Intent intent) {
        if (RomUtils.m94950f() && intent.getFlags() == 272629760) {
            return C36561b.m144265a().mo134923a(intent.getComponent());
        }
        return false;
    }

    /* renamed from: b */
    public static ActivityOptions m144264b(Activity activity, StandAloneParam standAloneParam) {
        return DesktopUtil.m144295a(activity, standAloneParam);
    }

    /* renamed from: a */
    public static void m144262a(final Activity activity, final StandAloneParam standAloneParam) {
        long j;
        boolean a = m144263a(standAloneParam.getIntent());
        RunnableC365591 r1 = new Runnable() {
            /* class com.ss.android.lark.desktopmode.p1788b.p1794f.C36558a.RunnableC365591 */

            public void run() {
                ActivityOptions b = C36558a.m144264b(activity, standAloneParam);
                if (b == null) {
                    activity.startActivityForResult(standAloneParam.getIntent(), standAloneParam.getRequestCode());
                    return;
                }
                activity.startActivityForResult(standAloneParam.getIntent(), standAloneParam.getRequestCode(), b.toBundle());
            }
        };
        if (a) {
            j = 200;
        } else {
            j = 0;
        }
        UICallbackExecutor.executeDelayed(r1, j);
    }

    /* renamed from: a */
    public static void m144261a(final Activity activity, final Fragment fragment, final StandAloneParam standAloneParam) {
        long j;
        boolean a = m144263a(standAloneParam.getIntent());
        RunnableC365602 r1 = new Runnable() {
            /* class com.ss.android.lark.desktopmode.p1788b.p1794f.C36558a.RunnableC365602 */

            public void run() {
                ActivityOptions b = C36558a.m144264b(activity, standAloneParam);
                if (b == null) {
                    Fragment fragment = fragment;
                    if (fragment == null) {
                        activity.startActivityForResult(standAloneParam.getIntent(), standAloneParam.getRequestCode());
                    } else {
                        fragment.startActivityForResult(standAloneParam.getIntent(), standAloneParam.getRequestCode());
                    }
                } else {
                    Intent intent = standAloneParam.getIntent();
                    Fragment fragment2 = fragment;
                    if (fragment2 == null) {
                        activity.startActivityForResult(intent, standAloneParam.getRequestCode(), b.toBundle());
                    } else {
                        fragment2.startActivityForResult(intent, standAloneParam.getRequestCode(), b.toBundle());
                    }
                }
            }
        };
        if (a) {
            j = 200;
        } else {
            j = 0;
        }
        UICallbackExecutor.executeDelayed(r1, j);
    }
}
