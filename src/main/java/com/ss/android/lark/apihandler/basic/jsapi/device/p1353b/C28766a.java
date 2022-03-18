package com.ss.android.lark.apihandler.basic.jsapi.device.p1353b;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.ss.android.lark.apihandler.basic.jsapi.device.p1353b.C28767b;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.b.a */
public class C28766a extends ContentObserver {

    /* renamed from: a */
    private Uri f72324a;

    /* renamed from: b */
    private C28767b.AbstractC28768a f72325b;

    /* renamed from: c */
    private Context f72326c;

    public void onChange(boolean z) {
        super.onChange(z);
        Log.m165379d("CaptureScreenContent", this.f72324a.toString());
        m105444a(this.f72324a);
    }

    /* renamed from: a */
    private void m105444a(Uri uri) {
        Cursor cursor = null;
        try {
            cursor = this.f72326c.getContentResolver().query(uri, C28767b.f72328b, null, null, "date_added desc limit 1");
            if (cursor == null) {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            } else if (cursor.moveToFirst()) {
                m105445a(cursor.getString(cursor.getColumnIndex("_data")), cursor.getLong(cursor.getColumnIndex("datetaken")));
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
    private boolean m105446b(String str, long j) {
        String lowerCase = str.toLowerCase();
        for (String str2 : C28767b.f72327a) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m105445a(String str, long j) {
        if (m105446b(str, j)) {
            C28767b.AbstractC28768a aVar = this.f72325b;
            if (aVar != null) {
                aVar.mo102240a(str, j);
                Log.m165379d("CaptureScreenContent", str + " " + j);
                return;
            }
            return;
        }
        Log.m165379d("CaptureScreenContent", "Not screenshot event");
    }

    public C28766a(Uri uri, C28767b.AbstractC28768a aVar, Context context) {
        super(null);
        this.f72324a = uri;
        this.f72325b = aVar;
        this.f72326c = context;
    }
}
