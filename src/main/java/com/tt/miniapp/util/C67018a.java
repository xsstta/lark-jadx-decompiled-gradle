package com.tt.miniapp.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.activity.MoveHostFrontActivity;
import com.tt.miniapp.activity.OpenSchemaMiddleActivity;
import com.tt.miniapp.manager.C66429e;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.placeholder.MiniappTabActivity1;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.tt.miniapp.util.a */
public class C67018a {
    /* renamed from: a */
    private static boolean m261208a(Context context, Class cls) {
        if (context == null || cls == null) {
            return false;
        }
        List<ActivityManager.AppTask> c = m261216c(context);
        if (c != null && c.size() > 0) {
            try {
                for (ActivityManager.AppTask appTask : c) {
                    ComponentName componentName = appTask.getTaskInfo().topActivity;
                    if (componentName != null) {
                        return TextUtils.equals(componentName.getClassName(), cls.getName());
                    }
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("ActivityUtil", "tryJumpMiniApp checkTopActivity", e);
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m261205a(Activity activity, String str) {
        AppBrandLogger.m52828d("ActivityUtil", "moveMiniAppActivityToFront activity:", activity);
        if (activity == null) {
            AppBrandLogger.m52829e("ActivityUtil", "moveMiniAppActivityToFront activity == null");
            return false;
        }
        ISandboxEnvInfo a = C66645a.m260337a().mo232354a(str);
        if (a == null || a.isLaunchActivityInHostStack()) {
            AppBrandLogger.m52830i("ActivityUtil", "processInfo == null || processInfo.isLaunchActivityInHostStack()");
            return false;
        }
        Class launchActivityClass = a.getLaunchActivityClass();
        if (launchActivityClass == null) {
            AppBrandLogger.m52829e("ActivityUtil", "launchActivityClass == null");
            return false;
        }
        if (!m261207a(activity, m261211b(activity, launchActivityClass))) {
            m261217c(activity, launchActivityClass);
        }
        m261219d(activity);
        return true;
    }

    /* renamed from: a */
    public static boolean m261209a(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra("MoveActivityToFrontSilent", false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m261207a(android.content.Context r7, android.app.ActivityManager.AppTask r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "activity"
            java.lang.Object r7 = r7.getSystemService(r1)
            android.app.ActivityManager r7 = (android.app.ActivityManager) r7
            java.lang.String r1 = "ActivityUtil"
            r2 = 2
            r3 = 1
            if (r7 == 0) goto L_0x003b
            android.app.ActivityManager$RecentTaskInfo r4 = r8.getTaskInfo()     // Catch:{ all -> 0x002d }
            int r5 = r4.id     // Catch:{ all -> 0x002d }
            r7.moveTaskToFront(r5, r2)     // Catch:{ all -> 0x002d }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x002a }
            java.lang.String r5 = "activityManager.moveTaskToFront recentTaskInfo.baseIntent:"
            r7[r0] = r5     // Catch:{ all -> 0x002a }
            android.content.Intent r4 = r4.baseIntent     // Catch:{ all -> 0x002a }
            r7[r3] = r4     // Catch:{ all -> 0x002a }
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52830i(r1, r7)     // Catch:{ all -> 0x002a }
            r4 = 1
            goto L_0x003c
        L_0x002a:
            r7 = move-exception
            r4 = 1
            goto L_0x002f
        L_0x002d:
            r7 = move-exception
            r4 = 0
        L_0x002f:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = "activityManager.moveTaskToFront"
            r5[r0] = r6
            r5[r3] = r7
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e(r1, r5)
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            if (r4 != 0) goto L_0x004c
            r8.moveToFront()
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r2 = "matchAppTask.moveToFront targetAppTask:"
            r7[r0] = r2
            r7[r3] = r8
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52830i(r1, r7)
        L_0x004c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.util.C67018a.m261207a(android.content.Context, android.app.ActivityManager$AppTask):boolean");
    }

    /* renamed from: b */
    public static boolean m261213b() {
        String a = m261198a();
        if (a == null || !a.equals(AppbrandContext.getInst().getApplicationContext().getPackageName())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static String m261215c() {
        String name = MiniappTabActivity1.class.getName();
        return name.substring(0, name.lastIndexOf("."));
    }

    /* renamed from: a */
    public static String m261198a() {
        ActivityManager activityManager = (ActivityManager) AppbrandContext.getInst().getApplicationContext().getSystemService("activity");
        if (activityManager.getRunningTasks(1) == null) {
            AppBrandLogger.m52829e("ActivityUtil", "running task is null, ams is abnormal!!!");
            return null;
        }
        ActivityManager.RunningTaskInfo runningTaskInfo = activityManager.getRunningTasks(1).get(0);
        if (runningTaskInfo != null) {
            return runningTaskInfo.topActivity.getPackageName();
        }
        AppBrandLogger.m52829e("ActivityUtil", "failed to get RunningTaskInfo");
        return null;
    }

    /* renamed from: b */
    public static boolean m261214b(Activity activity) {
        if (activity == C66429e.m259690a()) {
            return true;
        }
        return m261218c(activity);
    }

    /* renamed from: a */
    private static String m261199a(ActivityManager.AppTask appTask) {
        ComponentName component;
        if (appTask == null || (component = appTask.getTaskInfo().baseIntent.getComponent()) == null) {
            return null;
        }
        return component.getClassName();
    }

    /* renamed from: d */
    public static void m261219d(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            activity.overridePendingTransition(R.anim.microapp_i_slide_no_special_over_23, R.anim.microapp_i_slide_no_special_over_23);
        } else {
            activity.overridePendingTransition(R.anim.microapp_i_slide_no_special, R.anim.microapp_i_slide_no_special);
        }
    }

    /* renamed from: e */
    public static void m261220e(Activity activity) {
        if (activity != null && !m261221f(activity)) {
            activity.getWindow().getDecorView().setSystemUiVisibility(2822);
        }
    }

    /* renamed from: f */
    public static boolean m261221f(Activity activity) {
        if ((activity.getWindow().getAttributes().flags & 1024) == 1024) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m261206a(Context context) {
        List<ActivityManager.AppTask> c = m261216c(context);
        if (c != null && c.size() > 0) {
            try {
                String a = m261199a(c.get(0));
                if (a != null) {
                    return a.contains(m261215c());
                }
            } catch (Throwable th) {
                AppBrandLogger.m52829e("ActivityUtil", "isHostStackAtTop", th);
            }
        }
        return false;
    }

    /* renamed from: b */
    public static ActivityManager.AppTask m261210b(Context context) {
        List<ActivityManager.AppTask> c = m261216c(context);
        if (c == null) {
            return null;
        }
        for (ActivityManager.AppTask appTask : c) {
            Intent intent = appTask.getTaskInfo().baseIntent;
            String action = intent.getAction();
            Set<String> categories = intent.getCategories();
            if ("android.intent.action.MAIN".equals(action) && categories != null && categories.contains("android.intent.category.LAUNCHER")) {
                return appTask;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static List<ActivityManager.AppTask> m261216c(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                return activityManager.getAppTasks();
            }
            return null;
        } catch (Exception e) {
            AppBrandLogger.m52829e("ActivityUtil", e);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m261218c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            return m261208a(activity, activity.getClass());
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m261204a(Activity activity) {
        List<ActivityManager.AppTask> c = m261216c((Context) activity);
        if (c != null && c.size() > 0) {
            try {
                for (ActivityManager.AppTask appTask : c) {
                    ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                    if (taskInfo.id == activity.getTaskId()) {
                        if (Build.VERSION.SDK_INT < 23) {
                            ComponentName component = taskInfo.baseIntent.getComponent();
                            if (component != null) {
                                return TextUtils.equals(component.getClassName(), activity.getClass().getName());
                            }
                        } else if (taskInfo.numActivities == 1) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("ActivityUtil", "tryJumpMiniApp checkTopActivity", e);
            }
        }
        return false;
    }

    /* renamed from: b */
    private static ActivityManager.AppTask m261211b(Context context, Class cls) {
        if (context == null || cls == null) {
            return null;
        }
        AppBrandLogger.m52828d("ActivityUtil", "getMiniAppActivityTask");
        List<ActivityManager.AppTask> c = m261216c(context);
        if (c == null || c.size() <= 0) {
            return null;
        }
        String name = cls.getName();
        try {
            for (ActivityManager.AppTask appTask : c) {
                if (TextUtils.equals(m261199a(appTask), name)) {
                    return appTask;
                }
            }
            return null;
        } catch (Exception e) {
            AppBrandLogger.m52829e("ActivityUtil", "moveMiniAppActivityToFront checkMatchTask", e);
            return null;
        }
    }

    /* renamed from: c */
    private static void m261217c(Context context, Class cls) {
        AppBrandLogger.m52828d("ActivityUtil", "launchMiniAppActivity miniAppActivityClass:", cls);
        Intent intent = new Intent(context, cls);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("MoveActivityToFrontSilent", true);
        context.startActivity(intent);
    }

    /* renamed from: b */
    private static void m261212b(Activity activity, boolean z) {
        AppBrandLogger.m52828d("ActivityUtil", "launchMoveHostFrontActivity");
        Intent intent = new Intent(activity, MoveHostFrontActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        if (z) {
            intent.putExtra("MoveActivityToFrontSilent", true);
        }
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public static void m261201a(Activity activity, boolean z) {
        AppBrandLogger.m52828d("ActivityUtil", "moveHostActivityTaskToFront activity:", activity);
        if (activity == null) {
            AppBrandLogger.m52829e("ActivityUtil", "moveHostActivityTaskToFront activity == null");
            return;
        }
        List<ActivityManager.AppTask> c = m261216c((Context) activity);
        ActivityManager.AppTask appTask = null;
        if (c != null && c.size() > 0) {
            try {
                String c2 = m261215c();
                String packageName = activity.getPackageName();
                Iterator<ActivityManager.AppTask> it = c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ActivityManager.AppTask next = it.next();
                        String a = m261199a(next);
                        if (a != null && a.contains(packageName) && !a.contains(c2)) {
                            appTask = next;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("ActivityUtil", "moveHostActivityTaskToFront checkMatchTask", e);
            }
        }
        if (!m261207a(activity, appTask)) {
            m261212b(activity, z);
        }
        if (z) {
            m261219d(activity);
        }
    }

    /* renamed from: a */
    public static void m261202a(Context context, int i) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        List<ActivityManager.AppTask> c = m261216c(context);
        if (c != null) {
            ActivityManager.RecentTaskInfo recentTaskInfo = null;
            Iterator<ActivityManager.AppTask> it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
                if (taskInfo.id == i) {
                    recentTaskInfo = taskInfo;
                    break;
                }
            }
            if (recentTaskInfo != null) {
                AppBrandLogger.m52830i("ActivityUtil", "target:" + recentTaskInfo.baseIntent);
                try {
                    activityManager.moveTaskToFront(recentTaskInfo.id, 2);
                    AppBrandLogger.m52830i("ActivityUtil", "activityManager.moveTaskToFront recentTaskInfo.baseIntent");
                } catch (Exception e) {
                    AppBrandLogger.m52829e("ActivityUtil", "moveTaskToFront", e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m261203a(MiniappHostBase miniappHostBase, String str, String str2, String str3, IAppContext iAppContext) {
        m261200a(miniappHostBase, str, str2, str3, miniappHostBase.isInHostStack(), iAppContext);
    }

    /* renamed from: a */
    public static void m261200a(Activity activity, String str, String str2, String str3, boolean z, IAppContext iAppContext) {
        AppbrandApplicationImpl.getInst(iAppContext).setOpenedSchema(true);
        String a = C12738a.m52723a(activity, "", Settings.TT_TMA_SWITCH, Settings.TmaSwitch.LAUNCH_FLAG);
        if (TextUtils.isEmpty(str2)) {
            str2 = a;
        }
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo();
        Intent intent = new Intent(activity, OpenSchemaMiddleActivity.class);
        intent.putExtra("schema", str);
        intent.putExtra("class_name", activity.getClass().getName());
        intent.putExtra("from_app_id", appInfo.appId);
        intent.putExtra("is_from_app_in_host_stack", z);
        intent.putExtra("is_game", appInfo.isGame());
        intent.putExtra("launch_flag", str2);
        intent.putExtra("args", str3);
        if (!"currentTask".equalsIgnoreCase(str2) && !TextUtils.isEmpty(str2)) {
            intent.addFlags(268435456);
        }
        activity.startActivity(intent);
        m261219d(activity);
    }
}
