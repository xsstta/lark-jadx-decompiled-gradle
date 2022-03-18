package com.google.android.material.p980a;

import android.util.Property;
import android.view.ViewGroup;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.a.d */
public class C22119d extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f53785a = new C22119d("childrenAlpha");

    private C22119d(String str) {
        super(Float.class, str);
    }

    /* renamed from: a */
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    /* renamed from: a */
    public void set(ViewGroup viewGroup, Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
