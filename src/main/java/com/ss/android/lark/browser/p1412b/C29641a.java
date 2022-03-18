package com.ss.android.lark.browser.p1412b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26278h;
import com.ss.android.lark.log.Log;
import java.io.File;

/* renamed from: com.ss.android.lark.browser.b.a */
public final class C29641a {
    /* renamed from: a */
    private static void m109705a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Log.m165379d("Abi64WebViewCompat", str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m109709d(Context context) {
        m109705a("tryDeleteCacheInSubThread run");
        m109706b(context);
    }

    /* renamed from: a */
    public static void m109702a(Context context) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(context) {
            /* class com.ss.android.lark.browser.p1412b.$$Lambda$a$8HCabwr5x2_w9bnElLozED5YpXI */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C29641a.m109709d(this.f$0);
            }
        });
    }

    /* renamed from: a */
    private static void m109703a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2 != null) {
                    m109703a(file2);
                }
            }
        }
        m109705a("delete isSuccessDelete: " + file.delete() + " fileName: " + file);
    }

    /* renamed from: b */
    private static void m109707b(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            m109705a("listFiles is not null ");
            for (File file2 : listFiles) {
                if (file2 != null) {
                    m109705a("child===" + file2.getAbsolutePath());
                    String name = file2.getName();
                    if (!TextUtils.isEmpty(name)) {
                        m109704a(file2, name);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static void m109706b(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            m109705a("SDK_INT = " + Build.VERSION.SDK_INT);
            return;
        }
        try {
            String valueOf = String.valueOf(C26278h.m95145a(context));
            if (TextUtils.isEmpty(valueOf)) {
                m109705a("isApp64Str is empty");
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("abi_webview_mark", 0);
            String string = sharedPreferences.getString("host_abi", "");
            if (TextUtils.isEmpty(string)) {
                sharedPreferences.edit().putString("host_abi", valueOf).apply();
                m109705a("the first empty abi");
                boolean z = sharedPreferences.getBoolean("is_delete_gpu_cache", false);
                if (!z && !Boolean.parseBoolean(valueOf)) {
                    m109705a("abi is 32");
                    return;
                } else if (z) {
                    sharedPreferences.edit().putBoolean("is_delete_gpu_cache", false).apply();
                    m109705a("already delete gpucache");
                } else if (Boolean.parseBoolean(valueOf)) {
                    m109705a("abi is 64");
                }
            }
            if (TextUtils.equals(string, valueOf)) {
                m109705a("the same abi");
                return;
            }
            m109708c(context);
            sharedPreferences.edit().putString("host_abi", valueOf).apply();
        } catch (Throwable th) {
            m109705a(th.getMessage());
        }
    }

    /* renamed from: c */
    private static void m109708c(Context context) {
        File file;
        File file2;
        context.getSharedPreferences("WebViewChromiumPrefs", 0).edit().clear().apply();
        if (Build.VERSION.SDK_INT >= 24) {
            file = new File(context.getDataDir() + File.separator + "files" + File.separator + "webview_bytedance" + File.separator + Constants.ScionAnalytics.MessageType.DATA_MESSAGE + File.separator + "GPUCache");
        } else {
            file = new File(context.getFilesDir() + File.separator + "webview_bytedance" + File.separator + Constants.ScionAnalytics.MessageType.DATA_MESSAGE + File.separator + "GPUCache");
        }
        m109703a(file);
        m109705a("delete tt gpucache success");
        if (Build.VERSION.SDK_INT >= 24) {
            file2 = context.getDataDir();
        } else {
            file2 = new File(context.getFilesDir().getParent());
        }
        if (file2 != null) {
            m109707b(file2);
        }
        m109705a("delete app process gpucache success");
    }

    /* renamed from: a */
    private static void m109704a(File file, String str) {
        File[] listFiles;
        m109705a("fileName = " + str);
        if (str.contains("app_webview") && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (!TextUtils.isEmpty(name) && name.contains("GPUCache")) {
                    m109705a("cacheFileName = " + name);
                    m109703a(file2);
                }
            }
        }
    }
}
