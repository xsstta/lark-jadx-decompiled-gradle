package com.facebook.react.modules.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.react.modules.storage.a */
public class C21250a {
    /* renamed from: a */
    static String m77033a(int i) {
        String[] strArr = new String[i];
        Arrays.fill(strArr, "?");
        return "key IN (" + TextUtils.join(", ", strArr) + ")";
    }

    /* renamed from: a */
    public static String m77034a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("catalystLocalStorage", new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            if (!query.moveToFirst()) {
                return null;
            }
            String string = query.getString(0);
            query.close();
            return string;
        } finally {
            query.close();
        }
    }

    /* renamed from: a */
    private static void m77035a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject2.optJSONObject(next);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(next);
            if (optJSONObject == null || optJSONObject2 == null) {
                jSONObject.put(next, jSONObject2.get(next));
            } else {
                m77035a(optJSONObject2, optJSONObject);
                jSONObject.put(next, optJSONObject2);
            }
        }
    }

    /* renamed from: a */
    static String[] m77037a(ReadableArray readableArray, int i, int i2) {
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = readableArray.getString(i + i3);
        }
        return strArr;
    }

    /* renamed from: b */
    static boolean m77038b(SQLiteDatabase sQLiteDatabase, String str, String str2) throws JSONException {
        String a = m77034a(sQLiteDatabase, str);
        if (a != null) {
            JSONObject jSONObject = new JSONObject(a);
            m77035a(jSONObject, new JSONObject(str2));
            str2 = jSONObject.toString();
        }
        return m77036a(sQLiteDatabase, str, str2);
    }

    /* renamed from: a */
    static boolean m77036a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put("value", str2);
        if (-1 != sQLiteDatabase.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5)) {
            return true;
        }
        return false;
    }
}
