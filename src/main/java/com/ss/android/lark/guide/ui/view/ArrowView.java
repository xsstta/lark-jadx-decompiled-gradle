package com.ss.android.lark.guide.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.suite.R;

public class ArrowView extends View {

    /* renamed from: a */
    private int f99538a = getContext().getResources().getColor(R.color.primary_pri_400);

    /* renamed from: b */
    private int f99539b = 48;

    /* renamed from: c */
    private Drawable f99540c;

    public void setAnchorGravity(int i) {
        this.f99539b = i;
    }

    public void setFillColor(int i) {
        this.f99538a = i;
    }

    public ArrowView(Context context) {
        super(context);
        Drawable drawable = getContext().getDrawable(R.drawable.ic_guide_arrow);
        this.f99540c = drawable;
        drawable.setTint(this.f99538a);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r2 != 8388613) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r7) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.guide.ui.view.ArrowView.onDraw(android.graphics.Canvas):void");
    }

    public ArrowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable = getContext().getDrawable(R.drawable.ic_guide_arrow);
        this.f99540c = drawable;
        drawable.setTint(this.f99538a);
    }

    public ArrowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable = getContext().getDrawable(R.drawable.ic_guide_arrow);
        this.f99540c = drawable;
        drawable.setTint(this.f99538a);
    }
}
