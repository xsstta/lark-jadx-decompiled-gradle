package com.ss.android.lark.ai.textcorrection;

import android.content.Context;
import android.text.NoCopySpan;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.smartcompose.p1342b.AbstractC28583a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ \u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tJ\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020#J\u0012\u0010'\u001a\u00020!2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#J\u0016\u0010+\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010,\u001a\u00020\u001bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/ErrorCorrectionSpan;", "Landroid/text/NoCopySpan;", "Lcom/ss/android/lark/ai/smartcompose/inter/ComposeClickableSpan;", "context", "Landroid/content/Context;", "text", "", "(Landroid/content/Context;Ljava/lang/String;)V", "color", "", "lineWidth", "(Landroid/content/Context;IILjava/lang/String;)V", "backgroundSpan", "Landroid/text/style/BackgroundColorSpan;", "childUnderlineSpanList", "", "Lcom/ss/android/lark/ai/textcorrection/UnderlineSpan;", "getChildUnderlineSpanList", "()Ljava/util/List;", "listener", "Landroid/view/View$OnClickListener;", "getListener", "()Landroid/view/View$OnClickListener;", "setListener", "(Landroid/view/View$OnClickListener;)V", "originText", "showHighlight", "", "getShowHighlight", "()Z", "setShowHighlight", "(Z)V", "addSelf", "", "spannable", "Landroid/text/Spannable;", "start", "len", "isDirty", "onClick", "textView", "Landroid/widget/TextView;", "removeSelf", "toggleHighlight", "show", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.e.c */
public final class ErrorCorrectionSpan implements NoCopySpan, AbstractC28583a {

    /* renamed from: a */
    private final String f71706a;

    /* renamed from: b */
    private final BackgroundColorSpan f71707b;

    /* renamed from: c */
    private View.OnClickListener f71708c;

    /* renamed from: d */
    private final List<UnderlineSpan> f71709d;

    /* renamed from: e */
    private boolean f71710e;

    /* renamed from: a */
    public final List<UnderlineSpan> mo101613a() {
        return this.f71709d;
    }

    /* renamed from: a */
    public final void mo101616a(View.OnClickListener onClickListener) {
        this.f71708c = onClickListener;
    }

    @Override // com.ss.android.lark.ai.smartcompose.p1342b.AbstractC28583a
    /* renamed from: a */
    public void mo101617a(TextView textView) {
        View.OnClickListener onClickListener = this.f71708c;
        if (onClickListener != null) {
            onClickListener.onClick(textView);
        }
    }

    /* renamed from: b */
    public final void mo101619b(Spannable spannable) {
        for (T t : this.f71709d) {
            if (spannable != null) {
                spannable.removeSpan(t);
            }
        }
        if (spannable != null) {
            spannable.removeSpan(this);
        }
    }

    /* renamed from: a */
    public final boolean mo101618a(Spannable spannable) {
        Intrinsics.checkParameterIsNotNull(spannable, "text");
        int spanStart = spannable.getSpanStart(this);
        int spanEnd = spannable.getSpanEnd(this);
        if (spanStart < 0 || spanEnd < 0 || !(!Intrinsics.areEqual(spannable.subSequence(spanStart, spanEnd).toString(), this.f71706a))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ErrorCorrectionSpan(Context context, String str) {
        this(context, ContextCompat.getColor(context, R.color.lkui_R500), UIUtils.dp2px(context, 2.0f), str);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "text");
    }

    /* renamed from: a */
    public final void mo101615a(Spannable spannable, boolean z) {
        Intrinsics.checkParameterIsNotNull(spannable, "spannable");
        if (this.f71710e != z) {
            for (T t : this.f71709d) {
                int spanStart = spannable.getSpanStart(t);
                int spanEnd = spannable.getSpanEnd(t);
                if (spanStart != -1 || spanEnd != -1) {
                    spannable.removeSpan(t);
                    t.mo101664a(z);
                    spannable.setSpan(t, spanStart, spanEnd, 33);
                }
            }
            this.f71710e = z;
        }
    }

    /* renamed from: a */
    public final void mo101614a(Spannable spannable, int i, int i2) {
        if (spannable != null) {
            spannable.setSpan(this, i, i2 + i, 33);
        }
        IntProgression step = RangesKt.step(RangesKt.until(0, this.f71706a.length()), 1);
        int a = step.mo239399a();
        int b = step.mo239400b();
        int c = step.mo239401c();
        if (c >= 0) {
            if (a > b) {
                return;
            }
        } else if (a < b) {
            return;
        }
        while (true) {
            if (spannable != null) {
                int i3 = i + a;
                spannable.setSpan(this.f71709d.get(a), i3, i3 + 1, 33);
            }
            if (a != b) {
                a += c;
            } else {
                return;
            }
        }
    }

    public ErrorCorrectionSpan(Context context, int i, int i2, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.f71709d = new ArrayList();
        this.f71706a = str;
        IntProgression step = RangesKt.step(RangesKt.until(0, str.length()), 1);
        int a = step.mo239399a();
        int b = step.mo239400b();
        int c = step.mo239401c();
        if (c < 0 ? a >= b : a <= b) {
            while (true) {
                this.f71709d.add(new UnderlineSpan(context, i, i2));
                if (a == b) {
                    break;
                }
                a += c;
            }
        }
        this.f71707b = new BackgroundColorSpan(C25653b.m91894a(context, R.color.lkui_R500, 0.2f));
    }
}
