package com.bytedance.ee.bear.middleground.permission.collaborator.search;

import com.bytedance.ee.bear.middleground.permission.collaborator.AvatarLoadHelper;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.i */
public class C9890i extends BaseQuickAdapter<UserInfo, C20923c> {
    public C9890i() {
        super((int) R.layout.share_list_user_ico_item);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(C20923c cVar, UserInfo userInfo) {
        AvatarLoadHelper aVar = AvatarLoadHelper.f25748a;
        AvatarLoadHelper.m39732a((UDAvatar) cVar.mo70740b(R.id.user_icon), userInfo);
    }
}
