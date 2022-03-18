package com.ss.android.lark.calendar.impl.features.common.widget.calendar.base;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.C31185a;
import com.ss.android.lark.calendar.impl.utils.C32670u;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.b */
public abstract class AbstractC31172b extends LinearLayout implements AbstractC31174d {

    /* renamed from: a */
    protected C31185a f78785a;

    /* renamed from: b */
    protected Context f78786b;

    /* renamed from: c */
    protected int f78787c;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public void mo112924a() {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    private void setupLayoutResource(int i) {
        View inflate = C32670u.m125362a(getContext()).inflate(i, this);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public AbstractC31172b(Context context, int i) {
        super(context);
        setupLayoutResource(i);
        this.f78786b = context;
        this.f78787c = i;
    }

    /* renamed from: b */
    private int m116364b(Canvas canvas, C31185a aVar) {
        int width = canvas.getWidth() / 7;
        return (aVar.mo112994g() * width) + ((width - getMeasuredWidth()) / 2);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31174d
    /* renamed from: a */
    public void mo112925a(Canvas canvas, C31185a aVar) {
        this.f78785a = aVar;
        mo112924a();
        int save = canvas.save();
        canvas.translate((float) m116364b(canvas, aVar), (float) (aVar.mo112993f() * getMeasuredHeight()));
        draw(canvas);
        canvas.restoreToCount(save);
    }
}
