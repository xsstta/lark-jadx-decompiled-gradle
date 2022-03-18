package com.bumptech.glide.load.p083a;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.a.a */
public final class C2137a extends AbstractC2162l<AssetFileDescriptor> {
    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public Class<AssetFileDescriptor> mo10481a() {
        return AssetFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10483a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    public C2137a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AssetFileDescriptor mo10484b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
