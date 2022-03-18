package com.ss.android.lark.widget.light.processor;

import android.content.Context;
import com.ss.android.lark.widget.light.SpannableStringExtraParams;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import com.ss.android.lark.widget.span.SpanInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000e*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u000eJ-\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/widget/light/processor/ISpanProcessor;", "T", "Lcom/ss/android/lark/widget/span/SpanInfo;", "", "process", "", "context", "Landroid/content/Context;", "spanBuilder", "Lcom/ss/android/lark/widget/linked_emojicon/SpannableStringBuilderAllVer;", "spanInfo", "params", "Lcom/ss/android/lark/widget/light/SpannableStringExtraParams;", "(Landroid/content/Context;Lcom/ss/android/lark/widget/linked_emojicon/SpannableStringBuilderAllVer;Lcom/ss/android/lark/widget/span/SpanInfo;Lcom/ss/android/lark/widget/light/SpannableStringExtraParams;)V", "Companion", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.d.e */
public interface ISpanProcessor<T extends SpanInfo> {

    /* renamed from: b */
    public static final Companion f144159b = Companion.f144160a;

    /* renamed from: a */
    void mo198129a(Context context, C58513g gVar, T t, SpannableStringExtraParams aVar);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/light/processor/ISpanProcessor$Companion;", "", "()V", "SPAN_FLAG", "", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.d.e$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f144160a = new Companion();

        private Companion() {
        }
    }
}
