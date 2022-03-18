package com.ss.android.lark.invitation.v2.feat.external.bean;

import com.bytedance.lark.pb.im.v2.GetContactTokenResponse;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.utils.UIHelper;
import java.io.Serializable;

public class InvitationInfo implements Serializable {
    public boolean canSearchWithToken;
    public String invMsg;
    public String invUrl;
    public String qrUrl;
    public String teamCode;
    public String teamName;
    public String uniqueId;
    public String userAvatarKey;
    public String userName;

    public String getInviteMsg() {
        return this.invMsg;
    }

    public String getInAppShareContent() {
        return getInviteMsg();
    }

    public String getShareTitle() {
        return UIHelper.getString(R.string.Lark_UserGrowth_InvitePeopleContactsShareLinkTitle);
    }

    private InvitationInfo() {
        IInvitationModuleDependency.AbstractC40087c loginDependency = C40147z.m159160a().getLoginDependency();
        this.userName = loginDependency.mo145586b();
        this.userAvatarKey = loginDependency.mo145587c();
        this.teamName = loginDependency.mo145588d();
    }

    public static InvitationInfo parseFromPb(GetContactTokenResponse.ContactTokenResponse contactTokenResponse) {
        InvitationInfo invitationInfo = new InvitationInfo();
        invitationInfo.invUrl = contactTokenResponse.invite_url;
        invitationInfo.qrUrl = contactTokenResponse.invite_url;
        invitationInfo.canSearchWithToken = contactTokenResponse.can_search_with_token.booleanValue();
        invitationInfo.invMsg = contactTokenResponse.invite_msg;
        invitationInfo.uniqueId = contactTokenResponse.unique_id;
        return invitationInfo;
    }
}
