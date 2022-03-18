package com.ss.android.lark.widget.light.processor;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.widget.light.SpannableStringExtraParams;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import com.ss.android.lark.widget.linked_emojicon.C58514h;
import com.ss.android.lark.widget.span.TextStyleInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/widget/light/processor/TextStyleSpanProcessor;", "Lcom/ss/android/lark/widget/light/processor/ISpanProcessor;", "Lcom/ss/android/lark/widget/span/TextStyleInfo;", "()V", "process", "", "context", "Landroid/content/Context;", "spanBuilder", "Lcom/ss/android/lark/widget/linked_emojicon/SpannableStringBuilderAllVer;", "spanInfo", "params", "Lcom/ss/android/lark/widget/light/SpannableStringExtraParams;", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.d.m */
public final class TextStyleSpanProcessor implements ISpanProcessor<TextStyleInfo> {
    /* renamed from: a */
    public void mo198129a(Context context, C58513g gVar, TextStyleInfo textStyleInfo, SpannableStringExtraParams aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "spanBuilder");
        Intrinsics.checkParameterIsNotNull(textStyleInfo, "spanInfo");
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        String str = textStyleInfo.text;
        C58514h hVar = new C58514h(textStyleInfo);
        if (textStyleInfo.isIndependent) {
            gVar.append(str, hVar, 33);
            return;
        }
        int coerceAtMost = RangesKt.coerceAtMost(gVar.length(), textStyleInfo.end);
        if (TextUtils.equals(gVar.subSequence(textStyleInfo.start, coerceAtMost).toString(), str)) {
            gVar.setSpan(hVar, textStyleInfo.start, coerceAtMost, 33);
        }
    }
}
