package com.ss.android.lark.mm.module.detail.summary;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.detail.summary.model.MmSummary;
import com.ss.android.lark.mm.module.framework.IMmListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0014\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/summary/IMmSummaryListener;", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "onRefresh", "", "onStopScroll", "onTranslate", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary;", "onVideoPlayerCompletelyVisibleChange", "isCompletelyVisible", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.summary.c */
public interface IMmSummaryListener extends IMmListener {
    /* renamed from: a */
    void mo162625a();

    /* renamed from: a */
    void mo162626a(MmSummary mmSummary);

    /* renamed from: a */
    void mo162627a(boolean z);

    /* renamed from: b */
    void mo162628b();
}
