package com.ss.android.lark.multitask.floating;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u001a\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0015\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/multitask/floating/CustomView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "priority", "", "key", "", "drawable", "Landroid/graphics/drawable/Drawable;", "(Landroid/content/Context;ILjava/lang/String;Landroid/graphics/drawable/Drawable;)V", "heightValue", "getHeightValue", "()I", "setHeightValue", "(I)V", "imageView", "Landroid/widget/ImageView;", "getKey", "()Ljava/lang/String;", "getPriority", "widthValue", "getWidthValue", "setWidthValue", "initClickListener", "", "clickHandler", "Ljava/lang/Runnable;", "Companion", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.floating.g */
public final class CustomView extends FrameLayout {

    /* renamed from: a */
    public static final Companion f121669a = new Companion(null);

    /* renamed from: b */
    private int f121670b = 64;

    /* renamed from: c */
    private int f121671c = 48;

    /* renamed from: d */
    private final ImageView f121672d;

    /* renamed from: e */
    private final int f121673e;

    /* renamed from: f */
    private final String f121674f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/multitask/floating/CustomView$Companion;", "", "()V", "DEFAULT_CUSTOM_HEIGHT", "", "DEFAULT_CUSTOM_WIDTH", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getHeightValue() {
        return this.f121671c;
    }

    public final String getKey() {
        return this.f121674f;
    }

    public final int getPriority() {
        return this.f121673e;
    }

    public final int getWidthValue() {
        return this.f121670b;
    }

    public final void setHeightValue(int i) {
        this.f121671c = i;
    }

    public final void setWidthValue(int i) {
        this.f121670b = i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.g$b */
    static final class View$OnClickListenerC48317b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f121675a;

        View$OnClickListenerC48317b(Runnable runnable) {
            this.f121675a = runnable;
        }

        public final void onClick(View view) {
            this.f121675a.run();
        }
    }

    /* renamed from: a */
    public final void mo168996a(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "clickHandler");
        setOnClickListener(new View$OnClickListenerC48317b(runnable));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomView(Context context, int i, String str, Drawable drawable) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        this.f121673e = i;
        this.f121674f = str;
        ImageView imageView = new ImageView(context);
        this.f121672d = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
        imageView.setImageDrawable(drawable);
    }
}
