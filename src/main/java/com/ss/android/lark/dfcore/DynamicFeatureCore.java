package com.ss.android.lark.dfcore;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.morpheus.C20207c;
import com.bytedance.morpheus.core.C20208a;
import com.google.android.play.core.splitcompat.C22662a;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.dfcore.p1799a.C36596a;
import com.ss.android.lark.dfcore.p1800b.AbstractC36600b;
import com.ss.android.lark.dfcore.p1801c.AbstractC36602a;
import com.ss.android.lark.dfcore.p1801c.C36603b;
import com.ss.android.lark.dfcore.p1801c.C36605c;
import com.ss.android.lark.dfcore.p1801c.C36606d;
import com.ss.android.lark.dfcore.p1801c.C36607e;
import com.ss.android.lark.dfcore.p1802d.C36612a;
import com.ss.android.lark.dfcore.task.DynamicFeatureTask;
import com.ss.android.lark.dfcore.utils.C36616a;
import com.ss.android.lark.dfcore.utils.C36617b;
import com.ss.android.lark.dfcore.utils.DynamicFeatureUtils;
import com.ss.android.lark.log.Log;
import java.util.Locale;
import org.json.JSONObject;

public class DynamicFeatureCore {
    private static C36616a sActivityInstallCompat = new C36616a();
    private static C36616a sApplicationInstallCompat = new C36616a();
    private static AbstractC36595a sDependency;
    private static boolean sIsSplitCompatInstalled = false;

    /* renamed from: com.ss.android.lark.dfcore.DynamicFeatureCore$a */
    public interface AbstractC36595a {
        /* renamed from: a */
        Activity mo103168a();

        /* renamed from: a */
        void mo103169a(String str, JSONObject jSONObject);
    }

    private static void ensureMorpheusInited() {
        C36617b.m144489c();
    }

    public static AbstractC36595a getDependency() {
        return sDependency;
    }

    public static synchronized void dumpsInstallGraph() {
        synchronized (DynamicFeatureCore.class) {
        }
    }

    public static void invalideSplitInstallAssetCaches() {
        Log.m165389i("DFCore", "invalide split install asset caches");
        sActivityInstallCompat.mo135080a();
        sApplicationInstallCompat.mo135080a();
    }

    public static synchronized void dumpsInstallStatus() {
        synchronized (DynamicFeatureCore.class) {
            Log.m165389i("DFCore", "[dump] installed Languages ---> " + DynamicFeatureUtils.getInstalledLanguages());
            Log.m165389i("DFCore", "[dump] installed Modules ---> " + DynamicFeatureUtils.getInstalledModules());
            C36596a.m144376a();
            C36596a.m144387d();
        }
    }

    public static void init(AbstractC36595a aVar) {
        sDependency = aVar;
    }

