package com.ss.android.lark.mm.module.record.detail.tips;

import com.ss.android.lark.mm.module.framework.IMmListener;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/tips/IMmRecordTipsListener;", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "onRecordAlmostReachLimit", "", "onRecordStateChange", "second", "Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "onWeakNetwork", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.tips.c */
public interface IMmRecordTipsListener extends IMmListener {
    /* renamed from: a */
    void mo164731a();

    /* renamed from: a */
    void mo164732a(MmRecordManager.RecordState recordState);

    /* renamed from: b */
    void mo164733b();
}
