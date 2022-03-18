package com.lynx.component.svg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;

/* renamed from: com.lynx.component.svg.b */
public class C26427b extends AppCompatImageView {
    /* renamed from: a */
    private void m95734a() {
        ViewCompat.m4033a(this, 1, (Paint) null);
    }

    public C26427b(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        m95734a();
        super.setImageDrawable(drawable);
    }
}
