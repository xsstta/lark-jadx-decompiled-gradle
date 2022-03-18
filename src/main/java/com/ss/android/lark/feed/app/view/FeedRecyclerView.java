package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/feed/app/view/FeedRecyclerView;", "Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "finalMaxFlingVelocity", "initialMaxFlingVelocity", "fling", "", "velocityX", "velocityY", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FeedRecyclerView extends CommonRecyclerView {

    /* renamed from: a */
    private int f97322a;

    /* renamed from: b */
    private int f97323b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.FeedRecyclerView$a */
    static final class RunnableC37938a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FeedRecyclerView f97324a;

        /* renamed from: b */
        final /* synthetic */ int f97325b;

        /* renamed from: c */
        final /* synthetic */ int f97326c;

        RunnableC37938a(FeedRecyclerView feedRecyclerView, int i, int i2) {
            this.f97324a = feedRecyclerView;
            this.f97325b = i;
            this.f97326c = i2;
        }

        public final void run() {
            FeedRecyclerView.super.fling(this.f97326c, this.f97325b);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FeedRecyclerView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FeedRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        if (Math.abs(i2) <= getMaxFlingVelocity() / 2) {
            return super.fling(i, i2);
        }
        int i3 = this.f97322a;
        int max = Math.max(-i3, Math.min(i2, i3));
        int i4 = this.f97322a;
        int i5 = this.f97323b;
        if (i4 < i5) {
            int i6 = i4 + 2000;
            this.f97322a = i6;
            if (i6 > i5) {
                this.f97322a = i5;
            }
        }
        post(new RunnableC37938a(this, max, i));
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        requestDisallowInterceptTouchEvent(true);
        int maxFlingVelocity = (int) (((double) getMaxFlingVelocity()) * 0.5d);
        int maxFlingVelocity2 = (int) (((double) getMaxFlingVelocity()) * 0.8d);
        if (Build.VERSION.SDK_INT < 23) {
            this.f97322a = maxFlingVelocity;
            this.f97323b = maxFlingVelocity;
        } else if (Build.VERSION.SDK_INT <= 26) {
            this.f97322a = maxFlingVelocity;
            this.f97323b = maxFlingVelocity2;
        } else {
            this.f97322a = maxFlingVelocity2;
            this.f97323b = getMaxFlingVelocity();
        }
    }
}
