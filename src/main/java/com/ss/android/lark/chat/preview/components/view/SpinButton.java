package com.ss.android.lark.chat.preview.components.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lark.sdk.C19847o;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.ColorUtils;
import com.ss.android.lark.chat.entity.preview.FontLevel;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.chat.preview.components.utils.FontUtils;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.tangram.base.node.IVirtualNode;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ>\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010#2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tJ\u0010\u0010+\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#J\u0006\u0010,\u001a\u00020!R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001a\u0010\u001b¨\u0006-"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/SpinButton;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animator", "Landroid/animation/ObjectAnimator;", "getAnimator", "()Landroid/animation/ObjectAnimator;", "animator$delegate", "Lkotlin/Lazy;", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "imageView$delegate", "isOriginDegree", "", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "textView$delegate", "getTextWidthAndHeight", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode$RectSize;", "size", "setSpinButtonData", "", "text", "", "textColor", "Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "fontLevel", "Lcom/ss/android/lark/chat/entity/preview/FontLevel;", "iconKey", "iconWidth", "iconHeight", "setTextContent", "startAnim", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SpinButton extends LinearLayout {

    /* renamed from: a */
    private final Lazy f88220a = LazyKt.lazy(new C34111c(this));

    /* renamed from: b */
    private final Lazy f88221b = LazyKt.lazy(new C34110b(this));

    /* renamed from: c */
    private final Lazy f88222c;

    /* renamed from: d */
    private boolean f88223d;

    private final ObjectAnimator getAnimator() {
        return (ObjectAnimator) this.f88222c.getValue();
    }

    private final TextView getTextView() {
        return (TextView) this.f88220a.getValue();
    }

    public final ImageView getImageView() {
        return (ImageView) this.f88221b.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.view.SpinButton$b */
    static final class C34110b extends Lambda implements Function0<ImageView> {
        final /* synthetic */ SpinButton this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34110b(SpinButton spinButton) {
            super(0);
            this.this$0 = spinButton;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            return new ImageView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.view.SpinButton$c */
    static final class C34111c extends Lambda implements Function0<TextView> {
        final /* synthetic */ SpinButton this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34111c(SpinButton spinButton) {
            super(0);
            this.this$0 = spinButton;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.view.SpinButton$a */
    static final class C34109a extends Lambda implements Function0<ObjectAnimator> {
        final /* synthetic */ SpinButton this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34109a(SpinButton spinButton) {
            super(0);
            this.this$0 = spinButton;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ObjectAnimator invoke() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.this$0.getImageView(), "rotation", BitmapDescriptorFactory.HUE_RED, 180.0f);
            ofFloat.setDuration(300L);
            return ofFloat;
        }
    }

    /* renamed from: a */
    public final void mo126325a() {
        float f;
        boolean z = this.f88223d;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = 180.0f;
        }
        if (z) {
            f2 = 180.0f;
        }
        getAnimator().setFloatValues(f, f2);
        getAnimator().start();
        this.f88223d = !this.f88223d;
    }

    public final void setTextContent(String str) {
        if (str != null) {
            getTextView().setText(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpinButton(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        addView(getTextView());
        addView(getImageView());
        setGravity(16);
        this.f88222c = LazyKt.lazy(new C34109a(this));
        this.f88223d = true;
    }

    /* renamed from: a */
    public final IVirtualNode.RectSize mo126324a(IVirtualNode.RectSize aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "size");
        getTextView().measure(View.MeasureSpec.makeMeasureSpec(UIHelper.dp2px(aVar.mo188782a()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return new IVirtualNode.RectSize((float) UIHelper.px2dp((float) getTextView().getMeasuredWidth()), (float) UIHelper.px2dp((float) getTextView().getMeasuredHeight()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpinButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        addView(getTextView());
        addView(getImageView());
        setGravity(16);
        this.f88222c = LazyKt.lazy(new C34109a(this));
        this.f88223d = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpinButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        addView(getTextView());
        addView(getImageView());
        setGravity(16);
        this.f88222c = LazyKt.lazy(new C34109a(this));
        this.f88223d = true;
    }

    /* renamed from: a */
    public final void mo126326a(String str, ThemeColor themeColor, FontLevel fontLevel, String str2, int i, int i2) {
        getTextView().setText(str);
        if (themeColor != null) {
            TextView textView = getTextView();
            ColorUtils aVar = ColorUtils.f87906a;
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            textView.setTextColor(aVar.mo125874a(themeColor, context));
        } else {
            TextView textView2 = getTextView();
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            textView2.setTextColor(context2.getResources().getColor(R.color.lkui_N100));
        }
        FontUtils aVar2 = FontUtils.f88131a;
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        getTextView().setTextSize(0, aVar2.mo126267a(context3, fontLevel));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i2);
        layoutParams.leftMargin = UIHelper.dp2px(4.0f);
        getImageView().setLayoutParams(layoutParams);
        if (str2 == null || !C19847o.m72384a()) {
            getImageView().setImageResource(R.drawable.ic_chat_preview_icon_fold);
        } else {
            ImageLoader.with(getContext()).load(new C38824b(str2)).asDrawable().centerCrop().override(i, i2).error(R.drawable.ic_chat_preview_icon_fold).into(getImageView());
        }
    }
}
