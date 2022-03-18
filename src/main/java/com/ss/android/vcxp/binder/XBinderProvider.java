package com.ss.android.vcxp.binder;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public class XBinderProvider extends ContentProvider {

    /* renamed from: a */
    private static XMethodService f161001a;

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (f161001a == null) {
            synchronized (this) {
                if (f161001a == null) {
                    f161001a = new XMethodService();
                }
            }
        }
        return C63800a.m250497a(f161001a);
    }
}
