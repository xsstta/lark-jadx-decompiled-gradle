package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* renamed from: androidx.core.view.q */
public interface AbstractC0915q {
    ColorStateList getSupportBackgroundTintList();

    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(ColorStateList colorStateList);

    void setSupportBackgroundTintMode(PorterDuff.Mode mode);
}
