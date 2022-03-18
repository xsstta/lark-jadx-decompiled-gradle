package com.google.android.libraries.places.api.net;

import android.graphics.Bitmap;

public abstract class FetchPhotoResponse {
    public abstract Bitmap getBitmap();

    public static FetchPhotoResponse newInstance(Bitmap bitmap) {
        return new zzc(bitmap);
    }
}
