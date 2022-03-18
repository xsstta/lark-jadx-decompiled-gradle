package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public class AppCompatToggleButton extends ToggleButton {

    /* renamed from: a */
    private final C0452l f1363a;

    public AppCompatToggleButton(Context context) {
        this(context, null);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0422aa.m1768a(this, getContext());
        C0452l lVar = new C0452l(this);
        this.f1363a = lVar;
        lVar.mo2619a(attributeSet, i);
    }
}
