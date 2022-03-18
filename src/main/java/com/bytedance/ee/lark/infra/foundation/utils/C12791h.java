package com.bytedance.ee.lark.infra.foundation.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.google.firebase.messaging.Constants;
import java.io.File;

/* renamed from: com.bytedance.ee.lark.infra.foundation.utils.h */
public class C12791h {
    /* renamed from: e */
    private static SharedPreferences m52867e(Context context) {
        return C12899a.m53203a(context, "TmaSession");
    }

    /* renamed from: d */
    public static void m52866d(Context context) {
        m52867e(context);
        Storage.getStorageByName(context, Storage.getStorageFilePrefix("TmaSession"));
    }

    /* renamed from: c */
    public static File m52865c(Context context) {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused) {
            str = "";
        }
        File file = null;
        if ("mounted".equals(str)) {
            file = context.getExternalFilesDir(null);
        }
        if (file == null) {
            AppBrandLogger.m52829e("StorageUtil", "appDir null. mounted:" + str);
        }
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: b */
    public static synchronized File m52864b(Context context) {
        File file;
        synchronized (C12791h.class) {
            File externalCacheDir = context.getExternalCacheDir();
            file = new File(externalCacheDir, C12788f.m52856b(context) + File.separator + "shared_temp");
            if (file.exists() && !file.isDirectory()) {
                AppBrandLogger.m52829e("StorageUtil", "shared_temp not dir, isFile:" + file.isFile());
                if (!file.delete()) {
                    AppBrandLogger.m52829e("StorageUtil", "shared_temp delete failed");
                }
            }
            if (!file.exists() && !file.mkdirs()) {
                AppBrandLogger.m52829e("StorageUtil", "shared_temp mkdirs failed");
            }
        }
        return file;
    }

    /* renamed from: a */
    public static File m52861a(Context context) {
        String str;
        File file;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception e) {
            AppBrandLogger.m52829e("StorageUtil", "exception Environment.getExternalStorageState() ", e);
            str = "";
        }
        if ("mounted".equals(str)) {
            file = context.getExternalCacheDir();
        } else {
            file = null;
        }
        if (file != null) {
            return file;
        }
        File file2 = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), Constants.ScionAnalytics.MessageType.DATA_MESSAGE), context.getPackageName()), "cache");
        AppBrandLogger.m52829e("StorageUtil", " appDir null. mounted:" + str, "appDir exists:", Boolean.valueOf(file2.exists()), "appDir path:", file2.getAbsolutePath());
        if (!file2.exists() && !file2.mkdirs()) {
            AppBrandLogger.m52829e("StorageUtil", "appDir mkdirs failed", file2.getAbsolutePath());
        }
        return file2;
    }

    /* renamed from: a */
    public static String m52862a(Context context, String str) {
        return Storage.getStorageByName(context, Storage.getStorageFilePrefix("TmaSession")).getString(str, "");
    }

    /* renamed from: a */
    public static void m52863a(Context context, String str, String str2) {
        if (Storage.getStorageByName(context, Storage.getStorageFilePrefix("TmaSession")).edit().putString(str, str2).commit()) {
            m52867e(context).edit().remove(str).commit();
        }
    }
}
