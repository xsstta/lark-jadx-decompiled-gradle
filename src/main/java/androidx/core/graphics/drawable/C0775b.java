package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a2\u0010\b\u001a\u00020\t*\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\b\b\u0003\u0010\r\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"toBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "updateBounds", "", "left", "top", "right", "bottom", "core-ktx_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: androidx.core.graphics.drawable.b */
public final class C0775b {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        if (r0.getConfig() == r9) goto L_0x001d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap m3782a(android.graphics.drawable.Drawable r6, int r7, int r8, android.graphics.Bitmap.Config r9) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.C0775b.m3782a(android.graphics.drawable.Drawable, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static /* synthetic */ Bitmap m3783a(Drawable drawable, int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        if ((i3 & 4) != 0) {
            config = null;
        }
        return m3782a(drawable, i, i2, config);
    }
}
