package com.larksuite.component.openplatform.plugins.device.usercapture;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.ss.android.lark.log.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.larksuite.component.openplatform.plugins.device.usercapture.a */
public class C25604a extends ContentObserver {

    /* renamed from: a */
    static final String[] f62294a = {"_data", "datetaken"};

    /* renamed from: b */
    static final String[] f62295b = {"screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap", "截屏"};

    /* renamed from: c */
    private Uri f62296c;

    /* renamed from: d */
    private AbstractC25605a f62297d;

    /* renamed from: e */
    private Context f62298e;

    /* renamed from: f */
    private Set<Long> f62299f = new HashSet();

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.plugins.device.usercapture.a$a */
    public interface AbstractC25605a {
        /* renamed from: a */
        void mo88815a(String str, long j);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        Log.m165379d("MediaContentObserver", this.f62296c.toString());
        m91362a(this.f62296c);
    }

    /* renamed from: a */
    private void m91362a(Uri uri) {
        Cursor cursor = null;
        try {
            cursor = this.f62298e.getContentResolver().query(uri, f62294a, null, null, "date_added desc limit 1");
            if (cursor == null) {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            } else if (cursor.moveToFirst()) {
                m91363a(cursor.getString(cursor.getColumnIndex("_data")), cursor.getLong(cursor.getColumnIndex("datetaken")));
                if (cursor == null || cursor.isClosed()) {
                    return;
                }
                cursor.close();
            } else if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        } catch (Exception e) {
            Log.m165384e("MediaContentObserver", "handleMediaContentChange error ", e);
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
    private boolean m91364b(String str, long j) {
        String lowerCase = str.toLowerCase();
        for (String str2 : f62295b) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m91363a(String str, long j) {
        if (this.f62299f.contains(Long.valueOf(j))) {
            Log.m165379d("MediaContentObserver", "media row data has already been handled");
        } else if (!m91364b(str, j)) {
            Log.m165379d("MediaContentObserver", "Not screenshot event");
        } else if (this.f62297d != null) {
            this.f62299f.add(Long.valueOf(j));
            this.f62297d.mo88815a(str, j);
            Log.m165379d("MediaContentObserver", str + " " + j);
        }
    }

    public C25604a(Context context, Uri uri, AbstractC25605a aVar) {
        super(null);
        this.f62298e = context;
        this.f62296c = uri;
        this.f62297d = aVar;
    }
}
