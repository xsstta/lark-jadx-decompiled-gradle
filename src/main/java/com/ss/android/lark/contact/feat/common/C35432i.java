package com.ss.android.lark.contact.feat.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;

/* renamed from: com.ss.android.lark.contact.feat.common.i */
public class C35432i extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private int f91604a;

    /* renamed from: b */
    private Paint f91605b;

    /* renamed from: c */
    private boolean f91606c;

    /* renamed from: a */
    public void mo130762a(boolean z) {
        this.f91606c = z;
    }

    public C35432i(Context context, int i, int i2) {
        this.f91604a = UIUtils.dp2px(context, (float) i);
        Paint paint = new Paint();
        this.f91605b = paint;
        paint.setColor(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        if (this.f91606c && recyclerView.getChildCount() > 0) {
            View childAt = recyclerView.getChildAt(0);
            canvas.drawRect((float) childAt.getLeft(), (float) (childAt.getTop() - this.f91604a), (float) childAt.getId(), (float) childAt.getTop(), this.f91605b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        RecyclerView.ViewHolder childViewHolder;
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.f91606c && (childViewHolder = recyclerView.getChildViewHolder(view)) != null && childViewHolder.getAdapterPosition() == 0) {
            rect.set(0, this.f91604a, 0, 0);
        }
    }
}
