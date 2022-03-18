package com.ss.android.lark.browser.biz.basic.jsapi.device.p1417b;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.ss.android.lark.browser.biz.basic.jsapi.device.p1417b.C29700b;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.b.a */
public class C29699a extends ContentObserver {

    /* renamed from: a */
    private Uri f74392a;

    /* renamed from: b */
    private C29700b.AbstractC29701a f74393b;

    /* renamed from: c */
    private Context f74394c;

    public void onChange(boolean z) {
        super.onChange(z);
        Log.m165379d("CaptureScreenContent", this.f74392a.toString());
        m109881a(this.f74392a);
    }

    /* renamed from: a */
    private void m109881a(Uri uri) {
        Cursor cursor = null;
        try {
            cursor = this.f74394c.getContentResolver().query(uri, C29700b.f74396b, null, null, "date_added desc limit 1");
            if (cursor == null) {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            } else if (cursor.moveToFirst()) {
                m109882a(cursor.getString(cursor.getColumnIndex("_data")), cursor.getLong(cursor.getColumnIndex("datetaken")));
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

    /* renamed from: b */
    private boolean m109883b(String str, long j) {
        String lowerCase = str.toLowerCase();
        for (String str2 : C29700b.f74395a) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m109882a(String str, long j) {
        if (m109883b(str, j)) {
            C29700b.AbstractC29701a aVar = this.f74393b;
            if (aVar != null) {
                aVar.mo106993a(str, j);
                Log.m165379d("CaptureScreenContent", str + " " + j);
                return;
            }
            return;
        }
        Log.m165379d("CaptureScreenContent", "Not screenshot event");
    }

    public C29699a(Uri uri, C29700b.AbstractC29701a aVar, Context context) {
        super(null);
        this.f74392a = uri;
        this.f74393b = aVar;
        this.f74394c = context;
    }
}
