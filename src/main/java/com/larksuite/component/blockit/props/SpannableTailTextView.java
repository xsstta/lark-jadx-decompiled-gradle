package com.larksuite.component.blockit.props;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0014J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0013J\u001c\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/larksuite/component/blockit/props/SpannableTailTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mEllipsizeFinal", "", "getMEllipsizeFinal", "()Z", "setMEllipsizeFinal", "(Z)V", "mHeightMeasureSpec", "mTailContent", "", "mWidthMeasureSpec", "doMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "setTailContent", "tailContent", "setText", "text", "", ShareHitPoint.f121869d, "Landroid/widget/TextView$BufferType;", "Companion", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
public class SpannableTailTextView extends AppCompatTextView {

    /* renamed from: a */
    public static final Companion f59677a = new Companion(null);

    /* renamed from: b */
    private int f59678b;

    /* renamed from: c */
    private int f59679c;

    /* renamed from: e */
    private String f59680e = "…";

    /* renamed from: f */
    private boolean f59681f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/blockit/props/SpannableTailTextView$Companion;", "", "()V", "LINE_BREAKER", "", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.props.SpannableTailTextView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean getMEllipsizeFinal() {
        return this.f59681f;
    }

    /* access modifiers changed from: protected */
    public final void setMEllipsizeFinal(boolean z) {
        this.f59681f = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpannableTailTextView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setTailContent(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tailContent");
        this.f59680e = str;
        this.f59681f = false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m88154a(i, i2);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f59681f = false;
        super.setText(charSequence, bufferType);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpannableTailTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m88154a(int i, int i2) {
        boolean z;
        int lineEnd;
        if (this.f59678b == i && this.f59679c == i2) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f59681f || !z) {
            this.f59678b = i;
            this.f59679c = i2;
            int lineCount = getLineCount();
            Layout layout = getLayout();
            int maxLines = getMaxLines();
            if (maxLines != 0 && lineCount >= maxLines && !TextUtils.isEmpty(getText()) && (lineEnd = layout.getLineEnd(maxLines - 1)) < getText().length()) {
                setText(new SpannableStringBuilder(getText().subSequence(0, lineEnd - 1)).append((CharSequence) this.f59680e));
                this.f59681f = true;
                measure(i, i2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpannableTailTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
