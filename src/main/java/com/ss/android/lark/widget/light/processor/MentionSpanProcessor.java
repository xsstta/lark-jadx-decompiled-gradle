package com.ss.android.lark.widget.light.processor;

import android.content.Context;
import com.ss.android.lark.widget.light.SpannableStringExtraParams;
import com.ss.android.lark.widget.light.span.HashTagClickSpan;
import com.ss.android.lark.widget.light.span.MentionClickSpan;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import com.ss.android.lark.widget.span.MentionInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/widget/light/processor/MentionSpanProcessor;", "Lcom/ss/android/lark/widget/light/processor/ISpanProcessor;", "Lcom/ss/android/lark/widget/span/MentionInfo;", "()V", "process", "", "context", "Landroid/content/Context;", "spanBuilder", "Lcom/ss/android/lark/widget/linked_emojicon/SpannableStringBuilderAllVer;", "spanInfo", "params", "Lcom/ss/android/lark/widget/light/SpannableStringExtraParams;", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.d.i */
public final class MentionSpanProcessor implements ISpanProcessor<MentionInfo> {
    /* renamed from: a */
    public void mo198129a(Context context, C58513g gVar, MentionInfo mentionInfo, SpannableStringExtraParams aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "spanBuilder");
        Intrinsics.checkParameterIsNotNull(mentionInfo, "spanInfo");
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        String str = mentionInfo.text;
        if (mentionInfo.type == 11) {
            String str2 = mentionInfo.id;
            Intrinsics.checkExpressionValueIsNotNull(str2, "spanInfo.id");
            Intrinsics.checkExpressionValueIsNotNull(str, "spanText");
            gVar.append(str, new HashTagClickSpan(str2, str), 33);
            return;
        }
        String str3 = mentionInfo.id;
        Intrinsics.checkExpressionValueIsNotNull(str3, "spanInfo.id");
        Intrinsics.checkExpressionValueIsNotNull(str, "spanText");
        gVar.append(str, new MentionClickSpan(context, str3, str, mentionInfo.isAuthorized, mentionInfo.url), 33);
    }
}
