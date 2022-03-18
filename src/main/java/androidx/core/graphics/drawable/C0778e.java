package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.view.C0904f;

/* renamed from: androidx.core.graphics.drawable.e */
public final class C0778e {

    /* renamed from: androidx.core.graphics.drawable.e$a */
    private static class C0779a extends AbstractC0776c {
        C0779a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.graphics.drawable.AbstractC0776c
        /* renamed from: a */
        public void mo4308a(int i, int i2, int i3, Rect rect, Rect rect2) {
            C0904f.m4352a(i, i2, i3, rect, rect2, 0);
        }
    }

    /* renamed from: a */
    public static AbstractC0776c m3793a(Resources resources, Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0777d(resources, bitmap);
        }
        return new C0779a(resources, bitmap);
    }
}
