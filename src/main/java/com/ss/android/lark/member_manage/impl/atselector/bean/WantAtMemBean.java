package com.ss.android.lark.member_manage.impl.atselector.bean;

import android.content.Context;
import android.widget.ImageView;
import com.ss.android.lark.member_manage.GroupMemberManageModule;

public class WantAtMemBean extends BaseAtBean {
    private static final long serialVersionUID = -6615256247996487612L;
    C44977a chatterInfo;
    String guessType = "";
    String searchLocation = "";

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public char getPinyin() {
        return 0;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public int getType() {
        return 2;
    }

    public C44977a getChatterInfo() {
        return this.chatterInfo;
    }

    public String getGuessType() {
        return this.guessType;
    }

    public String getSearchLocation() {
        return this.searchLocation;
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

    public void setGuessType(String str) {
        this.guessType = str;
    }

    public void setSearchLocation(String str) {
        this.searchLocation = str;
    }

    public WantAtMemBean(C44977a aVar) {
        this.chatterInfo = aVar;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public void showAvatar(Context context, ImageView imageView, int i, int i2) {
        GroupMemberManageModule.m177902a().getImageDependency().mo143815a(context, this.chatterInfo.mo159185b(), this.chatterInfo.mo159184a(), imageView, i, i2);
    }
}
