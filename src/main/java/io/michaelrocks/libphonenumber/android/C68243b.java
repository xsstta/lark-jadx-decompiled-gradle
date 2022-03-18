package io.michaelrocks.libphonenumber.android;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: io.michaelrocks.libphonenumber.android.b */
public class C68243b implements AbstractC68245d {

    /* renamed from: a */
    private final AssetManager f171504a;

    public C68243b(AssetManager assetManager) {
        this.f171504a = assetManager;
    }

    @Override // io.michaelrocks.libphonenumber.android.AbstractC68245d
    /* renamed from: a */
    public InputStream mo237420a(String str) {
        try {
            return this.f171504a.open(str.substring(1));
        } catch (IOException unused) {
            return null;
        }
    }
}