    public static void cancel(DynamicFeatureTask dynamicFeatureTask) {
        if (dynamicFeatureTask != null) {
            CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable() {
                /* class com.ss.android.lark.dfcore.$$Lambda$DynamicFeatureCore$tFjwWw19T77uNfPc8cDiIJarj4 */

                public final void run() {
                    DynamicFeatureCore.lambda$cancel$0(DynamicFeatureTask.this);
                }
            });
        }
    }

    public static void doSplitCompatInstall(Context context) {
        if (!sIsSplitCompatInstalled) {
            synchronized (DynamicFeatureCore.class) {
                if (!sIsSplitCompatInstalled) {
                    Log.m165389i("DFCore", "do split install");
                    C22662a.m82489a(context);
                    sIsSplitCompatInstalled = true;
                }
            }
        }
    }

    public static void ensureSplitCompatInstall(final Context context) {
        if (!sIsSplitCompatInstalled) {
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.dfcore.DynamicFeatureCore.RunnableC365941 */

                public void run() {
                    Log.m165389i("DFCore", "ensure split install");
                    DynamicFeatureCore.doSplitCompatInstall(context);
                }
            });
        }
    }

    public static void ensureSplitCompatInstallActivity(Context context) {
        ensureSplitCompatInstall(context.getApplicationContext());
        if (sIsSplitCompatInstalled) {
            if (context instanceof Activity) {
                sActivityInstallCompat.mo135081a(context);
            } else {
                sApplicationInstallCompat.mo135081a(context);
            }
        }
    }

    public static boolean install(DynamicFeatureTask dynamicFeatureTask) {
        ensureMorpheusInited();
        Log.m165389i("DFCore", "Dynamic Feature Core SDK Version: 1.0.0");
        if (DynamicFeatureUtils.isDynamicLanguageTask(dynamicFeatureTask)) {
            return installLanguage(dynamicFeatureTask);
        }
        return installFeature(dynamicFeatureTask);
    }

    static /* synthetic */ void lambda$cancel$0(DynamicFeatureTask dynamicFeatureTask) {
        Log.m165389i("DFCore", "cancel, task -> " + dynamicFeatureTask);
        C36596a.m144376a().mo135012b(dynamicFeatureTask);
    }

    private static boolean installFeature(DynamicFeatureTask dynamicFeatureTask) {
        String b = dynamicFeatureTask.mo135050b();
        AbstractC36600b c = dynamicFeatureTask.mo135051c();
        C20208a b2 = C20207c.m73751b(b);
        if (b2 != null) {
            C36612a.m144443a(dynamicFeatureTask, b2.mo68385c());
            if (b2.mo68385c() == 5) {
                if (c == null) {
                    return true;
                }
                c.mo135017a(dynamicFeatureTask);
                return true;
            } else if (b2.mo68385c() == 2 || b2.mo68385c() == 4) {
                AbstractC36602a b3 = C36605c.m144424a().mo135033b(dynamicFeatureTask.mo135040a());
                if (b3 != null) {
                    b3.mo135025a(dynamicFeatureTask);
                }
                return false;
            } else {
                C36605c.m144424a().mo135032a(dynamicFeatureTask.mo135040a(), new C36603b(dynamicFeatureTask));
                C36596a.m144376a().mo135009a(dynamicFeatureTask);
                return false;
            }
        } else {
            Log.m165382e("The state of " + b + "was not found");
            if (c != null) {
                c.mo135018a(dynamicFeatureTask, 99999);
            }
            return false;
        }
    }

    private static boolean installLanguage(DynamicFeatureTask dynamicFeatureTask) {
        AbstractC36600b c = dynamicFeatureTask.mo135051c();
        Locale f = dynamicFeatureTask.mo135056f();
        if (f == null) {
            return false;
        }
        if (DynamicFeatureUtils.isLanguageInstalled(f)) {
            Log.m165389i("DFCore", "installLanguage: language is installed before, name:  " + dynamicFeatureTask.mo135040a());
            C36612a.m144443a(dynamicFeatureTask, 5);
            if (c != null) {
                c.mo135017a(dynamicFeatureTask);
            }
            return true;
        }
        SplitInstallSessionState a = C36607e.m144435a(f.getLanguage());
        if (a != null) {
            Log.m165389i("DFCore", "installLanguage: language is installing, name:  " + dynamicFeatureTask.mo135040a() + ", state: " + a);
            C36612a.m144443a(dynamicFeatureTask, a.status());
            if (a.status() == 1 || a.status() == 2 || a.status() == 4) {
                AbstractC36602a b = C36605c.m144424a().mo135033b(dynamicFeatureTask.mo135040a());
                if (b != null) {
                    Log.m165389i("DFCore", "installLanguage: updateDynamicTaskConfig, name:  " + dynamicFeatureTask.mo135040a());
                    b.mo135025a(dynamicFeatureTask);
                }
                return false;
            }
        } else {
            C36612a.m144443a(dynamicFeatureTask, 0);
        }
        Log.m165389i("DFCore", "installLanguage: start download, name:  " + dynamicFeatureTask.mo135040a());
        C36605c.m144424a().mo135032a(dynamicFeatureTask.mo135040a(), new C36606d(dynamicFeatureTask));
        C36596a.m144376a().mo135009a(dynamicFeatureTask);
        return false;
    }

    public static boolean loadLibrary(String str, String str2) {
        String packageName = DynamicFeatureUtils.getPackageName(str);
        if (!TextUtils.isEmpty(packageName)) {
            return C20207c.m73749a(packageName, str2);
        }
        Log.m165383e("DFCore", "loadLibrary error! cannot find the requested plugin's packageName, module name is " + packageName);
        return false;
    }
}
