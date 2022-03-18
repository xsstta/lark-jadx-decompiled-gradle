package com.ss.android.lark.mm.module.detail.main;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.mm.module.framework.IMmListener;
import com.ss.android.lark.mm.module.share.model.PermissionStatus;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/main/IMmDetailListener;", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "onAudioResourceAvailableChange", "", "isAvailable", "", "onChangeSummaryTabVisible", "onDismissUpdateView", "onHideVideoView", "onMmStatusChange", "it", "Lcom/ss/android/lark/mm/module/share/model/PermissionStatus;", "onReviewStatusChange", UpdateKey.STATUS, "", "onShowVideoView", "onStartFind", "onStopFind", "onSwitchToSubtitleTab", "onTopicUpdated", ChatTypeStateKeeper.f135670e, "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.main.c */
public interface IMmDetailListener extends IMmListener {
    /* renamed from: a */
    void mo161900a(PermissionStatus permissionStatus);

    /* renamed from: a */
    void mo161901a(String str);

    /* renamed from: a */
    void mo161902a(boolean z);

    void bf_();

    /* renamed from: f */
    void mo161904f();

    /* renamed from: g */
    void mo161905g();

    /* renamed from: i */
    void mo161906i();

    /* renamed from: j */
    void mo161907j();
}
