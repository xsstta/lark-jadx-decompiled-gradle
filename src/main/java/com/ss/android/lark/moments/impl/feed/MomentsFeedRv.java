package com.ss.android.lark.moments.impl.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.moments.impl.feed.AppBarStateChangeListener;
import com.ss.android.lark.moments.impl.feed.MomentsFeedFragment;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0006\u0010\"\u001a\u00020\fJ\u0006\u0010#\u001a\u00020\fJ\u000e\u0010$\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u001eR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/MomentsFeedRv;", "Lcom/ss/android/lark/widget/recyclerview/PointRecoderRecyclerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "enableLoadMore", "", "getEnableLoadMore", "()Z", "setEnableLoadMore", "(Z)V", "enableRefresh", "getEnableRefresh", "setEnableRefresh", "lastX", "", "getLastX", "()F", "setLastX", "(F)V", "lastY", "getLastY", "setLastY", "titleApi", "Lcom/ss/android/lark/moments/impl/feed/TitleApi;", "onTouchEvent", "e", "Landroid/view/MotionEvent;", "ptrEnableLoadMore", "ptrEnableRefresh", "setTitleApi", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsFeedRv extends PointRecoderRecyclerView {

    /* renamed from: a */
    private float f119790a = -1.0f;

    /* renamed from: b */
    private float f119791b = -1.0f;

    /* renamed from: c */
    private boolean f119792c = true;

    /* renamed from: d */
    private boolean f119793d = true;

    /* renamed from: e */
    private TitleApi f119794e;

    /* renamed from: a */
    public final boolean mo166921a() {
        return this.f119792c;
    }

    /* renamed from: b */
    public final boolean mo166922b() {
        return this.f119793d;
    }

    public final boolean getEnableLoadMore() {
        return this.f119792c;
    }

    public final boolean getEnableRefresh() {
        return this.f119793d;
    }

    public final float getLastX() {
        return this.f119790a;
    }

    public final float getLastY() {
        return this.f119791b;
    }

    public final void setEnableLoadMore(boolean z) {
        this.f119792c = z;
    }

    public final void setEnableRefresh(boolean z) {
        this.f119793d = z;
    }

    public final void setLastX(float f) {
        this.f119790a = f;
    }

    public final void setLastY(float f) {
        this.f119791b = f;
    }

    public final void setTitleApi(TitleApi fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "titleApi");
        this.f119794e = fVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsFeedRv(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AppBarStateChangeListener.State a;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (layoutManager != null) {
            MomentsFeedFragment.ScrollLinearLayoutManager scrollLinearLayoutManager = (MomentsFeedFragment.ScrollLinearLayoutManager) layoutManager;
            View findViewByPosition = scrollLinearLayoutManager.findViewByPosition(scrollLinearLayoutManager.findFirstVisibleItemPosition());
            TitleApi fVar = this.f119794e;
            if (fVar == null || (a = fVar.mo165985a()) == null) {
                return super.onTouchEvent(motionEvent);
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (motionEvent.getAction() == 2) {
                if (Math.abs(rawX - this.f119790a) < Math.abs(rawY - this.f119791b)) {
                    if (rawY > this.f119791b) {
                        if (a == AppBarStateChangeListener.State.EXPANDED) {
                            scrollLinearLayoutManager.mo166903a(true);
                            this.f119792c = true;
                            this.f119793d = true;
                        } else if (findViewByPosition == null) {
                            return super.onTouchEvent(motionEvent);
                        } else {
                            if (findViewByPosition.getTop() < 0) {
                                this.f119793d = false;
                            } else {
                                this.f119790a = motionEvent.getRawX();
                                this.f119791b = motionEvent.getRawY();
                                return super.onTouchEvent(motionEvent);
                            }
                        }
                    } else if (a != AppBarStateChangeListener.State.COLLAPSED) {
                        this.f119792c = false;
                        this.f119793d = false;
                        this.f119790a = motionEvent.getRawX();
                        this.f119791b = motionEvent.getRawY();
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            this.f119790a = motionEvent.getRawX();
            this.f119791b = motionEvent.getRawY();
            return super.onTouchEvent(motionEvent);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.feed.MomentsFeedFragment.ScrollLinearLayoutManager");
    }

    public MomentsFeedRv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentsFeedRv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
