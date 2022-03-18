package com.scwang.smartrefresh.layout.footer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.header.FalsifyHeader;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27128g;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1237d.C27144b;

public class FalsifyFooter extends FalsifyHeader implements AbstractC27125d {
    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27125d
    /* renamed from: a */
    public void mo30336a(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27125d
    /* renamed from: a */
    public boolean mo30338a(boolean z) {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27125d
    /* renamed from: b */
    public void mo30339b(float f, int i, int i2, int i3) {
    }

    public FalsifyFooter(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.scwang.smartrefresh.layout.header.FalsifyHeader
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
            textView.setText(getClass().getSimpleName() + " 虚假区域\n运行时代表上拉Footer的高度【" + C27144b.m98679b((float) getHeight()) + "dp】\n而不会显示任何东西");
            textView.setTextColor(1157627903);
            textView.setGravity(17);
            textView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            textView.layout(0, 0, getWidth(), getHeight());
            textView.draw(canvas);
        }
    }

    public FalsifyFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FalsifyFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.scwang.smartrefresh.layout.header.FalsifyHeader, com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30299a(AbstractC27128g gVar, int i, int i2) {
        super.mo30299a(gVar, i, i2);
        gVar.mo96459a().mo96410k(false);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27125d
    /* renamed from: a */
    public void mo30337a(AbstractC27129h hVar, int i, int i2) {
        if (this.f67538a != null) {
            this.f67538a.mo96458a(RefreshState.None);
            this.f67538a.mo96458a(RefreshState.LoadFinish);
        }
    }
}
