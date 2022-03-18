package com.ss.android.lark.calendar.impl.features.common.widget;

import android.content.Context;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\n\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0002J0\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0014J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\bH\u0016J(\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0016J\u001c\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0015H\u0002R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/ExpandableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Ljava/lang/Runnable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "expandText", "getExpandText", "()Ljava/lang/CharSequence;", "setExpandText", "(Ljava/lang/CharSequence;)V", "lastWidth", "rawText", "generateCurrentText", "onLayout", "", "changed", "", "left", "top", "right", "bottom", "run", "setMaxLines", "maxLines", "setPadding", "setText", "text", ShareHitPoint.f121869d, "Landroid/widget/TextView$BufferType;", "update", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ExpandableTextView extends AppCompatTextView implements Runnable {

    /* renamed from: a */
    private CharSequence f78724a;

    /* renamed from: b */
    private int f78725b;

    /* renamed from: c */
    private CharSequence f78726c;

    public ExpandableTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final CharSequence getExpandText() {
        return this.f78726c;
    }

    public void run() {
        super.setText(m116309b(), TextView.BufferType.NORMAL);
    }

    /* renamed from: a */
    private final void m116308a() {
        if (getWidth() > 0) {
            run();
        } else {
            post(this);
        }
    }

    /* renamed from: b */
    private final CharSequence m116309b() {
        boolean z;
        boolean z2;
        int width;
        StaticLayout staticLayout;
        if (getMaxLines() <= 0 || getMaxLines() == Integer.MAX_VALUE) {
            return this.f78724a;
        }
        CharSequence charSequence = this.f78724a;
        CharSequence charSequence2 = this.f78726c;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || (width = (getWidth() - getPaddingLeft()) - getPaddingRight()) < 0) {
                return charSequence;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), width).build();
            } else {
                staticLayout = new StaticLayout(charSequence, getPaint(), width, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
            }
            Intrinsics.checkExpressionValueIsNotNull(staticLayout, "if (Build.VERSION.SDK_IN…, 1F, 0F, true)\n        }");
            if (staticLayout.getLineCount() < getMaxLines()) {
                return charSequence;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (staticLayout.getLineCount() >= 2) {
                spannableStringBuilder.append(charSequence, 0, staticLayout.getLineStart(getMaxLines() - 1));
            }
            CharSequence subSequence = charSequence.subSequence(staticLayout.getLineStart(getMaxLines() - 1), staticLayout.getLineEnd(getMaxLines() - 1));
            CharSequence ellipsize = TextUtils.ellipsize(subSequence, getPaint(), ((float) width) - getPaint().measureText(charSequence2, 0, charSequence2.length()), TextUtils.TruncateAt.END);
            spannableStringBuilder.append(ellipsize);
            if (!Intrinsics.areEqual(ellipsize, subSequence)) {
                spannableStringBuilder.append(charSequence2);
            }
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public final void setExpandText(CharSequence charSequence) {
        this.f78726c = charSequence;
        m116308a();
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        m116308a();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f78724a = charSequence;
        super.setText(charSequence, bufferType);
        m116308a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f78724a = getText();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m116308a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f78725b != getWidth()) {
            this.f78725b = getWidth();
            m116308a();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExpandableTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
