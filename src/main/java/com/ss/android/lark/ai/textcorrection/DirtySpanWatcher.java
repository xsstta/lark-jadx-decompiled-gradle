package com.ss.android.lark.ai.textcorrection;

import android.text.SpanWatcher;
import android.text.Spannable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J<\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0016J(\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/DirtySpanWatcher;", "Landroid/text/SpanWatcher;", "()V", "onSpanAdded", "", "text", "Landroid/text/Spannable;", "what", "", "start", "", "end", "onSpanChanged", "ostart", "oend", "nstart", "nend", "onSpanRemoved", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.e.b */
public final class DirtySpanWatcher implements SpanWatcher {
    public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(spannable, "text");
        Intrinsics.checkParameterIsNotNull(obj, "what");
    }

    public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(spannable, "text");
        Intrinsics.checkParameterIsNotNull(obj, "what");
    }

    public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if ((obj instanceof ErrorCorrectionSpan) && spannable != null) {
            ErrorCorrectionSpan cVar = (ErrorCorrectionSpan) obj;
            if (cVar.mo101618a(spannable)) {
                spannable.removeSpan(obj);
                for (UnderlineSpan jVar : cVar.mo101613a()) {
                    spannable.removeSpan(jVar);
                }
            }
        }
    }
}
