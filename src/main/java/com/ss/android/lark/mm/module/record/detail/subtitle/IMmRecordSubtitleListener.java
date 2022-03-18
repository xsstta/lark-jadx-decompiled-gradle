package com.ss.android.lark.mm.module.record.detail.subtitle;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.framework.IMmListener;
import com.ss.android.lark.mm.module.record.model.MmRecordSentence;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/subtitle/IMmRecordSubtitleListener;", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "onChangeTranslateLang", "", "onPushRecordSubtitle", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/record/model/MmRecordSentence;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.a.c */
public interface IMmRecordSubtitleListener extends IMmListener {
    /* renamed from: a */
    void mo164662a(MmRecordSentence mmRecordSentence);

    /* renamed from: b */
    void mo164663b();
}
