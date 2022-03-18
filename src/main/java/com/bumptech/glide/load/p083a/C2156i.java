package com.bumptech.glide.load.p083a;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.a.i */
public class C2156i extends AbstractC2162l<ParcelFileDescriptor> {
    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo10481a() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10483a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    public C2156i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ParcelFileDescriptor mo10484b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
