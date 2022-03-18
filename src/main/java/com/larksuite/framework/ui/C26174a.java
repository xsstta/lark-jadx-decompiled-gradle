package com.larksuite.framework.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.larksuite.framework.ui.a */
public class C26174a extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private int f64650a;

    /* renamed from: b */
    private int f64651b;

    /* renamed from: c */
    private int f64652c;

    /* renamed from: d */
    private Paint f64653d;

    /* renamed from: com.larksuite.framework.ui.a$a */
    public static class C26176a {

        /* renamed from: a */
        private Resources f64654a;

        /* renamed from: b */
        private int f64655b;

        /* renamed from: c */
        private int f64656c = 0;

        /* renamed from: d */
        private int f64657d = 0;

        /* renamed from: e */
        private int f64658e = -16777216;

        /* renamed from: a */
        public C26174a mo93149a() {
            return new C26174a(this.f64655b, this.f64656c, this.f64657d, this.f64658e);
        }

        /* renamed from: f */
        public C26176a mo93155f(int i) {
            this.f64658e = i;
            return this;
        }

        /* renamed from: b */
        public C26176a mo93151b(int i) {
            mo93152c(i);
            mo93153d(i);
            return this;
        }

        /* renamed from: a */
        public C26176a mo93147a(float f) {
            this.f64655b = (int) TypedValue.applyDimension(0, f, this.f64654a.getDisplayMetrics());
            return this;
        }

        /* renamed from: b */
        public C26176a mo93150b(float f) {
            this.f64656c = (int) TypedValue.applyDimension(0, f, this.f64654a.getDisplayMetrics());
            return this;
        }

        /* renamed from: c */
        public C26176a mo93152c(int i) {
            this.f64656c = this.f64654a.getDimensionPixelSize(i);
            return this;
        }

        /* renamed from: d */
        public C26176a mo93153d(int i) {
            this.f64657d = this.f64654a.getDimensionPixelSize(i);
            return this;
        }

        /* renamed from: e */
        public C26176a mo93154e(int i) {
            mo93155f(this.f64654a.getColor(i));
            return this;
        }

        /* renamed from: a */
        public C26176a mo93148a(int i) {
            this.f64655b = this.f64654a.getDimensionPixelSize(i);
            return this;
        }

        public C26176a(Context context) {
            this.f64654a = context.getResources();
            this.f64655b = (int) TypedValue.applyDimension(0, 1.0f, context.getResources().getDisplayMetrics());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom();
            int i2 = this.f64650a + bottom;
            int left = childAt.getLeft() + this.f64651b;
            int translationY = (int) (childAt.getTranslationY() + 0.5f);
            canvas.save();
            canvas.drawRect((float) left, (float) (bottom + translationY), (float) (childAt.getRight() - this.f64652c), (float) (i2 + translationY), this.f64653d);
            canvas.restore();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.set(0, 0, 0, this.f64650a);
    }

    private C26174a(int i, int i2, int i3, int i4) {
        this.f64650a = i;
        this.f64651b = i2;
        this.f64652c = i3;
        Paint paint = new Paint();
        this.f64653d = paint;
        paint.setColor(i4);
    }
}
