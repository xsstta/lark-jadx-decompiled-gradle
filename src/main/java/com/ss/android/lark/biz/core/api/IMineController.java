package com.ss.android.lark.biz.core.api;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/biz/core/api/IMineController;", "", "fragment", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "noticeShowMineTip", "", "canShow", "", "onShow", "reload", "OnGotoOtherPageListener", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.core.api.y */
public interface IMineController {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/biz/core/api/IMineController$OnGotoOtherPageListener;", "", "onGotoOtherPage", "", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.biz.core.api.y$a */
    public interface OnGotoOtherPageListener {
        void onGotoOtherPage();
    }

    /* renamed from: a */
    Fragment mo105902a();

    /* renamed from: a */
    void mo105903a(Fragment fragment);

    /* renamed from: a */
    void mo105904a(Fragment fragment, boolean z);

    /* renamed from: b */
    void mo105905b(Fragment fragment);
}
