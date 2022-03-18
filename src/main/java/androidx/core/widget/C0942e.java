package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.e */
public class C0942e {
    /* renamed from: a */
    public static ColorStateList m4550a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof AbstractC0950m) {
            return ((AbstractC0950m) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* renamed from: b */
    public static PorterDuff.Mode m4553b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof AbstractC0950m) {
            return ((AbstractC0950m) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* renamed from: a */
    public static void m4551a(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof AbstractC0950m) {
            ((AbstractC0950m) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m4552a(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintMode(mode);
            if (Build.VERSION.SDK_INT == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof AbstractC0950m) {
            ((AbstractC0950m) imageView).setSupportImageTintMode(mode);
        }
    }
}
