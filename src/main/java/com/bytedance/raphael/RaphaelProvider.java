package com.bytedance.raphael;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;

public class RaphaelProvider extends ContentProvider {
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        if (Build.VERSION.SDK_INT >= 23 && Build.VERSION.SDK_INT <= 29) {
            Context context = getContext();
            if (context.getSharedPreferences("Raphael", 0).getInt(UpdateKey.STATUS, 1) != 0) {
                RaphaelManager.start(context, true);
            }
        }
        return true;
    }
}
