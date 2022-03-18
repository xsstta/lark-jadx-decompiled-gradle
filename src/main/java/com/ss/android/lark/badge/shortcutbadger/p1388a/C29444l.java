package com.ss.android.lark.badge.shortcutbadger.p1388a;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import com.ss.android.lark.badge.shortcutbadger.AbstractC29432a;
import com.ss.android.lark.badge.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.badge.shortcutbadger.a.l */
public class C29444l implements AbstractC29432a {

    /* renamed from: a */
    private static final Uri f73555a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b */
    private AsyncQueryHandler f73556b;

    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public List<String> mo104316a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    /* renamed from: a */
    private void m108383a(ContentValues contentValues) {
        this.f73556b.startInsert(0, null, f73555a, contentValues);
    }

    /* renamed from: a */
    private static boolean m108385a(Context context) {
        if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m108384a(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(f73555a, contentValues);
    }

    /* renamed from: a */
    private ContentValues m108382a(int i, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    /* renamed from: b */
    private static void m108386b(Context context, ComponentName componentName, int i) {
        boolean z;
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z);
        context.sendBroadcast(intent);
    }

    /* renamed from: c */
    private void m108387c(Context context, ComponentName componentName, int i) {
        if (i >= 0) {
            ContentValues a = m108382a(i, componentName);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f73556b == null) {
                    this.f73556b = new AsyncQueryHandler(context.getApplicationContext().getContentResolver()) {
                        /* class com.ss.android.lark.badge.shortcutbadger.p1388a.C29444l.C294451 */
                    };
                }
                m108383a(a);
                return;
            }
            m108384a(context, a);
        }
    }

    @Override // com.ss.android.lark.badge.shortcutbadger.AbstractC29432a
    /* renamed from: a */
    public void mo104317a(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (m108385a(context)) {
            m108387c(context, componentName, i);
        } else {
            m108386b(context, componentName, i);
        }
    }
}
