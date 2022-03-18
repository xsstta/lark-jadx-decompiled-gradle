package com.ss.android.lark.mm.widget.texthighlightbg;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.util.AttributeSet;
import com.ss.android.lark.mm.widget.LineHeightTextView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J=\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\b\u0015H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/widget/texthighlightbg/MmHighlightBgTextView;", "Lcom/ss/android/lark/mm/widget/LineHeightTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textHighlightBgHelper", "Lcom/ss/android/lark/mm/widget/texthighlightbg/MmTextHighlightBgHelper;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "withTranslation", "x", "", "y", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public class MmHighlightBgTextView extends LineHeightTextView {

    /* renamed from: b */
    public final MmTextHighlightBgHelper f118974b;

    public MmHighlightBgTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MmHighlightBgTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/graphics/Canvas;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.texthighlightbg.MmHighlightBgTextView$a */
    static final class C47173a extends Lambda implements Function1<Canvas, Unit> {
        final /* synthetic */ Canvas $canvas;
        final /* synthetic */ MmHighlightBgTextView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47173a(MmHighlightBgTextView mmHighlightBgTextView, Canvas canvas) {
            super(1);
            this.this$0 = mmHighlightBgTextView;
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
            Intrinsics.checkParameterIsNotNull(canvas, "$receiver");
            MmTextHighlightBgHelper bVar = this.this$0.f118974b;
            Context context = this.this$0.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Canvas canvas2 = this.$canvas;
            CharSequence text = this.this$0.getText();
            if (text != null) {
                Layout layout = this.this$0.getLayout();
                Intrinsics.checkExpressionValueIsNotNull(layout, "layout");
                bVar.mo165876a(context, canvas2, (Spanned) text, layout);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.text.Spanned");
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if ((getText() instanceof Spanned) && getLayout() != null) {
            m186878a(canvas, (float) getTotalPaddingLeft(), (float) getTotalPaddingTop(), new C47173a(this, canvas));
        }
        super.onDraw(canvas);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmHighlightBgTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        MmTextHighlightBgAttributeReader mmTextHighlightBgAttributeReader = new MmTextHighlightBgAttributeReader(context, attributeSet);
        this.f118974b = new MmTextHighlightBgHelper(mmTextHighlightBgAttributeReader.mo165870a(), mmTextHighlightBgAttributeReader.mo165871b(), mmTextHighlightBgAttributeReader.mo165872c(), mmTextHighlightBgAttributeReader.mo165873d(), mmTextHighlightBgAttributeReader.mo165874e());
    }

    /* renamed from: a */
    private final void m186878a(Canvas canvas, float f, float f2, Function1<? super Canvas, Unit> function1) {
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MmHighlightBgTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 16842884 : i);
    }
}
