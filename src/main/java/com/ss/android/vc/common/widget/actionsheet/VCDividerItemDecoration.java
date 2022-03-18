package com.ss.android.vc.common.widget.actionsheet;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ttvecamera.p3038g.C60375c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J(\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\nJ\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\bJ\u000e\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0003J\u000e\u0010#\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/vc/common/widget/actionsheet/VCDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "orientation", "", "(I)V", "mBounds", "Landroid/graphics/Rect;", "mDivider", "Landroid/graphics/drawable/Drawable;", "mDrawLastOne", "", "mLeft", "mOrientation", "drawHorizontal", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "drawVertical", "getDrawCount", "getItemOffsets", "outRect", "view", "Landroid/view/View;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDraw", C60375c.f150914a, "setDrawLastOne", "drawLastOne", "setDrawable", "drawable", "setLeft", "left", "setOrientation", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.widget.a.d */
public final class VCDividerItemDecoration extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    public static final Companion f152198a = new Companion(null);

    /* renamed from: b */
    private Drawable f152199b;

    /* renamed from: c */
    private int f152200c;

    /* renamed from: d */
    private int f152201d;

    /* renamed from: e */
    private final Rect f152202e = new Rect();

    /* renamed from: f */
    private boolean f152203f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/common/widget/actionsheet/VCDividerItemDecoration$Companion;", "", "()V", "HORIZONTAL", "", "VERTICAL", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo208608a(int i) {
        this.f152200c = i;
    }

    /* renamed from: a */
    public final void mo208609a(Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        this.f152199b = drawable;
    }

    public VCDividerItemDecoration(int i) {
        this.f152201d = i;
    }

    /* renamed from: a */
    private final int m236445a(RecyclerView recyclerView) {
        if (this.f152203f) {
            return recyclerView.getChildCount();
        }
        return recyclerView.getChildCount() - 1;
    }

    /* renamed from: a */
    public final void mo208610a(boolean z) {
        this.f152203f = z;
    }

    /* renamed from: a */
    private final void m236446a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        Drawable drawable = this.f152199b;
        if (drawable != null) {
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingLeft() + this.f152200c;
                i = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                i2 = this.f152200c;
                i = recyclerView.getWidth();
            }
            int a = m236445a(recyclerView);
            for (int i3 = 0; i3 < a; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.f152202e);
                int i4 = this.f152202e.bottom;
                Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
                int a2 = i4 + C69029a.m265653a(childAt.getTranslationY());
                drawable.setBounds(i2, a2 - drawable.getIntrinsicHeight(), i, a2);
                drawable.draw(canvas);
            }
            canvas.restore();
        }
    }

    /* renamed from: b */
    private final void m236447b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        Drawable drawable = this.f152199b;
        if (drawable != null) {
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingTop();
                i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
            } else {
                i = recyclerView.getHeight();
                i2 = 0;
            }
            int a = m236445a(recyclerView);
            for (int i3 = 0; i3 < a; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.getDecoratedBoundsWithMargins(childAt, this.f152202e);
                }
                int i4 = this.f152202e.right;
                Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
                int a2 = i4 + C69029a.m265653a(childAt.getTranslationX());
                drawable.setBounds(a2 - drawable.getIntrinsicWidth(), i2, a2, i);
                drawable.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkParameterIsNotNull(canvas, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(state, "state");
        if (recyclerView.getLayoutManager() != null && this.f152199b != null) {
            if (this.f152201d == 1) {
                m236446a(canvas, recyclerView);
            } else {
                m236447b(canvas, recyclerView);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkParameterIsNotNull(rect, "outRect");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(state, "state");
        Drawable drawable = this.f152199b;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f152201d == 1) {
            if (drawable == null) {
                Intrinsics.throwNpe();
            }
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            if (drawable == null) {
                Intrinsics.throwNpe();
            }
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
