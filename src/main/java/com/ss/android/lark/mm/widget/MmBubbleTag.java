package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmBubbleTag;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "init", "", "setSelected", "selected", "", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmBubbleTag extends AppCompatTextView {

    /* renamed from: a */
    public static final Paint f118689a = new Paint();

    /* renamed from: b */
    public static final float f118690b;

    /* renamed from: c */
    public static final int f118691c;

    /* renamed from: e */
    public static final Companion f118692e = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmBubbleTag$Companion;", "", "()V", "padding", "", "getPadding", "()I", "paint", "Landroid/graphics/Paint;", "textSize", "", "measureText", "text", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmBubbleTag$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo165558a() {
            return MmBubbleTag.f118691c;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final float mo165557a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "text");
            MmBubbleTag.f118689a.setTextSize(MmBubbleTag.f118690b);
            return MmBubbleTag.f118689a.measureText(str) + ((float) (mo165558a() * 2));
        }
    }

    static {
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend = a.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
        f118690b = (float) UIUtils.dp2px(contextDepend.mo144557a(), 13.0f);
        IMmDepend a2 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend2 = a2.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend2, "MmDepend.impl().contextDepend");
        f118691c = UIUtils.dp2px(contextDepend2.mo144557a(), 12.0f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmBubbleTag(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public void setSelected(boolean z) {
        Context context;
        int i;
        if (isSelected() != z) {
            super.setSelected(z);
            if (z) {
                context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                i = R.color.mm_ud_tag_text_selected;
            } else {
                context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                i = R.color.text_caption;
            }
            setTextColor(UDColorUtils.getColor(context, i));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmBubbleTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m186614a(AttributeSet attributeSet, int i) {
        setSingleLine();
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        setBackgroundResource(R.drawable.mm_bg_tag);
        setTextColor(UIUtils.getColor(getContext(), R.color.text_caption));
        setTextSize(0, f118690b);
        setGravity(17);
        int i2 = f118691c;
        setPadding(i2, 0, i2, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmBubbleTag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186614a(attributeSet, i);
    }
}
