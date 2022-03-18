package com.ss.android.lark.widget.p2936e;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;

/* renamed from: com.ss.android.lark.widget.e.c */
public abstract class AbstractC58438c extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private Paint f143875a;

    /* renamed from: b */
    private Context f143876b;

    /* renamed from: a */
    public abstract C58436a mo188247a(int i);

    public AbstractC58438c(Context context) {
        this.f143876b = context;
        Paint paint = new Paint(1);
        this.f143875a = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            C58436a a = mo188247a(((RecyclerView.LayoutParams) childAt.getLayoutParams()).getViewLayoutPosition());
            if (a != null) {
                if (a.mo197836a().mo197845c()) {
                    m226538c(childAt, canvas, recyclerView, a.mo197836a().mo197846d(), UIUtils.dp2px(this.f143876b, a.mo197836a().mo197847e()), UIUtils.dp2px(this.f143876b, a.mo197836a().mo197843a()), UIUtils.dp2px(this.f143876b, a.mo197836a().mo197844b()));
                }
                if (a.mo197837b().mo197845c()) {
                    m226537b(childAt, canvas, recyclerView, a.f143868b.mo197846d(), UIUtils.dp2px(this.f143876b, a.mo197837b().mo197847e()), UIUtils.dp2px(this.f143876b, a.mo197837b().mo197843a()), UIUtils.dp2px(this.f143876b, a.mo197837b().mo197844b()));
                }
                if (a.mo197838c().mo197845c()) {
                    m226539d(childAt, canvas, recyclerView, a.mo197838c().mo197846d(), UIUtils.dp2px(this.f143876b, a.mo197838c().mo197847e()), UIUtils.dp2px(this.f143876b, a.mo197838c().mo197843a()), UIUtils.dp2px(this.f143876b, a.mo197838c().mo197844b()));
                }
                if (a.mo197839d().mo197845c()) {
                    m226536a(childAt, canvas, recyclerView, a.mo197839d().mo197846d(), UIUtils.dp2px(this.f143876b, a.mo197839d().mo197847e()), UIUtils.dp2px(this.f143876b, a.mo197839d().mo197843a()), UIUtils.dp2px(this.f143876b, a.mo197839d().mo197844b()));
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        C58436a a = mo188247a(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition());
        if (a == null) {
            a = new C58437b().mo197840a();
        }
        int i4 = 0;
        if (a.mo197836a().mo197845c()) {
            i = UIUtils.dp2px(this.f143876b, a.mo197836a().mo197847e());
        } else {
            i = 0;
        }
        if (a.mo197837b().mo197845c()) {
            i2 = UIUtils.dp2px(this.f143876b, a.mo197837b().mo197847e());
        } else {
            i2 = 0;
        }
        if (a.mo197838c().mo197845c()) {
            i3 = UIUtils.dp2px(this.f143876b, a.mo197838c().mo197847e());
        } else {
            i3 = 0;
        }
        if (a.mo197839d().mo197845c()) {
            i4 = UIUtils.dp2px(this.f143876b, a.mo197839d().mo197847e());
        }
        rect.set(i, i2, i3, i4);
    }

    /* renamed from: a */
    private void m226536a(View view, Canvas canvas, RecyclerView recyclerView, int i, int i2, int i3, int i4) {
        int i5;
        if (i3 <= 0) {
            i3 = -i2;
        }
        if (i4 <= 0) {
            i5 = i2;
        } else {
            i5 = -i4;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        int left = (view.getLeft() - layoutParams.leftMargin) + i3;
        int right = view.getRight() + layoutParams.rightMargin + i5;
        int bottom = view.getBottom() + layoutParams.bottomMargin;
        this.f143875a.setColor(i);
        canvas.drawRect((float) left, (float) bottom, (float) right, (float) (i2 + bottom), this.f143875a);
    }

    /* renamed from: b */
    private void m226537b(View view, Canvas canvas, RecyclerView recyclerView, int i, int i2, int i3, int i4) {
        int i5;
        if (i3 <= 0) {
            i3 = -i2;
        }
        if (i4 <= 0) {
            i5 = i2;
        } else {
            i5 = -i4;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        int left = (view.getLeft() - layoutParams.leftMargin) + i3;
        int right = view.getRight() + layoutParams.rightMargin + i5;
        int top = view.getTop() - layoutParams.topMargin;
        this.f143875a.setColor(i);
        canvas.drawRect((float) left, (float) (top - i2), (float) right, (float) top, this.f143875a);
    }

    /* renamed from: c */
    private void m226538c(View view, Canvas canvas, RecyclerView recyclerView, int i, int i2, int i3, int i4) {
        int i5;
        if (i3 <= 0) {
            i3 = -i2;
        }
        if (i4 <= 0) {
            i5 = i2;
        } else {
            i5 = -i4;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        int top = (view.getTop() - layoutParams.topMargin) + i3;
        int bottom = view.getBottom() + layoutParams.bottomMargin + i5;
        int left = view.getLeft() - layoutParams.leftMargin;
        this.f143875a.setColor(i);
        canvas.drawRect((float) (left - i2), (float) top, (float) left, (float) bottom, this.f143875a);
    }

    /* renamed from: d */
    private void m226539d(View view, Canvas canvas, RecyclerView recyclerView, int i, int i2, int i3, int i4) {
        int i5;
        if (i3 <= 0) {
            i3 = -i2;
        }
        if (i4 <= 0) {
            i5 = i2;
        } else {
            i5 = -i4;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        int top = (view.getTop() - layoutParams.topMargin) + i3;
        int bottom = view.getBottom() + layoutParams.bottomMargin + i5;
        int right = view.getRight() + layoutParams.rightMargin;
        this.f143875a.setColor(i);
        canvas.drawRect((float) right, (float) top, (float) (i2 + right), (float) bottom, this.f143875a);
    }
}
