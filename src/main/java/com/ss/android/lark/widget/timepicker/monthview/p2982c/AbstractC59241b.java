package com.ss.android.lark.widget.timepicker.monthview.p2982c;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.lark.widget.timepicker.monthview.AbstractC59229a;
import com.ss.android.lark.widget.timepicker.monthview.data.C59243a;

/* renamed from: com.ss.android.lark.widget.timepicker.monthview.c.b */
public abstract class AbstractC59241b extends LinearLayout implements AbstractC59229a {

    /* renamed from: d */
    protected C59243a f147113d;

    /* renamed from: e */
    protected Context f147114e;

    /* renamed from: f */
    protected int f147115f;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public void mo201389a() {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    private void setupLayoutResource(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(i, this);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public AbstractC59241b(Context context, int i) {
        super(context);
        setupLayoutResource(i);
        this.f147114e = context;
        this.f147115f = i;
    }

    /* renamed from: b */
    private int m230076b(Canvas canvas, C59243a aVar) {
        int width = canvas.getWidth() / 7;
        return (aVar.mo201453f() * width) + ((width - getMeasuredWidth()) / 2);
    }

    @Override // com.ss.android.lark.widget.timepicker.monthview.AbstractC59229a
    /* renamed from: a */
    public void mo201361a(Canvas canvas, C59243a aVar) {
        this.f147113d = aVar;
        mo201389a();
        int save = canvas.save();
        canvas.translate((float) m230076b(canvas, aVar), (float) (aVar.mo201452e() * getMeasuredHeight()));
        draw(canvas);
        canvas.restoreToCount(save);
    }
}
