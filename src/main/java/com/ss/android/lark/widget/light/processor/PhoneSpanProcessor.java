package com.ss.android.lark.widget.light.processor;

import android.content.Context;
import com.ss.android.lark.widget.light.SpannableStringExtraParams;
import com.ss.android.lark.widget.light.span.PhoneClickSpan;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import com.ss.android.lark.widget.span.PhoneInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/widget/light/processor/PhoneSpanProcessor;", "Lcom/ss/android/lark/widget/light/processor/ISpanProcessor;", "Lcom/ss/android/lark/widget/span/PhoneInfo;", "()V", "process", "", "context", "Landroid/content/Context;", "spanBuilder", "Lcom/ss/android/lark/widget/linked_emojicon/SpannableStringBuilderAllVer;", "spanInfo", "params", "Lcom/ss/android/lark/widget/light/SpannableStringExtraParams;", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.d.j */
public final class PhoneSpanProcessor implements ISpanProcessor<PhoneInfo> {
    /* renamed from: a */
    public void mo198129a(Context context, C58513g gVar, PhoneInfo phoneInfo, SpannableStringExtraParams aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "spanBuilder");
        Intrinsics.checkParameterIsNotNull(phoneInfo, "spanInfo");
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        String str = phoneInfo.text;
        Intrinsics.checkExpressionValueIsNotNull(str, "spanText");
        gVar.append(str, new PhoneClickSpan(context, str), 33);
    }
}
