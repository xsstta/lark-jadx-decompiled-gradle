package com.larksuite.component.openplatform.core.plugin.device;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.larksuite.component.openplatform.core.plugin.device.C24866p;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.k */
public class C24839k extends ContentObserver {

    /* renamed from: a */
    private Uri f60982a;

    /* renamed from: b */
    private C24866p.AbstractC24867a f60983b;

    public void onChange(boolean z) {
        super.onChange(z);
        Log.d("MediaContentObserver", this.f60982a.toString());
        m89956a(this.f60982a);
    }

    /* renamed from: a */
    private void m89956a(Uri uri) {
        Cursor cursor = null;
        try {
            cursor = AppbrandContext.getInst().getApplicationContext().getContentResolver().query(uri, C24866p.f61022b, null, null, "date_added desc limit 1");
            if (cursor == null) {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            } else if (cursor.moveToFirst()) {
                m89957a(cursor.getString(cursor.getColumnIndex("_data")), cursor.getLong(cursor.getColumnIndex("datetaken")));
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

    public C24839k(Uri uri, C24866p.AbstractC24867a aVar) {
        super(null);
        this.f60982a = uri;
        this.f60983b = aVar;
    }

    /* renamed from: b */
    private boolean m89958b(String str, long j) {
        String lowerCase = str.toLowerCase();
        for (String str2 : C24866p.f61021a) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m89957a(String str, long j) {
        if (m89958b(str, j)) {
            C24866p.AbstractC24867a aVar = this.f60983b;
            if (aVar != null) {
                aVar.mo87871a(str, j);
                Log.d("MediaContentObserver", str + " " + j);
                return;
            }
            return;
        }
        Log.d("MediaContentObserver", "Not screenshot event");
    }
}
