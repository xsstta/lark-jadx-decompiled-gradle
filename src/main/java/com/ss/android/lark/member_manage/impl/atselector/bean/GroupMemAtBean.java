package com.ss.android.lark.member_manage.impl.atselector.bean;

import android.content.Context;
import android.widget.ImageView;
import com.ss.android.lark.member_manage.GroupMemberManageModule;

public class GroupMemAtBean extends BaseAtBean implements Comparable<GroupMemAtBean> {
    private static final long serialVersionUID = -4450297628440362719L;
    C44977a chatterInfo;
    private char letter;
    private boolean showShadow;

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public int getType() {
        return 0;
    }

    public C44977a getChatterInfo() {
        return this.chatterInfo;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public char getPinyin() {
        return this.letter;
    }

    public boolean isShowShadow() {
        return this.showShadow;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public String getDisplayName() {
        return this.chatterInfo.mo159186c();
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public String getId() {
        return this.chatterInfo.mo159184a();
    }

    public void setChatterInfo(C44977a aVar) {
        this.chatterInfo = aVar;
    }

    public void setLetter(char c) {
        this.letter = c;
    }

    public void showShadow(boolean z) {
        this.showShadow = z;
    }

    public GroupMemAtBean(C44977a aVar) {
        this.chatterInfo = aVar;
    }

    public int compareTo(GroupMemAtBean groupMemAtBean) {
        return this.chatterInfo.compareTo(groupMemAtBean.chatterInfo);
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public void showAvatar(Context context, ImageView imageView, int i, int i2) {
        GroupMemberManageModule.m177902a().getImageDependency().mo143815a(context, this.chatterInfo.mo159185b(), this.chatterInfo.mo159184a(), imageView, i, i2);
    }
}
