package com.ss.android.lark.mm.module.record.detail.p2328a;

import com.ss.android.lark.mm.module.record.model.MmRecordSentence;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lcom/ss/android/lark/mm/module/record/model/MmRecordSentence;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.a.g */
public final class C46899g extends Lambda implements Function1<MmRecordSentence, String> {
    public static final C46899g INSTANCE = new C46899g();

    C46899g() {
        super(1);
    }

    public final String invoke(MmRecordSentence mmRecordSentence) {
        Intrinsics.checkExpressionValueIsNotNull(mmRecordSentence, "it");
        String sentences = mmRecordSentence.getSentences();
        Intrinsics.checkExpressionValueIsNotNull(sentences, "it.sentences");
        return sentences;
    }
}
