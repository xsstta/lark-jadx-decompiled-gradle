package com.ss.android.lark.team.bean;

import android.graphics.drawable.Drawable;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.team.bean.AbsTeamMember;
import com.ss.android.lark.team.entity.PickEntities;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/team/bean/CurrentUserTeamMember;", "Lcom/ss/android/lark/team/bean/AbsTeamMember;", "Ljava/io/Serializable;", "loginInfo", "Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;", "(Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;)V", "getLoginInfo", "()Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;", "convertToSearchBaseInfo", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "getAvatarKey", "", "getId", "getName", "memberType", "Lcom/ss/android/lark/team/entity/PickEntities$PickType;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CurrentUserTeamMember implements AbsTeamMember, Serializable {
    private final LoginInfo loginInfo;

    public final LoginInfo getLoginInfo() {
        return this.loginInfo;
    }

    @Override // com.ss.android.lark.team.bean.AbsTeamMember
    public PickEntities.PickType memberType() {
        return PickEntities.PickType.USER;
    }

    @Override // com.ss.android.lark.team.bean.AbsTeamMember
    public Drawable getAvatarDrawable() {
        return AbsTeamMember.C55361a.m214878a(this);
    }

    @Override // com.ss.android.lark.team.bean.AbsTeamMember
    public String getAvatarKey() {
        return this.loginInfo.getAvatarKey();
    }

    @Override // com.ss.android.lark.team.bean.AbsTeamMember
    public String getId() {
        String userId = this.loginInfo.getUserId();
        Intrinsics.checkExpressionValueIsNotNull(userId, "loginInfo.userId");
        return userId;
    }

    public String getName() {
        String userName = this.loginInfo.getUserName();
        Intrinsics.checkExpressionValueIsNotNull(userName, "loginInfo.userName");
        return userName;
    }

    public SearchBaseInfo convertToSearchBaseInfo() {
        SearchChatterInfo searchChatterInfo = new SearchChatterInfo();
        searchChatterInfo.setId(this.loginInfo.getUserId());
        searchChatterInfo.setType(1);
        searchChatterInfo.setImageUrl(this.loginInfo.getAvatarUrl());
        searchChatterInfo.setAvatarKey(this.loginInfo.getAvatarKey());
        searchChatterInfo.setTitle(this.loginInfo.getUserName());
        searchChatterInfo.setChatterType(Chatter.ChatterType.USER);
        searchChatterInfo.setRegistered(true);
        searchChatterInfo.setTenantId(this.loginInfo.getTenantId());
        return searchChatterInfo;
    }

    public CurrentUserTeamMember(LoginInfo loginInfo2) {
        Intrinsics.checkParameterIsNotNull(loginInfo2, "loginInfo");
        this.loginInfo = loginInfo2;
    }
}
