package com.ss.android.lark.provider.spprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.util.Map;

public class SPContentProvider extends ContentProvider {
    public boolean onCreate() {
        return true;
    }

    public String getType(Uri uri) {
        String[] split = uri.getPath().split("/");
        String str = split[1];
        String str2 = split[2];
        if (str.equals("contain")) {
            return C52924c.m204892a(str2) + "";
        }
        return "" + C52924c.m204889a(str2, str);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        String[] split = uri.getPath().split("/");
        C52924c.m204891a(split[2], split[1], contentValues.get("value"));
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        String[] split = uri.getPath().split("/");
        if (split[1].equals("clean")) {
            C52924c.m204890a();
            return 0;
        }
        String str2 = split[2];
        if (C52924c.m204892a(str2)) {
            C52924c.m204896b(str2);
        }
        return 0;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        insert(uri, contentValues);
        return 0;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Map<String, ?> b;
        if (!uri.getPath().split("/")[1].equals("get_all") || (b = C52924c.m204895b()) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : b.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            objArr[2] = b.get(str3);
            if (objArr[2] instanceof Boolean) {
                objArr[1] = "boolean";
            } else if (objArr[2] instanceof String) {
                objArr[1] = "string";
            } else if (objArr[2] instanceof Integer) {
                objArr[1] = "int";
            } else if (objArr[2] instanceof Long) {
                objArr[1] = "long";
            } else if (objArr[2] instanceof Float) {
                objArr[1] = "float";
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }
}
