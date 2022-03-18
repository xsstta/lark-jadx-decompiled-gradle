package com.ss.android.lark.mail.impl.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.mail.impl.widget.a */
public class C43992a extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private int f111655a;

    /* renamed from: b */
    private int f111656b;

    /* renamed from: c */
    private int f111657c;

    /* renamed from: d */
    private Paint f111658d;

    /* renamed from: com.ss.android.lark.mail.impl.widget.a$a */
    public static class C43994a {

        /* renamed from: a */
        private Resources f111659a;

        /* renamed from: b */
        private int f111660b;

        /* renamed from: c */
        private int f111661c = 0;

        /* renamed from: d */
        private int f111662d = 0;

        /* renamed from: e */
        private int f111663e = -16777216;

        /* renamed from: a */
        public C43992a mo156555a() {
            return new C43992a(this.f111660b, this.f111661c, this.f111662d, this.f111663e);
        }

        /* renamed from: d */
        public C43994a mo156558d(int i) {
            this.f111663e = i;
            return this;
        }

        /* renamed from: a */
        public C43994a mo156554a(int i) {
            this.f111660b = this.f111659a.getDimensionPixelSize(i);
            return this;
        }

        /* renamed from: b */
        public C43994a mo156556b(int i) {
            this.f111661c = this.f111659a.getDimensionPixelSize(i);
            return this;
        }

        /* renamed from: c */
        public C43994a mo156557c(int i) {
            mo156558d(this.f111659a.getColor(i));
            return this;
        }

        public C43994a(Context context) {
            this.f111659a = context.getResources();
            this.f111660b = (int) TypedValue.applyDimension(0, 1.0f, context.getResources().getDisplayMetrics());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom();
            if (recyclerView instanceof HeaderFooterRecyclerView) {
                HeaderFooterRecyclerView headerFooterRecyclerView = (HeaderFooterRecyclerView) recyclerView;
                if (headerFooterRecyclerView.mo156541d()) {
                    int childAdapterPosition = headerFooterRecyclerView.getChildAdapterPosition(childAt);
                    if (childAdapterPosition >= headerFooterRecyclerView.getHeadersCount()) {
                        if (childAdapterPosition >= headerFooterRecyclerView.getHeadersCount() + headerFooterRecyclerView.getItemCount()) {
                        }
                    }
                }
            }
            int i2 = this.f111655a + bottom;
            int left = childAt.getLeft() + this.f111656b;
            int translationY = (int) (childAt.getTranslationY() + 0.5f);
            canvas.save();
            canvas.drawRect((float) left, (float) (bottom + translationY), (float) (childAt.getRight() - this.f111657c), (float) (i2 + translationY), this.f111658d);
            canvas.restore();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.set(0, 0, 0, this.f111655a);
    }

    private C43992a(int i, int i2, int i3, int i4) {
        this.f111655a = i;
        this.f111656b = i2;
        this.f111657c = i3;
        Paint paint = new Paint();
        this.f111658d = paint;
        paint.setColor(i4);
    }
}
