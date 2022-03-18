package com.bytedance.ee.bear.service.remote;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.ee.bear.service.C10934g;
import com.bytedance.ee.bear.service.base.C10916c;
import com.bytedance.ee.log.C13479a;

public class TokenContentProvider extends ContentProvider {

    /* renamed from: a */
    private Cursor f29439a;

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        C13479a.m54764b("TokenContentProvider", "onCreate process = " + C10916c.m45406a(getContext()));
        this.f29439a = BinderCursor.makeCursor(new TokenCenterBinder());
        return true;
    }

    /* renamed from: a */
    public static Uri m45467a(Context context, String str) {
        return Uri.parse("content://" + context.getPackageName() + ".TOKEN_CENTER." + str);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C13479a.m54764b("TokenContentProvider", "query: called, cursor = " + this.f29439a);
        C10934g.m45448a();
        return this.f29439a;
    }
}
