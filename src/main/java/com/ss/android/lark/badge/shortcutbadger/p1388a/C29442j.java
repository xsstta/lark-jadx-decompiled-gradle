package com.ss.android.lark.badge.shortcutbadger.p1388a;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.ss.android.lark.badge.shortcutbadger.AbstractC29432a;
import com.ss.android.lark.badge.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.badge.shortcutbadger.a.j */
public class C29442j implements AbstractC29432a {

    /* renamed from: a */
    private static final String[] f73553a = {"_id", "class"};

    /* renamed from: b */
    private C29436d f73554b;

    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public List<String> mo104316a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    public C29442j() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f73554b = new C29436d();
        }
    }

    /* renamed from: a */
    private ContentValues m108377a(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public void mo104317a(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        C29436d dVar = this.f73554b;
        if (dVar == null || !dVar.mo104318a(context)) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            Cursor cursor = null;
            try {
                cursor = contentResolver.query(parse, f73553a, "package=?", new String[]{componentName.getPackageName()}, null);
                if (cursor != null) {
                    String className = componentName.getClassName();
                    boolean z = false;
                    while (cursor.moveToNext()) {
                        int i2 = cursor.getInt(0);
                        contentResolver.update(parse, m108377a(componentName, i, false), "_id=?", new String[]{String.valueOf(i2)});
                        if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        contentResolver.insert(parse, m108377a(componentName, i, true));
                    }
                }
            } finally {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
        } else {
            this.f73554b.mo104317a(context, componentName, i);
        }
    }
}
