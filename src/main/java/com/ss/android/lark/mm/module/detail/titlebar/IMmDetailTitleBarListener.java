package com.ss.android.lark.mm.module.detail.titlebar;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.mm.module.framework.IMmListener;
import com.ss.android.lark.mm.module.share.model.PermissionStatus;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/titlebar/IMmDetailTitleBarListener;", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "hideTitleBar", "", "onEditStatusContentChange", "content", "", "onEnterEditMode", "onExitEditMode", "onStatusChange", UpdateKey.STATUS, "Lcom/ss/android/lark/mm/module/share/model/PermissionStatus;", "onTitleChange", ChatTypeStateKeeper.f135670e, "onVideoPlayerVisibilityChange", "isVisible", "", "showMoreMenu", "showTitleBar", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.titlebar.c */
public interface IMmDetailTitleBarListener extends IMmListener {
    /* renamed from: a */
    void mo162719a(PermissionStatus permissionStatus);

    /* renamed from: a */
    void mo162720a(String str);

    /* renamed from: a */
    void mo162721a(boolean z);

    void bg_();

    /* renamed from: g */
    void mo162726g();

    /* renamed from: i */
    void mo162727i();
}
