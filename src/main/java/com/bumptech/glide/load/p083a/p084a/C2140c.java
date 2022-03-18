package com.bumptech.glide.load.p083a.p084a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p083a.C2154g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.a.a.c */
public class C2140c implements AbstractC2147d<InputStream> {

    /* renamed from: a */
    private final Uri f7428a;

    /* renamed from: b */
    private final C2144e f7429b;

    /* renamed from: c */
    private InputStream f7430c;

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: c */
    public void mo10490c() {
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public Class<InputStream> mo10481a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: d */
    public DataSource mo10491d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: b */
    public void mo10489b() {
        InputStream inputStream = this.f7430c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: e */
    private InputStream m9332e() throws FileNotFoundException {
        int i;
        InputStream b = this.f7429b.mo10494b(this.f7428a);
        if (b != null) {
            i = this.f7429b.mo10493a(this.f7428a);
        } else {
            i = -1;
        }
        if (i != -1) {
            return new C2154g(b, i);
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.a.a.c$a */
    public static class C2141a implements AbstractC2143d {

        /* renamed from: b */
        private static final String[] f7431b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f7432a;

        C2141a(ContentResolver contentResolver) {
            this.f7432a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p083a.p084a.AbstractC2143d
        /* renamed from: a */
        public Cursor mo10492a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f7432a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f7431b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.a.a.c$b */
    public static class C2142b implements AbstractC2143d {

        /* renamed from: b */
        private static final String[] f7433b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f7434a;

        C2142b(ContentResolver contentResolver) {
            this.f7434a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p083a.p084a.AbstractC2143d
        /* renamed from: a */
        public Cursor mo10492a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f7434a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f7433b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    C2140c(Uri uri, C2144e eVar) {
        this.f7428a = uri;
        this.f7429b = eVar;
    }

    /* renamed from: a */
    public static C2140c m9329a(Context context, Uri uri) {
        return m9330a(context, uri, new C2141a(context.getContentResolver()));
    }

    /* renamed from: b */
    public static C2140c m9331b(Context context, Uri uri) {
        return m9330a(context, uri, new C2142b(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super InputStream> aVar) {
        try {
            InputStream e = m9332e();
            this.f7430c = e;
            aVar.mo10503a(e);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            aVar.mo10502a((Exception) e2);
        }
    }

    /* renamed from: a */
    private static C2140c m9330a(Context context, Uri uri, AbstractC2143d dVar) {
        return new C2140c(uri, new C2144e(ComponentCallbacks2C2115c.m9149b(context).mo10361h().mo10307a(), dVar, ComponentCallbacks2C2115c.m9149b(context).mo10354b(), context.getContentResolver()));
    }
}
