package com.ss.android.lark.util.share_preference;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import com.ss.android.lark.C36888e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.provider.spprovider.C52922a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.util.share_preference.b */
public class SharedPreferencesC57745b implements SharedPreferences, SharedPreferences.Editor {

    /* renamed from: a */
    public final String f142240a;

    /* renamed from: b */
    private Context f142241b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.util.share_preference.b$a */
    public static class C57747a {

        /* renamed from: a */
        public static final SharedPreferencesC57745b f142242a = new SharedPreferencesC57745b();
    }

    public void apply() {
    }

    public boolean commit() {
        return true;
    }

    public SharedPreferences.Editor edit() {
        return this;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    /* renamed from: a */
    public static SharedPreferencesC57745b m224109a() {
        return C57747a.f142242a;
    }

    private SharedPreferencesC57745b() {
        this.f142240a = "__COMMA__";
        this.f142241b = C36888e.m145598a();
    }

    public SharedPreferences.Editor clear() {
        ContentResolver contentResolver = this.f142241b.getContentResolver();
        m224107a(contentResolver, Uri.parse(C52922a.f130772c + "/" + "clean"));
        return this;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        Cursor query = this.f142241b.getContentResolver().query(Uri.parse(C52922a.f130772c + "/" + "get_all"), null, null, null, null);
        HashMap hashMap = new HashMap();
        if (query != null && query.moveToFirst()) {
            int columnIndex = query.getColumnIndex("cursor_name");
            int columnIndex2 = query.getColumnIndex("cursor_type");
            int columnIndex3 = query.getColumnIndex("cursor_value");
            do {
                String string = query.getString(columnIndex);
                String string2 = query.getString(columnIndex2);
                Object obj = null;
                if (string2.equalsIgnoreCase("string")) {
                    obj = query.getString(columnIndex3);
                    String str = (String) obj;
                    if (str.contains("__COMMA__") && str.matches("\\[.*\\]")) {
                        String[] split = str.substring(1, str.length() - 1).split(", ");
                        HashSet hashSet = new HashSet();
                        for (String str2 : split) {
                            hashSet.add(str2.replace("__COMMA__", ", "));
                        }
                        obj = hashSet;
                    }
                } else if (string2.equalsIgnoreCase("boolean")) {
                    obj = query.getString(columnIndex3);
                } else if (string2.equalsIgnoreCase("int")) {
                    obj = Integer.valueOf(query.getInt(columnIndex3));
                } else if (string2.equalsIgnoreCase("long")) {
                    obj = Long.valueOf(query.getLong(columnIndex3));
                } else if (string2.equalsIgnoreCase("float")) {
                    obj = Float.valueOf(query.getFloat(columnIndex3));
                } else if (string2.equalsIgnoreCase("string_set")) {
                    obj = query.getString(columnIndex3);
                }
                hashMap.put(string, obj);
            } while (query.moveToNext());
            query.close();
        }
        return hashMap;
    }

    public boolean contains(String str) {
        ContentResolver contentResolver = this.f142241b.getContentResolver();
        String b = m224110b(contentResolver, Uri.parse(C52922a.f130772c + "/" + "contain" + "/" + str));
        if (b == null || b.equals("null")) {
            return false;
        }
        return Boolean.parseBoolean(b);
    }

    public SharedPreferences.Editor remove(String str) {
        ContentResolver contentResolver = this.f142241b.getContentResolver();
        m224107a(contentResolver, Uri.parse(C52922a.f130772c + "/" + "long" + "/" + str));
        return this;
    }

    /* renamed from: b */
    private String m224110b(ContentResolver contentResolver, Uri uri) {
        try {
            return contentResolver.getType(uri);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private int m224107a(ContentResolver contentResolver, Uri uri) {
        try {
            return contentResolver.delete(uri, null, null);
        } catch (IllegalArgumentException e) {
            Log.m165384e("SPHelper", "delete uri:" + uri, e);
            return -1;
        }
    }

    public boolean getBoolean(String str, boolean z) {
        ContentResolver contentResolver = this.f142241b.getContentResolver();
        String b = m224110b(contentResolver, Uri.parse(C52922a.f130772c + "/" + "boolean" + "/" + str));
        if (b == null || b.equals("null")) {
            return z;
        }
        return Boolean.parseBoolean(b);
    }

    public float getFloat(String str, float f) {
        ContentResolver contentResolver = this.f142241b.getContentResolver();
        String b = m224110b(contentResolver, Uri.parse(C52922a.f130772c + "/" + "float" + "/" + str));
        if (b == null || b.equals("null")) {
            return f;
        }
        return Float.parseFloat(b);
    }

    public int getInt(String str, int i) {
        ContentResolver contentResolver = this.f142241b.getContentResolver();
        String b = m224110b(contentResolver, Uri.parse(C52922a.f130772c + "/" + "int" + "/" + str));
        if (b == null || b.equals("null")) {
            return i;
        }
        return Integer.parseInt(b);
    }

    public long getLong(String str, long j) {
        ContentResolver contentResolver = this.f142241b.getContentResolver();
        String b = m224110b(contentResolver, Uri.parse(C52922a.f130772c + "/" + "long" + "/" + str));
        if (b == null || b.equals("null")) {
            return j;
        }
        return Long.parseLong(b);
    }

    public String getString(String str, String str2) {
        ContentResolver contentResolver = this.f142241b.getContentResolver();
        String b = m224110b(contentResolver, Uri.parse(C52922a.f130772c + "/" + "string" + "/" + str));
        if (b == null || b.equals("null")) {
            return str2;
        }
        return b;
    }

    public SharedPreferences.Editor putBoolean(String str, boolean z) {
        ContentResolver contentResolver = this.f142241b.getContentResolver();
        Uri parse = Uri.parse(C52922a.f130772c + "/" + "boolean" + "/" + str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", Boolean.valueOf(z));
        m224108a(contentResolver, parse, contentValues);
        return this;
    }

    public SharedPreferences.Editor putFloat(String str, float f) {
        ContentResolver contentResolver = this.f142241b.getContentResolver();
        Uri parse = Uri.parse(C52922a.f130772c + "/" + "boolean" + "/" + str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", Float.valueOf(f));
        m224108a(contentResolver, parse, contentValues);
        return this;
    }

    public SharedPreferences.Editor putInt(String str, int i) {
        ContentResolver contentResolver = this.f142241b.getContentResolver();
        Uri parse = Uri.parse(C52922a.f130772c + "/" + "int" + "/" + str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", Integer.valueOf(i));
        m224108a(contentResolver, parse, contentValues);
        return this;
    }

    public SharedPreferences.Editor putLong(String str, long j) {
        ContentResolver contentResolver = this.f142241b.getContentResolver();
        Uri parse = Uri.parse(C52922a.f130772c + "/" + "long" + "/" + str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", Long.valueOf(j));
        m224108a(contentResolver, parse, contentValues);
        return this;
    }

    public SharedPreferences.Editor putString(String str, String str2) {
        ContentResolver contentResolver = this.f142241b.getContentResolver();
        Uri parse = Uri.parse(C52922a.f130772c + "/" + "string" + "/" + str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", str2);
        m224108a(contentResolver, parse, contentValues);
        return this;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        String b = m224110b(this.f142241b.getContentResolver(), Uri.parse(C52922a.f130772c + "/" + "string_set" + "/" + str));
        if (b == null || b.equals("null") || !b.matches("\\[.*\\]")) {
            return set;
        }
        String[] split = b.substring(1, b.length() - 1).split(", ");
        HashSet hashSet = new HashSet();
        for (String str2 : split) {
            hashSet.add(str2.replace("__COMMA__", ", "));
        }
        return hashSet;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        HashSet hashSet = new HashSet();
        for (String str2 : set) {
            hashSet.add(str2.replace(",", "__COMMA__"));
        }
        ContentResolver contentResolver = this.f142241b.getContentResolver();
        Uri parse = Uri.parse(C52922a.f130772c + "/" + "string_set" + "/" + str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", hashSet.toString());
        m224108a(contentResolver, parse, contentValues);
        return this;
    }

    /* renamed from: a */
    private int m224108a(ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
        try {
            return contentResolver.update(uri, contentValues, null, null);
        } catch (IllegalArgumentException e) {
            Log.m165384e("SPHelper", "update uri:" + uri, e);
            return -1;
        }
    }
}
