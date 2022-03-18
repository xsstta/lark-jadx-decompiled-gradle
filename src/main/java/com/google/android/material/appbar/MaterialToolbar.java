package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.android.material.shape.C22394h;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.p992a.C22497a;
import com.larksuite.suite.R;

public class MaterialToolbar extends Toolbar {

    /* renamed from: e */
    private static final int f53857e = 2131887411;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C22394h.m81147a(this);
    }

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C22394h.m81148a(this, f);
    }

    /* renamed from: a */
    private void m79780a(Context context) {
        int i;
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            if (background != null) {
                i = ((ColorDrawable) background).getColor();
            } else {
                i = 0;
            }
            materialShapeDrawable.mo77973g(ColorStateList.valueOf(i));
            materialShapeDrawable.mo77965a(context);
            materialShapeDrawable.mo77985r(ViewCompat.m4104s(this));
            ViewCompat.m4039a(this, materialShapeDrawable);
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C22497a.m81662a(context, attributeSet, i, f53857e), attributeSet, i);
        m79780a(getContext());
    }
}
