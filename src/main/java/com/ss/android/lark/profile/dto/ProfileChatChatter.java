package com.ss.android.lark.profile.dto;

import com.ss.android.lark.chat.entity.chatter.AvatarMedal;
import com.ss.android.lark.profile.dto.ProfileChatter;
import com.ss.android.lark.profile.entity.WorkStatus;

public class ProfileChatChatter extends ProfileChatter {
    private String nickName;

    public ProfileChatChatter() {
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public ProfileChatChatter(String str, ProfileChatter.ChatterType chatterType, WorkStatus workStatus, String str2, String str3, String str4, boolean z, String str5, boolean z2, boolean z3, long j, AvatarMedal avatarMedal) {
        super(str, chatterType, workStatus, str2, str3, str4, z, z2, z3, j, avatarMedal);
        this.nickName = str5;
    }
}
