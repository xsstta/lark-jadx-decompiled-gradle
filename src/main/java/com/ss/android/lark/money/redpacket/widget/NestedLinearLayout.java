package com.ss.android.lark.money.redpacket.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.NestedScrollingParent2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;

public class NestedLinearLayout extends LinearLayout implements NestedScrollingParent2 {

    /* renamed from: a */
    private int f121260a;

    /* renamed from: b */
    private int f121261b;

    /* renamed from: c */
    private int f121262c;

    /* renamed from: d */
    private AbstractC48190a f121263d;

    /* renamed from: e */
    private View f121264e;

    /* renamed from: f */
    private View f121265f;

    /* renamed from: g */
    private int f121266g;

    /* renamed from: h */
    private int f121267h;

    /* renamed from: com.ss.android.lark.money.redpacket.widget.NestedLinearLayout$a */
    public interface AbstractC48190a {
        /* renamed from: a */
        void mo168643a(int i);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f121264e = findViewById(R.id.content_root);
        this.f121265f = findViewById(R.id.red_packet_record_list);
    }

    public NestedLinearLayout(Context context) {
        super(context);
    }

    public void setScrollListener(AbstractC48190a aVar) {
        this.f121263d = aVar;
    }

    public void setFixHeaderHeight(int i) {
        this.f121262c = Math.max(i, 0);
    }

    public void setMinScrollTop(int i) {
        this.f121261b = Math.max(i, 0);
    }

    public NestedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i2 + this.f121266g;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f121264e.getLayoutParams();
        this.f121264e.layout(layoutParams.leftMargin + i, i5, i3 - layoutParams.rightMargin, this.f121264e.getMeasuredHeight() + i5);
        int measuredHeight = i5 + this.f121264e.getMeasuredHeight() + layoutParams.bottomMargin;
        if (this.f121265f.getVisibility() != 8) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f121265f.getLayoutParams();
            this.f121265f.layout(i + layoutParams2.leftMargin, layoutParams2.topMargin + measuredHeight, i3 - layoutParams2.rightMargin, i4);
            if (this.f121266g == 0) {
                this.f121260a = measuredHeight;
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        boolean z;
        boolean z2;
        int i4;
        RecyclerView recyclerView = (RecyclerView) view;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == recyclerView.getAdapter().getItemCount() - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i3 == 0) {
            this.f121267h = i2;
        } else if (i3 == 1 && this.f121267h * i2 < 0) {
            iArr[1] = i2;
            return;
        }
        if (this.f121261b > this.f121264e.getBottom()) {
            this.f121261b = 0;
        }
        int max = Math.max(this.f121262c, this.f121261b);
        if (i2 > 0 && this.f121264e.getBottom() > max && !z2) {
            if (this.f121264e.getBottom() - max <= i2) {
                i2 = this.f121264e.getBottom() - max;
            }
            this.f121264e.offsetTopAndBottom(i2 * -1);
            View view2 = this.f121265f;
            view2.layout(view2.getLeft(), this.f121265f.getTop() - i2, this.f121265f.getRight(), this.f121265f.getBottom());
            iArr[1] = i2;
            this.f121266g -= i2;
        } else if (i2 < 0 && z && this.f121264e.getBottom() < (i4 = this.f121260a)) {
            int min = Math.min(i4 - this.f121264e.getBottom(), i2 * -1);
            this.f121264e.offsetTopAndBottom(min);
            View view3 = this.f121265f;
            view3.layout(view3.getLeft(), this.f121265f.getTop() + min, this.f121265f.getRight(), this.f121265f.getBottom());
            iArr[1] = min * -1;
            this.f121266g += min;
        }
        AbstractC48190a aVar = this.f121263d;
        if (aVar != null) {
            aVar.mo168643a(this.f121266g);
        }
    }
}
