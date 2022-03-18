package com.bytedance.ee.bear.document.toolbar.selectcolor.p322a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.c */
public class C6250c extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private View f17336a;

    /* renamed from: b */
    private Bitmap f17337b;

    /* renamed from: c */
    private int f17338c;

    /* renamed from: d */
    private int f17339d;

    /* renamed from: e */
    private int f17340e;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25215a(View view) {
        this.f17336a = view;
    }

    /* renamed from: a */
    private int m25122a(RecyclerView recyclerView) {
        return ((GridLayoutManager) recyclerView.getLayoutManager()).mo6502b();
    }

    public C6250c(Context context) {
        Resources resources = context.getResources();
        this.f17338c = resources.getDimensionPixelSize(R.dimen.toolbar_color_item_shadow_size);
        this.f17339d = resources.getDimensionPixelSize(R.dimen.toolbar_color_item_horizontal_margin);
        this.f17340e = resources.getDimensionPixelSize(R.dimen.toolbar_color_item_vertical_margin);
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, R.drawable.sheet_item_shadow);
        this.f17337b = decodeResource;
        int i = this.f17338c;
        this.f17337b = Bitmap.createScaledBitmap(decodeResource, i, i, true);
    }

    /* renamed from: a */
    private boolean m25123a(int i, int i2) {
        if (i % i2 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m25124b(int i, int i2) {
        if ((i + 1) % i2 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m25125c(int i, int i2) {
        if (i / i2 == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        View view = this.f17336a;
        if (view != null) {
            int left = view.getLeft();
            int top = this.f17336a.getTop();
            canvas.drawBitmap(this.f17337b, (float) (left - ((this.f17337b.getWidth() - this.f17336a.getWidth()) / 2)), (float) (top - ((this.f17337b.getHeight() - this.f17336a.getHeight()) / 2)), (Paint) null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        if (recyclerView != null && recyclerView.getLayoutParams() != null) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int a = m25122a(recyclerView);
            int i3 = 0;
            if (m25123a(childAdapterPosition, a)) {
                i = this.f17339d;
            } else {
                i = 0;
            }
            rect.left = i;
            if (m25125c(childAdapterPosition, a)) {
                i2 = this.f17340e;
            } else {
                i2 = 0;
            }
            rect.top = i2;
            if (m25124b(childAdapterPosition, a)) {
                i3 = this.f17339d;
            }
            rect.right = i3;
            rect.bottom = this.f17340e;
        }
    }
}
