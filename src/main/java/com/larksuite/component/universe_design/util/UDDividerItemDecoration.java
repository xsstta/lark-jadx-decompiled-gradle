package com.larksuite.component.universe_design.util;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J(\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J \u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/larksuite/component/universe_design/util/UDDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "orientation", "", "(I)V", "mBounds", "Landroid/graphics/Rect;", "mDivider", "Landroid/graphics/drawable/Drawable;", "mDrawLastOne", "", "mOrientation", "drawHorizontal", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "drawVertical", "getDrawCount", "getItemOffsets", "outRect", "view", "Landroid/view/View;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDraw", C60375c.f150914a, "setDrawLastOne", "drawLastOne", "setDrawable", "drawable", "setOrientation", "Companion", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.util.g */
public final class UDDividerItemDecoration extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    public static final Companion f63888a = new Companion(null);

    /* renamed from: b */
    private Drawable f63889b;

    /* renamed from: c */
    private int f63890c;

    /* renamed from: d */
    private final Rect f63891d = new Rect();

    /* renamed from: e */
    private boolean f63892e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/universe_design/util/UDDividerItemDecoration$Companion;", "", "()V", "HORIZONTAL", "", "VERTICAL", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.util.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo91840a(boolean z) {
        this.f63892e = z;
    }

    /* renamed from: a */
    public final void mo91839a(Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        this.f63889b = drawable;
    }

    public UDDividerItemDecoration(int i) {
        this.f63890c = i;
    }

    /* renamed from: a */
    private final int m93314a(RecyclerView recyclerView) {
        if (this.f63892e) {
            return recyclerView.getChildCount();
        }
        return recyclerView.getChildCount() - 1;
    }

    /* renamed from: a */
    private final void m93315a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        Drawable drawable = this.f63889b;
        if (drawable != null) {
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingLeft();
                i = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                i = recyclerView.getWidth();
                i2 = 0;
            }
            int a = m93314a(recyclerView);
            for (int i3 = 0; i3 < a; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.f63891d);
                int i4 = this.f63891d.bottom;
                Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
                int a2 = i4 + C69029a.m265653a(childAt.getTranslationY());
                drawable.setBounds(i2, a2 - drawable.getIntrinsicHeight(), i, a2);
                drawable.draw(canvas);
            }
            canvas.restore();
        }
    }

    /* renamed from: b */
    private final void m93316b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        Drawable drawable = this.f63889b;
        if (drawable != null) {
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingTop();
                i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
            } else {
                i = recyclerView.getHeight();
                i2 = 0;
            }
            int a = m93314a(recyclerView);
            for (int i3 = 0; i3 < a; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.getDecoratedBoundsWithMargins(childAt, this.f63891d);
                }
                int i4 = this.f63891d.right;
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
        if (recyclerView.getLayoutManager() != null && this.f63889b != null) {
            if (this.f63890c == 1) {
                m93315a(canvas, recyclerView);
            } else {
                m93316b(canvas, recyclerView);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkParameterIsNotNull(rect, "outRect");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(state, "state");
        Drawable drawable = this.f63889b;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f63890c == 1) {
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
