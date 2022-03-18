package com.bytedance.apm.battery.dao;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.core.SpPair;
import com.bytedance.apm.util.C3122i;
import com.huawei.hms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MonitorContentProvider extends ContentProvider {

    /* renamed from: a */
    public static String f9036a;

    /* renamed from: b */
    private final Map<String, SQLiteOpenHelper> f9037b = new HashMap();

    public String getType(Uri uri) {
        return null;
    }

    /* renamed from: a */
    private Bundle m11957a() {
        Bundle bundle = new Bundle();
        bundle.putInt("Pid", Process.myPid());
        return bundle;
    }

    public boolean onCreate() {
        f9036a = getContext().getPackageName() + ".apm";
        return false;
    }

    /* renamed from: b */
    private synchronized Pair<SharedPreferences, String> m11963b(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String str = null;
        if (pathSegments == null || pathSegments.size() < 2 || !"sp".equals(pathSegments.get(0))) {
            return null;
        }
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(pathSegments.get(1), 0);
        if (pathSegments.size() > 2) {
            str = pathSegments.get(2);
        }
        return new Pair<>(sharedPreferences, str);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.util.Pair<android.database.sqlite.SQLiteDatabase, java.lang.String> m11960a(android.net.Uri r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            java.util.List r5 = r5.getPathSegments()     // Catch:{ Exception -> 0x0052, all -> 0x004f }
            if (r5 == 0) goto L_0x0052
            int r1 = r5.size()     // Catch:{ Exception -> 0x0052, all -> 0x004f }
            r2 = 2
            if (r1 < r2) goto L_0x0052
            r1 = 0
            java.lang.Object r1 = r5.get(r1)     // Catch:{ Exception -> 0x0052, all -> 0x004f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0052, all -> 0x004f }
            r2 = 1
            java.lang.Object r5 = r5.get(r2)     // Catch:{ Exception -> 0x0052, all -> 0x004f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0052, all -> 0x004f }
            if (r1 != 0) goto L_0x0021
            monitor-exit(r4)
            return r0
        L_0x0021:
            java.util.Map<java.lang.String, android.database.sqlite.SQLiteOpenHelper> r2 = r4.f9037b
            java.lang.Object r2 = r2.get(r1)
            android.database.sqlite.SQLiteOpenHelper r2 = (android.database.sqlite.SQLiteOpenHelper) r2
            if (r2 != 0) goto L_0x0044
            java.lang.String r2 = "apm_monitor_t1.db"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L_0x0042
            com.bytedance.apm.battery.dao.b r2 = new com.bytedance.apm.battery.dao.b
            android.content.Context r3 = r4.getContext()
            r2.<init>(r3, r1)
            java.util.Map<java.lang.String, android.database.sqlite.SQLiteOpenHelper> r3 = r4.f9037b
            r3.put(r1, r2)
            goto L_0x0044
        L_0x0042:
            monitor-exit(r4)
            return r0
        L_0x0044:
            android.util.Pair r1 = new android.util.Pair
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()
            r1.<init>(r2, r5)
            monitor-exit(r4)
            return r1
        L_0x004f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0052:
            monitor-exit(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.dao.MonitorContentProvider.m11960a(android.net.Uri):android.util.Pair");
    }

    /* renamed from: a */
    private Bundle m11958a(SharedPreferences sharedPreferences, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("contains", sharedPreferences.contains(str));
        return bundle;
    }

    /* renamed from: a */
    private void m11962a(SharedPreferences sharedPreferences, Bundle bundle) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bundle.getBoolean("clear")) {
            edit.clear();
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("edit");
        if (parcelableArrayList != null) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                SpPair spPair = (SpPair) it.next();
                if (spPair.f9402b == null) {
                    edit.remove(spPair.f9401a);
                } else {
                    m11961a(edit, spPair.f9401a, spPair.f9402b);
                }
            }
            edit.apply();
        }
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a = m11960a(uri);
        if (a == null || (sQLiteDatabase = (SQLiteDatabase) a.first) == null) {
            return null;
        }
        try {
            long insert = sQLiteDatabase.insert((String) a.second, null, contentValues);
            if (insert >= 0) {
                return ContentUris.withAppendedId(uri, insert);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a = m11960a(uri);
        if (a == null || (sQLiteDatabase = (SQLiteDatabase) a.first) == null) {
            return -1;
        }
        try {
            return sQLiteDatabase.delete((String) a.second, str, strArr);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private Bundle m11959a(SharedPreferences sharedPreferences, String str, Object obj) {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (str == null) {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                arrayList.add(new SpPair(entry.getKey(), entry.getValue()));
            }
            bundle.putParcelableArrayList("sp", arrayList);
        } else {
            Object obj2 = sharedPreferences.getAll().get(str);
            if (obj2 != null) {
                obj = obj2;
            }
            if (obj instanceof Set) {
                obj = C3122i.m13010a((Set) obj);
            }
            arrayList.add(new SpPair(str, obj));
            bundle.putParcelableArrayList("sp", arrayList);
        }
        return bundle;
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        SpPair spPair;
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        if ("getPid".equals(str)) {
            return m11957a();
        }
        Uri.parse(str);
        Pair<SharedPreferences, String> b = m11963b(Uri.parse(str));
        Object obj = null;
        if (b == null) {
            return null;
        }
        if (SearchIntents.EXTRA_QUERY.equals(str2)) {
            if (!(bundle == null || (spPair = (SpPair) bundle.getParcelable("sp")) == null)) {
                obj = spPair.f9402b;
            }
            return m11959a((SharedPreferences) b.first, (String) b.second, obj);
        } else if ("contains".equals(str2)) {
            return m11958a((SharedPreferences) b.first, (String) b.second);
        } else {
            if ("edit".equals(str2) && bundle != null) {
                m11962a((SharedPreferences) b.first, bundle);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static void m11961a(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String[]) {
            editor.putStringSet(str, new HashSet(Arrays.asList((String[]) obj)));
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a = m11960a(uri);
        if (a == null || (sQLiteDatabase = (SQLiteDatabase) a.first) == null) {
            return -1;
        }
        try {
            return sQLiteDatabase.update((String) a.second, contentValues, str, strArr);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a = m11960a(uri);
        if (a == null || (sQLiteDatabase = (SQLiteDatabase) a.first) == null) {
            return null;
        }
        if (TextUtils.equals(str2, "rawQuery")) {
            return sQLiteDatabase.rawQuery(str, strArr2);
        }
        if (TextUtils.equals(str2, "execSQL")) {
            String[] split = str.split(";");
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    sQLiteDatabase.execSQL(str3);
                }
            }
            return null;
        }
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables((String) a.second);
        return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str, strArr2, null, null, str2);
    }
}
