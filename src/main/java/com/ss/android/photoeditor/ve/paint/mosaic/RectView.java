package com.ss.android.photoeditor.ve.paint.mosaic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014R\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/ss/android/photoeditor/ve/paint/mosaic/RectView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "layoutId", "rectArea", "getRectArea", "()Landroid/widget/FrameLayout;", "setRectArea", "(Landroid/widget/FrameLayout;)V", "updateLayoutParams", "", "startPosX", "", "startPosY", "endPosX", "endPosY", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class RectView extends FrameLayout {

    /* renamed from: a */
    private final int f149253a;

    /* renamed from: b */
    private FrameLayout f149254b;

    public final FrameLayout getRectArea() {
        return this.f149254b;
    }

    public final void setRectArea(FrameLayout frameLayout) {
        this.f149254b = frameLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RectView(Context context) {
        super(context);
        if (context == null) {
            Intrinsics.throwNpe();
        }
        this.f149253a = R.layout.ve_rect_view;
        View.inflate(getContext(), R.layout.ve_rect_view, this);
        this.f149254b = (FrameLayout) findViewById(R.id.rect_area);
        setWillNotDraw(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (context == null) {
            Intrinsics.throwNpe();
        }
        this.f149253a = R.layout.ve_rect_view;
        View.inflate(getContext(), R.layout.ve_rect_view, this);
        this.f149254b = (FrameLayout) findViewById(R.id.rect_area);
        setWillNotDraw(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (context == null) {
            Intrinsics.throwNpe();
        }
        this.f149253a = R.layout.ve_rect_view;
        View.inflate(getContext(), R.layout.ve_rect_view, this);
        this.f149254b = (FrameLayout) findViewById(R.id.rect_area);
        setWillNotDraw(false);
    }

    /* renamed from: a */
    public final void mo204017a(float f, float f2, float f3, float f4) {
        ViewGroup.LayoutParams layoutParams;
        float min = Math.min(f, f3);
        float min2 = Math.min(f2, f4);
        float max = Math.max(f, f3);
        float max2 = Math.max(f2, f4);
        FrameLayout frameLayout = this.f149254b;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.width = (int) (max - min);
            marginLayoutParams2.height = (int) (max2 - min2);
            marginLayoutParams2.leftMargin = (int) min;
            marginLayoutParams2.topMargin = (int) min2;
        }
        FrameLayout frameLayout2 = this.f149254b;
        if (frameLayout2 != null) {
            frameLayout2.requestLayout();
        }
    }
}
