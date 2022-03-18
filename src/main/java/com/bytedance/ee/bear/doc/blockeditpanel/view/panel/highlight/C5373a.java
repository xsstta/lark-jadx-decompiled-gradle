package com.bytedance.ee.bear.doc.blockeditpanel.view.panel.highlight;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.panel.highlight.a */
public class C5373a extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    public final int f15325a = -1;

    /* renamed from: b */
    private final C5374a f15326b;

    /* renamed from: c */
    private int f15327c;

    /* renamed from: d */
    private int f15328d = -1;

    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.panel.highlight.a$a */
    private static class C5374a {

        /* renamed from: a */
        private final Context f15329a;

        /* renamed from: b */
        private final Paint f15330b = m21879b();

        /* renamed from: c */
        private final Paint f15331c = m21878a();

        /* renamed from: d */
        private final float f15332d;

        /* renamed from: e */
        private final float f15333e;

        /* renamed from: f */
        private final float f15334f;

        /* renamed from: g */
        private final float f15335g;

        /* renamed from: h */
        private final float f15336h;

        /* renamed from: a */
        private Paint m21878a() {
            Paint paint = new Paint(1);
            paint.setColor(UDColorUtils.getColor(this.f15329a, R.color.primary_pri_500));
            paint.setStrokeWidth(this.f15333e);
            paint.setStyle(Paint.Style.STROKE);
            return paint;
        }

        /* renamed from: b */
        private Paint m21879b() {
            Paint paint = new Paint(1);
            paint.setColor(UDColorUtils.getColor(this.f15329a, R.color.bg_body));
            paint.setStrokeWidth(this.f15332d);
            paint.setStyle(Paint.Style.STROKE);
            return paint;
        }

        public C5374a(Context context) {
            this.f15329a = context;
            this.f15332d = UDDimenUtils.m93308a(context, 4);
            this.f15333e = UDDimenUtils.m93308a(context, 3);
            this.f15336h = UDDimenUtils.m93307a(context, 1.5f);
            this.f15334f = UDDimenUtils.m93308a(context, 7);
            this.f15335g = UDDimenUtils.m93308a(context, 7);
        }

        /* renamed from: a */
        public void mo21474a(Canvas canvas, int i, int i2, int i3, int i4) {
            RectF rectF = new RectF((float) i, (float) i2, (float) i3, (float) i4);
            float f = this.f15334f;
            canvas.drawRoundRect(rectF, f, f, this.f15330b);
        }

        /* renamed from: b */
        public void mo21475b(Canvas canvas, int i, int i2, int i3, int i4) {
            float f = this.f15336h;
            RectF rectF = new RectF(((float) i) - f, ((float) i2) - f, ((float) i3) + f, ((float) i4) + f);
            float f2 = this.f15335g;
            canvas.drawRoundRect(rectF, f2, f2, this.f15331c);
        }
    }

    /* renamed from: a */
    public void mo21472a(int i) {
        this.f15327c = i;
    }

    /* renamed from: b */
    public void mo21473b(int i) {
        this.f15328d = i;
    }

    public C5373a(Context context) {
        this.f15326b = new C5374a(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        GridLayoutManager gridLayoutManager;
        View childAt;
        super.onDrawOver(canvas, recyclerView, state);
        if (this.f15328d != -1 && (gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager()) != null && (childAt = gridLayoutManager.getChildAt(this.f15328d)) != null) {
            int left = childAt.getLeft();
            int top = childAt.getTop();
            int right = childAt.getRight();
            int bottom = childAt.getBottom();
            this.f15326b.mo21474a(canvas, left, top, right, bottom);
            this.f15326b.mo21475b(canvas, left, top, right, bottom);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.left = this.f15327c;
        rect.top = this.f15327c;
    }
}
