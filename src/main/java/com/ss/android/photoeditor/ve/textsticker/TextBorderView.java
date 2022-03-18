package com.ss.android.photoeditor.ve.textsticker;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.larksuite.suite.R;
import com.ss.android.ttve.utils.C60275a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0018\u001a\u00020\tJ\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J&\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tJ.\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/photoeditor/ve/textsticker/TextBorderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "border", "getBorder", "()Landroid/widget/FrameLayout;", "setBorder", "(Landroid/widget/FrameLayout;)V", "dotPadding", "dotWidth", "drawBottomMargin", "drawLeftMargin", "drawRightMargin", "drawTopMargin", "layoutId", "padding", "getTextOutPadding", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setPaddingLazy", "left", "top", "right", "bottom", "setSizeAndCenterPosition", "w", C14002h.f36692e, "x", "y", "angle", "", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class TextBorderView extends FrameLayout {

    /* renamed from: a */
    private final int f149325a;

    /* renamed from: b */
    private FrameLayout f149326b;

    /* renamed from: c */
    private int f149327c;

    /* renamed from: d */
    private int f149328d;

    /* renamed from: e */
    private int f149329e;

    /* renamed from: f */
    private int f149330f;

    /* renamed from: g */
    private int f149331g;

    /* renamed from: h */
    private int f149332h;

    /* renamed from: i */
    private int f149333i;

    public final FrameLayout getBorder() {
        return this.f149326b;
    }

    public final int getTextOutPadding() {
        return this.f149329e + (this.f149328d / 2) + this.f149327c;
    }

    public final void setBorder(FrameLayout frameLayout) {
        this.f149326b = frameLayout;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i = this.f149330f;
        if ((i > 0 || this.f149331g > 0 || this.f149332h > 0 || this.f149333i > 0) && canvas != null) {
            try {
                canvas.clipRect(i, this.f149332h, getWidth() - this.f149331g, getHeight() - this.f149333i);
            } catch (Exception unused) {
            }
        }
        super.onDraw(canvas);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextBorderView(Context context) {
        super(context);
        if (context == null) {
            Intrinsics.throwNpe();
        }
        this.f149325a = R.layout.ve_edit_text_border_view;
        View.inflate(getContext(), R.layout.ve_edit_text_border_view, this);
        this.f149326b = (FrameLayout) findViewById(R.id.ve_image_edit_border);
        setWillNotDraw(false);
        this.f149327c = (int) C60275a.m234185a(getContext(), 18.0f);
        this.f149328d = (int) C60275a.m234185a(getContext(), 16.0f);
        this.f149329e = (int) C60275a.m234185a(getContext(), 7.0f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (context == null) {
            Intrinsics.throwNpe();
        }
        this.f149325a = R.layout.ve_edit_text_border_view;
        View.inflate(getContext(), R.layout.ve_edit_text_border_view, this);
        this.f149326b = (FrameLayout) findViewById(R.id.ve_image_edit_border);
        setWillNotDraw(false);
        this.f149327c = (int) C60275a.m234185a(getContext(), 18.0f);
        this.f149328d = (int) C60275a.m234185a(getContext(), 16.0f);
        this.f149329e = (int) C60275a.m234185a(getContext(), 7.0f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (context == null) {
            Intrinsics.throwNpe();
        }
        this.f149325a = R.layout.ve_edit_text_border_view;
        View.inflate(getContext(), R.layout.ve_edit_text_border_view, this);
        this.f149326b = (FrameLayout) findViewById(R.id.ve_image_edit_border);
        setWillNotDraw(false);
        this.f149327c = (int) C60275a.m234185a(getContext(), 18.0f);
        this.f149328d = (int) C60275a.m234185a(getContext(), 16.0f);
        this.f149329e = (int) C60275a.m234185a(getContext(), 7.0f);
    }

    /* renamed from: a */
    public final void mo204052a(int i, int i2, int i3, int i4, float f) {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayout = this.f149326b;
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
            marginLayoutParams2.width = (this.f149327c * 2) + i + this.f149328d + (this.f149329e * 2);
            marginLayoutParams2.height = (this.f149327c * 2) + i2 + this.f149328d + (this.f149329e * 2);
            marginLayoutParams2.leftMargin = (((i3 - (i / 2)) - this.f149327c) - (this.f149328d / 2)) - this.f149329e;
            marginLayoutParams2.topMargin = (((i4 - (i2 / 2)) - this.f149327c) - (this.f149328d / 2)) - this.f149329e;
            FrameLayout frameLayout2 = this.f149326b;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(marginLayoutParams2);
            }
            FrameLayout frameLayout3 = this.f149326b;
            if (frameLayout3 != null) {
                frameLayout3.setRotation(f);
            }
        }
    }
}
