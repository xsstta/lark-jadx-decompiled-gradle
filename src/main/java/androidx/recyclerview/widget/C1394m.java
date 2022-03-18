package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.m */
class C1394m {

    /* renamed from: a */
    boolean f4935a = true;

    /* renamed from: b */
    int f4936b;

    /* renamed from: c */
    int f4937c;

    /* renamed from: d */
    int f4938d;

    /* renamed from: e */
    int f4939e;

    /* renamed from: f */
    int f4940f;

    /* renamed from: g */
    int f4941g;

    /* renamed from: h */
    boolean f4942h;

    /* renamed from: i */
    boolean f4943i;

    C1394m() {
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4936b + ", mCurrentPosition=" + this.f4937c + ", mItemDirection=" + this.f4938d + ", mLayoutDirection=" + this.f4939e + ", mStartLine=" + this.f4940f + ", mEndLine=" + this.f4941g + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo7447a(RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(this.f4937c);
        this.f4937c += this.f4938d;
        return viewForPosition;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7448a(RecyclerView.State state) {
        int i = this.f4937c;
        if (i < 0 || i >= state.getItemCount()) {
            return false;
        }
        return true;
    }
}
