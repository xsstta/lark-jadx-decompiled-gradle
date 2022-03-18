package com.ss.android.lark.eetroublecapture.contentprovider;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.ss.android.lark.eetroublebase.Log;
import com.ss.android.lark.eetroublebase.p1826a.C36966c;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.eetroublecapture.contentprovider.b */
public class C36976b {

    /* renamed from: a */
    private Context f95067a;

    /* renamed from: b */
    private Map<String, Set<AbstractC36979a>> f95068b = new ConcurrentHashMap();

    /* renamed from: c */
    private String f95069c;

    /* renamed from: com.ss.android.lark.eetroublecapture.contentprovider.b$a */
    public interface AbstractC36979a {
        /* renamed from: a */
        void mo136472a(String str, String str2);
    }

    /* renamed from: a */
    private void m145969a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public Uri mo136483a(String str) {
        return new C36980c(this.f95067a).mo136492a().mo136495b(this.f95069c).mo136494a(str).mo136493a();
    }

    /* renamed from: a */
    public void mo136484a(Uri uri) {
        Cursor cursor = null;
        try {
            cursor = this.f95067a.getContentResolver().query(uri, null, null, null, null);
            while (cursor != null && cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndex("COLUMN_KEY"));
                String string2 = cursor.getString(cursor.getColumnIndex("COLUMN_VALUE"));
                Set<AbstractC36979a> set = this.f95068b.get(string);
                if (set != null) {
                    for (AbstractC36979a aVar : set) {
                        aVar.mo136472a(string, string2);
                    }
                }
            }
        } catch (Exception e) {
            Log.m145906a("CaptureSP notifyObservables error", e);
        } catch (Throwable th) {
            m145969a((Closeable) null);
            throw th;
        }
        m145969a(cursor);
    }

    /* renamed from: a */
    public void mo136487a(Map<String, String> map) {
        if (!(map == null || map.isEmpty())) {
            ContentResolver contentResolver = this.f95067a.getContentResolver();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("COLUMN_KEY", entry.getKey());
                contentValues.put("COLUMN_VALUE", entry.getValue());
                try {
                    contentResolver.insert(mo136483a(entry.getKey()), contentValues);
                } catch (Exception e) {
                    Log.m145906a("CaptureSP put error", e);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo136488b(String str, String str2) {
        mo136487a(Collections.singletonMap(str, str2));
    }

    public C36976b(Context context, String str) {
        this.f95067a = context;
        this.f95069c = str;
    }

    /* renamed from: a */
    public void mo136486a(final String str, final String str2) {
        C36966c.m145950a(new Runnable() {
            /* class com.ss.android.lark.eetroublecapture.contentprovider.C36976b.RunnableC369782 */

            public void run() {
                C36976b.this.mo136488b(str, str2);
            }
        });
    }

    /* renamed from: a */
    public void mo136485a(final String str, AbstractC36979a aVar) {
        if (str == null) {
            Log.m145907b("CaptureSP registerObserver key is null");
            return;
        }
        Set<AbstractC36979a> set = this.f95068b.get(str);
        if (set != null) {
            set.add(aVar);
            return;
        }
        Set<AbstractC36979a> synchronizedSet = Collections.synchronizedSet(new HashSet());
        synchronizedSet.add(aVar);
        this.f95068b.put(str, synchronizedSet);
        this.f95067a.getContentResolver().registerContentObserver(mo136483a(str), true, new ContentObserver(C36966c.m145946a()) {
            /* class com.ss.android.lark.eetroublecapture.contentprovider.C36976b.C369771 */

            public void onChange(boolean z) {
                onChange(z, null);
            }

            public void onChange(boolean z, Uri uri) {
                if (uri == null) {
                    uri = C36976b.this.mo136483a(str);
                }
                C36976b.this.mo136484a(uri);
            }
        });
    }
}
