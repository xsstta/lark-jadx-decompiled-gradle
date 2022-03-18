package com.bumptech.glide.load.p083a;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.a.l */
public abstract class AbstractC2162l<T> implements AbstractC2147d<T> {

    /* renamed from: a */
    private final Uri f7465a;

    /* renamed from: b */
    private final ContentResolver f7466b;

    /* renamed from: c */
    private T f7467c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10483a(T t) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo10484b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: c */
    public void mo10490c() {
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: d */
    public DataSource mo10491d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: b */
    public void mo10489b() {
        T t = this.f7467c;
        if (t != null) {
            try {
                mo10483a(t);
            } catch (IOException unused) {
            }
        }
    }

    public AbstractC2162l(ContentResolver contentResolver, Uri uri) {
        this.f7466b = contentResolver;
        this.f7465a = uri;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public final void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super T> aVar) {
        try {
            T b = mo10484b(this.f7465a, this.f7466b);
            this.f7467c = b;
            aVar.mo10503a((Object) b);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.mo10502a((Exception) e);
        }
    }
}
