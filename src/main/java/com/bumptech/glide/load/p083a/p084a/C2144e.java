package com.bumptech.glide.load.p083a.p084a;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C2168b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.a.a.e */
class C2144e {

    /* renamed from: a */
    private static final C2138a f7435a = new C2138a();

    /* renamed from: b */
    private final C2138a f7436b;

    /* renamed from: c */
    private final AbstractC2143d f7437c;

    /* renamed from: d */
    private final AbstractC2278b f7438d;

    /* renamed from: e */
    private final ContentResolver f7439e;

    /* renamed from: f */
    private final List<ImageHeaderParser> f7440f;

    /* renamed from: a */
    private boolean m9341a(File file) {
        if (!this.f7436b.mo10486a(file) || 0 >= this.f7436b.mo10487b(file)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f A[Catch:{ all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m9342c(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            com.bumptech.glide.load.a.a.d r2 = r6.f7437c     // Catch:{ SecurityException -> 0x0026, all -> 0x0024 }
            android.database.Cursor r2 = r2.mo10492a(r7)     // Catch:{ SecurityException -> 0x0026, all -> 0x0024 }
            if (r2 == 0) goto L_0x001e
            boolean r3 = r2.moveToFirst()     // Catch:{ SecurityException -> 0x001c }
            if (r3 == 0) goto L_0x001e
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch:{ SecurityException -> 0x001c }
            if (r2 == 0) goto L_0x001b
            r2.close()
        L_0x001b:
            return r7
        L_0x001c:
            r3 = move-exception
            goto L_0x0028
        L_0x001e:
            if (r2 == 0) goto L_0x0023
            r2.close()
        L_0x0023:
            return r1
        L_0x0024:
            r7 = move-exception
            goto L_0x004b
        L_0x0026:
            r3 = move-exception
            r2 = r1
        L_0x0028:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x0043
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            r4.append(r7)     // Catch:{ all -> 0x0049 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0049 }
            android.util.Log.d(r0, r7, r3)     // Catch:{ all -> 0x0049 }
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r2.close()
        L_0x0048:
            return r1
        L_0x0049:
            r7 = move-exception
            r1 = r2
        L_0x004b:
            if (r1 == 0) goto L_0x0050
            r1.close()
        L_0x0050:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p083a.p084a.C2144e.m9342c(android.net.Uri):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo10493a(Uri uri) {
        InputStream inputStream = null;
        try {
            inputStream = this.f7439e.openInputStream(uri);
            int b = C2168b.m9431b(this.f7440f, inputStream, this.f7438d);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return b;
        } catch (IOException | NullPointerException e) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    public InputStream mo10494b(Uri uri) throws FileNotFoundException {
        String c = m9342c(uri);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        File a = this.f7436b.mo10485a(c);
        if (!m9341a(a)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(a);
        try {
            return this.f7439e.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }

    C2144e(List<ImageHeaderParser> list, AbstractC2143d dVar, AbstractC2278b bVar, ContentResolver contentResolver) {
        this(list, f7435a, dVar, bVar, contentResolver);
    }

    C2144e(List<ImageHeaderParser> list, C2138a aVar, AbstractC2143d dVar, AbstractC2278b bVar, ContentResolver contentResolver) {
        this.f7436b = aVar;
        this.f7437c = dVar;
        this.f7438d = bVar;
        this.f7439e = contentResolver;
        this.f7440f = list;
    }
}
