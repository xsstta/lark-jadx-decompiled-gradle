package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: androidx.core.graphics.drawable.d */
class C0777d extends AbstractC0776c {
    public void getOutline(Outline outline) {
        mo4306a();
        outline.setRoundRect(this.f3156b, mo4310b());
    }

    protected C0777d(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.core.graphics.drawable.AbstractC0776c
    /* renamed from: a */
    public void mo4308a(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }
}
