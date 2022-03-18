package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;

public final class mcl extends mck {

    /* renamed from: a */
    private String f58674a;

    /* renamed from: b */
    private Bitmap f58675b;

    public mcl(String str) {
        mcq.m86886b("AssetBitmapDescriptor", "AssetBitmapDescriptor assetName: ".concat(String.valueOf(str)));
        this.f58674a = str;
    }

    @Override // com.huawei.hms.maps.mck
    /* renamed from: a */
    public final Bitmap mo84271a(Context context) {
        String str;
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeStream(context.getAssets().open(this.f58674a));
            this.f58675b = bitmap;
            return bitmap;
        } catch (IOException e) {
            str = "generateBitmap IOException: " + e.toString();
            mcq.m86889e("AssetBitmapDescriptor", str);
            return bitmap;
        } catch (OutOfMemoryError unused) {
            str = "generateBitmap OutOfMemoryError: ";
            mcq.m86889e("AssetBitmapDescriptor", str);
            return bitmap;
        }
    }
}
