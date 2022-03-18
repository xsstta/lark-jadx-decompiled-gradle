package com.ss.android.lark.mm.module.record.detail.toolbar;

import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.IMmListener;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/toolbar/IMmRecordToolbarListener;", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "onChangeTranslateLang", "", "translateLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "onDuration", "it", "", "onRecordingStateChange", "Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "onVolumeChange", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.c */
public interface IMmRecordToolbarListener extends IMmListener {
    /* renamed from: a */
    void mo164798a(int i);

    /* renamed from: a */
    void mo164799a(long j);

    /* renamed from: a */
    void mo164800a(MmTranslateLangType mmTranslateLangType);

    /* renamed from: a */
    void mo164801a(MmRecordManager.RecordState recordState);
}
