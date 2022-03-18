package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;

public abstract class mck {

    /* renamed from: a */
    private Bitmap f58673a;

    /* renamed from: a */
    public abstract Bitmap mo84271a(Context context);

    /* renamed from: b */
    public final Bitmap mo84272b(Context context) {
        if (this.f58673a == null) {
            synchronized (this) {
                if (this.f58673a == null) {
                    this.f58673a = mo84271a(context);
                }
            }
        }
        return this.f58673a;
    }
}
