package com.ss.android.lark.invitation.v2.feat.member.bean;

import com.bytedance.lark.pb.contact.v1.GetInvitationLinkResponse;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.util.C40145x;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public class MemberInvitationInfo implements Serializable {
    public long expiredTimestamp;
    public String invUrl;
    public String linkMsg;
    public String qrUrl;
    public String shareToken;
    public String teamCode;
    public String teamCodeMsg;
    public String teamName;
    public String userAvatarKey;
    public String userName;

    public String getLinkMsg() {
        return this.linkMsg;
    }

    public String getTeamCodeMsg() {
        return this.teamCodeMsg;
    }

    private MemberInvitationInfo() {
        IInvitationModuleDependency.AbstractC40087c loginDependency = C40147z.m159160a().getLoginDependency();
        this.userName = loginDependency.mo145586b();
        this.userAvatarKey = loginDependency.mo145587c();
        this.teamName = loginDependency.mo145588d();
    }

    public String getShareTitle() {
        HashMap hashMap = new HashMap();
        hashMap.put("USER_NAME", this.userName);
        hashMap.put("TEAM_NAME", this.teamName);
        return UIHelper.mustacheFormat((int) R.string.Lark_Invitation_AddMembersLinkTitle, hashMap);
    }

    public String getDisplayTeamCode() {
        int length = this.teamCode.length() / 2;
        return String.format("%s  %s", this.teamCode.substring(0, length), this.teamCode.substring(length));
    }

    public String getExpiredTime() {
        String str;
        if (this.expiredTimestamp == -1) {
            str = UIHelper.getString(R.string.Lark_Invitation_AddMembersPermanentLinkQRCode);
        } else {
            str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(this.expiredTimestamp * 1000));
        }
        Log.m165389i("InvitationModule", "expiredTime: " + str);
        return str;
    }

    public static MemberInvitationInfo parseFromPb(GetInvitationLinkResponse getInvitationLinkResponse) {
        MemberInvitationInfo memberInvitationInfo = new MemberInvitationInfo();
        memberInvitationInfo.invUrl = getInvitationLinkResponse.invitation_url;
        memberInvitationInfo.qrUrl = getInvitationLinkResponse.invitation_qr_url;
        memberInvitationInfo.teamCode = getInvitationLinkResponse.team_code;
        memberInvitationInfo.shareToken = getInvitationLinkResponse.share_token;
        memberInvitationInfo.expiredTimestamp = getInvitationLinkResponse.expired_timestamp.longValue();
        memberInvitationInfo.linkMsg = memberInvitationInfo.getMsg(true);
        memberInvitationInfo.teamCodeMsg = memberInvitationInfo.getMsg(false);
        return memberInvitationInfo;
    }

    private String getMsg(boolean z) {
        int i;
        HashMap hashMap = new HashMap();
        hashMap.put("TEAM_NAME", this.teamName);
        hashMap.put("INVITATION_LINK", this.invUrl);
        hashMap.put("ENV_DISPLAY_NAME", C40145x.m159157a());
        hashMap.put("APP_DISPLAY_NAME", C40145x.m159157a());
        hashMap.put("TEAM_CODE", this.teamCode);
        if (z) {
            i = R.string.Lark_Invitation_FeishuCopyToken;
        } else if (C40147z.m159160a().isLarkEnv()) {
            i = R.string.Lark_Invitation_FeishuCopyToken_LarkDocsAdded;
        } else {
            i = R.string.Lark_Invitation_FeishuCopyToken_FeishuDocsAdded;
        }
        return UIHelper.mustacheFormat(i, hashMap);
    }
}
