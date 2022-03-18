package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.C1936j;
import com.android.volley.toolbox.C1970l;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class zzah extends C1970l {
    private final /* synthetic */ Map zza;

    @Override // com.android.volley.Request
    public final Map<String, String> getHeaders() {
        return this.zza;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzah(zzad zzad, String str, C1936j.AbstractC1938b bVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, C1936j.AbstractC1937a aVar, Map map) {
        super(str, bVar, 0, 0, scaleType, config, aVar);
        this.zza = map;
    }
}
