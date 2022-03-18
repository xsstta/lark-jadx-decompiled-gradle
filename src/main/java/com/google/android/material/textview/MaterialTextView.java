package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.p988i.C22312b;
import com.google.android.material.p988i.C22313c;
import com.google.android.material.theme.p992a.C22497a;
import com.larksuite.suite.R;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static boolean m81654a(Context context) {
        return C22312b.m80792a(context, (int) R.attr.textAppearanceLineHeightEnabled, true);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m81654a(context)) {
            m81653a(context.getTheme(), i);
        }
    }

    /* renamed from: a */
    private void m81653a(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, new int[]{16844159, R.attr.lineHeight});
        int a = m81651a(getContext(), obtainStyledAttributes, 0, 1);
        obtainStyledAttributes.recycle();
        if (a >= 0) {
            setLineHeight(a);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    private static int m81651a(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C22313c.m80793a(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C22497a.m81662a(context, attributeSet, i, i2), attributeSet, i);
        int a;
        Context context2 = getContext();
        if (m81654a(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (!m81655a(context2, theme, attributeSet, i, i2) && (a = m81652a(theme, attributeSet, i, i2)) != -1) {
                m81653a(theme, a);
            }
        }
    }

    /* renamed from: a */
    private static int m81652a(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, new int[]{16842804, 16844159, R.attr.lineHeight}, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: a */
    private static boolean m81655a(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, new int[]{16842804, 16844159, R.attr.lineHeight}, i, i2);
        int a = m81651a(context, obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (a != -1) {
            return true;
        }
        return false;
    }
}
