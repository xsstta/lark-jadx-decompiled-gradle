package com.ss.android.vc.common.widget;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ*\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u0002J<\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0001\u0010\u000b\u001a\u00020\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¨\u0006\u0014"}, d2 = {"Lcom/ss/android/vc/common/widget/KeepClickablePartIntactSpannableTextView;", "Lcom/ss/android/vc/common/widget/LineHeightTextView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getClickablePartSpan", "Landroid/text/style/ClickableSpan;", "clickableTextColor", "onSpanClick", "Lkotlin/Function1;", "Landroid/view/View;", "", "keepClickablePartIntact", "content", "", "clickablePartText", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class KeepClickablePartIntactSpannableTextView extends LineHeightTextView {
    public KeepClickablePartIntactSpannableTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public KeepClickablePartIntactSpannableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.KeepClickablePartIntactSpannableTextView$b */
    static final class RunnableC60803b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ KeepClickablePartIntactSpannableTextView f152042a;

        /* renamed from: b */
        final /* synthetic */ String f152043b;

        /* renamed from: c */
        final /* synthetic */ String f152044c;

        /* renamed from: d */
        final /* synthetic */ int f152045d;

        /* renamed from: e */
        final /* synthetic */ Function1 f152046e;

        RunnableC60803b(KeepClickablePartIntactSpannableTextView keepClickablePartIntactSpannableTextView, String str, String str2, int i, Function1 function1) {
            this.f152042a = keepClickablePartIntactSpannableTextView;
            this.f152043b = str;
            this.f152044c = str2;
            this.f152045d = i;
            this.f152046e = function1;
        }

        public final void run() {
            boolean z;
            int indexOf$default = StringsKt.indexOf$default((CharSequence) this.f152043b, this.f152044c, 0, false, 6, (Object) null);
            int length = (this.f152044c.length() + indexOf$default) - 1;
            StringBuilder sb = new StringBuilder(this.f152044c);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int min = Math.min(this.f152042a.getMeasuredWidth(), (this.f152042a.getMaxWidth() - this.f152042a.getPaddingStart()) - this.f152042a.getPaddingEnd());
            float desiredWidth = Layout.getDesiredWidth(this.f152043b, this.f152042a.getPaint());
            float f = (float) min;
            if (Layout.getDesiredWidth(this.f152044c, this.f152042a.getPaint()) > f) {
                z = true;
            } else {
                z = false;
            }
            if (desiredWidth > f) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    TextPaint paint = this.f152042a.getPaint();
                    String str = this.f152043b;
                    int breakText = paint.breakText(str, i, str.length(), true, f, null);
                    int i3 = i + breakText;
                    int i4 = i3 - 1;
                    if (indexOf$default <= i4 && length > i4 && !z) {
                        String str2 = this.f152043b;
                        if (str2 != null) {
                            String substring = str2.substring(i, indexOf$default);
                            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            spannableStringBuilder.append((CharSequence) substring);
                            spannableStringBuilder.append((CharSequence) "\n");
                            i = indexOf$default;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        String str3 = this.f152043b;
                        int i5 = i4 + 1;
                        if (str3 != null) {
                            String substring2 = str3.substring(i, i5);
                            Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            spannableStringBuilder.append((CharSequence) substring2);
                            if (indexOf$default <= i4 && length > i4) {
                                sb.insert((i4 - indexOf$default) + 1 + i2, "\n");
                                i2++;
                            }
                            if (breakText == this.f152043b.length() - i) {
                                break;
                            }
                            spannableStringBuilder.append((CharSequence) "\n");
                            i = i3;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
            } else {
                spannableStringBuilder.append((CharSequence) this.f152043b);
            }
            SpannableString spannableString = new SpannableString(spannableStringBuilder.toString());
            String sb2 = sb.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb2, "clickablePartStrBuilder.toString()");
            SpannableString spannableString2 = spannableString;
            int indexOf$default2 = StringsKt.indexOf$default((CharSequence) spannableString2, sb2, 0, false, 6, (Object) null);
            spannableString.setSpan(this.f152042a.mo208448a(this.f152045d, this.f152046e), indexOf$default2, sb2.length() + indexOf$default2, 17);
            this.f152042a.setText(spannableString2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/common/widget/KeepClickablePartIntactSpannableTextView$getClickablePartSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.KeepClickablePartIntactSpannableTextView$a */
    public static final class C60802a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ int f152040a;

        /* renamed from: b */
        final /* synthetic */ Function1 f152041b;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            Function1 function1 = this.f152041b;
            if (function1 != null) {
                Unit unit = (Unit) function1.invoke(view);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f152040a);
            textPaint.setUnderlineText(false);
        }

        C60802a(int i, Function1 function1) {
            this.f152040a = i;
            this.f152041b = function1;
        }
    }

    /* renamed from: a */
    public final ClickableSpan mo208448a(int i, Function1<? super View, Unit> function1) {
        return new C60802a(i, function1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeepClickablePartIntactSpannableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: a */
    public final void mo208449a(String str, String str2, int i, Function1<? super View, Unit> function1) {
        boolean z;
        String str3 = str;
        boolean z2 = true;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str4 = str2;
            if (!(str4 == null || str4.length() == 0)) {
                z2 = false;
            }
            if (!z2 && StringsKt.contains$default((CharSequence) str3, (CharSequence) str4, false, 2, (Object) null)) {
                post(new RunnableC60803b(this, str, str2, i, function1));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KeepClickablePartIntactSpannableTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
