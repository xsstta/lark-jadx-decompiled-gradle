package com.tencent.mmkv;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class MMKVContentProvider extends ContentProvider {

    /* renamed from: a */
    private static Uri f165416a;

    public String getType(Uri uri) {
        return null;
    }

    public boolean onCreate() {
        String b;
        Context context = getContext();
        if (context == null || (b = m257432b(context)) == null) {
            return false;
        }
        if (f165416a != null) {
            return true;
        }
        f165416a = Uri.parse("content://" + b);
        return true;
    }

    /* renamed from: a */
    protected static Uri m257429a(Context context) {
        String b;
        Uri uri = f165416a;
        if (uri != null) {
            return uri;
        }
        if (context == null || (b = m257432b(context)) == null) {
            return null;
        }
        Uri parse = Uri.parse("content://" + b);
        f165416a = parse;
        return parse;
    }

    /* renamed from: b */
    private static String m257432b(Context context) {
        ProviderInfo providerInfo;
        try {
            ComponentName componentName = new ComponentName(context, MMKVContentProvider.class.getName());
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (providerInfo = packageManager.getProviderInfo(componentName, 0)) == null) {
                return null;
            }
            return providerInfo.authority;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    /* renamed from: a */
    protected static String m257431a(Context context, int i) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == i) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        if (!str.equals("mmkvFromAshmemID") || bundle == null) {
            return null;
        }
        return m257430a(str2, bundle.getInt("KEY_SIZE"), bundle.getInt("KEY_MODE"), bundle.getString("KEY_CRYPT"));
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    /* renamed from: a */
    private Bundle m257430a(String str, int i, int i2, String str2) {
        MMKV mmkvWithAshmemID = MMKV.mmkvWithAshmemID(getContext(), str, i, i2, str2);
        if (mmkvWithAshmemID == null) {
            return null;
        }
        ParcelableMMKV parcelableMMKV = new ParcelableMMKV(mmkvWithAshmemID);
        Log.i("MMKV", str + " fd = " + mmkvWithAshmemID.ashmemFD() + ", meta fd = " + mmkvWithAshmemID.ashmemMetaFD());
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY", parcelableMMKV);
        return bundle;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }
}
