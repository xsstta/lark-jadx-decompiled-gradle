package com.lynx.tasm.behavior.ui.background;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* renamed from: com.lynx.tasm.behavior.ui.background.c */
public abstract class AbstractC26753c extends Drawable {

    /* renamed from: a */
    private Path f66332a;

    /* renamed from: a */
    public abstract void mo53843a(int i, int i2);

    /* renamed from: a */
    public void mo95162a(Bitmap.Config config) {
    }

    /* renamed from: a */
    public abstract boolean mo53845a();

    /* renamed from: b */
    public abstract int mo53846b();

    /* renamed from: c */
    public abstract int mo53847c();

    /* renamed from: d */
    public abstract void mo53848d();

    /* renamed from: e */
    public abstract void mo53850e();

    public int getOpacity() {
        return -2;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: h */
    public Path mo95165h() {
        return this.f66332a;
    }

    /* renamed from: a */
    public void mo95163a(Path path) {
        this.f66332a = path;
    }
}
