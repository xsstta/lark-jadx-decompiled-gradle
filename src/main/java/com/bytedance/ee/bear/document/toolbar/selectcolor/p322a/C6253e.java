package com.bytedance.ee.bear.document.toolbar.selectcolor.p322a;

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

/* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.e */
public class C6253e extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    public final int f17346a = -1;

    /* renamed from: b */
    private final C6254a f17347b;

    /* renamed from: c */
    private int f17348c;

    /* renamed from: d */
    private int f17349d;

    /* renamed from: e */
    private int f17350e = -1;

    /* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.e$a */
    private static class C6254a {

        /* renamed from: a */
        private final Context f17351a;

        /* renamed from: b */
        private final Paint f17352b = m25136b();

        /* renamed from: c */
        private final Paint f17353c = m25135a();

        /* renamed from: d */
        private final float f17354d;

        /* renamed from: e */
        private final float f17355e;

        /* renamed from: f */
        private final float f17356f;

        /* renamed from: g */
        private final float f17357g;

        /* renamed from: h */
        private final float f17358h;

        /* renamed from: a */
        private Paint m25135a() {
            Paint paint = new Paint(1);
            paint.setColor(UDColorUtils.getColor(this.f17351a, R.color.primary_pri_500));
            paint.setStrokeWidth(this.f17355e);
            paint.setStyle(Paint.Style.STROKE);
            return paint;
        }

        /* renamed from: b */
        private Paint m25136b() {
            Paint paint = new Paint(1);
            paint.setColor(UDColorUtils.getColor(this.f17351a, R.color.bg_float));
            paint.setStrokeWidth(this.f17354d);
            paint.setStyle(Paint.Style.STROKE);
            return paint;
        }

        public C6254a(Context context) {
            this.f17351a = context;
            this.f17354d = UDDimenUtils.m93308a(context, 4);
            this.f17355e = UDDimenUtils.m93308a(context, 3);
            this.f17358h = UDDimenUtils.m93307a(context, 1.5f);
            this.f17356f = UDDimenUtils.m93308a(context, 7);
            this.f17357g = UDDimenUtils.m93308a(context, 7);
        }

        /* renamed from: a */
        public void mo25218a(Canvas canvas, int i, int i2, int i3, int i4) {
            RectF rectF = new RectF((float) i, (float) i2, (float) i3, (float) i4);
            float f = this.f17356f;
            canvas.drawRoundRect(rectF, f, f, this.f17352b);
        }

        /* renamed from: b */
        public void mo25219b(Canvas canvas, int i, int i2, int i3, int i4) {
            float f = this.f17358h;
            RectF rectF = new RectF(((float) i) - f, ((float) i2) - f, ((float) i3) + f, ((float) i4) + f);
            float f2 = this.f17357g;
            canvas.drawRoundRect(rectF, f2, f2, this.f17353c);
        }
    }

    /* renamed from: a */
    public void mo25216a(int i) {
        this.f17349d = i;
    }

    /* renamed from: b */
    public void mo25217b(int i) {
        this.f17350e = i;
    }

    public C6253e(Context context, int i) {
        this.f17348c = i;
        this.f17347b = new C6254a(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        View childAt;
        super.onDrawOver(canvas, recyclerView, state);
        if (this.f17350e != -1 && (childAt = ((GridLayoutManager) recyclerView.getLayoutManager()).getChildAt(this.f17350e)) != null) {
            int left = childAt.getLeft();
            int top = childAt.getTop();
            int right = childAt.getRight();
            int bottom = childAt.getBottom();
            this.f17347b.mo25218a(canvas, left, top, right, bottom);
            this.f17347b.mo25219b(canvas, left, top, right, bottom);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        recyclerView.getChildAdapterPosition(view);
        rect.left = this.f17349d;
        rect.top = this.f17349d;
    }
}
