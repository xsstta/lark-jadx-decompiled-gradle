package com.ss.android.lark.member_manage.impl.atselector.bean;

import android.content.Context;
import android.widget.ImageView;
import com.ss.android.lark.member_manage.GroupMemberManageModule;

public class SearchBean extends BaseAtBean {
    private static final long serialVersionUID = 2111381734894401775L;
    C44977a chatterInfo;
    private boolean isOutChatUser;

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public char getPinyin() {
        return 0;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public int getType() {
        return 4;
    }

    public C44977a getChatterInfo() {
        return this.chatterInfo;
    }

    public boolean isOutChatUser() {
        return this.isOutChatUser;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public String getDisplayName() {
        return this.chatterInfo.mo159186c();
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public String getId() {
        return this.chatterInfo.mo159184a();
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public String getStatusIconKey() {
        return this.chatterInfo.mo159194j();
    }

    public void setChatterInfo(C44977a aVar) {
        this.chatterInfo = aVar;
    }

    public void setOutChatUser(boolean z) {
        this.isOutChatUser = z;
    }

    public SearchBean(C44977a aVar) {
        this.chatterInfo = aVar;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public void showAvatar(Context context, ImageView imageView, int i, int i2) {
        GroupMemberManageModule.m177902a().getImageDependency().mo143815a(context, this.chatterInfo.mo159185b(), this.chatterInfo.mo159184a(), imageView, i, i2);
    }
}
