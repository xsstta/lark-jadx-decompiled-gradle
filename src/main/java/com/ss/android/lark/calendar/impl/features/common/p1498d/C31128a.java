package com.ss.android.lark.calendar.impl.features.common.p1498d;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.ss.android.lark.calendar.impl.features.common.p1498d.C31129b;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.d.a */
public class C31128a extends ContentObserver {

    /* renamed from: a */
    private Uri f78620a;

    /* renamed from: b */
    private C31129b.AbstractC31130a f78621b;

    /* renamed from: c */
    private Context f78622c;

    public void onChange(boolean z) {
        super.onChange(z);
        m116197a(this.f78620a);
    }

    /* renamed from: a */
    private void m116197a(Uri uri) {
        Cursor cursor = null;
        try {
            cursor = this.f78622c.getContentResolver().query(uri, C31129b.f78624b, null, null, "_id desc limit 1");
            if (cursor == null) {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            } else if (cursor.moveToFirst()) {
                m116198a(cursor.getString(cursor.getColumnIndex("_data")), cursor.getLong(cursor.getColumnIndex("datetaken")));
                if (cursor == null || cursor.isClosed()) {
                    return;
                }
                cursor.close();
            } else if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (0 == 0 || cursor.isClosed()) {
            }
        } catch (Throwable th) {
            if (0 != 0 && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private void m116198a(String str, long j) {
        C31129b.AbstractC31130a aVar;
        if (m116199b(str, j) && (aVar = this.f78621b) != null) {
            aVar.mo112737a(str, j);
        }
    }

    /* renamed from: b */
    private boolean m116199b(String str, long j) {
        String lowerCase = str.toLowerCase();
        for (String str2 : C31129b.f78623a) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public C31128a(Uri uri, C31129b.AbstractC31130a aVar, Context context) {
        super(null);
        this.f78620a = uri;
        this.f78621b = aVar;
        this.f78622c = context;
    }
}
