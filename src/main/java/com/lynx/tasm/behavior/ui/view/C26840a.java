package com.lynx.tasm.behavior.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.lynx.tasm.behavior.ui.AbstractC26746a;

/* renamed from: com.lynx.tasm.behavior.ui.view.a */
public class C26840a extends ViewGroup implements AbstractC26746a.AbstractC26747a {

    /* renamed from: a */
    private String f66665a;

    /* renamed from: b */
    private AbstractC26746a f66666b;

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public String getImpressionId() {
        return this.f66665a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public boolean hasOverlappingRendering() {
        AbstractC26746a aVar = this.f66666b;
        if (aVar != null) {
            return aVar.mo95133f();
        }
        return super.hasOverlappingRendering();
    }

    public C26840a(Context context) {
        super(context);
    }

    @Override // com.lynx.tasm.behavior.ui.AbstractC26746a.AbstractC26747a
    public void bindDrawChildHook(AbstractC26746a aVar) {
        this.f66666b = aVar;
    }

    public void setChildrenDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setImpressionId(String str) {
        this.f66665a = str;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        AbstractC26746a aVar = this.f66666b;
        if (aVar != null) {
            aVar.mo95123a(canvas);
        }
        super.dispatchDraw(canvas);
        AbstractC26746a aVar2 = this.f66666b;
        if (aVar2 != null) {
            aVar2.mo95128b(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        AbstractC26746a aVar = this.f66666b;
        if (aVar != null) {
            return aVar.mo95119a(i, i2);
        }
        return super.getChildDrawingOrder(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        Rect rect;
        boolean z;
        AbstractC26746a aVar = this.f66666b;
        if (aVar != null) {
            rect = aVar.mo95120a(canvas, view, j);
        } else {
            rect = null;
        }
        if (rect != null) {
            canvas.save();
            canvas.clipRect(rect);
            z = super.drawChild(canvas, view, j);
            canvas.restore();
        } else {
            z = super.drawChild(canvas, view, j);
        }
        AbstractC26746a aVar2 = this.f66666b;
        if (aVar2 != null) {
            aVar2.mo95129b(canvas, view, j);
        }
        return z;
    }
}
