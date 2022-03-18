package pl.droidsonroids.gif;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.larksuite.suite.R;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: pl.droidsonroids.gif.e */
public final class C70155e {

    /* renamed from: a */
    static final List<String> f175271a = Arrays.asList("raw", "drawable", "mipmap");

    /* access modifiers changed from: package-private */
    /* renamed from: pl.droidsonroids.gif.e$a */
    public static class C70156a extends C70157b {

        /* renamed from: a */
        final int f175272a;

        /* renamed from: b */
        final int f175273b;

        C70156a() {
        }

        /* renamed from: a */
        private static int m268951a(ImageView imageView, AttributeSet attributeSet, boolean z) {
            String str;
            if (z) {
                str = "src";
            } else {
                str = "background";
            }
            int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", str, 0);
            if (attributeResourceValue > 0) {
                if (!C70155e.f175271a.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) || C70155e.m268950a(imageView, z, attributeResourceValue)) {
                    return 0;
                }
                return attributeResourceValue;
            }
            return 0;
        }

        C70156a(ImageView imageView, AttributeSet attributeSet, int i, int i2) {
            super(imageView, attributeSet, i, i2);
            this.f175272a = m268951a(imageView, attributeSet, true);
            this.f175273b = m268951a(imageView, attributeSet, false);
        }
    }

    /* renamed from: pl.droidsonroids.gif.e$b */
    static class C70157b {

        /* renamed from: c */
        boolean f175274c;

        /* renamed from: d */
        final int f175275d;

        C70157b() {
            this.f175275d = -1;
        }

        C70157b(View view, AttributeSet attributeSet, int i, int i2) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.freezesAnimation, R.attr.loopCount}, i, i2);
            this.f175274c = obtainStyledAttributes.getBoolean(0, false);
            this.f175275d = obtainStyledAttributes.getInt(1, -1);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    static void m268948a(int i, Drawable drawable) {
        if (drawable instanceof C70149c) {
            ((C70149c) drawable).mo247271a(i);
        }
    }

    /* renamed from: a */
    static boolean m268949a(ImageView imageView, Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            imageView.setImageDrawable(new C70149c(imageView.getContext().getContentResolver(), uri));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    static float m268946a(Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.density;
        if (i2 == 0) {
            i2 = 160;
        } else if (i2 == 65535) {
            i2 = 0;
        }
        int i3 = resources.getDisplayMetrics().densityDpi;
        if (i2 <= 0 || i3 <= 0) {
            return 1.0f;
        }
        return ((float) i3) / ((float) i2);
    }

    /* renamed from: a */
    static boolean m268950a(ImageView imageView, boolean z, int i) {
        Resources resources = imageView.getResources();
        if (resources != null) {
            try {
                if (!f175271a.contains(resources.getResourceTypeName(i))) {
                    return false;
                }
                C70149c cVar = new C70149c(resources, i);
                if (z) {
                    imageView.setImageDrawable(cVar);
                    return true;
                }
                imageView.setBackground(cVar);
                return true;
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    static C70156a m268947a(ImageView imageView, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet == null || imageView.isInEditMode()) {
            return new C70156a();
        }
        C70156a aVar = new C70156a(imageView, attributeSet, i, i2);
        int i3 = aVar.f175275d;
        if (i3 >= 0) {
            m268948a(i3, imageView.getDrawable());
            m268948a(i3, imageView.getBackground());
        }
        return aVar;
    }
}
