package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public final class mct extends mck {

    /* renamed from: a */
    private String f58686a;

    /* renamed from: b */
    private Bitmap f58687b;

    public mct(String str) {
        this.f58686a = str;
    }

    /* renamed from: a */
    private static Bitmap m86898a(String str) {
        mcq.m86886b("PathBitmapDescriptor", "getBitmapFromPath: ");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = 5;
        try {
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError unused) {
            mcq.m86889e("PathBitmapDescriptor", "generateBitmap OutOfMemoryError: ");
            return null;
        }
    }

    @Override // com.huawei.hms.maps.mck
    /* renamed from: a */
    public final Bitmap mo84271a(Context context) {
        Bitmap a = m86898a(this.f58686a);
        this.f58687b = a;
        return a;
    }
}
