package com.ss.android.lark.mm.module.detail.startup;

import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.framework.IMmListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/startup/IMmDetailStartUpListener;", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "onDelete", "", "onDismissLoading", "onErrorDataChange", "dataError", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmMeetingBaseInfoControl$DataError;", "onRecordingTypeStatusChangeToCompleted", "onRefresh", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.b.c */
public interface IMmDetailStartUpListener extends IMmListener {
    /* renamed from: a */
    void mo161411a();

    /* renamed from: a */
    void mo161412a(MmMeetingBaseInfoControl.DataError dataError);

    /* renamed from: b */
    void mo161413b();

    /* renamed from: d */
    void mo161414d();

    /* renamed from: f */
    void mo161415f();
}
