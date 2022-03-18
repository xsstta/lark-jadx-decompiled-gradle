package com.scwang.smartrefresh.layout.header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27126e;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27128g;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1237d.C27144b;

public class FalsifyHeader extends View implements AbstractC27126e {

    /* renamed from: a */
    protected AbstractC27128g f67538a;

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public int mo30297a(AbstractC27129h hVar, boolean z) {
        return 0;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30298a(float f, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27141e
    /* renamed from: a */
    public void mo30300a(AbstractC27129h hVar, RefreshState refreshState, RefreshState refreshState2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public boolean mo30301a() {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: b */
    public void mo30304b(AbstractC27129h hVar, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void b_(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public View getView() {
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public void setPrimaryColors(int... iArr) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public SpinnerStyle getSpinnerStyle() {
        return SpinnerStyle.Translate;
    }

    public FalsifyHeader(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode()) {
            int a = C27144b.m98678a(5.0f);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(1157627903);
            paint.setStrokeWidth((float) C27144b.m98678a(1.0f));
            float f = (float) a;
            paint.setPathEffect(new DashPathEffect(new float[]{f, f, f, f}, 1.0f));
            canvas.drawRect(f, f, (float) (getWidth() - a), (float) (getBottom() - a), paint);
            TextView textView = new TextView(getContext());
            textView.setText(getClass().getSimpleName() + " 虚假区域\n运行时代表下拉Header的高度【" + C27144b.m98679b((float) getHeight()) + "dp】\n而不会显示任何东西");
            textView.setTextColor(1157627903);
            textView.setGravity(17);
            textView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            textView.layout(0, 0, getWidth(), getHeight());
            textView.draw(canvas);
        }
    }

    public FalsifyHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize(getSuggestedMinimumWidth(), i), resolveSize(getSuggestedMinimumHeight(), i2));
    }

    public FalsifyHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30299a(AbstractC27128g gVar, int i, int i2) {
        this.f67538a = gVar;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(AbstractC27129h hVar, int i, int i2) {
        AbstractC27128g gVar = this.f67538a;
        if (gVar != null) {
            gVar.mo96458a(RefreshState.None);
            this.f67538a.mo96458a(RefreshState.RefreshFinish);
        }
    }
}
