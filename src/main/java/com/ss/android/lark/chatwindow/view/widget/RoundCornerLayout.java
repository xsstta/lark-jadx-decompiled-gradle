package com.ss.android.lark.chatwindow.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J(\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0014R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/widget/RoundCornerLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "canvasRounder", "Lcom/ss/android/lark/chatwindow/view/widget/CanvasRounder;", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "draw", "onSizeChanged", "currentWidth", "currentHeight", "oldWidth", "oldheight", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class RoundCornerLayout extends FrameLayout {

    /* renamed from: a */
    private CanvasRounder f91316a;

    public RoundCornerLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public RoundCornerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Canvas;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.widget.RoundCornerLayout$a */
    static final class C35327a extends Lambda implements Function1<Canvas, Unit> {
        final /* synthetic */ Canvas $canvas;
        final /* synthetic */ RoundCornerLayout this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35327a(RoundCornerLayout roundCornerLayout, Canvas canvas) {
            super(1);
            this.this$0 = roundCornerLayout;
            this.$canvas = canvas;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
            invoke(canvas);
            return Unit.INSTANCE;
        }

        public final void invoke(Canvas canvas) {
            Intrinsics.checkParameterIsNotNull(canvas, "it");
            RoundCornerLayout.super.dispatchDraw(this.$canvas);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Canvas;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.widget.RoundCornerLayout$b */
    static final class C35328b extends Lambda implements Function1<Canvas, Unit> {
        final /* synthetic */ Canvas $canvas;
        final /* synthetic */ RoundCornerLayout this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35328b(RoundCornerLayout roundCornerLayout, Canvas canvas) {
            super(1);
            this.this$0 = roundCornerLayout;
            this.$canvas = canvas;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
            invoke(canvas);
            return Unit.INSTANCE;
        }

        public final void invoke(Canvas canvas) {
            Intrinsics.checkParameterIsNotNull(canvas, "it");
            RoundCornerLayout.super.draw(this.$canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.f91316a.mo130042a(canvas, new C35327a(this, canvas));
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.f91316a.mo130042a(canvas, new C35328b(this, canvas));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.corner_radius}, 0, 0);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr….RoundCornerLayout, 0, 0)");
        float dimension = obtainStyledAttributes.getDimension(0, BitmapDescriptorFactory.HUE_RED);
        obtainStyledAttributes.recycle();
        this.f91316a = new CanvasRounder(dimension);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f91316a.mo130041a(i, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoundCornerLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
